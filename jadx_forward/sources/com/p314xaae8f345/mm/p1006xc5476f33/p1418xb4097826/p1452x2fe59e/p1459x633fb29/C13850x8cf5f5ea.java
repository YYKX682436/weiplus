package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$updateProgressByLocalId$1 */
/* loaded from: classes2.dex */
public final class C13850x8cf5f5ea extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $localId */
    final /* synthetic */ long f35600xafd60942;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f35601xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13850x8cf5f5ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, long j17) {
        super(0);
        this.f35601xcbdd23aa = abstractC13834x56f46d28;
        this.f35600xafd60942 = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m56148xb9724478();
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m56148xb9724478() {
        java.util.AbstractCollection m56387xe6796cde = this.f35601xcbdd23aa.m56387xe6796cde();
        long j17 = this.f35600xafd60942;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = this.f35601xcbdd23aa;
        int i17 = 0;
        for (java.lang.Object obj : m56387xe6796cde) {
            int i18 = i17 + 1;
            if (i17 >= 0) {
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                    if (abstractC14490x69736cb5.getFeedObject().m59260x51f8f5b0() == j17 && (!abstractC14490x69736cb5.getFeedObject().m59315x31740422() || (abstractC13834x56f46d28.mo56129x53879461() & abstractC14490x69736cb5.getFeedObject().m59261x994d4fc7()) != 0)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = cu2.u.f303974a.f(j17);
                        if (f17 != null) {
                            java.util.AbstractList m56387xe6796cde2 = abstractC13834x56f46d28.m56387xe6796cde();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 m56130xc9add0e5 = abstractC13834x56f46d28.m56130xc9add0e5(f17);
                            abstractC13834x56f46d28.b(abstractC14490x69736cb5, m56130xc9add0e5);
                            m56387xe6796cde2.set(i17, m56130xc9add0e5);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13834x56f46d28.getF204960d(), "updateProgressByLoalId " + abstractC14490x69736cb5.getFeedObject().m59260x51f8f5b0());
                        abstractC13834x56f46d28.getDispatcher().c(i17, 1, new jz5.l(2, 1));
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
