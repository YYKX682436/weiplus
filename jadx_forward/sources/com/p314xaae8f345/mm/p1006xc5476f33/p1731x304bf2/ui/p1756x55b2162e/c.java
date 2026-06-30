package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public final class c extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f222776i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f222777m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6) {
        super(fm6, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        this.f222776i = context;
        this.f222777m = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return ((java.util.ArrayList) this.f222777m).size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) ((java.util.ArrayList) this.f222777m).get(i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        return this.f222776i.getResources().getString(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d.f222785a[i17].intValue());
    }
}
