package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/tencent/mm/protocal/protobuf/FinderObject;", "jumpFeed", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$tryAppendGuideToDiscoverPlaceHolder$1 */
/* loaded from: classes2.dex */
public final class C13903x40d33685 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $response */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa<so2.j5> f35709xc556b065;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 f35710xcbdd23aa;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$tryAppendGuideToDiscoverPlaceHolder$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

        /* renamed from: $jumpFeed */
        final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f35711xca612310;

        /* renamed from: $response */
        final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa<so2.j5> f35712xc556b065;

        /* renamed from: this$0 */
        final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 f35713xcbdd23aa;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 c13888xeed42a34, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa<so2.j5> c13924x37151faa) {
            super(0);
            this.f35711xca612310 = c19792x256d2725;
            this.f35713xcbdd23aa = c13888xeed42a34;
            this.f35712xc556b065 = c13924x37151faa;
        }

        @Override // yz5.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
            m56308xb9724478();
            return jz5.f0.f384359a;
        }

        /* renamed from: invoke */
        public final void m56308xb9724478() {
            so2.n1 m56168xc992dee1;
            if (this.f35711xca612310 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f35713xcbdd23aa.getF204960d(), "tryAppendGuideToDiscoverPlaceHolder: no available hot feed, skip");
                this.f35713xcbdd23aa.m56173x1aafdb24(this.f35712xc556b065);
                return;
            }
            if (this.f35713xcbdd23aa.getHasMore()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f35713xcbdd23aa.getF204960d(), "tryAppendGuideToDiscoverPlaceHolder: hasMore became true, skip");
                return;
            }
            m56168xc992dee1 = this.f35713xcbdd23aa.m56168xc992dee1(this.f35711xca612310);
            int size = this.f35713xcbdd23aa.m56387xe6796cde().size();
            this.f35713xcbdd23aa.m56387xe6796cde().add(m56168xc992dee1);
            this.f35713xcbdd23aa.getDispatcher().d(size, 1);
            this.f35713xcbdd23aa.m56172x27a5bc07(size, 1);
            yz5.a guideToDiscoverAppendedCallback = this.f35713xcbdd23aa.getGuideToDiscoverAppendedCallback();
            if (guideToDiscoverAppendedCallback != null) {
                guideToDiscoverAppendedCallback.mo152xb9724478();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f35713xcbdd23aa.getF204960d(), "tryAppendGuideToDiscoverPlaceHolder: insert at " + size + " jumpId=" + this.f35711xca612310.m76784x5db1b11());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13903x40d33685(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 c13888xeed42a34, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa<so2.j5> c13924x37151faa) {
        super(1);
        this.f35710xcbdd23aa = c13888xeed42a34;
        this.f35709xc556b065 = c13924x37151faa;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        m56307xb9724478((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj);
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m56307xb9724478(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13903x40d33685.AnonymousClass1(c19792x256d2725, this.f35710xcbdd23aa, this.f35709xc556b065));
    }
}
