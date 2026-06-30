package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13862x71aee939 f189321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f189322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f189323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13862x71aee939 c13862x71aee939, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa, yz5.l lVar) {
        super(0);
        this.f189321d = c13862x71aee939;
        this.f189322e = c13924x37151faa;
        this.f189323f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13862x71aee939 c13862x71aee939 = this.f189321d;
        int size = c13862x71aee939.m56387xe6796cde().size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa = this.f189322e;
        if (size > 0) {
            java.util.List m56409x97891cf7 = c13924x37151faa.m56409x97891cf7();
            if (m56409x97891cf7 != null) {
                if (!(m56409x97891cf7.size() == 1)) {
                    m56409x97891cf7 = null;
                }
                if (m56409x97891cf7 != null) {
                    c13862x71aee939.m56387xe6796cde().set(0, m56409x97891cf7.get(0));
                    c13862x71aee939.getDispatcher().c(0, 1, 1);
                }
            }
        } else {
            java.util.AbstractCollection m56387xe6796cde = c13862x71aee939.m56387xe6796cde();
            java.util.List m56409x97891cf72 = c13924x37151faa.m56409x97891cf7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m56409x97891cf72);
            m56387xe6796cde.addAll(m56409x97891cf72);
            c13862x71aee939.getDispatcher().a();
        }
        yz5.l lVar = this.f189323f;
        if (lVar != null) {
            lVar.mo146xb9724478(c13924x37151faa);
        }
        return jz5.f0.f384359a;
    }
}
