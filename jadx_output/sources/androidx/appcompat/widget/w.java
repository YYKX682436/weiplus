package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class w extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f9732a;

    public w(androidx.appcompat.widget.ActivityChooserView activityChooserView) {
        this.f9732a = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        this.f9732a.f9347d.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        super.onInvalidated();
        this.f9732a.f9347d.notifyDataSetInvalidated();
    }
}
