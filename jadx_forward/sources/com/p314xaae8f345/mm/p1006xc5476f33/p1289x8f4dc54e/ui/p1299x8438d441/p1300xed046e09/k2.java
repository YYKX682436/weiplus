package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f175866d;

    public k2(java.util.List list) {
        this.f175866d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : this.f175866d) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcher", "pre dns:" + java.net.InetAddress.getByName(str));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a3 a3Var = yq1.z.f546029g;
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) yq1.z.f546031i.i()).G(str, true);
                linkedList.add(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetcher", "InetAddress Error, " + e17.getMessage());
            }
        }
        int size = linkedList.size();
        jz5.g gVar = cx4.s.f306187a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1200L, 1L, size);
    }
}
