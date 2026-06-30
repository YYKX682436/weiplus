package av4;

/* loaded from: classes.dex */
public final class i0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.i0 f95825d = new av4.i0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.RemoveWebViewPageJSApi", "handleMsg params:" + msg.f422323a);
        java.util.Map map = msg.f422323a;
        boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "animated", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, ya.b.f77479x42930b2, 0);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "docInfo");
        if (f17 == null) {
            f17 = "";
        }
        android.content.Context context = env.f422393a;
        if (context instanceof android.app.Activity) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            if (!c17) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6007x3510c55a().e();
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
