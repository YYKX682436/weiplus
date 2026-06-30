package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class j4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f267803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f267804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f267806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267808i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f267809m;

    public j4(int i17, int i18, nw4.k kVar, int i19, nw4.y2 y2Var, java.lang.String str, boolean z17) {
        this.f267803d = i17;
        this.f267804e = i18;
        this.f267805f = kVar;
        this.f267806g = i19;
        this.f267807h = y2Var;
        this.f267808i = str;
        this.f267809m = z17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 Di;
        nw4.k kVar = this.f267805f;
        if (i17 != 0) {
            nw4.g gVar = kVar.f422396d;
            nw4.y2 y2Var = this.f267807h;
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail click error", null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteBizArticle confirmed, msgId=");
        int i18 = this.f267803d;
        sb6.append(i18);
        sb6.append(", idx=");
        sb6.append(this.f267804e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        android.content.Context context = kVar.f422393a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        int intExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).getIntent().getIntExtra("KProfileItemStatus", 0);
        android.content.Context context2 = kVar.f422393a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        int intExtra2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context2).getIntent().getIntExtra("KProfileDetailInfoSize", 0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(kVar.f422393a, "", "", true, true, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i4.f267781d);
        if (this.f267806g == 2) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            Di = ((ox.r) d0Var).Di(2);
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            Di = ((ox.r) d0Var2).Di(1);
        }
        int i19 = this.f267804e;
        Di.a(i18, i19, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h4(Q, this.f267808i, i19, intExtra, intExtra2, this.f267809m, this.f267805f, this.f267807h));
    }
}
