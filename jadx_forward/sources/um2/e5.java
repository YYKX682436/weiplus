package um2;

/* loaded from: classes3.dex */
public final class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f510313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510314e;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, um2.x5 x5Var) {
        this.f510313d = mgVar;
        this.f510314e = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f510313d.f446856d.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            um2.x5 x5Var = this.f510314e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = x5Var.f510619x;
            if (etVar != null) {
                etVar.N = null;
            }
            layoutParams2.removeRule(12);
            layoutParams2.addRule(2, x5Var.f510607t);
        }
    }
}
