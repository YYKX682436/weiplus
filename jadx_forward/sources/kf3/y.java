package kf3;

/* loaded from: classes5.dex */
public class y implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.j0 f388995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.k0 f388996e;

    public y(kf3.k0 k0Var, kf3.j0 j0Var) {
        this.f388996e = k0Var;
        this.f388995d = j0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        kf3.j0 j0Var = this.f388995d;
        j0Var.f388898c.setBackgroundColor(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        kf3.k0 k0Var = this.f388996e;
        k0Var.getClass();
        if (j0Var.f388905j == null) {
            j0Var.f388905j = new rl5.r(k0Var.f388914t, j0Var.f388898c);
        }
        rl5.r rVar = j0Var.f388905j;
        rVar.C = true;
        rVar.f478888y = new kf3.v(k0Var);
        rVar.f478887x = new kf3.w(k0Var, j0Var);
        rVar.L = new kf3.x(k0Var, j0Var);
        int[] iArr = new int[2];
        j0Var.f388898c.getLocationInWindow(iArr);
        int i17 = iArr[0];
        j0Var.f388905j.n((i17 + j0Var.f388898c.getWidth()) / 2, iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
