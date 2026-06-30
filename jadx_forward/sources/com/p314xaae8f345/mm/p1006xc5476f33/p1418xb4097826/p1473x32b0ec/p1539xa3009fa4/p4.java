package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes2.dex */
public final class p4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f198849d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f198850e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.GridLayout f198851f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f198852g;

    /* renamed from: h, reason: collision with root package name */
    public km2.p f198853h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f198849d = itemView.findViewById(com.p314xaae8f345.mm.R.id.f566730u12);
        this.f198850e = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.f566728u10);
        this.f198851f = (android.widget.GridLayout) itemView.findViewById(com.p314xaae8f345.mm.R.id.u0w);
        this.f198852g = itemView.findViewById(com.p314xaae8f345.mm.R.id.u0s);
    }

    public static final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p4 p4Var) {
        r45.lp1 lp1Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        android.content.Context context = p4Var.f3639x46306858.getContext();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGuideCard", "jumpToLiveSquare: navigate to live square");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.t1 t1Var = ml2.t1.f409475e;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        ml2.q1 q1Var = ml2.q1.f409345e;
        ((ml2.j0) ((zy2.zb) c17)).Sj("live_down_find_enter_pop", linkedHashMap, null, "temp_2", null, null);
        long j17 = c01.z1.j();
        if ((9007199254740992L & j17) != 0) {
            long j18 = j17 & (-9007199254740993L);
            c01.z1.Q(java.lang.Long.valueOf(j18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGuideCard", "jumpToLiveSquare: opened live entrance, newExtStatus=" + j18);
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
        km2.p pVar = p4Var.f198853h;
        if (pVar != null && (gVar = pVar.f390700b) != null) {
            intent.putExtra("nearby_live_target_last_buffer_params_key", gVar.f273689a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGuideCard", "jumpToLiveSquare: navBuffer size=" + gVar.f273689a.length);
        }
        km2.p pVar2 = p4Var.f198853h;
        if (pVar2 != null && (lp1Var = pVar2.f390701c) != null) {
            intent.putExtra("nearby_live_guide_ext_info_params_key", lp1Var.mo14344x5f01b1f6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGuideCard", "jumpToLiveSquare: extInfo lightUrl=" + lp1Var.m75945x2fec8307(0));
        }
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        ((v40.s) nVar).wi(context, intent);
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
