package df2;

/* loaded from: classes3.dex */
public final class q2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t2 f312662d;

    public q2(df2.t2 t2Var) {
        this.f312662d = t2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        df2.t2 t2Var = this.f312662d;
        if (!t2Var.e7()) {
            t2Var.f312937u = null;
            return;
        }
        boolean z17 = !pm0.v.z(t2Var.d7(), 2);
        java.lang.Boolean bool = t2Var.f312937u;
        if (bool != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.valueOf(z17))) {
            android.content.Context O6 = t2Var.O6();
            if (z17) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.oml);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f81299xe97aa5a6);
                e4Var.c();
            } else {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
                e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.omd);
                e4Var2.b(com.p314xaae8f345.mm.R.raw.f79599x27a7ef65);
                e4Var2.c();
            }
        }
        t2Var.f312937u = java.lang.Boolean.valueOf(z17);
        df2.t2.g7(t2Var, kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n6.f198050e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n6.f198051f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n6.f198049d), false, 2, null);
    }
}
