package zx2;

/* loaded from: classes2.dex */
public class v implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f558622d;

    /* renamed from: e, reason: collision with root package name */
    public int f558623e;

    /* renamed from: f, reason: collision with root package name */
    public int f558624f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79) {
        this.f558622d = new java.lang.ref.WeakReference(c15436x4c00d79);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        this.f558623e = this.f558624f;
        this.f558624f = i17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) this.f558622d.get();
        if (c15436x4c00d79 != null) {
            int i19 = this.f558624f;
            c15436x4c00d79.o(i17, f17, i19 != 2 || this.f558623e == 1, (i19 == 2 && this.f558623e == 0) ? false : true);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) this.f558622d.get();
        if (c15436x4c00d79 == null || c15436x4c00d79.m62977xe06bcb0d() == i17 || i17 >= c15436x4c00d79.m62978x443e53f0()) {
            return;
        }
        int i18 = this.f558624f;
        c15436x4c00d79.m(c15436x4c00d79.i(i17), i18 == 0 || (i18 == 2 && this.f558623e == 0));
    }
}
