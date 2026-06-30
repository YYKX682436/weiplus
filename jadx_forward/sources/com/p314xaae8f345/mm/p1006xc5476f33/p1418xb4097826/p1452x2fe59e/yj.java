package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class yj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f192708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar) {
        super(0);
        this.f192708d = tlVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f192708d;
        int i17 = tlVar.f190616u + 1;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tlVar.g().f192609e;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        int a07 = i17 + c22848x6ddd90cf.a0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ql qlVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ql(400, tlVar.f190602d);
        qlVar.f93582a = a07;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = tlVar.g().f192608d.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.m8099x6305639d(qlVar);
        }
        return jz5.f0.f384359a;
    }
}
