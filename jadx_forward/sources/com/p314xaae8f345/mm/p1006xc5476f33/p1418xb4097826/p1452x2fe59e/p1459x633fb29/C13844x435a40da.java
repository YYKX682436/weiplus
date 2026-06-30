package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$memberStatusListener$1$callback$1$1 */
/* loaded from: classes2.dex */
public final class C13844x435a40da extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $event */
    final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae f35591x4334e8f6;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f35592xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13844x435a40da(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae c5705xaea272ae) {
        super(0);
        this.f35592xcbdd23aa = abstractC13834x56f46d28;
        this.f35591x4334e8f6 = c5705xaea272ae;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m56144xb9724478();
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m56144xb9724478() {
        java.util.AbstractCollection m56387xe6796cde = this.f35592xcbdd23aa.m56387xe6796cde();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae c5705xaea272ae = this.f35591x4334e8f6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = this.f35592xcbdd23aa;
        int i17 = 0;
        for (java.lang.Object obj : m56387xe6796cde) {
            int i18 = i17 + 1;
            if (i17 >= 0) {
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                    if (abstractC14490x69736cb5.getFeedObject().m59315x31740422()) {
                        ya2.b2 contact = abstractC14490x69736cb5.getContact();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contact != null ? contact.D0() : null, c5705xaea272ae.f136027g.f89356b)) {
                            abstractC13834x56f46d28.getDispatcher().c(i17, 1, new jz5.l(39, 1));
                        }
                    }
                }
                i17 = i18;
            } else {
                kz5.c0.p();
                throw null;
            }
        }
    }
}
