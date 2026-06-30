package mx;

/* loaded from: classes11.dex */
public final class e extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public static final mx.a f413346x = new mx.a(null);

    public final void c0(com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23468x660624ff info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        y(26, f413346x.a(info.m86555xb5887639()));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(info.m86556x6bf53a6c());
        java.lang.String d17 = n07 != null ? n07.d() : null;
        r45.lr4 lr4Var = new r45.lr4();
        lr4Var.set(10, info.m86556x6bf53a6c());
        lr4Var.set(1, info.m86554x7531c8a2());
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String m86556x6bf53a6c = info.m86556x6bf53a6c();
        ((sg3.a) v0Var).getClass();
        lr4Var.set(0, c01.a2.e(m86556x6bf53a6c));
        lr4Var.set(2, d17);
        lr4Var.set(5, d17);
        lr4Var.set(7, java.lang.Boolean.FALSE);
        r45.k97 k97Var = new r45.k97();
        k97Var.set(2, info.m86555xb5887639());
        k97Var.set(1, info.m86555xb5887639());
        k97Var.set(13, 90);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new mx.c(lr4Var, info, this, k97Var.mo14344x5f01b1f6(), null), 3, null);
    }

    public final void d0(bw5.v70 listenItem, boolean z17, android.graphics.Rect rect, android.graphics.Bitmap bitmap, yz5.l lVar) {
        r45.lr4 v07;
        ak3.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItem, "listenItem");
        y(24, listenItem.m13170xcc16feb8());
        if (rect != null && bitmap != null && (cVar = this.f381644d) != null) {
            ((ak3.i) cVar).s(rect, bitmap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        if (c16601x7ed0e40c != null) {
            bw5.zo0 zo0Var = new bw5.zo0();
            zo0Var.f117607d = listenItem;
            zo0Var.f117608e[1] = true;
            c16601x7ed0e40c.f66790x225a93cf = zo0Var.mo14344x5f01b1f6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f381610a;
        if (c16601x7ed0e40c2 != null && (v07 = c16601x7ed0e40c2.v0()) != null) {
            v07.set(1, listenItem.m13171x7531c8a2());
            v07.set(0, listenItem.c());
            v07.set(5, listenItem.d().b());
            v07.set(2, listenItem.f());
        }
        this.f381650j = new mx.d(lVar);
        V(!z17, 9, jk3.c.f381614e);
    }

    public final void e0(java.lang.String listenItemId, android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemId, "listenItemId");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai()) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
                c16601x7ed0e40c.f66791xc8a07680 = listenItemId;
                c16601x7ed0e40c.f66793x2262335f = 24;
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c)) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.We((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) c17, listenItemId, 24, false, 4, null);
                    if (activity != null) {
                        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
                        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.n5w);
                        e4Var.c();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMultiTaskHelper", "removeStar Exception=" + e17);
            }
        }
    }
}
