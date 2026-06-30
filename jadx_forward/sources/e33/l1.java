package e33;

/* loaded from: classes4.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328849d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        this.f328849d = activityC15653x403456cd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328849d;
        boolean z17 = !activityC15653x403456cd.H1;
        activityC15653x403456cd.H1 = z17;
        if (z17) {
            activityC15653x403456cd.f220080x.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
        } else {
            activityC15653x403456cd.f220080x.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
        }
        boolean z18 = activityC15653x403456cd.H1;
        activityC15653x403456cd.getClass();
        activityC15653x403456cd.a8(activityC15653x403456cd.f220061m.J());
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
