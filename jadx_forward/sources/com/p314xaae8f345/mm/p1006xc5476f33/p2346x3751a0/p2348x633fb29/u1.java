package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes.dex */
public final class u1 extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.t1 f258339d = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.t1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f258340e = (lp0.b.h() + "voip") + "/Models";

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_02a59497";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        java.lang.String m117639xfb83cc9b = resource.m117639xfb83cc9b();
        java.lang.String m117638xfb82e301 = resource.m117638xfb82e301();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.t1 t1Var = f258339d;
        t1Var.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m117638xfb82e301);
        java.lang.String b17 = t1Var.b(t1Var.c(m117638xfb82e301));
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VoipModelUdrMgr", "No model matched for name: ".concat(m117638xfb82e301));
            return;
        }
        java.lang.String str = f258340e + '/' + b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipModelUdrMgr", "activePath: " + m117639xfb83cc9b + " modelfile: " + str);
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(m117639xfb83cc9b, str, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("results ");
        sb6.append(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipModelUdrMgr", sb6.toString());
    }
}
