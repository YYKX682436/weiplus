package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34;

/* loaded from: classes10.dex */
public final class a implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 f210543d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa10) {
        this.f210543d = c15104x4e0baa10;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.Iterator it;
        java.util.List list = (java.util.List) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa10 = this.f210543d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.c cVar = c15104x4e0baa10.f210542z;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        java.lang.String query = c15104x4e0baa10.f210541y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConvSearchFeedPresenter", "onSearchResult size=" + list.size());
        java.util.ArrayList arrayList = cVar.f210545d;
        arrayList.size();
        arrayList.clear();
        java.util.Iterator it6 = list.iterator();
        long j17 = -1;
        while (it6.hasNext()) {
            r45.bu2 bu2Var = (r45.bu2) it6.next();
            long m75942xfb822ef2 = bu2Var.m75942xfb822ef2(0);
            java.lang.String m75945x2fec8307 = bu2Var.m75945x2fec8307(3);
            r45.kv2 kv2Var = (r45.kv2) bu2Var.m75936x14adae67(2);
            long m75942xfb822ef22 = bu2Var.m75942xfb822ef2(1);
            if (m75942xfb822ef2 == 0 || kv2Var == null || m75942xfb822ef22 == 0) {
                it = it6;
            } else {
                long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(m75942xfb822ef22));
                it = it6;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.c(kv2Var), 16);
                a18.m59398x5361953a(m75942xfb822ef2);
                a18.m59399x48e26f8(m75945x2fec8307);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(a18);
                if (a17 != j17) {
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.n(m75942xfb822ef22));
                    j17 = a17;
                }
                arrayList.add(p17);
            }
            it6 = it;
        }
        cVar.c().f210560f = query;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = cVar.c().b().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        cVar.c().d();
        cVar.c().c().i(true);
        cVar.c().c().E(true);
        if (arrayList.isEmpty()) {
            cVar.c().f();
            on5.c m82923x19404fcc = cVar.c().c().m82923x19404fcc();
            android.view.View view = m82923x19404fcc != null ? m82923x19404fcc.getView() : null;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            on5.c m82923x19404fcc2 = cVar.c().c().m82923x19404fcc();
            android.view.View view3 = m82923x19404fcc2 != null ? m82923x19404fcc2.getView() : null;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                android.view.View view4 = view3;
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        cVar.c().e();
    }
}
