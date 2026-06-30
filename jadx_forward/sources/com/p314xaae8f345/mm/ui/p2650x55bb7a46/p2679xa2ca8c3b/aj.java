package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class aj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f284897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f284898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f284899h;

    public aj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, java.lang.String str2, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f284899h = c21908xb66fd105;
        this.f284895d = str;
        this.f284896e = str2;
        this.f284897f = map;
        this.f284898g = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$51", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f284895d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", this.f284896e);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("key_enable_fts_quick", true);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f284899h;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, c21908xb66fd105.f284708s.x());
            j45.l.j(c21908xb66fd105.f284708s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String str2 = c21908xb66fd105.H;
            java.lang.String str3 = this.f284896e;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c21908xb66fd105.P);
            java.lang.String str4 = c21908xb66fd105.N;
            java.util.Map map = this.f284897f;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(map));
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
            j31.c cVar = c21908xb66fd105.X;
            java.lang.String str5 = cVar.f378907f;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
            j31.c cVar2 = c21908xb66fd105.X;
            g0Var.d(11608, str2, str3, 1, valueOf, str4, valueOf2, valueOf3, str5, valueOf4, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 7, erVar.c());
            tb5.a.f498558a.a(6, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y);
            yb5.d dVar = c21908xb66fd105.f284708s;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f284898g;
            tb5.o0.c(dVar, f9Var, map, 3);
            if (f9Var.B2()) {
                ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_bt1");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$51", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
