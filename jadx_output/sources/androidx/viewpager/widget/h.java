package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.viewpager.widget.ViewPager f12437d;

    public h(androidx.viewpager.widget.ViewPager viewPager) {
        this.f12437d = viewPager;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.viewpager.widget.ViewPager viewPager = this.f12437d;
        viewPager.setScrollState(0);
        viewPager.populate();
    }
}
