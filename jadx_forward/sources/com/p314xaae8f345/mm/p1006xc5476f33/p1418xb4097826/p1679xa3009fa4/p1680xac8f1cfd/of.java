package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class of implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf f217004d;

    public of(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar) {
        this.f217004d = qfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showTipsBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar = this.f217004d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = qfVar.f217229f;
        if (c14994x9b99c079 != null) {
            java.lang.String desc = qfVar.f217230g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ze zeVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ze) qfVar.f217232i.get(java.lang.Long.valueOf(c14994x9b99c079.m59233x87980ca()));
            if (zeVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w8 w8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w8) zeVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.E0(w8Var.f186385a, w8Var.f186386b, w8Var.f186387c, false, 0L, null, 0, 0, false, 0L, 0, 0, 2044, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 j27 = w8Var.f186385a.f185891f.j2();
                if (j27 != null && (c15268x6a41bd8a = j27.f213600a) != null && (a7Var = c15268x6a41bd8a.presenter) != null) {
                    a7Var.p0(c15268x6a41bd8a.sceneForReply, new java.util.ArrayList(), desc);
                }
            }
            qfVar.O6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showTipsBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
