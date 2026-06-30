package com.facebook.jni;

/* loaded from: classes4.dex */
public class NativeRunnable implements java.lang.Runnable {
    private final com.facebook.jni.HybridData mHybridData;

    private NativeRunnable(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.lang.Runnable
    public native void run();
}
