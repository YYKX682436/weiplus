package cu2;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f303916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f303917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f303918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f303919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f303920h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303921i;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.view.View view, android.view.View view2, android.view.View view3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, android.content.Context context) {
        this.f303916d = abstractC14490x69736cb5;
        this.f303917e = view;
        this.f303918f = view2;
        this.f303919g = view3;
        this.f303920h = e3Var;
        this.f303921i = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0 b0Var = hb2.b0.f361558e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f303916d;
        b0Var.o(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), abstractC14490x69736cb5.getFeedObject().getFeedObject(), abstractC14490x69736cb5.getFeedObject().m59276x6c285d75(), r45.uh2.SelectComment, new cu2.d(abstractC14490x69736cb5, this.f303921i));
        android.view.View view2 = this.f303917e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f303918f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f303919g;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f303920h.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
