package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

@j95.b
/* loaded from: classes8.dex */
public final class j1 extends i95.w implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7, ct.e3, com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public long f290031d;

    /* renamed from: e, reason: collision with root package name */
    public long f290032e;

    /* renamed from: f, reason: collision with root package name */
    public qj5.n f290033f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.x f290034g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f290035h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Application.ActivityLifecycleCallbacks f290036i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f290037m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f290038n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f290039o;

    /* renamed from: p, reason: collision with root package name */
    public qj5.q f290040p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.ref.WeakReference f290041q;

    /* renamed from: r, reason: collision with root package name */
    public final o25.y1 f290042r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.c0 f290043s;

    public j1() {
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f290042r = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        this.f290043s = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.c0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ai() {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "MicroMsg.ScreenShotShareService"
            java.lang.String r2 = "hideShareTongue"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            android.view.View r1 = r18.wi()
            if (r1 == 0) goto L14
            java.lang.Runnable r2 = r0.f290037m
            r1.removeCallbacks(r2)
        L14:
            r1 = 0
            r0.f290037m = r1
            r2 = 0
            r0.f290038n = r2
            java.lang.ref.WeakReference r2 = r0.f290035h
            if (r2 == 0) goto L25
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            goto L26
        L25:
            r2 = r1
        L26:
            r0.Di(r2)
            com.tencent.mm.ui.feature.api.screenshot.x r2 = r0.f290034g
            if (r2 == 0) goto L58
            java.util.Map r2 = r2.f290110b
            r3 = 2131319342(0x7f095a2e, float:1.8257248E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r2 = r2.get(r3)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.String r3 = "MicroMsg.ScreenShotShareService.WindowManagerViewRegistry"
            if (r2 != 0) goto L48
            java.lang.String r2 = "findViewById, viewId not found in viewMap, skip"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r2)
            goto L58
        L48:
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L56
            java.lang.String r2 = "findViewById, viewRef gets null, view might have been GC, skip"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r2)
            goto L58
        L56:
            r4 = r2
            goto L59
        L58:
            r4 = r1
        L59:
            if (r4 == 0) goto L68
            r5 = 0
            r6 = 300(0x12c, double:1.48E-321)
            com.tencent.mm.ui.feature.api.screenshot.f0 r8 = new com.tencent.mm.ui.feature.api.screenshot.f0
            r8.<init>(r0)
            r9 = 1
            r10 = 0
            sa5.d.d(r4, r5, r6, r8, r9, r10)
        L68:
            android.view.View r11 = r18.wi()
            if (r11 == 0) goto L7d
            r12 = 0
            r13 = 300(0x12c, double:1.48E-321)
            com.tencent.mm.ui.feature.api.screenshot.g0 r15 = new com.tencent.mm.ui.feature.api.screenshot.g0
            r15.<init>(r0)
            r16 = 1
            r17 = 0
            sa5.d.d(r11, r12, r13, r15, r16, r17)
        L7d:
            com.tencent.mm.ui.feature.api.screenshot.x r1 = r0.f290034g
            if (r1 == 0) goto L87
            r2 = 2131319341(0x7f095a2d, float:1.8257245E38)
            r1.c(r2)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1.Ai():void");
    }

    public final void Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w wVar) {
        try {
            java.lang.String c17 = nw4.x2.c("onScreenShotJump", kz5.b1.e(new jz5.l("eventType", java.lang.Integer.valueOf(wVar.f290104d))), false, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "notifyScreenShot: eventType=" + wVar.name() + ", event=" + c17);
            android.app.Activity a17 = com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.v.f290093a.a();
            if (!(a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyScreenShot: no active BaseSearchWebViewUI found, topActivity is ");
                sb6.append(a17 != null ? a17.getClass().getSimpleName() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService", sb6.toString());
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) a17).f265348f;
            if (abstractC19224x1fe3df6e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService", "notifyScreenShot: webView is null in BaseSearchWebViewUI");
                return;
            }
            abstractC19224x1fe3df6e.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c17 + ')', null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "notifyScreenShot: event sent to websearch webview successfully");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotShareService", "notifyScreenShot failed: " + e17.getMessage());
        }
    }

    public final void Di(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        android.view.View decorView = activity.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        java.lang.Object tag = decorView.getTag(com.p314xaae8f345.mm.R.id.v1_);
        android.view.Window.Callback callback = tag instanceof android.view.Window.Callback ? (android.view.Window.Callback) tag : null;
        if (callback == null) {
            return;
        }
        activity.getWindow().setCallback(callback);
        decorView.setTag(com.p314xaae8f345.mm.R.id.v1_, null);
    }

    public void Ni(qj5.q qVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "setScreenShotShareContentProvider");
        this.f290040p = qVar;
    }

    public final void Ri(android.app.Activity activity, android.view.View.OnClickListener onClickListener) {
        int i17;
        android.view.WindowManager windowManager;
        android.view.View decorView;
        android.os.IBinder windowToken;
        android.view.View decorView2;
        android.os.IBinder windowToken2;
        p15.n g17;
        p15.m j17;
        java.util.HashMap hashMap = new java.util.HashMap();
        qj5.q qVar = this.f290040p;
        java.lang.Integer valueOf = (qVar == null || (g17 = qj5.q.g(qVar, false, 1, null)) == null || (j17 = g17.j()) == null) ? null : java.lang.Integer.valueOf(j17.j());
        if (valueOf != null && valueOf.intValue() == 11) {
            i17 = 1;
        } else {
            if ((valueOf != null && valueOf.intValue() == 12) || (valueOf != null && valueOf.intValue() == 10)) {
                i17 = 2;
            } else if (valueOf != null && valueOf.intValue() == 1) {
                i17 = 5;
            } else {
                com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 ? (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) activity : null;
                i17 = activityC21387x976b8e54 != null && activityC21387x976b8e54.i7() ? 7 : 0;
            }
        }
        hashMap.put("refer_page_source", java.lang.Integer.valueOf(i17));
        hashMap.put("is_keyboard_raise", java.lang.Integer.valueOf(gh5.d.b(activity) ? 1 : 2));
        android.view.View wi6 = wi();
        if (wi6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "showShareTongue, shareTongue already showing, reset onClick & countDown");
            wi6.setOnClickListener(new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.f1(this, hashMap, onClickListener));
            wi6.removeCallbacks(this.f290037m);
            com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.g1 g1Var = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.g1(this);
            this.f290037m = g1Var;
            wi6.postDelayed(g1Var, 5000L);
            return;
        }
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.x xVar = this.f290034g;
        if (xVar == null || (windowManager = xVar.f290109a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotShareService", "showShareTongue, unable to get windowManager");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "showShareTongue");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570966en3, (android.view.ViewGroup) null);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.z(this, hashMap, onClickListener));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService", "createShareTongue", "(Landroid/app/Activity;Ljava/util/HashMap;Landroid/view/View$OnClickListener;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService", "createShareTongue", "(Landroid/app/Activity;Ljava/util/HashMap;Landroid/view/View$OnClickListener;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setElevation(i65.a.b(activity, 4));
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.type = 1002;
        layoutParams.setTitle("com.tencent.mm/.ScreenShotShareTongue");
        android.view.Window window = activity.getWindow();
        if (window != null && (decorView2 = window.getDecorView()) != null && (windowToken2 = decorView2.getWindowToken()) != null) {
            layoutParams.token = windowToken2;
        }
        layoutParams.flags = 808;
        layoutParams.gravity = 8388693;
        layoutParams.x = i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        layoutParams.y = i65.a.h(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        android.view.View view = new android.view.View(activity);
        view.setBackground(activity.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.d8e, null));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService", "createMaskView", "(Landroid/app/Activity;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService", "createMaskView", "(Landroid/app/Activity;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.WindowManager.LayoutParams layoutParams2 = new android.view.WindowManager.LayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = windowManager.getDefaultDisplay().getHeight() / 3;
        layoutParams2.format = -3;
        layoutParams2.type = 1002;
        layoutParams2.setTitle("com.tencent.mm/.ScreenShotShareMask");
        android.view.Window window2 = activity.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null && (windowToken = decorView.getWindowToken()) != null) {
            layoutParams2.token = windowToken;
        }
        layoutParams2.flags = 824;
        layoutParams2.gravity = 80;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            layoutParams2.setFitInsetsTypes(0);
            layoutParams2.setFitInsetsSides(0);
        } else {
            layoutParams2.flags = 824;
            layoutParams2.systemUiVisibility = 1792;
        }
        inflate.removeCallbacks(this.f290037m);
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.h1 h1Var = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.h1(this);
        this.f290037m = h1Var;
        inflate.postDelayed(h1Var, 5000L);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(!gh5.d.b(activity));
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.i1 i1Var = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.i1(this, view, layoutParams2);
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        if (valueOf2 != null && valueOf2.booleanValue()) {
            i1Var.mo152xb9724478();
        }
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.x xVar2 = this.f290034g;
        if (xVar2 != null) {
            xVar2.a(com.p314xaae8f345.mm.R.id.v1a, inflate, layoutParams);
        }
        sa5.d.c(view, 0.0f, 300L, null, 5, null);
        sa5.d.c(inflate, 0.0f, 300L, null, 5, null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_screenshot_btn", "view_exp", hashMap, 36458);
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        qj5.s sVar;
        qj5.s sVar2;
        if (i18 == -1) {
            qj5.n nVar = this.f290033f;
            if (nVar != null) {
                nVar.u();
            }
            this.f290033f = null;
            switch (i17) {
                case 910524417:
                    java.lang.Iterable<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = kz5.p0.f395529d;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
                    for (java.lang.String str : stringArrayListExtra) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        arrayList.add(new qj5.r(str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)));
                    }
                    java.lang.ref.WeakReference weakReference = this.f290041q;
                    if (weakReference != null && (sVar = (qj5.s) weakReference.get()) != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ry) sVar).a(arrayList);
                    }
                    Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290099h);
                    break;
                case 910524418:
                    java.lang.ref.WeakReference weakReference2 = this.f290041q;
                    if (weakReference2 != null && (sVar2 = (qj5.s) weakReference2.get()) != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ry) sVar2).c(null, 1);
                    }
                    Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290097f);
                    break;
            }
        }
        if (i17 == 31871) {
            qj5.n nVar2 = this.f290033f;
            if (nVar2 != null) {
                nVar2.u();
            }
            this.f290033f = null;
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService", "onCreate, not in main process, skip");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "onAccountInitialized");
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f290043s);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "onAccountReleased");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.f290043s);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService", "onCreate, in main process, skip");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "onCreate");
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f290043s);
        }
    }

    public final android.view.View wi() {
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.x xVar = this.f290034g;
        if (xVar == null) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) xVar.f290110b).get(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.v1a));
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "findViewById, viewId not found in viewMap, skip");
            return null;
        }
        android.view.View view = (android.view.View) weakReference.get();
        if (view != null) {
            return view;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService.WindowManagerViewRegistry", "findViewById, viewRef gets null, view might have been GC, skip");
        return null;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.u0(this, str, j17, z17));
    }
}
