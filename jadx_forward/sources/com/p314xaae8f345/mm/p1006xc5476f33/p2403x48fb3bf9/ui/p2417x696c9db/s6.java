package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class s6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f268374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f268375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268377g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d f268378h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f268379i;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var, android.content.Intent intent, boolean z17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar) {
        this.f268379i = c6Var;
        this.f268374d = intent;
        this.f268375e = z17;
        this.f268376f = str;
        this.f268377g = str2;
        this.f268378h = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f268379i;
        try {
            com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(c6Var.c().getDir("expose", 0));
            j17.J();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = c6Var.c().f265348f;
            android.graphics.Bitmap c17 = (c22633x83752a59 == null || !c22633x83752a59.m120171x1f05d274()) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.c(c6Var.c()) : c22633x83752a59.f();
            java.lang.String str = j17.o() + "/screenshot.jpg";
            android.content.Intent intent = this.f268374d;
            if (c17 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(c17, 75, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                intent.putExtra("k_webview_img", str);
            }
            if (!this.f268375e) {
                j45.l.j(c6Var.c(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            if (!j62.e.g().l("clicfg_webview_expose_config_switch_android", false, false, true)) {
                j45.l.j(c6Var.c(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle.putString("query", "{\"scene\":34}");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("k_expose_url", this.f268376f);
            bundle2.putString("k_expose_raw_url", c6Var.c().F7());
            bundle2.putInt("k_expose_web_scene", c6Var.c().L1.k0(this.f268377g));
            bundle2.putString("k_webview_img", str);
            bundle2.putInt("lastGetA8KeyRequestId", this.f268378h.f264923j);
            bundle.putBundle(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, bundle2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(c6Var.c(), bundle, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r6(this));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewMenuHelper", "[oneliang]save screen shot to file error, ex = " + e17.getMessage());
        }
    }
}
