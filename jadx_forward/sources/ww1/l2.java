package ww1;

/* loaded from: classes15.dex */
public final class l2 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8 f531776a;

    public l2(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8 c6185x2d8542e8) {
        this.f531776a = c6185x2d8542e8;
    }

    @Override // h45.i
    /* renamed from: onKindaBusinessCallback */
    public final void mo24858x44dbb8f3(android.content.Intent intent) {
        int intExtra = intent.getIntExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8 c6185x2d8542e8 = this.f531776a;
        am.qz qzVar = c6185x2d8542e8.f136444h;
        if (qzVar != null) {
            qzVar.f89287a = intExtra;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPayCodeListener", "[callback] retcode : " + intExtra);
        java.lang.Runnable runnable = c6185x2d8542e8.f136443g.f89216l;
        if (runnable != null) {
            runnable.run();
        }
    }
}
