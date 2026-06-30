package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class m10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderTagClickEvent f107341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f107342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m10(com.tencent.mm.autogen.events.FinderTagClickEvent finderTagClickEvent, com.tencent.mm.plugin.finder.feed.r10 r10Var) {
        super(0);
        this.f107341d = finderTagClickEvent;
        this.f107342e = r10Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderTagClickEvent finderTagClickEvent = this.f107341d;
        java.util.Objects.toString(finderTagClickEvent.f54330g.f7026a);
        am.jd jdVar = finderTagClickEvent.f54330g;
        jdVar.getClass();
        r45.r03 tag = jdVar.f7026a;
        kotlin.jvm.internal.o.f(tag, "tag");
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f107342e;
        if (r10Var.A(tag)) {
            r45.r03 tag2 = jdVar.f7026a;
            kotlin.jvm.internal.o.f(tag2, "tag");
            r10Var.f108870q = tag2;
            r10Var.B(new com.tencent.mm.plugin.finder.feed.l10(r10Var));
        } else {
            if (r10Var.A(r10Var.f108870q)) {
                java.lang.Object clone = r10Var.f107156e.getDataListJustForAdapter().clone();
                kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
                java.util.ArrayList arrayList = (java.util.ArrayList) clone;
                ey2.p2 p2Var = r10Var.f108879z;
                p2Var.getClass();
                com.tencent.mars.xlog.Log.i("Finder.FinderTopicFeedCacheVM", "lastDataList size=" + java.lang.Integer.valueOf(arrayList.size()) + ' ');
                p2Var.f257468e = arrayList;
            }
            r45.r03 tag3 = jdVar.f7026a;
            kotlin.jvm.internal.o.f(tag3, "tag");
            r10Var.f108870q = tag3;
            r10Var.B(new com.tencent.mm.plugin.finder.feed.k10(r10Var));
        }
        return jz5.f0.f302826a;
    }
}
