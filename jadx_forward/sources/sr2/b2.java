package sr2;

/* loaded from: classes8.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(sr2.y2 y2Var) {
        super(0);
        this.f493051d = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sr2.y2 y2Var = this.f493051d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = y2Var.m158354x19263085();
        d85.f0 business = d85.f0.f308696n;
        sr2.a2 a2Var = new sr2.a2(y2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        java.lang.String e17 = xy2.c.e(activity);
        if (hc2.s.c(ya2.h.f542017a.b(e17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiHelper", "[checkMaterialPoiSwitch] business:" + business + ", get material is enable");
            a2Var.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L8).mo141623x754a37bb()).r()).intValue();
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POST_MATERIAL_POI_SWITCH_DIALOG_CLOSE_TIME_INT_SYNC, 0);
            if (r17 >= intValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiHelper", "[checkMaterialPoiSwitch] business:" + business + ", reach max time, closeMax:" + intValue);
                a2Var.mo146xb9724478(java.lang.Boolean.FALSE);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                java.lang.String string = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mga);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                i95.m c17 = i95.n0.c(ud0.e.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                if (!((java.lang.Boolean) k85.t.f386972a.h(activity, d85.g0.IMAGE_LOCATION_DATA, business, null, new la2.b(business, f0Var, a2Var, r17, e17), string).f384366d).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiHelper", "[checkMaterialPoiSwitch] business:" + business + ", show dialog false");
                    a2Var.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
