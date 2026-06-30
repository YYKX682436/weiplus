package au3;

/* loaded from: classes10.dex */
public final class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f95633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95634e;

    public f(au3.l lVar, boolean z17) {
        this.f95633d = lVar;
        this.f95634e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        au3.l lVar = this.f95633d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = lVar.f95654q;
        if (j0Var != null && j0Var.isShowing()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = lVar.f95654q;
            if (j0Var2 != null) {
                j0Var2.dismiss();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCropVideoPlugin", "click ok dismiss dialog");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialog ok isInstallWeSee:");
        boolean z17 = this.f95634e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCropVideoPlugin", sb6.toString());
        ct0.b bVar = lVar.f95652o;
        if ((bVar != null ? bVar.f303737a : null) != null) {
            if (bVar != null) {
                str = bVar.f303737a;
            }
            str = null;
        } else {
            if (bVar != null) {
                str = bVar.f303742f;
            }
            str = null;
        }
        android.view.ViewGroup viewGroup = lVar.f95644d;
        if (!z17) {
            pt3.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.p1986xc52405f1.C16990x6bb3f96.f237182g;
            java.lang.String str2 = "weishi://videoEdit?videoPath=" + str + "&activity_id=WxPublisherAct&update=1";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "parseWeSeeUri(...)");
            bVar2.b(str2, java.lang.System.currentTimeMillis());
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://isee.weishi.qq.com/static/release/group_10/528a4494-9ce7-4ac8-a763-247d84d07dae.html?_wwv=4096&chid=205000000&attach=cp_reserves3_2230000000");
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            nu3.i.f421751a.n("KEY_WESEE_DIALOG_OPERATION", 3);
            return;
        }
        nu3.m mVar = nu3.m.f421762a;
        mVar.l(2);
        mVar.i(3, 1L);
        android.content.Context context2 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String str3 = gm0.j1.b().j() + "_" + c01.id.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "toString(...)");
        android.content.Intent intent2 = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63) intent2.getParcelableExtra("KEY_SIGHT_PARAMS");
        if (c16528xd9aafd63 == null) {
            c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(2, 0);
        }
        c16528xd9aafd63.f230360q = str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = java.lang.System.currentTimeMillis() + "_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y(5);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TakePhotoUtil", "path is null");
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TakePhotoUtil", "file is not exists");
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
                ((android.app.Activity) context2).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TakePhotoUtil", "takeWeishiSight Exception: %s", e17.getMessage());
        }
        nu3.i.f421751a.n("KEY_WESEE_DIALOG_OPERATION", 1);
        android.content.Intent intent3 = new android.content.Intent();
        android.content.Context context3 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context3).setResult(-2, intent3);
        android.content.Context context4 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context4, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context4).finish();
    }
}
