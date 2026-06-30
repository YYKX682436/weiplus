package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

@db5.a(m123858x6ac9171 = dc1.e.f65819x366c91de)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "ImageRecyclerView", "com/tencent/mm/plugin/finder/feed/ui/commentimage/o", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI */
/* loaded from: classes10.dex */
public final class ActivityC14126xa5cf9084 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final /* synthetic */ int U = 0;
    public android.view.View A;
    public android.view.View B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 C;
    public boolean G;
    public boolean H;
    public android.os.Bundle I;
    public int K;
    public int L;
    public android.graphics.Rect M;
    public android.graphics.Rect N;
    public boolean P;
    public int Q;
    public boolean R;

    /* renamed from: u, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f191310u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f191311v;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f191313x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f191314y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f191315z;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f191309t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.w0(this));

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 f191312w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6();
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.o D = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.o();
    public final android.content.Intent E = new android.content.Intent();
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.s4 F = new com.p314xaae8f345.mm.ui.p2740x696c9db.s4(this);

    /* renamed from: J, reason: collision with root package name */
    public float f191308J = 1.0f;
    public final gd2.n S = new gd2.n(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.z(this));
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.C14127xf4db03ac T = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1>() { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI$commentChangeEventListener$1
        {
            super(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.this);
            this.f39173x3fe91575 = 449554913;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 r8) {
            /*
                r7 = this;
                com.tencent.mm.autogen.events.FinderCommentChangeEvent r8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1) r8
                java.lang.String r0 = "event"
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
                r0 = 1
                com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.this
                r2 = 0
                am.ta r3 = r8.f135796g
                if (r3 == 0) goto L25
                long r3 = r3.f89526a
                int r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.U
                com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 r5 = r1.d7()
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.O6()
                long r5 = r5.m59251x5db1b11()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L25
                r3 = r0
                goto L26
            L25:
                r3 = r2
            L26:
                if (r3 != 0) goto L2a
                r0 = r2
                goto L32
            L2a:
                com.tencent.mm.plugin.finder.feed.ui.commentimage.y r2 = new com.tencent.mm.plugin.finder.feed.ui.commentimage.y
                r2.<init>(r8, r1)
                pm0.v.X(r2)
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.C14127xf4db03ac.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    public final void c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.C;
        if (c15270x6d877a34 != null) {
            c15270x6d877a34.r();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a342 = this.C;
        if (c15270x6d877a342 != null) {
            c15270x6d877a342.w2(0, false);
        }
        android.view.View view = this.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "closeCommentFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "closeCommentFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a343 = this.C;
        if (c15270x6d877a343 != null) {
            c15270x6d877a343.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.p(this));
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d1 d7() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d1) this.f191309t.mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L4e
            boolean r0 = r3.getF147381t()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2e
            com.tencent.mm.ui.widget.SwipeBackLayout r0 = r3.m78735x28280f95()
            if (r0 == 0) goto L23
            r0.a()
            boolean r0 = r0.f292974v
            if (r0 != r2) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L2e
            java.lang.String r4 = "FinderCommentImageFlowUI"
            java.lang.String r0 = "IS SwipeBack ING, ignore KeyBack Event"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r0)
            return r2
        L2e:
            int r0 = r4.getAction()
            if (r0 != 0) goto L4e
            android.view.View r4 = r3.B
            if (r4 == 0) goto L44
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L40
            r4 = r2
            goto L41
        L40:
            r4 = r1
        L41:
            if (r4 != r2) goto L44
            r1 = r2
        L44:
            if (r1 == 0) goto L4a
            r3.c7()
            goto L4d
        L4a:
            r3.e7()
        L4d:
            return r2
        L4e:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.e7():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        int i17 = this.D.f191411f;
        android.content.Intent intent = this.E;
        if (i17 != -1) {
            so2.y0 y0Var = (so2.y0) kz5.n0.a0(d7().f191360n, i17);
            java.lang.Long valueOf = y0Var != null ? java.lang.Long.valueOf(y0Var.mo2128x1ed62e84()) : null;
            long j17 = d7().f191356g;
            if (valueOf == null || j17 != valueOf.longValue()) {
                intent.putExtra("lastViewedCommentIdKey", valueOf);
            }
        }
        android.os.Bundle extras = intent.getExtras();
        if ((extras == null || extras.isEmpty()) ? false : true) {
            setResult(0, intent);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e68;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        long[] longArrayExtra;
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 502) {
            java.lang.Long l17 = null;
            java.lang.String str = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("key_select_image_list")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
            if (intent != null && (longArrayExtra = intent.getLongArrayExtra("SELECT_IMAGES_MODIFIED_TIME")) != null) {
                l17 = kz5.z.N(longArrayExtra);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.C;
            if (c15270x6d877a34 != null) {
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.N1;
                c15270x6d877a34.t(str, false, l17);
            }
        }
        if (intent != null && i17 == 501) {
            if (i18 != -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a342 = this.C;
                if (c15270x6d877a342 != null) {
                    c15270x6d877a342.m61859xdb574fcd().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.u5(c15270x6d877a342), 300L);
                    return;
                }
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("key_select_contact");
            if (byteArrayExtra != null) {
                try {
                    r45.gb4 gb4Var = new r45.gb4();
                    gb4Var.m75932x347fbd55(byteArrayExtra);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a343 = this.C;
                    if (c15270x6d877a343 != null) {
                        c15270x6d877a343.q(gb4Var);
                    }
                } catch (java.lang.Exception e17) {
                    java.lang.String message = e17.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageFlowUI", message);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var;
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575741yl);
        super.onCreate(bundle);
        db5.f.c(this, null);
        overridePendingTransition(0, 0);
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        com.p314xaae8f345.mm.ui.r0.a(this, false);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        com.p314xaae8f345.mm.ui.bk.i0(getWindow(), false);
        com.p314xaae8f345.mm.ui.bk.h0(getWindow(), false);
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ofb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        findViewById.setPadding(findViewById.getPaddingLeft(), com.p314xaae8f345.mm.ui.bk.p(this), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
        getWindow().setSoftInputMode(48);
        ul5.k m78511x9f88d943 = m78511x9f88d943();
        if (m78511x9f88d943 != null) {
            m78511x9f88d943.mo82162xa5089f5c(0);
        }
        this.I = bundle;
        this.B = findViewById(com.p314xaae8f345.mm.R.id.two);
        this.C = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34) findViewById(com.p314xaae8f345.mm.R.id.eat);
        this.f191315z = findViewById(com.p314xaae8f345.mm.R.id.vmt);
        this.A = findViewById(com.p314xaae8f345.mm.R.id.ofb);
        this.f191311v = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById(com.p314xaae8f345.mm.R.id.m6e);
        this.f191310u = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.u3n);
        this.f191314y = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
        java.lang.Object a17 = ok5.d.a(getIntent(), "initCommentsKey");
        java.util.List list = a17 instanceof java.util.List ? (java.util.List) a17 : null;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((so2.y0) next).f492236d.w0() == 2) {
                arrayList.add(next);
            }
        }
        java.lang.Object a18 = ok5.d.a(getIntent(), "feedObjKey");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) a18 : null;
        if (c14994x9b99c079 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageFlowUI", "feed is null, finish this activity.");
            finish();
            return;
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("initLastBufferKey");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = byteArrayExtra != null ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g(byteArrayExtra, 0, byteArrayExtra.length) : null;
        findViewById(com.p314xaae8f345.mm.R.id.aa9).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.i0(this));
        long longExtra = getIntent().getLongExtra("initCommentIdKey", 0L);
        int intExtra = getIntent().getIntExtra("reasonKey", 0);
        this.M = (android.graphics.Rect) b3.q.a(getIntent(), "commentImageRectKey", android.graphics.Rect.class);
        this.N = (android.graphics.Rect) b3.q.a(getIntent(), "commentDrawerRectKey", android.graphics.Rect.class);
        this.P = getIntent().getBooleanExtra("shouldRunDragAnimationKey", false);
        this.Q = getIntent().getIntExtra("openContextHashKey", 0);
        mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d1 d76 = d7();
        android.content.Intent intent = getIntent();
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        int intExtra2 = intent.getIntExtra("sceneKey", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.u2());
        r45.vg7 vg7Var = r45.vg7.emFinderGetCommentListSortType_Default;
        d76.getClass();
        if (!d76.f191353d) {
            d76.f191353d = true;
            d76.f191354e = c14994x9b99c079;
            d76.f191355f = intExtra2;
            d76.f191356g = longExtra;
            d76.f191357h = null;
            d76.f191358i = vg7Var;
            d76.f191360n.clear();
            kz5.h0.u(d76.f191360n, arrayList);
            d76.f191359m = intExtra;
            d76.f191362p = gVar;
            d76.f191363q = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.C;
        if (c15270x6d877a34 != null) {
            c15270x6d877a34.setClickable(true);
        }
        android.view.View view = this.B;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "initCommentFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "initCommentFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a342 = this.C;
        if (c15270x6d877a342 != null) {
            c15270x6d877a342.m61916x710e23e0(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a343 = this.C;
        if (c15270x6d877a343 != null) {
            c15270x6d877a343.m61955xe955eca(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.a0(this));
        }
        android.view.View view2 = this.B;
        if (view2 != null) {
            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.b0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a344 = this.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0 = c15270x6d877a344 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0) c15270x6d877a344.findViewById(com.p314xaae8f345.mm.R.id.c6v) : null;
        if (c15269x718714b0 != null) {
            c15269x718714b0.mo81357xb8fce43d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.c0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a345 = this.C;
        if (c15270x6d877a345 != null && (f5Var = this.f191314y) != null) {
            f5Var.f291933e = c15270x6d877a345;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b c15302x70e49e3b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b) findViewById(com.p314xaae8f345.mm.R.id.u5r);
        if (c15302x70e49e3b != null) {
            c15302x70e49e3b.m62114x5691fb54(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d0(this));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f191310u;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
            c1163xf1deaba42.m7963x830bc99d(true);
            this.f191312w.b(c1163xf1deaba42);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI$initViews$2
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.this;
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.U;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 O6 = activityC14126xa5cf9084.d7().O6();
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.this.d7().f191355f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf90842 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.this;
                    return new rb2.y0(O6, i18, activityC14126xa5cf90842.S, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.e0(activityC14126xa5cf90842), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.this));
                }
            }, d7().f191360n, true);
            this.f191313x = c22848x6ddd90cf;
            c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf);
            if (c1163xf1deaba42 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) c1163xf1deaba42;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c13728x20aad6ea.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea.i1(c13728x20aad6ea, (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager, null, 2, null);
                c13728x20aad6ea.m55763x737778f5(this.D);
                c13728x20aad6ea.m55760x4e2c6bc0(false);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageFlowUI", "initViews recyclerView is null");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f191311v;
        if (c22851x22587864 != null) {
            c22851x22587864.m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.h0(this));
        }
        long j17 = d7().f191356g;
        java.util.Iterator it6 = d7().f191360n.iterator();
        int i17 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((so2.y0) it6.next()).mo2128x1ed62e84() == j17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f191310u;
            if (c1163xf1deaba43 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(c1163xf1deaba43, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "scrollToComment", "(JZ)V", "Undefined", "scrollToPosition", "(I)V");
                c1163xf1deaba43.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(c1163xf1deaba43, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "scrollToComment", "(JZ)V", "Undefined", "scrollToPosition", "(I)V");
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f191310u;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c1163xf1deaba44 != null ? c1163xf1deaba44.getLayoutManager() : null;
            if (layoutManager2 != null && (c1163xf1deaba4 = this.f191310u) != null && (viewTreeObserver = c1163xf1deaba4.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.v0(this, layoutManager2, i17));
            }
        }
        p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(this);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        p3325xe03a0797.p3326xc267989b.l.d(b17, g3Var, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.s(this, null), 2, null);
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), g3Var, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.v(this, null), 2, null);
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), g3Var, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.x(this, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.C;
        if (c15270x6d877a34 != null) {
            c15270x6d877a34.r();
        }
        if (this.Q != 0) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((c61.l7) ((zy2.b6) c17)).cl(zy2.z5.f559172d, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.Q == 0 || isFinishing()) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((c61.l7) ((zy2.b6) c17)).Qk(false, this.Q, isFinishing());
        this.R = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.Q == 0 || !this.R) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((c61.l7) ((zy2.b6) c17)).Qk(true, this.Q, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        super.onStart();
        int size = d7().f191360n.size();
        int i17 = d7().f191361o;
        if (!(i17 >= 0 && i17 < size) || (c1163xf1deaba4 = this.f191310u) == null) {
            return;
        }
        int i18 = d7().f191361o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "onStart", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI", "onStart", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        d7().f191361o = this.D.f191411f;
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$ImageRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI$ImageRecyclerView */
    /* loaded from: classes10.dex */
    public static final class ImageRecyclerView extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea {
        public final float[] A2;

        /* renamed from: w2, reason: collision with root package name */
        public float f191316w2;

        /* renamed from: x2, reason: collision with root package name */
        public float f191317x2;

        /* renamed from: y2, reason: collision with root package name */
        public java.lang.Float f191318y2;

        /* renamed from: z2, reason: collision with root package name */
        public java.lang.Float f191319z2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageRecyclerView(android.content.Context context, android.util.AttributeSet attrs) {
            super(context, attrs);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
            this.A2 = new float[9];
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a;
            on5.c m82923x19404fcc;
            android.view.View view;
            java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                this.f191316w2 = motionEvent.getX();
                this.f191317x2 = motionEvent.getY();
            } else {
                if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                    this.f191318y2 = null;
                    this.f191319z2 = null;
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    this.f191318y2 = java.lang.Float.valueOf(motionEvent.getX() - this.f191316w2);
                    this.f191319z2 = java.lang.Float.valueOf(motionEvent.getY() - this.f191317x2);
                    java.lang.Float f17 = this.f191318y2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
                    float floatValue = f17.floatValue();
                    java.lang.Float f18 = this.f191319z2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
                    float floatValue2 = f18.floatValue();
                    getParent().requestDisallowInterceptTouchEvent(canScrollVertically(1));
                    if (motionEvent.getPointerCount() > 1 || java.lang.Math.abs(floatValue) >= java.lang.Math.abs(floatValue2)) {
                        return false;
                    }
                    android.view.ViewParent parent = getParent();
                    com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = parent instanceof com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 ? (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) parent : null;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.a((c22851x22587864 == null || (m82923x19404fcc = c22851x22587864.m82923x19404fcc()) == null || (view = m82923x19404fcc.getView()) == null) ? null : java.lang.Float.valueOf(view.getTranslationY()), 0.0f)) {
                        return true;
                    }
                    android.view.View childAt = getChildAt(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15 = childAt != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15) childAt.findViewById(com.p314xaae8f345.mm.R.id.u76) : null;
                    android.view.View selectedView = c13709xbc18ee15 != null ? c13709xbc18ee15.getSelectedView() : null;
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = selectedView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) selectedView : null;
                    if (c21524xecd57b9a2 != null) {
                        android.graphics.Matrix imageMatrix = c21524xecd57b9a2.getImageMatrix();
                        float[] fArr = this.A2;
                        imageMatrix.getValues(fArr);
                        float mo45732x7520af94 = c21524xecd57b9a2.mo45732x7520af94() * c21524xecd57b9a2.mo79180x47e2bd2c();
                        if (java.lang.Float.isNaN(mo45732x7520af94)) {
                            return true;
                        }
                        float f19 = fArr[5];
                        float f27 = mo45732x7520af94 + f19;
                        if (f19 < 0.0f && f27 > c13709xbc18ee15.getHeight()) {
                            return false;
                        }
                        if (floatValue2 > 0.0f && !canScrollVertically(-1)) {
                            return false;
                        }
                        if (java.lang.Math.abs(f19 - 0.0f) >= 0.001d || java.lang.Math.abs(f27 - c13709xbc18ee15.getHeight()) >= 0.001d) {
                            if (f19 >= 0.0f && floatValue2 > 0.0f) {
                                android.view.View selectedView2 = c13709xbc18ee15.getSelectedView();
                                c21524xecd57b9a = selectedView2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) selectedView2 : null;
                                if (c21524xecd57b9a != null) {
                                    int height = c13709xbc18ee15.getHeight();
                                    rb2.g1 g1Var = c13709xbc18ee15.E1;
                                    g1Var.getClass();
                                    android.graphics.Matrix imageMatrix2 = c21524xecd57b9a.getImageMatrix();
                                    float[] fArr2 = g1Var.f475165a;
                                    imageMatrix2.getValues(fArr2);
                                    float mo45732x7520af942 = c21524xecd57b9a.mo45732x7520af94() * c21524xecd57b9a.mo79180x47e2bd2c();
                                    float f28 = height;
                                    c21524xecd57b9a.c(0.0f, (mo45732x7520af942 < f28 ? (f28 / 2.0f) - (mo45732x7520af942 / 2.0f) : 0.0f) - fArr2[5]);
                                }
                            } else {
                                if (f27 > c13709xbc18ee15.getHeight() || floatValue2 >= 0.0f) {
                                    return false;
                                }
                                android.view.View selectedView3 = c13709xbc18ee15.getSelectedView();
                                c21524xecd57b9a = selectedView3 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) selectedView3 : null;
                                if (c21524xecd57b9a != null) {
                                    int height2 = c13709xbc18ee15.getHeight();
                                    rb2.f1 f1Var = c13709xbc18ee15.F1;
                                    f1Var.getClass();
                                    android.graphics.Matrix imageMatrix3 = c21524xecd57b9a.getImageMatrix();
                                    float[] fArr3 = f1Var.f475160a;
                                    imageMatrix3.getValues(fArr3);
                                    float mo45732x7520af943 = c21524xecd57b9a.mo45732x7520af94() * c21524xecd57b9a.mo79180x47e2bd2c();
                                    float f29 = fArr3[5] + mo45732x7520af943;
                                    float f37 = height2;
                                    if (mo45732x7520af943 < f37) {
                                        f37 = (f37 / 2.0f) + (mo45732x7520af943 / 2.0f);
                                    }
                                    c21524xecd57b9a.c(0.0f, f37 - f29);
                                }
                            }
                        }
                        return true;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageRecyclerView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
            super(context, attrs, i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
            this.A2 = new float[9];
        }
    }
}
