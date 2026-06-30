package com.tencent.mm.matrix.monitor;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/matrix/monitor/a;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.monitor.AppBackgroundMemory", "IPC get extra msg");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("GetLeakedActivities", (java.util.HashMap) com.tencent.matrix.lifecycle.owners.f0.f52742x.f());
        bundle.putInt("TPCount", com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker.getTrackingMap().size());
        bundle.putInt("FlutterEngineCount", ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ri());
        bundle.putString("FlutterEngineBizNames", r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ni().toString(), "[", "", false, 4, null), "]", "", false), ",", "|", false), " ", "", false));
        bundle.putString("MBBizList", com.tencent.mm.plugin.magicbrush.a5.f147836a.b());
        bundle.putInt("LiteAppEngineCount", ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).yj());
        bundle.putString("LiteAppIDs", r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).xj().toString(), "[", "", false, 4, null), "]", "", false), ",", "|", false), " ", "", false));
        android.util.Pair d17 = pb0.g.d();
        java.lang.Object first = d17.first;
        kotlin.jvm.internal.o.f(first, "first");
        bundle.putInt("BitmapCount", ((java.lang.Number) first).intValue());
        java.lang.Object second = d17.second;
        kotlin.jvm.internal.o.f(second, "second");
        bundle.putLong("BitmapSize", ((java.lang.Number) second).longValue());
        return bundle;
    }
}
