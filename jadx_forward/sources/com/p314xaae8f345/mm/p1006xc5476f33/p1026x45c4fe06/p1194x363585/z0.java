package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public class z0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f170755n = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand0";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k G(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 serviceType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceType, "serviceType");
        int ordinal = serviceType.ordinal();
        if (ordinal == 0) {
            return super.G(serviceType);
        }
        if (ordinal != 1) {
            return null;
        }
        if (L(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSingleProcessManager", "tryPreloadNextTaskProcess serviceType = [" + serviceType + "] reachedMaxLimit");
            return null;
        }
        java.util.List k17 = k();
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : k17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) obj;
            if (kVar.u(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f170755n, kVar.i())) {
                arrayList.add(obj);
            }
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar2 : arrayList) {
            if ((kVar2.k() && kVar2.l()) || kVar2.k()) {
                return kVar2;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) kz5.n0.X(arrayList);
    }

    public final void Q(java.util.ArrayList arrayList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.m[] mVarArr = {new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12677x8e7a5057.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12651x49153ca4.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12303xb197ef1e.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11744x9c036fb0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12393xed1fd52b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12658xb00da3fe.class), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12678x8e7a5058.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12652x49153ca5.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12304xb197ef1f.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11745x9c036fb1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12394xed1fd52c.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12659xb00da3ff.class), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12679x8e7a5059.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12653x49153ca6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12305xb197ef20.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11746x9c036fb2.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12395xed1fd52d.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12660xb00da400.class), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12680x8e7a505a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12654x49153ca7.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12306xb197ef21.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11747x9c036fb3.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12396xed1fd52e.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12661xb00da401.class), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12302xbb67ff73.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11743x682124a1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12392xed1fd52a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.class)};
        int h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.h();
        if (h17 >= 1) {
            arrayList.add(mVarArr[0]);
        }
        if (h17 >= 2) {
            arrayList.add(mVarArr[1]);
        }
        if (h17 >= 3) {
            arrayList.add(mVarArr[2]);
        }
        if (h17 >= 4) {
            arrayList.add(mVarArr[3]);
        }
        if (h17 >= 5) {
            arrayList.add(mVarArr[4]);
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k[] o() {
        java.util.ArrayList d17 = kz5.c0.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12672x40cfba9a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12302xbb67ff73.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11743x682124a1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12392xed1fd52a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.class), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12673x40cfba9b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12302xbb67ff73.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11743x682124a1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12392xed1fd52a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.class), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12674x40cfba9c.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12302xbb67ff73.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11743x682124a1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12392xed1fd52a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.class), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12675x40cfba9d.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12302xbb67ff73.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11743x682124a1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12392xed1fd52a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.class), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12676x40cfba9e.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.ServiceC12302xbb67ff73.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11743x682124a1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1143x1410e13c.ServiceC12392xed1fd52a.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.class));
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) it.next()).t(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e);
        }
        Q(d17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.a()) {
            d17.add(d17.size(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.n());
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k[]) d17.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k[0]);
    }
}
