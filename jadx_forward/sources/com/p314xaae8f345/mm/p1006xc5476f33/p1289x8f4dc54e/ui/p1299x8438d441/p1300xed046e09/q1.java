package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class q1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f175942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f175943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f175944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f175945g;

    public q1(long j17, long j18, yz5.l lVar, java.util.ArrayList arrayList) {
        this.f175942d = j17;
        this.f175943e = j18;
        this.f175944f = lVar;
        this.f175945g = arrayList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f152244b.f152233a) != null && (fVar instanceof r45.cf)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BatchGetAppMsgResp");
            r45.cf cfVar = (r45.cf) fVar;
            bundle.putBoolean(ya.b.f77504xbb80cbe3, true);
            bundle.putByteArray("response", cfVar.mo14344x5f01b1f6());
            java.util.LinkedList SceneControlList = cfVar.f453049e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SceneControlList, "SceneControlList");
            if (!SceneControlList.isEmpty()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g();
                r45.hv5 hv5Var = new r45.hv5();
                hv5Var.f458006d = SceneControlList;
                g17.H("_msg_scene_strip", hv5Var.mo14344x5f01b1f6());
            }
        } else {
            bundle.putBoolean(ya.b.f77504xbb80cbe3, false);
        }
        long j17 = this.f175942d;
        bundle.putLong("start", j17);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        bundle.putLong("end", currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "terry performance runCGI #" + this.f175943e + ": " + j17 + ',' + currentTimeMillis);
        this.f175944f.mo146xb9724478(bundle);
        bundle.putBoolean("mount", true);
        java.util.ArrayList<java.lang.String> arrayList = this.f175945g;
        if (arrayList != null) {
            for (java.lang.String str2 : arrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d(str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                java.util.concurrent.ConcurrentLinkedDeque<yz5.l> concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) t1Var2.i().get(d17);
                t1Var2.i().remove(d17);
                if (concurrentLinkedDeque != null) {
                    for (yz5.l lVar : concurrentLinkedDeque) {
                        bundle.putString(dm.i4.f66865x76d1ec5a, d17);
                        lVar.mo146xb9724478(bundle);
                    }
                }
            }
        }
        return 0;
    }
}
