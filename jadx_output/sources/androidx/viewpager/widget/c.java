package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.viewpager.widget.PagerTabStrip f12433d;

    public c(androidx.viewpager.widget.PagerTabStrip pagerTabStrip) {
        this.f12433d = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.viewpager.widget.ViewPager viewPager = this.f12433d.f12409d;
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
    }
}
