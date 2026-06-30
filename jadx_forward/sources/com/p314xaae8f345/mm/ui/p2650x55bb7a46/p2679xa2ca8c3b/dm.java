package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class dm extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {
    public dm(yb5.d dVar, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.view.View view) {
        super(dVar);
        if (i17 == 1) {
            b(f9Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionLocation.k(view.getContext(), null)) {
            b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).c());
        }
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int t17;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        boolean z17 = f9Var.A0() == 0;
        java.lang.String Q0 = z17 ? f9Var.Q0() : "";
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
        yb5.d dVar = this.f280025d;
        if (R4 && z17 && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r && (t17 = c01.w9.t(j17)) != -1) {
            Q0 = j17.substring(0, t17).trim();
            j17 = j17.substring(t17 + 1).trim();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b9 H6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).H6(j17);
        if (!x51.t1.b(Q0) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) {
            Q0 = "";
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202 c5689x3d19c202 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202();
        am.ej ejVar = c5689x3d19c202.f136014g;
        ejVar.f88092a = 1;
        ejVar.f88094c = f9Var;
        c5689x3d19c202.e();
        am.fj fjVar = c5689x3d19c202.f136015h;
        java.lang.String str = fjVar.f88213a;
        java.lang.String str2 = fjVar.f88214b;
        if (x51.t1.b(H6.f275313f) && !H6.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocationClickListener", "invalid poi: %s, %s", H6.f275313f, java.lang.Boolean.valueOf(H6.c()));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kMsgId", f9Var.m124847x74d37ac6());
        intent.putExtra("map_view_type", 1);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("kwebmap_slat", H6.f275309b);
        intent.putExtra("kwebmap_lng", H6.f275310c);
        intent.putExtra("kwebmap_scale", H6.f275311d);
        intent.putExtra("kPoiName", H6.f275313f);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("kisUsername", c01.a2.e(Q0));
        intent.putExtra("Kwebmap_locaion", str);
        intent.putExtra("kimg_path", g83.a.a());
        intent.putExtra("map_talker_name", f9Var.Q0());
        intent.putExtra("view_type_key", 0);
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("kPoi_url", H6.f275318k);
        intent.putExtra("kPoiid", H6.f275319l);
        intent.putExtra("KIsFromPoiList", H6.f275320m);
        intent.putExtra("KPoiCategoryTips", H6.f275321n);
        intent.putExtra("kPoiBusinessHour", H6.f275322o);
        intent.putExtra("KPoiPhone", H6.f275323p);
        intent.putExtra("KPoiPriceTips", H6.f275324q);
        intent.putExtra("kBuildingID", H6.f275325r);
        intent.putExtra("kFloorName", H6.f275326s);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        java.lang.String J0 = f9Var.J0();
        if (J0 == null) {
            J0 = "";
        }
        intent.putExtra("soso_street_view_url", J0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 2, "");
        if (dVar.D()) {
            intent.putExtra("type_tag", 2);
        } else {
            intent.putExtra("type_tag", 1);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("poi_from_chat_type", dVar.D() ? 2 : 1);
        bundle.putInt("poi_from_user_type", z17 ? 1 : 2);
        bundle.putString("poi_from_chat_name", z17 ? f9Var.Q0() : gm0.j1.b().k());
        intent.putExtra("poi_from_chat_report_bundle", bundle);
        j45.l.r(dVar.f542242d, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 2002, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cm(this));
    }
}
