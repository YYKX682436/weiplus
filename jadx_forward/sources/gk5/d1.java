package gk5;

/* loaded from: classes.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f354176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f354177e;

    public d1(gk5.k1 k1Var, wi5.n0 n0Var) {
        this.f354176d = k1Var;
        this.f354177e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gk5.k1 k1Var = this.f354176d;
        k1Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(k1Var.m158354x19263085(), "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("group_select_type", true);
        intent.putExtra("group_select_need_result", true);
        wi5.n0 n0Var = this.f354177e;
        if (n0Var.f527848h == 14) {
            intent.putExtra("group_multi_select", true);
            java.util.LinkedList linkedList = n0Var.f527852o;
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.addAll(linkedList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) it.next());
            }
            intent.putExtra("already_select_contact", kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
            intent.putExtra("max_limit_num", n0Var.f527849i);
            k1Var.m158354x19263085().startActivityForResult(intent, 4);
        } else {
            k1Var.m158354x19263085().startActivityForResult(intent, 0);
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/SelectTransmitUserReturnUIC$onCreate$1$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
