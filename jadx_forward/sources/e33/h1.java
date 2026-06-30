package e33;

/* loaded from: classes4.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328777d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        this.f328777d = activityC15653x403456cd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328777d;
        activityC15653x403456cd.f220078v.performClick();
        if (activityC15653x403456cd.D) {
            activityC15653x403456cd.f220076t.setContentDescription(activityC15653x403456cd.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fhk));
        } else {
            activityC15653x403456cd.f220076t.setContentDescription(activityC15653x403456cd.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fhm));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
