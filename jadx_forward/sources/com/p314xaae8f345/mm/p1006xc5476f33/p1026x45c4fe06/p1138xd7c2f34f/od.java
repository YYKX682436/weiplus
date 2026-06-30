package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class od {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od f166407a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f166408b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseIntArray f166409c = new android.util.SparseIntArray();

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(915, 35);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeAppOpenUICallbackIPCProxy", "beforeStartAppBrandUI: [%s]", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        l81.e1 e1Var = (l81.e1) f166408b.remove(initConfig);
        if (e1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppOpenUICallbackIPCProxy", "beforeStartAppBrandUI, assign proxy to initConfig appId:" + initConfig.f158811d + ", instanceId:" + initConfig.f128810w);
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(e1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nd ndVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nd(str, atomicReference);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.a(str, ndVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12354xf2fbb9c8 c12354xf2fbb9c8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12354xf2fbb9c8(new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.gd(atomicReference)), new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.id(atomicReference, str, ndVar)), new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.kd(atomicReference)), new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.md(atomicReference)));
            c12354xf2fbb9c8.f166013h = (l81.e1) atomicReference.get();
            initConfig.f158846z2 = c12354xf2fbb9c8;
        }
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc launchParcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchParcel, "launchParcel");
        l81.b1 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a.f(launchParcel.Q);
        l81.e1 e1Var = f17 != null ? f17.L : null;
        if (e1Var != null && !f166407a.b(e1Var)) {
            f166408b.put(initConfig, e1Var);
        }
        android.os.Parcelable parcelable = launchParcel.X;
        initConfig.B2 = parcelable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11561xd7b6a6e5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11561xd7b6a6e5) parcelable : null;
        initConfig.H2 = launchParcel.f166456x1;
        initConfig.A2 = f17 != null ? f17.M : false;
        launchParcel.f166460z = null;
    }

    public final boolean b(l81.e1 e1Var) {
        boolean z17;
        android.util.SparseIntArray sparseIntArray = f166409c;
        synchronized (sparseIntArray) {
            z17 = sparseIntArray.get(e1Var.hashCode(), 0) == 1;
        }
        return z17;
    }
}
