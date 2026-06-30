package dk5;

/* loaded from: classes9.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f316024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f316025e;

    public a2(dk5.c2 c2Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2) {
        this.f316024d = f9Var;
        this.f316025e = f9Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f361204d;
        java.lang.String Di = ((g90.u) wVar).Di(this.f316024d, 2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Di)) {
            return;
        }
        ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ui(this.f316025e, 2, Di, null);
    }
}
