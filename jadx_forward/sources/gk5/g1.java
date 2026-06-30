package gk5;

/* loaded from: classes.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f354191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f354192e;

    public g1(gk5.k1 k1Var, wi5.n0 n0Var) {
        this.f354191d = k1Var;
        this.f354192e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactWeCom;
        gk5.k1 k1Var = this.f354191d;
        if (f9Var.k(k1Var.m158354x19263085(), null)) {
            android.content.Intent intent = new android.content.Intent(k1Var.m158354x19263085().getIntent());
            intent.setClass(k1Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22323x39e3762a.class);
            wi5.n0 n0Var = this.f354192e;
            intent.putExtra("max_limit_num", n0Var.f527849i);
            intent.removeExtra("titile");
            intent.putExtra("openim_appid", "3552365301");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.LinkedList linkedList = n0Var.f527852o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                    arrayList2.add(str);
                }
            }
            intent.putExtra("AlreadySelectOtherUserCount", linkedList.size() - arrayList2.size());
            intent.putExtra("already_select_contact", kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
            k1Var.m158354x19263085().startActivityForResult(intent, 5);
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
