package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class qh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er f286898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f286899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f286901h;

    public qh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f286901h = c21908xb66fd105;
        this.f286897d = str;
        this.f286898e = erVar;
        this.f286899f = map;
        this.f286900g = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f286901h;
        c21908xb66fd105.b(this.f286897d, "ecs_overall_jump_info_template_msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.String str = c21908xb66fd105.H;
        java.lang.String str2 = this.f286898e.f285439b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c21908xb66fd105.P);
        java.lang.String str3 = c21908xb66fd105.N;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(this.f286899f));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
        j31.c cVar = c21908xb66fd105.X;
        java.lang.String str4 = cVar.f378907f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
        j31.c cVar2 = c21908xb66fd105.X;
        g0Var.d(11608, str, str2, 0, valueOf, str3, valueOf2, valueOf3, str4, valueOf4, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286900g;
        if (f9Var.B2()) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_body");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
