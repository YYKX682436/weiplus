package wb5;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f525973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f525974e;

    public e(wb5.i iVar, wi5.n0 n0Var) {
        this.f525973d = iVar;
        this.f525974e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/uic/SelectSendCardUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactWeCom;
        wb5.i iVar = this.f525973d;
        if (f9Var.k(iVar.m158354x19263085(), null)) {
            android.content.Intent intent = new android.content.Intent(iVar.m158354x19263085().getIntent());
            intent.setClass(iVar.m158354x19263085(), com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22323x39e3762a.class);
            intent.removeExtra("titile");
            intent.putExtra("openim_appid", "3552365301");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = this.f525974e.f527852o.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                    arrayList2.add(str);
                }
            }
            intent.putExtra("already_select_contact", kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
            iVar.m158354x19263085().startActivityForResult(intent, 5);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/uic/SelectSendCardUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
