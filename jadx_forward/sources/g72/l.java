package g72;

/* loaded from: classes3.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 f350769d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4) {
        this.f350769d = activityC13520x8c9585b4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4.S;
        this.f350769d.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
