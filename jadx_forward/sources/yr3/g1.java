package yr3;

/* loaded from: classes11.dex */
public final class g1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.h1 f546364d;

    public g1(yr3.h1 h1Var) {
        this.f546364d = h1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        yr3.h1 h1Var = this.f546364d;
        h1Var.f546380p.f546334f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = h1Var.f546380p.f546334f.getHeight();
        int height2 = h1Var.f546381q.f546334f.getHeight();
        if (height != height2 && height > 0 && height2 > 0) {
            int max = java.lang.Math.max(height, height2);
            yr3.e1 e1Var = height < height2 ? h1Var.f546380p : h1Var.f546381q;
            android.view.ViewGroup.LayoutParams layoutParams = e1Var.f546333e.getLayoutParams();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.f92428i = -1;
                e1Var.f546333e.setLayoutParams(layoutParams2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h1Var.f546374g, "adjustRecViewConstraints: removed topToBottom constraint for recView");
            }
            h1Var.f546380p.f546334f.getLayoutParams().height = max;
            h1Var.f546381q.f546334f.getLayoutParams().height = max;
            h1Var.f546380p.f546334f.requestLayout();
            h1Var.f546381q.f546334f.requestLayout();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h1Var.f546374g, "syncDescAreaHeight: firstHeight=" + height + ", secondHeight=" + height2 + ", maxHeight=" + max);
        }
    }
}
