package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class p extends p012xc85e97e9.p087x9da2e250.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f223147i;

    public p(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        super(abstractC1104xc1ad431d, 0);
        this.f223147i = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return ((java.util.ArrayList) this.f223147i).size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        java.util.List list = this.f223147i;
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) ((java.util.ArrayList) list).get(i17 % ((java.util.ArrayList) list).size());
    }
}
