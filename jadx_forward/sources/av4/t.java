package av4;

/* loaded from: classes.dex */
public final class t extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.t f95866d = new av4.t();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenFinderProfileJSApi", "handleMsg params:" + msg.f422323a);
        java.util.Map map = msg.f422323a;
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "userName");
        java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "reportExtraInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", f17);
        intent.putExtra("report_scene", 14);
        intent.putExtra("key_enter_profile_type", 1);
        intent.putExtra("key_extra_info", f18);
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "isInsideFinder", 0) == 1 || com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "isInsideFinder", false);
        int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "commentScene", 0);
        intent.putExtra("key_is_in_finder", z17);
        intent.putExtra("key_entry_type", e17);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(6, 2, 32, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.w(env.f422393a, intent);
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
