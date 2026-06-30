package um2;

/* loaded from: classes3.dex */
public final class t4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510500d;

    public t4(um2.x5 x5Var) {
        this.f510500d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var;
        um2.x5 x5Var = this.f510500d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = x5Var.f510598q;
        if (khVar == null || (view = khVar.f194782w) == null || (de0Var = x5Var.V) == null) {
            return;
        }
        de0Var.f193816x = view;
        de0Var.x1(view);
    }
}
