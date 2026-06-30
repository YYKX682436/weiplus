package sz4;

/* loaded from: classes12.dex */
public class j0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sz4.k0 f495737a;

    public j0(sz4.k0 k0Var) {
        this.f495737a = k0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        sz4.k0 k0Var = this.f495737a;
        if (k0Var.F.f377667r) {
            k0Var.G.mo50303x856b99f0(4096);
            return;
        }
        k0Var.E.setText(" " + ((java.lang.String) c31.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, k0Var.F.f377693u)).toString());
        mo50307xb9e94560(4096, 500L);
    }
}
