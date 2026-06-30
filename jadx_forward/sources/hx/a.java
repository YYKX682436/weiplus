package hx;

/* loaded from: classes11.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "deleteCard";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiDeleteCard", "data: " + data);
        boolean z17 = false;
        int optInt = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        if (optInt != 0) {
            if (optInt != 1) {
                return;
            }
            java.lang.String optString = data.optString("cardId");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5199x58058b3a c5199x58058b3a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5199x58058b3a();
            c5199x58058b3a.f135541g.f89946a = optString;
            c5199x58058b3a.e();
            s().mo146xb9724478(k());
            return;
        }
        long optLong = data.optLong("msgId");
        cx.w0 w0Var = (cx.w0) this.f399423a;
        java.lang.String O0 = w0Var != null ? w0Var.O0() : null;
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(O0, "MagicBrandService") ? 2 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(O0, "MagicAdBrandService") ? 1 : 0;
        ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).getClass();
        if (yw.h1.f547865a.n() && (b17 = yw.q3.f547970a.b()) != null) {
            z17 = b17.a(optLong, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiDeleteCard", "deleteCard msgId:" + optLong + " ret:" + z17);
        if (z17) {
            s().mo146xb9724478(k());
        } else {
            s().mo146xb9724478(i(new lc3.z(1, "fail")));
        }
    }
}
