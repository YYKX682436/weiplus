package ut4;

/* loaded from: classes15.dex */
public class a implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.C19182xecb10d41 f512716d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.C19182xecb10d41 c19182xecb10d41) {
        this.f512716d = c19182xecb10d41;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.C19182xecb10d41 c19182xecb10d41 = this.f512716d;
        if (c19182xecb10d41.f262777d.getParent() != null) {
            c19182xecb10d41.f262777d.getParent().requestDisallowInterceptTouchEvent(true);
        }
        c19182xecb10d41.f262778e.m79064x764e9211(i17);
    }
}
