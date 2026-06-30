package qa3;

/* loaded from: classes15.dex */
public final class h extends qa3.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String cmd, org.json.JSONObject jsonObject) {
        super(cmd, jsonObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        this.f442580e = "url";
    }

    @Override // qa3.a
    public void a(java.util.concurrent.CountDownLatch latch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latch, "latch");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f442569b, "begin " + this.f442568a);
        java.lang.String string = this.f442568a.getString(this.f442570c);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        if (this.f442568a.has(this.f442580e)) {
            java.lang.String string2 = this.f442568a.getString(this.f442580e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            h0Var.f391656d = string2;
        }
        qa3.g gVar = new qa3.g(string, new qa3.f(this, latch));
        if (this.f442571d <= 0) {
            gVar.mo146xb9724478(h0Var.f391656d);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).k(new qa3.e(gVar, h0Var), this.f442571d);
        latch.countDown();
    }
}
