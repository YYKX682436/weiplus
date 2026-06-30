package bj5;

/* loaded from: classes.dex */
public final class d1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f102711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        jz5.h.b(new bj5.c1(this));
    }

    public static final void T6(bj5.d1 d1Var) {
        d1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "showListMenu() called");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) d1Var.m80379x76847179(), 1, true);
        k0Var.f293405n = new bj5.x0(1, d1Var, 2);
        k0Var.f293414s = new bj5.y0(1, d1Var, 2);
        k0Var.v();
    }

    public final void U6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f102711d;
        java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572576bo5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f4Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = f4Var.f293324d;
            e4Var.getClass();
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.e();
        } else {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.f293309c = string;
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var2.c();
        }
        m158354x19263085().setResult(-1);
        m158354x19263085().finish();
    }

    public final void V6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f102711d;
        java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mb8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (f4Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = f4Var.f293324d;
            e4Var.getClass();
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.e();
        } else {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.f293309c = string;
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var2.c();
        }
        m158354x19263085().setResult(-1);
        m158354x19263085().finish();
    }

    public final void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new bj5.a1(this));
            P6.mo74406x9c8c0d33(new bj5.b1(P6), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo64405x4dab7448(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new bj5.u0(this));
        }
    }
}
