package pr;

/* loaded from: classes15.dex */
public final class l0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.q0 f439278d;

    public l0(pr.q0 q0Var) {
        this.f439278d = q0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        pr.q0 q0Var = this.f439278d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q0Var.f439301b, "init data callback: " + bundle);
        q0Var.h(bundle != null ? (com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10444x1291fbaf) bundle.getParcelable(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) : null);
    }
}
