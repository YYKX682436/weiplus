package um2;

/* loaded from: classes3.dex */
public final class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f510330e;

    public f5(um2.x5 x5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f510329d = x5Var;
        this.f510330e = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um2.x5 x5Var = this.f510329d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = x5Var.f510619x;
        if (etVar != null) {
            etVar.N = null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f510330e.f446856d.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.removeRule(12);
            layoutParams2.addRule(2, x5Var.f510607t);
        }
    }
}
