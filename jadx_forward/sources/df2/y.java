package df2;

/* loaded from: classes3.dex */
public final class y extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313365m;

    /* renamed from: n, reason: collision with root package name */
    public r45.nb2 f313366n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313365m = "Finder.AnchorRemindController";
    }

    public final void Z6() {
        java.lang.String str;
        java.lang.String str2 = this.f313365m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onLiveCloseClick");
        java.lang.Object obj = this.f372632e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.aho);
        android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.khs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        textView2.setOnClickListener(new df2.v(this, y1Var, textView));
        textView3.setOnClickListener(new df2.w(y1Var, textView));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh.class);
        long j17 = khVar != null ? khVar.P : 0L;
        if (j17 > 0) {
            long j18 = 60;
            long j19 = j17 / j18;
            long j27 = j19 % j18;
            long j28 = j19 / j18;
            java.lang.String valueOf = java.lang.String.valueOf(j27);
            java.lang.String valueOf2 = java.lang.String.valueOf(j28);
            if (j28 <= 0) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8o, valueOf);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else if (j27 <= 0) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8m, valueOf);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8m, valueOf2) + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8n, valueOf);
            }
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8k, str));
        } else {
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8l));
        }
        r45.nb2 nb2Var = this.f313366n;
        if (nb2Var != null && nb2Var.m75933x41a8a7f2(0)) {
            java.lang.String m75945x2fec8307 = nb2Var.m75945x2fec8307(1);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                java.lang.String m75945x2fec83072 = nb2Var.m75945x2fec8307(1);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                textView.setText(m75945x2fec83072);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wording:");
        sb6.append((java.lang.Object) textView.getText());
        sb6.append(", enable:");
        r45.nb2 nb2Var2 = this.f313366n;
        sb6.append(nb2Var2 != null ? java.lang.Boolean.valueOf(nb2Var2.m75933x41a8a7f2(0)) : null);
        sb6.append(",guide_wording:");
        r45.nb2 nb2Var3 = this.f313366n;
        sb6.append(nb2Var3 != null ? nb2Var3.m75945x2fec8307(1) : null);
        sb6.append(", duration:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh.class);
        sb6.append(khVar2 != null ? khVar2.P : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.Q1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("words", textView.getText());
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        df2.o oVar = (df2.o) getStore().m56798x25fe639c(df2.o.class);
        boolean z17 = (oVar != null ? oVar.f312437u : null) == r45.f07.VisibilityModeOptionStatus_Enable;
        if (((mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) getStore().m56796xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb()).f() && z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            k0Var.f293405n = new df2.t(context);
            k0Var.f293414s = new df2.u(this, y1Var);
            k0Var.v();
            android.app.Dialog dialog = k0Var.f293397i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dialog, "getDialog(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.a(dialog, context);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f408877o);
        } else {
            y1Var.s();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onLiveCloseClick show bottomSheet");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313365m, "startPollingCloseLiveGuideInfo");
        dk2.ef.f314925k.e(33, new r45.mb2(), new df2.x(this, r45.nb2.class), true);
    }
}
