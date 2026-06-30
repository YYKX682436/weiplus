package com.p166x1da19ac6.jni;

/* renamed from: com.facebook.jni.HybridData */
/* loaded from: classes16.dex */
public class C1545xd48843e6 {

    /* renamed from: mDestructor */
    private com.p166x1da19ac6.jni.C1545xd48843e6.Destructor f5075x3383ec46 = new com.p166x1da19ac6.jni.C1545xd48843e6.Destructor(this);

    /* renamed from: com.facebook.jni.HybridData$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p166x1da19ac6.jni.C1543x37c99383.Destructor {

        /* renamed from: mNativePointer */
        private volatile long f5076xa2496b9;

        public Destructor(java.lang.Object obj) {
            super(obj);
        }

        /* renamed from: deleteNative */
        public static native void m16729xc91f95a2(long j17);

        @Override // com.p166x1da19ac6.jni.C1543x37c99383.Destructor
        /* renamed from: destruct */
        public final void mo16719x3da07396() {
            m16729xc91f95a2(this.f5076xa2496b9);
            this.f5076xa2496b9 = 0L;
        }
    }

    static {
        a8.a.a("fbjni");
    }

    /* renamed from: isValid */
    public boolean m16726x7b953cf2() {
        return this.f5075x3383ec46.f5076xa2496b9 != 0;
    }

    /* renamed from: resetNative */
    public synchronized void m16727xc85fe246() {
        this.f5075x3383ec46.mo16719x3da07396();
    }
}
