package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class kj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f285875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285877h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285878i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f285879m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285880n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f285881o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285882p;

    public kj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, java.lang.String str2, int i17, java.util.Map map, java.lang.String str3, java.lang.String str4, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i19) {
        this.f285882p = c21908xb66fd105;
        this.f285873d = str;
        this.f285874e = str2;
        this.f285875f = i17;
        this.f285876g = map;
        this.f285877h = str3;
        this.f285878i = str4;
        this.f285879m = i18;
        this.f285880n = f9Var;
        this.f285881o = i19;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f285873d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("key_enable_fts_quick", true);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285882p;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, c21908xb66fd105.f284708s.x());
            j45.l.j(c21908xb66fd105.f284708s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String str2 = c21908xb66fd105.H;
            java.lang.String str3 = this.f285874e;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f285875f);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c21908xb66fd105.P);
            java.lang.String str4 = c21908xb66fd105.N;
            java.util.Map map = this.f285876g;
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(map));
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
            j31.c cVar = c21908xb66fd105.X;
            java.lang.String str5 = cVar.f378907f;
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
            j31.c cVar2 = c21908xb66fd105.X;
            g0Var.d(11608, str2, str3, valueOf, valueOf2, str4, valueOf3, valueOf4, str5, valueOf5, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
            this.f285882p.p1(5, this.f285876g, this.f285877h, "", this.f285878i);
            if (this.f285879m == 1) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ar.f284938a.a(this.f285880n, java.lang.Integer.valueOf(this.f285881o));
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, erVar, map);
            c21908xb66fd105.s1(3, c21908xb66fd105.f284708s.x(), erVar.f285439b);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
