package e33;

/* loaded from: classes10.dex */
public class u5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.w5 f329024d;

    public u5(e33.w5 w5Var) {
        this.f329024d = w5Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$AlbumInfoAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag();
        if (tag instanceof t23.f2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(this.f329024d.f329060d, "media info", ((t23.f2) tag).m165740x9616526c(), null);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$AlbumInfoAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
