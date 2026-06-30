package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Lal5/e0;", "Lkv/i0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI */
/* loaded from: classes14.dex */
public final class ActivityC16160x425523e6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, al5.e0, kv.i0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f224672t = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224673d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224674e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224675f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224676g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f224677h;

    /* renamed from: i, reason: collision with root package name */
    public int f224678i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f224680n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f224681o;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f224683q;

    /* renamed from: s, reason: collision with root package name */
    public final js.a1 f224685s;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f224679m = "+86";

    /* renamed from: p, reason: collision with root package name */
    public boolean f224682p = true;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f224684r = jz5.h.b(new z83.n(this));

    public ActivityC16160x425523e6() {
        ((is.m1) ((js.b1) i95.n0.c(js.b1.class))).getClass();
        this.f224685s = new x51.c1();
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            V6();
            return;
        }
        T6().f525530i.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = T6().f525525d.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        marginLayoutParams.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        T6().f525525d.setLayoutParams(marginLayoutParams);
        T6().f525531j.setPadding(T6().f525531j.getPaddingLeft(), T6().f525531j.getPaddingTop(), T6().f525531j.getPaddingRight(), i17);
        int height = T6().f525537p.getHeight();
        T6().f525531j.requestLayout();
        T6().f525531j.post(new z83.l(this, height));
    }

    public final w83.h T6() {
        return (w83.h) ((jz5.n) this.f224684r).mo141623x754a37bb();
    }

    public final void U6(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321.class);
        java.lang.String str3 = this.f224673d;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str3);
        intent.putExtra("intent.key.reg.nickname", T6().f525535n.getText().toString());
        intent.putExtra("intent.key.reg.mobile", T6().f525534m.getText().toString());
        intent.putExtra("intent.key.reg.session.id", this.f224674e);
        intent.putExtra("intent.key.hasSetAvatar", this.f224680n);
        intent.putExtra("intent.key.reg.head_img.file.id", str);
        intent.putExtra("intent.key.reg.head_img.aes.key", str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "get info page:(fileId:" + str + ") , (aesKey:" + str2 + ')');
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI", "gotoMobileVerifyCodePage", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI", "gotoMobileVerifyCodePage", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        T6().f525530i.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = T6().f525525d.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
        marginLayoutParams.topMargin = 0;
        T6().f525525d.setLayoutParams(marginLayoutParams);
        T6().f525531j.setPadding(T6().f525531j.getPaddingLeft(), T6().f525531j.getPaddingTop(), T6().f525531j.getPaddingRight(), 0);
        T6().f525537p.scrollBy(0, 0);
    }

    public final void W6() {
        if (!this.f224680n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "uploadHeadImg, gotoMobileVerifyCodePage, " + this.f224680n);
            U6("", "");
            return;
        }
        this.f224683q = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
        java.lang.String str = lp0.b.j() + "temp.avatar";
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k0) ((kv.l0) i95.n0.c(kv.l0.class))).getClass();
        new com.p314xaae8f345.mm.p943x351df9c2.q0(str, this).a();
    }

    @Override // kv.i0
    public void X(java.lang.String fileID, java.lang.String aesKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileID, "fileID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        ((ku5.t0) ku5.t0.f394148d).B(new z83.m(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "IImgUploadCallback, ok, fileId:" + fileID + ", aesKey:" + aesKey);
        U6(fileID, aesKey);
    }

    @Override // kv.i0
    public void d(int i17, int i18, java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).B(new z83.k(this));
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (str == null) {
            str = "";
        }
        objArr[2] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KidsWatchRegGetInfoUI", "upload head fail, errType:%s, errCode:%s, errMsg:%s", objArr);
        U6("", "");
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
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570723bn0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = T6().f525529h;
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c16155xa1f2bfdb.m65191x53bfe316(string);
        T6().f525529h.f224643e.f525493c.setVisibility(0);
        T6().f525529h.m65189x5018364b(new z83.b(this));
        T6().f525531j.e(this);
        T6().f525528g.setOnClickListener(new z83.c(this));
        T6().f525523b.setVisibility(0);
        T6().f525524c.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d = T6().f525524c;
        int b17 = i65.a.b(mo55332x76847179(), 22);
        int b18 = i65.a.b(mo55332x76847179(), 22);
        c22643xbdaadc7d.f292939f = b17;
        c22643xbdaadc7d.f292940g = b18;
        T6().f525535n.addTextChangedListener(new z83.d(this));
        T6().f525534m.addTextChangedListener(new z83.e(this));
        gm0.j1.e().g(new z83.f(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(T6().f525532k, 250, 250, 250, 250);
        T6().f525536o.setEnabled(false);
        T6().f525532k.setOnCheckedChangeListener(new z83.g(this));
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g87);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g88);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        int P = r26.n0.P(string2, string3, 0, false, 6, null);
        if (P < 0) {
            return;
        }
        int length = string3.length() + P;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string2);
        spannableStringBuilder.setSpan(new z83.h(this), P, length, 18);
        T6().f525533l.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        T6().f525533l.setClickable(true);
        T6().f525533l.setText(spannableStringBuilder);
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f224673d = stringExtra;
        T6().f525536o.setOnClickListener(new z83.j(this));
        a93.a aVar = a93.a.f83962a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        aVar.c(mo55332x76847179, T6().f525527f, T6().f525525d);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "onActivityResult, requestCode:" + i17 + ", resultCode: " + i18);
        if (i17 == 30846) {
            if (i18 == -1) {
                bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
                if (bundleExtra == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bundleExtra.getString("go_next", ""), "get_reg_verify_code")) {
                    return;
                }
                W6();
                return;
            }
            return;
        }
        if (i17 != 30847) {
            android.graphics.Bitmap Vi = ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Vi(this, i17, i18, intent);
            this.f224681o = Vi;
            if (Vi != null) {
                T6().f525524c.setImageBitmap(this.f224681o);
                this.f224680n = true;
                T6().f525524c.setVisibility(0);
                T6().f525523b.setVisibility(8);
                return;
            }
            return;
        }
        bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
        if (bundleExtra == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bundleExtra.getString("go_next", ""), "agree_privacy")) {
            return;
        }
        this.f224682p = false;
        ((x51.c1) this.f224685s).a(this, new z83.a(this, this.f224679m + this.f224677h));
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

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        T6().f525531j.e(null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        T6().f525531j.e(this);
        V6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f224683q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i18 == -75) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f571531i0, com.p314xaae8f345.mm.R.C30867xcad56011.hv6);
            return;
        }
        if (m1Var instanceof hv.f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
            gm0.j1.d().q(145, this);
            h11.e eVar = (h11.e) ((hv.f) m1Var);
            int M = eVar.M();
            com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
            this.f224674e = ((h11.d) v0Var).f359602b.f424458a.A;
            if (M == 22) {
                if (i17 == 0 && i18 == 0) {
                    W6();
                    return;
                }
                if (i18 == -59 || i18 == -41) {
                    tm.a b17 = tm.a.b(str);
                    if (b17 != null) {
                        b17.c(this, null, null);
                        return;
                    } else {
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                        return;
                    }
                }
                this.f224677h = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(this.f224677h);
                this.f224676g = this.f224679m + this.f224677h;
                this.f224674e = ((h11.d) v0Var).f359602b.f424458a.A;
                if (i18 != -36 && i18 != -35 && i18 != -3) {
                    if (i18 == -355) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "showBlockBySpam");
                        ((is.o1) ((js.c1) i95.n0.c(js.c1.class))).getClass();
                        x51.i1.c(this, str, 30846);
                        return;
                    } else if (i18 == -34) {
                        db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ag7), "");
                        return;
                    } else {
                        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                        com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4);
                        return;
                    }
                }
                java.lang.String str2 = ((h11.d) v0Var).f359602b.f424458a.f455055t;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    int length = str2.length() - 1;
                    int i19 = 0;
                    boolean z17 = false;
                    while (i19 <= length) {
                        boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str2.charAt(!z17 ? i19 : length), 32) <= 0;
                        if (z17) {
                            if (!z18) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z18) {
                            i19++;
                        } else {
                            z17 = true;
                        }
                    }
                    this.f224677h = str2.subSequence(i19, length + 1).toString();
                }
                if (i18 == -36) {
                    W6();
                    return;
                }
                tm.a b18 = tm.a.b(str);
                if (b18 != null) {
                    b18.c(mo55332x76847179(), null, null);
                } else {
                    db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), "");
                }
            }
        }
    }
}
