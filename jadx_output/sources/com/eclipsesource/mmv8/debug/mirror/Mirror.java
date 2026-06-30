package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class Mirror implements com.eclipsesource.mmv8.Releasable {
    private static final java.lang.String IS_ARRAY = "isArray";
    private static final java.lang.String IS_BOOLEAN = "isBoolean";
    private static final java.lang.String IS_FUNCTION = "isFunction";
    private static final java.lang.String IS_NULL = "isNull";
    private static final java.lang.String IS_NUMBER = "isNumber";
    private static final java.lang.String IS_OBJECT = "isObject";
    private static final java.lang.String IS_STRING = "isString";
    private static final java.lang.String IS_UNDEFINED = "isUndefined";
    private static final java.lang.String IS_VALUE = "isValue";
    protected com.eclipsesource.mmv8.V8Object v8Object;

    public Mirror(com.eclipsesource.mmv8.V8Object v8Object) {
        this.v8Object = v8Object.twin();
    }

    public static com.eclipsesource.mmv8.debug.mirror.ValueMirror createMirror(com.eclipsesource.mmv8.V8Object v8Object) {
        return isNull(v8Object) ? new com.eclipsesource.mmv8.debug.mirror.NullMirror(v8Object) : isUndefined(v8Object) ? new com.eclipsesource.mmv8.debug.mirror.UndefinedMirror(v8Object) : isFunction(v8Object) ? new com.eclipsesource.mmv8.debug.mirror.FunctionMirror(v8Object) : isArray(v8Object) ? new com.eclipsesource.mmv8.debug.mirror.ArrayMirror(v8Object) : isObject(v8Object) ? new com.eclipsesource.mmv8.debug.mirror.ObjectMirror(v8Object) : isString(v8Object) ? new com.eclipsesource.mmv8.debug.mirror.StringMirror(v8Object) : isNumber(v8Object) ? new com.eclipsesource.mmv8.debug.mirror.NumberMirror(v8Object) : isBoolean(v8Object) ? new com.eclipsesource.mmv8.debug.mirror.BooleanMirror(v8Object) : new com.eclipsesource.mmv8.debug.mirror.ValueMirror(v8Object);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.eclipsesource.mmv8.debug.mirror.Mirror)) {
            return this.v8Object.equals(((com.eclipsesource.mmv8.debug.mirror.Mirror) obj).v8Object);
        }
        return false;
    }

    public int hashCode() {
        return this.v8Object.hashCode();
    }

    public boolean isArray() {
        return false;
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean isFrame() {
        return false;
    }

    public boolean isFunction() {
        return false;
    }

    public boolean isNull() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public boolean isProperty() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public boolean isUndefined() {
        return this.v8Object.executeBooleanFunction(IS_UNDEFINED, null);
    }

    public boolean isValue() {
        return false;
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

    public java.lang.String toString() {
        return this.v8Object.toString();
    }

    private static boolean isArray(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_ARRAY, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }

    private static boolean isBoolean(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_BOOLEAN, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }

    private static boolean isFunction(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_FUNCTION, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }

    private static boolean isNull(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_NULL, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }

    private static boolean isNumber(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_NUMBER, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }

    private static boolean isObject(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_OBJECT, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }

    private static boolean isString(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_STRING, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }

    private static boolean isUndefined(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_UNDEFINED, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }

    public static boolean isValue(com.eclipsesource.mmv8.V8Object v8Object) {
        try {
            return v8Object.executeBooleanFunction(IS_VALUE, null);
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return false;
        }
    }
}
