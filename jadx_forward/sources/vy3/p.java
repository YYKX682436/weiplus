package vy3;

/* loaded from: classes.dex */
public final class p extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.p f523013e = new vy3.p();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object systemService = env.f422393a.getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "shake";
    }
}
