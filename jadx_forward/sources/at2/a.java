package at2;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.b f95165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f95166e;

    public a(at2.b bVar, android.view.ViewGroup viewGroup) {
        this.f95165d = bVar;
        this.f95166e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f95165d.x0()) {
            android.view.ViewGroup viewGroup = this.f95166e;
            if (viewGroup.getLayoutParams() == null || !(viewGroup.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() + i65.a.b(viewGroup.getContext(), 16));
        }
    }
}
