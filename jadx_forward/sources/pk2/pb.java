package pk2;

/* loaded from: classes3.dex */
public final class pb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437704h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437705i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437704h = helper.f437625k;
        this.f437705i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "share2Status isLandscape:" + o9Var.h());
        if (!o9Var.h() || (com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q())) {
            D(o9Var);
        } else {
            pk2.d9 d9Var = o9Var.f437615f;
            if (d9Var != null && (g8Var = d9Var.f437191a) != null) {
                ((pk2.k9) g8Var).b(new pk2.ob(this, o9Var));
            }
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409500n, zl2.r4.f555483a.l(this.f445960a.f437607b), null, null, null, null, false, 124, null);
    }

    public final void D(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
        if (c19792x256d2725 != null) {
            o9Var.k(c19792x256d2725, ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r);
            p52.c cVar = p52.h.f433549a;
            java.lang.String str = ((mm2.c1) o9Var.c(mm2.c1.class)).f410385o;
            if (str == null && (str = c19792x256d2725.m76836x6c03c64c()) == null) {
                str = "";
            }
            p52.h.f433552d = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384);
            a17.m59367x7b6790db(((mm2.c1) o9Var.c(mm2.c1.class)).f410319c3);
            a17.m59422xb121f1ef(zl2.r4.f555483a.Z0());
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            so2.h1 h1Var = new so2.h1(a17);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("FINDER_LIVE_SHARE_KEY_STATUS_VERIFY", ((mm2.c1) o9Var.c(mm2.c1.class)).f410310a4);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = o9Var.f437611d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.G(context, h1Var, bundle, 2);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437705i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // qk2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            r4 = this;
            boolean r0 = bi4.v1.g()
            r1 = 0
            if (r0 == 0) goto L3a
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            pk2.o9 r2 = r4.f445960a
            androidx.lifecycle.c1 r0 = r2.c(r0)
            mm2.c1 r0 = (mm2.c1) r0
            java.lang.String r2 = r0.f410310a4
            r3 = 1
            if (r2 == 0) goto L36
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f410379n
            if (r2 == 0) goto L22
            boolean r2 = hc2.o0.f(r2)
            if (r2 != r3) goto L22
            r2 = r3
            goto L23
        L22:
            r2 = r1
        L23:
            if (r2 == 0) goto L36
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f410379n
            if (r0 == 0) goto L31
            boolean r0 = hc2.o0.d(r0)
            if (r0 != r3) goto L31
            r0 = r3
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L36
            r0 = r3
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 == 0) goto L3a
            r1 = r3
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.pb.o():boolean");
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437704h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyf);
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g);
        boolean z17 = true;
        if (((mm2.c1) o9Var.c(mm2.c1.class)).f410379n != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            if (!(c19792x256d2725 != null && c19792x256d2725.m76784x5db1b11() == 0)) {
                z17 = false;
            }
        }
        menu.j(i17, string, com.p314xaae8f345.mm.R.raw.f81148xa4cc6391, color, z17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f409601o, zl2.r4.f555483a.l(this.f445960a.f437607b), null, null, null, null, false, 124, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437704h;
    }
}
