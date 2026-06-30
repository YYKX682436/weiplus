package r35;

/* loaded from: classes8.dex */
public class k4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f450703d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f450704e;

    /* renamed from: f, reason: collision with root package name */
    public w60.k f450705f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f450706g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f450707h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new r35.j4(this), false);

    public k4(android.content.Context context) {
        this.f450703d = context;
    }

    public void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ViewQZone", "go fail, qqNum is null");
            return;
        }
        this.f450704e = str;
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(46, null);
        java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(72, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewQZone", "get a2key:[%s], get new a2key:[%s]", str2, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            b(str);
            return;
        }
        c01.d9.e().a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
        w60.j jVar = (w60.j) i95.n0.c(w60.j.class);
        int b17 = kk.v.b(str);
        int a17 = o45.cg.a();
        ((v60.u) jVar).getClass();
        this.f450705f = new com.p314xaae8f345.mm.p957x53236a1b.k0(b17, a17);
        c01.d9.e().g((com.p314xaae8f345.mm.p944x882e457a.m1) this.f450705f);
        this.f450707h.c(3000L, 3000L);
    }

    public final void b(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f450703d;
        intent.putExtra("rawUrl", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bg7, str));
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("neverGetA8Key", true);
        j45.l.j(context, "webview", ".ui.tools.ContactQZoneWebView", intent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f450707h.d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f450706g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        c01.d9.e().q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ViewQZone", "getA8Key fail, errType = " + i17 + ", errCode = " + i18);
            b(this.f450704e);
            return;
        }
        com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var = (com.p314xaae8f345.mm.p957x53236a1b.k0) ((w60.k) m1Var);
        java.lang.String Q = k0Var.Q();
        if (Q == null || Q.length() == 0) {
            b(this.f450704e);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", Q);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("geta8key_session_id", k0Var.O());
        j45.l.j(this.f450703d, "webview", ".ui.tools.ContactQZoneWebView", intent, null);
    }
}
