package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class w extends com.tencent.mm.plugin.appbrand.video.player.thumb.l {
    public final java.lang.String M;
    public boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context) {
        super(context, null, false, false, false, 30, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.M = "MicroMsg.WebViewThumbMediaPlayer";
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l
    public void R(com.tencent.thumbplayer.api.ITPPlayer player, int i17, long j17, long j18, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(player, "player");
        java.util.Objects.toString(obj);
        java.lang.String str = this.M;
        try {
            if (i17 == 252) {
                com.tencent.mars.xlog.Log.i(str, "TP_PLAYER_INFO_LONG1_ADAPTIVE_SWITCH_DEF_END：arg1: " + j17 + ", arg2: " + j18 + ", extraObject: " + obj);
                F(java.lang.String.valueOf(j17));
            } else {
                if (i17 != 1006 || obj == null) {
                    return;
                }
                if (obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) {
                    X(((com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
        }
    }

    public final void X(java.lang.String str) {
        try {
            if (this.N) {
                this.N = false;
                if (str == null) {
                    return;
                }
                java.lang.Object opt = new org.json.JSONObject(str).opt("hitDownloaded");
                if (opt != null && (opt instanceof java.lang.Integer)) {
                    if (kotlin.jvm.internal.o.b(opt, 1)) {
                        H(true);
                    } else {
                        H(false);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.M, e17, "", new java.lang.Object[0]);
        }
    }

    public final void Y(java.lang.String str, java.lang.String str2, int i17) {
        int i18 = i17 == 1 ? 1 : 0;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "setDataSource, player is not available");
            return;
        }
        try {
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a.a(str);
            com.tencent.mars.xlog.Log.i(this.M, "setDataSource, path: " + str + ", fileId:" + a17 + ", videoType:" + i17);
            this.N = true;
            iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(102, 1000L).buildLong(504, 1L));
            com.tencent.thumbplayer.api.TPVideoInfo.Builder fileId = new com.tencent.thumbplayer.api.TPVideoInfo.Builder().fileId(a17);
            com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(i18);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!(str2 == null || str2.length() == 0)) {
                hashMap.put("Referrer", str2);
            }
            tPDownloadParamData.setHeadersList(kz5.b0.c(hashMap));
            iTPPlayer.setVideoInfo(fileId.downloadParam(tPDownloadParamData).build());
            iTPPlayer.setDataSource(str);
            this.f461162a = 1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "setDataSource, fail since " + e17);
            O(e17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l, ye1.e
    public void m(java.lang.String path, java.lang.String str) {
        kotlin.jvm.internal.o.g(path, "path");
        Y(path, str, 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l, ye1.e
    public void y(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        Y(str, null, i17);
    }
}
