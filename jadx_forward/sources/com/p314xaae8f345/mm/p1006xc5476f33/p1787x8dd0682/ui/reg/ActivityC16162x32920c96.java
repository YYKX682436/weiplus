package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI */
/* loaded from: classes5.dex */
public final class ActivityC16162x32920c96 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f224699q = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224700d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224701e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224702f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224703g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f224704h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f224705i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f224706m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f224707n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f224708o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f224709p = jz5.h.b(new z83.a0(this));

    public final w83.j T6() {
        return (w83.j) ((jz5.n) this.f224709p).mo141623x754a37bb();
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
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570725bn3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = T6().f525553e;
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c16155xa1f2bfdb.m65191x53bfe316(string);
        T6().f525553e.m65189x5018364b(new z83.w(this));
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.reg.head_img.file.id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f224703g = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent.key.reg.head_img.aes.key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        this.f224704h = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent.key.login.url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra3);
        this.f224700d = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("intent.key.reg.mobile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra4);
        this.f224701e = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("intent.key.reg.nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra5);
        this.f224702f = stringExtra5;
        this.f224705i = getIntent().getStringExtra("intent.key.reg.session.id");
        this.f224708o = getIntent().getBooleanExtra("intent.key.hasSetAvatar", false);
        java.lang.String stringExtra6 = getIntent().getStringExtra("intent.key.reg.last.nickname");
        java.lang.String stringExtra7 = getIntent().getStringExtra("intent.key.reg.last.head.img.url");
        T6().f525555g.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra6) ? "" : stringExtra6);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra7)) {
            int a17 = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 16);
            o11.f fVar = new o11.f();
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            fVar.f423630u = a17;
            fVar.f423629t = true;
            n11.a.b().h(stringExtra7, T6().f525554f, fVar.a());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileID:");
        java.lang.String str = this.f224703g;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headImgFileID");
            throw null;
        }
        sb6.append(str);
        sb6.append(", aeskey:");
        java.lang.String str2 = this.f224704h;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headImgAesKey");
            throw null;
        }
        sb6.append(str2);
        sb6.append(", loginUrl:");
        java.lang.String str3 = this.f224700d;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        sb6.append(str3);
        sb6.append(", nickName:");
        java.lang.String str4 = this.f224702f;
        if (str4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
            throw null;
        }
        sb6.append(str4);
        sb6.append(", regSessionId:");
        sb6.append(this.f224705i);
        sb6.append(", hasSetAvatar:");
        sb6.append(this.f224708o);
        sb6.append(", lastNickName:");
        sb6.append(stringExtra6);
        sb6.append(", lastImgUrl:");
        sb6.append(stringExtra7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegRebindUI", sb6.toString());
        T6().f525556h.setOnClickListener(new z83.x(this));
        T6().f525552d.setOnClickListener(new z83.y(this));
        a93.a aVar = a93.a.f83962a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        aVar.c(mo55332x76847179, T6().f525551c, T6().f525550b);
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

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof x83.h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegRebindUI", "errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f224707n;
            if (u3Var != null) {
                u3Var.dismiss();
            }
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
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573898g82, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                db5.e1.s(mo55332x76847179(), string, "");
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
            this.f224706m = OpenID;
            java.lang.String str3 = str2 != null ? str2 : "";
            x83.f[] fVarArr2 = x83.f.f534100d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.g(21256, true, true, false, str3, 1, 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoRegSuccessUI, nickName:");
            java.lang.String str4 = this.f224702f;
            if (str4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
                throw null;
            }
            sb6.append(str4);
            sb6.append(", openId:");
            sb6.append(this.f224706m);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegRebindUI", sb6.toString());
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16163x5c385b05.class);
            java.lang.String str5 = this.f224700d;
            if (str5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
                throw null;
            }
            intent.putExtra("intent.key.login.url", str5);
            java.lang.String str6 = this.f224702f;
            if (str6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
                throw null;
            }
            intent.putExtra("intent.key.reg.nickname", str6);
            intent.putExtra("intent.key.reg.openid", this.f224706m);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
