package kr3;

/* loaded from: classes11.dex */
public final class i0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f392920a;

    public i0(kr3.q0 q0Var) {
        this.f392920a = q0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        kr3.q0 q0Var = this.f392920a;
        if (z17) {
            kr3.q0.O6(q0Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onCancelClick(): changed but do not save");
        q0Var.W6(java.lang.Boolean.FALSE);
        q0Var.m158354x19263085().finish();
    }
}
