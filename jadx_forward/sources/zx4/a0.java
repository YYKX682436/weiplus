package zx4;

/* loaded from: classes8.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f558640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f558641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f558642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f558643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f558644h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f558645i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z17, zx4.l0 l0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, boolean z18, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(0);
        this.f558640d = z17;
        this.f558641e = l0Var;
        this.f558642f = str;
        this.f558643g = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f558644h = z18;
        this.f558645i = u3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f558640d) {
            zx4.l0 l0Var = this.f558641e;
            java.lang.String str = this.f558642f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f558643g;
            boolean z17 = this.f558644h;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f558645i;
            l0Var.getClass();
            if (z17) {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0.p("endCapture", new org.json.JSONObject());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb6.append(q75.c.d());
            sb6.append("webviewscpic");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(".png");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", "onPathResolve, tempOutputPath: " + str);
            l0Var.h(viewOnCreateContextMenuListenerC19337x37f3384d, sb7);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(str, sb7);
            b17.F = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k0.f33801x366c91de;
            b17.f237221z = false;
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 C7 = viewOnCreateContextMenuListenerC19337x37f3384d.C7();
            b17.U = C7 != null && C7.d(21) == 10;
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 C72 = viewOnCreateContextMenuListenerC19337x37f3384d.C7();
            b17.V = C72 != null && C72.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe.f35014x366c91de) == 10;
            java.lang.String x76 = viewOnCreateContextMenuListenerC19337x37f3384d.x7();
            if (x76 == null) {
                x76 = "";
            }
            b17.W = x76;
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.Map map = c10402x5bc41468.f146312h;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ((java.util.HashMap) map).put("plugin_filter", bool);
            ((java.util.HashMap) c10402x5bc41468.f146312h).put("plugin_poi", bool);
            ((java.util.HashMap) c10402x5bc41468.f146312h).put("plugin_tip", bool);
            ((java.util.HashMap) c10402x5bc41468.f146312h).put("plugin_menu", bool);
            b17.f237210o = c10402x5bc41468;
            ut3.m.f512715a.e(viewOnCreateContextMenuListenerC19337x37f3384d, 218, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 5);
            viewOnCreateContextMenuListenerC19337x37f3384d.J2 = false;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.V7();
        } else {
            if (this.f558644h) {
                this.f558643g.f265377p0.p("endCapture", new org.json.JSONObject());
                this.f558641e.h(this.f558643g, this.f558642f);
            }
            this.f558643g.J2 = false;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f558645i;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            this.f558643g.V7();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = this.f558643g;
            db5.t7.i(viewOnCreateContextMenuListenerC19337x37f3384d2, viewOnCreateContextMenuListenerC19337x37f3384d2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3g), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        }
        return jz5.f0.f384359a;
    }
}
