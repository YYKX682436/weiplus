package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSingleFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/ui/sm;", "Lcom/tencent/mm/plugin/finder/ui/rm;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSingleFeedDetailUI */
/* loaded from: classes2.dex */
public final class ActivityC15078xb786a5b1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sm, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rm> {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 A;

    /* renamed from: x, reason: collision with root package name */
    public final int f210325x = 1;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rm f210326y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sm f210327z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = this.A;
        if (abstractC13834x56f46d28 != null) {
            return abstractC13834x56f46d28;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rm rmVar = this.f210326y;
        if (rmVar != null) {
            return rmVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sm smVar = this.f210327z;
        if (smVar != null) {
            return smVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570626b91;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public void h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rm rmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rm(this, 1);
        this.f210326y = rmVar;
        this.f210327z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sm(this, rmVar, this.f210325x, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15098x774ebdd9 c15098x774ebdd9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15098x774ebdd9(this);
        this.A = c15098x774ebdd9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rm rmVar2 = this.f210326y;
        if (rmVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sm smVar = this.f210327z;
        if (smVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        rmVar2.X(c15098x774ebdd9, smVar);
        long longExtra = getIntent().getLongExtra("feed_object_id", 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = getIntent().getBooleanExtra("feed_is_local", false) ? cu2.u.f303974a.f(longExtra) : bu2.j.f106067a.h(longExtra);
        if (f17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(f17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rm rmVar3 = this.f210326y;
            if (rmVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            java.util.ArrayList f18 = rmVar3.f();
            if (f18 != null) {
                f18.add(p17);
            }
        }
    }
}
