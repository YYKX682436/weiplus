package se2;

/* loaded from: classes3.dex */
public final class c implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f488372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ se2.d f488373e;

    public c(android.view.View view, se2.d dVar) {
        this.f488372d = view;
        this.f488373e = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f488372d.setBackground(this.f488373e.f488378d);
    }
}
