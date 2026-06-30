package vx5;

/* loaded from: classes13.dex */
public class s implements com.p314xaae8f345.p3210x3857dc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.q f522921a;

    public s(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.q qVar) {
        this.f522921a = qVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.l0
    public void a() {
        by5.i0 i0Var;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.r rVar = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.r) this.f522921a;
        rVar.getClass();
        try {
            synchronized (rVar) {
                i0Var = rVar.f301999b;
                if (i0Var == null) {
                    i0Var = new by5.i0(rVar.f301998a, "proceed", new java.lang.Class[0]);
                    rVar.f301999b = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.l0
    /* renamed from: cancel */
    public void mo120274xae7a2e7a() {
        ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.r) this.f522921a).a();
    }
}
