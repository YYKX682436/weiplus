package r35;

/* loaded from: classes9.dex */
public class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j f450792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f450793e;

    public t0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, db5.d5 d5Var) {
        this.f450792d = jVar;
        this.f450793e = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = this.f450792d;
        if (jVar != null) {
            jVar.a(false, null, 0);
        }
        db5.d5 d5Var = this.f450793e;
        d5Var.dismiss();
        d5Var.setFocusable(false);
        d5Var.setTouchable(false);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
