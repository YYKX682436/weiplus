package av4;

/* loaded from: classes.dex */
public final class i0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.i0 f14292d = new av4.i0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.RemoveWebViewPageJSApi", "handleMsg params:" + msg.f340790a);
        java.util.Map map = msg.f340790a;
        boolean c17 = com.tencent.mm.plugin.websearch.l2.c(map, "animated", true);
        com.tencent.mm.plugin.websearch.l2.e(map, ya.b.INDEX, 0);
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "docInfo");
        if (f17 == null) {
            f17 = "";
        }
        android.content.Context context = env.f340860a;
        if (context instanceof android.app.Activity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            if (!c17) {
                new com.tencent.mm.autogen.events.SetMPHalfScreenNotAnimEvent().e();
            }
            pm0.v.V(0L, new av4.h0(activity, f17));
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "removeWebviewPage";
    }
}
