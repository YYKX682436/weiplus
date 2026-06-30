package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class ValueMirror extends com.eclipsesource.mmv8.debug.mirror.Mirror {
    private static final java.lang.String VALUE = "value";

    public ValueMirror(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    public java.lang.Object getValue() {
        return this.v8Object.executeFunction("value", null);
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public boolean isValue() {
        return true;
    }
}
