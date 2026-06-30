package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class c0 implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f9536d;

    public c0(androidx.appcompat.widget.ActivityChooserView activityChooserView) {
        this.f9536d = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.appcompat.widget.ActivityChooserView activityChooserView = this.f9536d;
        android.widget.FrameLayout frameLayout = activityChooserView.f9353m;
        androidx.appcompat.widget.b0 b0Var = activityChooserView.f9347d;
        if (view == frameLayout) {
            activityChooserView.a();
            b0Var.getClass();
            throw null;
        }
        if (view != activityChooserView.f9351h) {
            throw new java.lang.IllegalArgumentException();
        }
        b0Var.getClass();
        throw new java.lang.IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        n3.d dVar;
        androidx.appcompat.widget.ActivityChooserView activityChooserView = this.f9536d;
        android.widget.PopupWindow.OnDismissListener onDismissListener = activityChooserView.f9357q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        n3.f fVar = activityChooserView.f9354n;
        if (fVar == null || (dVar = fVar.f334330a) == null) {
            return;
        }
        ((androidx.appcompat.widget.q) dVar).n(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        ((androidx.appcompat.widget.b0) adapterView.getAdapter()).getItemViewType(i17);
        androidx.appcompat.widget.ActivityChooserView activityChooserView = this.f9536d;
        activityChooserView.a();
        activityChooserView.f9347d.getClass();
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        androidx.appcompat.widget.ActivityChooserView activityChooserView = this.f9536d;
        if (view != activityChooserView.f9353m) {
            throw new java.lang.IllegalArgumentException();
        }
        activityChooserView.f9347d.getClass();
        throw null;
    }
}
