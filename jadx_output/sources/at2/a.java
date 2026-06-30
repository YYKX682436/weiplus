package at2;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.b f13632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f13633e;

    public a(at2.b bVar, android.view.ViewGroup viewGroup) {
        this.f13632d = bVar;
        this.f13633e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13632d.x0()) {
            android.view.ViewGroup viewGroup = this.f13633e;
            if (viewGroup.getLayoutParams() == null || !(viewGroup.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() + i65.a.b(viewGroup.getContext(), 16));
        }
    }
}
