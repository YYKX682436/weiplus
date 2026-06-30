package ry4;

/* loaded from: classes.dex */
public final class y implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f483221d;

    public y(ry4.c0 c0Var) {
        this.f483221d = c0Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            ry4.c0 c0Var = this.f483221d;
            c0Var.f483129n = c0Var.f483127i;
            android.widget.ScrollView scrollView = c0Var.f483133r;
            if (scrollView == null || c0Var.f483134s == null) {
                return;
            }
            android.view.View childAt = scrollView.getChildAt(0);
            c0Var.f483135t = childAt != null ? childAt.getHeight() : 0;
            c0Var.V6();
        }
    }
}
