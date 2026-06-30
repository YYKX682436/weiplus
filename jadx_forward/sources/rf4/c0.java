package rf4;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 f476562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476563e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5, android.content.Context context) {
        this.f476562d = c18481x2b6a00e5;
        this.f476563e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5 = this.f476562d;
        if (!c18481x2b6a00e5.f253481u) {
            c18481x2b6a00e5.f253480t = 2;
            c18481x2b6a00e5.m71420x7a40225b(true);
            c18481x2b6a00e5.f253471h.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f476563e, com.p314xaae8f345.mm.R.raw.f79915x64991f25, -1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
