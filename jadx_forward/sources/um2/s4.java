package um2;

/* loaded from: classes3.dex */
public final class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510491d;

    public s4(um2.x5 x5Var) {
        this.f510491d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var;
        um2.x5 x5Var = this.f510491d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = x5Var.f510595p;
        if (nd0Var == null || (viewGroup = nd0Var.f446856d) == null || (de0Var = x5Var.V) == null) {
            return;
        }
        de0Var.f193816x = viewGroup;
        de0Var.x1(viewGroup);
    }
}
