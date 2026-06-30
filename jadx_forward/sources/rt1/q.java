package rt1;

/* loaded from: classes7.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 f481008d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 activityC13028x321e1ca7) {
        this.f481008d = activityC13028x321e1ca7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f481008d.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
