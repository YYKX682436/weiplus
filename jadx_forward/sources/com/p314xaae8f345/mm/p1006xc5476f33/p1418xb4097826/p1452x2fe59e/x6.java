package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class x6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f192572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f192573e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, long j17) {
        super(0);
        this.f192572d = a7Var;
        this.f192573e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yw2.a0 a0Var = this.f192572d.f187749o;
        if (a0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DrawerPresenter", "onJumpToLastViewed viewCallback is null!!!");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae = a0Var.D;
            if (c15304x8ca13bae != null) {
                c15304x8ca13bae.m62122xc54f6a7a(true);
            }
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(a0Var.s()), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w6(this.f192572d, this.f192573e, a0Var, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
