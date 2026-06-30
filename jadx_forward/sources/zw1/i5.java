package zw1;

/* loaded from: classes15.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f558199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558201g;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.b3 b3Var, android.view.ViewGroup.LayoutParams layoutParams, ww1.a3 a3Var) {
        this.f558201g = activityC13149x63b02cb3;
        this.f558198d = b3Var;
        this.f558199e = layoutParams;
        this.f558200f = a3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558201g;
        boolean J7 = activityC13149x63b02cb3.J7();
        ww1.a3 a3Var = this.f558200f;
        android.view.ViewGroup.LayoutParams layoutParams = this.f558199e;
        ww1.b3 b3Var = this.f558198d;
        if (!J7) {
            if (b3Var.f531672k.getHeight() != 0) {
                layoutParams.height = b3Var.f531672k.getHeight();
            } else {
                layoutParams.height = (int) a3Var.f531648y;
            }
        }
        float f17 = a3Var.f531648y;
        b3Var.f531672k.getHeight();
        b3Var.C.getHeight();
        i65.a.b(activityC13149x63b02cb3.mo55332x76847179(), 1);
        b3Var.O.setLayoutParams(layoutParams);
        b3Var.O.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562814pd);
        b3Var.P.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562814pd);
    }
}
