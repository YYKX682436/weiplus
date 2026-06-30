package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes13.dex */
public class r extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f290755a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2722x33325c.sdk.s f290756b;

    public r(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.s sVar, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.p pVar) {
        this.f290756b = sVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        android.os.Bundle bundle;
        boolean startsWith = str.startsWith("fbconnect://success");
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.s sVar = this.f290756b;
        if (startsWith) {
            try {
                java.net.URL url = new java.net.URL(str.replace("fbconnect", "http"));
                bundle = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.o.a(url.getQuery());
                bundle.putAll(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.o.a(url.getRef()));
            } catch (java.net.MalformedURLException unused) {
                bundle = new android.os.Bundle();
            }
            java.lang.String string = bundle.getString("error");
            if (string == null) {
                string = bundle.getString("error_type");
            }
            if (string == null) {
                sVar.f290759e.b(bundle);
            } else if (string.equals("access_denied") || string.equals("OAuthAccessDeniedException")) {
                sVar.f290759e.mo48702x3d6f0539();
            } else {
                sVar.f290759e.d(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n(string));
            }
            sVar.dismiss();
            return true;
        }
        if (str.startsWith("fbconnect://cancel")) {
            sVar.f290759e.mo48702x3d6f0539();
            try {
                sVar.dismiss();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FbDialog", e17, "", new java.lang.Object[0]);
            }
            return true;
        }
        if (str.contains("touch")) {
            return false;
        }
        android.content.Context context = sVar.getContext();
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/mmfb/sdk/FbDialog$FbWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/mmfb/sdk/FbDialog$FbWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.s sVar = this.f290756b;
        this.f290755a = false;
        try {
            sVar.f290760f.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FbDialog", e17, "", new java.lang.Object[0]);
        }
        sVar.f290763i.setBackgroundColor(0);
        sVar.f290762h.setVisibility(0);
        sVar.f290761g.setVisibility(0);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.s sVar = this.f290756b;
        try {
            sVar.f290760f.show();
            sVar.f290760f.setOnDismissListener(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.q(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FbDialog", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void p(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        this.f290755a = false;
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.s sVar = this.f290756b;
        sVar.f290759e.c(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.h(str, i17, str2));
        try {
            sVar.dismiss();
            sVar.f290760f.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FbDialog", e17, "", new java.lang.Object[0]);
        }
    }
}
