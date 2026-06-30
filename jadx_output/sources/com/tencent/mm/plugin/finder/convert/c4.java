package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f103024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103025g;

    public c4(android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.convert.u4 u4Var, so2.y0 y0Var) {
        this.f103022d = view;
        this.f103023e = view2;
        this.f103024f = u4Var;
        this.f103025g = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f103022d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$35", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$35", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f103023e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$35", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$35", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f103024f.f104670e.o(this.f103025g, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
