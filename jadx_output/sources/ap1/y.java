package ap1;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f12765d;

    public y(ap1.i0 i0Var) {
        this.f12765d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamBaseContactProviderUIC$ContactAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j75.f U6 = this.f12765d.U6();
        if (U6 != null) {
            U6.B3(new ap1.d(ap1.e.f12644i, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamBaseContactProviderUIC$ContactAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
