package w41;

/* loaded from: classes4.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f524417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f524418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f524419f;

    public s(android.view.ViewGroup viewGroup, k41.g0 g0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f524417d = viewGroup;
        this.f524418e = g0Var;
        this.f524419f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewGroup viewGroup = this.f524417d;
        android.content.Context context = viewGroup.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            j35.u.j(activity, 0, new w41.r(viewGroup, this.f524418e, this.f524419f), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}, null, null);
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
