package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class t4 extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f236131i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(java.util.List fragments, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6) {
        super(fm6, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        this.f236131i = fragments;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    public long a(int i17) {
        return java.lang.System.identityHashCode(this.f236131i.get(i17));
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f236131i.size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f236131i.get(i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int c07 = kz5.n0.c0(this.f236131i, item);
        if (c07 == -1) {
            return -2;
        }
        return c07;
    }
}
