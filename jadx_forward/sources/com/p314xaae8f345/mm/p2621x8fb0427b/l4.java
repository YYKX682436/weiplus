package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public class l4 extends pp.a implements e95.a {

    /* renamed from: f2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f276617f2;

    /* renamed from: g2, reason: collision with root package name */
    public int f276618g2;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f276619h2;

    public l4(java.lang.String str) {
        super(str);
        this.f276619h2 = false;
    }

    @Override // dm.i2
    public java.lang.String A0() {
        pt0.m mVar = (pt0.m) i95.n0.c(pt0.m.class);
        java.lang.String msgTalker = h1();
        ez.j jVar = (ez.j) mVar;
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        g15.b wi6 = jVar.wi(msgTalker);
        java.lang.String k17 = wi6 != null ? wi6.k() : null;
        java.lang.String A0 = super.A0();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(A0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Conversation", "[%s}]get mmkv editmsg is [%s],get conv editmsg is [%s]", h1(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(k17), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(A0));
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S(k17) > 0 ? k17 : A0;
    }

    @Override // dm.i2
    public long D0() {
        g15.d l17;
        pt0.m mVar = (pt0.m) i95.n0.c(pt0.m.class);
        java.lang.String msgTalker = h1();
        ez.j jVar = (ez.j) mVar;
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        g15.b wi6 = jVar.wi(msgTalker);
        java.lang.Long valueOf = (wi6 == null || (l17 = wi6.l()) == null) ? null : java.lang.Long.valueOf(l17.j());
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1(valueOf, 0L) > 0 ? valueOf.longValue() : super.D0();
    }

    @Override // e95.a
    public void I(int i17, byte[] bArr) {
    }

    @Override // e95.a
    public void L(int i17, long j17) {
        if (i17 == 0) {
            Y1((int) j17);
            return;
        }
        if (i17 == 1) {
            W1((int) j17);
            return;
        }
        if (i17 == 2) {
            M1((int) j17);
            return;
        }
        if (i17 == 3) {
            n1(j17);
            return;
        }
        if (i17 == 7) {
            super.z1(j17);
            return;
        }
        if (i17 == 10) {
            j1((int) j17);
            return;
        }
        if (i17 == 16) {
            L1((int) j17);
            return;
        }
        if (i17 == 17) {
            U1((int) j17);
            return;
        }
        switch (i17) {
            case 12:
                i1((int) j17);
                return;
            case 13:
                a2((int) j17);
                return;
            case 14:
                Z1((int) j17);
                return;
            default:
                return;
        }
    }

    @Override // e95.a
    public void P(int i17, java.lang.String str) {
        if (i17 == 4) {
            b2(str);
            return;
        }
        if (i17 == 5) {
            l1(str);
            return;
        }
        if (i17 == 6) {
            S1(str);
            return;
        }
        if (i17 == 8) {
            o1(str);
            return;
        }
        if (i17 == 9) {
            p1(str);
        } else if (i17 == 11) {
            q1(str);
        } else {
            if (i17 != 18) {
                return;
            }
            T1(str);
        }
    }

    @Override // dm.i2, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
    }

    @Override // dm.i2, l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        return super.mo9763xeb27878e();
    }

    public void f2() {
        pt0.m mVar = (pt0.m) i95.n0.c(pt0.m.class);
        java.lang.String h17 = h1();
        ((ez.j) mVar).getClass();
        if (h17 != null) {
            ti3.c.f501112a.c(h17, "");
        }
        W1(0);
        M1(0);
        l1("");
        S1("0");
        Y1(0);
        Z1(0);
        P1(0L);
        X1(0);
        X1(0);
        o1("");
        p1("");
    }

    public boolean g2() {
        return xg3.b.b(this, 4, 0L) != 0;
    }

    @Override // e95.a
    /* renamed from: getKey */
    public java.lang.Object mo78017xb5884f29() {
        return h1();
    }

    public void h2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        W1(f9Var.P0());
        M1(f9Var.A0());
        if (f9Var.Y2()) {
            n1(f9Var.mo78012x3fdd41df());
        } else if (f9Var.S2()) {
            java.util.LinkedList linkedList = bm5.d1.e(j()).f459919e;
            if (linkedList.isEmpty()) {
                n1(f9Var.mo78012x3fdd41df());
            } else {
                n1(((r45.l55) linkedList.getLast()).f460688g);
            }
        } else {
            n1(f9Var.P0() == 1 ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : f9Var.mo78012x3fdd41df());
        }
        if (f9Var.O2()) {
            l1(f9Var.e2());
        } else {
            l1(f9Var.j());
        }
        if (!"hidden_conv_parent".equalsIgnoreCase(W0())) {
            if ("message_fold".equalsIgnoreCase(h1())) {
                n1(0L);
                super.z1(xg3.b.b(this, 2, 0L));
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(h1()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(h1())) {
            T1("appbrandcustomerservicemsg");
            return;
        }
        T1(null);
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(f9Var.A0() != 1 ? 6 : 3);
        objArr[1] = h1();
        objArr[2] = java.lang.Integer.valueOf(c01.h2.b(h1()));
        fVar.d(21170, objArr);
    }

    @Override // e95.a
    public void r(int i17, double d17) {
    }

    @Override // e95.a
    public void s(int i17) {
    }

    @Override // e95.a
    public void v() {
    }

    @Override // dm.i2
    public void z1(long j17) {
        super.z1(j17);
    }

    public l4() {
        this.f276619h2 = false;
    }
}
