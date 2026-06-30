package qa3;

/* loaded from: classes15.dex */
public final class b extends qa3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String cmd, org.json.JSONObject jsonObject) {
        super(cmd, jsonObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
    }

    @Override // qa3.a
    public void a(java.util.concurrent.CountDownLatch latch) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latch, "latch");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f442569b, "begin " + this.f442568a);
        latch.countDown();
    }
}
