package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class m10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 f188874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 f188875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m10(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 c5539x720c286, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var) {
        super(0);
        this.f188874d = c5539x720c286;
        this.f188875e = r10Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 c5539x720c286 = this.f188874d;
        java.util.Objects.toString(c5539x720c286.f135863g.f88559a);
        am.jd jdVar = c5539x720c286.f135863g;
        jdVar.getClass();
        r45.r03 tag = jdVar.f88559a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tag, "tag");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188875e;
        if (r10Var.A(tag)) {
            r45.r03 tag2 = jdVar.f88559a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tag2, "tag");
            r10Var.f190403q = tag2;
            r10Var.B(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l10(r10Var));
        } else {
            if (r10Var.A(r10Var.f190403q)) {
                java.lang.Object clone = r10Var.f188689e.m56388xcaeb60d0().clone();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
                java.util.ArrayList arrayList = (java.util.ArrayList) clone;
                ey2.p2 p2Var = r10Var.f190412z;
                p2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFeedCacheVM", "lastDataList size=" + java.lang.Integer.valueOf(arrayList.size()) + ' ');
                p2Var.f339001e = arrayList;
            }
            r45.r03 tag3 = jdVar.f88559a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tag3, "tag");
            r10Var.f190403q = tag3;
            r10Var.B(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k10(r10Var));
        }
        return jz5.f0.f384359a;
    }
}
