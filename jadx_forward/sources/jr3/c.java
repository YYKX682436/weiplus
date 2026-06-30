package jr3;

/* loaded from: classes4.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public er3.d f382929d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f382930e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f382931f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new jr3.b(this), false);

    /* renamed from: g, reason: collision with root package name */
    public final android.app.Activity f382932g;

    public c(android.app.Activity activity) {
        this.f382932g = activity;
    }

    public final void a(java.lang.String str) {
        this.f382931f.d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f382930e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        android.app.Activity activity = this.f382932g;
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bjg));
        intent.putExtra(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb, true);
        intent.putExtra("vertical_scroll", false);
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(205, this);
        er3.d dVar = (er3.d) m1Var;
        if (i17 == 0 && i18 == 0) {
            a(((r45.ls3) dVar.f337559e.f152244b.f152233a).f461332d);
            return;
        }
        if (i17 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ViewTWeibo", "view weibo failed: " + i17 + ", " + i18);
        }
        a("http://t.qq.com/" + dVar.f337560f);
    }
}
