package qg5;

/* loaded from: classes8.dex */
public final class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.v5 f444650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f444651e;

    public o5(qg5.v5 v5Var, db5.g3 g3Var) {
        this.f444650d = v5Var;
        this.f444651e = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoSummarizeTosDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("YuanBaoSummarizeTosDialog", "User accepted TOS");
        qg5.v5 v5Var = this.f444650d;
        v5Var.f444763e = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var = this.f444651e.f293588d;
        if (a4Var != null) {
            a4Var.dismiss();
        }
        yz5.a aVar = v5Var.f444760b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoSummarizeTosDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
