package pk2;

/* loaded from: classes3.dex */
public final class r7 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f437749h;

    /* renamed from: i, reason: collision with root package name */
    public final int f437750i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437749h = "anchorlive.more.handoff";
        this.f437750i = helper.f437643t;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.o9 o9Var2 = this.f445960a;
        if (o9Var2 == null || (abstractActivityC21394xb3d2c0cf = o9Var2.f437611d) == null) {
            return;
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(((mm2.e1) o9Var.c(mm2.e1.class)).f410521r)) {
            db5.t7.g(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_3));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 c17 = wg2.a.f527253a.c(o9Var.f437607b);
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "openHandOff " + c17);
            ((d73.i) i95.n0.c(d73.i.class)).f6(c17);
        }
        db5.t7.i(abstractActivityC21394xb3d2c0cf, i65.a.r(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30867xcad56011.dxf), com.p314xaae8f345.mm.R.raw.f80061xfad483b7);
        if (o9Var.f437609c == 0) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.n3[] n3VarArr = ml2.n3.f409269d;
            r0Var.getClass();
            ml2.r0.hj(r0Var, ml2.b4.f408748J, java.lang.String.valueOf(2), 0L, null, null, null, null, null, 252, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c18;
        ml2.z4 z4Var = ml2.z4.K;
        ml2.n3[] n3VarArr2 = ml2.n3.f409269d;
        zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437749h;
    }

    @Override // qk2.f
    public boolean o() {
        return wg2.a.f527253a.a();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (wg2.a.f527253a.a()) {
            int i17 = this.f437750i;
            java.lang.String string = o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxe);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80060xa2493ff3, 0);
            if (!n()) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                ml2.n3[] n3VarArr = ml2.n3.f409269d;
                r0Var.getClass();
                ml2.r0.hj(r0Var, ml2.b4.f408748J, java.lang.String.valueOf(1), 0L, null, null, null, null, null, 252, null);
                return;
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.K;
            ml2.n3[] n3VarArr2 = ml2.n3.f409269d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(1), null, 4, null);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437750i;
    }
}
