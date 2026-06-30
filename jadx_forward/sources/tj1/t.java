package tj1;

/* loaded from: classes7.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f501248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tj1.u f501249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f501250f;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, tj1.u uVar, int i17) {
        this.f501248d = e9Var;
        this.f501249e = uVar;
        this.f501250f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f501248d;
        e9Var.t3().m(new tj1.s(e9Var, this.f501249e, this.f501250f));
    }
}
