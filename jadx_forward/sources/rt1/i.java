package rt1;

/* loaded from: classes7.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f480952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f480953e;

    public i(rt1.l lVar, int i17) {
        this.f480952d = lVar;
        this.f480953e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditInputLayoutController$init$2$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f480952d.b(this.f480953e);
        yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditInputLayoutController$init$2$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
