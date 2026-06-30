package com.tencent.mm.plugin.address.ui;

@db5.a(129)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/address/ui/WalletAddAddressUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lal5/e0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes15.dex */
public final class WalletAddAddressUI extends com.tencent.mm.ui.MMActivity implements al5.e0 {
    public static final java.util.Map H = kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.string.m28)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.string.f5s)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.string.lnb)), new jz5.l(4, java.lang.Integer.valueOf(com.tencent.mm.R.string.lrt)));
    public static final java.util.Map I = kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.string.mej)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.string.med)), new jz5.l(7, java.lang.Integer.valueOf(com.tencent.mm.R.string.meo)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.string.mel)), new jz5.l(5, java.lang.Integer.valueOf(com.tencent.mm.R.string.men)), new jz5.l(6, java.lang.Integer.valueOf(com.tencent.mm.R.string.mem)), new jz5.l(8, java.lang.Integer.valueOf(com.tencent.mm.R.string.g0y)));
    public com.tencent.mm.plugin.address.ui.AddrItemView A;
    public com.tencent.mm.plugin.address.ui.AddrItemView B;
    public com.tencent.mm.ui.widget.button.WeButton D;
    public db5.d5 E;
    public com.tencent.mm.ui.widget.dialog.u3 F;

    /* renamed from: d, reason: collision with root package name */
    public int f74462d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74463e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.l1 f74464f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74465g;

    /* renamed from: h, reason: collision with root package name */
    public int f74466h;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelRelativeLayout f74468m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.MMScrollView f74469n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f74470o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f74471p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f74472q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f74473r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f74474s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f74475t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f74476u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f74477v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f74478w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f74479x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.AddrItemView f74480y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.AddrItemView f74481z;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f74467i = new java.util.HashMap();
    public java.lang.String C = "";
    public final com.tencent.mm.plugin.address.ui.m2 G = new com.tencent.mm.plugin.address.ui.m2(this);

    public static final void T6(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI, int i17, int i18, java.lang.String str) {
        walletAddAddressUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAddAddressUI", "doCgiCallback, errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        if (!walletAddAddressUI.isDestroyed() && !walletAddAddressUI.isFinishing()) {
            com.tencent.mm.ui.widget.button.WeButton weButton = walletAddAddressUI.D;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("addrFinish");
                throw null;
            }
            weButton.setEnabled(true);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = walletAddAddressUI.F;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        }
        if (i17 != 0 || i18 != 0) {
            switch (i18) {
                case -3104:
                case -3103:
                case -3102:
                    db5.e1.t(walletAddAddressUI, str, "", com.tencent.mm.plugin.address.ui.o1.f74608d);
                    return;
                case -3101:
                default:
                    db5.e1.o(walletAddAddressUI, com.tencent.mm.R.string.f25do, 0, false, com.tencent.mm.plugin.address.ui.p1.f74612d);
                    return;
                case -3100:
                    db5.e1.o(walletAddAddressUI, com.tencent.mm.R.string.f489860dq, 0, false, new com.tencent.mm.plugin.address.ui.n1(walletAddAddressUI));
                    return;
            }
        }
        s71.a aVar = o71.l.Bi().f360339a;
        if (aVar.f403969d.isEmpty()) {
            walletAddAddressUI.setResult(0);
            walletAddAddressUI.finish();
        }
        s71.b bVar = (s71.b) aVar.f403969d.getFirst();
        if (bVar == null) {
            walletAddAddressUI.setResult(0);
            walletAddAddressUI.finish();
        }
        walletAddAddressUI.setResult(-1, t71.a.a(bVar));
        walletAddAddressUI.finish();
    }

    public static final r45.zi5 U6(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI, s71.b bVar) {
        walletAddAddressUI.getClass();
        r45.zi5 zi5Var = new r45.zi5();
        zi5Var.f392109d = bVar.f403970d;
        r45.du5 du5Var = new r45.du5();
        java.lang.String str = bVar.f403973g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        zi5Var.f392112g = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        java.lang.String str2 = bVar.f403971e;
        if (str2 == null) {
            str2 = "";
        }
        du5Var2.f372756d = str2;
        du5Var2.f372757e = true;
        zi5Var.f392110e = du5Var2;
        r45.du5 du5Var3 = new r45.du5();
        java.lang.String str3 = bVar.f403976m;
        if (str3 == null) {
            str3 = "";
        }
        du5Var3.f372756d = str3;
        du5Var3.f372757e = true;
        zi5Var.f392115m = du5Var3;
        r45.du5 du5Var4 = new r45.du5();
        java.lang.String str4 = bVar.f403974h;
        if (str4 == null) {
            str4 = "";
        }
        du5Var4.f372756d = str4;
        du5Var4.f372757e = true;
        zi5Var.f392113h = du5Var4;
        r45.du5 du5Var5 = new r45.du5();
        java.lang.String str5 = bVar.f403980q;
        if (str5 == null) {
            str5 = "";
        }
        du5Var5.f372756d = str5;
        du5Var5.f372757e = true;
        zi5Var.f392119q = du5Var5;
        r45.du5 du5Var6 = new r45.du5();
        java.lang.String str6 = bVar.f403977n;
        if (str6 == null) {
            str6 = "";
        }
        du5Var6.f372756d = str6;
        du5Var6.f372757e = true;
        zi5Var.f392116n = du5Var6;
        r45.du5 du5Var7 = new r45.du5();
        java.lang.String str7 = bVar.f403978o;
        if (str7 == null) {
            str7 = "";
        }
        du5Var7.f372756d = str7;
        du5Var7.f372757e = true;
        zi5Var.f392117o = du5Var7;
        r45.du5 du5Var8 = new r45.du5();
        java.lang.String str8 = bVar.f403972f;
        if (str8 == null) {
            str8 = "";
        }
        du5Var8.f372756d = str8;
        du5Var8.f372757e = true;
        zi5Var.f392111f = du5Var8;
        r45.du5 du5Var9 = new r45.du5();
        java.lang.String str9 = bVar.f403975i;
        if (str9 == null) {
            str9 = "";
        }
        du5Var9.f372756d = str9;
        du5Var9.f372757e = true;
        zi5Var.f392114i = du5Var9;
        r45.du5 du5Var10 = new r45.du5();
        java.lang.String str10 = bVar.f403979p;
        if (str10 == null) {
            str10 = "";
        }
        du5Var10.f372756d = str10;
        du5Var10.f372757e = true;
        zi5Var.f392118p = du5Var10;
        r45.du5 du5Var11 = new r45.du5();
        java.lang.String str11 = bVar.f403981r;
        du5Var11.f372756d = str11 != null ? str11 : "";
        du5Var11.f372757e = true;
        zi5Var.f392120r = du5Var11;
        return zi5Var;
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        this.f74465g = z17;
        this.f74466h = i17;
        Y6(z17, i17);
    }

    public final void V6() {
        s71.b a17 = this.f74462d != 0 ? o71.l.Bi().a(this.f74462d) : new s71.b();
        s71.b W6 = W6();
        java.lang.String str = a17.f403981r;
        if (str == null || str.length() == 0) {
            W6.f403981r = "86";
        }
        if (W6.compareContent(a17) || !X6()) {
            setResult(0);
            finish();
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.g(getString(com.tencent.mm.R.string.f489863du));
        u1Var.n(getString(com.tencent.mm.R.string.mdx));
        u1Var.j(getString(com.tencent.mm.R.string.mdw));
        u1Var.b(new com.tencent.mm.plugin.address.ui.m1(this));
        u1Var.q(false);
    }

    public final s71.b W6() {
        s71.b bVar = new s71.b();
        if (this.f74462d != 0) {
            bVar.parseFrom(o71.l.Bi().a(this.f74462d).toByteArrayOrNull());
        }
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = this.f74480y;
        if (addrItemView == null) {
            kotlin.jvm.internal.o.o("addrRegion");
            throw null;
        }
        java.util.List f07 = r26.n0.f0(addrItemView.getText(), new java.lang.String[]{" "}, false, 0, 6, null);
        java.lang.String str = (java.lang.String) kz5.n0.a0(f07, 0);
        if (str == null) {
            str = "";
        }
        bVar.f403972f = str;
        java.lang.String str2 = (java.lang.String) kz5.n0.a0(f07, 1);
        if (str2 == null) {
            str2 = "";
        }
        bVar.f403973g = str2;
        java.lang.String str3 = (java.lang.String) kz5.n0.a0(f07, 2);
        if (str3 == null) {
            str3 = "";
        }
        bVar.f403974h = str3;
        java.lang.String str4 = (java.lang.String) kz5.n0.a0(f07, 3);
        bVar.f403980q = str4 != null ? str4 : "";
        bVar.f403979p = this.C;
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView2 = this.f74481z;
        if (addrItemView2 == null) {
            kotlin.jvm.internal.o.o("addrDetailed");
            throw null;
        }
        bVar.f403976m = addrItemView2.getText();
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView3 = this.A;
        if (addrItemView3 == null) {
            kotlin.jvm.internal.o.o("addrName");
            throw null;
        }
        bVar.f403977n = addrItemView3.getText();
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView4 = this.B;
        if (addrItemView4 == null) {
            kotlin.jvm.internal.o.o("addrPhone");
            throw null;
        }
        bVar.f403978o = addrItemView4.getText();
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView5 = this.B;
        if (addrItemView5 == null) {
            kotlin.jvm.internal.o.o("addrPhone");
            throw null;
        }
        bVar.f403981r = addrItemView5.getCode();
        while (true) {
            java.lang.String tCountryCode = bVar.f403981r;
            kotlin.jvm.internal.o.f(tCountryCode, "tCountryCode");
            if (!r26.i0.y(tCountryCode, "+", false)) {
                return bVar;
            }
            java.lang.String tCountryCode2 = bVar.f403981r;
            kotlin.jvm.internal.o.f(tCountryCode2, "tCountryCode");
            java.lang.String substring = tCountryCode2.substring(1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            bVar.f403981r = substring;
        }
    }

    public final boolean X6() {
        com.tencent.mm.plugin.address.ui.AddrItemView[] addrItemViewArr = new com.tencent.mm.plugin.address.ui.AddrItemView[4];
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = this.f74480y;
        if (addrItemView == null) {
            kotlin.jvm.internal.o.o("addrRegion");
            throw null;
        }
        addrItemViewArr[0] = addrItemView;
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView2 = this.f74481z;
        if (addrItemView2 == null) {
            kotlin.jvm.internal.o.o("addrDetailed");
            throw null;
        }
        addrItemViewArr[1] = addrItemView2;
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView3 = this.A;
        if (addrItemView3 == null) {
            kotlin.jvm.internal.o.o("addrName");
            throw null;
        }
        addrItemViewArr[2] = addrItemView3;
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView4 = this.B;
        if (addrItemView4 == null) {
            kotlin.jvm.internal.o.o("addrPhone");
            throw null;
        }
        addrItemViewArr[3] = addrItemView4;
        for (com.tencent.mm.plugin.address.ui.AddrItemView addrItemView5 : kz5.c0.i(addrItemViewArr)) {
            int b17 = addrItemView5.b();
            if ((addrItemView5.getText().length() == 0) || b17 != 0) {
                return false;
            }
        }
        return true;
    }

    public final void Y6(boolean z17, int i17) {
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView;
        int bottom;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.sba);
        int dimensionPixelSize = z17 ? i17 + getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479735ds);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), dimensionPixelSize);
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView2 = this.B;
        if (addrItemView2 == null) {
            kotlin.jvm.internal.o.o("addrPhone");
            throw null;
        }
        if (addrItemView2.hasFocus()) {
            addrItemView = this.B;
            if (addrItemView == null) {
                kotlin.jvm.internal.o.o("addrPhone");
                throw null;
            }
        } else {
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView3 = this.A;
            if (addrItemView3 == null) {
                kotlin.jvm.internal.o.o("addrName");
                throw null;
            }
            if (addrItemView3.hasFocus()) {
                addrItemView = this.A;
                if (addrItemView == null) {
                    kotlin.jvm.internal.o.o("addrName");
                    throw null;
                }
            } else {
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView4 = this.f74481z;
                if (addrItemView4 == null) {
                    kotlin.jvm.internal.o.o("addrDetailed");
                    throw null;
                }
                if (addrItemView4.hasFocus()) {
                    addrItemView = this.f74481z;
                    if (addrItemView == null) {
                        kotlin.jvm.internal.o.o("addrDetailed");
                        throw null;
                    }
                } else {
                    com.tencent.mm.plugin.address.ui.AddrItemView addrItemView5 = this.f74480y;
                    if (addrItemView5 == null) {
                        kotlin.jvm.internal.o.o("addrRegion");
                        throw null;
                    }
                    if (addrItemView5.hasFocus()) {
                        addrItemView = this.f74480y;
                        if (addrItemView == null) {
                            kotlin.jvm.internal.o.o("addrRegion");
                            throw null;
                        }
                    } else {
                        addrItemView = null;
                    }
                }
            }
        }
        int i18 = 0;
        if (addrItemView != null) {
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView6 = this.B;
            if (addrItemView6 == null) {
                kotlin.jvm.internal.o.o("addrPhone");
                throw null;
            }
            bottom = addrItemView6.getBottom() - addrItemView.getBottom();
        } else {
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView7 = this.B;
            if (addrItemView7 == null) {
                kotlin.jvm.internal.o.o("addrPhone");
                throw null;
            }
            int bottom2 = addrItemView7.getBottom();
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f74474s;
            if (mMEditText == null) {
                kotlin.jvm.internal.o.o("addrCaptureET");
                throw null;
            }
            bottom = bottom2 - mMEditText.getBottom();
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.sbc);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (z17) {
            com.tencent.mm.ui.widget.button.WeButton weButton = this.D;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("addrFinish");
                throw null;
            }
            i18 = ((dimensionPixelSize + weButton.getHeight()) + getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu)) - bottom;
        }
        layoutParams.height = i18;
        findViewById.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.address.ui.MMScrollView mMScrollView = this.f74469n;
        if (mMScrollView != null) {
            mMScrollView.post(new com.tencent.mm.plugin.address.ui.j2(this));
        } else {
            kotlin.jvm.internal.o.o("addrContainerSV");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceUIMode() {
        if ((getIntent() != null) && getIntent().getBooleanExtra("force_light_mode", false)) {
            return 2;
        }
        return super.getForceUIMode();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d4y;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean isHideVKBWhenScroll() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAddAddressUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18);
        if (i18 != -1) {
            if (i18 != 100) {
                return;
            }
            kotlin.jvm.internal.o.d(intent);
            java.lang.String stringExtra = intent.getStringExtra("couttry_code");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "86";
            }
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = this.B;
            if (addrItemView == null) {
                kotlin.jvm.internal.o.o("addrPhone");
                throw null;
            }
            addrItemView.setCode("+".concat(stringExtra));
        }
        if (i17 == 1) {
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("karea_result") : null;
            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView2 = this.f74480y;
                if (addrItemView2 == null) {
                    kotlin.jvm.internal.o.o("addrRegion");
                    throw null;
                }
                addrItemView2.setText(stringExtra2);
            }
            java.lang.String stringExtra3 = intent != null ? intent.getStringExtra("kwcode") : null;
            if (stringExtra3 == null || stringExtra3.length() == 0) {
                return;
            }
            this.C = stringExtra3;
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.tencent.mm.modelgeo.Addr addr = intent != null ? (com.tencent.mm.modelgeo.Addr) intent.getParcelableExtra("key_pick_addr") : null;
        if (addr != null) {
            java.lang.String str = addr.f71215h;
            if (str == null || str.length() == 0) {
                str = addr.f71214g;
            }
            com.tencent.mm.plugin.address.model.RcptItem h17 = o71.l.Bi().h(addr.f71213f, str, addr.f71216i, addr.f71220p);
            if (h17 != null) {
                java.lang.String g07 = kz5.n0.g0(kz5.i0.H(q26.h0.y(q26.h0.o(q26.y.d(h17, com.tencent.mm.plugin.address.ui.n2.f74601d), com.tencent.mm.plugin.address.ui.o2.f74609d))), " ", null, null, 0, null, null, 62, null);
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView3 = this.f74480y;
                if (addrItemView3 == null) {
                    kotlin.jvm.internal.o.o("addrRegion");
                    throw null;
                }
                addrItemView3.setText(g07);
                java.lang.String str2 = h17.f74372e;
                this.C = str2 != null ? str2 : "";
            } else {
                com.tencent.mm.plugin.address.ui.AddrItemView addrItemView4 = this.f74480y;
                if (addrItemView4 == null) {
                    kotlin.jvm.internal.o.o("addrRegion");
                    throw null;
                }
                addrItemView4.setText("");
            }
            java.lang.String c17 = addr.c();
            kotlin.jvm.internal.o.f(c17, "getPoiName(...)");
            if (c17.length() == 0) {
                java.lang.String str3 = addr.f71211d;
                if (!(str3 == null || str3.length() == 0)) {
                    com.tencent.mm.plugin.address.ui.AddrItemView addrItemView5 = this.f74481z;
                    if (addrItemView5 == null) {
                        kotlin.jvm.internal.o.o("addrDetailed");
                        throw null;
                    }
                    java.lang.String address = addr.f71211d;
                    kotlin.jvm.internal.o.f(address, "address");
                    addrItemView5.setText(address);
                    return;
                }
            }
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView6 = this.f74481z;
            if (addrItemView6 == null) {
                kotlin.jvm.internal.o.o("addrDetailed");
                throw null;
            }
            java.lang.String[] strArr = new java.lang.String[4];
            java.lang.String str4 = addr.f71217m;
            if (!(!(str4 == null || str4.length() == 0))) {
                str4 = null;
            }
            strArr[0] = str4;
            java.lang.String str5 = addr.f71218n;
            if (!(!(str5 == null || str5.length() == 0))) {
                str5 = null;
            }
            strArr[1] = str5;
            java.lang.String str6 = addr.f71219o;
            if (!(!(str6 == null || str6.length() == 0))) {
                str6 = null;
            }
            strArr[2] = str6;
            java.lang.String c18 = addr.c();
            strArr[3] = (c18 == null || c18.length() == 0) ^ true ? c18 : null;
            addrItemView6.setText(kz5.n0.g0(kz5.z.I(strArr), " ", null, null, 0, null, null, 62, null));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f74462d = getIntent().getIntExtra("address_id", 0);
        this.f74463e = getIntent().getBooleanExtra("force_light_mode", false);
        java.util.HashMap hashMap = (java.util.HashMap) this.f74467i;
        hashMap.put("address_edit_status", java.lang.Integer.valueOf(this.f74462d == 0 ? 2 : 1));
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(getIntent().getIntExtra("enter_scene_address", 0)));
        hashMap.put("page_state", java.lang.Integer.valueOf(getIntent().getIntExtra("page_state", 1)));
        if (this.f74463e) {
            androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
            g0Var.getClass();
            if (g0Var.M != 1) {
                g0Var.M = 1;
                if (g0Var.N) {
                    g0Var.a();
                }
            }
        }
        super.onCreate(bundle);
        o71.l.Bi().f();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.voq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.InputPanelRelativeLayout inputPanelRelativeLayout = (com.tencent.mm.ui.widget.InputPanelRelativeLayout) findViewById;
        this.f74468m = inputPanelRelativeLayout;
        java.util.LinkedList linkedList = (java.util.LinkedList) inputPanelRelativeLayout.f211270e;
        if (linkedList.contains(this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.InputPanelRelativeLayout", "listener already added");
        } else {
            linkedList.add(this);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s_z);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f74469n = (com.tencent.mm.plugin.address.ui.MMScrollView) findViewById2;
        getController().s0(new com.tencent.mm.plugin.address.ui.e2(this), this.f74462d == 0 ? com.tencent.mm.R.raw.actionbar_icon_dark_close : 0);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.sbe);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f74470o = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.s6e);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f74471p = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rup);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f74472q = (android.widget.LinearLayout) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.rvu);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f74473r = (android.widget.LinearLayout) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.s2k);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f74474s = (com.tencent.mm.ui.widget.MMEditText) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.rtn);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f74475t = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.s_y);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f74476u = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.s_3);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f74477v = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.f482725s61);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f74478w = findViewById11;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.s2m);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f74479x = findViewById12;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.sbd);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f74480y = (com.tencent.mm.plugin.address.ui.AddrItemView) findViewById13;
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.sb9);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f74481z = (com.tencent.mm.plugin.address.ui.AddrItemView) findViewById14;
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.f482729m9);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.A = (com.tencent.mm.plugin.address.ui.AddrItemView) findViewById15;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.sbb);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.B = (com.tencent.mm.plugin.address.ui.AddrItemView) findViewById16;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f74474s;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        mMEditText.setHint(getString(com.tencent.mm.R.string.cuj));
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.sb_);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.D = (com.tencent.mm.ui.widget.button.WeButton) findViewById17;
        if (this.f74462d != 0) {
            s71.b a17 = o71.l.Bi().a(this.f74462d);
            if (a17 == null) {
                finish();
                return;
            }
            a17.toByteArrayOrNull();
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = this.f74480y;
            if (addrItemView == null) {
                kotlin.jvm.internal.o.o("addrRegion");
                throw null;
            }
            java.lang.String[] strArr = new java.lang.String[4];
            java.lang.String str = a17.f403972f;
            if (!(!(str == null || str.length() == 0))) {
                str = null;
            }
            strArr[0] = str;
            java.lang.String str2 = a17.f403973g;
            if (!(!(str2 == null || str2.length() == 0))) {
                str2 = null;
            }
            strArr[1] = str2;
            java.lang.String str3 = a17.f403974h;
            if (!(!(str3 == null || str3.length() == 0))) {
                str3 = null;
            }
            strArr[2] = str3;
            java.lang.String str4 = a17.f403980q;
            if (!(!(str4 == null || str4.length() == 0))) {
                str4 = null;
            }
            strArr[3] = str4;
            addrItemView.setText(kz5.n0.g0(kz5.z.I(strArr), " ", null, null, 0, null, null, 62, null));
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView2 = this.f74481z;
            if (addrItemView2 == null) {
                kotlin.jvm.internal.o.o("addrDetailed");
                throw null;
            }
            java.lang.String tDetail = a17.f403976m;
            kotlin.jvm.internal.o.f(tDetail, "tDetail");
            addrItemView2.setText(tDetail);
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView3 = this.A;
            if (addrItemView3 == null) {
                kotlin.jvm.internal.o.o("addrName");
                throw null;
            }
            java.lang.String tName = a17.f403977n;
            kotlin.jvm.internal.o.f(tName, "tName");
            addrItemView3.setText(tName);
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView4 = this.B;
            if (addrItemView4 == null) {
                kotlin.jvm.internal.o.o("addrPhone");
                throw null;
            }
            addrItemView4.setCode(a17.f403981r);
            com.tencent.mm.plugin.address.ui.AddrItemView addrItemView5 = this.B;
            if (addrItemView5 == null) {
                kotlin.jvm.internal.o.o("addrPhone");
                throw null;
            }
            java.lang.String tPhone = a17.f403978o;
            kotlin.jvm.internal.o.f(tPhone, "tPhone");
            addrItemView5.setText(tPhone);
            java.lang.String str5 = a17.f403979p;
            this.C = str5 != null ? str5 : "";
        }
        android.widget.TextView textView = this.f74470o;
        if (textView == null) {
            kotlin.jvm.internal.o.o("addrTitleTV");
            throw null;
        }
        textView.setText(getString(this.f74462d == 0 ? com.tencent.mm.R.string.a_e : com.tencent.mm.R.string.g0x));
        android.widget.LinearLayout linearLayout = this.f74471p;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("addrCaptureMapLL");
            throw null;
        }
        linearLayout.setOnClickListener(new com.tencent.mm.plugin.address.ui.f2(this));
        android.widget.LinearLayout linearLayout2 = this.f74472q;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("addrCaptureClipboardLL");
            throw null;
        }
        linearLayout2.setOnClickListener(new com.tencent.mm.plugin.address.ui.g2(this));
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f74474s;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        mMEditText2.addTextChangedListener(new com.tencent.mm.plugin.address.ui.h2(this));
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f74474s;
        if (mMEditText3 == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        mMEditText3.setOnTouchListener(new com.tencent.mm.plugin.address.ui.i2(this));
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = this.f74474s;
        if (mMEditText4 == null) {
            kotlin.jvm.internal.o.o("addrCaptureET");
            throw null;
        }
        mMEditText4.getViewTreeObserver().addOnScrollChangedListener(new com.tencent.mm.plugin.address.ui.q1(this));
        android.widget.TextView textView2 = this.f74475t;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("addrCaptureClearTV");
            throw null;
        }
        textView2.setOnClickListener(new com.tencent.mm.plugin.address.ui.r1(this));
        android.widget.TextView textView3 = this.f74476u;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("addrCaptureRecognizeTV");
            throw null;
        }
        textView3.setOnClickListener(new com.tencent.mm.plugin.address.ui.t1(this));
        android.widget.TextView textView4 = this.f74477v;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("addrCapturePasteRecognizeTV");
            throw null;
        }
        textView4.setOnClickListener(new com.tencent.mm.plugin.address.ui.u1(this));
        com.tencent.mm.plugin.address.ui.AddrItemView[] addrItemViewArr = new com.tencent.mm.plugin.address.ui.AddrItemView[4];
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView6 = this.f74480y;
        if (addrItemView6 == null) {
            kotlin.jvm.internal.o.o("addrRegion");
            throw null;
        }
        addrItemViewArr[0] = addrItemView6;
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView7 = this.f74481z;
        if (addrItemView7 == null) {
            kotlin.jvm.internal.o.o("addrDetailed");
            throw null;
        }
        addrItemViewArr[1] = addrItemView7;
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView8 = this.A;
        if (addrItemView8 == null) {
            kotlin.jvm.internal.o.o("addrName");
            throw null;
        }
        addrItemViewArr[2] = addrItemView8;
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView9 = this.B;
        if (addrItemView9 == null) {
            kotlin.jvm.internal.o.o("addrPhone");
            throw null;
        }
        addrItemViewArr[3] = addrItemView9;
        java.util.Iterator it = kz5.c0.i(addrItemViewArr).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.address.ui.AddrItemView) it.next()).setStateCallback(this.G);
        }
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView10 = this.f74480y;
        if (addrItemView10 == null) {
            kotlin.jvm.internal.o.o("addrRegion");
            throw null;
        }
        addrItemView10.setOnClickListener(new com.tencent.mm.plugin.address.ui.z1(this));
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView11 = this.B;
        if (addrItemView11 == null) {
            kotlin.jvm.internal.o.o("addrPhone");
            throw null;
        }
        addrItemView11.setItemCodeLLOnClickListener(new com.tencent.mm.plugin.address.ui.a2(this));
        com.tencent.mm.ui.widget.button.WeButton weButton = this.D;
        if (weButton == null) {
            kotlin.jvm.internal.o.o("addrFinish");
            throw null;
        }
        weButton.setEnabled(X6());
        com.tencent.mm.ui.widget.button.WeButton weButton2 = this.D;
        if (weButton2 == null) {
            kotlin.jvm.internal.o.o("addrFinish");
            throw null;
        }
        weButton2.setOnClickListener(new com.tencent.mm.plugin.address.ui.d2(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAddAddressUI", "onCreate, addressID = " + this.f74462d);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q71.f0 Bi = o71.l.Bi();
        Bi.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAddrMgr", "clean data");
        ((java.util.ArrayList) Bi.f360342d).clear();
        Bi.f360341c.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAddAddressUI", "onDestroy");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyDown(i17, event);
        }
        V6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAddAddressUI", "onRequestPermissionsResult, requestCode = " + i17 + ", grantResults = " + grantResults[0] + ", tid = " + java.lang.Thread.currentThread().getId());
        if (i17 == 64) {
            if (grantResults[0] != 0) {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.address.ui.k2(this), com.tencent.mm.plugin.address.ui.l2.f74586d);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletAddAddressUI", "onRequestPermissionsResult, PERMISSION_GRANTED");
            android.widget.LinearLayout linearLayout = this.f74471p;
            if (linearLayout != null) {
                linearLayout.performClick();
            } else {
                kotlin.jvm.internal.o.o("addrCaptureMapLL");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            com.tencent.mm.ui.widget.InputPanelRelativeLayout inputPanelRelativeLayout = this.f74468m;
            if (inputPanelRelativeLayout == null) {
                kotlin.jvm.internal.o.o("addrRoot");
                throw null;
            }
            java.util.LinkedList linkedList = (java.util.LinkedList) inputPanelRelativeLayout.f211270e;
            if (linkedList.contains(this)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.InputPanelRelativeLayout", "listener already added");
            } else {
                linkedList.add(this);
            }
        }
    }
}
