package pe4;

/* loaded from: classes15.dex */
public class b implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pe4.m f435228a;

    public b(pe4.m mVar) {
        this.f435228a = mVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: update mp auth key result: errcode: %d, errmsg: %s", java.lang.Integer.valueOf(cVar.f557138a), cVar.f557139b);
        pe4.m mVar = this.f435228a;
        mVar.a();
        if (cVar.a()) {
            pe4.m.g(mVar, false);
            pe4.n nVar = mVar.f435258i;
            if (nVar != null) {
                ((te4.a) nVar).f500129a.f253280i = (zt5.r) cVar.f338360c;
            }
        } else {
            re4.b0.a(2, cVar.f557138a, 1L);
        }
        int i17 = cVar.f557138a;
        re4.d0 d0Var = mVar.f435251b;
        if (i17 == 1006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterControllerFingerprint", "hy: model is null");
            d0Var.f476059a = 90007;
            d0Var.f476060b = "auth key can not be retrieved";
            mVar.b();
            return;
        }
        if (i17 == 6) {
            cu5.b.f(mVar.f435257h);
            d0Var.f476059a = 90007;
            d0Var.f476060b = "auth key generate failed";
            mVar.b();
            return;
        }
        if (i17 == 1004) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: update auth key failed. remove auth key");
            cu5.b.f(mVar.f435257h);
            d0Var.f476059a = 90007;
            d0Var.f476060b = "auth key update error";
            mVar.b();
        }
    }
}
