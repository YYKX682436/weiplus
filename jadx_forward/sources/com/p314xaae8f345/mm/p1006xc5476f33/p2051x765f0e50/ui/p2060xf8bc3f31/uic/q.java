package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.r f243545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.r rVar) {
        super(1);
        this.f243545d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r24.d state = (r24.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof r24.c)) {
            r24.c cVar = (r24.c) dVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.r rVar = this.f243545d;
            ((java.util.ArrayList) rVar.f243548g).clear();
            java.util.List list = rVar.f243548g;
            ((java.util.ArrayList) list).addAll(cVar.f450383c);
            rVar.U6(new c24.b(list, rVar.m158354x19263085()));
            java.lang.String str = cVar.f450382b;
            rVar.f243546e = str;
            rVar.f243547f = cVar.f450384d;
            jz5.l[] lVarArr = new jz5.l[4];
            if (str == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("search_word", str);
            lVarArr[1] = new jz5.l("setting_sessionid", u24.n.b());
            java.lang.String str2 = rVar.f243547f;
            lVarArr[2] = new jz5.l("search_query_id", str2 != null ? str2 : "");
            lVarArr[3] = new jz5.l("ui_version", 2);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            java.lang.Integer REPORT_RULE = b24.a.f98927a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(REPORT_RULE, "REPORT_RULE");
            ((cy1.a) rVar2).Ej("setting_search_query_end", l17, REPORT_RULE.intValue());
            if (((java.util.ArrayList) list).isEmpty()) {
                android.view.View mo144222x4ff8c0f0 = rVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.t86);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/uic/SearchListUIC", "showEmptyText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/setting/ui/setting_new/uic/SearchListUIC", "showEmptyText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View mo144222x4ff8c0f02 = rVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.t86);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/uic/SearchListUIC", "hideEmptyText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/setting/ui/setting_new/uic/SearchListUIC", "hideEmptyText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
