package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class a5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 f210382d;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 d5Var) {
        this.f210382d = d5Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 d5Var = this.f210382d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) d5Var.f210585b).h("material_poi_switch");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
        if (c21541x1c1b08fe == null) {
            return;
        }
        boolean N = c21541x1c1b08fe.N();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "modMaterialPoiSwitchCallback, ret " + ret.m75939xb282bd08(1) + " isChecked:" + N);
        if (ret.m75939xb282bd08(1) == 0) {
            ya2.g gVar = ya2.h.f542017a;
            ya2.b2 b17 = gVar.b(d5Var.f210586c);
            long j17 = b17 != null ? b17.f69298x75e87a18 : 0L;
            long j18 = N ? j17 | 1024 : (-1025) & j17;
            if (b17 != null) {
                b17.f69298x75e87a18 = j18;
                gVar.o(b17);
            }
        } else {
            c21541x1c1b08fe.O(!N);
            android.app.Activity activity = d5Var.f210584a;
            java.lang.String string = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572890mh5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
        }
        az2.f fVar = d5Var.f210587d;
        if (fVar != null) {
            fVar.b();
        }
    }
}
