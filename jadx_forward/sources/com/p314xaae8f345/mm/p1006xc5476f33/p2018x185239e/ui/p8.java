package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class p8 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i f239410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 f239411b;

    public p8(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 activityC17153xbe9612d2, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i iVar) {
        this.f239411b = activityC17153xbe9612d2;
        this.f239410a = iVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.f77 f77Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i iVar = this.f239410a;
        r45.rx rxVar = iVar.f238385r;
        java.lang.String str2 = rxVar.f466790f;
        final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 activityC17153xbe9612d2 = this.f239411b;
        activityC17153xbe9612d2.L = str2;
        activityC17153xbe9612d2.f239129t2 = rxVar.f466791g;
        activityC17153xbe9612d2.X = rxVar.f466793i;
        activityC17153xbe9612d2.R = rxVar.f466794m;
        activityC17153xbe9612d2.Y = rxVar.f466796o;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TRANSFER_SHOW_ALIAS_BOOLEAN_SYNC, java.lang.Boolean.valueOf(iVar.f238385r.f466796o));
        r45.yt5 yt5Var = iVar.f238385r.f466797p;
        if (yt5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUI", "right_navigation_item_route_info != null");
            r45.v1 v1Var = yt5Var.f472895o;
            if (v1Var != null && v1Var.f469326d.size() == 1 && v1Var.f469328f == 0) {
                v1Var.f469328f = -1;
            }
            this.f239411b.m78480x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, false, (android.view.MenuItem.OnMenuItemClickListener) new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.o8(this, yt5Var));
        }
        r45.rx rxVar2 = iVar.f238385r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUI", "onSceneEnd NetSceneBeforeTransfer，mask_name：%s，truename_extend：%s，show_receiver_alias：%s", rxVar2.f466790f, rxVar2.f466791g, java.lang.Boolean.valueOf(rxVar2.f466796o));
        activityC17153xbe9612d2.getClass();
        r45.e77 e77Var = iVar.f238385r.f466795n;
        if (e77Var == null || e77Var.f454617d != 1 || (f77Var = e77Var.f454618e) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f77Var.f455614d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", "  do not show WarningView");
            activityC17153xbe9612d2.M1.setVisibility(8);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) activityC17153xbe9612d2.C.getLayoutParams();
            layoutParams.topMargin = i65.a.b(activityC17153xbe9612d2.mo55332x76847179(), 0);
            activityC17153xbe9612d2.C.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) activityC17153xbe9612d2.R1.getLayoutParams();
            layoutParams2.topMargin = i65.a.b(activityC17153xbe9612d2.mo55332x76847179(), 32);
            activityC17153xbe9612d2.R1.setLayoutParams(layoutParams2);
        } else {
            r45.e77 e77Var2 = iVar.f238385r.f466795n;
            final r45.f77 f77Var2 = e77Var2.f454618e;
            activityC17153xbe9612d2.M1.setVisibility(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", "warning textInfo.wording:%s", f77Var2.f455614d);
            activityC17153xbe9612d2.O1.setText(f77Var2.f455614d);
            if (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e77Var2.f454620g)) {
                activityC17153xbe9612d2.O1.setTextColor(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.l0(e77Var2.f454619f));
            } else {
                activityC17153xbe9612d2.O1.setTextColor(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.l0(e77Var2.f454620g));
            }
            int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC17153xbe9612d2, 20.0f);
            int d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC17153xbe9612d2, 8.0f);
            int d19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC17153xbe9612d2, 16.0f);
            if (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e77Var2.f454622i)) {
                activityC17153xbe9612d2.P1.b(e77Var2.f454621h, d17, d17, -1);
            } else {
                activityC17153xbe9612d2.P1.b(e77Var2.f454622i, d17, d17, -1);
            }
            if (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e77Var2.f454624n)) {
                activityC17153xbe9612d2.Q1.b(e77Var2.f454623m, d18, d19, -1);
            } else {
                activityC17153xbe9612d2.Q1.b(e77Var2.f454624n, d18, d19, -1);
            }
            activityC17153xbe9612d2.M1.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.47
                public AnonymousClass47() {
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
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28871, 1, 1);
            activityC17153xbe9612d2.N1.setClickable(true);
            activityC17153xbe9612d2.N1.setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.z1() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.48

                /* renamed from: d */
                public final /* synthetic */ r45.f77 f239071d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass48(final r45.f77 f77Var22) {
                    super(false);
                    r2 = f77Var22;
                }

                @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
                /* renamed from: onRealClick */
                public void mo27114xc7e50b6b(android.view.View view) {
                    r45.f77 f77Var3 = r2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", " click option item : %s ,type:%s", f77Var3.f455614d, java.lang.Integer.valueOf(f77Var3.f455615e.f453742d));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28871, 1, 2);
                    r45.d77 d77Var = f77Var3.f455615e;
                    int i19 = d77Var.f453742d;
                    if (i19 == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", " textInfo.jumpInfo.url ：%s", d77Var.f453743e);
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7.this.mo55332x76847179(), f77Var3.f455615e.f453743e, false);
                    } else if (i19 == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", " textInfo.jumpInfo.username ：%s", d77Var.f453744f);
                        r45.d77 d77Var2 = f77Var3.f455615e;
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(d77Var2.f453744f, d77Var2.f453745g, 0, 1000);
                    } else if (i19 != 3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceNewBaseUI", "unknow text info type");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceNewBaseUI", " text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                    }
                }
            });
        }
        activityC17153xbe9612d2.j7();
    }
}
