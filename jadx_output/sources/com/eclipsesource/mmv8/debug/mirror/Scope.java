package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class Scope extends com.eclipsesource.mmv8.debug.mirror.Mirror {
    private static final java.lang.String SCOPE_OBJECT = "scopeObject";
    private static final java.lang.String SCOPE_TYPE = "scopeType";
    private static final java.lang.String SET_VARIABLE_VALUE = "setVariableValue";

    /* loaded from: classes6.dex */
    public enum ScopeType {
        Global(0),
        Local(1),
        With(2),
        Closure(3),
        Catch(4),
        Block(5),
        Script(6);

        int index;

        ScopeType(int i17) {
            this.index = i17;
        }
    }

    public Scope(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    public com.eclipsesource.mmv8.debug.mirror.ObjectMirror getScopeObject() {
        com.eclipsesource.mmv8.V8Object v8Object = null;
        try {
            v8Object = this.v8Object.executeObjectFunction(SCOPE_OBJECT, null);
            return (com.eclipsesource.mmv8.debug.mirror.ObjectMirror) com.eclipsesource.mmv8.debug.mirror.Mirror.createMirror(v8Object);
        } finally {
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    public com.eclipsesource.mmv8.debug.mirror.Scope.ScopeType getType() {
        return com.eclipsesource.mmv8.debug.mirror.Scope.ScopeType.values()[this.v8Object.executeIntegerFunction(SCOPE_TYPE, null)];
    }

    public void setVariableValue(java.lang.String str, int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(i17);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void setVariableValue(java.lang.String str, com.eclipsesource.mmv8.V8Value v8Value) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(v8Value);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void setVariableValue(java.lang.String str, boolean z17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(z17);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void setVariableValue(java.lang.String str, java.lang.String str2) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(str2);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void setVariableValue(java.lang.String str, double d17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(d17);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }
}
