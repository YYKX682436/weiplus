package x85;

/* loaded from: classes9.dex */
public final class q implements x85.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f534135a;

    public q(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f534135a = rVar;
    }

    @Override // x85.j
    public void a(int i17, int i18, r45.xh3 xh3Var) {
        byte[] mo14344x5f01b1f6;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        bundle.putInt("err_code", i18);
        if (xh3Var != null && (mo14344x5f01b1f6 = xh3Var.mo14344x5f01b1f6()) != null) {
            bundle.putByteArray("response", mo14344x5f01b1f6);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f534135a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
