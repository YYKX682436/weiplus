package kr3;

/* loaded from: classes8.dex */
public final class i1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f392921a;

    public i1(kr3.q1 q1Var) {
        this.f392921a = q1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        kr3.q1 q1Var = this.f392921a;
        if (z17) {
            kr3.q1.O6(q1Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onCancelClick(): changed but do not save");
        q1Var.W6(java.lang.Boolean.FALSE);
        q1Var.m158354x19263085().finish();
    }
}
