package qa3;

/* loaded from: classes15.dex */
public final class d extends qa3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String cmd, org.json.JSONObject jsonObject) {
        super(cmd, jsonObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
    }

    @Override // qa3.a
    public void a(java.util.concurrent.CountDownLatch latch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latch, "latch");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f442569b, "begin " + this.f442568a);
        java.lang.String string = this.f442568a.getString(this.f442570c);
        if (this.f442571d > 0) {
            ((ku5.t0) ku5.t0.f394148d).k(new qa3.c(string, this), this.f442571d);
        } else {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(string, null);
            java.lang.String str = this.f442569b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("null ");
            sb6.append(y17 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (y17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().L(y17);
            }
            qa3.o.f442584a.c(this.f442568a, true, "");
        }
        latch.countDown();
    }
}
