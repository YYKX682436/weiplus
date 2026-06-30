package ni2;

/* loaded from: classes10.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.x0 f419002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ni2.x0 x0Var) {
        super(1);
        this.f419002d = x0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        tn0.w0 h17;
        qf2.l lVar;
        tn0.w0 h18;
        zn0.a0 U;
        if (((java.lang.Boolean) obj).booleanValue()) {
            ni2.x0 x0Var = this.f419002d;
            int i17 = x0Var.M;
            if (i17 != x0Var.N) {
                boolean z17 = pm0.v.z(i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
                android.content.Context context = x0Var.f199716e;
                if (z17) {
                    db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mmp), com.p314xaae8f345.mm.R.raw.f80084xebd378da);
                } else if (pm0.v.z(x0Var.M, 64) && !pm0.v.z(x0Var.M, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
                    db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573142dn5), com.p314xaae8f345.mm.R.raw.f80084xebd378da);
                } else if (!pm0.v.z(x0Var.M, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) && !pm0.v.z(x0Var.M, 64)) {
                    db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkc), com.p314xaae8f345.mm.R.raw.f80084xebd378da);
                }
            }
            super/*com.tencent.mm.plugin.finder.live.widget.e0*/.U();
            boolean z18 = !pm0.v.z(x0Var.M, 64);
            boolean z19 = pm0.v.z(x0Var.N, 64);
            zh2.c cVar = x0Var.K;
            if (z18 && z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicSettingModePanel", "resetMicModeToNormalIfClosed curMicMode:" + ((cVar == null || (h18 = cVar.h()) == null || (U = h18.U()) == null) ? null : java.lang.Integer.valueOf(U.f555849t)));
                if (cVar != null && (lVar = (qf2.l) cVar.mo57008x143f1b92(qf2.l.class)) != null) {
                    lVar.b7(1, null);
                }
            }
            if (((mm2.c1) ((df2.d3) x0Var.f419035J).a().a(mm2.c1.class)).a8() && cVar != null && (h17 = cVar.h()) != null) {
                h17.M0(false);
            }
        }
        return jz5.f0.f384359a;
    }
}
