package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes10.dex */
public final /* synthetic */ class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public f0(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.class, "openCommentInputFooter", "openCommentInputFooter(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        so2.y0 p07 = (so2.y0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084) this.f72685xcfcbe9ef;
        activityC14126xa5cf9084.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = activityC14126xa5cf9084.C;
        if (c15270x6d877a34 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageFlowUI", "openCommentInputFooter footer is null");
        } else {
            c15270x6d877a34.m61915x77118bb7(activityC14126xa5cf9084.d7().O6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.m0(c15270x6d877a34, activityC14126xa5cf9084);
            c15270x6d877a34.m61882x623e5088().setOnClickListener(m0Var);
            c15270x6d877a34.m61887xecb8bbf0().setOnClickListener(m0Var);
            c15270x6d877a34.l();
            c15270x6d877a34.m61916x710e23e0(0);
            c15270x6d877a34.m61940x53aed94a(activityC14126xa5cf9084.d7().f191355f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.v(c15270x6d877a34, true, false, 2, null);
            android.view.View view = activityC14126xa5cf9084.B;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "openCommentInputFooter", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "openCommentInputFooter", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = activityC14126xa5cf9084.f191314y;
            if (f5Var != null) {
                f5Var.f();
            }
            c15270x6d877a34.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.j0(c15270x6d877a34, activityC14126xa5cf9084, p07));
        }
        return jz5.f0.f384359a;
    }
}
