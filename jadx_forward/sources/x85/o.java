package x85;

/* loaded from: classes10.dex */
public final class o implements x85.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f534134a;

    public o(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f534134a = rVar;
    }

    @Override // x85.c
    public void a(int i17, r45.p64 p64Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f534134a;
        if (p64Var == null) {
            if (rVar != null) {
                rVar.a(bundle);
            }
        } else {
            bundle.putByteArray("result", p64Var.mo14344x5f01b1f6());
            if (rVar != null) {
                rVar.a(bundle);
            }
        }
    }
}
