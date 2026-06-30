package wj1;

/* loaded from: classes14.dex */
public class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f528127a;

    public j(wj1.c0 c0Var) {
        this.f528127a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f528127a.f528109a.runOnUiThread(new java.lang.Runnable() { // from class: wj1.j$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
                boolean z17;
                fl1.c0 c0Var;
                boolean z18;
                fl1.c0 c0Var2;
                wj1.c0 c0Var3 = wj1.j.this.f528127a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var3.f528109a;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12702xc32382a5.f171083z;
                if (u3Var != null && u3Var.isShowing()) {
                    activityC12702xc32382a5.f171083z.dismiss();
                }
                int i19 = i17;
                int i27 = i18;
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = oVar;
                if (i19 != 0 || i27 != 0 || (fVar = oVar2.f152244b.f152233a) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "getIDCardInfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, oVar2.f152244b.f152233a);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("intent_err_code", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171);
                    intent.putExtra("intent_err_msg", "network err");
                    activityC12702xc32382a5.setResult(1, intent);
                    activityC12702xc32382a5.finish();
                    return;
                }
                r45.o56 o56Var = (r45.o56) fVar;
                r45.gc gcVar = o56Var.f463482d;
                if (gcVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is err");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("intent_err_code", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171);
                    intent2.putExtra("intent_err_msg", "network err");
                    activityC12702xc32382a5.setResult(1, intent2);
                    activityC12702xc32382a5.finish();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response.err_code is %d", java.lang.Integer.valueOf(gcVar.f456611d));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.show_status:%d", java.lang.Integer.valueOf(o56Var.f463483e));
                int i28 = o56Var.f463483e;
                if (i28 != 0) {
                    if (i28 != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.show_status error");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "showAlert errCode:%d, errMsg:%s", java.lang.Integer.valueOf(o56Var.f463482d.f456611d), o56Var.f463482d.f456612e);
                    r45.gc gcVar2 = o56Var.f463482d;
                    int i29 = gcVar2.f456611d;
                    java.lang.String str2 = gcVar2.f456612e;
                    r45.fc fcVar = o56Var.f463484f;
                    db5.e1.K(activityC12702xc32382a5, false, fcVar.f455726e, fcVar.f455725d, activityC12702xc32382a5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571692mk), "", new wj1.k(c0Var3, i29, str2), new wj1.l(c0Var3));
                    return;
                }
                if (o56Var.f463482d.f456611d != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is not ok");
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("intent_err_code", o56Var.f463482d.f456611d);
                    intent3.putExtra("intent_err_msg", o56Var.f463482d.f456612e);
                    activityC12702xc32382a5.setResult(1, intent3);
                    activityC12702xc32382a5.finish();
                    return;
                }
                activityC12702xc32382a5.f171072o = o56Var;
                int i37 = activityC12702xc32382a5.f171079v;
                if (i37 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "switchToShowFragment");
                    ((ku5.t0) ku5.t0.f394148d).B(new wj1.g0(activityC12702xc32382a5));
                    return;
                }
                l01.q0 q0Var = l01.q0.f396320d;
                if (i37 == 1) {
                    db1.p pVar = activityC12702xc32382a5.f171082y;
                    if (pVar != null && (c0Var2 = activityC12702xc32382a5.f171081x) != null) {
                        c0Var2.a(pVar);
                    }
                    r45.o56 o56Var2 = activityC12702xc32382a5.f171072o;
                    if (o56Var2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "lost idcard show info");
                        activityC12702xc32382a5.setResult(0);
                        activityC12702xc32382a5.finish();
                        return;
                    }
                    if (o56Var2.f463498w == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "lost idcard info");
                        activityC12702xc32382a5.setResult(0);
                        activityC12702xc32382a5.finish();
                        return;
                    }
                    db1.p pVar2 = new db1.p(activityC12702xc32382a5.mo55332x76847179());
                    activityC12702xc32382a5.f171082y = pVar2;
                    pVar2.F = new wj1.i0(activityC12702xc32382a5);
                    pVar2.E = new wj1.j0(activityC12702xc32382a5);
                    pVar2.A = new wj1.k0(activityC12702xc32382a5);
                    pVar2.B = new wj1.l0(activityC12702xc32382a5);
                    pVar2.C = new wj1.s(activityC12702xc32382a5);
                    pVar2.G = new wj1.t(activityC12702xc32382a5);
                    pVar2.H = new wj1.u(activityC12702xc32382a5);
                    db1.p pVar3 = activityC12702xc32382a5.f171082y;
                    java.lang.String str3 = activityC12702xc32382a5.f171072o.f463486h;
                    pVar3.getClass();
                    l01.d0.f396294a.b(pVar3.f309384e, str3, l01.a.h(), q0Var);
                    if (android.text.TextUtils.isEmpty(activityC12702xc32382a5.f171078u)) {
                        activityC12702xc32382a5.f171078u = activityC12702xc32382a5.f171072o.f463487i;
                    }
                    db1.p pVar4 = activityC12702xc32382a5.f171082y;
                    java.lang.String str4 = activityC12702xc32382a5.f171078u;
                    pVar4.getClass();
                    if (str4 == null) {
                        str4 = "";
                    }
                    pVar4.f309385f.setText(str4);
                    db1.p pVar5 = activityC12702xc32382a5.f171082y;
                    java.lang.String str5 = activityC12702xc32382a5.f171072o.f463498w.f454793f;
                    pVar5.getClass();
                    if (str5 == null) {
                        str5 = "";
                    }
                    pVar5.f309386g.setText(str5);
                    db1.p pVar6 = activityC12702xc32382a5.f171082y;
                    java.lang.String str6 = activityC12702xc32382a5.f171072o.f463498w.f454794g;
                    pVar6.getClass();
                    if (str6 == null) {
                        str6 = "";
                    }
                    pVar6.f309389m.setText(str6);
                    db1.p pVar7 = activityC12702xc32382a5.f171082y;
                    java.lang.String str7 = activityC12702xc32382a5.f171072o.f463498w.f454795h;
                    pVar7.getClass();
                    if (str7 == null) {
                        str7 = "";
                    }
                    pVar7.f309392p.setText(str7);
                    db1.p pVar8 = activityC12702xc32382a5.f171082y;
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(activityC12702xc32382a5.f171072o.f463496u);
                    if (valueOf != null) {
                        pVar8.getClass();
                        z18 = valueOf.booleanValue();
                    } else {
                        z18 = false;
                    }
                    pVar8.f309396t.setChecked(z18);
                    pVar8.f309399w.setEnabled(valueOf != null ? valueOf.booleanValue() : false);
                    db1.p pVar9 = activityC12702xc32382a5.f171082y;
                    java.lang.String str8 = activityC12702xc32382a5.f171072o.f463491p;
                    pVar9.getClass();
                    boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8);
                    java.lang.CharSequence charSequence = str8;
                    if (K0) {
                        charSequence = pVar9.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f571693ml);
                    }
                    pVar9.f309399w.setText(charSequence);
                    db1.p pVar10 = activityC12702xc32382a5.f171082y;
                    java.lang.String str9 = activityC12702xc32382a5.f171072o.f463497v;
                    pVar10.getClass();
                    boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9);
                    java.lang.CharSequence charSequence2 = str9;
                    if (K02) {
                        charSequence2 = pVar10.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f571694mm);
                    }
                    pVar10.f309396t.setText(charSequence2);
                    r45.lc lcVar = activityC12702xc32382a5.f171072o.f463498w.f454797m;
                    if (lcVar != null) {
                        db1.p pVar11 = activityC12702xc32382a5.f171082y;
                        java.lang.String str10 = lcVar.f460828d;
                        if (str10 != null) {
                            android.widget.TextView textView = pVar11.f309397u;
                            textView.setText(str10);
                            textView.setOnClickListener(new db1.o(pVar11));
                        } else {
                            pVar11.getClass();
                        }
                    }
                    if (activityC12702xc32382a5.f171072o.f463498w.f454791d != null) {
                        activityC12702xc32382a5.f171082y.c(activityC12702xc32382a5.f171072o.f463498w.f454791d.f452194d + " " + activityC12702xc32382a5.f171072o.f463498w.f454791d.f452195e);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "no id card info");
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    r45.p93 p93Var = activityC12702xc32382a5.f171072o.f463498w.f454792e;
                    if (p93Var != null) {
                        r45.a85 a85Var = p93Var.f464407d;
                        if (a85Var != null) {
                            java.lang.String str11 = a85Var.f451351d;
                            java.lang.String str12 = str11 == null ? "" : str11;
                            java.lang.String str13 = a85Var.f451352e;
                            java.lang.String str14 = str13 == null ? "" : str13;
                            java.lang.String str15 = a85Var.f451355h;
                            java.lang.String str16 = str15 == null ? "" : str15;
                            java.lang.String str17 = a85Var.f451356i;
                            java.lang.String str18 = str17 == null ? "" : str17;
                            java.lang.String str19 = a85Var.f451357m;
                            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581(str12, str14, str16, str18, str19 == null ? "" : str19, a85Var.f451353f, a85Var.f451354g, true, false, ""));
                        }
                        java.util.LinkedList linkedList = activityC12702xc32382a5.f171072o.f463498w.f454792e.f464408e;
                        if (linkedList != null) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                r45.a85 a85Var2 = (r45.a85) it.next();
                                java.lang.String str20 = a85Var2.f451351d;
                                java.lang.String str21 = str20 == null ? "" : str20;
                                java.lang.String str22 = a85Var2.f451352e;
                                java.lang.String str23 = str22 == null ? "" : str22;
                                java.lang.String str24 = a85Var2.f451355h;
                                java.lang.String str25 = str24 == null ? "" : str24;
                                java.lang.String str26 = a85Var2.f451356i;
                                java.lang.String str27 = str26 == null ? "" : str26;
                                java.lang.String str28 = a85Var2.f451357m;
                                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581(str21, str23, str25, str27, str28 == null ? "" : str28, a85Var2.f451353f, a85Var2.f451354g, false, false, ""));
                            }
                        }
                    }
                    vi1.o0 o0Var = vi1.o0.f518949a;
                    java.util.List c17 = o0Var.c(arrayList, o0Var.b());
                    activityC12702xc32382a5.f171082y.e(c17 == null ? new java.util.ArrayList() : (java.util.ArrayList) c17);
                    o0Var.d(c17);
                    fl1.c0 c0Var4 = activityC12702xc32382a5.f171081x;
                    if (c0Var4 != null) {
                        c0Var4.c(activityC12702xc32382a5.f171082y);
                        return;
                    }
                    return;
                }
                if (i37 == 2) {
                    db1.p pVar12 = activityC12702xc32382a5.f171082y;
                    if (pVar12 != null && (c0Var = activityC12702xc32382a5.f171081x) != null) {
                        c0Var.a(pVar12);
                    }
                    r45.o56 o56Var3 = activityC12702xc32382a5.f171072o;
                    if (o56Var3 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "wecoin lost idcard show info");
                        activityC12702xc32382a5.setResult(0);
                        activityC12702xc32382a5.finish();
                        return;
                    }
                    if (o56Var3.f463498w == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "wecoin lost idcard info");
                        activityC12702xc32382a5.setResult(0);
                        activityC12702xc32382a5.finish();
                        return;
                    }
                    db1.p pVar13 = new db1.p(activityC12702xc32382a5.mo55332x76847179());
                    activityC12702xc32382a5.f171082y = pVar13;
                    pVar13.f309384e.setVisibility(8);
                    pVar13.f309387h.setVisibility(8);
                    activityC12702xc32382a5.f171082y.f309383d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8p);
                    db1.p pVar14 = activityC12702xc32382a5.f171082y;
                    wj1.v vVar = new wj1.v(activityC12702xc32382a5);
                    pVar14.getClass();
                    pVar14.E = vVar;
                    db1.p pVar15 = activityC12702xc32382a5.f171082y;
                    wj1.w wVar = new wj1.w(activityC12702xc32382a5);
                    pVar15.getClass();
                    pVar15.A = wVar;
                    db1.p pVar16 = activityC12702xc32382a5.f171082y;
                    wj1.x xVar = new wj1.x(activityC12702xc32382a5);
                    pVar16.getClass();
                    pVar16.B = xVar;
                    db1.p pVar17 = activityC12702xc32382a5.f171082y;
                    wj1.y yVar = new wj1.y(activityC12702xc32382a5);
                    pVar17.getClass();
                    pVar17.D = yVar;
                    db1.p pVar18 = activityC12702xc32382a5.f171082y;
                    wj1.z zVar = new wj1.z(activityC12702xc32382a5);
                    pVar18.getClass();
                    pVar18.C = zVar;
                    db1.p pVar19 = activityC12702xc32382a5.f171082y;
                    wj1.a0 a0Var = new wj1.a0(activityC12702xc32382a5);
                    pVar19.getClass();
                    pVar19.G = a0Var;
                    db1.p pVar20 = activityC12702xc32382a5.f171082y;
                    wj1.b0 b0Var = new wj1.b0(activityC12702xc32382a5);
                    pVar20.getClass();
                    pVar20.H = b0Var;
                    db1.p pVar21 = activityC12702xc32382a5.f171082y;
                    java.lang.String str29 = activityC12702xc32382a5.f171072o.f463486h;
                    pVar21.getClass();
                    l01.d0.f396294a.b(pVar21.f309384e, str29, l01.a.h(), q0Var);
                    db1.p pVar22 = activityC12702xc32382a5.f171082y;
                    java.lang.String str30 = activityC12702xc32382a5.f171067g;
                    pVar22.getClass();
                    if (str30 == null) {
                        str30 = "";
                    }
                    pVar22.f309385f.setText(str30);
                    db1.p pVar23 = activityC12702xc32382a5.f171082y;
                    java.lang.String str31 = activityC12702xc32382a5.f171072o.f463498w.f454793f;
                    pVar23.getClass();
                    if (str31 == null) {
                        str31 = "";
                    }
                    pVar23.f309386g.setText(str31);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC12702xc32382a5.f171068h)) {
                        db1.p pVar24 = activityC12702xc32382a5.f171082y;
                        java.lang.String str32 = activityC12702xc32382a5.f171072o.f463498w.f454794g;
                        pVar24.getClass();
                        if (str32 == null) {
                            str32 = "";
                        }
                        pVar24.f309389m.setText(str32);
                    } else {
                        db1.p pVar25 = activityC12702xc32382a5.f171082y;
                        java.lang.String str33 = activityC12702xc32382a5.f171068h;
                        pVar25.getClass();
                        if (str33 == null) {
                            str33 = "";
                        }
                        pVar25.f309389m.setText(str33);
                    }
                    db1.p pVar26 = activityC12702xc32382a5.f171082y;
                    java.lang.String str34 = activityC12702xc32382a5.f171072o.f463498w.f454795h;
                    pVar26.getClass();
                    if (str34 == null) {
                        str34 = "";
                    }
                    pVar26.f309392p.setText(str34);
                    boolean z19 = activityC12702xc32382a5.f171072o.f463496u;
                    activityC12702xc32382a5.V6(z19 ? 12 : 13);
                    db1.p pVar27 = activityC12702xc32382a5.f171082y;
                    java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z19);
                    if (valueOf2 != null) {
                        pVar27.getClass();
                        z17 = valueOf2.booleanValue();
                    } else {
                        z17 = false;
                    }
                    pVar27.f309396t.setChecked(z17);
                    pVar27.f309399w.setEnabled(valueOf2 != null ? valueOf2.booleanValue() : false);
                    db1.p pVar28 = activityC12702xc32382a5.f171082y;
                    java.lang.String str35 = activityC12702xc32382a5.f171072o.f463491p;
                    pVar28.getClass();
                    boolean K03 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str35);
                    java.lang.CharSequence charSequence3 = str35;
                    if (K03) {
                        charSequence3 = pVar28.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f571693ml);
                    }
                    pVar28.f309399w.setText(charSequence3);
                    db1.p pVar29 = activityC12702xc32382a5.f171082y;
                    java.lang.String str36 = activityC12702xc32382a5.f171072o.f463497v;
                    pVar29.getClass();
                    boolean K04 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str36);
                    java.lang.CharSequence charSequence4 = str36;
                    if (K04) {
                        charSequence4 = pVar29.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f571694mm);
                    }
                    pVar29.f309396t.setText(charSequence4);
                    r45.lc lcVar2 = activityC12702xc32382a5.f171072o.f463498w.f454797m;
                    if (lcVar2 != null) {
                        db1.p pVar30 = activityC12702xc32382a5.f171082y;
                        java.lang.String str37 = lcVar2.f460828d;
                        if (str37 != null) {
                            android.widget.TextView textView2 = pVar30.f309397u;
                            textView2.setText(str37);
                            textView2.setOnClickListener(new db1.o(pVar30));
                        } else {
                            pVar30.getClass();
                        }
                    }
                    if (activityC12702xc32382a5.f171072o.f463498w.f454791d != null) {
                        activityC12702xc32382a5.f171082y.c(activityC12702xc32382a5.f171072o.f463498w.f454791d.f452194d + " " + activityC12702xc32382a5.f171072o.f463498w.f454791d.f452195e);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "wecoin no id card info");
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    r45.p93 p93Var2 = activityC12702xc32382a5.f171072o.f463498w.f454792e;
                    if (p93Var2 != null) {
                        r45.a85 a85Var3 = p93Var2.f464407d;
                        if (a85Var3 != null) {
                            java.lang.String str38 = a85Var3.f451351d;
                            java.lang.String str39 = str38 == null ? "" : str38;
                            java.lang.String str40 = a85Var3.f451352e;
                            java.lang.String str41 = str40 == null ? "" : str40;
                            java.lang.String str42 = a85Var3.f451355h;
                            java.lang.String str43 = str42 == null ? "" : str42;
                            java.lang.String str44 = a85Var3.f451356i;
                            java.lang.String str45 = str44 == null ? "" : str44;
                            java.lang.String str46 = a85Var3.f451357m;
                            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581(str39, str41, str43, str45, str46 == null ? "" : str46, a85Var3.f451353f, a85Var3.f451354g, true, false, ""));
                        }
                        java.util.LinkedList linkedList2 = activityC12702xc32382a5.f171072o.f463498w.f454792e.f464408e;
                        if (linkedList2 != null) {
                            java.util.Iterator it6 = linkedList2.iterator();
                            while (it6.hasNext()) {
                                r45.a85 a85Var4 = (r45.a85) it6.next();
                                java.lang.String str47 = a85Var4.f451351d;
                                java.lang.String str48 = str47 == null ? "" : str47;
                                java.lang.String str49 = a85Var4.f451352e;
                                java.lang.String str50 = str49 == null ? "" : str49;
                                java.lang.String str51 = a85Var4.f451355h;
                                java.lang.String str52 = str51 == null ? "" : str51;
                                java.lang.String str53 = a85Var4.f451356i;
                                java.lang.String str54 = str53 == null ? "" : str53;
                                java.lang.String str55 = a85Var4.f451357m;
                                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581(str48, str50, str52, str54, str55 == null ? "" : str55, a85Var4.f451353f, a85Var4.f451354g, false, false, ""));
                            }
                        }
                    }
                    vi1.o0 o0Var2 = vi1.o0.f518949a;
                    java.util.List c18 = o0Var2.c(arrayList2, o0Var2.b());
                    activityC12702xc32382a5.f171082y.e(c18 == null ? new java.util.ArrayList() : (java.util.ArrayList) c18);
                    o0Var2.d(c18);
                    fl1.c0 c0Var5 = activityC12702xc32382a5.f171081x;
                    if (c0Var5 != null) {
                        c0Var5.c(activityC12702xc32382a5.f171082y);
                    }
                }
            }
        });
    }
}
