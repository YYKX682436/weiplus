package gx4;

/* loaded from: classes8.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx4.t f358965d;

    public r(gx4.t tVar) {
        this.f358965d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.Iterator<java.lang.String> keys;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/bag/WebViewBagMgr$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx4.t tVar = this.f358965d;
        gx4.s sVar = tVar.f358980h;
        java.lang.String str = sVar.f358967b;
        int i17 = sVar.f358972g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "bag handleClick: url:%s scene:%d", str, java.lang.Integer.valueOf(i17));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = tVar.f358979g;
        if (j17 <= 0 || currentTimeMillis - j17 >= 500) {
            tVar.f358979g = currentTimeMillis;
            tVar.k(13);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                android.content.Intent intent = new android.content.Intent();
                gx4.s sVar2 = tVar.f358980h;
                org.json.JSONObject jSONObject = sVar2.f358973h;
                int i18 = gx4.n.f358956a;
                if (jSONObject != null && (keys = jSONObject.keys()) != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        try {
                            gx4.m.a(bundle, next, jSONObject.getJSONObject(next));
                        } catch (org.json.JSONException unused) {
                        }
                    }
                    intent.putExtras(bundle);
                }
                intent.putExtra("rawUrl", str);
                intent.putExtra("from_bag", true);
                intent.putExtra("from_bag_id", sVar2.f358966a);
                intent.putExtra("from_bag_icon", sVar2.f358968c);
                if (i17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "handleClick go jd url");
                    intent.putExtra("useJs", true);
                    intent.putExtra("vertical_scroll", true);
                    intent.putExtra("minimize_secene", 1);
                    intent.putExtra("KPublisherId", "jd_store");
                    h45.g0.f360478a = 9;
                } else if (i17 == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "handleClick go game url");
                }
                if (i17 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "handleClick luggage");
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("rawUrl"))) {
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    }
                } else {
                    j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f = tVar.f358976d;
                if (c19350xc6738d4f != null) {
                    c19350xc6738d4f.m74424xbc91ffe0(false);
                }
                tVar.n(0.0f);
                sVar2.f358971f = java.lang.System.currentTimeMillis();
                sVar2.a();
                tVar.m();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "handleClick twice click too short");
            tVar.f358979g = currentTimeMillis;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/bag/WebViewBagMgr$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
