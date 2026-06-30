package com.eclipsesource.mmv8.debug;

/* loaded from: classes7.dex */
public class ScriptBreakPoint implements com.eclipsesource.mmv8.Releasable {
    private static final java.lang.String CONDITION = "condition";
    private static final java.lang.String LINE = "line";
    private static final java.lang.String NUMBER = "number";
    private static final java.lang.String SET_CONDITION = "setCondition";
    private com.eclipsesource.mmv8.V8Object v8Object;

    public ScriptBreakPoint(com.eclipsesource.mmv8.V8Object v8Object) {
        this.v8Object = v8Object.twin();
    }

    public int getBreakPointNumber() {
        return this.v8Object.executeIntegerFunction(NUMBER, null);
    }

    public java.lang.String getCondition() {
        try {
            return this.v8Object.executeStringFunction(CONDITION, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return "undefined";
        }
    }

    public int getLine() {
        return this.v8Object.executeIntegerFunction(LINE, null);
    }

    @Override // com.eclipsesource.mmv8.Releasable
    public void release() {
        com.eclipsesource.mmv8.V8Object v8Object = this.v8Object;
        if (v8Object == null || v8Object.isReleased()) {
            return;
        }
        this.v8Object.release();
        this.v8Object = null;
    }

    public void setCondition(java.lang.String str) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        try {
            this.v8Object.executeVoidFunction(SET_CONDITION, v8Array);
        } finally {
            v8Array.release();
        }
    }
}
