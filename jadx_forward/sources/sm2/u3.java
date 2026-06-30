package sm2;

/* loaded from: classes3.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491267d;

    public u3(sm2.o4 o4Var) {
        this.f491267d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var;
        sm2.o4 o4Var = this.f491267d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = o4Var.f491155l;
        if (khVar == null || (view = khVar.f194782w) == null || (de0Var = o4Var.f491171x) == null) {
            return;
        }
        de0Var.f193816x = view;
        de0Var.x1(view);
    }
}
