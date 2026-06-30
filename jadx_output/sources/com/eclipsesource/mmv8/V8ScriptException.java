package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public abstract class V8ScriptException extends com.eclipsesource.mmv8.V8RuntimeException {
    private final int contextTag;
    private final int endColumn;
    private final java.lang.String fileName;
    private final java.lang.String jsMessage;
    private final java.lang.String jsStackTrace;
    private final int lineNumber;
    private final java.lang.String sourceLine;
    private final int startColumn;

    public V8ScriptException(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, int i27, java.lang.String str4, java.lang.Throwable th6) {
        this.contextTag = i17;
        this.fileName = str;
        this.lineNumber = i18;
        this.jsMessage = str2;
        this.sourceLine = str3;
        this.startColumn = i19;
        this.endColumn = i27;
        this.jsStackTrace = str4;
        if (th6 != null) {
            initCause(th6);
        }
    }

    private char[] createCharSequence(int i17, char c17) {
        char[] cArr = new char[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            cArr[i18] = c17;
        }
        return cArr;
    }

    private java.lang.String createJSStackDetails() {
        if (this.jsStackTrace == null) {
            return "";
        }
        return "\n" + this.jsStackTrace;
    }

    private java.lang.String createMessageDetails() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.sourceLine;
        if (str != null && !str.isEmpty()) {
            sb6.append('\n');
            sb6.append(this.sourceLine);
            sb6.append('\n');
            int i17 = this.startColumn;
            if (i17 >= 0) {
                sb6.append(createCharSequence(i17, ' '));
                sb6.append(createCharSequence(this.endColumn - this.startColumn, '^'));
            }
        }
        return sb6.toString();
    }

    private java.lang.String createMessageLine() {
        return this.fileName + ":" + this.lineNumber + ": " + this.jsMessage;
    }

    public int getContextTag() {
        return this.contextTag;
    }

    public int getEndColumn() {
        return this.endColumn;
    }

    public java.lang.String getFileName() {
        return this.fileName;
    }

    public java.lang.String getJSMessage() {
        return this.jsMessage;
    }

    public java.lang.String getJSStackTrace() {
        return this.jsStackTrace;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return createMessageLine();
    }

    public java.lang.String getSourceLine() {
        return this.sourceLine;
    }

    public int getStartColumn() {
        return this.startColumn;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return createMessageLine() + createMessageDetails() + createJSStackDetails() + "\n" + getClass().getName();
    }
}
