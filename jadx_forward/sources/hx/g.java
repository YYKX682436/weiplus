package hx;

/* loaded from: classes11.dex */
public final class g extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setAdRequestInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String adFetchControl = data.optString("adFetchControl");
        java.lang.String adFetchInfo = data.optString("adFetchInfo");
        ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adFetchControl, "adFetchControl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adFetchInfo, "adFetchInfo");
        boolean z17 = false;
        if (yw.h1.f547865a.n() && (b17 = yw.q3.f547970a.b()) != null) {
            z17 = b17.e(adFetchControl, adFetchInfo);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiSetAdRequestInfo", "setAdRequestInfo ret:" + z17);
        if (z17) {
            s().mo146xb9724478(k());
        } else {
            s().mo146xb9724478(i(new lc3.z(1, "fail")));
        }
    }
}
