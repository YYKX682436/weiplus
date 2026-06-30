package bm2;

/* loaded from: classes3.dex */
public final class a2 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f21758d = "FinderLive.CustomGiftViewPagerAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f21759e = new java.util.ArrayList();

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        com.tencent.mars.xlog.Log.i(this.f21758d, "destroyItem pos:" + i17);
        container.removeView((android.view.View) object);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f21759e.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object object) {
        kotlin.jvm.internal.o.g(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        com.tencent.mars.xlog.Log.i(this.f21758d, "instantiateItem pos:" + i17);
        java.lang.Object obj = this.f21759e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        android.view.View view = (android.view.View) obj;
        container.addView(view, new androidx.viewpager.widget.ViewPager.LayoutParams());
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View p07, java.lang.Object p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        return kotlin.jvm.internal.o.b(p07, p17);
    }
}
