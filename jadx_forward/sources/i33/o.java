package i33;

/* loaded from: classes.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.u f369764d;

    public o(i33.u uVar) {
        this.f369764d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumFilePreviewUIC$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        i33.u uVar = this.f369764d;
        intent.putExtra("album_file_preview_send_as_file", uVar.T6().a().isChecked());
        intent.putExtra("album_file_preview_send", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = uVar.P6();
        if (P6 != null) {
            P6.setResult(-1, intent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = uVar.P6();
        if (P62 != null) {
            P62.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumFilePreviewUIC$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
