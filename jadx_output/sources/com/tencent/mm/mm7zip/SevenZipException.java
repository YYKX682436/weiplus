package com.tencent.mm.mm7zip;

/* loaded from: classes12.dex */
public class SevenZipException extends java.io.IOException {
    private static final java.lang.String NEW_LINE = java.lang.System.getProperty("line.separator");
    private static final long serialVersionUID = 42;
    private java.lang.Throwable causeFirstPotentialThrown;
    private java.lang.Throwable causeLastPotentialThrown;
    private java.lang.Throwable causeLastThrown;

    /* loaded from: classes12.dex */
    public static class PrintStreamWriter extends java.io.Writer {
        private final java.io.PrintStream printStream;

        public PrintStreamWriter(java.io.PrintStream printStream) {
            this.printStream = printStream;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.printStream.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            this.printStream.flush();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i17, int i18) {
            if (i17 == 0 && i18 == cArr.length) {
                this.printStream.print(cArr);
            } else {
                this.printStream.print(new java.lang.String(cArr, i17, i18));
            }
        }
    }

    /* loaded from: classes12.dex */
    public static class StackTraceWriter extends java.io.Writer {
        private int indexInMessage;
        private final java.lang.String message;
        private boolean newlineFound;
        private java.io.PrintWriter writer;

        public StackTraceWriter(java.io.PrintWriter printWriter, java.lang.String str) {
            super(printWriter);
            this.newlineFound = true;
            this.writer = printWriter;
            this.message = str;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.writer.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            this.writer.flush();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i17, int i18) {
            for (int i19 = 0; i19 < i18; i19++) {
                char c17 = cArr[i19];
                if (c17 == '\n' || c17 == '\r') {
                    this.newlineFound = true;
                } else {
                    if (this.newlineFound) {
                        if (this.message.charAt(this.indexInMessage) == ' ') {
                            this.writer.write("| ");
                        } else {
                            this.writer.write(this.message.charAt(this.indexInMessage));
                            this.writer.write(32);
                        }
                        int i27 = this.indexInMessage + 1;
                        this.indexInMessage = i27;
                        if (i27 >= this.message.length()) {
                            this.indexInMessage = 0;
                        }
                    }
                    this.newlineFound = false;
                }
                this.writer.write(cArr[i19]);
            }
        }
    }

    public SevenZipException() {
    }

    private static java.lang.String getMessageForPrintStackTraceExtended(java.lang.Throwable th6) {
        return th6 instanceof com.tencent.mm.mm7zip.SevenZipException ? ((com.tencent.mm.mm7zip.SevenZipException) th6).getMessage(true) : th6.toString();
    }

    private void printMessageToStringBuilder(java.lang.String str, java.lang.StringBuilder sb6, java.lang.Throwable th6) {
        sb6.append(th6.getClass().getCanonicalName());
        sb6.append(": ");
        if (!(th6 instanceof com.tencent.mm.mm7zip.SevenZipException)) {
            sb6.append(th6.getMessage());
            return;
        }
        ((com.tencent.mm.mm7zip.SevenZipException) th6).printToStringBuilder(str + "  ", sb6, false);
    }

    private static void printStackTraceOfThrowable(java.io.PrintWriter printWriter, java.lang.Throwable th6, java.lang.Throwable th7) {
        if (th6 instanceof com.tencent.mm.mm7zip.SevenZipException) {
            printStackTraceToPrintWriter(printWriter, (com.tencent.mm.mm7zip.SevenZipException) th6, th7);
        } else {
            printStackTraceRecursive(printWriter, th6, th7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void printStackTraceRecursive(java.io.PrintWriter r9, java.lang.Throwable r10, java.lang.Throwable r11) {
        /*
            java.lang.StackTraceElement[] r0 = r10.getStackTrace()
            r1 = 3
            r2 = 0
            if (r11 == 0) goto L28
            java.lang.StackTraceElement[] r3 = r11.getStackTrace()
            int r4 = r3.length
            int r4 = r4 + (-1)
            int r5 = r0.length
            int r5 = r5 + (-1)
            r6 = r2
        L13:
            if (r4 < r1) goto L29
            if (r5 < r1) goto L29
            r7 = r3[r4]
            r8 = r0[r5]
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L29
            int r4 = r4 + (-1)
            int r5 = r5 + (-1)
            int r6 = r6 + 1
            goto L13
        L28:
            r6 = r2
        L29:
            if (r6 > r1) goto L2c
            r6 = r2
        L2c:
            if (r11 != 0) goto L36
            java.lang.String r11 = getMessageForPrintStackTraceExtended(r10)
            r9.println(r11)
            goto L4b
        L36:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Caused by: "
            r11.<init>(r1)
            java.lang.String r1 = getMessageForPrintStackTraceExtended(r10)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r9.println(r11)
        L4b:
            int r11 = r0.length
            int r11 = r11 - r6
            if (r2 >= r11) goto L65
            r11 = r0[r2]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "\tat "
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r9.println(r11)
            int r2 = r2 + 1
            goto L4b
        L65:
            if (r6 <= 0) goto L7d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "\t... "
            r11.<init>(r0)
            r11.append(r6)
            java.lang.String r0 = " more"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r9.println(r11)
        L7d:
            java.lang.Throwable r11 = r10.getCause()
            if (r11 == 0) goto L8a
            java.lang.Throwable r11 = r10.getCause()
            printStackTraceOfThrowable(r9, r11, r10)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mm7zip.SevenZipException.printStackTraceRecursive(java.io.PrintWriter, java.lang.Throwable, java.lang.Throwable):void");
    }

    private static void printStackTraceToPrintWriter(java.io.PrintWriter printWriter, com.tencent.mm.mm7zip.SevenZipException sevenZipException, java.lang.Throwable th6) {
        if (sevenZipException.causeLastThrown == null && sevenZipException.causeFirstPotentialThrown == null && sevenZipException.causeLastPotentialThrown == null) {
            printStackTraceRecursive(printWriter, sevenZipException, th6);
        }
        printWriter.println("+------ SevenZipException with multiple 'cause by' exceptions. Stacktraces for all involved exceptions:");
        printWriter.println("+-- The SevenZipException itself with first thrown 'cause by' exception (first cause): ");
        printStackTraceRecursive(new java.io.PrintWriter(new com.tencent.mm.mm7zip.SevenZipException.StackTraceWriter(printWriter, "  FIRST THROWN CAUSE ")), sevenZipException, th6);
        if (sevenZipException.causeLastThrown != null) {
            printWriter.println("+-- Last thrown 'cause by' exception (last cause): ");
            printStackTraceOfThrowable(new java.io.PrintWriter(new com.tencent.mm.mm7zip.SevenZipException.StackTraceWriter(printWriter, "  LAST THROWN CAUSE ")), sevenZipException.causeLastThrown, sevenZipException);
        }
        if (sevenZipException.causeFirstPotentialThrown != null) {
            printWriter.println("+-- First thrown potential 'cause by' exception, thrown in an other thread (first possible cause): ");
            printStackTraceOfThrowable(new java.io.PrintWriter(new com.tencent.mm.mm7zip.SevenZipException.StackTraceWriter(printWriter, "  FIRST THROWN POTENTIAL CAUSE ")), sevenZipException.causeFirstPotentialThrown, sevenZipException);
        }
        if (sevenZipException.causeLastPotentialThrown != null) {
            printWriter.println("+-- Last thrown potential 'cause by' exception, thrown in an other thread (last possible cause): ");
            printStackTraceOfThrowable(new java.io.PrintWriter(new com.tencent.mm.mm7zip.SevenZipException.StackTraceWriter(printWriter, "  LAST THROWN POTENTIAL CAUSE ")), sevenZipException.causeLastPotentialThrown, sevenZipException);
        }
        printWriter.println("+------ End of stacktrace of SevenZipException with multiple 'cause by' exceptions");
    }

    private void printToStringBuilder(java.lang.String str, java.lang.StringBuilder sb6, boolean z17) {
        java.lang.String message = super.getMessage();
        if (message == null) {
            sb6.append("No message");
        } else {
            sb6.append(message);
        }
        if (str.length() == 0 && !z17) {
            sb6.append(NEW_LINE);
            sb6.append("This SevenZipException has multiple 'cause by' exceptions. Use one of the SevenZipException.printStackTraceExtended(..) methods to get stack trace of last thrown and first/last potiential thrown 'cause by' exceptions.");
        }
        java.lang.Throwable cause = getCause();
        if (cause != null) {
            sb6.append(NEW_LINE);
            sb6.append(str);
            sb6.append("Caused by (first thrown): ");
            printMessageToStringBuilder(str, sb6, cause);
        }
        if (this.causeLastThrown != null) {
            sb6.append(NEW_LINE);
            sb6.append(str);
            sb6.append("Caused by (last thrown): ");
            printMessageToStringBuilder(str, sb6, this.causeLastThrown);
        }
        if (this.causeFirstPotentialThrown != null) {
            sb6.append(NEW_LINE);
            sb6.append(str);
            sb6.append("Caused by (first potential thrown): ");
            printMessageToStringBuilder(str, sb6, this.causeFirstPotentialThrown);
        }
        if (this.causeLastPotentialThrown != null) {
            sb6.append(NEW_LINE);
            sb6.append(str);
            sb6.append("Caused by (last potential thrown): ");
            printMessageToStringBuilder(str, sb6, this.causeLastPotentialThrown);
        }
    }

    private void setCauseFirstPotentialThrown(java.lang.Throwable th6) {
        this.causeFirstPotentialThrown = th6;
    }

    private void setCauseLastPotentialThrown(java.lang.Throwable th6) {
        this.causeLastPotentialThrown = th6;
    }

    private void setCauseLastThrown(java.lang.Throwable th6) {
        this.causeLastThrown = th6;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return super.getCause();
    }

    public java.lang.Throwable getCauseFirstPotentialThrown() {
        return this.causeFirstPotentialThrown;
    }

    public java.lang.Throwable getCauseLastPotentialThrown() {
        return this.causeLastPotentialThrown;
    }

    public java.lang.Throwable getCauseLastThrown() {
        return this.causeLastThrown;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return getMessage(false);
    }

    public java.lang.String getSevenZipExceptionMessage() {
        return super.getMessage();
    }

    public void printStackTraceExtended() {
        printStackTraceExtended(java.lang.System.err);
    }

    public SevenZipException(java.lang.String str, java.lang.Throwable th6) {
        super(str);
        initCause(th6);
    }

    private java.lang.String getMessage(boolean z17) {
        if (this.causeLastThrown == null && this.causeFirstPotentialThrown == null && this.causeLastPotentialThrown == null) {
            return super.getMessage();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        printToStringBuilder("", sb6, z17);
        return sb6.toString();
    }

    public void printStackTraceExtended(java.io.PrintStream printStream) {
        synchronized (printStream) {
            printStackTraceToPrintWriter(new java.io.PrintWriter(new com.tencent.mm.mm7zip.SevenZipException.PrintStreamWriter(printStream)), this, null);
        }
    }

    public SevenZipException(java.lang.String str) {
        super(str);
    }

    public SevenZipException(java.lang.Throwable th6) {
        initCause(th6);
    }

    public void printStackTraceExtended(java.io.PrintWriter printWriter) {
        synchronized (printWriter) {
            printStackTraceToPrintWriter(printWriter, this, null);
        }
    }
}
