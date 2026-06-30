package com.facebook.jni;

/* loaded from: classes16.dex */
public class HybridData {
    private com.facebook.jni.HybridData.Destructor mDestructor = new com.facebook.jni.HybridData.Destructor(this);

    /* loaded from: classes16.dex */
    public static class Destructor extends com.facebook.jni.DestructorThread.Destructor {
        private volatile long mNativePointer;

        public Destructor(java.lang.Object obj) {
            super(obj);
        }

        public static native void deleteNative(long j17);

        @Override // com.facebook.jni.DestructorThread.Destructor
        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        a8.a.a("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}
