package au3;

/* loaded from: classes10.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f14097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14098e;

    public d(au3.l lVar, boolean z17) {
        this.f14097d = lVar;
        this.f14098e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        au3.l lVar = this.f14097d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = lVar.f14122r;
        if (j0Var != null) {
            kotlin.jvm.internal.o.e(j0Var, "null cannot be cast to non-null type android.app.Dialog");
            if (j0Var.isShowing()) {
                com.tencent.mm.ui.widget.dialog.j0 j0Var2 = lVar.f14122r;
                if (j0Var2 != null) {
                    j0Var2.dismiss();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", "click ok dismiss dialog");
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialog ok isInstall:");
        boolean z17 = this.f14098e;
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
        if (!z17) {
            android.content.Context context = lVar.f14111d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
            kotlin.jvm.internal.o.d(Zi);
            java.lang.String downloadUrl = Zi.concat("1102");
            kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f276157b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
            return;
        }
        kotlin.jvm.internal.o.d(str);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_phoneix_video_duration, 30);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Ni);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = lVar.f14120p;
        kotlin.jvm.internal.o.d(recordConfigProvider);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = recordConfigProvider.f155676n;
        int i18 = videoTransPara != null ? videoTransPara.f71194g : 0;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = lVar.f14120p;
        kotlin.jvm.internal.o.d(recordConfigProvider2);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = recordConfigProvider2.f155676n;
        int i19 = videoTransPara2 != null ? videoTransPara2.f71191d : 0;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = lVar.f14120p;
        kotlin.jvm.internal.o.d(recordConfigProvider3);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara3 = recordConfigProvider3.f155676n;
        int i27 = videoTransPara3 != null ? videoTransPara3.f71192e : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutUtil", "getSecondCutEditIntent >>>videoPath: " + str + " >>>width: " + i19 + " >>>height: " + i27 + " >>>duration: " + Ni + " >>> videoBitrate: " + i18);
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 10);
        android.content.Intent intent = new android.content.Intent();
        intent.setData(android.net.Uri.parse("miaojian://createvideo?scene=moments&assetPaths=" + encodeToString + "&maxDuration=" + Ni + "&bitrate=" + i18 + "&resolution=" + i19 + ',' + i27 + "&from=2"));
        intent.setPackage("com.tencent.phoenix");
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        dw3.u0 u0Var = dw3.u0.f244283a;
        android.content.Context context2 = lVar.f14111d.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        u0Var.h(context2, intent);
        android.content.Intent intent2 = new android.content.Intent();
        android.content.Context context3 = lVar.f14111d.getContext();
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context3).setResult(-2, intent2);
        android.content.Context context4 = lVar.f14111d.getContext();
        kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context4).finish();
    }
}
