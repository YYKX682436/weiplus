package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class j10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 f188600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var) {
        super(0);
        this.f188600d = r10Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188600d;
        int size = r10Var.f188689e.m56388xcaeb60d0().size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = r10Var.f188690f;
        int a07 = a1Var != null ? a1Var.o().a0() : 0;
        r10Var.f188689e.m56388xcaeb60d0().clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = r10Var.f188690f;
        if (a1Var2 != null) {
            a1Var2.o().m8154xdb81fc7f(a07, size);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = r10Var.f188690f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10) a1Var3;
        synchronized (x10Var) {
            x10Var.W();
        }
        r10Var.v();
        return jz5.f0.f384359a;
    }
}
