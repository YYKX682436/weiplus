package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req f93813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f93814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity f93815f;

    public w0(com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity, com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req, java.lang.String str) {
        this.f93815f = wXEntryActivity;
        this.f93813d = req;
        this.f93814e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.qa qaVar;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject;
        boolean z17;
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = this.f93813d;
        com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity = this.f93815f;
        try {
            if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Bi(req.message)) {
                android.os.Bundle bundle = new android.os.Bundle();
                req.toBundle(bundle);
                wXEntryActivity.getIntent().putExtras(bundle);
            }
            java.lang.String d17 = com.tencent.mm.pluginsdk.model.app.j1.d(wXEntryActivity, wXEntryActivity.f93687e);
            com.tencent.mm.pluginsdk.model.app.g5 g5Var = wXEntryActivity.f93692m;
            if (d17 != null) {
                g5Var.f188913a = com.tencent.mm.pluginsdk.model.app.f5.SUCCESS;
            } else {
                com.tencent.mm.pluginsdk.model.app.i5 i5Var = wXEntryActivity.f93689g;
                if (i5Var == null || i5Var.f188936c != null) {
                    g5Var.f188913a = com.tencent.mm.pluginsdk.model.app.f5.SUCCESS_BY_TOKEN;
                } else {
                    g5Var.f188913a = com.tencent.mm.pluginsdk.model.app.f5.NO_TOKEN_SIGNATURE;
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wxMsg = wXEntryActivity.f93700u;
            int i17 = req.scene;
            java.lang.String str = wXEntryActivity.f93686d;
            kotlin.jvm.internal.o.g(wxMsg, "wxMsg");
            if (i17 == 0 && (((z17 = (iMediaObject = wxMsg.mediaObject) instanceof com.tencent.mm.opensdk.modelmsg.WXTextObject)) || (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXImageObject) || (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXVideoObject) || (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXWebpageObject) || (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) || (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject))) {
                java.lang.String str2 = wxMsg.msgSignature;
                if (!(str2 == null || r26.n0.N(str2))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgSignatureHelper", "getAppMsgSignature3rd type " + wxMsg.getType() + ", msgSignature = " + wxMsg.msgSignature);
                    r45.qa qaVar2 = new r45.qa();
                    qaVar2.f383790f = wxMsg.msgSignature;
                    java.util.LinkedList linkedList2 = qaVar2.f383789e;
                    r45.z56 z56Var = new r45.z56();
                    z56Var.f391737d = "appid";
                    z56Var.f391738e = str;
                    linkedList2.add(z56Var);
                    if (z17) {
                        qaVar2.f383788d = 1;
                        java.util.LinkedList linkedList3 = qaVar2.f383789e;
                        r45.z56 z56Var2 = new r45.z56();
                        z56Var2.f391737d = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT;
                        z56Var2.f391738e = ((com.tencent.mm.opensdk.modelmsg.WXTextObject) iMediaObject).text;
                        linkedList3.add(z56Var2);
                    } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXImageObject) {
                        qaVar2.f383788d = 2;
                        java.util.LinkedList linkedList4 = qaVar2.f383789e;
                        r45.z56 z56Var3 = new r45.z56();
                        z56Var3.f391737d = "imgDataHash";
                        z56Var3.f391738e = ((com.tencent.mm.opensdk.modelmsg.WXImageObject) iMediaObject).imgDataHash;
                        linkedList4.add(z56Var3);
                    } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXVideoObject) {
                        qaVar2.f383788d = 4;
                        java.util.LinkedList linkedList5 = qaVar2.f383789e;
                        r45.z56 z56Var4 = new r45.z56();
                        z56Var4.f391737d = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                        z56Var4.f391738e = wxMsg.title;
                        linkedList5.add(z56Var4);
                        java.util.LinkedList linkedList6 = qaVar2.f383789e;
                        r45.z56 z56Var5 = new r45.z56();
                        z56Var5.f391737d = "description";
                        z56Var5.f391738e = wxMsg.description;
                        linkedList6.add(z56Var5);
                        java.util.LinkedList linkedList7 = qaVar2.f383789e;
                        r45.z56 z56Var6 = new r45.z56();
                        z56Var6.f391737d = "thumbDataHash";
                        z56Var6.f391738e = wxMsg.thumbDataHash;
                        linkedList7.add(z56Var6);
                        java.util.LinkedList linkedList8 = qaVar2.f383789e;
                        r45.z56 z56Var7 = new r45.z56();
                        z56Var7.f391737d = "videoUrl";
                        com.tencent.mm.opensdk.modelmsg.WXVideoObject wXVideoObject = (com.tencent.mm.opensdk.modelmsg.WXVideoObject) iMediaObject;
                        z56Var7.f391738e = wXVideoObject.videoUrl;
                        linkedList8.add(z56Var7);
                        java.util.LinkedList linkedList9 = qaVar2.f383789e;
                        r45.z56 z56Var8 = new r45.z56();
                        z56Var8.f391737d = "videoLowBandUrl";
                        z56Var8.f391738e = wXVideoObject.videoLowBandUrl;
                        linkedList9.add(z56Var8);
                    } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXWebpageObject) {
                        qaVar2.f383788d = 5;
                        java.util.LinkedList linkedList10 = qaVar2.f383789e;
                        r45.z56 z56Var9 = new r45.z56();
                        z56Var9.f391737d = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                        z56Var9.f391738e = wxMsg.title;
                        linkedList10.add(z56Var9);
                        java.util.LinkedList linkedList11 = qaVar2.f383789e;
                        r45.z56 z56Var10 = new r45.z56();
                        z56Var10.f391737d = "description";
                        z56Var10.f391738e = wxMsg.description;
                        linkedList11.add(z56Var10);
                        java.util.LinkedList linkedList12 = qaVar2.f383789e;
                        r45.z56 z56Var11 = new r45.z56();
                        z56Var11.f391737d = "thumbDataHash";
                        z56Var11.f391738e = wxMsg.thumbDataHash;
                        linkedList12.add(z56Var11);
                        java.util.LinkedList linkedList13 = qaVar2.f383789e;
                        r45.z56 z56Var12 = new r45.z56();
                        z56Var12.f391737d = "webpageUrl";
                        z56Var12.f391738e = ((com.tencent.mm.opensdk.modelmsg.WXWebpageObject) iMediaObject).webpageUrl;
                        linkedList13.add(z56Var12);
                    } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) {
                        qaVar2.f383788d = 6;
                        java.util.LinkedList linkedList14 = qaVar2.f383789e;
                        r45.z56 z56Var13 = new r45.z56();
                        z56Var13.f391737d = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                        z56Var13.f391738e = wxMsg.title;
                        linkedList14.add(z56Var13);
                        java.util.LinkedList linkedList15 = qaVar2.f383789e;
                        r45.z56 z56Var14 = new r45.z56();
                        z56Var14.f391737d = "description";
                        z56Var14.f391738e = wxMsg.description;
                        linkedList15.add(z56Var14);
                        java.util.LinkedList linkedList16 = qaVar2.f383789e;
                        r45.z56 z56Var15 = new r45.z56();
                        z56Var15.f391737d = "thumbDataHash";
                        z56Var15.f391738e = wxMsg.thumbDataHash;
                        linkedList16.add(z56Var15);
                        java.util.LinkedList linkedList17 = qaVar2.f383789e;
                        r45.z56 z56Var16 = new r45.z56();
                        z56Var16.f391737d = "userName";
                        com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject = (com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) iMediaObject;
                        z56Var16.f391738e = wXMiniProgramObject.userName;
                        linkedList17.add(z56Var16);
                        java.util.LinkedList linkedList18 = qaVar2.f383789e;
                        r45.z56 z56Var17 = new r45.z56();
                        z56Var17.f391737d = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
                        z56Var17.f391738e = wXMiniProgramObject.path;
                        linkedList18.add(z56Var17);
                    } else if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) {
                        qaVar2.f383788d = 7;
                        java.util.LinkedList linkedList19 = qaVar2.f383789e;
                        r45.z56 z56Var18 = new r45.z56();
                        z56Var18.f391737d = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                        z56Var18.f391738e = wxMsg.title;
                        linkedList19.add(z56Var18);
                        java.util.LinkedList linkedList20 = qaVar2.f383789e;
                        r45.z56 z56Var19 = new r45.z56();
                        z56Var19.f391737d = "description";
                        z56Var19.f391738e = wxMsg.description;
                        linkedList20.add(z56Var19);
                        java.util.LinkedList linkedList21 = qaVar2.f383789e;
                        r45.z56 z56Var20 = new r45.z56();
                        z56Var20.f391737d = "thumbDataHash";
                        z56Var20.f391738e = wxMsg.thumbDataHash;
                        linkedList21.add(z56Var20);
                        java.util.LinkedList linkedList22 = qaVar2.f383789e;
                        r45.z56 z56Var21 = new r45.z56();
                        z56Var21.f391737d = "musicUrl";
                        com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) iMediaObject;
                        z56Var21.f391738e = wXMusicVideoObject.musicUrl;
                        linkedList22.add(z56Var21);
                        java.util.LinkedList linkedList23 = qaVar2.f383789e;
                        r45.z56 z56Var22 = new r45.z56();
                        z56Var22.f391737d = "musicDataUrl";
                        z56Var22.f391738e = wXMusicVideoObject.musicDataUrl;
                        linkedList23.add(z56Var22);
                        java.util.LinkedList linkedList24 = qaVar2.f383789e;
                        r45.z56 z56Var23 = new r45.z56();
                        z56Var23.f391737d = "singerName";
                        z56Var23.f391738e = wXMusicVideoObject.singerName;
                        linkedList24.add(z56Var23);
                        java.util.LinkedList linkedList25 = qaVar2.f383789e;
                        r45.z56 z56Var24 = new r45.z56();
                        z56Var24.f391737d = "duration";
                        z56Var24.f391738e = java.lang.String.valueOf(wXMusicVideoObject.duration);
                        linkedList25.add(z56Var24);
                        java.util.LinkedList linkedList26 = qaVar2.f383789e;
                        r45.z56 z56Var25 = new r45.z56();
                        z56Var25.f391737d = "hdAlbumThumbFileHash";
                        z56Var25.f391738e = wXMusicVideoObject.hdAlbumThumbFileHash;
                        linkedList26.add(z56Var25);
                        java.util.LinkedList linkedList27 = qaVar2.f383789e;
                        r45.z56 z56Var26 = new r45.z56();
                        z56Var26.f391737d = "albumName";
                        z56Var26.f391738e = wXMusicVideoObject.albumName;
                        linkedList27.add(z56Var26);
                        java.util.LinkedList linkedList28 = qaVar2.f383789e;
                        r45.z56 z56Var27 = new r45.z56();
                        z56Var27.f391737d = "musicGenre";
                        z56Var27.f391738e = wXMusicVideoObject.musicGenre;
                        linkedList28.add(z56Var27);
                        java.util.LinkedList linkedList29 = qaVar2.f383789e;
                        r45.z56 z56Var28 = new r45.z56();
                        z56Var28.f391737d = "issueDate";
                        z56Var28.f391738e = java.lang.String.valueOf(wXMusicVideoObject.issueDate);
                        linkedList29.add(z56Var28);
                        java.util.LinkedList linkedList30 = qaVar2.f383789e;
                        r45.z56 z56Var29 = new r45.z56();
                        z56Var29.f391737d = "identification";
                        z56Var29.f391738e = wXMusicVideoObject.identification;
                        linkedList30.add(z56Var29);
                    }
                    qaVar = qaVar2;
                    com.tencent.mm.modelsimple.h1 h1Var = new com.tencent.mm.modelsimple.h1(this.f93814e, 1, linkedList, wXEntryActivity.f93688f, java.lang.String.valueOf(wXEntryActivity.f93694o), g5Var.f188913a.f188899d, qaVar);
                    com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                    r1Var.a(1200, new com.tencent.mm.plugin.base.stub.t0(h1Var, r1Var, wXEntryActivity));
                    r1Var.g(h1Var);
                }
            }
            qaVar = null;
            com.tencent.mm.modelsimple.h1 h1Var2 = new com.tencent.mm.modelsimple.h1(this.f93814e, 1, linkedList, wXEntryActivity.f93688f, java.lang.String.valueOf(wXEntryActivity.f93694o), g5Var.f188913a.f188899d, qaVar);
            com.tencent.mm.modelbase.r1 r1Var2 = gm0.j1.n().f273288b;
            r1Var2.a(1200, new com.tencent.mm.plugin.base.stub.t0(h1Var2, r1Var2, wXEntryActivity));
            r1Var2.g(h1Var2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXEntryActivity", "copyFileIfNeed e = %s", e17.getMessage());
            int i18 = com.tencent.mm.plugin.base.stub.WXEntryActivity.f93685y;
            com.tencent.mm.pluginsdk.model.app.m5.c(wXEntryActivity, com.tencent.mm.pluginsdk.model.app.m5.a(com.tencent.mm.sdk.platformtools.c2.e(wXEntryActivity.getIntent()), -1), true, false);
            wXEntryActivity.finish();
        }
    }
}
