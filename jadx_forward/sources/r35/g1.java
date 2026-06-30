package r35;

/* loaded from: classes9.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j f450646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f450647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f450648f;

    public g1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, android.view.View view, db5.d5 d5Var) {
        this.f450646d = jVar;
        this.f450647e = view;
        this.f450648f = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = this.f450646d;
        if (jVar != null) {
            android.view.View view2 = this.f450647e;
            jVar.a(true, r35.j1.a(view2), r35.j1.b(view2));
        }
        db5.d5 d5Var = this.f450648f;
        d5Var.dismiss();
        d5Var.setFocusable(false);
        d5Var.setTouchable(false);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
