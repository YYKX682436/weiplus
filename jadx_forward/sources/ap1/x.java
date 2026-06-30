package ap1;

/* loaded from: classes5.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.b0 f94291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f94292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.z f94293f;

    public x(ap1.b0 b0Var, ap1.i0 i0Var, ap1.z zVar) {
        this.f94291d = b0Var;
        this.f94292e = i0Var;
        this.f94293f = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamBaseContactProviderUIC$ContactAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f94291d.m8183xf806b362();
        if (m8183xf806b362 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamBaseContactProviderUIC$ContactAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        j75.f U6 = this.f94292e.U6();
        if (U6 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamBaseContactProviderUIC$ContactAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        U6.B3(new ap1.h2(!((ap1.c2) U6.mo140437x75286adb()).d(r7.f94133a), (ap1.a0) this.f94293f.f94301d.get(m8183xf806b362), null, 4, null));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamBaseContactProviderUIC$ContactAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
