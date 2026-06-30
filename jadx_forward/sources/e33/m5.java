package e33;

/* loaded from: classes3.dex */
public class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd f328895d;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd) {
        this.f328895d = activityC15659x3c9ebdbd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd = this.f328895d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(activityC15659x3c9ebdbd.f220156e.getText())) {
            activityC15659x3c9ebdbd.setResult(-2, activityC15659x3c9ebdbd.getIntent().putExtra("send_raw_img", activityC15659x3c9ebdbd.f220170v));
            activityC15659x3c9ebdbd.finish();
        } else {
            activityC15659x3c9ebdbd.f220156e.setText("");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/SmartGalleryUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
