package cj5;

/* loaded from: classes.dex */
public final class u4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.x4 f123786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(cj5.x4 x4Var) {
        super(1);
        this.f123786d = x4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        cj5.x4 x4Var = this.f123786d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = x4Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo64405x4dab7448(x4Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            em.l2 T6 = x4Var.T6();
            if (T6.f336099w == null) {
                T6.f336099w = (android.widget.LinearLayout) T6.f336077a.findViewById(com.p314xaae8f345.mm.R.id.r4h);
            }
            T6.f336099w.setVisibility(((java.lang.Boolean) ((jz5.n) x4Var.f123806e).mo141623x754a37bb()).booleanValue() ? 0 : 8);
            x4Var.T6().i().setChecked(((java.lang.Boolean) ((jz5.n) x4Var.f123807f).mo141623x754a37bb()).booleanValue());
            em.l2 T62 = x4Var.T6();
            if (T62.f336099w == null) {
                T62.f336099w = (android.widget.LinearLayout) T62.f336077a.findViewById(com.p314xaae8f345.mm.R.id.r4h);
            }
            T62.f336099w.setOnClickListener(new cj5.t4(x4Var));
        }
        if (state.e()) {
            j75.d dVar2 = state.f379599d;
            if (dVar2 != null && (dVar2 instanceof wi5.t0) && (eVar = ((wi5.t0) dVar2).f379600a) != null && (eVar instanceof wi5.w0)) {
                if (((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                    x4Var.U6(state);
                }
            }
            j75.d dVar3 = state.f379599d;
            if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
                x4Var.U6(state);
            }
        }
        j75.d dVar4 = state.f379599d;
        java.util.LinkedList list = state.f527852o;
        if (dVar4 != null && (dVar4 instanceof wi5.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectCustomContactUIC", "ClickCancelMenuAction: " + list);
            new android.content.Intent().putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ","));
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof wi5.r)) {
            x4Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.util.LinkedList linkedList = x4Var.f123809h;
            linkedList.clear();
            linkedList.addAll(list);
        }
        return jz5.f0.f384359a;
    }
}
