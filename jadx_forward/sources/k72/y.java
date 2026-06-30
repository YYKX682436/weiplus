package k72;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f386309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f386310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[][] f386311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k72.d0 f386312g;

    public y(k72.d0 d0Var, int i17, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, byte[][] bArr) {
        this.f386312g = d0Var;
        this.f386309d = i17;
        this.f386310e = c11120x15dce88d;
        this.f386311f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        h72.s e17 = h72.s.e();
        e17.f361002c.m77784x795fa299(new h72.i(e17, this.f386309d));
        h72.s e18 = h72.s.e();
        e18.f361002c.m77784x795fa299(new h72.j(e18, this.f386310e.f152726f));
        k72.d0 d0Var = this.f386312g;
        d0Var.getClass();
        k72.u uVar = k72.u.B;
        k72.a0 a0Var = new k72.a0(d0Var, this.f386311f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = uVar.f386295t;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(a0Var);
        }
    }
}
