package g72;

/* loaded from: classes.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 f350767d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4) {
        this.f350767d = activityC13520x8c9585b4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f350767d.f181584f.setChecked(!r7.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
