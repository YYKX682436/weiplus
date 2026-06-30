package qa3;

/* loaded from: classes15.dex */
public final class s extends qa3.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442598e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f442599f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f442600g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f442601h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String cmd, org.json.JSONObject jsonObject) {
        super(cmd, jsonObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        this.f442598e = "checkUpdate";
        this.f442599f = "syncCheckUpdate";
        this.f442600g = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f;
        this.f442601h = "query";
    }

    @Override // qa3.a
    public void a(java.util.concurrent.CountDownLatch latch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latch, "latch");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f442569b, "begin " + this.f442568a);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.os.Bundle bundle = new android.os.Bundle();
        h0Var.f391656d = bundle;
        bundle.putString("appId", this.f442568a.getString(this.f442570c));
        if (this.f442568a.has(this.f442600g)) {
            ((android.os.Bundle) h0Var.f391656d).putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f442568a.getString(this.f442600g));
        }
        if (this.f442568a.has(this.f442601h)) {
            ((android.os.Bundle) h0Var.f391656d).putString("query", this.f442568a.getString(this.f442601h));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = this.f442568a.getBoolean(this.f442598e);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var2.f391645d = this.f442568a.getBoolean(this.f442599f);
        if (this.f442571d <= 0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (android.os.Bundle) h0Var.f391656d, c0Var.f391645d, c0Var2.f391645d, new qa3.r(this, latch));
        } else {
            ((ku5.t0) ku5.t0.f394148d).k(new qa3.q(h0Var, c0Var, c0Var2, this), this.f442571d);
            latch.countDown();
        }
    }
}
