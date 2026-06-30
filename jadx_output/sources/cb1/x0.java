package cb1;

/* loaded from: classes4.dex */
public class x0 implements gm5.a {
    public x0(cb1.y0 y0Var) {
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.zb zbVar = (r45.zb) obj;
        if (zbVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData cgi failed, null response");
            return null;
        }
        int i17 = zbVar.BaseResponse.f376959d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), zbVar.BaseResponse.f376960e);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData success");
        return null;
    }
}
