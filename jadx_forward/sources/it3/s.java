package it3;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376113d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2) {
        this.f376113d = activityC16983x775783e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.mb4 mb4Var = new r45.mb4();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376113d;
        mb4Var.set(0, activityC16983x775783e2.f237145d);
        i95.m c17 = i95.n0.c(bg0.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        activityC16983x775783e2.f237153o = ((b92.u2) ((bg0.v) c17)).Zi(mb4Var, 0, 0, null);
        java.util.List c18 = kz5.b0.c(java.lang.Long.valueOf(activityC16983x775783e2.f237154p));
        rm5.k kVar = activityC16983x775783e2.f237153o;
        if (kVar != null) {
            kVar.a(c18, new it3.r(activityC16983x775783e2));
        }
    }
}
