package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes5.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c f291483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.q f291484e;

    public r(com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c, yb5.q qVar) {
        this.f291483d = c22490xdfa0051c;
        this.f291484e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.q talkerInfo = this.f291484e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talkerInfo, "$talkerInfo");
        int i17 = com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c.f291437v;
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c = this.f291483d;
        c22490xdfa0051c.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c22490xdfa0051c, "group_msg_set_top_list");
        java.lang.ref.WeakReference weakReference = c22490xdfa0051c.chattingContextRef;
        if (weakReference != null && ((yb5.d) weakReference.get()) != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(c22490xdfa0051c, kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_list_length", java.lang.Integer.valueOf(c22490xdfa0051c.dataList.size()))), com.p314xaae8f345.mm.ui.p2738xb1dfbddb.s.a(talkerInfo)));
        }
        if (c22490xdfa0051c.f291447p.f291458a == com.p314xaae8f345.mm.ui.p2738xb1dfbddb.c.f291455d) {
            c22490xdfa0051c.m81029x29880849(c22490xdfa0051c.f291438d.getHeight());
        }
    }
}
