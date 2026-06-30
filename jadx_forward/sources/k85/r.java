package k85;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f386967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f386968e;

    public r(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f386967d = c0Var;
        this.f386968e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f386967d.f391645d = true;
        this.f386968e.q();
        yj0.a.h(this, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showRequestPermissionDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
