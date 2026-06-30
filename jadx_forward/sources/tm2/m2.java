package tm2;

/* loaded from: classes3.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502083d;

    public m2(tm2.s2 s2Var) {
        this.f502083d = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var;
        tm2.s2 s2Var = this.f502083d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = s2Var.f502130l;
        if (khVar == null || (view = khVar.f194782w) == null || (de0Var = s2Var.f502146x) == null) {
            return;
        }
        de0Var.f193816x = view;
        de0Var.x1(view);
    }
}
