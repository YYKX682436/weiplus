package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class Frame extends com.eclipsesource.mmv8.debug.mirror.Mirror {
    private static final java.lang.String ARGUMENT_COUNT = "argumentCount";
    private static final java.lang.String ARGUMENT_NAME = "argumentName";
    private static final java.lang.String ARGUMENT_VALUE = "argumentValue";
    private static final java.lang.String COLUMN = "column";
    private static final java.lang.String FUNC = "func";
    private static final java.lang.String LINE = "line";
    private static final java.lang.String LOCAL_COUNT = "localCount";
    private static final java.lang.String LOCAL_NAME = "localName";
    private static final java.lang.String LOCAL_VALUE = "localValue";
    private static final java.lang.String NAME = "name";
    private static final java.lang.String POSITION = "position";
    private static final java.lang.String SCOPE = "scope";
    private static final java.lang.String SCOPE_COUNT = "scopeCount";
    private static final java.lang.String SCRIPT = "script";
    private static final java.lang.String SOURCE_LOCATION = "sourceLocation";
    private static final java.lang.String SOURCE_TEXT = "sourceText";

    public Frame(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    public int getArgumentCount() {
        return this.v8Object.executeIntegerFunction(ARGUMENT_COUNT, null);
    }

    public java.lang.String getArgumentName(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(i17);
        try {
            return this.v8Object.executeStringFunction(ARGUMENT_NAME, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public com.eclipsesource.mmv8.debug.mirror.ValueMirror getArgumentValue(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(i17);
        com.eclipsesource.mmv8.Releasable releasable = null;
        try {
            com.eclipsesource.mmv8.V8Object executeObjectFunction = this.v8Object.executeObjectFunction(ARGUMENT_VALUE, v8Array);
            if (!com.eclipsesource.mmv8.debug.mirror.Mirror.isValue(executeObjectFunction)) {
                throw new java.lang.IllegalStateException("Argument value is not a ValueMirror");
            }
            com.eclipsesource.mmv8.debug.mirror.ValueMirror valueMirror = new com.eclipsesource.mmv8.debug.mirror.ValueMirror(executeObjectFunction);
            v8Array.release();
            if (executeObjectFunction != null) {
                executeObjectFunction.release();
            }
            return valueMirror;
        } catch (java.lang.Throwable th6) {
            v8Array.release();
            if (0 != 0) {
                releasable.release();
            }
            throw th6;
        }
    }

    public com.eclipsesource.mmv8.debug.mirror.FunctionMirror getFunction() {
        com.eclipsesource.mmv8.V8Object v8Object = null;
        try {
            v8Object = this.v8Object.executeObjectFunction(FUNC, null);
            return new com.eclipsesource.mmv8.debug.mirror.FunctionMirror(v8Object);
        } finally {
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    public int getLocalCount() {
        return this.v8Object.executeIntegerFunction(LOCAL_COUNT, null);
    }

    public java.lang.String getLocalName(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(i17);
        try {
            return this.v8Object.executeStringFunction(LOCAL_NAME, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public com.eclipsesource.mmv8.debug.mirror.ValueMirror getLocalValue(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(i17);
        com.eclipsesource.mmv8.Releasable releasable = null;
        try {
            com.eclipsesource.mmv8.V8Object executeObjectFunction = this.v8Object.executeObjectFunction(LOCAL_VALUE, v8Array);
            if (!com.eclipsesource.mmv8.debug.mirror.Mirror.isValue(executeObjectFunction)) {
                throw new java.lang.IllegalStateException("Local value is not a ValueMirror");
            }
            com.eclipsesource.mmv8.debug.mirror.ValueMirror createMirror = com.eclipsesource.mmv8.debug.mirror.Mirror.createMirror(executeObjectFunction);
            v8Array.release();
            if (executeObjectFunction != null) {
                executeObjectFunction.release();
            }
            return createMirror;
        } catch (java.lang.Throwable th6) {
            v8Array.release();
            if (0 != 0) {
                releasable.release();
            }
            throw th6;
        }
    }

    public com.eclipsesource.mmv8.debug.mirror.Scope getScope(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(i17);
        com.eclipsesource.mmv8.V8Object v8Object = null;
        try {
            v8Object = this.v8Object.executeObjectFunction(SCOPE, v8Array);
            return new com.eclipsesource.mmv8.debug.mirror.Scope(v8Object);
        } finally {
            v8Array.release();
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    public int getScopeCount() {
        return this.v8Object.executeIntegerFunction(SCOPE_COUNT, null);
    }

    public com.eclipsesource.mmv8.debug.mirror.SourceLocation getSourceLocation() {
        java.lang.String str = null;
        com.eclipsesource.mmv8.V8Object executeObjectFunction = this.v8Object.executeObjectFunction(SOURCE_LOCATION, null);
        com.eclipsesource.mmv8.debug.mirror.FunctionMirror function = getFunction();
        java.lang.String scriptName = function.getScriptName();
        try {
            com.eclipsesource.mmv8.V8Object v8Object = (com.eclipsesource.mmv8.V8Object) executeObjectFunction.get(SCRIPT);
            if (v8Object != null) {
                str = v8Object.getString("name");
                v8Object.release();
            }
            if (str != null || scriptName == null) {
                scriptName = "undefined";
            }
            return new com.eclipsesource.mmv8.debug.mirror.SourceLocation(scriptName, executeObjectFunction.getInteger(POSITION), executeObjectFunction.getInteger(LINE), executeObjectFunction.getInteger(COLUMN), executeObjectFunction.getString(SOURCE_TEXT));
        } finally {
            function.release();
            executeObjectFunction.release();
        }
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public boolean isFrame() {
        return true;
    }
}
