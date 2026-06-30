package g72;

/* loaded from: classes.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13525xb56e3034 f350765d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13525xb56e3034 activityC13525xb56e3034) {
        this.f350765d = activityC13525xb56e3034;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13525xb56e3034.f181624i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13525xb56e3034 activityC13525xb56e3034 = this.f350765d;
        activityC13525xb56e3034.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11390, 3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC13525xb56e3034, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614.class);
        intent.putExtra("k_need_signature", true);
        intent.putExtra("k_user_name", c01.z1.b());
        intent.putExtra("k_purpose", 1);
        activityC13525xb56e3034.startActivityForResult(intent, 1);
        activityC13525xb56e3034.f181629h = false;
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
