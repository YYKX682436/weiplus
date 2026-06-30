package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class q1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f94410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f94411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f94412g;

    public q1(long j17, long j18, yz5.l lVar, java.util.ArrayList arrayList) {
        this.f94409d = j17;
        this.f94410e = j18;
        this.f94411f = lVar;
        this.f94412g = arrayList;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadLogic", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.cf)) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BatchGetAppMsgResp");
            r45.cf cfVar = (r45.cf) fVar;
            bundle.putBoolean(ya.b.SUCCESS, true);
            bundle.putByteArray("response", cfVar.toByteArray());
            java.util.LinkedList SceneControlList = cfVar.f371516e;
            kotlin.jvm.internal.o.f(SceneControlList, "SceneControlList");
            if (!SceneControlList.isEmpty()) {
                com.tencent.mm.sdk.platformtools.o4 g17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g();
                r45.hv5 hv5Var = new r45.hv5();
                hv5Var.f376473d = SceneControlList;
                g17.H("_msg_scene_strip", hv5Var.toByteArray());
            }
        } else {
            bundle.putBoolean(ya.b.SUCCESS, false);
        }
        long j17 = this.f94409d;
        bundle.putLong("start", j17);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        bundle.putLong("end", currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadLogic", "terry performance runCGI #" + this.f94410e + ": " + j17 + ',' + currentTimeMillis);
        this.f94411f.invoke(bundle);
        bundle.putBoolean("mount", true);
        java.util.ArrayList<java.lang.String> arrayList = this.f94412g;
        if (arrayList != null) {
            for (java.lang.String str2 : arrayList) {
                kotlin.jvm.internal.o.d(str2);
                java.lang.String d17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.d(str2);
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
                java.util.concurrent.ConcurrentLinkedDeque<yz5.l> concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) t1Var2.i().get(d17);
                t1Var2.i().remove(d17);
                if (concurrentLinkedDeque != null) {
                    for (yz5.l lVar : concurrentLinkedDeque) {
                        bundle.putString(dm.i4.COL_ID, d17);
                        lVar.invoke(bundle);
                    }
                }
            }
        }
        return 0;
    }
}
