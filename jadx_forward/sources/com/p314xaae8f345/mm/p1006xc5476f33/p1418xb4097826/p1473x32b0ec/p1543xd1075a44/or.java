package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes15.dex */
public final class or extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pr f200846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qc6 f200848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pr prVar, int i17, r45.qc6 qc6Var, java.lang.String str) {
        super(0);
        this.f200846d = prVar;
        this.f200847e = i17;
        this.f200848f = qc6Var;
        this.f200849g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pr prVar = this.f200846d;
        int i17 = this.f200847e;
        prVar.f200941f = i17;
        r45.qc6 qc6Var = this.f200848f;
        java.lang.String m75945x2fec8307 = qc6Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        prVar.f200942g = m75945x2fec8307;
        java.lang.String str = this.f200849g;
        prVar.f200943h = str == null ? "" : str;
        java.lang.String m75945x2fec83072 = qc6Var.m75945x2fec8307(1);
        prVar.f200944i = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        android.view.ViewGroup viewGroup = prVar.f200939d;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obc);
        com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2d);
        prVar.f200947o = button;
        if (button != null) {
            button.setOnClickListener(prVar);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ofa);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(prVar);
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2m);
        prVar.f200948p = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(prVar);
        }
        android.widget.TextView textView3 = prVar.f200948p;
        if (textView3 != null) {
            textView3.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nr(textView3));
        }
        android.widget.TextView textView4 = prVar.f200948p;
        com.p314xaae8f345.mm.ui.bk.r0(textView4 != null ? textView4.getPaint() : null, 0.8f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2k);
        prVar.f200949q = c22699x3dcdb3522;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setOnClickListener(prVar);
        }
        android.widget.TextView textView5 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2b);
        prVar.f200950r = textView5;
        if (textView5 != null) {
            textView5.setOnClickListener(prVar);
        }
        android.widget.TextView textView6 = prVar.f200950r;
        if (textView6 != null) {
            textView6.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nr(textView6));
        }
        android.widget.TextView textView7 = prVar.f200950r;
        com.p314xaae8f345.mm.ui.bk.r0(textView7 != null ? textView7.getPaint() : null, 0.8f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2_);
        prVar.f200951s = c22699x3dcdb3523;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setOnClickListener(prVar);
        }
        prVar.f200952t = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2e);
        prVar.f200953u = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2i);
        android.widget.TextView textView8 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2h);
        prVar.f200954v = textView8;
        if (textView8 != null) {
            textView8.setOnClickListener(prVar);
        }
        android.widget.TextView textView9 = prVar.f200954v;
        if (textView9 != null) {
            textView9.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nr(textView9));
        }
        android.widget.TextView textView10 = prVar.f200954v;
        com.p314xaae8f345.mm.ui.bk.r0(textView10 != null ? textView10.getPaint() : null, 0.8f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l2f);
        prVar.f200955w = c22699x3dcdb3524;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.setOnClickListener(prVar);
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        prVar.f200956x = ((java.lang.Boolean) m17).booleanValue();
        prVar.c();
        prVar.b();
        viewGroup.setVisibility(0);
        if (prVar.D != 0 && prVar.E != 0) {
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).ij(6, prVar.D, prVar.E, kz5.c1.k(new jz5.l("name_certification", java.lang.Integer.valueOf(!prVar.f200957y ? 1 : 0)), new jz5.l("age_certification", java.lang.Integer.valueOf(!prVar.B ? 1 : 0)), new jz5.l("other_certification", java.lang.Integer.valueOf(!prVar.C ? 1 : 0))));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(prVar.f200940e, "showPrecheckPage userFlag:" + i17 + ", realnameAuthUrl:" + str + ", spamRisk:" + pm0.b0.g(qc6Var) + ", hasShowLicense:" + prVar.f200956x + ", realnameCheckFail:" + prVar.f200957y + ", finderRealNameCheckFail:" + prVar.f200958z + ", finderRealNameNewCheckFail:" + prVar.A + ", ageCheckFail:" + prVar.B + ", othersCheckFail:" + prVar.C);
        return jz5.f0.f384359a;
    }
}
