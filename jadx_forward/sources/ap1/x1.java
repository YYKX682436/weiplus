package ap1;

/* loaded from: classes5.dex */
public final class x1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public em.c4 f94296d;

    /* renamed from: e, reason: collision with root package name */
    public j75.f f94297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void T6(ap1.x1 x1Var, ap1.c2 c2Var) {
        x1Var.getClass();
        if (!c2Var.f94163n.isEmpty()) {
            java.lang.String m158362x2fec8307 = x1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ig8);
            em.c4 c4Var = x1Var.f94296d;
            if (c4Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            c4Var.c().setText(m158362x2fec8307 + '(' + c2Var.f94163n.size() + ')');
            em.c4 c4Var2 = x1Var.f94296d;
            if (c4Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            c4Var2.c().setEnabled(true);
        } else {
            em.c4 c4Var3 = x1Var.f94296d;
            if (c4Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            c4Var3.c().setText(com.p314xaae8f345.mm.R.C30867xcad56011.ig8);
            em.c4 c4Var4 = x1Var.f94296d;
            if (c4Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            c4Var4.c().setEnabled(false);
        }
        if (c2Var.f94164o <= 0) {
            em.c4 c4Var5 = x1Var.f94296d;
            if (c4Var5 != null) {
                c4Var5.a().setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        em.c4 c4Var6 = x1Var.f94296d;
        if (c4Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var6.a().setVisibility(0);
        em.c4 c4Var7 = x1Var.f94296d;
        if (c4Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.TextView a17 = c4Var7.a();
        em.c4 c4Var8 = x1Var.f94296d;
        if (c4Var8 != null) {
            a17.setText(c4Var8.a().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwm, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(c2Var.f94164o)));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        em.c4 c4Var = new em.c4(m80380x71e92c1d);
        this.f94296d = c4Var;
        if (c4Var.f335719k == null) {
            c4Var.f335719k = (android.widget.RelativeLayout) m80380x71e92c1d.findViewById(com.p314xaae8f345.mm.R.id.skw);
        }
        c4Var.f335719k.setVisibility(0);
        em.c4 c4Var2 = this.f94296d;
        if (c4Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var2.b().setVisibility(8);
        em.c4 c4Var3 = this.f94296d;
        if (c4Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var3.c().setOnClickListener(new ap1.v1(this));
        j75.f fVar = this.f94297e;
        if (fVar == null) {
            fVar = Q6();
            this.f94297e = fVar;
        }
        if (fVar != null) {
            fVar.L2(m158354x19263085(), new ap1.w1(this));
        }
    }
}
