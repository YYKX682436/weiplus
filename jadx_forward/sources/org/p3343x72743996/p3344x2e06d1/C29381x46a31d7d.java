package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.UserDataHost */
/* loaded from: classes7.dex */
public final class C29381x46a31d7d {

    /* renamed from: mThreadId */
    private final long f73489x7cd36452 = android.os.Process.myTid();

    /* renamed from: mUserDataMap */
    private java.util.HashMap<java.lang.Class<? extends org.p3343x72743996.p3344x2e06d1.InterfaceC29380xf3f0d635>, org.p3343x72743996.p3344x2e06d1.InterfaceC29380xf3f0d635> f73490xee14185a = new java.util.HashMap<>();

    /* renamed from: checkArgument */
    private static void m152773x312c1fe5(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException("Neither key nor object of UserDataHost can be null.");
        }
    }

    /* renamed from: checkThreadAndState */
    private void m152774x73b6f44c() {
        if (this.f73489x7cd36452 != android.os.Process.myTid()) {
            throw new java.lang.IllegalStateException("UserData must only be used on a single thread.");
        }
        if (this.f73490xee14185a == null) {
            throw new java.lang.IllegalStateException("Operation is not allowed after destroy().");
        }
    }

    /* renamed from: destroy */
    public void m152775x5cd39ffa() {
        m152774x73b6f44c();
        java.util.HashMap<java.lang.Class<? extends org.p3343x72743996.p3344x2e06d1.InterfaceC29380xf3f0d635>, org.p3343x72743996.p3344x2e06d1.InterfaceC29380xf3f0d635> hashMap = this.f73490xee14185a;
        this.f73490xee14185a = null;
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.InterfaceC29380xf3f0d635> it = hashMap.values().iterator();
        while (it.hasNext()) {
            it.next().m152772x5cd39ffa();
        }
    }

    /* renamed from: getUserData */
    public <T extends org.p3343x72743996.p3344x2e06d1.InterfaceC29380xf3f0d635> T m152776x6bf0af8b(java.lang.Class<T> cls) {
        m152774x73b6f44c();
        m152773x312c1fe5(cls != null);
        return cls.cast(this.f73490xee14185a.get(cls));
    }

    /* renamed from: removeUserData */
    public <T extends org.p3343x72743996.p3344x2e06d1.InterfaceC29380xf3f0d635> T m152777x910d0ab9(java.lang.Class<T> cls) {
        m152774x73b6f44c();
        m152773x312c1fe5(cls != null);
        if (this.f73490xee14185a.containsKey(cls)) {
            return cls.cast(this.f73490xee14185a.remove(cls));
        }
        throw new java.lang.IllegalStateException("UserData for the key is not present.");
    }

    /* renamed from: setUserData */
    public <T extends org.p3343x72743996.p3344x2e06d1.InterfaceC29380xf3f0d635> T m152778x66a91097(java.lang.Class<T> cls, T t17) {
        m152774x73b6f44c();
        m152773x312c1fe5((cls == null || t17 == null) ? false : true);
        this.f73490xee14185a.put(cls, t17);
        return (T) m152776x6bf0af8b(cls);
    }
}
