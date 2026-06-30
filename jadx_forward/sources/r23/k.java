package r23;

/* loaded from: classes4.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r23.m f450371d;

    public k(r23.m mVar) {
        this.f450371d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/mjtemplate/MaasAlbumTipPopup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r23.m mVar = this.f450371d;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "onPositiveClick: ");
        yz5.l lVar = mVar.f450375m;
        if (lVar != null) {
            lVar.mo146xb9724478(mVar.f450373k);
        }
        mVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/MaasAlbumTipPopup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
