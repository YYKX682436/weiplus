package k85;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f386924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f386926h;

    public e(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f386922d = activity;
        this.f386923e = g0Var;
        this.f386924f = f0Var;
        this.f386925g = lVar;
        this.f386926h = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k85.t tVar = k85.t.f386972a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] click cancel " + this.f386922d + ", permission:" + this.f386923e + ", business:" + this.f386924f);
        yz5.l lVar = this.f386925g;
        if (lVar != null) {
            lVar.mo146xb9724478(3);
        }
        this.f386926h.q();
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
