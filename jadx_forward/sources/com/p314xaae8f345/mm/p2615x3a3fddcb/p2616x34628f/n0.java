package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes4.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n85.t f275078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.p1 f275080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f275081g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(n85.t tVar, android.content.Context context, com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.p1 p1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(0);
        this.f275078d = tVar;
        this.f275079e = context;
        this.f275080f = p1Var;
        this.f275081g = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n85.t tVar = this.f275078d;
        int i17 = tVar.f417264k & 64;
        android.content.Context context = this.f275079e;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.s0.o(context, this.f275080f, this.f275081g, tVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            java.lang.String snsId = tVar.f417257d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlatformOp", "showDetailUI() called with: context = " + context + ", snsId = " + snsId);
            dx1.g.f326022a.j("MomentsTogetherHistoryBrowsing", "withFriendDetailCount", snsId, bx1.u.f117846h);
        }
        return jz5.f0.f384359a;
    }
}
