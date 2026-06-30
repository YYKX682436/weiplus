package pe4;

/* loaded from: classes15.dex */
public class e implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pe4.m f435232a;

    public e(pe4.m mVar) {
        this.f435232a = mVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.a aVar = (eu5.a) eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "request authentication result errCode: %d, errMsg: %s", java.lang.Integer.valueOf(aVar.f557138a), aVar.f557139b);
        pe4.m mVar = this.f435232a;
        mVar.f435241j = false;
        if (aVar.a()) {
            mVar.f435248q.postDelayed(new pe4.d(this, aVar), 500L);
            return;
        }
        re4.b0.a(3, aVar.f557138a, 1L);
        int i17 = aVar.f557138a;
        re4.d0 d0Var = mVar.f435251b;
        if (i17 == 1007 || i17 == 1015) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: start authen error, maybe key invalid. remove former key and give suggestion");
            cu5.b.f(mVar.f435257h);
            d0Var.f476059a = 90007;
            d0Var.f476060b = "start fingerprint authen failed";
        } else if (i17 == 1021) {
            d0Var.f476059a = 90010;
            d0Var.f476060b = "authenticate freeze. please try again later";
        } else {
            d0Var.f476059a = 90007;
            d0Var.f476060b = "authenticate error: " + aVar.f557139b;
        }
        mVar.b();
    }
}
