package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class sw implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 f201381d;

    public sw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248) {
        this.f201381d = c14407x4ca0b248;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = it.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b2482 = this.f201381d;
        if (i17 == c14407x4ca0b2482.f199212m && c14407x4ca0b2482.f199216q) {
            int i18 = it.arg1;
            this.f201381d.f199218s = i18;
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b m57929x351a7652 = this.f201381d.m57929x351a7652();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m57929x351a7652, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            m57929x351a7652.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m57929x351a7652, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b2483 = this.f201381d;
            java.util.LinkedList linkedList2 = c14407x4ca0b2483.f199209g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pw pwVar = linkedList2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pw) linkedList2.get(i18) : null;
            if (pwVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.e(11, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ow) pwVar).f200863a.m75945x2fec8307(2), c14407x4ca0b2483.gameAppId);
            }
            if (this.f201381d.f199215p && (linkedList = (c14407x4ca0b248 = this.f201381d).f199209g) != null) {
                if (i18 == linkedList.size() - 1) {
                    c14407x4ca0b248.m57929x351a7652().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rw(c14407x4ca0b248), 200L);
                } else {
                    c14407x4ca0b248.c();
                }
            }
        }
        return true;
    }
}
