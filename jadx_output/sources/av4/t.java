package av4;

/* loaded from: classes.dex */
public final class t extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.t f14333d = new av4.t();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.OpenFinderProfileJSApi", "handleMsg params:" + msg.f340790a);
        java.util.Map map = msg.f340790a;
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "userName");
        java.lang.String f18 = com.tencent.mm.plugin.websearch.l2.f(map, "reportExtraInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", f17);
        intent.putExtra("report_scene", 14);
        intent.putExtra("key_enter_profile_type", 1);
        intent.putExtra("key_extra_info", f18);
        boolean z17 = com.tencent.mm.plugin.websearch.l2.e(map, "isInsideFinder", 0) == 1 || com.tencent.mm.plugin.websearch.l2.c(map, "isInsideFinder", false);
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, "commentScene", 0);
        intent.putExtra("key_is_in_finder", z17);
        intent.putExtra("key_entry_type", e17);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(6, 2, 32, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(env.f340860a, intent);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderProfileJsApi";
    }
}
