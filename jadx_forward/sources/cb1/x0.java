package cb1;

/* loaded from: classes4.dex */
public class x0 implements gm5.a {
    public x0(cb1.y0 y0Var) {
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.zb zbVar = (r45.zb) obj;
        if (zbVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData cgi failed, null response");
            return null;
        }
        int i17 = zbVar.f76492x92037252.f458492d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), zbVar.f76492x92037252.f458493e);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData success");
        return null;
    }
}
