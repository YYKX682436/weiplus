package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Lal5/e0;", "<init>", "()V", "z83/o", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI */
/* loaded from: classes5.dex */
public final class ActivityC16161xd3ca9321 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, al5.e0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f224686s = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224687d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224688e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224689f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224690g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f224691h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f224692i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f224694n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f224695o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f224696p;

    /* renamed from: q, reason: collision with root package name */
    public z83.o f224697q;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f224693m = "+86";

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f224698r = jz5.h.b(new z83.v(this));

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            T6().f525543f.setVisibility(0);
            android.view.ViewGroup.LayoutParams layoutParams = T6().f525539b.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            marginLayoutParams.topMargin = 0;
            T6().f525539b.setLayoutParams(marginLayoutParams);
            T6().f525544g.setPadding(T6().f525544g.getPaddingLeft(), T6().f525544g.getPaddingTop(), T6().f525544g.getPaddingRight(), 0);
            return;
        }
        T6().f525543f.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams2 = T6().f525539b.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        marginLayoutParams2.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        T6().f525539b.setLayoutParams(marginLayoutParams2);
        T6().f525544g.setPadding(T6().f525544g.getPaddingLeft(), T6().f525544g.getPaddingTop(), T6().f525544g.getPaddingRight(), i17);
        T6().f525544g.requestLayout();
    }

    public final w83.i T6() {
        return (w83.i) ((jz5.n) this.f224698r).mo141623x754a37bb();
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "startSmsListener");
        z83.o oVar = this.f224697q;
        if (oVar != null) {
            oVar.cancel();
        } else {
            this.f224697q = new z83.o(this, 60000L, 1000L);
        }
        T6().f525548k.setEnabled(false);
        T6().f525548k.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77642xb498d896));
        z83.o oVar2 = this.f224697q;
        if (oVar2 != null) {
            oVar2.start();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "requestSms, opCode:23");
        gm0.j1.d().a(145, this);
        this.f224692i = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574330hw3), true, true, z83.t.f552286d);
        hv.e eVar = (hv.e) i95.n0.c(hv.e.class);
        java.lang.String str = this.f224693m + this.f224688e;
        ((gv.a) eVar).getClass();
        h11.e eVar2 = new h11.e(str, 23, "", 0, "", 0);
        eVar2.S(this.f224691h);
        java.lang.String str2 = this.f224687d;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        ((o45.eh) eVar2.f359604d.mo47979x2d63726f()).f424455a.C = str2;
        gm0.j1.d().g(eVar2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570724bn2;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = T6().f525542e;
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c16155xa1f2bfdb.m65191x53bfe316(string);
        T6().f525542e.m65189x5018364b(new z83.p(this));
        T6().f525544g.e(this);
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f224687d = stringExtra;
        this.f224688e = getIntent().getStringExtra("intent.key.reg.mobile");
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent.key.reg.nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        this.f224689f = stringExtra2;
        this.f224691h = getIntent().getStringExtra("intent.key.reg.session.id");
        this.f224694n = getIntent().getBooleanExtra("intent.key.hasSetAvatar", false);
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent.key.reg.head_img.file.id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra3);
        this.f224695o = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("intent.key.reg.head_img.aes.key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra4);
        this.f224696p = stringExtra4;
        U6();
        T6().f525548k.setOnClickListener(new z83.q(this));
        T6().f525545h.addTextChangedListener(new z83.r(this));
        T6().f525541d.setEnabled(false);
        T6().f525541d.setOnClickListener(new z83.s(this));
        T6().f525547j.setText(this.f224688e);
        a93.a aVar = a93.a.f83962a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        aVar.c(mo55332x76847179, T6().f525546i, T6().f525539b);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        mo2533x106ab264.o();
        m78583x85ccfe01(8);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77921x1688c237));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77921x1688c237));
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "stopSmsListener");
        z83.o oVar = this.f224697q;
        if (oVar != null) {
            oVar.cancel();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        T6().f525544g.e(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "stopSmsListener");
        z83.o oVar = this.f224697q;
        if (oVar != null) {
            oVar.cancel();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        T6().f525544g.e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f224692i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (!(m1Var instanceof hv.f)) {
            if (m1Var instanceof x83.h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "NetSceneExtReg");
                gm0.j1.d().q(5888, this);
                if (i17 != 0 || i18 != 0) {
                    x83.f[] fVarArr = x83.f.f534100d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.g(21256, true, true, false, "", 2, java.lang.Integer.valueOf(i18));
                    x51.r1 r1Var = new x51.r1(i17, i18, str);
                    ((is.s) ((js.u0) i95.n0.c(js.u0.class))).getClass();
                    if (new x51.f().c(this, r1Var)) {
                        return;
                    }
                    tm.a b17 = tm.a.b(str);
                    if (b17 != null) {
                        b17.c(this, null, null);
                        return;
                    }
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                    java.lang.String format = java.lang.String.format("注册失败，错误码(%s, %s)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)}, 2));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    db5.e1.s(mo55332x76847179, format, "");
                    return;
                }
                x83.h hVar = (x83.h) m1Var;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = hVar.f534103e.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
                java.lang.String str2 = ((r45.hn0) fVar).f457841e;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = hVar.f534103e.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
                java.lang.String OpenID = ((r45.hn0) fVar2).f457844h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(OpenID, "OpenID");
                this.f224690g = OpenID;
                java.lang.String str3 = str2 != null ? str2 : "";
                x83.f[] fVarArr2 = x83.f.f534100d;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.g(21256, true, true, false, str3, 1, 0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoRegSuccessUI, nickName:");
                java.lang.String str4 = this.f224689f;
                if (str4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
                    throw null;
                }
                sb6.append(str4);
                sb6.append(", openId:");
                sb6.append(this.f224690g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", sb6.toString());
                finish();
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16163x5c385b05.class);
                java.lang.String str5 = this.f224687d;
                if (str5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
                    throw null;
                }
                intent.putExtra("intent.key.login.url", str5);
                java.lang.String str6 = this.f224689f;
                if (str6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
                    throw null;
                }
                intent.putExtra("intent.key.reg.nickname", str6);
                intent.putExtra("intent.key.reg.openid", this.f224690g);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            return;
        }
        gm0.j1.d().q(145, this);
        h11.e eVar = (h11.e) ((hv.f) m1Var);
        int M = eVar.M();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "NetSceneBindMobileForReg, opCode:" + M);
        if (M == 23) {
            if (i18 != 0) {
                if (i18 == -41) {
                    db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                    return;
                }
                if (i18 == -34) {
                    db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ag7), "");
                    return;
                }
                x51.r1 r1Var2 = new x51.r1(i17, i18, str);
                ((is.s) ((js.u0) i95.n0.c(js.u0.class))).getClass();
                if (new x51.f().c(this, r1Var2)) {
                    return;
                }
                ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4);
                return;
            }
            return;
        }
        if (M != 24) {
            return;
        }
        if (i18 == -212) {
            java.lang.String O = eVar.O();
            java.lang.String N = eVar.N();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(O)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KidsWatchRegMobileVerifyUI", "rebind but last nickname is empty");
            }
            java.lang.String str7 = this.f224691h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "gotoRebindUI, regSessionId:" + str7 + ", lastNickName:" + O + ", lastHeadImgUrl:" + N);
            finish();
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96.class);
            java.lang.String str8 = this.f224687d;
            if (str8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
                throw null;
            }
            intent2.putExtra("intent.key.login.url", str8);
            java.lang.String str9 = this.f224689f;
            if (str9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
                throw null;
            }
            intent2.putExtra("intent.key.reg.nickname", str9);
            intent2.putExtra("intent.key.reg.last.nickname", O);
            intent2.putExtra("intent.key.reg.last.head.img.url", N);
            intent2.putExtra("intent.key.reg.mobile", this.f224688e);
            intent2.putExtra("intent.key.reg.session.id", str7);
            intent2.putExtra("intent.key.hasSetAvatar", this.f224694n);
            java.lang.String str10 = this.f224695o;
            if (str10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headImgFileID");
                throw null;
            }
            intent2.putExtra("intent.key.reg.head_img.file.id", str10);
            java.lang.String str11 = this.f224696p;
            if (str11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headImgAesKey");
                throw null;
            }
            intent2.putExtra("intent.key.reg.head_img.aes.key", str11);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRebindUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRebindUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i18 != -35) {
            if (i18 != 0) {
                x51.r1 r1Var3 = new x51.r1(i17, i18, str);
                ((is.s) ((js.u0) i95.n0.c(js.u0.class))).getClass();
                if (new x51.f().c(this, r1Var3)) {
                    return;
                }
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573898g82, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                db5.e1.s(mo55332x76847179(), string, "");
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startExtReg, ");
            java.lang.String str12 = this.f224689f;
            if (str12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
                throw null;
            }
            sb7.append(str12);
            sb7.append(", ");
            sb7.append(this.f224694n);
            sb7.append(", ");
            sb7.append(this.f224691h);
            sb7.append(", 4");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", sb7.toString());
            gm0.j1.d().a(5888, this);
            java.lang.String str13 = this.f224689f;
            if (str13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
                throw null;
            }
            java.lang.String str14 = this.f224693m + this.f224688e;
            boolean z17 = this.f224694n;
            java.lang.String str15 = this.f224687d;
            if (str15 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
                throw null;
            }
            java.lang.String str16 = this.f224695o;
            if (str16 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headImgFileID");
                throw null;
            }
            java.lang.String str17 = this.f224696p;
            if (str17 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headImgAesKey");
                throw null;
            }
            x83.h hVar2 = new x83.h(str13, str14, 4, z17, str15, str16, str17);
            hVar2.H(this.f224691h);
            gm0.j1.d().g(hVar2);
            this.f224692i = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8h), true, true, new z83.u(hVar2, this));
        }
    }
}
