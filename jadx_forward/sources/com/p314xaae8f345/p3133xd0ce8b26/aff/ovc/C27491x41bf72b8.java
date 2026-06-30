package com.p314xaae8f345.p3133xd0ce8b26.aff.ovc;

/* renamed from: com.tencent.wechat.aff.ovc.ZIDL_fglmkk0yK */
/* loaded from: classes4.dex */
class C27491x41bf72b8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299004a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299005b = new java.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_CX */
    private void m116646x1964d1bd(java.lang.Object obj) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    /* renamed from: ZIDL_DX */
    private void m116647x1964d1dc(java.lang.Object obj) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    /* renamed from: ZIDL_EI */
    private void m116648x1964d1ec() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299004a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("OVCPermissionRequestUIK", "onAllowEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("OVCPermissionRequestUIK", "onAllowEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_FI */
    private void m116649x1964d20b() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299005b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("OVCPermissionRequestUIK", "onDenyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("OVCPermissionRequestUIK", "onDenyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_fglmkk0yD */
    public static native void m116650x41bf72b1(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_B */
    public native boolean m116651x9db8edfa(long j17);

    /* renamed from: ZIDL_CV */
    public native void m116652x1964d1bb(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_DV */
    public native void m116653x1964d1da(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_fglmkk0yC */
    public native void m116654x41bf72b0(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
