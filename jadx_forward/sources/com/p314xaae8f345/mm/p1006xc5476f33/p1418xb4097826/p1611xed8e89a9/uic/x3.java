package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class x3 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205874d;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var) {
        this.f205874d = f4Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileEduUIC", "profileSettingCallback, " + ret.m75939xb282bd08(1));
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var = this.f205874d;
        if (m75939xb282bd08 != 0) {
            android.widget.CheckBox W6 = f4Var.W6();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.app.Activity context = f4Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null);
            W6.setChecked(((j37 != null ? j37.f68698x26b1b2e8 : 0) & 262144) != 0);
            db5.t7.m123883x26a183b(f4Var.m158354x19263085(), f4Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f9b), 0).show();
        }
        az2.f fVar = f4Var.f205220h;
        if (fVar != null) {
            fVar.b();
        }
    }
}
