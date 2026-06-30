package zm5;

/* loaded from: classes3.dex */
public final class h implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.l f555756d;

    public h(zm5.l lVar) {
        this.f555756d = lVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f18;
        if (i18 == 0) {
            zm5.l lVar = this.f555756d;
            if (lVar.f555774o == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryPageUIC", "onScroll>> position: " + i17);
                fn5.a aVar = lVar.f555766d;
                if (aVar != null && (f18 = aVar.f(0, true)) != null) {
                    f18.i();
                }
                if (lVar.f555775p) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = lVar.m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    zm5.g gVar = (zm5.g) pf5.z.f435481a.a(activity).a(zm5.g.class);
                    java.lang.String str = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) lVar.f555768f.get(i17)).f134739g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getScanImagePath(...)");
                    gVar.P6(str, lVar.f555770h);
                    lVar.f555775p = false;
                }
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryPageUIC", i17 + " + select");
        zm5.l lVar = this.f555756d;
        lVar.f555771i = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) lVar.f555768f.get(i17)).f134736d;
        lVar.f555772m = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) lVar.f555768f.get(i17)).f134743n;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((zm5.t) pf5.z.f435481a.a(activity).a(zm5.t.class)).P6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((zm5.f0) pf5.z.f435481a.a(activity2).a(zm5.f0.class)).O6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        zm5.g gVar = (zm5.g) pf5.z.f435481a.a(activity3).a(zm5.g.class);
        java.lang.String str = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) lVar.f555768f.get(i17)).f134739g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getScanImagePath(...)");
        gVar.P6(str, lVar.f555770h);
        lVar.f555774o = lVar.f555769g;
        lVar.f555769g = i17;
    }
}
