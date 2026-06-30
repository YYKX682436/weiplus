package pk2;

/* loaded from: classes3.dex */
public final class t1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437792h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437793i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437792h = helper.f437614e0;
        this.f437793i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "onItemClicked");
        int i17 = this.f445961b;
        if (i17 == 1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 11);
            jSONObject.put("type", 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        } else {
            pk2.f8.a(pk2.f8.f437280a, 15, 2, null, 4, null);
        }
        df2.p1 p1Var = (df2.p1) o9Var.e(df2.p1.class);
        if (p1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingController", "openPanel, scene: " + i17);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = p1Var.N6();
            if (N6 != null) {
                r45.v94 v94Var = ((mm2.c1) p1Var.m56788xbba4bfc0(mm2.c1.class)).Y5;
                if (v94Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingController", "Current replay setting:[" + v94Var.m75933x41a8a7f2(0) + ',' + v94Var.m75933x41a8a7f2(1) + ',' + v94Var.m75933x41a8a7f2(2) + ',' + v94Var.m75933x41a8a7f2(3) + ']');
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingController", "Current replay setting is null");
                }
                new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6(N6, i17, v94Var, new df2.o1(p1Var, i17)).w();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAnchorLiveReplaySettingController", "Activity is null, cannot open panel");
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437793i;
    }

    @Override // qk2.f
    public boolean o() {
        boolean z17 = ((mm2.c1) this.f445960a.c(mm2.c1.class)).X5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorLiveReplaySettingOption", "isEnabled: " + z17);
        return z17;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.no9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        s(menu, this.f437792h, string, com.p314xaae8f345.mm.R.raw.f80495x37237ef7);
        if (this.f445961b != 1) {
            pk2.f8.a(pk2.f8.f437280a, 15, 1, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 11);
        jSONObject.put("type", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437792h;
    }
}
