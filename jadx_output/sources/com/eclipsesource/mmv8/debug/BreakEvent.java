package com.eclipsesource.mmv8.debug;

/* loaded from: classes7.dex */
public class BreakEvent extends com.eclipsesource.mmv8.debug.EventData {
    private static final java.lang.String SOURCE_COLUMN = "sourceColumn";
    private static final java.lang.String SOURCE_LINE = "sourceLine";
    private static final java.lang.String SOURCE_LINE_TEXT = "sourceLineText";

    public BreakEvent(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    public int getSourceColumn() {
        return this.v8Object.executeIntegerFunction(SOURCE_COLUMN, null);
    }

    public int getSourceLine() {
        return this.v8Object.executeIntegerFunction(SOURCE_LINE, null);
    }

    public java.lang.String getSourceLineText() {
        return this.v8Object.executeStringFunction(SOURCE_LINE_TEXT, null);
    }
}
