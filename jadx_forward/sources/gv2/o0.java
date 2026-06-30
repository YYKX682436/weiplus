package gv2;

/* loaded from: classes9.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gv2.c1 f357586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jv2.i f357587g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f357588h;

    public o0(android.view.View view, android.view.View view2, gv2.c1 c1Var, jv2.i iVar, boolean z17) {
        this.f357584d = view;
        this.f357585e = view2;
        this.f357586f = c1Var;
        this.f357587g = iVar;
        this.f357588h = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f357584d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f357585e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g2 g2Var = this.f357586f.f357529e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) g2Var).v(this.f357587g, this.f357588h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
