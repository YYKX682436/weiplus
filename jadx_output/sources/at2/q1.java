package at2;

/* loaded from: classes3.dex */
public final class q1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f13737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.u1 f13738e;

    public q1(yz5.a aVar, at2.u1 u1Var) {
        this.f13737d = aVar;
        this.f13738e = u1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        this.f13737d.invoke();
        kotlinx.coroutines.r2 r2Var = this.f13738e.f13763r;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
