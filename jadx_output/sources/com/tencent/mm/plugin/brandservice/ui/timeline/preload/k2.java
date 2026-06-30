package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f94333d;

    public k2(java.util.List list) {
        this.f94333d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : this.f94333d) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcher", "pre dns:" + java.net.InetAddress.getByName(str));
                com.tencent.mm.sdk.platformtools.a3 a3Var = yq1.z.f464496g;
                ((com.tencent.mm.sdk.platformtools.o4) yq1.z.f464498i.i()).G(str, true);
                linkedList.add(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebPrefetcher", "InetAddress Error, " + e17.getMessage());
            }
        }
        int size = linkedList.size();
        jz5.g gVar = cx4.s.f224654a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1200L, 1L, size);
    }
}
