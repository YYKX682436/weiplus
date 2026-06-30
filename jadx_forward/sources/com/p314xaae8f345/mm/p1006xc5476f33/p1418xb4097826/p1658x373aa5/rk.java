package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class rk extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 f214497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4) {
        super(0);
        this.f214497d = c15346x1cf713c4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4 = this.f214497d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c15346x1cf713c4.m62375x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c15346x1cf713c4.m62375x4905e9fa().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$viewCallback$1$onChanged$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$viewCallback$1$onChanged$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        c15346x1cf713c4.a();
        android.view.View m62370xaaf4ce45 = c15346x1cf713c4.m62370xaaf4ce45();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m62370xaaf4ce45, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView", "refreshClearBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m62370xaaf4ce45.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m62370xaaf4ce45, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView", "refreshClearBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c15346x1cf713c4.m62370xaaf4ce45().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nk(c15346x1cf713c4));
        c15346x1cf713c4.m62370xaaf4ce45().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qk(c15346x1cf713c4));
        return jz5.f0.f384359a;
    }
}
