package vy3;

/* loaded from: classes.dex */
public final class e extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.e f523001e = new vy3.e();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("content");
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCopy", "ScanJsApi-Call:copy content: %s", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, str, null);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f532180d == 0 || java.lang.System.currentTimeMillis() - this.f532180d >= 2000) {
            this.f532180d = currentTimeMillis;
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            android.content.Context context = env.f422393a;
            db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "copy";
    }
}
