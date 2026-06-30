package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes2.dex */
public final class l0 extends p012xc85e97e9.p087x9da2e250.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f237820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6, java.util.List fragments) {
        super(fm6, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.f237820d = fragments;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f237820d.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.e2
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f237820d.get(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPickerPagerAdapter", "getItem position:" + i17);
        return componentCallbacksC1101xa17d4670;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.e2, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        java.lang.Object mo7744x8d1aed1d = super.mo7744x8d1aed1d(container, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo7744x8d1aed1d, "instantiateItem(...)");
        container.toString();
        mo7744x8d1aed1d.toString();
        return mo7744x8d1aed1d;
    }
}
