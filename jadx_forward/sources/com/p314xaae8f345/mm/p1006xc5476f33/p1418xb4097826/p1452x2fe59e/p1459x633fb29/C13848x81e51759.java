package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$postRefFeedCommentEvent$1$callback$1 */
/* loaded from: classes2.dex */
public final class C13848x81e51759 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $event */
    final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5520x1f521b06 f35597x4334e8f6;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f35598xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13848x81e51759(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5520x1f521b06 c5520x1f521b06) {
        super(0);
        this.f35598xcbdd23aa = abstractC13834x56f46d28;
        this.f35597x4334e8f6 = c5520x1f521b06;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m56146xb9724478();
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m56146xb9724478() {
        java.util.List m56387xe6796cde = this.f35598xcbdd23aa.m56387xe6796cde();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5520x1f521b06 c5520x1f521b06 = this.f35597x4334e8f6;
        java.util.Iterator it = m56387xe6796cde.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11() == c5520x1f521b06.f135848g.f89606a) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != -1) {
            this.f35598xcbdd23aa.getDispatcher().c(i17, 1, new jz5.l(41, this.f35597x4334e8f6));
        }
    }
}
