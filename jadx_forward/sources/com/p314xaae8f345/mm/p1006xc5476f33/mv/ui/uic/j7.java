package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class j7 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 f232757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm3.u f232758b;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var, fm3.u uVar) {
        this.f232757a = q7Var;
        this.f232758b = uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.Long l17;
        java.lang.String str2;
        java.lang.Long valueOf;
        java.lang.String m76803x6c285d75;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f232757a.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class);
            c16668xffb9dd68.getClass();
            fm3.u musicMv = this.f232758b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "deleteMv " + musicMv.f345656c + ' ' + musicMv.f345657d + ' ' + musicMv.f345669p);
            int i17 = musicMv.f345669p;
            if (i17 == 1) {
                valueOf = musicMv.f345656c;
                m76803x6c285d75 = musicMv.f345657d;
            } else {
                l17 = null;
                if (i17 != 4) {
                    str2 = null;
                    if (l17 != null || str2 == null) {
                    }
                    long longValue = l17.longValue();
                    i95.m c17 = i95.n0.c(cq.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    cq.j1.b((cq.k) c17, xy2.c.e(c16668xffb9dd68.m80379x76847179()), longValue, str2, false, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v1(c16668xffb9dd68), null, 184, null);
                    return;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = musicMv.f345673t;
                valueOf = c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()) : null;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = musicMv.f345673t;
                m76803x6c285d75 = c19792x256d27252 != null ? c19792x256d27252.m76803x6c285d75() : null;
            }
            l17 = valueOf;
            str2 = m76803x6c285d75;
            if (l17 != null) {
            }
        }
    }
}
