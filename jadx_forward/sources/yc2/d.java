package yc2;

/* loaded from: classes2.dex */
public final class d extends xc2.o {
    @Override // xc2.j
    public void l() {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPreload jumpInfoEx is null=");
        sb6.append(this.f534695b == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DramaEventHandler", sb6.toString());
        xc2.p0 p0Var = this.f534695b;
        if (p0Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = p0Var.f534767a;
            if (c19786x6a1e2862 != null && c19786x6a1e2862.m76503x92bc3c07() == 2) {
                if (c19786x6a1e2862 == null || (m76494x46f709d9 = c19786x6a1e2862.m76494x46f709d9()) == null || (str = m76494x46f709d9.m77166xb5887639()) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DramaEventHandler", "doPreload url is null");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DramaEventHandler", "[preloadH5] url:".concat(str));
                zq1.i0 i0Var = new zq1.i0();
                i0Var.f556516a = str;
                i0Var.f556518c = 214;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(i0Var);
                ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
            }
        }
    }

    @Override // xc2.o, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        java.lang.String str = wo.w0.k() + '_' + java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str);
        infoEx.f534776e0 = linkedHashMap;
        super.r(holder, jumpView, infoEx);
    }
}
