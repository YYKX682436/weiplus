package sm1;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f490855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f490856e;

    public i(yz5.l lVar, int i17) {
        this.f490855d = lVar;
        this.f490856e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f490855d.mo146xb9724478(java.lang.Integer.valueOf(this.f490856e));
        yj0.a.h(this, "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
