package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ha0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ma0 f194324d;

    public ha0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ma0 ma0Var) {
        this.f194324d = ma0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ay1 ay1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveSingSongBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f314905a;
        boolean z17 = dk2.ef.f314917g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ma0 ma0Var = this.f194324d;
        mm2.m6 m6Var = (mm2.m6) ma0Var.P0(mm2.m6.class);
        r45.z22 a17 = ((mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) m6Var.f410784s).mo144003x754a37bb()).a();
        java.lang.String str = null;
        if (a17 != null) {
            p012xc85e97e9.p093xedfae76a.j0 j0Var = m6Var.f410777i;
            r45.by1 by1Var = a17.f473164h;
            if (by1Var != null && (ay1Var = by1Var.f452676d) != null) {
                str = ay1Var.f451884e;
            }
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = a17.f473162f;
            j0Var.mo7808x76db6cb1(new mm2.j7(str, str2 != null ? str2 : ""));
        } else if (z17) {
            sf2.x xVar = (sf2.x) ma0Var.U0(sf2.x.class);
            if (xVar != null) {
                xVar.s7(false);
            }
        } else {
            qo0.c.a(ma0Var.f195012q, qo0.b.f446940r2, null, 2, null);
        }
        if (z17) {
            sf2.x xVar2 = (sf2.x) ma0Var.U0(sf2.x.class);
            if (xVar2 != null) {
                xVar2.c7();
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f409903p1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.e1[] e1VarArr = ml2.e1.f408906d;
            jSONObject.put("type", "2");
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        } else {
            te2.a9.g(te2.a9.f499416a, 2, null, null, null, null, ((mm2.m6) ma0Var.P0(mm2.m6.class)).f410781p, 30, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveSingSongBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
