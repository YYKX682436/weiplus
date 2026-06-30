package r23;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r23.m f450372d;

    public l(r23.m mVar) {
        this.f450372d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/mjtemplate/MaasAlbumTipPopup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r23.m mVar = this.f450372d;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "onNegativeClick: ");
        yz5.a aVar = mVar.f450376n;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        mVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/MaasAlbumTipPopup$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
