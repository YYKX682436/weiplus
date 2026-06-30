package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class ObjectMirror extends com.eclipsesource.mmv8.debug.mirror.ValueMirror {
    private static final java.lang.String PROPERTIES = "properties";
    private static final java.lang.String PROPERTY_NAMES = "propertyNames";

    /* loaded from: classes6.dex */
    public enum PropertyKind {
        Named(1),
        Indexed(2);

        int index;

        PropertyKind(int i17) {
            this.index = i17;
        }
    }

    public ObjectMirror(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    public com.eclipsesource.mmv8.debug.mirror.PropertiesArray getProperties(com.eclipsesource.mmv8.debug.mirror.ObjectMirror.PropertyKind propertyKind, int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(propertyKind.index);
        v8Array.push(i17);
        com.eclipsesource.mmv8.V8Array v8Array2 = null;
        try {
            v8Array2 = this.v8Object.executeArrayFunction(PROPERTIES, v8Array);
            return new com.eclipsesource.mmv8.debug.mirror.PropertiesArray(v8Array2);
        } finally {
            v8Array.release();
            if (v8Array2 != null && !v8Array2.isReleased()) {
                v8Array2.release();
            }
        }
    }

    public java.lang.String[] getPropertyNames(com.eclipsesource.mmv8.debug.mirror.ObjectMirror.PropertyKind propertyKind, int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(propertyKind.index);
        v8Array.push(i17);
        com.eclipsesource.mmv8.V8Array v8Array2 = null;
        try {
            v8Array2 = this.v8Object.executeArrayFunction(PROPERTY_NAMES, v8Array);
            int length = v8Array2.length();
            java.lang.String[] strArr = new java.lang.String[length];
            for (int i18 = 0; i18 < length; i18++) {
                strArr[i18] = v8Array2.getString(i18);
            }
            v8Array.release();
            v8Array2.release();
            return strArr;
        } catch (java.lang.Throwable th6) {
            v8Array.release();
            if (v8Array2 != null) {
                v8Array2.release();
            }
            throw th6;
        }
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public boolean isObject() {
        return true;
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public java.lang.String toString() {
        return this.v8Object.toString();
    }
}
