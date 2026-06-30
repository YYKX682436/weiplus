package rf4;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd f476606d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd) {
        this.f476606d = c18475x542840cd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/CommentsContainer$getItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a itemClickListener = this.f476606d.getItemClickListener();
        if (itemClickListener != null) {
            itemClickListener.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/CommentsContainer$getItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
