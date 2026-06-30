package fw4;

@j95.b
/* loaded from: classes8.dex */
public final class l extends i95.w implements gw4.g {
    public void wi(gw4.f fVar, gw4.e eVar) {
        if (fVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeDownloadAppManager", "downloadApp downloadAppId: " + fVar.f357690b);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = fVar.f357689a;
        intent.setClassName(context, "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
        intent.putExtra("download_app_id", fVar.f357690b);
        intent.putExtra("from_scene", 5);
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(new fw4.i(eVar));
            abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, 1000);
            return;
        }
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context;
            activityC21401x6ce6f73f.m78750xc5512edd(new fw4.j(eVar));
            activityC21401x6ce6f73f.startActivityForResult(intent, 1000);
            return;
        }
        if (context instanceof android.app.Activity) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeDownloadAppManager", "downloadApp without callback, just startActivity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/webview/download/NativeDownloadAppManager", "downloadApp", "(Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppRequest;Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/webview/download/NativeDownloadAppManager", "downloadApp", "(Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppRequest;Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
