package er;

/* loaded from: classes5.dex */
public final class g implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f337471a;

    public g(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f337471a = rVar;
    }

    @Override // dr.q
    public void a(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("KEY_RESULT", z17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f337471a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
