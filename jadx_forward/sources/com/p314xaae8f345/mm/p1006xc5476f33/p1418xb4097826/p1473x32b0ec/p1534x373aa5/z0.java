package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 f198380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.v2 f198381e;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590, so2.v2 v2Var) {
        this.f198380d = c14298xca26f590;
        this.f198381e = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590.f197313x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590 = this.f198380d;
        c14298xca26f590.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "jumpToFinderLiveEntrance: navigate to finder live entrance");
        java.util.HashMap hashMap = new java.util.HashMap();
        so2.v2 v2Var = this.f198381e;
        hashMap.put("liveid", pm0.v.u(v2Var.f492192n.m75942xfb822ef2(0)));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f409545z3;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.T8(zbVar, t1Var, hashMap, b17, "temp_30", null, null, false, 112, null);
        long j17 = c01.z1.j();
        if ((9007199254740992L & j17) != 0) {
            long j18 = j17 & (-9007199254740993L);
            c01.z1.Q(java.lang.Long.valueOf(j18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "jumpToFinderLiveEntrance: opened live entrance, newExtStatus=" + j18);
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 65;
            p53Var.f464295e = 1;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        android.content.Intent intent = new android.content.Intent();
        ws5.j[] jVarArr = ws5.j.f530751d;
        intent.putExtra("nearby_live_enter_source_params_key", 6);
        intent.putExtra("nearby_live_disable_clean_red_params_key", true);
        intent.putExtra("nearby_live_forbid_enter_preload_params_key", true);
        intent.putExtra("KEY_FROM_SHARE_REL", true);
        intent.putExtra("KEY_FORBID_SQUARE_TEEN", true);
        r45.la2 la2Var = v2Var.f492200v;
        if (la2Var != null && (m75934xbce7f2f = la2Var.m75934xbce7f2f(2)) != null) {
            intent.putExtra("nearby_live_target_last_buffer_params_key", m75934xbce7f2f.g());
        }
        r45.ow1 ow1Var = v2Var.f492202x;
        if (ow1Var != null) {
            r45.lp1 lp1Var = new r45.lp1();
            java.lang.String m75945x2fec8307 = ow1Var.m75945x2fec8307(2);
            if (m75945x2fec8307 != null) {
                lp1Var.set(0, m75945x2fec8307);
            }
            java.lang.String m75945x2fec83072 = ow1Var.m75945x2fec8307(3);
            if (m75945x2fec83072 != null) {
                lp1Var.set(1, m75945x2fec83072);
            }
            intent.putExtra("nearby_live_guide_ext_info_params_key", lp1Var.mo14344x5f01b1f6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "jumpToFinderLiveEntrance: extInfo lightUrl=" + lp1Var.m75945x2fec8307(0) + ", darkUrl=" + lp1Var.m75945x2fec8307(1));
        }
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        android.content.Context context = c14298xca26f590.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((v40.s) nVar).wi(context, intent);
        android.content.Context context2 = c14298xca26f590.getContext();
        if (context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
