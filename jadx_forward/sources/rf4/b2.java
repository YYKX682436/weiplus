package rf4;

/* loaded from: classes4.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f476558d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331) {
        this.f476558d = c18486xb54a9331;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476558d;
        if (c18486xb54a9331.getCommentInputView().getInputType() != -1) {
            c18486xb54a9331.getCommentInputView().b();
        } else {
            c18486xb54a9331.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
