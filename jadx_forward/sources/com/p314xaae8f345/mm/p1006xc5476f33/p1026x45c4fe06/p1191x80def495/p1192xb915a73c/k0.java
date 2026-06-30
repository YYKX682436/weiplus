package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0 f170435a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f170436b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f170437c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f170438d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f170439e;

    public final synchronized sh1.f a(int i17) {
        return (sh1.f) f170437c.get(java.lang.Integer.valueOf(i17));
    }

    public final synchronized sh1.g b(int i17) {
        return (sh1.g) f170438d.get(java.lang.Integer.valueOf(i17));
    }

    public final void c() {
        java.util.HashMap hashMap;
        if (f170439e) {
            return;
        }
        f170439e = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewManager", "init process:" + bm5.f1.a());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.b5) ((os5.q) i95.n0.c(os5.q.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveForSkylineService", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        sh1.h hVar = (sh1.h) i95.n0.c(sh1.h.class);
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a5 a5Var = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a5();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.u0) hVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewService", "registerViewFactory viewType:FinderLive mainProcess:true process:" + bm5.f1.a());
        synchronized (f170435a) {
            hashMap = f170436b;
            hashMap.put("FinderLive", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t(true, a5Var));
        }
        nj1.g gVar = new nj1.g();
        synchronized (this) {
            hashMap.put("RichText", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t(false, gVar));
        }
    }

    public final void d(int i17, java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        synchronized (this) {
            f170437c.remove(java.lang.Integer.valueOf(i17));
        }
        sh1.g b17 = b(i17);
        if (b17 != null) {
            b17.c(params);
            synchronized (this) {
                f170438d.remove(java.lang.Integer.valueOf(i17));
            }
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(dm.i4.f66865x76d1ec5a, i17);
            bundle.putString("params", params);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.b0.f170421d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.c0.f170423d);
        }
    }
}
