package ap1;

/* loaded from: classes5.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.b2 f94300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ap1.b2 b2Var) {
        super(1);
        this.f94300d = b2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        ap1.b2 b2Var = this.f94300d;
        if (dVar != null && (dVar instanceof ap1.e2)) {
            ap1.e2 e2Var = (ap1.e2) dVar;
            if (b2Var.f94148d == null) {
                android.view.View inflate = ((android.view.ViewStub) b2Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.rjt)).inflate();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                b2Var.f94148d = linearLayout;
                android.view.View findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.rgi);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                b2Var.f94149e = (android.widget.TextView) findViewById;
                android.widget.LinearLayout linearLayout2 = b2Var.f94148d;
                if (linearLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("errorContentLl");
                    throw null;
                }
                android.view.View findViewById2 = linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.rgg);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                b2Var.f94150f = (android.widget.TextView) findViewById2;
                android.widget.LinearLayout linearLayout3 = b2Var.f94148d;
                if (linearLayout3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("errorContentLl");
                    throw null;
                }
                android.view.View findViewById3 = linearLayout3.findViewById(com.p314xaae8f345.mm.R.id.rgf);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                b2Var.f94151g = (android.widget.Button) findViewById3;
            }
            android.widget.LinearLayout linearLayout4 = b2Var.f94148d;
            if (linearLayout4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("errorContentLl");
                throw null;
            }
            linearLayout4.setVisibility(0);
            android.widget.TextView textView = b2Var.f94149e;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                throw null;
            }
            textView.setText(e2Var.f94181a);
            android.widget.TextView textView2 = b2Var.f94150f;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hint");
                throw null;
            }
            java.lang.CharSequence charSequence = e2Var.f94182b;
            if (charSequence == null) {
                charSequence = "";
            }
            textView2.setText(charSequence);
            android.widget.Button button = b2Var.f94151g;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btn");
                throw null;
            }
            java.lang.CharSequence charSequence2 = e2Var.f94183c;
            if (charSequence2 == null) {
                charSequence2 = b2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.m77);
            }
            button.setText(charSequence2);
            yz5.a aVar = e2Var.f94184d;
            if (aVar == null) {
                aVar = new ap1.a2(b2Var);
            }
            android.widget.Button button2 = b2Var.f94151g;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btn");
                throw null;
            }
            button2.setOnClickListener(new ap1.z1(aVar));
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof ap1.b)) {
            android.widget.LinearLayout linearLayout5 = b2Var.f94148d;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
