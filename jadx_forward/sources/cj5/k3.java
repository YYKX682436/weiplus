package cj5;

/* loaded from: classes.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.n3 f123696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(cj5.n3 n3Var) {
        super(1);
        this.f123696d = n3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view;
        android.widget.LinearLayout linearLayout;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        cj5.n3 n3Var = this.f123696d;
        if (dVar != null && (dVar instanceof wi5.q)) {
            wi5.q qVar = (wi5.q) dVar;
            android.view.View view2 = n3Var.f123734d;
            if (view2 != null && state.f527852o.size() > 0) {
                int e17 = com.p314xaae8f345.mm.ui.zk.e(n3Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.gxy);
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(linearLayout2.getWidth(), e17));
                }
            }
            j75.f Q6 = n3Var.Q6();
            if (Q6 != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) n3Var.f123735e).mo141623x754a37bb()).k();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
                Q6.B3(new wi5.o(qVar.f527867b, qVar.f527868c, k17));
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.t)) {
            wi5.t tVar = (wi5.t) dVar2;
            if (!((java.lang.Boolean) ((jz5.n) n3Var.f123736f).mo141623x754a37bb()).booleanValue() && (view = n3Var.f123734d) != null && (linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.gxy)) != null) {
                linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(linearLayout.getWidth(), tVar.f527873b));
            }
        }
        return jz5.f0.f384359a;
    }
}
