package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class FunctionMirror extends com.eclipsesource.mmv8.debug.mirror.ObjectMirror {
    private static final java.lang.String NAME = "name";
    private static final java.lang.String SCRIPT = "script";

    public FunctionMirror(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    public java.lang.String getName() {
        return this.v8Object.executeStringFunction("name", null);
    }

    public java.lang.String getScriptName() {
        com.eclipsesource.mmv8.V8Object executeObjectFunction = this.v8Object.executeObjectFunction(SCRIPT, null);
        try {
            return executeObjectFunction.executeStringFunction("name", null);
        } finally {
            executeObjectFunction.release();
        }
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public boolean isFunction() {
        return true;
    }
}
