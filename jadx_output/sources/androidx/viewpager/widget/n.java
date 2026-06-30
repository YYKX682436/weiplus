package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public class n extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.viewpager.widget.ViewPager f12441a;

    public n(androidx.viewpager.widget.ViewPager viewPager) {
        this.f12441a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f12441a.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f12441a.dataSetChanged();
    }
}
