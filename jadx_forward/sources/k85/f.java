package k85;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f386929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386930g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f386931h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f386932i;

    public f(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f386927d = activity;
        this.f386928e = g0Var;
        this.f386929f = f0Var;
        this.f386930g = lVar;
        this.f386931h = c0Var;
        this.f386932i = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k85.t tVar = k85.t.f386972a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] click confirm " + this.f386927d + ", permission:" + this.f386928e + ", business:" + this.f386929f);
        yz5.l lVar = this.f386930g;
        if (lVar != null) {
            lVar.mo146xb9724478(4);
        }
        this.f386931h.f391645d = true;
        this.f386932i.q();
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
