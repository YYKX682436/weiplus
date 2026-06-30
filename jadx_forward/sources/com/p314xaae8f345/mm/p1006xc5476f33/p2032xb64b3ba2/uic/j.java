package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class j implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v f239964d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar) {
        this.f239964d = vVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        t45.f fVar;
        vx3.i a17;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter;
        if (i17 < 0 || i17 >= c22848x6ddd90cf.mo1894x7e414b06() - c22848x6ddd90cf.Z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneDataUIC", "invalid position:" + i17);
            return;
        }
        int a07 = c22848x6ddd90cf.a0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar = this.f239964d;
        if (i17 < a07) {
            java.lang.Object obj = c22848x6ddd90cf.f374635i.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            if (((in5.w) obj) instanceof ox3.p) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = vVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class)).T6();
                return;
            }
            return;
        }
        int a08 = i17 - c22848x6ddd90cf.a0();
        ox3.f fVar2 = (ox3.f) kz5.n0.a0(c22848x6ddd90cf.m82898xfb7e5820(), a08);
        if (fVar2 == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = vVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3 c3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class);
        c3Var.getClass();
        ed0.z0.i1(c3Var, 7L, a08, fVar2, 0L, 8, null);
        t45.g gVar = ((ox3.g) fVar2).f431282d.f497150f;
        if (gVar == null || (fVar = gVar.f497093d) == null || (a17 = qx3.d.a(fVar.f497082d)) == null) {
            return;
        }
        t45.p0 p0Var = gVar.f497108v;
        int i18 = vVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486 ? 26 : 25;
        long j17 = p0Var != null ? p0Var.f497163f : 0L;
        if (p0Var == null || (str = p0Var.f497164g) == null) {
            str = "";
        }
        vVar.R6(a17, 38, i18, j17, str, a08);
    }
}
