package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public class d extends android.database.DataSetObserver implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.l {

    /* renamed from: d, reason: collision with root package name */
    public int f12434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.viewpager.widget.PagerTitleStrip f12435e;

    public d(androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip) {
        this.f12435e = pagerTitleStrip;
    }

    @Override // androidx.viewpager.widget.l
    public void a(androidx.viewpager.widget.ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        this.f12435e.a(aVar, aVar2);
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip = this.f12435e;
        pagerTitleStrip.b(pagerTitleStrip.f12409d.getCurrentItem(), pagerTitleStrip.f12409d.getAdapter());
        float f17 = pagerTitleStrip.f12414i;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        pagerTitleStrip.c(pagerTitleStrip.f12409d.getCurrentItem(), f17, true);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        this.f12434d = i17;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        if (f17 > 0.5f) {
            i17++;
        }
        this.f12435e.c(i17, f17, false);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        if (this.f12434d == 0) {
            androidx.viewpager.widget.PagerTitleStrip pagerTitleStrip = this.f12435e;
            pagerTitleStrip.b(pagerTitleStrip.f12409d.getCurrentItem(), pagerTitleStrip.f12409d.getAdapter());
            float f17 = pagerTitleStrip.f12414i;
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            pagerTitleStrip.c(pagerTitleStrip.f12409d.getCurrentItem(), f17, true);
        }
    }
}
