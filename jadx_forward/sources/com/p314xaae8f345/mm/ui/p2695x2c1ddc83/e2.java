package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class e2 extends ym5.n0 {
    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2 f2Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f2.f289197a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvItemExposureHelper", "notifymessage item explosure,isExposed = " + z17);
        if (z17) {
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.cip);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.storage.Conversation");
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) tag;
            int d17 = l4Var.d1();
            java.lang.String y07 = l4Var.y0();
            java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.cir);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) tag2).intValue();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l4Var.h1(), "notifymessage")) {
                ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d2(y07, intValue, d17));
            }
        }
    }
}
