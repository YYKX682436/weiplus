package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class bj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f210488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f210489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(fc2.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        super(0);
        this.f210488d = aVar;
        this.f210489e = activityC15076x7a6c76b6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        java.lang.String m75945x2fec8307;
        ec2.a aVar = (ec2.a) this.f210488d;
        if (aVar.f332479d == 12 && (h17 = bu2.j.f106067a.h(aVar.f332480e)) != null && (feedObject = h17.getFeedObject()) != null && (m76806xdef68064 = feedObject.m76806xdef68064()) != null && (m75945x2fec8307 = m76806xdef68064.m75945x2fec8307(25)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f210489e;
            java.lang.String str = activityC15076x7a6c76b6.B1;
            if (str == null || str.length() == 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l9) ((jz5.n) activityC15076x7a6c76b6.f210302b2).mo141623x754a37bb()).b(m75945x2fec8307);
            } else {
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj(activityC15076x7a6c76b6.B1, "onFinderFeedNegativeFeedback", "{\"currentTid\": \"" + m75945x2fec8307 + "\"}");
            }
        }
        return jz5.f0.f384359a;
    }
}
