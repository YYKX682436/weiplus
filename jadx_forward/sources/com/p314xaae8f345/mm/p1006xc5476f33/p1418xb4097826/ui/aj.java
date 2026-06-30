package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class aj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f210398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f210399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(fc2.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        super(0);
        this.f210398d = aVar;
        this.f210399e = activityC15076x7a6c76b6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        java.lang.String m75945x2fec8307;
        fc2.t tVar = (fc2.t) this.f210398d;
        int i17 = tVar.f342522h;
        int i18 = tVar.f342527m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f210399e;
        if (i17 >= 0) {
            activityC15076x7a6c76b6.f210311k2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6.x7(activityC15076x7a6c76b6, i17);
            activityC15076x7a6c76b6.E7().B = activityC15076x7a6c76b6.f210311k2;
        }
        if (i18 >= 0) {
            boolean z17 = true;
            if (i18 != activityC15076x7a6c76b6.f210314m2) {
                activityC15076x7a6c76b6.f210314m2 = i18;
                if (i18 <= 1 && activityC15076x7a6c76b6.f210306f2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var = activityC15076x7a6c76b6.E;
                    if (w8Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                        throw null;
                    }
                    if (w8Var.o().getEnableRefresh() && activityC15076x7a6c76b6.E7().L) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = activityC15076x7a6c76b6.D;
                        if (qmVar == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                            throw null;
                        }
                        qmVar.j0();
                    }
                }
            }
            if (activityC15076x7a6c76b6.f210301a2 || (activityC15076x7a6c76b6.mo55332x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15074xeba4993)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(tVar.f342525k);
                java.lang.Long valueOf = h17 != null ? java.lang.Long.valueOf(h17.m59251x5db1b11()) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = activityC15076x7a6c76b6.f210313l2;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, c14994x9b99c079 != null ? java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()) : null)) {
                    activityC15076x7a6c76b6.f210313l2 = h17;
                    if (h17 != null && (feedObject = h17.getFeedObject()) != null && (m76806xdef68064 = feedObject.m76806xdef68064()) != null && (m75945x2fec8307 = m76806xdef68064.m75945x2fec8307(25)) != null && activityC15076x7a6c76b6.f210301a2) {
                        ((sg0.w2) ((tg0.r1) i95.n0.c(tg0.r1.class))).ij(m75945x2fec8307, null);
                        java.lang.String str = activityC15076x7a6c76b6.B1;
                        if (str != null && str.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l9) ((jz5.n) activityC15076x7a6c76b6.f210302b2).mo141623x754a37bb()).a(m75945x2fec8307);
                        } else {
                            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj(activityC15076x7a6c76b6.B1, "onFinderFeedFocusChange", "{\"currentTid\": \"" + m75945x2fec8307 + "\"}");
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
