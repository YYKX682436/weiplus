package com.tencent.cloud.huiyan.api;

/* loaded from: classes14.dex */
public class HuiYanNativeApi {
    private static final java.lang.String TAG = "HuiYanNativeApi";

    public static native boolean callbackToPPL(int i17, java.lang.String str);

    public static native int doPause();

    public static native int doResume();

    public static native java.lang.String encryptVideoData(java.lang.String str);

    public static android.content.res.AssetManager getAssetManager() {
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        android.content.Context a17 = dVar.a();
        if (a17 != null) {
            return a17.getAssets();
        }
        mc.p.f325531a.e(TAG, "getAssetManager context is null");
        java.lang.ref.WeakReference weakReference = dVar.f290283b;
        return (weakReference == null ? null : (android.content.Context) weakReference.get()).getAssets();
    }

    public static native long getAuthEndtime();

    public static native java.lang.String getOperationInfo();

    public static native java.lang.String getSelectData();

    public static native java.lang.String getStartLivenessReqBody(java.lang.String str);

    public static native java.lang.String getVersion();

    public static native int initAuthByFileOrString(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager);

    public static native int initDeviceRiskData(java.lang.String str);

    public static native int initFaceIdToken(java.lang.String str);

    public static native int initNonce(java.lang.String str);

    public static native int initPubKey(java.lang.String str);

    public static native int initStreamRiskData(java.lang.String str);

    public static native int initYtLiveness(java.lang.String str);

    public static void innerCallBack(int i17, java.lang.String str) {
        com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent huiYanAuthTipsEvent;
        jc.a aVar;
        android.content.Context context;
        long authTimeOutMs;
        mc.c cVar = mc.d.f325515a;
        oc.h hVar = oc.g.f344101a;
        if (i17 == 0) {
            if (cVar.f325505i.containsKey(str)) {
                int intValue = ((java.lang.Integer) cVar.f325505i.get(str)).intValue();
                int i18 = ic.d.f290281k;
                ic.d dVar = ic.c.f290280a;
                java.lang.ref.WeakReference weakReference = dVar.f290283b;
                android.content.Context context2 = weakReference == null ? null : (android.content.Context) weakReference.get();
                if (context2 == null) {
                    mc.p.f325531a.e("AuthStateManager", "context is null");
                    return;
                }
                if (intValue == com.tencent.mm.R.string.rst_failed || mc.c.b(intValue, cVar.f325502f)) {
                    intValue = -1;
                } else if (intValue != -1 && intValue != com.tencent.mm.R.string.fl_no_face && intValue != com.tencent.mm.R.string.f493844pb4 && !cVar.f325499c) {
                    cVar.f325499c = true;
                    mc.q qVar = mc.p.f325531a;
                    qVar.b("AuthStateManager", "doAfterFirstTimeCheckFace");
                    hVar.f344102a = true;
                    cVar.a(com.tencent.cloud.huiyan.enums.AuthState.ON_FIRST_FOUND_FACE, null);
                    qVar.e("AuthStateManager", "found face!");
                }
                if (intValue == -1 || intValue == -1) {
                    return;
                }
                final int i19 = cVar.f325508l;
                if (intValue != -1 && mc.c.b(intValue, cVar.f325500d)) {
                    i19 = cVar.f325507k;
                }
                final java.lang.String string = context2.getResources().getString(intValue);
                jc.b bVar = cVar.f325498b;
                if (bVar != null) {
                    final lc.e eVar = (lc.e) bVar;
                    eVar.f317795a.a(new java.lang.Runnable() { // from class: lc.e$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            lc.g gVar = lc.e.this.f317795a;
                            android.widget.TextView textView = gVar.f317809g;
                            if (textView != null) {
                                textView.setTextColor(i19);
                                pc.l.f353211a.getClass();
                                gVar.f317809g.setText(string);
                            }
                        }
                    });
                }
                final int color = context2.getResources().getColor(com.tencent.mm.R.color.anc);
                if (mc.c.b(intValue, cVar.f325500d)) {
                    final int i27 = cVar.f325509m;
                    jc.b bVar2 = cVar.f325498b;
                    if (bVar2 != null) {
                        final lc.e eVar2 = (lc.e) bVar2;
                        eVar2.f317795a.a(new java.lang.Runnable() { // from class: lc.e$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                android.graphics.Paint paint;
                                lc.e eVar3 = lc.e.this;
                                eVar3.getClass();
                                int i28 = ic.d.f290281k;
                                ic.c.f290280a.getClass();
                                com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView = eVar3.f317795a.f317814o;
                                if (loadingFrontAnimatorView != null) {
                                    int i29 = loadingFrontAnimatorView.f45918m;
                                    int i37 = i27;
                                    if (i37 == i29 || (paint = loadingFrontAnimatorView.f45921p) == null) {
                                        return;
                                    }
                                    loadingFrontAnimatorView.f45918m = i37;
                                    paint.setColor(i37);
                                    loadingFrontAnimatorView.invalidate();
                                }
                            }
                        });
                    }
                } else if (intValue != -1) {
                    if (mc.c.b(intValue, cVar.f325501e)) {
                        final int i28 = cVar.f325510n;
                        jc.b bVar3 = cVar.f325498b;
                        if (bVar3 != null) {
                            final lc.e eVar3 = (lc.e) bVar3;
                            eVar3.f317795a.a(new java.lang.Runnable() { // from class: lc.e$$b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    android.graphics.Paint paint;
                                    lc.e eVar32 = lc.e.this;
                                    eVar32.getClass();
                                    int i282 = ic.d.f290281k;
                                    ic.c.f290280a.getClass();
                                    com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView = eVar32.f317795a.f317814o;
                                    if (loadingFrontAnimatorView != null) {
                                        int i29 = loadingFrontAnimatorView.f45918m;
                                        int i37 = i28;
                                        if (i37 == i29 || (paint = loadingFrontAnimatorView.f45921p) == null) {
                                            return;
                                        }
                                        loadingFrontAnimatorView.f45918m = i37;
                                        paint.setColor(i37);
                                        loadingFrontAnimatorView.invalidate();
                                    }
                                }
                            });
                        }
                    } else {
                        jc.b bVar4 = cVar.f325498b;
                        if (bVar4 != null) {
                            final lc.e eVar4 = (lc.e) bVar4;
                            eVar4.f317795a.a(new java.lang.Runnable() { // from class: lc.e$$b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    android.graphics.Paint paint;
                                    lc.e eVar32 = lc.e.this;
                                    eVar32.getClass();
                                    int i282 = ic.d.f290281k;
                                    ic.c.f290280a.getClass();
                                    com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView = eVar32.f317795a.f317814o;
                                    if (loadingFrontAnimatorView != null) {
                                        int i29 = loadingFrontAnimatorView.f45918m;
                                        int i37 = color;
                                        if (i37 == i29 || (paint = loadingFrontAnimatorView.f45921p) == null) {
                                            return;
                                        }
                                        loadingFrontAnimatorView.f45918m = i37;
                                        paint.setColor(i37);
                                        loadingFrontAnimatorView.invalidate();
                                    }
                                }
                            });
                        }
                    }
                }
                android.util.SparseArray sparseArray = cVar.f325504h;
                if (sparseArray == null) {
                    huiYanAuthTipsEvent = com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE;
                } else {
                    huiYanAuthTipsEvent = (com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent) sparseArray.get(intValue);
                    if (huiYanAuthTipsEvent == null) {
                        huiYanAuthTipsEvent = com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE;
                    }
                }
                if (huiYanAuthTipsEvent == null) {
                    dVar.d(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE, false);
                } else if (cVar.f325506j != huiYanAuthTipsEvent) {
                    dVar.d(huiYanAuthTipsEvent, false);
                    cVar.f325506j = huiYanAuthTipsEvent;
                }
                if (intValue == com.tencent.mm.R.string.net_reporting) {
                    cVar.a(com.tencent.cloud.huiyan.enums.AuthState.ON_START_LOADING_ANIM, java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 2) {
            if (!cVar.f325512p && (aVar = cVar.f325497a) != null) {
                ((lc.f) aVar).a(com.tencent.cloud.huiyan.enums.AuthState.START_REFLECT, null);
                cVar.f325512p = true;
            }
            final long parseLong = java.lang.Long.parseLong(str);
            jc.b bVar5 = cVar.f325498b;
            if (bVar5 != null) {
                final lc.g gVar = ((lc.e) bVar5).f317795a;
                gVar.getClass();
                gVar.a(new java.lang.Runnable() { // from class: lc.g$$d
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc.g gVar2 = lc.g.this;
                        long j17 = parseLong;
                        com.tencent.cloud.huiyan.view.HuiYanReflectLayout huiYanReflectLayout = gVar2.f317813n;
                        if (huiYanReflectLayout != null && huiYanReflectLayout.f45908d != null) {
                            huiYanReflectLayout.f45909e = j17;
                            huiYanReflectLayout.invalidate();
                        }
                        if (gVar2.f317815p) {
                            return;
                        }
                        gVar2.f317815p = true;
                        pc.o oVar = gVar2.f317819t;
                        if (!oVar.f353217d.equals("")) {
                            oVar.f353217d = "";
                            oVar.f353216c.setText("");
                        }
                        android.widget.TextView textView = gVar2.f317811i;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(textView, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/f", "a", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(textView, "com/tencent/cloud/huiyan/fragments/f", "a", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                });
                return;
            }
            return;
        }
        cVar.getClass();
        if (i17 == 30) {
            mc.p.f325531a.b("AuthStateManager", "yt action progress, body=" + str);
            return;
        }
        if (i17 == 33) {
            mc.p.f325531a.b("AuthStateManager", "reflection duration ms, body=" + str);
            int i29 = ic.d.f290281k;
            ic.d dVar2 = ic.c.f290280a;
            long parseLong2 = java.lang.Long.parseLong(str);
            com.tencent.cloud.huiyan.callback.HuiYanSdkEventCallBack huiYanSdkEventCallBack = dVar2.f290287f;
            if (huiYanSdkEventCallBack != null) {
                huiYanSdkEventCallBack.onReflectionDurationMS(parseLong2);
                return;
            }
            return;
        }
        if (i17 == 15) {
            int i37 = ic.d.f290281k;
            ic.c.f290280a.getClass();
            return;
        }
        if (i17 == 16) {
            int i38 = ic.d.f290281k;
            ic.c.f290280a.getClass();
            return;
        }
        if (i17 == 20) {
            mc.p.f325531a.b("AuthStateManager", "yt local liveness end.");
            int i39 = ic.d.f290281k;
            ic.d dVar3 = ic.c.f290280a;
            dVar3.f290285d = true;
            cVar.a(com.tencent.cloud.huiyan.enums.AuthState.AUTH_END, null);
            dVar3.c(com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.LOCAL_DETECTION_DONE);
            return;
        }
        if (i17 == 21) {
            mc.q qVar2 = mc.p.f325531a;
            qVar2.b("AuthStateManager", "need check video.");
            if (!hVar.f344107f || hVar.f344105d == null) {
                qVar2.e("TuringSdkHelper", "need turing frame check, turing is not create!");
                return;
            }
            hVar.f344105d.getClass();
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            int i47 = ic.d.f290281k;
            ic.c.f290280a.getClass();
            return;
        }
        switch (i17) {
            case 5:
                mc.q qVar3 = mc.p.f325531a;
                qVar3.b("AuthStateManager", "yt local liveness end.");
                int i48 = ic.d.f290281k;
                ic.d dVar4 = ic.c.f290280a;
                dVar4.getClass();
                com.tencent.cloud.huiyan.callback.HuiYanSdkCallBack huiYanSdkCallBack = dVar4.f290288g;
                final mc.r rVar = cVar.f325503g;
                if (rVar == null) {
                    qVar3.e("AuthStateManager", "video recorder is null.");
                    if (huiYanSdkCallBack != null) {
                        huiYanSdkCallBack.onCompareSuccess(str, "");
                    } else {
                        qVar3.e("AuthStateManager", "sdk result cb is null.");
                    }
                } else {
                    final mc.c$$a c__a = new mc.c$$a(huiYanSdkCallBack, str);
                    if (rVar.i()) {
                        c__a.a(false, "");
                    } else if (rVar.f325549j) {
                        c__a.a(false, "");
                    } else {
                        com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new java.lang.Runnable() { // from class: mc.r$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                mc.r rVar2 = mc.r.this;
                                jc.d dVar5 = c__a;
                                synchronized (rVar2.f325548i) {
                                    try {
                                        rVar2.f325549j = true;
                                        rVar2.f325548i.wait();
                                    } catch (java.lang.InterruptedException unused) {
                                        mc.p.f325531a.e("VideoRecorderManager", "wait thread is interrupted!");
                                    }
                                    java.lang.String b17 = rVar2.b(dVar5);
                                    if (!android.text.TextUtils.isEmpty(b17) && !android.text.TextUtils.isEmpty(rVar2.f325546g) && !android.text.TextUtils.isEmpty(rVar2.f325547h) && rVar2.f325546g.equals(b17) && pc.f.d(rVar2.f325546g, rVar2.f325547h)) {
                                        b17 = rVar2.f325547h;
                                    }
                                    if (dVar5 != null) {
                                        ((mc.c$$a) dVar5).a(true, b17);
                                    }
                                    com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new pc.e(rVar2.f325546g));
                                }
                            }
                        });
                    }
                }
                dVar4.f290285d = true;
                cVar.a(com.tencent.cloud.huiyan.enums.AuthState.AUTH_END, null);
                dVar4.c(com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.LOCAL_DETECTION_DONE);
                return;
            case 6:
                mc.p.f325531a.e("AuthStateManager", "yt error: " + str);
                if ("-1000051".equals(str) || "4194304".equals(str)) {
                    int i49 = ic.d.f290281k;
                    ic.d dVar5 = ic.c.f290280a;
                    java.lang.ref.WeakReference weakReference2 = dVar5.f290283b;
                    context = weakReference2 != null ? (android.content.Context) weakReference2.get() : null;
                    if (context == null) {
                        context = dVar5.a();
                    }
                    dVar5.b(251, context != null ? context.getString(com.tencent.mm.R.string.f493896pj5) : "");
                    return;
                }
                if ("5242881".equals(str)) {
                    int i57 = ic.d.f290281k;
                    ic.d dVar6 = ic.c.f290280a;
                    java.lang.ref.WeakReference weakReference3 = dVar6.f290283b;
                    context = weakReference3 != null ? (android.content.Context) weakReference3.get() : null;
                    if (context == null) {
                        context = dVar6.a();
                    }
                    dVar6.b(252, context != null ? context.getString(com.tencent.mm.R.string.pj6) : "");
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i58 = ic.d.f290281k;
                ic.d dVar7 = ic.c.f290280a;
                java.lang.ref.WeakReference weakReference4 = dVar7.f290283b;
                context = weakReference4 != null ? (android.content.Context) weakReference4.get() : null;
                if (context == null) {
                    context = dVar7.a();
                }
                sb6.append(context != null ? context.getString(com.tencent.mm.R.string.f493892pj1) : "");
                sb6.append("(");
                sb6.append(str);
                sb6.append(")");
                dVar7.b(228, sb6.toString());
                return;
            case 7:
                mc.p.f325531a.b("AuthStateManager", "yt state change, body=" + str);
                java.lang.String[] split = str.split("--");
                if ("1".equals(split[0])) {
                    int i59 = pc.g.f353207b[cVar.f325511o.ordinal()];
                    com.tencent.cloud.huiyan.enums.HuiYanAuthEvent huiYanAuthEvent = i59 != 1 ? i59 != 2 ? i59 != 3 ? i59 != 4 ? i59 != 5 ? com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.NONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.SHAKE_HEAD_CHECK_DONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.NOD_HEAD_CHECK_DONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.BLINK_CHECK_DONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.SILENCE_CHECK_DONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.OPEN_MOUTH_CHECK_DONE;
                    if (huiYanAuthEvent != com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.NONE) {
                        int i66 = ic.d.f290281k;
                        ic.c.f290280a.c(huiYanAuthEvent);
                    }
                    int i67 = ic.d.f290281k;
                    ic.c.f290280a.c(com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.ALL_ACTION_DONE);
                    cVar.a(com.tencent.cloud.huiyan.enums.AuthState.ALL_ACTION_DONE, null);
                }
                if (split.length > 1 && "0".equals(split[1])) {
                    int i68 = ic.d.f290281k;
                    ic.d dVar8 = ic.c.f290280a;
                    com.tencent.cloud.huiyan.enums.HuiYanProcessStatus huiYanProcessStatus = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.FaceTrackCheck;
                    dVar8.getClass();
                    pc.l.f353211a.f353212a = huiYanProcessStatus;
                }
                if (split.length > 1 && "2".equals(split[1])) {
                    int i69 = ic.d.f290281k;
                    ic.c.f290280a.c(com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.REFLECT_CHECK);
                    pc.l.f353211a.f353212a = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.ReflectCheck;
                }
                if (split.length > 1 && "8".equals(split[1])) {
                    int i76 = ic.d.f290281k;
                    ic.d dVar9 = ic.c.f290280a;
                    com.tencent.cloud.huiyan.enums.HuiYanProcessStatus huiYanProcessStatus2 = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.OverlayMask;
                    dVar9.getClass();
                    pc.l.f353211a.f353212a = huiYanProcessStatus2;
                }
                if (split.length <= 1 || !"9".equals(split[1])) {
                    return;
                }
                int i77 = ic.d.f290281k;
                ic.d dVar10 = ic.c.f290280a;
                com.tencent.cloud.huiyan.enums.HuiYanProcessStatus huiYanProcessStatus3 = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.FakeReflect;
                dVar10.getClass();
                pc.l.f353211a.f353212a = huiYanProcessStatus3;
                return;
            case 8:
                mc.p.f325531a.b("AuthStateManager", "yt action state change, body=" + str);
                java.lang.String[] split2 = str.split("--");
                pc.f.a(java.lang.Integer.parseInt(split2[0]), true);
                cVar.f325511o = pc.f.a(java.lang.Integer.parseInt(split2[1]), false);
                return;
            case 9:
                java.lang.String[] split3 = str.split("--");
                jc.b bVar6 = cVar.f325498b;
                if (bVar6 != null) {
                    int parseInt = java.lang.Integer.parseInt(split3[0]);
                    boolean equals = "1".equals(split3[1]);
                    long parseLong3 = java.lang.Long.parseLong(split3[2]);
                    final lc.e eVar5 = (lc.e) bVar6;
                    boolean z17 = parseInt == 0;
                    lc.g gVar2 = eVar5.f317795a;
                    if (equals) {
                        if (z17) {
                            pc.f.c(223, gVar2.b().getString(com.tencent.mm.R.string.pj8));
                            return;
                        } else {
                            pc.f.c(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, gVar2.b().getString(com.tencent.mm.R.string.f493895pj4));
                            return;
                        }
                    }
                    if (z17) {
                        int i78 = ic.d.f290281k;
                        authTimeOutMs = ic.c.f290280a.f290290i.getPrepareFaceTimeOutMs();
                    } else {
                        int i79 = ic.d.f290281k;
                        authTimeOutMs = ic.c.f290280a.f290290i.getAuthTimeOutMs();
                    }
                    final int floor = (int) java.lang.Math.floor((authTimeOutMs - parseLong3) / 1000.0d);
                    if (parseLong3 == 0 || gVar2.A - 1 == floor) {
                        gVar2.a(new java.lang.Runnable() { // from class: lc.e$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                lc.e eVar6 = lc.e.this;
                                eVar6.getClass();
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append(floor);
                                lc.g gVar3 = eVar6.f317795a;
                                sb7.append(gVar3.b().getString(com.tencent.mm.R.string.piw));
                                gVar3.f317811i.setText(sb7.toString());
                            }
                        });
                    }
                    gVar2.A = floor;
                    return;
                }
                return;
            default:
                switch (i17) {
                    case 23:
                        mc.p.f325531a.b("AuthStateManager", "camera param data: " + str);
                        cVar.a(com.tencent.cloud.huiyan.enums.AuthState.CAMERA_PARAMS_CHANGED, str);
                        return;
                    case 24:
                        cVar.a(com.tencent.cloud.huiyan.enums.AuthState.CAMERA_PARAMS_STATE_CHANGED, str);
                        mc.p.f325531a.b("AuthStateManager", "state changed: " + str);
                        return;
                    case 25:
                        cVar.a(com.tencent.cloud.huiyan.enums.AuthState.CAMERA_RESOLUTION, str);
                        mc.p.f325531a.b("AuthStateManager", "got camera size.");
                        return;
                    default:
                        return;
                }
        }
    }

    public static native int releaseYtLiveness();

    public static native void setCurrentTextureView(android.view.TextureView textureView);

    public static native int updateFrame(byte[] bArr, int i17, int i18, int i19, int i27, byte[] bArr2, int i28, int i29, int i37);
}
