package au3;

/* loaded from: classes10.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f95630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95631e;

    public d(au3.l lVar, boolean z17) {
        this.f95630d = lVar;
        this.f95631e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        au3.l lVar = this.f95630d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = lVar.f95655r;
        if (j0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j0Var, "null cannot be cast to non-null type android.app.Dialog");
            if (j0Var.isShowing()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = lVar.f95655r;
                if (j0Var2 != null) {
                    j0Var2.dismiss();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCropVideoPlugin", "click ok dismiss dialog");
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialog ok isInstall:");
        boolean z17 = this.f95631e;
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
        if (!z17) {
            android.content.Context context = lVar.f95644d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            java.lang.String downloadUrl = Zi.concat("1102");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f357690b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_phoneix_video_duration, 30);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = lVar.f95653p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = c16993xacc19624.f237209n;
        int i18 = c11120x15dce88d != null ? c11120x15dce88d.f152727g : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = lVar.f95653p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196242);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = c16993xacc196242.f237209n;
        int i19 = c11120x15dce88d2 != null ? c11120x15dce88d2.f152724d : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = lVar.f95653p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196243);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d3 = c16993xacc196243.f237209n;
        int i27 = c11120x15dce88d3 != null ? c11120x15dce88d3.f152725e : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutUtil", "getSecondCutEditIntent >>>videoPath: " + str + " >>>width: " + i19 + " >>>height: " + i27 + " >>>duration: " + Ni + " >>> videoBitrate: " + i18);
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 10);
        android.content.Intent intent = new android.content.Intent();
        intent.setData(android.net.Uri.parse("miaojian://createvideo?scene=moments&assetPaths=" + encodeToString + "&maxDuration=" + Ni + "&bitrate=" + i18 + "&resolution=" + i19 + ',' + i27 + "&from=2"));
        intent.setPackage("com.tencent.phoenix");
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        dw3.u0 u0Var = dw3.u0.f325816a;
        android.content.Context context2 = lVar.f95644d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        u0Var.h(context2, intent);
        android.content.Intent intent2 = new android.content.Intent();
        android.content.Context context3 = lVar.f95644d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context3).setResult(-2, intent2);
        android.content.Context context4 = lVar.f95644d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context4, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context4).finish();
    }
}
