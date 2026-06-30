package av4;

/* loaded from: classes.dex */
public final class k extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.k f14294d = new av4.k();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("WebViewIsMinimizeTaskEnabledJSAPI", "addToStar: handleMsg");
        java.lang.String str = msg.f341013c;
        java.lang.String str2 = msg.f341019i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, java.lang.Integer.valueOf(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? 1 : 0));
        hashMap.put("multiContentSwitch", java.lang.Integer.valueOf(((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() ? 1 : 0));
        env.f340863d.e(str, str2, hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "isMinimizeTaskEnabled";
    }
}
