package w23;

/* loaded from: classes8.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.C15638x5a203cd0 f524131d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.C15638x5a203cd0 c15638x5a203cd0) {
        this.f524131d = c15638x5a203cd0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/picker/GalleryPickerFragment$initGalleryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f524131d.f219989g = !r7.f219989g;
        throw null;
    }
}
