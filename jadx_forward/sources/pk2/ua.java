package pk2;

/* loaded from: classes3.dex */
public final class ua extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437826h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437827i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437826h = helper.N;
        this.f437827i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        qo0.b bVar = qo0.b.f446907k4;
        android.os.Bundle bundle = new android.os.Bundle();
        if (((mm2.c1) o9Var.c(mm2.c1.class)).f8()) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.X1;
            cl0.g gVar = new cl0.g();
            gVar.h("type", "2");
            gVar.h("operate_way", "1");
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            ml2.r0.hj(r0Var, b4Var, r26.i0.t(gVar2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
            bundle.putBoolean("PARAM_FINDER_LIVE_ONLY_AUDIO_MODE_SWITCH", false);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0 r0Var2 = (ml2.r0) c18;
            ml2.b4 b4Var2 = ml2.b4.X1;
            cl0.g gVar3 = new cl0.g();
            gVar3.h("type", "1");
            gVar3.h("operate_way", "1");
            java.lang.String gVar4 = gVar3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
            ml2.r0.hj(r0Var2, b4Var2, r26.i0.t(gVar4, ",", ";", false), 0L, null, null, null, null, null, 252, null);
            bundle.putBoolean("PARAM_FINDER_LIVE_ONLY_AUDIO_MODE_SWITCH", true);
        }
        o9Var.j(bVar, bundle);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437827i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        return (!((mm2.c1) o9Var.c(mm2.c1.class)).d7() || ((mm2.e1) o9Var.c(mm2.e1.class)).g7() || zl2.r4.f555483a.X1(((mm2.e1) o9Var.c(mm2.e1.class)).f410522s)) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("link mic state ");
        pk2.o9 o9Var2 = this.f445960a;
        sb6.append(((mm2.o4) o9Var2.c(mm2.o4.class)).C);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, sb6.toString());
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        boolean z17 = true;
        if (!(w0Var != null && w0Var.X())) {
            mm2.g0 g0Var = (mm2.g0) o9Var2.c(mm2.g0.class);
            if (!(((mm2.c1) g0Var.m147920xbba4bfc0(mm2.c1.class)).e8() && !((mm2.g0) g0Var.m147920xbba4bfc0(mm2.g0.class)).O6()) && !((mm2.o4) o9Var2.c(mm2.o4.class)).E7()) {
                z17 = false;
            }
        }
        boolean f86 = ((mm2.c1) o9Var.c(mm2.c1.class)).f8();
        int i17 = this.f437826h;
        if (f86) {
            menu.l(i17, o9Var2.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyb), com.p314xaae8f345.mm.R.raw.f80106x9bbc4e84, z17);
        } else {
            menu.l(i17, o9Var2.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573225dy0), com.p314xaae8f345.mm.R.raw.f79008xff21cdf9, z17);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437826h;
    }
}
