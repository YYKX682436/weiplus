package com.p314xaae8f345.mm.p930xc01b152a;

/* renamed from: com.tencent.mm.mm7zip.SevenZipException */
/* loaded from: classes12.dex */
public class C11078x9fb4b6bb extends java.io.IOException {

    /* renamed from: NEW_LINE */
    private static final java.lang.String f32441x827da353 = java.lang.System.getProperty("line.separator");

    /* renamed from: serialVersionUID */
    private static final long f32442x3a3ed56c = 42;

    /* renamed from: causeFirstPotentialThrown */
    private java.lang.Throwable f32443x7563dd3f;

    /* renamed from: causeLastPotentialThrown */
    private java.lang.Throwable f32444xf2ddfb67;

    /* renamed from: causeLastThrown */
    private java.lang.Throwable f32445x75490dc7;

    /* renamed from: com.tencent.mm.mm7zip.SevenZipException$PrintStreamWriter */
    /* loaded from: classes12.dex */
    public static class PrintStreamWriter extends java.io.Writer {

        /* renamed from: printStream */
        private final java.io.PrintStream f32446xec22788d;

        public PrintStreamWriter(java.io.PrintStream printStream) {
            this.f32446xec22788d = printStream;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f32446xec22788d.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            this.f32446xec22788d.flush();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i17, int i18) {
            if (i17 == 0 && i18 == cArr.length) {
                this.f32446xec22788d.print(cArr);
            } else {
                this.f32446xec22788d.print(new java.lang.String(cArr, i17, i18));
            }
        }
    }

    /* renamed from: com.tencent.mm.mm7zip.SevenZipException$StackTraceWriter */
    /* loaded from: classes12.dex */
    public static class StackTraceWriter extends java.io.Writer {

        /* renamed from: indexInMessage */
        private int f32447xe8b92a70;

        /* renamed from: message */
        private final java.lang.String f32448x38eb0007;

        /* renamed from: newlineFound */
        private boolean f32449x2e42fa4e;

        /* renamed from: writer */
        private java.io.PrintWriter f32450xd188a473;

        public StackTraceWriter(java.io.PrintWriter printWriter, java.lang.String str) {
            super(printWriter);
            this.f32449x2e42fa4e = true;
            this.f32450xd188a473 = printWriter;
            this.f32448x38eb0007 = str;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f32450xd188a473.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            this.f32450xd188a473.flush();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i17, int i18) {
            for (int i19 = 0; i19 < i18; i19++) {
                char c17 = cArr[i19];
                if (c17 == '\n' || c17 == '\r') {
                    this.f32449x2e42fa4e = true;
                } else {
                    if (this.f32449x2e42fa4e) {
                        if (this.f32448x38eb0007.charAt(this.f32447xe8b92a70) == ' ') {
                            this.f32450xd188a473.write("| ");
                        } else {
                            this.f32450xd188a473.write(this.f32448x38eb0007.charAt(this.f32447xe8b92a70));
                            this.f32450xd188a473.write(32);
                        }
                        int i27 = this.f32447xe8b92a70 + 1;
                        this.f32447xe8b92a70 = i27;
                        if (i27 >= this.f32448x38eb0007.length()) {
                            this.f32447xe8b92a70 = 0;
                        }
                    }
                    this.f32449x2e42fa4e = false;
                }
                this.f32450xd188a473.write(cArr[i19]);
            }
        }
    }

    public C11078x9fb4b6bb() {
    }

    /* renamed from: getMessageForPrintStackTraceExtended */
    private static java.lang.String m47692x11ec332b(java.lang.Throwable th6) {
        return th6 instanceof com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb ? ((com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb) th6).m47691x76b83bd1(true) : th6.toString();
    }

    /* renamed from: printMessageToStringBuilder */
    private void m47693x81451b95(java.lang.String str, java.lang.StringBuilder sb6, java.lang.Throwable th6) {
        sb6.append(th6.getClass().getCanonicalName());
        sb6.append(": ");
        if (!(th6 instanceof com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb)) {
            sb6.append(th6.getMessage());
            return;
        }
        ((com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb) th6).m47697x19b09922(str + "  ", sb6, false);
    }

    /* renamed from: printStackTraceOfThrowable */
    private static void m47694xe9d5a89f(java.io.PrintWriter printWriter, java.lang.Throwable th6, java.lang.Throwable th7) {
        if (th6 instanceof com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb) {
            m47696xa2fbb1fb(printWriter, (com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb) th6, th7);
        } else {
            m47695xe1486528(printWriter, th6, th7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r6 = 0;
     */
    /* renamed from: printStackTraceRecursive */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m47695xe1486528(java.io.PrintWriter r9, java.lang.Throwable r10, java.lang.Throwable r11) {
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
            java.lang.String r11 = m47692x11ec332b(r10)
            r9.println(r11)
            goto L4b
        L36:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Caused by: "
            r11.<init>(r1)
            java.lang.String r1 = m47692x11ec332b(r10)
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
            m47694xe9d5a89f(r9, r11, r10)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb.m47695xe1486528(java.io.PrintWriter, java.lang.Throwable, java.lang.Throwable):void");
    }

    /* renamed from: printStackTraceToPrintWriter */
    private static void m47696xa2fbb1fb(java.io.PrintWriter printWriter, com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb c11078x9fb4b6bb, java.lang.Throwable th6) {
        if (c11078x9fb4b6bb.f32445x75490dc7 == null && c11078x9fb4b6bb.f32443x7563dd3f == null && c11078x9fb4b6bb.f32444xf2ddfb67 == null) {
            m47695xe1486528(printWriter, c11078x9fb4b6bb, th6);
        }
        printWriter.println("+------ SevenZipException with multiple 'cause by' exceptions. Stacktraces for all involved exceptions:");
        printWriter.println("+-- The SevenZipException itself with first thrown 'cause by' exception (first cause): ");
        m47695xe1486528(new java.io.PrintWriter(new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb.StackTraceWriter(printWriter, "  FIRST THROWN CAUSE ")), c11078x9fb4b6bb, th6);
        if (c11078x9fb4b6bb.f32445x75490dc7 != null) {
            printWriter.println("+-- Last thrown 'cause by' exception (last cause): ");
            m47694xe9d5a89f(new java.io.PrintWriter(new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb.StackTraceWriter(printWriter, "  LAST THROWN CAUSE ")), c11078x9fb4b6bb.f32445x75490dc7, c11078x9fb4b6bb);
        }
        if (c11078x9fb4b6bb.f32443x7563dd3f != null) {
            printWriter.println("+-- First thrown potential 'cause by' exception, thrown in an other thread (first possible cause): ");
            m47694xe9d5a89f(new java.io.PrintWriter(new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb.StackTraceWriter(printWriter, "  FIRST THROWN POTENTIAL CAUSE ")), c11078x9fb4b6bb.f32443x7563dd3f, c11078x9fb4b6bb);
        }
        if (c11078x9fb4b6bb.f32444xf2ddfb67 != null) {
            printWriter.println("+-- Last thrown potential 'cause by' exception, thrown in an other thread (last possible cause): ");
            m47694xe9d5a89f(new java.io.PrintWriter(new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb.StackTraceWriter(printWriter, "  LAST THROWN POTENTIAL CAUSE ")), c11078x9fb4b6bb.f32444xf2ddfb67, c11078x9fb4b6bb);
        }
        printWriter.println("+------ End of stacktrace of SevenZipException with multiple 'cause by' exceptions");
    }

    /* renamed from: printToStringBuilder */
    private void m47697x19b09922(java.lang.String str, java.lang.StringBuilder sb6, boolean z17) {
        java.lang.String message = super.getMessage();
        if (message == null) {
            sb6.append("No message");
        } else {
            sb6.append(message);
        }
        if (str.length() == 0 && !z17) {
            sb6.append(f32441x827da353);
            sb6.append("This SevenZipException has multiple 'cause by' exceptions. Use one of the SevenZipException.printStackTraceExtended(..) methods to get stack trace of last thrown and first/last potiential thrown 'cause by' exceptions.");
        }
        java.lang.Throwable cause = getCause();
        if (cause != null) {
            sb6.append(f32441x827da353);
            sb6.append(str);
            sb6.append("Caused by (first thrown): ");
            m47693x81451b95(str, sb6, cause);
        }
        if (this.f32445x75490dc7 != null) {
            sb6.append(f32441x827da353);
            sb6.append(str);
            sb6.append("Caused by (last thrown): ");
            m47693x81451b95(str, sb6, this.f32445x75490dc7);
        }
        if (this.f32443x7563dd3f != null) {
            sb6.append(f32441x827da353);
            sb6.append(str);
            sb6.append("Caused by (first potential thrown): ");
            m47693x81451b95(str, sb6, this.f32443x7563dd3f);
        }
        if (this.f32444xf2ddfb67 != null) {
            sb6.append(f32441x827da353);
            sb6.append(str);
            sb6.append("Caused by (last potential thrown): ");
            m47693x81451b95(str, sb6, this.f32444xf2ddfb67);
        }
    }

    /* renamed from: setCauseFirstPotentialThrown */
    private void m47698x90b5d2fd(java.lang.Throwable th6) {
        this.f32443x7563dd3f = th6;
    }

    /* renamed from: setCauseLastPotentialThrown */
    private void m47699xd2b755e9(java.lang.Throwable th6) {
        this.f32444xf2ddfb67 = th6;
    }

    /* renamed from: setCauseLastThrown */
    private void m47700x90817905(java.lang.Throwable th6) {
        this.f32445x75490dc7 = th6;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return super.getCause();
    }

    /* renamed from: getCauseFirstPotentialThrown */
    public java.lang.Throwable m47701x46e97a89() {
        return this.f32443x7563dd3f;
    }

    /* renamed from: getCauseLastPotentialThrown */
    public java.lang.Throwable m47702x22ea8cdd() {
        return this.f32444xf2ddfb67;
    }

    /* renamed from: getCauseLastThrown */
    public java.lang.Throwable m47703x59aadf91() {
        return this.f32445x75490dc7;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return m47691x76b83bd1(false);
    }

    /* renamed from: getSevenZipExceptionMessage */
    public java.lang.String m47704x51905622() {
        return super.getMessage();
    }

    /* renamed from: printStackTraceExtended */
    public void m47705xd24c7583() {
        m47706xd24c7583(java.lang.System.err);
    }

    public C11078x9fb4b6bb(java.lang.String str, java.lang.Throwable th6) {
        super(str);
        initCause(th6);
    }

    /* renamed from: getMessage */
    private java.lang.String m47691x76b83bd1(boolean z17) {
        if (this.f32445x75490dc7 == null && this.f32443x7563dd3f == null && this.f32444xf2ddfb67 == null) {
            return super.getMessage();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        m47697x19b09922("", sb6, z17);
        return sb6.toString();
    }

    /* renamed from: printStackTraceExtended */
    public void m47706xd24c7583(java.io.PrintStream printStream) {
        synchronized (printStream) {
            m47696xa2fbb1fb(new java.io.PrintWriter(new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb.PrintStreamWriter(printStream)), this, null);
        }
    }

    public C11078x9fb4b6bb(java.lang.String str) {
        super(str);
    }

    public C11078x9fb4b6bb(java.lang.Throwable th6) {
        initCause(th6);
    }

    /* renamed from: printStackTraceExtended */
    public void m47707xd24c7583(java.io.PrintWriter printWriter) {
        synchronized (printWriter) {
            m47696xa2fbb1fb(printWriter, this, null);
        }
    }
}
