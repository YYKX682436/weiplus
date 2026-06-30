package tl;

/* loaded from: classes12.dex */
public class n0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.o0 f501595a;

    public n0(tl.o0 o0Var, tl.p0 p0Var) {
        this.f501595a = o0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        tl.p0 p0Var = this.f501595a.f501598e;
        if (p0Var.f501616p <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.f1 f1Var = p0Var.f501618r;
        p0Var.f501616p = 2;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
