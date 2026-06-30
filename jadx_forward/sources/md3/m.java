package md3;

/* loaded from: classes.dex */
public final class m extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f407390f = "";

    @Override // lc3.c0
    public java.lang.String f() {
        return "liveCustomBusiness";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407390f, "[invoke] data = " + data);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.optString("type"), "5")) {
            byte[] Lj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Lj();
            if (Lj != null) {
                if (!(Lj.length == 0)) {
                    yz5.l s17 = s();
                    lc3.a0 a0Var = new lc3.a0();
                    a0Var.put("live_cookie", android.util.Base64.encodeToString(Lj, 2));
                    m(a0Var);
                    s17.mo146xb9724478(a0Var);
                    return;
                }
            }
            s().mo146xb9724478(h(-1, ""));
        }
    }
}
