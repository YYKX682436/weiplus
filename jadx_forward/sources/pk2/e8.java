package pk2;

/* loaded from: classes3.dex */
public final class e8 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437243h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437244i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437243h = helper.f437641s;
        this.f437244i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        java.util.ArrayList arrayList;
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f445960a.f437611d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = o9Var.f437611d;
        android.content.Intent intent2 = abstractActivityC21394xb3d2c0cf2.getIntent();
        java.lang.String str = o9Var.f437605a;
        if (intent2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAnchorSplitScreen intent null");
        } else if (zl2.r4.f555483a.x1()) {
            dk2.w4 w4Var = dk2.x4.C;
            dk2.x4 a17 = w4Var.a(intent2);
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e = (a17 == null || (arrayList = a17.f315851l) == null) ? null : (com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e) kz5.n0.Z(arrayList);
            if (c10828x8f239b6e != null) {
                c10828x8f239b6e.f150070e = ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            }
            w4Var.c(intent2, a17);
        }
        ((mm2.c1) o9Var.c(mm2.c1.class)).O1 = false;
        ((mm2.c1) o9Var.c(mm2.c1.class)).f410331e5 = true;
        com.p314xaae8f345.mm.ui.ee.f(abstractActivityC21394xb3d2c0cf.getTaskId(), null);
        if (com.p314xaae8f345.mm.ui.bk.w0()) {
            android.content.Intent intent3 = abstractActivityC21394xb3d2c0cf2.getIntent();
            if (intent3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkVisitorSplitScreen intent null");
            } else {
                gk2.e eVar = gk2.e.f354004n;
                if (eVar != null) {
                    mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
                    en0.g gVar = new en0.g();
                    gVar.f336779a = 1;
                    gVar.f336781c = e1Var.f410521r.m75942xfb822ef2(0);
                    gVar.f336795q = e1Var.f410525v;
                    gVar.f336789k = e1Var.f410516m;
                    gVar.f336784f = ((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).f410385o;
                    gVar.f336790l = ((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).V1;
                    com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e a18 = gVar.a();
                    dk2.x4 x4Var = new dk2.x4();
                    x4Var.f315851l.add(a18);
                    dk2.x4.C.c(intent3, x4Var);
                }
            }
        }
        com.p314xaae8f345.mm.ui.fj.f(abstractActivityC21394xb3d2c0cf, true);
        if (!com.p314xaae8f345.mm.ui.bk.w0() || (intent = abstractActivityC21394xb3d2c0cf.getIntent()) == null) {
            return;
        }
        intent.putExtra("KEY_PARAMS_FROM_SPLIT_SCREEN", true);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437244i;
    }

    @Override // qk2.f
    public boolean o() {
        return com.p314xaae8f345.mm.ui.bk.v0() && (com.p314xaae8f345.mm.ui.bk.N(this.f445960a.f437611d.getTaskId()) || com.p314xaae8f345.mm.ui.bk.w0());
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        boolean z17 = com.p314xaae8f345.mm.ui.bk.z(abstractActivityC21394xb3d2c0cf.getTaskId());
        int i17 = this.f437243h;
        if (z17 || com.p314xaae8f345.mm.ui.fj.b(abstractActivityC21394xb3d2c0cf)) {
            menu.g(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9c), com.p314xaae8f345.mm.R.raw.f80164x8f15f9e0);
        } else {
            menu.g(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjg), com.p314xaae8f345.mm.R.raw.f80311xadf8c434);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437243h;
    }
}
