package kk5;

/* loaded from: classes.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.v0 f390221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kk5.v0 v0Var) {
        super(1);
        this.f390221d = v0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        kk5.v0 v0Var = this.f390221d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            ((em.l2) ((jz5.n) v0Var.f390226d).mo141623x754a37bb()).e().setOnClickListener(new kk5.s0(v0Var, state));
        }
        if (((wi5.c) state.a(wi5.c.class)) != null) {
            java.util.LinkedList linkedList = state.f527852o;
            java.util.Iterator it = linkedList.iterator();
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) v0Var.f390227e.get((java.lang.String) it.next());
                if (num != null && num.intValue() == 1) {
                    i17++;
                } else if (num != null && num.intValue() == 3) {
                    i18++;
                }
            }
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ";");
            android.content.Intent intent = new android.content.Intent(v0Var.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679.class);
            intent.putExtra("mass_send_contact_list", c17);
            intent.putExtra("mass_send_contact_chatroom", i17);
            intent.putExtra("mass_send_contact_label", i18);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v0Var.m158354x19263085();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/ui/uic/SelectMassSendContactUIC$onCreate$2", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(m158354x19263085, "com/tencent/mm/ui/uic/SelectMassSendContactUIC$onCreate$2", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
