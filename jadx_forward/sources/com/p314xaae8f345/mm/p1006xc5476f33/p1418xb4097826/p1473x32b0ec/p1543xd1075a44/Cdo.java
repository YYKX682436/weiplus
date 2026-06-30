package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.do, reason: invalid class name */
/* loaded from: classes10.dex */
public final class Cdo implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7 f199667d;

    public Cdo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7 abstractC14403x128da8a7) {
        this.f199667d = abstractC14403x128da8a7;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 1) {
            int i17 = it.arg1;
            this.f199667d.f199197i = i17;
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b m57918x351a7652 = this.f199667d.m57918x351a7652();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m57918x351a7652, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            m57918x351a7652.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m57918x351a7652, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            if (this.f199667d.f199198m) {
                java.util.LinkedList m57915xe6796cde = this.f199667d.m57915xe6796cde();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7 abstractC14403x128da8a7 = this.f199667d;
                if (i17 == m57915xe6796cde.size() - 1) {
                    abstractC14403x128da8a7.m57918x351a7652().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.co(abstractC14403x128da8a7), 200L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7.b(abstractC14403x128da8a7);
                }
            }
        }
        return true;
    }
}
