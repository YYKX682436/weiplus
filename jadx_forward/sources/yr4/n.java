package yr4;

/* loaded from: classes9.dex */
public class n extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yr4.u uVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, np5.b0 b0Var) {
        super(uVar, abstractActivityC22902xe37969e, b0Var);
        this.f546639c = uVar;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        yr4.u uVar = this.f546639c;
        if (uVar.f295334c.getInt("key_pay_scene", 0) == 11) {
            uVar.f295334c.putParcelable("key_history_bankcard", vr4.f1.wi().Ai().f95531g);
        }
        return false;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
