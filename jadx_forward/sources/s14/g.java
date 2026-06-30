package s14;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17499xf7256adf f483681d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17499xf7256adf activityC17499xf7256adf) {
        this.f483681d = activityC17499xf7256adf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View childAt;
        android.widget.TextView textView;
        int height;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17499xf7256adf activityC17499xf7256adf = this.f483681d;
        android.widget.ScrollView scrollView = (android.widget.ScrollView) activityC17499xf7256adf.findViewById(com.p314xaae8f345.mm.R.id.mcq);
        if (scrollView == null || (childAt = scrollView.getChildAt(0)) == null || (textView = (android.widget.TextView) activityC17499xf7256adf.findViewById(com.p314xaae8f345.mm.R.id.f569141vo4)) == null || (height = scrollView.getHeight() - childAt.getMeasuredHeight()) <= 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = height;
        textView.setLayoutParams(layoutParams2);
    }
}
