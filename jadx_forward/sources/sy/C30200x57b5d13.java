package sy;

/* renamed from: sy.b0$$a */
/* loaded from: classes5.dex */
public final /* synthetic */ class C30200x57b5d13 implements java.util.function.BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        sy.c0 c0Var = (sy.c0) obj2;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) == null) {
            return;
        }
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("plugin_msg_report_unread_" + str + gm0.j1.b().j(), -1L);
        if (j17 == -1 || j17 >= r0.d1()) {
            return;
        }
        c0Var.f495321c = r0.d1() - j17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("plugin_msg_report_unread_" + str + gm0.j1.b().j(), -1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "[loadSupplementaryData] %s, lastUnReadCount:%d, recvMsgCount:%d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c0Var.f495321c));
    }
}
