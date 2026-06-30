package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class SourceLocation {
    private final int column;
    private final int line;
    private final int position;
    private final java.lang.String scriptName;
    private java.lang.String sourceText;

    public SourceLocation(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        this.scriptName = str;
        this.position = i17;
        this.line = i18;
        this.column = i19;
        this.sourceText = str2;
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public int getPosition() {
        return this.position;
    }

    public java.lang.String getScriptName() {
        return this.scriptName;
    }

    public java.lang.String getSourceText() {
        return this.sourceText;
    }

    public java.lang.String toString() {
        return this.scriptName + " : " + this.position + " : " + this.line + " : " + this.column + " : " + this.sourceText;
    }
}
