package as3;

/* loaded from: classes5.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16921x4fe35715 f95053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f95054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f95055f;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16921x4fe35715 c16921x4fe35715, android.view.View view, android.view.View view2) {
        this.f95053d = c16921x4fe35715;
        this.f95054e = view;
        this.f95055f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        int b17 = i65.a.b(this.f95053d.getContext(), 24);
        android.view.View view = this.f95054e;
        view.getHitRect(rect);
        rect.left -= b17;
        rect.top -= b17;
        rect.right += b17;
        rect.bottom += b17;
        this.f95055f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
