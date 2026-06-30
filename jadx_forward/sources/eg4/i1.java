package eg4;

/* loaded from: classes11.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.s1 f334263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f334264e;

    public i1(eg4.t1 t1Var, eg4.s1 s1Var) {
        this.f334264e = t1Var;
        this.f334263d = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        eg4.s1 s1Var = this.f334263d;
        int measuredHeight = s1Var.f334338n.getMeasuredHeight();
        if (measuredHeight > 0) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) s1Var.f334326b.getLayoutParams();
            eg4.t1 t1Var = this.f334264e;
            layoutParams.topMargin = i65.a.f(t1Var.f334344o, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            s1Var.f334326b.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) s1Var.f334327c.getLayoutParams();
            layoutParams2.topMargin = i65.a.f(t1Var.f334344o, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            s1Var.f334327c.setLayoutParams(layoutParams2);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) s1Var.f334325a.getLayoutParams();
            layoutParams3.topMargin = (int) ((measuredHeight * 0.5f) - i65.a.f(t1Var.f334344o, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
            s1Var.f334325a.setLayoutParams(layoutParams3);
        }
    }
}
