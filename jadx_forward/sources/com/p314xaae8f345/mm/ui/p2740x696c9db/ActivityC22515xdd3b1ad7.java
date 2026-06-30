package com.p314xaae8f345.mm.ui.p2740x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/tools/NewCountryCodeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.tools.NewCountryCodeUI */
/* loaded from: classes15.dex */
public final class ActivityC22515xdd3b1ad7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public android.view.View B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22716xe73ca68f C;
    public android.os.Vibrator D;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f291646d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.m7 f291647e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10 f291648f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f291649g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f291650h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f291651i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f291652m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f291654o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f291655p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f291656q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f291657r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f291658s;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f291660u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f291661v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f291662w;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.k7 f291665z;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f291653n = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f291659t = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f291663x = "";

    /* renamed from: y, reason: collision with root package name */
    public int f291664y = -1;

    public static final void T6(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7, int i17, boolean z17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.m7 m7Var = activityC22515xdd3b1ad7.f291647e;
        if (m7Var != null) {
            int[] a17 = m7Var.a();
            int length = a17.length;
            for (int i18 = 0; i18 < length; i18++) {
                if (a17[i18] == i17) {
                    if (activityC22515xdd3b1ad7.f291664y != i17) {
                        activityC22515xdd3b1ad7.f291664y = i17;
                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                            android.os.VibrationEffect createOneShot = android.os.VibrationEffect.createOneShot(10L, 255);
                            android.os.Vibrator vibrator = activityC22515xdd3b1ad7.D;
                            if (vibrator != null) {
                                vibrator.vibrate(createOneShot);
                            }
                        } else {
                            android.os.Vibrator vibrator2 = activityC22515xdd3b1ad7.D;
                            if (vibrator2 != null) {
                                vibrator2.vibrate(10L);
                            }
                        }
                    }
                    android.widget.ListView listView = activityC22515xdd3b1ad7.f291646d;
                    if (listView != null) {
                        listView.setSelection(i18 + listView.getHeaderViewsCount());
                    }
                    activityC22515xdd3b1ad7.f291662w = z17;
                    return;
                }
            }
        }
    }

    public final void U6() {
        android.widget.ListView listView;
        if (this.A) {
            this.A = false;
            android.view.View view = this.B;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI", "collapseSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/tools/NewCountryCodeUI", "collapseSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10 c22514xd4b49a10 = this.f291648f;
            if (c22514xd4b49a10 != null) {
                c22514xd4b49a10.setVisibility(0);
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var = this.f291665z;
            if (k7Var != null) {
                k7Var.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var2 = this.f291665z;
            if (k7Var2 != null) {
                k7Var2.b();
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var3 = this.f291665z;
            if (k7Var3 != null) {
                ((android.view.inputmethod.InputMethodManager) k7Var3.getContext().getSystemService("input_method")).hideSoftInputFromWindow(k7Var3.f291495e.getWindowToken(), 0);
            }
            android.view.ViewGroup viewGroup = this.f291660u;
            android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563975ep) : null;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.ViewGroup viewGroup2 = this.f291660u;
            android.view.View findViewById = viewGroup2 != null ? viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI", "collapseSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/tools/NewCountryCodeUI", "collapseSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.f291661v;
            if (view3 != null && (listView = this.f291646d) != null) {
                listView.addHeaderView(view3);
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var4 = this.f291665z;
            if (k7Var4 != null) {
                k7Var4.mo81060xd7655c6f("");
            }
            this.f291653n = "";
            V6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            r11 = this;
            com.tencent.mm.ui.tools.m7 r0 = r11.f291647e
            if (r0 == 0) goto Lac
            java.lang.String r1 = r11.f291653n
            if (r1 == 0) goto L11
            java.lang.CharSequence r1 = r26.n0.u0(r1)
            java.lang.String r1 = r1.toString()
            goto L12
        L11:
            r1 = 0
        L12:
            r0.f292107g = r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            int r1 = r1.length()
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = r2
            goto L22
        L21:
            r1 = r3
        L22:
            r0.f292110m = r1
            java.util.List r1 = r0.f292105e
            r1.clear()
            java.util.List r4 = r0.f292106f
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L31:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La6
            java.lang.Object r5 = r4.next()
            u11.a r5 = (u11.a) r5
            java.lang.String r6 = r0.f292107g
            if (r6 == 0) goto L9f
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r8 = "getDefault(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)
            java.lang.String r6 = r6.toUpperCase(r7)
            java.lang.String r7 = "toUpperCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)
            java.lang.String r9 = r5.f505262c
            java.lang.String r10 = "countryName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r10)
            java.util.Locale r10 = java.util.Locale.getDefault()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r8)
            java.lang.String r9 = r9.toUpperCase(r10)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r7)
            boolean r9 = r26.n0.B(r9, r6, r2)
            if (r9 != 0) goto L9f
            java.lang.String r9 = r5.f505263d
            java.lang.String r10 = "sortName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r10)
            java.util.Locale r10 = java.util.Locale.getDefault()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r8)
            java.lang.String r8 = r9.toUpperCase(r10)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r7)
            boolean r6 = r26.n0.B(r8, r6, r2)
            if (r6 != 0) goto L9f
            java.lang.String r6 = r5.f505261b
            java.lang.String r7 = "zoneNum"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)
            java.lang.String r7 = r0.f292107g
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            boolean r6 = r26.n0.B(r6, r7, r2)
            if (r6 == 0) goto L9d
            goto L9f
        L9d:
            r6 = r2
            goto La0
        L9f:
            r6 = r3
        La0:
            if (r6 == 0) goto L31
            r1.add(r5)
            goto L31
        La6:
            r0.c()
            r0.notifyDataSetChanged()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7.V6():void");
    }

    public final void W6(java.lang.String str, int i17) {
        android.widget.TextView textView;
        if (str.length() == 0) {
            return;
        }
        char charAt = str.charAt(0);
        com.p314xaae8f345.mm.ui.p2740x696c9db.m7 m7Var = this.f291647e;
        if (m7Var != null) {
            int[] a17 = m7Var.a();
            int length = a17.length;
            for (int i18 = 0; i18 < length; i18++) {
                if (a17[i18] == charAt) {
                    android.widget.ListView listView = this.f291646d;
                    if (listView != null) {
                        int firstVisiblePosition = i18 - listView.getFirstVisiblePosition();
                        android.widget.ListView listView2 = this.f291646d;
                        android.view.View childAt = listView.getChildAt(firstVisiblePosition + (listView2 != null ? listView2.getHeaderViewsCount() : 0));
                        if (childAt == null || (textView = (android.widget.TextView) childAt.findViewById(com.p314xaae8f345.mm.R.id.cfx)) == null) {
                            return;
                        }
                        textView.setTextColor(b3.l.m9702x7444d5ad(mo55332x76847179(), i17));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void X6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", this.f291650h);
        intent.putExtra("couttry_code", this.f291651i);
        intent.putExtra("iso_code", this.f291652m);
        setResult(100, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.elc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        m78596x71afbec8(8);
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = mo78514x143f1b92();
        mo78514x143f1b92.u0(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo78514x143f1b92.G0(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        mo78514x143f1b92.f290208w = false;
        ul5.k kVar = mo78514x143f1b92.f290207v;
        if (kVar != null) {
            kVar.mo82163x4e0f6657(false);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f291650h = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f291651i = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("iso_code");
        this.f291652m = stringExtra3 != null ? stringExtra3 : "";
        this.f291654o = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", true);
        this.f291655p = getIntent().getStringArrayExtra("exclude_countries_iso");
        this.f291656q = getIntent().getStringExtra("ui_title");
        this.D = (android.os.Vibrator) mo55332x76847179().getSystemService("vibrator");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.f563965ef);
        if (c1073x7e08a787 != null) {
            this.f291660u = c1073x7e08a787;
            android.widget.TextView textView = (android.widget.TextView) c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.f563975ep);
            if (textView != null) {
                textView.setText(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291656q) ? this.f291656q : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571468fy));
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                if (com.p314xaae8f345.mm.ui.f.a()) {
                    com.p314xaae8f345.mm.ui.f.b(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
                } else if (i65.a.D(mo55332x76847179())) {
                    textView.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b) * i65.a.m(mo55332x76847179()));
                }
            }
            android.view.View findViewById = c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
            if (findViewById != null) {
                findViewById.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.u7(this));
            }
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.jcb);
        this.B = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.t7(this));
        }
        java.util.List b17 = u11.b.b(false);
        this.f291649g = b17;
        java.lang.String[] strArr = this.f291655p;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                while (it.hasNext()) {
                    java.lang.String countryIsoCode = ((u11.a) it.next()).f505260a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(countryIsoCode, "countryIsoCode");
                    java.lang.String[] strArr2 = this.f291655p;
                    if (strArr2 != null) {
                        for (java.lang.String str : strArr2) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, countryIsoCode)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewCountryCodeUI", "exclude country: %s", countryIsoCode);
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        it.remove();
                    }
                }
            }
        }
        kz5.g0.t(b17, com.p314xaae8f345.mm.ui.p2740x696c9db.v7.f292377d);
        this.f291657r = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.va7);
        this.f291658s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.va6);
        this.f291646d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564268mf);
        java.util.List list = this.f291649g;
        if (list != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.m7 m7Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.m7(this, list);
            this.f291647e = m7Var;
            m7Var.f292109i = this.f291654o;
        }
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.elb, null);
        this.f291661v = inflate;
        if (inflate != null) {
            inflate.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.s7(this, inflate));
        }
        android.widget.ListView listView = this.f291646d;
        if (listView != null) {
            listView.addHeaderView(this.f291661v);
        }
        android.widget.ListView listView2 = this.f291646d;
        if (listView2 != null) {
            listView2.setAdapter((android.widget.ListAdapter) this.f291647e);
        }
        android.widget.ListView listView3 = this.f291646d;
        if (listView3 != null) {
            listView3.setVisibility(0);
        }
        android.widget.ListView listView4 = this.f291646d;
        if (listView4 != null) {
            listView4.setOnScrollListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.q7(this));
        }
        android.widget.ListView listView5 = this.f291646d;
        if (listView5 != null) {
            android.view.ViewParent parent = listView5.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                this.C = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22716xe73ca68f(this);
                android.view.ViewGroup.LayoutParams layoutParams = listView5.getLayoutParams();
                int indexOfChild = viewGroup.indexOfChild(listView5);
                viewGroup.removeViewAt(indexOfChild);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22716xe73ca68f c22716xe73ca68f = this.C;
                if (c22716xe73ca68f != null) {
                    c22716xe73ca68f.mo82175x76516a27(listView5);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22716xe73ca68f c22716xe73ca68f2 = this.C;
                if (c22716xe73ca68f2 != null) {
                    c22716xe73ca68f2.mo82174x3b2a1eb1(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560068ah2));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22716xe73ca68f c22716xe73ca68f3 = this.C;
                if (c22716xe73ca68f3 != null) {
                    c22716xe73ca68f3.mo82166x35ae8153(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22716xe73ca68f c22716xe73ca68f4 = this.C;
                if (c22716xe73ca68f4 != null) {
                    c22716xe73ca68f4.q();
                }
                viewGroup.addView(this.C, indexOfChild, layoutParams);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10 c22514xd4b49a10 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10) findViewById(com.p314xaae8f345.mm.R.id.f564281mx);
        this.f291648f = c22514xd4b49a10;
        if (c22514xd4b49a10 != null) {
            c22514xd4b49a10.m79298x40d747ee(new com.p314xaae8f345.mm.ui.p2740x696c9db.p7(this));
        }
        android.widget.ListView listView6 = this.f291646d;
        if (listView6 != null) {
            listView6.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.r7(this));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.k7(this);
        this.f291665z = k7Var;
        k7Var.mo81055x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var2 = this.f291665z;
        if (k7Var2 != null) {
            k7Var2.mo81051x6c4032e7(new com.p314xaae8f345.mm.ui.p2740x696c9db.n7(this));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var3 = this.f291665z;
        if (k7Var3 != null) {
            k7Var3.mo81050xd7457004(new com.p314xaae8f345.mm.ui.p2740x696c9db.o7(this));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var4 = this.f291665z;
        if (k7Var4 != null) {
            k7Var4.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = this.f291660u;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f291665z, new android.widget.LinearLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyUp(i17, event);
        }
        if (this.A) {
            U6();
            return true;
        }
        X6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.A) {
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(la5.y.class);
    }
}
