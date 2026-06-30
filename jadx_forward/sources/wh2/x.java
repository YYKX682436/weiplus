package wh2;

/* loaded from: classes2.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c f527497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c c14232xa386119c) {
        super(c14232xa386119c, false, 1, null);
        this.f527497a = c14232xa386119c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo1056x14dcd783(response, lVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c c14232xa386119c = this.f527497a;
        c14232xa386119c.m56387xe6796cde().clear();
        java.util.AbstractCollection m56387xe6796cde = c14232xa386119c.m56387xe6796cde();
        java.util.List m56409x97891cf7 = response.m56409x97891cf7();
        m56387xe6796cde.addAll(m56409x97891cf7 != null ? kz5.n0.S0(m56409x97891cf7) : new java.util.ArrayList());
        yz5.l lVar2 = c14232xa386119c.f193231h;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(response);
        }
        c14232xa386119c.f193231h = null;
    }
}
