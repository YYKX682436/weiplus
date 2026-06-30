package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class x implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f9734d;

    public x(androidx.appcompat.widget.ActivityChooserView activityChooserView) {
        this.f9734d = activityChooserView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        n3.d dVar;
        androidx.appcompat.widget.ActivityChooserView activityChooserView = this.f9734d;
        if (activityChooserView.b()) {
            if (!activityChooserView.isShown()) {
                activityChooserView.getListPopupWindow().dismiss();
                return;
            }
            activityChooserView.getListPopupWindow().show();
            n3.f fVar = activityChooserView.f9354n;
            if (fVar == null || (dVar = fVar.f334330a) == null) {
                return;
            }
            ((androidx.appcompat.widget.q) dVar).n(true);
        }
    }
}
