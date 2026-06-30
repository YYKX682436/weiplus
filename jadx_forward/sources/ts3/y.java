package ts3;

/* loaded from: classes9.dex */
public class y implements r35.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f503237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ts3.a0 f503238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ts3.d0 f503239c;

    public y(ts3.d0 d0Var, boolean z17, ts3.a0 a0Var) {
        this.f503239c = d0Var;
        this.f503237a = z17;
        this.f503238b = a0Var;
    }

    @Override // r35.q3
    /* renamed from: onFinish */
    public void mo58428x42fe6352() {
        boolean z17 = this.f503237a;
        ts3.a0 a0Var = this.f503238b;
        if (!z17) {
            a0Var.f503163i.m84183x1c5c5ff4(this.f503239c.B.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            a0Var.f503163i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562515gv);
        }
        a0Var.f503164j.setVisibility(0);
    }

    @Override // r35.q3
    /* renamed from: onStart */
    public void mo58429xb05099c3() {
    }
}
