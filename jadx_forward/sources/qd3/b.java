package qd3;

/* loaded from: classes.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z7.f35035x24728b;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("phoneNumber");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            s().mo146xb9724478(h(-1, "no number"));
            return;
        }
        lc3.e eVar = this.f399423a;
        android.app.Activity B0 = eVar != null ? eVar.B0() : null;
        if (B0 == null) {
            s().mo146xb9724478(h(-2, "ui lost"));
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
            intent.setData(android.net.Uri.parse("tel:" + android.net.Uri.encode(optString)));
            nf.g.a(B0).j(intent, new qd3.a(this));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiMakePhoneCall", "startActivity failed");
            s().mo146xb9724478(h(-3, "call system ui fail"));
        }
    }
}
