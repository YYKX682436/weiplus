package sf4;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f488990d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        this.f488990d = c18497x85806502;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ze4.h hVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488990d;
        if (c18497x85806502.f253642z.size() == 1 && ((java.util.ArrayList) c18497x85806502.f253642z.get(0)).isEmpty() && (hVar = c18497x85806502.C) != null) {
            hVar.Y0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
