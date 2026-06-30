package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03;

/* loaded from: classes14.dex */
public class a extends p012xc85e97e9.p087x9da2e250.app.y1 implements u33.l {

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f220277i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f220278m;

    public a(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        super(abstractC1104xc1ad431d, 0);
        this.f220278m = new java.util.ArrayList();
        this.f220277i = abstractC1104xc1ad431d;
    }

    @Override // u33.l
    public void I(java.util.Map map) {
        java.util.Iterator it = ((java.util.ArrayList) this.f220278m).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next()).I(map);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db b(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f220278m).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3 = c15839xf36ce1db.f220244g;
            if (c15716x8f4414e3 != null && c15716x8f4414e3.f36470x8cea31d7 == i17) {
                return c15839xf36ce1db;
            }
        }
        return null;
    }

    @Override // u33.l
    public void c0(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f220278m).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next()).c0(i17);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return ((java.util.ArrayList) this.f220278m).size();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17) {
        java.util.List list = this.f220278m;
        return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) ((java.util.ArrayList) list).get(i17 % ((java.util.ArrayList) list).size());
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        return -2;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.y1, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) super.mo7744x8d1aed1d(viewGroup, i17);
        java.lang.String m7469xb5887064 = c15839xf36ce1db.m7469xb5887064();
        if (c15839xf36ce1db == mo7764xfb80e389(i17)) {
            return c15839xf36ce1db;
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = this.f220277i.m7630xb2c12e75();
        m7630xb2c12e75.j(c15839xf36ce1db);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) mo7764xfb80e389(i17);
        m7630xb2c12e75.h(viewGroup.getId(), c15839xf36ce1db2, m7469xb5887064, 1);
        m7630xb2c12e75.b(new p012xc85e97e9.p087x9da2e250.app.h2(7, c15839xf36ce1db2));
        m7630xb2c12e75.e();
        return c15839xf36ce1db2;
    }
}
