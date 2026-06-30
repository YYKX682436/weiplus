package k85;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f386910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f386911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f386914i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386915m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f386916n;

    public c(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar2, java.lang.String str) {
        this.f386909d = lVar;
        this.f386910e = c0Var;
        this.f386911f = y1Var;
        this.f386912g = activity;
        this.f386913h = g0Var;
        this.f386914i = f0Var;
        this.f386915m = lVar2;
        this.f386916n = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f386909d;
        if (lVar != null) {
            lVar.mo146xb9724478(1);
        }
        this.f386910e.f391645d = true;
        this.f386911f.q();
        k85.t tVar = k85.t.f386972a;
        android.app.Activity activity = this.f386912g;
        d85.g0 g0Var = this.f386913h;
        d85.f0 f0Var = this.f386914i;
        k85.t.a(tVar, activity, g0Var, f0Var, new k85.b(activity, g0Var, f0Var, this.f386915m, this.f386909d, this.f386916n));
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessPermissionDialogUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
