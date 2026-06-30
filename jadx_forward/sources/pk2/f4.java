package pk2;

/* loaded from: classes3.dex */
public final class f4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437263h;

    /* renamed from: i, reason: collision with root package name */
    public final int f437264i;

    /* renamed from: j, reason: collision with root package name */
    public final int f437265j;

    /* renamed from: k, reason: collision with root package name */
    public final int f437266k;

    /* renamed from: l, reason: collision with root package name */
    public final int f437267l;

    /* renamed from: m, reason: collision with root package name */
    public final int f437268m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f437269n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f437270o;

    /* renamed from: p, reason: collision with root package name */
    public final int f437271p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.t4 f437272q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437263h = 1;
        this.f437264i = 2;
        this.f437265j = 3;
        this.f437266k = 4;
        this.f437267l = 5;
        this.f437268m = 6;
        this.f437270o = "anchorlive.bottom.tools.screenshare";
        this.f437271p = helper.Q;
        this.f437272q = new pk2.e4(this, helper);
    }

    public static final void D(pk2.f4 f4Var) {
        f4Var.getClass();
        cl0.g gVar = new cl0.g();
        ml2.v2[] v2VarArr = ml2.v2.f409680d;
        gVar.s("type", 2);
        ml2.w2[] w2VarArr = ml2.w2.f409714d;
        gVar.s("result", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.H, gVar.toString(), null, 4, null);
    }

    public static final void E(pk2.f4 f4Var) {
        f4Var.getClass();
        cl0.g gVar = new cl0.g();
        ml2.v2[] v2VarArr = ml2.v2.f409680d;
        gVar.s("type", 2);
        ml2.w2[] w2VarArr = ml2.w2.f409714d;
        gVar.s("result", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.H, gVar.toString(), null, 4, null);
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f409538y0;
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        ml2.s1 s1Var = ml2.s1.f409449f;
        zy2.zb.T8(zbVar, t1Var, j0Var.bj(s1Var), null, null, null, null, false, 124, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, t1Var, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(s1Var), null, null, null, null, false, 124, null);
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.o4 o4Var = (mm2.o4) efVar.i(mm2.o4.class);
        boolean z17 = false;
        boolean z18 = (o4Var == null || (list3 = o4Var.f410857s) == null || !(list3.isEmpty() ^ true)) ? false : true;
        pk2.o9 o9Var2 = this.f445960a;
        if (z18) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var2.f437611d;
            db5.t7.g(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3q));
        } else {
            xh2.c cVar = (xh2.c) ((mm2.o4) o9Var2.c(mm2.o4.class)).A.mo3195x754a37bb();
            int i17 = cVar != null ? cVar.f536066c : 0;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = o9Var2.f437611d;
            if (i17 == 1 || i17 == 0) {
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (!(c1Var != null && c1Var.A3)) {
                    mm2.o4 o4Var2 = (mm2.o4) efVar.i(mm2.o4.class);
                    if ((o4Var2 == null || (list2 = o4Var2.f410860v) == null || !(list2.isEmpty() ^ true)) ? false : true) {
                        db5.t7.g(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3q));
                    }
                }
                mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var2 != null && c1Var2.A3) {
                    mm2.o4 o4Var3 = (mm2.o4) efVar.i(mm2.o4.class);
                    if (((o4Var3 == null || (list = o4Var3.f410860v) == null) ? 0 : list.size()) > 3) {
                        db5.t7.g(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573203lr0));
                    }
                }
                z17 = true;
            } else {
                mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var3 != null && c1Var3.S4) {
                    db5.t7.g(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573271fm));
                } else {
                    db5.t7.g(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mll));
                }
            }
        }
        if (z17) {
            if (this.f437269n == null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) o9Var2.f437611d, 1, true);
                this.f437269n = k0Var;
                k0Var.U1 = true;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f437269n;
            if (k0Var2 != null) {
                k0Var2.f293388d2 = true;
            }
            if (k0Var2 != null) {
                k0Var2.f293405n = new pk2.c4(this);
            }
            if (k0Var2 != null) {
                k0Var2.f293414s = this.f437272q;
            }
            if (k0Var2 != null) {
                k0Var2.p(new pk2.d4(this));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f437269n;
            if (k0Var3 != null) {
                k0Var3.v();
            }
            cl0.g gVar = new cl0.g();
            ml2.v2[] v2VarArr = ml2.v2.f409680d;
            gVar.s("type", 1);
            ml2.w2[] w2VarArr = ml2.w2.f409714d;
            gVar.s("result", 1);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c19;
            ml2.z4 z4Var = ml2.z4.H;
            zy2.zb.y6(zbVar2, z4Var, gVar.toString(), null, 4, null);
            cl0.g gVar2 = new cl0.g();
            gVar2.s("type", 1);
            gVar2.s("result", 2);
            i95.m c27 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            zy2.zb.y6((zy2.zb) c27, z4Var, gVar2.toString(), null, 4, null);
        }
        ll2.e.b(ll2.e.f400666a, this.f437270o, false, false, 6, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437270o;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        if (((mm2.e1) o9Var.c(mm2.e1.class)).b7()) {
            return false;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        return (r4Var.p2(((mm2.e1) o9Var.c(mm2.e1.class)).f410522s) || r4Var.z1(o9Var.f437607b) || r4Var.W1(o9Var.f437607b) || ((mm2.e1) o9Var.c(mm2.e1.class)).f7()) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        ll2.e.f400666a.j(this.f437270o, false);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f409635y0, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        java.lang.String string = this.f445960a.f437611d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ec9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        s(menu, this.f437271p, string, com.p314xaae8f345.mm.R.raw.f80295xea904eda);
    }

    @Override // qk2.h
    public int y() {
        return this.f437271p;
    }
}
