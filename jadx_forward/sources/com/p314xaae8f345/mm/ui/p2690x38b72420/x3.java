package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes3.dex */
public class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.a4 f288778d;

    public x3(com.p314xaae8f345.mm.ui.p2690x38b72420.a4 a4Var) {
        this.f288778d = a4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/FMessageContactView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20239x152d18ed()) == 1;
        com.p314xaae8f345.mm.ui.p2690x38b72420.a4 a4Var = this.f288778d;
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageContactView", "initNoNew, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new)");
            j45.l.j(a4Var.f288113d, "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageContactView", "initNoNew, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
            j45.l.j(a4Var.f288113d, "subapp", ".ui.friend.FMessageConversationUI", new android.content.Intent(), null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/FMessageContactView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
