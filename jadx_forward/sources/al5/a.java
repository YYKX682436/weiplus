package al5;

/* loaded from: classes10.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 f87394d;

    public a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 c22596xee3b48b1) {
        this.f87394d = c22596xee3b48b1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/AlbumChooserView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        al5.d dVar = this.f87394d.f292776g;
        if (dVar != null) {
            e33.x0 x0Var = (e33.x0) dVar;
            x0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "onAlbumChooserViewClick.");
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = x0Var.f329067a;
            activityC15653x403456cd.f220047d2 = null;
            o23.m.f423959a.f423963d = 1;
            activityC15653x403456cd.T++;
            activityC15653x403456cd.m78547xfde6309c();
            activityC15653x403456cd.f220073r.d();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/AlbumChooserView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
