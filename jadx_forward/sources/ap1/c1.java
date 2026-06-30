package ap1;

/* loaded from: classes5.dex */
public final class c1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f94154d;

    /* renamed from: e, reason: collision with root package name */
    public em.c4 f94155e;

    /* renamed from: f, reason: collision with root package name */
    public j75.f f94156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f94154d = -1L;
    }

    public static final void T6(ap1.c1 c1Var, ap1.c2 c2Var) {
        c1Var.getClass();
        if (!c2Var.f94163n.isEmpty()) {
            java.lang.String m158362x2fec8307 = c1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mvr);
            em.c4 c4Var = c1Var.f94155e;
            if (c4Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            c4Var.b().setText(m158362x2fec8307 + '(' + c2Var.f94163n.size() + ')');
            em.c4 c4Var2 = c1Var.f94155e;
            if (c4Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            c4Var2.b().setEnabled(true);
        } else {
            em.c4 c4Var3 = c1Var.f94155e;
            if (c4Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            c4Var3.b().setText(com.p314xaae8f345.mm.R.C30867xcad56011.mvr);
            em.c4 c4Var4 = c1Var.f94155e;
            if (c4Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            c4Var4.b().setEnabled(false);
        }
        if (c2Var.f94164o <= 0) {
            em.c4 c4Var5 = c1Var.f94155e;
            if (c4Var5 != null) {
                c4Var5.a().setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        em.c4 c4Var6 = c1Var.f94155e;
        if (c4Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var6.a().setVisibility(0);
        em.c4 c4Var7 = c1Var.f94155e;
        if (c4Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.TextView a17 = c4Var7.a();
        em.c4 c4Var8 = c1Var.f94155e;
        if (c4Var8 != null) {
            a17.setText(c4Var8.a().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvi, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(c2Var.f94164o)));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final j75.f U6() {
        j75.f fVar = this.f94156f;
        if (fVar != null) {
            return fVar;
        }
        j75.f Q6 = Q6();
        this.f94156f = Q6;
        return Q6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        long longExtra = m158359x1e885992().getLongExtra("packageId", -1L);
        this.f94154d = longExtra;
        if (longExtra < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pf5.o.TAG, "Invalid package id = " + this.f94154d);
            j75.f U6 = U6();
            if (U6 != null) {
                U6.B3(new ap1.c(null, 1, null));
                return;
            }
            return;
        }
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        em.c4 c4Var = new em.c4(m80380x71e92c1d);
        this.f94155e = c4Var;
        if (c4Var.f335719k == null) {
            c4Var.f335719k = (android.widget.RelativeLayout) m80380x71e92c1d.findViewById(com.p314xaae8f345.mm.R.id.skw);
        }
        c4Var.f335719k.setVisibility(0);
        em.c4 c4Var2 = this.f94155e;
        if (c4Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var2.c().setVisibility(8);
        em.c4 c4Var3 = this.f94155e;
        if (c4Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var3.b().setVisibility(0);
        em.c4 c4Var4 = this.f94155e;
        if (c4Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var4.b().setOnClickListener(new ap1.y0(this));
        j75.f U62 = U6();
        if (U62 != null) {
            U62.L2(m158354x19263085(), new ap1.z0(this));
        }
    }
}
