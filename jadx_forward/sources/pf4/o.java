package pf4;

/* loaded from: classes4.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf4.q f435413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gf4.a f435414e;

    public o(pf4.q qVar, gf4.a aVar) {
        this.f435413d = qVar;
        this.f435414e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$StoryCommentViewHolder$onBindOpTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f435413d.f435419f;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f435414e, java.lang.Boolean.FALSE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$StoryCommentViewHolder$onBindOpTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
