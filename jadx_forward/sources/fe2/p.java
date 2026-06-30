package fe2;

/* loaded from: classes3.dex */
public final class p implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.q f343057d;

    public p(fe2.q qVar) {
        this.f343057d = qVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "onPageSelected: " + i17 + " positionOffset: " + f17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "onPageSelected: " + i17);
        fe2.q qVar = this.f343057d;
        java.lang.Object obj = qVar.f343064v.f362431e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        ee2.a aVar = (ee2.a) obj;
        if (aVar.f333116g instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0) {
            qVar.D1();
        } else {
            qVar.v1(aVar.f333113d);
        }
        int i18 = 0;
        for (java.lang.Object obj2 : qVar.f343064v.f362431e) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((ee2.a) obj2).j(i18 == i17);
            i18 = i19;
        }
    }
}
