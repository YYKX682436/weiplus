package rf4;

/* loaded from: classes4.dex */
public final class m0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f f476617d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f) {
        this.f476617d = c18482x82fd8d8f;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        yz5.a outsideClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$13", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f = this.f476617d;
        boolean z17 = false;
        if (c18482x82fd8d8f.f253502u != 3 && (outsideClickListener = c18482x82fd8d8f.getOutsideClickListener()) != null) {
            z17 = ((java.lang.Boolean) outsideClickListener.mo152xb9724478()).booleanValue();
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$13", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
