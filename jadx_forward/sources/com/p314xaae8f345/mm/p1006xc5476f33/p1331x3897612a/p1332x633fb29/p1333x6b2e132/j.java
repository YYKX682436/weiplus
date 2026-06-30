package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132;

/* loaded from: classes15.dex */
public class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.q {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.l f177708a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f177709b = new java.util.concurrent.ConcurrentLinkedQueue();

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.l lVar) {
        this.f177708a = lVar;
    }

    public void a(final int i17, final byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.l lVar = this.f177708a;
        objArr[1] = java.lang.Boolean.valueOf(lVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceOffLineLogic.Listener", "onGetResult() errorCode:%s (voiceLlistener == null):%s", objArr);
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.i) this.f177709b.poll();
            final java.lang.String str = iVar.f177705b;
            final java.lang.String str2 = iVar.f177706c;
            final java.lang.String str3 = iVar.f177707d;
            final int i18 = iVar.f177704a;
            final java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().e();
            final int i19 = 0;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.e) lVar).getClass();
            fs.g.b(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.k.class, new fs.o() { // from class: com.tencent.mm.plugin.collect.model.voice.e$$a
                @Override // fs.o
                public final boolean a(fs.n nVar) {
                    java.lang.String str4 = str;
                    java.lang.String str5 = str2;
                    java.lang.String str6 = str3;
                    int i27 = i18;
                    java.lang.String str7 = e17;
                    byte[] bArr2 = bArr;
                    int i28 = i19;
                    ww1.l1 l1Var = (ww1.l1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.k) nVar);
                    l1Var.getClass();
                    int i29 = i17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "errorCode:%s outTradeNo:%s type:%s content:%s packId:%s overtimeFlag:%s", java.lang.Integer.valueOf(i29), str4, str5, str6, str7, java.lang.Integer.valueOf(i28));
                    int l17 = l1Var.l(str5);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3 c5279xf48561e3 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3) ((java.util.HashMap) l1Var.f531775p).remove(str4);
                    if (i29 >= 0) {
                        l1Var.s(l17, bArr2, 1, str4, i28, true);
                        l1Var.r(5, str4, l17, str6, i27, str7, 0, l1Var.m(c5279xf48561e3));
                        return false;
                    }
                    if (c5279xf48561e3 == null) {
                        l1Var.q(l17, str4);
                    } else if (c5279xf48561e3.f135602g.f88349i) {
                        l1Var.h(c5279xf48561e3, false, true);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "onGetResult() needFailover:false");
                    }
                    l1Var.r(6, str4, l17, str6, i27, str7, 9, l1Var.m(c5279xf48561e3));
                    return false;
                }
            });
            if (i17 < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1143L, 20L, 1L, false);
            }
        }
    }
}
