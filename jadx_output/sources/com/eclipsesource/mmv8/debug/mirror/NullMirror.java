package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class NullMirror extends com.eclipsesource.mmv8.debug.mirror.ValueMirror {
    public NullMirror(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public boolean isNull() {
        return true;
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public java.lang.String toString() {
        return "null";
    }
}
