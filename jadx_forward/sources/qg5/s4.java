package qg5;

/* loaded from: classes.dex */
public final class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f444710d;

    public s4(db5.g3 g3Var) {
        this.f444710d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoForwardChatRecordsTosDialog$createDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var = this.f444710d.f293588d;
        if (a4Var != null) {
            a4Var.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoForwardChatRecordsTosDialog$createDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
