package pe4;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu5.a f435230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe4.e f435231e;

    public d(pe4.e eVar, eu5.a aVar) {
        this.f435231e = eVar;
        this.f435230d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zt5.s sVar = (zt5.s) this.f435230d.f338360c;
        pe4.e eVar = this.f435231e;
        if (sVar == null) {
            pe4.m mVar = eVar.f435232a;
            re4.d0 d0Var = mVar.f435251b;
            d0Var.f476059a = 90007;
            d0Var.f476060b = "signatureResult is null";
            mVar.b();
            return;
        }
        pe4.m mVar2 = eVar.f435232a;
        re4.d0 d0Var2 = mVar2.f435251b;
        d0Var2.f476059a = 0;
        d0Var2.f476060b = "OK";
        d0Var2.f476061c = (byte) 1;
        d0Var2.f476062d = sVar.f557162j;
        d0Var2.f476063e = sVar.f557163k;
        if (mVar2.f435253d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        } else {
            mVar2.a();
            mVar2.f435253d.obtainMessage(0, mVar2.f435251b).sendToTarget();
        }
    }
}
