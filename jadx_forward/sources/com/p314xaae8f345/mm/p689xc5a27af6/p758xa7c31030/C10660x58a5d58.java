package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* renamed from: com.tencent.mm.feature.performance.c2$$g */
/* loaded from: classes12.dex */
public final /* synthetic */ class C10660x58a5d58 implements m3.a {
    @Override // m3.a
    /* renamed from: accept */
    public final void mo3938xab27b508(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "mainProc standby, skip");
            return;
        }
        dr0.p1 a17 = dr0.p1.f324022d.a();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        if (a17.j(str)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(num.intValue()), com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.u2.class, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "mainProc no exist, skip");
        }
    }
}
