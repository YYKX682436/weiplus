package jk5;

/* loaded from: classes13.dex */
public class n extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f381712a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk5.o f381713b;

    public n(jk5.o oVar, jk5.k kVar) {
        this.f381713b = oVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        android.os.Bundle bundle;
        boolean startsWith = str.startsWith("wechatapp://sign-in-twitter.wechatapp.com/");
        jk5.o oVar = this.f381713b;
        if (!startsWith) {
            android.content.Context context = oVar.getContext();
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/twitter/TwitterDialog$TwitterWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/twitter/TwitterDialog$TwitterWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        try {
            java.net.URL url = new java.net.URL(str.replace("wechatapp", "http"));
            bundle = C(url.getQuery());
            bundle.putAll(C(url.getRef()));
        } catch (java.net.MalformedURLException unused) {
            bundle = new android.os.Bundle();
        }
        if (bundle.getString("denied") == null) {
            jk5.j jVar = (jk5.j) oVar.f381716e;
            jVar.getClass();
            gm0.j1.e().j(new jk5.i(jVar, bundle));
        } else {
            ((jk5.j) oVar.f381716e).c();
        }
        oVar.dismiss();
        return true;
    }

    public android.os.Bundle C(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (str != null) {
            for (java.lang.String str2 : str.split("&")) {
                java.lang.String[] split = str2.split("=");
                bundle.putString(java.net.URLDecoder.decode(split[0]), java.net.URLDecoder.decode(split[1]));
            }
        }
        return bundle;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        jk5.o oVar = this.f381713b;
        this.f381712a = false;
        try {
            oVar.f381717f.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TwitterDialog", e17, "", new java.lang.Object[0]);
        }
        oVar.f381720i.setBackgroundColor(0);
        oVar.f381719h.setVisibility(0);
        oVar.f381718g.setVisibility(0);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        jk5.o oVar = this.f381713b;
        try {
            oVar.f381717f.show();
            oVar.f381717f.setOnDismissListener(new jk5.m(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TwitterDialog", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void p(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        this.f381712a = false;
        jk5.o oVar = this.f381713b;
        jk5.l lVar = oVar.f381716e;
        new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.h(str, i17, str2);
        jk5.j jVar = (jk5.j) lVar;
        jVar.d(false);
        jVar.a(jk5.c.Failed);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(583L, 2L, 1L, false);
        try {
            oVar.dismiss();
            oVar.f381717f.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TwitterDialog", e17, "", new java.lang.Object[0]);
        }
    }
}
