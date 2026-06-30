package qg5;

/* loaded from: classes8.dex */
public final class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.a4 f444756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f444757e;

    public v3(qg5.a4 a4Var, db5.g3 g3Var) {
        this.f444756d = a4Var;
        this.f444757e = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoCopyChatRecordsTosDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "User accepted TOS");
        qg5.a4 a4Var = this.f444756d;
        a4Var.f444444e = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var2 = this.f444757e.f293588d;
        if (a4Var2 != null) {
            a4Var2.dismiss();
        }
        yz5.a aVar = a4Var.f444441b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoCopyChatRecordsTosDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
