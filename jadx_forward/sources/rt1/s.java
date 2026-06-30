package rt1;

/* loaded from: classes7.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 f481016d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 activityC13028x321e1ca7) {
        this.f481016d = activityC13028x321e1ca7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 activityC13028x321e1ca7 = this.f481016d;
        rt1.l lVar = activityC13028x321e1ca7.f176143e;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputLayoutController");
            throw null;
        }
        java.lang.String str = lVar.f480980d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, activityC13028x321e1ca7.f176146h)) {
            activityC13028x321e1ca7.setResult(-1, new android.content.Intent().putExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT", str));
            activityC13028x321e1ca7.finish();
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(activityC13028x321e1ca7.f176141d, null, null, new rt1.w(activityC13028x321e1ca7, str, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
