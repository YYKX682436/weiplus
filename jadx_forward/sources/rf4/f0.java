package rf4;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 f476580d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5) {
        this.f476580d = c18481x2b6a00e5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5 = this.f476580d;
        c18481x2b6a00e5.m71420x7a40225b(false);
        yz5.p commentInputCallback = c18481x2b6a00e5.getCommentInputCallback();
        if (commentInputCallback != null) {
            commentInputCallback.mo149xb9724478("", java.lang.Boolean.FALSE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
