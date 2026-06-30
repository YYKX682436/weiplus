package pk2;

/* loaded from: classes3.dex */
public final class w9 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437868h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437869i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437868h = helper.f437635p;
        this.f437869i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).qk(((mm2.e1) o9Var.c(mm2.e1.class)).f410521r)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8h));
        } else {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409257f, 2);
            o9Var.j(qo0.b.f446884f4, null);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437869i;
    }

    @Override // qk2.f
    public boolean o() {
        kn0.g gVar;
        r45.ka4 ka4Var;
        pk2.o9 o9Var = this.f445960a;
        if (pm0.v.z(((mm2.c1) o9Var.c(mm2.c1.class)).Q1, 2048) && ((mm2.c1) o9Var.c(mm2.c1.class)).S) {
            kn0.i iVar = ((mm2.e1) o9Var.c(mm2.e1.class)).f410523t;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((iVar == null || (gVar = iVar.f391091b) == null || (ka4Var = gVar.f391081o) == null) ? null : ka4Var.f460092z) && !zl2.r4.f555483a.p2(((mm2.e1) o9Var.c(mm2.e1.class)).f410522s)) {
                return true;
            }
        }
        return false;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.String string;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "prepareVisitorMenuItems liveInfo:" + cm2.a.f124861a.y(((mm2.e1) o9Var.c(mm2.e1.class)).f410521r));
        if (((mm2.c1) o9Var.c(mm2.c1.class)).C4 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8a));
            sb6.append('\n');
            km2.n0 n0Var = ((mm2.c1) o9Var.c(mm2.c1.class)).C4;
            sb6.append(n0Var != null ? n0Var.f390697a : null);
            string = sb6.toString();
        } else {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        java.lang.String str = string;
        int i17 = this.f437868h;
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
        if (((mm2.c1) o9Var.c(mm2.c1.class)).f410379n != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            if (!(c19792x256d2725 != null && c19792x256d2725.m76784x5db1b11() == 0)) {
                z17 = false;
                menu.j(i17, str, com.p314xaae8f345.mm.R.raw.f79245x3d08cc2e, color, z17);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409256e, 2);
            }
        }
        z17 = true;
        menu.j(i17, str, com.p314xaae8f345.mm.R.raw.f79245x3d08cc2e, color, z17);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409256e, 2);
    }

    @Override // qk2.h
    public int y() {
        return this.f437868h;
    }
}
