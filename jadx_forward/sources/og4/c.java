package og4;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f426703f = "MBJsApiSetDownloadingSpeed";

    @Override // lc3.c0
    public java.lang.String f() {
        return "setDownloadingSpeed";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("appId");
        double optDouble = data.optDouble(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f426703f, "[gameload] setDownloadingSpeed appId:" + optString + ",speed:" + optDouble);
        oe0.r rVar = (oe0.r) i95.n0.c(oe0.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        ne0.n nVar = (ne0.n) rVar;
        nVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).h(new ne0.m(nVar, optString, optDouble), "MicroMsg.MagicGameLoadingFeatureService");
        s().mo146xb9724478(k());
    }
}
