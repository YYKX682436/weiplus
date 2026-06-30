package gx;

/* loaded from: classes7.dex */
public final class i extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setTimelineWidgetStatus";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetName");
        boolean optBoolean = data.optBoolean("isCompete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiSetTimelineWidgetStatus", "frameSetName: " + optString + ", isCompete: " + optBoolean);
        cx.w0 w0Var = (cx.w0) this.f399423a;
        if (w0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            gx.h hVar = new gx.h(this, optString);
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g0 j17 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.h0.j();
            j17.f149499d |= 1;
            j17.f149500e = optString;
            j17.m20881x7bb163d5();
            long j18 = optBoolean ? 1L : 0L;
            j17.f149499d |= 2;
            j17.f149501f = j18;
            j17.m20881x7bb163d5();
            w0Var.f306012x.n("setTimelineWidgetStatus", j17.mo20556x59bc66e().mo20648x5f01b1f6(), new cx.v0(hVar));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            s().mo146xb9724478(j(lc3.x.f399469c, "context null"));
        }
    }
}
