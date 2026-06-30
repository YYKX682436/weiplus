package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class y9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186534h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f186535i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(in5.s0 s0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, long j17) {
        super(0);
        this.f186530d = s0Var;
        this.f186531e = h0Var;
        this.f186532f = qeVar;
        this.f186533g = abstractC14490x69736cb5;
        this.f186534h = h0Var2;
        this.f186535i = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.s0 s0Var = this.f186530d;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.h6i);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) s0Var.p(com.p314xaae8f345.mm.R.id.h6j);
        r45.zu0 zu0Var = (r45.zu0) this.f186531e.f391656d;
        if (zu0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = this.f186533g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
            java.lang.String m59299x6bf53a6c = item.getFeedObject().m59299x6bf53a6c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f186532f;
            if (ro2.r.a(qeVar, item, 1, m59299x6bf53a6c, zu0Var)) {
                android.animation.AnimatorSet animatorSet = qeVar.f185899q;
                if (!(animatorSet != null && animatorSet.isRunning())) {
                    int m75939xb282bd08 = zu0Var.m75939xb282bd08(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar2 = this.f186532f;
                    in5.s0 s0Var2 = this.f186530d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p17);
                    ro2.r.d(qeVar2, s0Var2, p17, c22789xd23e9a9b, 1, m75939xb282bd08, true);
                    r45.bc1 bc1Var = new r45.bc1();
                    bc1Var.set(0, 1);
                    bc1Var.set(1, java.lang.Integer.valueOf(m75939xb282bd08));
                    bc1Var.set(2, java.lang.Long.valueOf(this.f186535i));
                    bc1Var.set(3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    this.f186534h.f391656d = bc1Var;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
