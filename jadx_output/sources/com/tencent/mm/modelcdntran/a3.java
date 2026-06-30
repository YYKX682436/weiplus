package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.g f70875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f70876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f70877g;

    public a3(com.tencent.mm.modelcdntran.l3 l3Var, java.lang.String str, dn.g gVar, dn.h hVar) {
        this.f70877g = l3Var;
        this.f70874d = str;
        this.f70875e = gVar;
        this.f70876f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.l3 l3Var = this.f70877g;
        java.util.HashMap hashMap = (java.util.HashMap) l3Var.f71063f;
        java.lang.String str = this.f70874d;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar == null) {
            if (str.contains("AdLandingGeneralVideo_")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, 11);
                com.tencent.mars.xlog.Log.e("MicroMsg.OnlineVideoService", "download adLandingGeneralVideo task callback but task is null, %s, %s", str, java.lang.Integer.valueOf(l3Var.hashCode()));
                return;
            }
            return;
        }
        dn.n nVar = oVar.f241815c2;
        dn.g gVar = this.f70875e;
        dn.h hVar = this.f70876f;
        if (nVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "cdn callback %s route to videoCallback", str);
            if (gVar != null) {
                oVar.f241815c2.f(this.f70874d, gVar.field_finishedLength, gVar.field_toltalLength);
                return;
            }
            if (hVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "cdn callback %s route to videoCallback, sceneResult.retCode:%s", str, java.lang.Integer.valueOf(hVar.field_retCode));
                oVar.f241815c2.g(str, hVar.field_retCode, hVar);
                ((java.util.HashMap) l3Var.f71063f).remove(str);
                if (hVar.field_retCode == 0) {
                    ((java.util.HashMap) l3Var.f71064g).put(oVar.field_mediaId, oVar);
                    ((java.util.HashMap) l3Var.f71065h).put(oVar.field_mediaId, hVar);
                    return;
                }
                return;
            }
            return;
        }
        t21.v2 i17 = t21.d3.i(oVar.E1, oVar.f241814b2, oVar.X1);
        if (i17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "stream download video callback, but video info is null.[%s]", oVar.E1);
            return;
        }
        dn.k kVar = oVar.f241787f;
        if (kVar != null) {
            kVar.r4(this.f70874d, 0, this.f70875e, this.f70876f, oVar.field_onlycheckexist);
            if (hVar != null) {
                ((java.util.HashMap) l3Var.f71063f).remove(str);
                return;
            }
            return;
        }
        if (gVar != null) {
            if (gVar.field_finishedLength == i17.f415008f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "stream download finish.");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "callback progress info " + gVar.field_finishedLength);
            i17.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
            i17.f415007e = (int) gVar.field_finishedLength;
            i17.U = 1040;
            t21.d3.Q(i17);
            com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent = new com.tencent.mm.autogen.events.OnlineVideoEvent();
            am.hn hnVar = onlineVideoEvent.f54588g;
            hnVar.f6844a = 5;
            hnVar.f6846c = str;
            hnVar.f6847d = (int) gVar.field_finishedLength;
            hnVar.f6848e = (int) gVar.field_toltalLength;
            onlineVideoEvent.e();
            return;
        }
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OnlineVideoService", "callback result info " + hVar.field_retCode + ", filesize:" + hVar.field_fileLength + ",recved:" + hVar.field_recvedBytes);
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                if (i18 != -10012) {
                    t21.d3.G(i17.d());
                }
                boolean h17 = oVar.h();
                int i19 = hVar.field_retCode;
                int i27 = oVar.H1;
                l3Var.getClass();
                if (h17) {
                    if (i27 == 1) {
                        if (i19 == -5103059) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 111L, 1L, false);
                        } else if (i19 == -5103087) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 112L, 1L, false);
                        } else if (i19 == -10012) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 113L, 1L, false);
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 114L, 1L, false);
                        }
                    } else if (i19 == -5103059) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 116L, 1L, false);
                    } else if (i19 == -5103087) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 117L, 1L, false);
                    } else if (i19 == -10012) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 118L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 119L, 1L, false);
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13836, 101, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), java.lang.Integer.valueOf(i19));
                } else {
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.idkeyStat(354L, 213L, 1L, false);
                    if (i27 == 1) {
                        g0Var.idkeyStat(354L, 214L, 1L, false);
                    } else {
                        g0Var.idkeyStat(354L, 215L, 1L, false);
                    }
                    g0Var.d(13836, 201, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), java.lang.Integer.valueOf(i19));
                }
            } else {
                l3Var.l(i17, (int) hVar.field_fileLength, oVar.F1, oVar);
                ((java.util.HashMap) l3Var.f71064g).put(oVar.field_mediaId, oVar);
                ((java.util.HashMap) l3Var.f71065h).put(oVar.field_mediaId, hVar);
            }
            com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent2 = new com.tencent.mm.autogen.events.OnlineVideoEvent();
            am.hn hnVar2 = onlineVideoEvent2.f54588g;
            hnVar2.f6844a = 4;
            hnVar2.f6846c = str;
            hnVar2.f6847d = 0;
            hnVar2.f6845b = hVar.field_retCode;
            hnVar2.f6848e = (int) hVar.field_fileLength;
            onlineVideoEvent2.e();
            ((java.util.HashMap) l3Var.f71063f).remove(str);
        }
    }
}
