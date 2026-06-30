package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e5 f193761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y52 f193762e;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e5 e5Var, r45.y52 y52Var) {
        this.f193761d = e5Var;
        this.f193762e = y52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCloseBannerAdapter$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e5 e5Var = this.f193761d;
        java.lang.String str2 = e5Var.f193904e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" click, activityICon:");
        r45.y52 y52Var = this.f193762e;
        sb6.append(y52Var.m75945x2fec8307(1));
        sb6.append(", action_url:");
        sb6.append(y52Var.m75945x2fec8307(4));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var == null || (str = c1Var.f410385o) == null) {
            str = "";
        }
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        long m75942xfb822ef2 = (e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        java.lang.String m75945x2fec8307 = y52Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        r0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", str);
        hashMap.put("liveId", java.lang.String.valueOf(m75942xfb822ef2));
        hashMap.put("bannerid", m75945x2fec8307);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f409495l2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        zy2.zb.T8(zbVar, t1Var, hashMap, b17 == null ? "" : b17, "1002", null, null, false, 112, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveHotBannerClick bannerid=".concat(m75945x2fec8307));
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Context context = e5Var.f193903d;
        java.lang.String m75945x2fec83072 = y52Var.m75945x2fec8307(4);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Fk(context, null, 4, m75945x2fec83072);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = 4;
        objArr[1] = 2;
        objArr[2] = java.lang.Long.valueOf(c01.id.c());
        objArr[3] = xy2.c.e(e5Var.f193903d);
        objArr[4] = "";
        java.lang.String m75945x2fec83073 = y52Var.m75945x2fec8307(0);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        objArr[5] = m75945x2fec83073;
        g0Var.d(22748, objArr);
        if (y52Var.m75939xb282bd08(7) == 1) {
            r45.jn0 jn0Var = new r45.jn0();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 70);
            java.lang.String m75945x2fec83074 = y52Var.m75945x2fec8307(0);
            jSONObject.put(dm.i4.f66865x76d1ec5a, m75945x2fec83074 != null ? m75945x2fec83074 : "");
            jn0Var.set(3, jSONObject.toString());
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Kj(null, 18054, jn0Var);
        } else {
            java.lang.String m75945x2fec83075 = y52Var.m75945x2fec8307(0);
            if (m75945x2fec83075 != null) {
                java.lang.String str3 = m75945x2fec83075.length() > 0 ? m75945x2fec83075 : null;
                if (str3 != null) {
                    new ke2.d(str3).l();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCloseBannerAdapter$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
