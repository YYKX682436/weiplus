package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6;

/* loaded from: classes2.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s f202876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar) {
        super(1);
        this.f202876d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b401;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (response.getErrCode() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar = this.f202876d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b4012 = sVar.f202879f;
            if (c13875x75a8b4012.f189048g != 0) {
                java.util.Iterator it = c13875x75a8b4012.m56387xe6796cde().iterator();
                int i17 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    c13875x75a8b401 = sVar.f202879f;
                    if (!hasNext) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject().m76784x5db1b11() == c13875x75a8b401.f189048g) {
                        break;
                    }
                    i17++;
                }
                if (i17 != -1) {
                    so2.j5 j5Var2 = (so2.j5) c13875x75a8b401.m56387xe6796cde().get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2;
                    abstractC14490x69736cb5.Y0(true);
                    abstractC14490x69736cb5.m1(false);
                    abstractC14490x69736cb5.Z0(false);
                    if (sVar.f202882i != 0 && (wVar = sVar.f202880g) != null) {
                        java.lang.Object obj2 = c13875x75a8b401.m56387xe6796cde().get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = wVar.f202908i;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar2 = wVar.f202904e;
                        sVar2.f(abstractActivityC21394xb3d2c0cf, sVar2.j2(), (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2, wVar.f202905f, sVar2.f202882i, null, 11);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w wVar2 = sVar.f202880g;
                    if (wVar2 != null && (m62367x4905e9fa2 = wVar2.a().m62367x4905e9fa()) != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(m62367x4905e9fa2, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAPresenter$onAttach$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "Undefined", "scrollToPosition", "(I)V");
                        m62367x4905e9fa2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(m62367x4905e9fa2, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAPresenter$onAttach$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w wVar3 = sVar.f202880g;
                    if (wVar3 != null && (m62367x4905e9fa = wVar3.a().m62367x4905e9fa()) != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
                        mo7946xf939df19.m8151xc67946d3(i17, 1);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
