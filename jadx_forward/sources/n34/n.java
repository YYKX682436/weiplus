package n34;

/* loaded from: classes4.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.p f416217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416218e;

    public n(n34.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f416217d = pVar;
        this.f416218e = c17933xe8d1b226;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$getSnsStarTeachView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/CommentDetailStarHelper$getSnsStarTeachView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommentDetailStarHelper", "click teach btn");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getClickCallback$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        n34.p pVar = this.f416217d;
        n34.o2 o2Var = pVar.f416237e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getClickCallback$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        if (o2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18026xb7ebaeb8) o2Var).a();
        }
        pVar.a(this.f416218e, 1, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/CommentDetailStarHelper$getSnsStarTeachView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$getSnsStarTeachView$1");
    }
}
