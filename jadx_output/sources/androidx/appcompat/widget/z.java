package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class z extends androidx.appcompat.widget.f1 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f9744p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.widget.ActivityChooserView activityChooserView, android.view.View view) {
        super(view);
        this.f9744p = activityChooserView;
    }

    @Override // androidx.appcompat.widget.f1
    public o.k0 b() {
        return this.f9744p.getListPopupWindow();
    }

    @Override // androidx.appcompat.widget.f1
    public boolean c() {
        androidx.appcompat.widget.ActivityChooserView activityChooserView = this.f9744p;
        if (activityChooserView.b() || !activityChooserView.f9358r) {
            return true;
        }
        activityChooserView.f9347d.getClass();
        throw new java.lang.IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // androidx.appcompat.widget.f1
    public boolean d() {
        this.f9744p.a();
        return true;
    }
}
