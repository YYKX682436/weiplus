package bm2;

/* loaded from: classes3.dex */
public final class a2 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f103291d = "FinderLive.CustomGiftViewPagerAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f103292e = new java.util.ArrayList();

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f103291d, "destroyItem pos:" + i17);
        container.removeView((android.view.View) object);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f103292e.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f103291d, "instantiateItem pos:" + i17);
        java.lang.Object obj = this.f103292e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        android.view.View view = (android.view.View) obj;
        container.addView(view, new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams());
        return view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View p07, java.lang.Object p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p07, p17);
    }
}
