package rb2;

/* loaded from: classes3.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f475270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475271e;

    public r0(rb2.y0 y0Var, so2.y0 y0Var2) {
        this.f475270d = y0Var;
        this.f475271e = y0Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$bindReplyButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f475270d.f475366i.mo146xb9724478(this.f475271e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$bindReplyButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
