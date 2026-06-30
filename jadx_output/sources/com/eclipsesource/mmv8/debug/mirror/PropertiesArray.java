package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class PropertiesArray implements com.eclipsesource.mmv8.Releasable {
    private com.eclipsesource.mmv8.V8Array v8Array;

    public PropertiesArray(com.eclipsesource.mmv8.V8Array v8Array) {
        this.v8Array = v8Array.twin();
    }

    public com.eclipsesource.mmv8.debug.mirror.PropertyMirror getProperty(int i17) {
        com.eclipsesource.mmv8.V8Object object = this.v8Array.getObject(i17);
        try {
            return new com.eclipsesource.mmv8.debug.mirror.PropertyMirror(object);
        } finally {
            object.release();
        }
    }

    public int length() {
        return this.v8Array.length();
    }

    @Override // com.eclipsesource.mmv8.Releasable
    public void release() {
        if (this.v8Array.isReleased()) {
            return;
        }
        this.v8Array.release();
    }
}
