package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.NewlifeDartToNativeOnLoader */
/* loaded from: classes8.dex */
public class C27451xa2c4af9f {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f60273x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27451xa2c4af9f f60274x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27451xa2c4af9f();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27451xa2c4af9f m116182x9cf0d20b() {
        return f60274x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m116183xbfb69197();

    /* renamed from: onLoader */
    public void m116184x4d8a06d2() {
        if (f60273x498da6d4.compareAndSet(false, true)) {
            try {
                m116183xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerAffNewLifeDartToNativeManager */
    public <T> void m116185x6b76eade(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119526x6c2286d7("newlife.AffNewLifeDartToNativeManager@Get", com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27373x5f68c919.class, cls);
    }
}
