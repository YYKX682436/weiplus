package yc1;

/* loaded from: classes7.dex */
public class e0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h45.r f542314a;

    public e0(yc1.f0 f0Var, h45.r rVar) {
        this.f542314a = rVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSecureTunnel", "onGYNetEnd errType :" + i17 + " errCode: " + i18 + " errMsg :" + str);
        h45.r rVar = this.f542314a;
        if (i17 == 0 && i18 == 0 && oVar.f152244b.f152233a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel cgi success");
            rVar.mo74492xe05b4124(((r45.hy5) oVar.f152244b.f152233a).f458089d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSecureTunnel", "secureTunnel cgi failed");
            rVar.a(str);
        }
    }
}
