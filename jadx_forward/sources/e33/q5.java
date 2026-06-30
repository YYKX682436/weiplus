package e33;

/* loaded from: classes3.dex */
public class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd f328980d;

    public q5(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd) {
        this.f328980d = activityC15659x3c9ebdbd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd.f220154w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd = this.f328980d;
        activityC15659x3c9ebdbd.setResult(1);
        activityC15659x3c9ebdbd.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
