package gt4;

/* loaded from: classes14.dex */
public final class z0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.k1 f357115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gt4.a1 f357116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f357117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gt4.u0 f357118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(gt4.k1 k1Var, gt4.a1 a1Var, int i17, gt4.u0 u0Var) {
        super(false);
        this.f357115d = k1Var;
        this.f357116e = a1Var;
        this.f357117f = i17;
        this.f357118g = u0Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        int i17 = this.f357115d.f356997a;
        gt4.a1 a1Var = this.f357116e;
        if (i17 > a1Var.f356927o) {
            return;
        }
        int i18 = a1Var.f356921f;
        gt4.u0 u0Var = this.f357118g;
        if (i18 <= 0) {
            a1Var.f356921f = i17;
            a1Var.m8147xed6e4d18(this.f357117f);
            u0Var.f357094e.announceForAccessibility(a1Var.f356919d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2f, u0Var.f357095f.getText()));
        } else if (a1Var.f356922g <= 0) {
            if (i18 > i17) {
                a1Var.f356922g = i18;
                a1Var.f356921f = i17;
                java.lang.String string = a1Var.f356919d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2f, java.lang.String.valueOf(i17 % 100));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                u0Var.f357094e.announceForAccessibility(string + ", " + a1Var.f356919d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2e, java.lang.String.valueOf(a1Var.f356922g % 100)));
            } else {
                a1Var.f356922g = i17;
                u0Var.f357094e.announceForAccessibility(a1Var.f356919d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2e, u0Var.f357095f.getText()));
            }
            a1Var.m8146xced61ae5();
        } else {
            a1Var.f356921f = i17;
            a1Var.f356922g = 0;
            a1Var.m8146xced61ae5();
            u0Var.f357094e.announceForAccessibility(a1Var.f356919d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2f, u0Var.f357095f.getText()));
        }
        gt4.w0 w0Var = a1Var.f356928p;
        if (w0Var != null) {
            int i19 = a1Var.f356921f;
            int i27 = a1Var.f356922g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletComplexDatePicker", "onSelected start:" + i19 + " end:" + i27);
            gt4.s0 s0Var = ((gt4.p0) w0Var).f357028a;
            s0Var.P = i19;
            s0Var.Q = i27;
            s0Var.o();
            s0Var.f();
        }
    }
}
