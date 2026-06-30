package com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/matrix/monitor/a;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.monitor.AppBackgroundMemory", "IPC get extra msg");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("GetLeakedActivities", (java.util.HashMap) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.f());
        bundle.putInt("TPCount", com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d.m100777x49d3c5ef().size());
        bundle.putInt("FlutterEngineCount", ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ri());
        bundle.putString("FlutterEngineBizNames", r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ni().toString(), "[", "", false, 4, null), "]", "", false), ",", "|", false), " ", "", false));
        bundle.putString("MBBizList", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a.b());
        bundle.putInt("LiteAppEngineCount", ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).yj());
        bundle.putString("LiteAppIDs", r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).xj().toString(), "[", "", false, 4, null), "]", "", false), ",", "|", false), " ", "", false));
        android.util.Pair d17 = pb0.g.d();
        java.lang.Object first = d17.first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
        bundle.putInt("BitmapCount", ((java.lang.Number) first).intValue());
        java.lang.Object second = d17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
        bundle.putLong("BitmapSize", ((java.lang.Number) second).longValue());
        return bundle;
    }
}
