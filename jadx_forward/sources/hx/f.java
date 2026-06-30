package hx;

/* loaded from: classes11.dex */
public final class f extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setAdCardRequestInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        long optLong = data.optLong("msgId");
        java.lang.String optString = data.optString("adCardInfo");
        ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).getClass();
        boolean z17 = false;
        if (yw.h1.f547865a.n() && (b17 = yw.q3.f547970a.b()) != null) {
            z17 = b17.d(optLong, optString);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiSetAdCardRequestInfo", "setAdCardRequestInfo ret:" + z17);
        if (z17) {
            s().mo146xb9724478(k());
        } else {
            s().mo146xb9724478(h(1, "fail"));
        }
    }
}
