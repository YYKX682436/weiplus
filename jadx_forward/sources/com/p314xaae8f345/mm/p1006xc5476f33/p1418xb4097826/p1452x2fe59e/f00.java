package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class f00 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 f188214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f188215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f188216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn5.a f188217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e f188218h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, java.util.List list, rn5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar) {
        super(0);
        this.f188214d = g00Var;
        this.f188215e = copyOnWriteArrayList;
        this.f188216f = list;
        this.f188217g = aVar;
        this.f188218h = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f188214d;
        o3Var.Zj(g00Var.f188330b.U0(), "StartCgi");
        java.util.Iterator it = this.f188215e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i17 = g00Var.f188332d;
            if (!hasNext) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zj(g00Var.f188330b.U0(), "StartCgi");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a.m(i17, g00Var.f188329a);
                boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.r1().r()).booleanValue();
                g00Var.f188333e.g(this.f188216f, this.f188217g, this.f188218h, booleanValue);
                return jz5.f0.f384359a;
            }
            ((ni3.a) it.next()).b(i17);
        }
    }
}
