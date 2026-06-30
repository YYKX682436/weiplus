package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.viewpager.widget.PagerTabStrip f12432d;

    public b(androidx.viewpager.widget.PagerTabStrip pagerTabStrip) {
        this.f12432d = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        this.f12432d.f12409d.setCurrentItem(r2.getCurrentItem() - 1);
    }
}
