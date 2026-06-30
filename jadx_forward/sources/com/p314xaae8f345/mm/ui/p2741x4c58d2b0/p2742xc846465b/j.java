package com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b;

/* loaded from: classes7.dex */
public final class j implements db5.k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.j f292590a = new com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.j();

    @Override // db5.k4
    public final void a(android.widget.ImageView imageView, db5.h4 h4Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h4Var.A)) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.y.a())) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, h4Var.A, null);
            return;
        }
        try {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.s) ((kv.y) i95.n0.c(kv.y.class))).wi(imageView, h4Var.A);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.RecentForwardUtils", "attachAvatar for username:" + h4Var.A + ", get exception:" + e17);
        }
    }
}
