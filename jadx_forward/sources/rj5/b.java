package rj5;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f477907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2734x9d861347.AbstractC22476xceb0af4c f477908e;

    public b(android.view.View view, com.p314xaae8f345.mm.ui.p2734x9d861347.AbstractC22476xceb0af4c abstractC22476xceb0af4c) {
        this.f477907d = view;
        this.f477908e = abstractC22476xceb0af4c;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f477907d.removeOnAttachStateChangeListener(this);
        com.p314xaae8f345.mm.ui.p2734x9d861347.AbstractC22476xceb0af4c abstractC22476xceb0af4c = this.f477908e;
        abstractC22476xceb0af4c.addView(abstractC22476xceb0af4c.a());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
