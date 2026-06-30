package au3;

/* loaded from: classes10.dex */
public final class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f14100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14101e;

    public f(au3.l lVar, boolean z17) {
        this.f14100d = lVar;
        this.f14101e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        au3.l lVar = this.f14100d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = lVar.f14121q;
        if (j0Var != null && j0Var.isShowing()) {
            com.tencent.mm.ui.widget.dialog.j0 j0Var2 = lVar.f14121q;
            if (j0Var2 != null) {
                j0Var2.dismiss();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", "click ok dismiss dialog");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialog ok isInstallWeSee:");
        boolean z17 = this.f14101e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", sb6.toString());
        ct0.b bVar = lVar.f14119o;
        if ((bVar != null ? bVar.f222204a : null) != null) {
            if (bVar != null) {
                str = bVar.f222204a;
            }
            str = null;
        } else {
            if (bVar != null) {
                str = bVar.f222209f;
            }
            str = null;
        }
        android.view.ViewGroup viewGroup = lVar.f14111d;
        if (!z17) {
            pt3.b bVar2 = com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider.f155649g;
            java.lang.String str2 = "weishi://videoEdit?videoPath=" + str + "&activity_id=WxPublisherAct&update=1";
            kotlin.jvm.internal.o.f(str2, "parseWeSeeUri(...)");
            bVar2.b(str2, java.lang.System.currentTimeMillis());
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://isee.weishi.qq.com/static/release/group_10/528a4494-9ce7-4ac8-a763-247d84d07dae.html?_wwv=4096&chid=205000000&attach=cp_reserves3_2230000000");
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            nu3.i.f340218a.n("KEY_WESEE_DIALOG_OPERATION", 3);
            return;
        }
        nu3.m mVar = nu3.m.f340229a;
        mVar.l(2);
        mVar.i(3, 1L);
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        kotlin.jvm.internal.o.d(str);
        java.lang.String str3 = gm0.j1.b().j() + "_" + c01.id.c();
        kotlin.jvm.internal.o.f(str3, "toString(...)");
        android.content.Intent intent2 = new android.content.Intent();
        com.tencent.mm.plugin.mmsight.SightParams sightParams = (com.tencent.mm.plugin.mmsight.SightParams) intent2.getParcelableExtra("KEY_SIGHT_PARAMS");
        if (sightParams == null) {
            sightParams = new com.tencent.mm.plugin.mmsight.SightParams(2, 0);
        }
        sightParams.f148827q = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = java.lang.System.currentTimeMillis() + "_" + com.tencent.mm.sdk.platformtools.t8.Y(5);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TakePhotoUtil", "path is null");
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TakePhotoUtil", "file is not exists");
        }
        intent2.setAction("android.intent.action.VIEW");
        intent2.setData(android.net.Uri.parse("weishi://videoEdit?videoPath=" + str + "&activity_id=WxPublisherAct&update=1"));
        intent2.setPackage("com.tencent.weishi");
        intent2.setFlags(268435456);
        context2.getSharedPreferences("opensdk_shareTicket", 0).edit().putString(intent2.getPackage(), str3).apply();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "takeWeiShiSightToEdit", "(Landroid/content/Context;ILandroid/content/Intent;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "takeWeiShiSightToEdit", "(Landroid/content/Context;ILandroid/content/Intent;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (context2 instanceof android.app.Activity) {
                ((android.app.Activity) context2).overridePendingTransition(com.tencent.mm.R.anim.f477876e0, -1);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TakePhotoUtil", "takeWeishiSight Exception: %s", e17.getMessage());
        }
        nu3.i.f340218a.n("KEY_WESEE_DIALOG_OPERATION", 1);
        android.content.Intent intent3 = new android.content.Intent();
        android.content.Context context3 = viewGroup.getContext();
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context3).setResult(-2, intent3);
        android.content.Context context4 = viewGroup.getContext();
        kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context4).finish();
    }
}
