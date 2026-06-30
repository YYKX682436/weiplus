package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class b0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f9519d;

    public b0(androidx.appcompat.widget.ActivityChooserView activityChooserView) {
        this.f9519d = activityChooserView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        getItemViewType(i17);
        throw null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        getItemViewType(i17);
        androidx.appcompat.widget.ActivityChooserView activityChooserView = this.f9519d;
        if (view == null || view.getId() != com.tencent.mm.R.id.i3i) {
            view = android.view.LayoutInflater.from(activityChooserView.getContext()).inflate(com.tencent.mm.R.layout.f487884al, viewGroup, false);
        }
        activityChooserView.getContext().getPackageManager();
        getItem(i17);
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
