package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class r8 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j f239457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 f239458b;

    public r8(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 activityC17153xbe9612d2, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j jVar) {
        this.f239458b = activityC17153xbe9612d2;
        this.f239457a = jVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j jVar = this.f239457a;
        java.lang.String str2 = jVar.f238394r.f472105i;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_UNION_TRANSFER_TITLE_STRING_SYNC, jVar.f238394r.f472108o);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_UNION_TRANSFER_SUBTITLE_STRING_SYNC, jVar.f238394r.f472106m);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_UNION_TRANSFER_MERCHANT_STRING_SYNC, jVar.f238394r.f472109p);
        r45.xx xxVar = jVar.f238394r;
        final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 activityC17153xbe9612d2 = this.f239458b;
        if (xxVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xxVar.f472105i)) {
            activityC17153xbe9612d2.I1 = activityC17153xbe9612d2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2x);
        } else {
            activityC17153xbe9612d2.I1 = jVar.f238394r.f472105i;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f238394r.f472107n)) {
            activityC17153xbe9612d2.H1 = jVar.f238394r.f472107n;
        }
        r45.xx xxVar2 = jVar.f238394r;
        java.lang.String str3 = xxVar2.f472102f;
        if (str3 != null) {
            activityC17153xbe9612d2.X = str3;
        }
        activityC17153xbe9612d2.R = xxVar2.f472103g;
        activityC17153xbe9612d2.getClass();
        final r45.ay ayVar = jVar.f238394r.f472104h;
        if (ayVar == null || ayVar.f451878d != 1 || ayVar.f451879e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", "  do not show WarningView");
            activityC17153xbe9612d2.M1.setVisibility(8);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) activityC17153xbe9612d2.C.getLayoutParams();
            layoutParams.topMargin = i65.a.b(activityC17153xbe9612d2.mo55332x76847179(), 0);
            activityC17153xbe9612d2.C.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) activityC17153xbe9612d2.R1.getLayoutParams();
            layoutParams2.topMargin = i65.a.b(activityC17153xbe9612d2.mo55332x76847179(), 32);
            activityC17153xbe9612d2.R1.setLayoutParams(layoutParams2);
        } else {
            activityC17153xbe9612d2.M1.setVisibility(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", "warning textInfo.wording:%s", ayVar.f451879e);
            activityC17153xbe9612d2.O1.setText(ayVar.f451879e);
            int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC17153xbe9612d2, 20.0f);
            activityC17153xbe9612d2.P1.b(ayVar.f451880f, d17, d17, -1);
            activityC17153xbe9612d2.M1.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.49
                public AnonymousClass49() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7 abstractActivityC17142x347c74c7 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7.this;
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) abstractActivityC17142x347c74c7.N1.getLayoutParams();
                    layoutParams3.width = abstractActivityC17142x347c74c7.Q1.getRight() + i65.a.b(abstractActivityC17142x347c74c7.mo55332x76847179(), 8);
                    layoutParams3.height = i65.a.b(abstractActivityC17142x347c74c7.mo55332x76847179(), 36);
                    abstractActivityC17142x347c74c7.N1.setLayoutParams(layoutParams3);
                    android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) abstractActivityC17142x347c74c7.C.getLayoutParams();
                    layoutParams4.topMargin = i65.a.b(abstractActivityC17142x347c74c7.mo55332x76847179(), 16);
                    abstractActivityC17142x347c74c7.C.setLayoutParams(layoutParams4);
                    android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) abstractActivityC17142x347c74c7.R1.getLayoutParams();
                    layoutParams5.topMargin = i65.a.b(abstractActivityC17142x347c74c7.mo55332x76847179(), 0);
                    abstractActivityC17142x347c74c7.R1.setLayoutParams(layoutParams5);
                    abstractActivityC17142x347c74c7.O1.setMaxWidth((((abstractActivityC17142x347c74c7.M1.getWidth() - i65.a.b(abstractActivityC17142x347c74c7.mo55332x76847179(), 20)) - i65.a.b(abstractActivityC17142x347c74c7.mo55332x76847179(), 8)) - i65.a.b(abstractActivityC17142x347c74c7.mo55332x76847179(), 12)) - i65.a.b(abstractActivityC17142x347c74c7.mo55332x76847179(), 16));
                }
            }, 10L);
            activityC17153xbe9612d2.N1.setClickable(true);
            activityC17153xbe9612d2.N1.setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.z1() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.50

                /* renamed from: d */
                public final /* synthetic */ r45.ay f239075d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass50(final r45.ay ayVar2) {
                    super(false);
                    r2 = ayVar2;
                }

                @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
                /* renamed from: onRealClick */
                public void mo27114xc7e50b6b(android.view.View view) {
                    r45.ay ayVar2 = r2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", " click option item:%s, url:%s", ayVar2.f451879e, ayVar2.f451881g);
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7.this.mo55332x76847179(), ayVar2.f451881g, false);
                }
            });
        }
        activityC17153xbe9612d2.j7();
    }
}
