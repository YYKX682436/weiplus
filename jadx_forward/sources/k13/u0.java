package k13;

/* loaded from: classes10.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f384802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f384803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384804f;

    public u0(int i17, int i18, k13.l1 l1Var) {
        this.f384802d = i17;
        this.f384803e = i18;
        this.f384804f = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f384802d;
        for (int i18 = i17; i18 < this.f384803e; i18++) {
            if (i17 >= 0) {
                k13.l1 l1Var = this.f384804f;
                if (i17 < l1Var.f384772q.size()) {
                    k13.l1.d(l1Var, ((i13.c) l1Var.f384772q.get(i17)).f368808d);
                }
            }
        }
    }
}
