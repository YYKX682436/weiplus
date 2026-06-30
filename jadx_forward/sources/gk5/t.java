package gk5;

/* loaded from: classes9.dex */
public final class t extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new id5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String m126747x696739c;
        o15.b j17 = ((id5.a) c7()).j();
        return (j17 == null || (m126747x696739c = j17.m126747x696739c()) == null) ? "" : m126747x696739c;
    }

    @Override // m50.x
    public int b7() {
        return 48;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        o15.a j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        int i17 = action.f536274b;
        if (e76 != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((gk5.m1) pf5.z.f435481a.a(activity).a(gk5.m1.class)).T6(e7(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(i17));
            return true;
        }
        o15.b j18 = ((id5.a) c7()).j();
        if (j18 == null || (j17 = j18.j()) == null) {
            return false;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.lang.String s17 = j17.s();
        java.lang.String l17 = j17.l();
        java.lang.Double valueOf = java.lang.Double.valueOf(j17.w());
        java.lang.Double valueOf2 = java.lang.Double.valueOf(j17.u());
        java.lang.Double valueOf3 = java.lang.Double.valueOf(j17.t());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283212a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.p(m158354x19263085, s17, l17, valueOf.doubleValue(), valueOf2.doubleValue(), valueOf3.doubleValue(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(i17));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (w11.t1.a(toUser)) {
            w11.r1 b17 = w11.s1.b(toUser, null, 2, null);
            b17.g(toUser);
            b17.e(d7());
            b17.f523663e = 48;
            b17.c(new gk5.s(toUser));
            return;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(toUser)) {
            w11.p1 p1Var = w11.p1.f523640i;
            w11.r1 r1Var = new w11.r1();
            r1Var.g(toUser);
            r1Var.f523670l = p1Var;
            r1Var.g(toUser);
            r1Var.e(d7());
            r1Var.f523663e = 48;
            r1Var.f523664f = 0;
            r1Var.f523667i = 4;
            w11.n1 a17 = r1Var.a();
            a17.a();
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.P6(a17);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        o15.b j17 = ((id5.a) c7()).j();
        o15.a j18 = j17 != null ? j17.j() : null;
        if (j18 != null) {
            java.lang.String s17 = j18.s();
            java.lang.String l17 = j18.l();
            if ((s17 == null || r26.n0.N(s17)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s17, m158354x19263085.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572003vz))) {
                s17 = l17 == null ? "" : l17;
            }
            string = m158354x19263085.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572003vz) + ' ' + s17;
        } else {
            string = m158354x19263085.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572003vz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        w11.p1 p1Var2 = w11.p1.f523635d;
        w11.r1 r1Var2 = new w11.r1();
        r1Var2.g(toUser);
        r1Var2.f523670l = p1Var2;
        r1Var2.g(toUser);
        r1Var2.e(string);
        r1Var2.f523663e = 1;
        r1Var2.f523664f = 0;
        r1Var2.f523667i = 4;
        w11.n1 a18 = r1Var2.a();
        a18.a();
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.P6(a18);
    }
}
