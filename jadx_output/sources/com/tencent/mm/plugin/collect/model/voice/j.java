package com.tencent.mm.plugin.collect.model.voice;

/* loaded from: classes15.dex */
public class j implements com.tencent.mm.plugin.collect.model.voice.q {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.collect.model.voice.l f96175a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f96176b = new java.util.concurrent.ConcurrentLinkedQueue();

    public j(com.tencent.mm.plugin.collect.model.voice.m mVar, com.tencent.mm.plugin.collect.model.voice.l lVar) {
        this.f96175a = lVar;
    }

    public void a(final int i17, final byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.collect.model.voice.l lVar = this.f96175a;
        objArr[1] = java.lang.Boolean.valueOf(lVar == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceOffLineLogic.Listener", "onGetResult() errorCode:%s (voiceLlistener == null):%s", objArr);
        if (lVar != null) {
            com.tencent.mm.plugin.collect.model.voice.i iVar = (com.tencent.mm.plugin.collect.model.voice.i) this.f96176b.poll();
            final java.lang.String str = iVar.f96172b;
            final java.lang.String str2 = iVar.f96173c;
            final java.lang.String str3 = iVar.f96174d;
            final int i18 = iVar.f96171a;
            final java.lang.String e17 = com.tencent.mm.plugin.collect.model.voice.m.d().e();
            final int i19 = 0;
            ((com.tencent.mm.plugin.collect.model.voice.e) lVar).getClass();
            fs.g.b(com.tencent.mm.plugin.collect.model.voice.k.class, new fs.o() { // from class: com.tencent.mm.plugin.collect.model.voice.e$$a
                @Override // fs.o
                public final boolean a(fs.n nVar) {
                    java.lang.String str4 = str;
                    java.lang.String str5 = str2;
                    java.lang.String str6 = str3;
                    int i27 = i18;
                    java.lang.String str7 = e17;
                    byte[] bArr2 = bArr;
                    int i28 = i19;
                    ww1.l1 l1Var = (ww1.l1) ((com.tencent.mm.plugin.collect.model.voice.k) nVar);
                    l1Var.getClass();
                    int i29 = i17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "errorCode:%s outTradeNo:%s type:%s content:%s packId:%s overtimeFlag:%s", java.lang.Integer.valueOf(i29), str4, str5, str6, str7, java.lang.Integer.valueOf(i28));
                    int l17 = l1Var.l(str5);
                    com.tencent.mm.autogen.events.CollectRcvVoiceEvent collectRcvVoiceEvent = (com.tencent.mm.autogen.events.CollectRcvVoiceEvent) ((java.util.HashMap) l1Var.f450242p).remove(str4);
                    if (i29 >= 0) {
                        l1Var.s(l17, bArr2, 1, str4, i28, true);
                        l1Var.r(5, str4, l17, str6, i27, str7, 0, l1Var.m(collectRcvVoiceEvent));
                        return false;
                    }
                    if (collectRcvVoiceEvent == null) {
                        l1Var.q(l17, str4);
                    } else if (collectRcvVoiceEvent.f54069g.f6816i) {
                        l1Var.h(collectRcvVoiceEvent, false, true);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "onGetResult() needFailover:false");
                    }
                    l1Var.r(6, str4, l17, str6, i27, str7, 9, l1Var.m(collectRcvVoiceEvent));
                    return false;
                }
            });
            if (i17 < 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1143L, 20L, 1L, false);
            }
        }
    }
}
