package s2;

/* loaded from: classes14.dex */
public final class b implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f483729a;

    public b(s2.b0 b0Var) {
        this.f483729a = b0Var;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        s2.b0 b0Var = this.f483729a;
        n0.f1 f1Var = b0Var.f91984f;
        if (f1Var != null) {
            f1Var.mo7062x63a5261f();
        }
        b0Var.f91984f = null;
        b0Var.requestLayout();
        b0Var.setTag(com.p314xaae8f345.mm.R.id.p28, null);
        b0Var.f483735s.removeViewImmediate(b0Var);
    }
}
