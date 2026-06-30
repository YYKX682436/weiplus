package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 f200249a;

    public j2(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 bannerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bannerView, "bannerView");
        this.f200249a = bannerView;
    }

    public final void a(r45.n73 gameInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameInfo, "gameInfo");
        r45.x53 x53Var = (r45.x53) gameInfo.m75936x14adae67(4);
        java.util.LinkedList m75941xfb821914 = x53Var != null ? x53Var.m75941xfb821914(0) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update ");
        java.lang.Object obj = (r45.x53) gameInfo.m75936x14adae67(4);
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderGameLivePostTaskWidget", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248 = this.f200249a;
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            c14407x4ca0b248.setVisibility(4);
            return;
        }
        c14407x4ca0b248.setVisibility(0);
        r45.z53 z53Var = (r45.z53) gameInfo.m75936x14adae67(1);
        c14407x4ca0b248.m57932x95c51c08(z53Var != null ? z53Var.m75945x2fec8307(0) : null);
        java.util.List V = kz5.n0.V(m75941xfb821914);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(V, 10));
        java.util.Iterator it = ((java.util.ArrayList) V).iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ow((r45.y53) it.next(), ((r45.x53) gameInfo.m75936x14adae67(4)) != null ? r7.m75939xb282bd08(1) : 0L));
        }
        c14407x4ca0b248.m57936x426c5493(arrayList);
        c14407x4ca0b248.f199215p = true;
        c14407x4ca0b248.c();
    }
}
