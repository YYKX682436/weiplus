package k85;

/* loaded from: classes5.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f386960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f386961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f386964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386965i;

    public p(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar) {
        this.f386960d = c0Var;
        this.f386961e = y1Var;
        this.f386962f = activity;
        this.f386963g = g0Var;
        this.f386964h = f0Var;
        this.f386965i = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f386960d.f391645d = true;
        this.f386961e.q();
        k85.t tVar = k85.t.f386972a;
        d85.f0 f0Var = this.f386964h;
        yz5.l lVar = this.f386965i;
        android.app.Activity activity = this.f386962f;
        d85.g0 g0Var = this.f386963g;
        k85.t.a(tVar, activity, g0Var, null, new k85.o(activity, g0Var, f0Var, lVar));
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
