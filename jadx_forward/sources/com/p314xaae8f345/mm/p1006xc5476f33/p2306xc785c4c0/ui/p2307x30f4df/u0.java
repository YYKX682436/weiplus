package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256618d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar) {
        this.f256618d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256618d;
        if (jVar.L) {
            yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        jVar.L = true;
        wm4.u.v(jVar.f256519d, jVar.f256521f);
        jx3.f.INSTANCE.d(15449, 0);
        if (jVar.f256534s.getVisibility() == 0) {
            android.view.View view2 = jVar.f256534s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.qn6 qn6Var = new r45.qn6();
            qn6Var.f465646d = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().z();
            qn6Var.f465654o = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().A();
            su4.k3.i(qn6Var, 106, 5, 0, c01.id.c() / 1000, "");
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().G("", "", 0L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
