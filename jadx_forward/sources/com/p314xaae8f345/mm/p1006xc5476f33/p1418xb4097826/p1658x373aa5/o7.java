package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class o7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214303d;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f214303d = c15270x6d877a34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214303d;
        if (i17 >= 27) {
            c15270x6d877a34.m61896xa11d1648().performHapticFeedback(3);
        } else {
            c15270x6d877a34.m61896xa11d1648().performHapticFeedback(3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (t70Var.C2() > 0) {
            t70Var.c3(0);
            android.view.View m61900x6d7448b9 = c15270x6d877a34.m61900x6d7448b9();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m61900x6d7448b9, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m61900x6d7448b9.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m61900x6d7448b9, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c15270x6d877a34.m61846x7c6fc64c(0.0f);
            c15270x6d877a34.m61900x6d7448b9().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.n7(c15270x6d877a34));
        }
        yz5.a aVar = c15270x6d877a34.switchSceneListener;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        c15270x6d877a34.m61940x53aed94a(c15270x6d877a34.com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String == 2 ? 1 : 2);
        c15270x6d877a34.u(false, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
