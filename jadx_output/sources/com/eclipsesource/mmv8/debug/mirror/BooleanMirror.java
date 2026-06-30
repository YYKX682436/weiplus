package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class BooleanMirror extends com.eclipsesource.mmv8.debug.mirror.ValueMirror {
    public BooleanMirror(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public boolean isBoolean() {
        return true;
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public java.lang.String toString() {
        return this.v8Object.executeStringFunction("toText", null);
    }
}
