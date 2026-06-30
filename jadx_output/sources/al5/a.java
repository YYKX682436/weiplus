package al5;

/* loaded from: classes10.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.AlbumChooserView f5861d;

    public a(com.tencent.mm.ui.widget.AlbumChooserView albumChooserView) {
        this.f5861d = albumChooserView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/AlbumChooserView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        al5.d dVar = this.f5861d.f211243g;
        if (dVar != null) {
            e33.x0 x0Var = (e33.x0) dVar;
            x0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onAlbumChooserViewClick.");
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = x0Var.f247534a;
            albumPreviewUI.f138514d2 = null;
            o23.m.f342426a.f342430d = 1;
            albumPreviewUI.T++;
            albumPreviewUI.playActionBarOperationAreaAnim();
            albumPreviewUI.f138540r.d();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/AlbumChooserView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
