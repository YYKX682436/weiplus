package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes8.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f284509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.m2 f284510e;

    public j2(db5.g3 g3Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.m2 m2Var) {
        this.f284509d = g3Var;
        this.f284510e = m2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/MultiSelectCopyWarningDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSelectCopyWarningDialog", "User accepted TOS");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var = this.f284509d.f293588d;
        if (a4Var != null) {
            a4Var.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.m2 m2Var = this.f284510e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) m2Var.f284540c).mo141623x754a37bb();
        if (o4Var != null) {
            o4Var.putBoolean("multiselect_copy_warning_dialog_accepted", true);
        }
        yz5.a aVar = m2Var.f284538a;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/MultiSelectCopyWarningDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
