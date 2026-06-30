package j93;

/* loaded from: classes.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f379958d;

    public k0(j93.r0 r0Var) {
        this.f379958d = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/uic/PlusMenuLabelUIC$onCreate$1$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j93.r0 r0Var = this.f379958d;
        r0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusMenuLabelUIC", "onImportContactFromLabelClick() called");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", r0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbk));
        intent.putExtra("list_attr", 64);
        intent.putExtra("showLabelWhenSearch", false);
        intent.putExtra("showContactScrollbar", false);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        intent.putExtra("Intent_KEY_SHOW_IV_MORE", true);
        pf5.j0.a(intent, ij5.d0.class);
        pf5.j0.a(intent, g93.l.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, hj5.e.class);
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = r0Var.m80379x76847179();
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.i(new j93.p0(r0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/uic/PlusMenuLabelUIC$onCreate$1$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
