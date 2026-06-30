package yf2;

/* loaded from: classes3.dex */
public final class m implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f543277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.o f543278e;

    public m(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yf2.o oVar) {
        this.f543277d = c0Var;
        this.f543278e = oVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean G1 = zl2.r4.f555483a.G1((r45.q12) obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f543277d;
        if (!c0Var.f391645d && G1) {
            yf2.o oVar = this.f543278e;
            mm2.y6 y6Var = (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) oVar.m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb();
            if (y6Var.d() || pm0.v.z(y6Var.f411114e, 152)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveController", "adjustVisibilityToPublicIfNeeded: visibilityMode=" + y6Var.f411114e + ", isChargeLive=" + y6Var.d() + ", force reset to Public");
                y6Var.i(null);
                y6Var.f411121l = java.lang.Boolean.FALSE;
                y6Var.f411122m = 0;
                y6Var.f411114e = 0;
                y6Var.f411116g.clear();
                y6Var.f411117h.clear();
                y6Var.f411118i.clear();
                java.util.List list = y6Var.f411113d;
                if (list != null) {
                    list.clear();
                }
                y6Var.j(null);
                android.content.Context O6 = oVar.O6();
                pf5.z zVar = pf5.z.f435481a;
                if (!(O6 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) O6).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class);
                if (b8Var != null) {
                    b8Var.c7(false);
                }
                android.content.Context O62 = oVar.O6();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O62);
                e4Var.f293309c = oVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575244oq4);
                e4Var.c();
            }
        }
        c0Var.f391645d = G1;
        return jz5.f0.f384359a;
    }
}
