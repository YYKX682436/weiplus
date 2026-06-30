package rk4;

/* loaded from: classes11.dex */
public final class c4 implements qk.g8 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f478112a = jz5.h.b(rk4.a4.f478076d);

    public c4() {
        jz5.h.b(new rk4.b4(this));
    }

    public void b(android.content.Context context, bw5.ar0 enterScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        w71.o0 a17 = w71.q0.f524969d.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TingFlutterPluginHelperImpl", "gotoPlayerPage failed, hybridRouter is null");
            return;
        }
        km4.s a18 = km4.s.f390851f.a(enterScene);
        a18.e("basic_player");
        a18.a(kz5.c1.k(new jz5.l("play_app_id", 0), new jz5.l("intentFlags", java.lang.Integer.valueOf(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965)), new jz5.l("activityClass", com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18706xaa4b6fd1.class)));
        ((w71.q0) a17).a(a18, rk4.z3.f478655d);
    }
}
