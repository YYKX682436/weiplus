package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class o6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 f189757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f189758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f189759f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91, long j17, boolean z17) {
        super(0);
        this.f189757d = c13885xb1569e91;
        this.f189758e = j17;
        this.f189759f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 D0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91 = this.f189757d;
        java.util.Iterator it = c13885xb1569e91.m56387xe6796cde().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) next;
            if (j5Var instanceof so2.k0) {
                so2.k0 k0Var = (so2.k0) j5Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = k0Var.f491985d;
                long j17 = x80Var.f66236x88be67a1;
                long j18 = this.f189758e;
                if (j17 == j18) {
                    boolean m59315x31740422 = x80Var.t0().m59315x31740422();
                    boolean z17 = c13885xb1569e91.f189114e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var2 = k0Var.f491985d;
                    if (((m59315x31740422 && z17) || (!z17 && !x80Var2.t0().m59315x31740422())) && (D0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(j18)) != null) {
                        java.util.AbstractList m56387xe6796cde = c13885xb1569e91.m56387xe6796cde();
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91.f189112o;
                        m56387xe6796cde.set(i17, new so2.k0(D0));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13885xb1569e91.getB(), "updateDraft, index:" + i17 + ", " + x80Var2.v0());
                        if (this.f189759f) {
                            c13885xb1569e91.getDispatcher().b(i17, 1);
                        } else {
                            c13885xb1569e91.getDispatcher().c(i17, 1, new jz5.l(2, 1));
                        }
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
