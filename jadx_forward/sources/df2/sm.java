package df2;

/* loaded from: classes3.dex */
public final class sm implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f312882d;

    public sm(df2.cn cnVar) {
        this.f312882d = cnVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.i62 i62Var = (r45.i62) obj;
        if (i62Var != null) {
            df2.cn cnVar = this.f312882d;
            boolean p76 = cnVar.p7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cnVar.f311425p, "receive bubble, hasLiked=" + p76 + ", hasBubbleShowed = " + cnVar.G + ", data=" + pm0.b0.g(i62Var));
            if (cnVar.G || p76) {
                return;
            }
            cnVar.G = true;
            cnVar.k7(cnVar);
            cnVar.s7(1, java.lang.Integer.valueOf(i62Var.m75939xb282bd08(2)));
            cnVar.t7(120, 1, null);
            java.lang.String string = cnVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = cnVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            cnVar.l7(new df2.d9(string, null, string2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79233x8ecb0cec), 0, 0, 48, null));
            cnVar.h7(new df2.wm(cnVar, i62Var));
            java.lang.Number valueOf = java.lang.Integer.valueOf(i62Var.m75939xb282bd08(0));
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf == null) {
                valueOf = java.lang.Long.valueOf(cnVar.f311427r);
            }
            cnVar.A = valueOf.longValue();
            cnVar.g7(new df2.xm(cnVar, i62Var));
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i62Var.m75939xb282bd08(1));
            if (!(valueOf2.intValue() > 0)) {
                valueOf2 = null;
            }
            long intValue = valueOf2 != null ? valueOf2.intValue() : cnVar.f311426q;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = cnVar.f311433x;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            cnVar.f311433x = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(cnVar, null, null, new df2.ym(intValue, cnVar, null), 3, null);
        }
    }
}
