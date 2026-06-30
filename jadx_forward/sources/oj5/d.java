package oj5;

/* loaded from: classes14.dex */
public final class d implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj5.r f427372e;

    public d(android.view.View view, oj5.r rVar) {
        this.f427371d = view;
        this.f427372e = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f427371d.removeOnAttachStateChangeListener(this);
        oj5.r rVar = this.f427372e;
        java.lang.String str = rVar.f427412b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doOnAttach] ");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = rVar.f427411a;
        sb6.append(c1163xf1deaba4.getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        c1163xf1deaba4.m7971xa810ec34(rVar.f427416f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.m8091xc21abdf5(false);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
