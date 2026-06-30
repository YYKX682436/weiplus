package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class fl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f188285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f188286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar, so2.u1 u1Var) {
        super(0);
        this.f188285d = tlVar;
        this.f188286e = u1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(this.f188285d, this.f188286e, null, 0, 6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f188285d;
        long longExtra = tlVar.f190602d.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        if (longExtra > 0) {
            pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zj(tlVar, longExtra));
        }
        return jz5.f0.f384359a;
    }
}
