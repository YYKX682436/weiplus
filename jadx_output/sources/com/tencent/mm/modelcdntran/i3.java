package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.j3 f71008d;

    public i3(com.tencent.mm.modelcdntran.j3 j3Var) {
        this.f71008d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.j3 j3Var = this.f71008d;
        dn.o oVar = (dn.o) ((java.util.HashMap) j3Var.f71024h.f71063f).get(j3Var.f71020d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("info=");
        sb6.append(oVar);
        sb6.append(" mediaId=");
        sb6.append(j3Var.f71020d);
        sb6.append(" info.videoCallback=");
        sb6.append(oVar != null && oVar.f241815c2 == null);
        com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", sb6.toString());
        if (oVar == null) {
            if (j3Var.f71020d.contains("AdLandingGeneralVideo_")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, 12);
                com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "download adLandingGeneralVideo task onMoovReady but task is null, %s, %s", j3Var.f71020d, java.lang.Integer.valueOf(j3Var.f71024h.hashCode()));
                return;
            }
            return;
        }
        int i17 = j3Var.f71022f;
        oVar.W1 = i17;
        dn.n nVar = oVar.f241815c2;
        if (nVar != null) {
            nVar.onMoovReady(j3Var.f71020d, i17, j3Var.f71023g, j3Var.f71021e);
            return;
        }
        if (t21.u2.c(oVar.field_fullpath)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "it is qt video, need finish all file. isPlayMode" + oVar.H1);
            if (oVar.H1 == 1) {
                j3Var.f71024h.p(oVar.field_mediaId, 0, (int) oVar.field_totalLen, 0);
                j3Var.f71024h.getClass();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 19L, 1L, false);
                return;
            }
            return;
        }
        com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent = new com.tencent.mm.autogen.events.OnlineVideoEvent();
        am.hn hnVar = onlineVideoEvent.f54588g;
        hnVar.f6844a = 1;
        hnVar.f6845b = 0;
        hnVar.f6846c = j3Var.f71020d;
        hnVar.f6847d = j3Var.f71022f;
        hnVar.f6848e = j3Var.f71023g;
        hnVar.f6849f = oVar.D1;
        hnVar.f6850g = oVar.f241803v > 0;
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = j3Var.f71021e;
        hnVar.f6851h = videoInfo.svrFlag;
        hnVar.f6853j = videoInfo.oriVideoFormat;
        hnVar.f6852i = videoInfo.videoFormat;
        hnVar.f6854k = videoInfo.requestFlag;
        hnVar.f6855l = videoInfo.videoPath;
        onlineVideoEvent.e();
        t21.v2 i18 = t21.d3.i(oVar.E1, oVar.f241814b2, oVar.X1);
        if (i18 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "on moov ready info: " + i18.d() + " status : " + i18.f415011i + " reqFlag:" + j3Var.f71021e.requestFlag + " svrFlag:" + j3Var.f71021e.svrFlag + " path:" + j3Var.f71021e.videoPath + ", mediaId=" + i18.O);
            com.tencent.mm.modelcdntran.l3 l3Var = j3Var.f71024h;
            java.lang.String str = j3Var.f71021e.svrFlag;
            byte[] bArr = oVar.P;
            l3Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec >> svrFlag: %s", str);
            if (!android.text.TextUtils.isEmpty(str)) {
                if (bArr == null || bArr.length == 0) {
                    str = l3Var.n(str);
                } else {
                    try {
                        r45.t76 t76Var = (r45.t76) new r45.t76().parseFrom(bArr);
                        if (!android.text.TextUtils.isEmpty(t76Var.f386202d)) {
                            java.util.LinkedList linkedList = ((r45.gb6) new r45.gb6().parseFrom(n51.d.a(t76Var.f386202d, 2))).f375075e;
                            if (linkedList != null) {
                                java.util.Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    r45.rc6 rc6Var = (r45.rc6) it.next();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec >> spec origin: %s target: %s", rc6Var.f384731d, rc6Var.f384732e);
                                    if (("x" + rc6Var.f384732e).equals(str)) {
                                        java.lang.String str2 = "x" + rc6Var.f384731d;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec to mapping >> svrFlag: %s result: %s", str, str2);
                                        str = str2;
                                        break;
                                    }
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec >> svrFlag: %s no had mapping", str);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "getSvrFlagMappingMultiSpec >> error %s", e17.getMessage());
                        str = l3Var.n(str);
                    }
                }
            }
            i18.B = str;
            i18.C = j3Var.f71021e.videoPath;
            i18.D = oVar.field_mediaId;
            t21.d3.Q(i18);
            int i19 = i18.f415011i;
            if (i19 == 130 || i19 == 122) {
                return;
            }
            t21.v2 h17 = t21.d3.h(oVar.E1);
            if (h17 != null) {
                h17.f415011i = 121;
                h17.U = 256;
                t21.o2.Ui().C(h17);
            }
            if (oVar.H1 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "stop download video");
                t21.o2.Zi().i();
                t21.o2.Zi().k();
            }
        }
    }
}
