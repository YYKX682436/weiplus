package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class ArrayMirror extends com.eclipsesource.mmv8.debug.mirror.ObjectMirror {
    private static final java.lang.String LENGTH = "length";

    public ArrayMirror(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public boolean isArray() {
        return true;
    }

    public int length() {
        return this.v8Object.executeIntegerFunction(LENGTH, null);
    }
}
