package e22;

/* loaded from: classes10.dex */
public final class d implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520 f328164d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520 activityC13334x22686520) {
        this.f328164d = activityC13334x22686520;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        this.f328164d.X6().s(i17, f17, false, true);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520 activityC13334x22686520 = this.f328164d;
        oa.i k17 = activityC13334x22686520.X6().k(i17);
        if (k17 != null) {
            k17.b();
        }
        if (i17 != 0) {
            activityC13334x22686520.W6().m54824x69566739(4);
        } else {
            activityC13334x22686520.W6().m54824x69566739(0);
            activityC13334x22686520.W6().a();
        }
    }
}
