package com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api;

/* renamed from: com.tencent.cloud.huiyan.api.HuiYanNativeApi */
/* loaded from: classes14.dex */
public class C2914x9e22cdb9 {
    private static final java.lang.String TAG = "HuiYanNativeApi";

    /* renamed from: callbackToPPL */
    public static native boolean m21734x5569a4ac(int i17, java.lang.String str);

    /* renamed from: doPause */
    public static native int m21735x6bee482b();

    /* renamed from: doResume */
    public static native int m21736x157bec98();

    /* renamed from: encryptVideoData */
    public static native java.lang.String m21737x691c91e0(java.lang.String str);

    /* renamed from: getAssetManager */
    public static android.content.res.AssetManager m21738x11062113() {
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        android.content.Context a17 = dVar.a();
        if (a17 != null) {
            return a17.getAssets();
        }
        mc.p.f407064a.e(TAG, "getAssetManager context is null");
        java.lang.ref.WeakReference weakReference = dVar.f371816b;
        return (weakReference == null ? null : (android.content.Context) weakReference.get()).getAssets();
    }

    /* renamed from: getAuthEndtime */
    public static native long m21739x5005ca2a();

    /* renamed from: getOperationInfo */
    public static native java.lang.String m21740xc2d65eff();

    /* renamed from: getSelectData */
    public static native java.lang.String m21741x8b8572bc();

    /* renamed from: getStartLivenessReqBody */
    public static native java.lang.String m21742x18e1d851(java.lang.String str);

    /* renamed from: getVersion */
    public static native java.lang.String m21743x52c258a2();

    /* renamed from: initAuthByFileOrString */
    public static native int m21744x29c6785f(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager);

    /* renamed from: initDeviceRiskData */
    public static native int m21745xf594b0bf(java.lang.String str);

    /* renamed from: initFaceIdToken */
    public static native int m21746x96517d51(java.lang.String str);

    /* renamed from: initNonce */
    public static native int m21747xefb28cbf(java.lang.String str);

    /* renamed from: initPubKey */
    public static native int m21748xa577b52(java.lang.String str);

    /* renamed from: initStreamRiskData */
    public static native int m21749x727817e9(java.lang.String str);

    /* renamed from: initYtLiveness */
    public static native int m21750x34b33aae(java.lang.String str);

    /* renamed from: innerCallBack */
    public static void m21751x7d5290db(int i17, java.lang.String str) {
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0 enumC2925x4120adb0;
        jc.a aVar;
        android.content.Context context;
        long m21824xcf6d6e49;
        mc.c cVar = mc.d.f407048a;
        oc.h hVar = oc.g.f425634a;
        if (i17 == 0) {
            if (cVar.f407038i.containsKey(str)) {
                int intValue = ((java.lang.Integer) cVar.f407038i.get(str)).intValue();
                int i18 = ic.d.f371814k;
                ic.d dVar = ic.c.f371813a;
                java.lang.ref.WeakReference weakReference = dVar.f371816b;
                android.content.Context context2 = weakReference == null ? null : (android.content.Context) weakReference.get();
                if (context2 == null) {
                    mc.p.f407064a.e("AuthStateManager", "context is null");
                    return;
                }
                if (intValue == com.p314xaae8f345.mm.R.C30867xcad56011.f81520xca8123a9 || mc.c.b(intValue, cVar.f407035f)) {
                    intValue = -1;
                } else if (intValue != -1 && intValue != com.p314xaae8f345.mm.R.C30867xcad56011.f81490xec737fa2 && intValue != com.p314xaae8f345.mm.R.C30867xcad56011.f575377pb4 && !cVar.f407032c) {
                    cVar.f407032c = true;
                    mc.q qVar = mc.p.f407064a;
                    qVar.b("AuthStateManager", "doAfterFirstTimeCheckFace");
                    hVar.f425635a = true;
                    cVar.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.ON_FIRST_FOUND_FACE, null);
                    qVar.e("AuthStateManager", "found face!");
                }
                if (intValue == -1 || intValue == -1) {
                    return;
                }
                final int i19 = cVar.f407041l;
                if (intValue != -1 && mc.c.b(intValue, cVar.f407033d)) {
                    i19 = cVar.f407040k;
                }
                final java.lang.String string = context2.getResources().getString(intValue);
                jc.b bVar = cVar.f407031b;
                if (bVar != null) {
                    final lc.e eVar = (lc.e) bVar;
                    eVar.f399328a.a(new java.lang.Runnable() { // from class: lc.e$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            lc.g gVar = lc.e.this.f399328a;
                            android.widget.TextView textView = gVar.f399342g;
                            if (textView != null) {
                                textView.setTextColor(i19);
                                pc.l.f434744a.getClass();
                                gVar.f399342g.setText(string);
                            }
                        }
                    });
                }
                final int color = context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.anc);
                if (mc.c.b(intValue, cVar.f407033d)) {
                    final int i27 = cVar.f407042m;
                    jc.b bVar2 = cVar.f407031b;
                    if (bVar2 != null) {
                        final lc.e eVar2 = (lc.e) bVar2;
                        eVar2.f399328a.a(new java.lang.Runnable() { // from class: lc.e$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                android.graphics.Paint paint;
                                lc.e eVar3 = lc.e.this;
                                eVar3.getClass();
                                int i28 = ic.d.f371814k;
                                ic.c.f371813a.getClass();
                                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed39 = eVar3.f399328a.f399347o;
                                if (c2936x4a02ed39 != null) {
                                    int i29 = c2936x4a02ed39.f127451m;
                                    int i37 = i27;
                                    if (i37 == i29 || (paint = c2936x4a02ed39.f127454p) == null) {
                                        return;
                                    }
                                    c2936x4a02ed39.f127451m = i37;
                                    paint.setColor(i37);
                                    c2936x4a02ed39.invalidate();
                                }
                            }
                        });
                    }
                } else if (intValue != -1) {
                    if (mc.c.b(intValue, cVar.f407034e)) {
                        final int i28 = cVar.f407043n;
                        jc.b bVar3 = cVar.f407031b;
                        if (bVar3 != null) {
                            final lc.e eVar3 = (lc.e) bVar3;
                            eVar3.f399328a.a(new java.lang.Runnable() { // from class: lc.e$$b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    android.graphics.Paint paint;
                                    lc.e eVar32 = lc.e.this;
                                    eVar32.getClass();
                                    int i282 = ic.d.f371814k;
                                    ic.c.f371813a.getClass();
                                    com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed39 = eVar32.f399328a.f399347o;
                                    if (c2936x4a02ed39 != null) {
                                        int i29 = c2936x4a02ed39.f127451m;
                                        int i37 = i28;
                                        if (i37 == i29 || (paint = c2936x4a02ed39.f127454p) == null) {
                                            return;
                                        }
                                        c2936x4a02ed39.f127451m = i37;
                                        paint.setColor(i37);
                                        c2936x4a02ed39.invalidate();
                                    }
                                }
                            });
                        }
                    } else {
                        jc.b bVar4 = cVar.f407031b;
                        if (bVar4 != null) {
                            final lc.e eVar4 = (lc.e) bVar4;
                            eVar4.f399328a.a(new java.lang.Runnable() { // from class: lc.e$$b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    android.graphics.Paint paint;
                                    lc.e eVar32 = lc.e.this;
                                    eVar32.getClass();
                                    int i282 = ic.d.f371814k;
                                    ic.c.f371813a.getClass();
                                    com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed39 = eVar32.f399328a.f399347o;
                                    if (c2936x4a02ed39 != null) {
                                        int i29 = c2936x4a02ed39.f127451m;
                                        int i37 = color;
                                        if (i37 == i29 || (paint = c2936x4a02ed39.f127454p) == null) {
                                            return;
                                        }
                                        c2936x4a02ed39.f127451m = i37;
                                        paint.setColor(i37);
                                        c2936x4a02ed39.invalidate();
                                    }
                                }
                            });
                        }
                    }
                }
                android.util.SparseArray sparseArray = cVar.f407037h;
                if (sparseArray == null) {
                    enumC2925x4120adb0 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE;
                } else {
                    enumC2925x4120adb0 = (com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0) sparseArray.get(intValue);
                    if (enumC2925x4120adb0 == null) {
                        enumC2925x4120adb0 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE;
                    }
                }
                if (enumC2925x4120adb0 == null) {
                    dVar.d(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE, false);
                } else if (cVar.f407039j != enumC2925x4120adb0) {
                    dVar.d(enumC2925x4120adb0, false);
                    cVar.f407039j = enumC2925x4120adb0;
                }
                if (intValue == com.p314xaae8f345.mm.R.C30867xcad56011.f81518x8f35ca0c) {
                    cVar.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.ON_START_LOADING_ANIM, java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 2) {
            if (!cVar.f407045p && (aVar = cVar.f407030a) != null) {
                ((lc.f) aVar).a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.START_REFLECT, null);
                cVar.f407045p = true;
            }
            final long parseLong = java.lang.Long.parseLong(str);
            jc.b bVar5 = cVar.f407031b;
            if (bVar5 != null) {
                final lc.g gVar = ((lc.e) bVar5).f399328a;
                gVar.getClass();
                gVar.a(new java.lang.Runnable() { // from class: lc.g$$d
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc.g gVar2 = lc.g.this;
                        long j17 = parseLong;
                        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2935x453a187d c2935x453a187d = gVar2.f399346n;
                        if (c2935x453a187d != null && c2935x453a187d.f127441d != null) {
                            c2935x453a187d.f127442e = j17;
                            c2935x453a187d.invalidate();
                        }
                        if (gVar2.f399348p) {
                            return;
                        }
                        gVar2.f399348p = true;
                        pc.o oVar = gVar2.f399352t;
                        if (!oVar.f434750d.equals("")) {
                            oVar.f434750d = "";
                            oVar.f434749c.setText("");
                        }
                        android.widget.TextView textView = gVar2.f399344i;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
            mc.p.f407064a.b("AuthStateManager", "yt action progress, body=" + str);
            return;
        }
        if (i17 == 33) {
            mc.p.f407064a.b("AuthStateManager", "reflection duration ms, body=" + str);
            int i29 = ic.d.f371814k;
            ic.d dVar2 = ic.c.f371813a;
            long parseLong2 = java.lang.Long.parseLong(str);
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2917x949fc30f interfaceC2917x949fc30f = dVar2.f371820f;
            if (interfaceC2917x949fc30f != null) {
                interfaceC2917x949fc30f.m21774x68b6ad44(parseLong2);
                return;
            }
            return;
        }
        if (i17 == 15) {
            int i37 = ic.d.f371814k;
            ic.c.f371813a.getClass();
            return;
        }
        if (i17 == 16) {
            int i38 = ic.d.f371814k;
            ic.c.f371813a.getClass();
            return;
        }
        if (i17 == 20) {
            mc.p.f407064a.b("AuthStateManager", "yt local liveness end.");
            int i39 = ic.d.f371814k;
            ic.d dVar3 = ic.c.f371813a;
            dVar3.f371818d = true;
            cVar.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.AUTH_END, null);
            dVar3.c(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.LOCAL_DETECTION_DONE);
            return;
        }
        if (i17 == 21) {
            mc.q qVar2 = mc.p.f407064a;
            qVar2.b("AuthStateManager", "need check video.");
            if (!hVar.f425640f || hVar.f425638d == null) {
                qVar2.e("TuringSdkHelper", "need turing frame check, turing is not create!");
                return;
            }
            hVar.f425638d.getClass();
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            int i47 = ic.d.f371814k;
            ic.c.f371813a.getClass();
            return;
        }
        switch (i17) {
            case 5:
                mc.q qVar3 = mc.p.f407064a;
                qVar3.b("AuthStateManager", "yt local liveness end.");
                int i48 = ic.d.f371814k;
                ic.d dVar4 = ic.c.f371813a;
                dVar4.getClass();
                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2916x7b7d8c75 interfaceC2916x7b7d8c75 = dVar4.f371821g;
                final mc.r rVar = cVar.f407036g;
                if (rVar == null) {
                    qVar3.e("AuthStateManager", "video recorder is null.");
                    if (interfaceC2916x7b7d8c75 != null) {
                        interfaceC2916x7b7d8c75.m21765xe325e71d(str, "");
                    } else {
                        qVar3.e("AuthStateManager", "sdk result cb is null.");
                    }
                } else {
                    final mc.C29132x2d8c9e c29132x2d8c9e = new mc.C29132x2d8c9e(interfaceC2916x7b7d8c75, str);
                    if (rVar.i()) {
                        c29132x2d8c9e.a(false, "");
                    } else if (rVar.f407082j) {
                        c29132x2d8c9e.a(false, "");
                    } else {
                        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new java.lang.Runnable() { // from class: mc.r$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                mc.r rVar2 = mc.r.this;
                                jc.d dVar5 = c29132x2d8c9e;
                                synchronized (rVar2.f407081i) {
                                    try {
                                        rVar2.f407082j = true;
                                        rVar2.f407081i.wait();
                                    } catch (java.lang.InterruptedException unused) {
                                        mc.p.f407064a.e("VideoRecorderManager", "wait thread is interrupted!");
                                    }
                                    java.lang.String b17 = rVar2.b(dVar5);
                                    if (!android.text.TextUtils.isEmpty(b17) && !android.text.TextUtils.isEmpty(rVar2.f407079g) && !android.text.TextUtils.isEmpty(rVar2.f407080h) && rVar2.f407079g.equals(b17) && pc.f.d(rVar2.f407079g, rVar2.f407080h)) {
                                        b17 = rVar2.f407080h;
                                    }
                                    if (dVar5 != null) {
                                        ((mc.C29132x2d8c9e) dVar5).a(true, b17);
                                    }
                                    com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new pc.e(rVar2.f407079g));
                                }
                            }
                        });
                    }
                }
                dVar4.f371818d = true;
                cVar.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.AUTH_END, null);
                dVar4.c(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.LOCAL_DETECTION_DONE);
                return;
            case 6:
                mc.p.f407064a.e("AuthStateManager", "yt error: " + str);
                if ("-1000051".equals(str) || "4194304".equals(str)) {
                    int i49 = ic.d.f371814k;
                    ic.d dVar5 = ic.c.f371813a;
                    java.lang.ref.WeakReference weakReference2 = dVar5.f371816b;
                    context = weakReference2 != null ? (android.content.Context) weakReference2.get() : null;
                    if (context == null) {
                        context = dVar5.a();
                    }
                    dVar5.b(251, context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575429pj5) : "");
                    return;
                }
                if ("5242881".equals(str)) {
                    int i57 = ic.d.f371814k;
                    ic.d dVar6 = ic.c.f371813a;
                    java.lang.ref.WeakReference weakReference3 = dVar6.f371816b;
                    context = weakReference3 != null ? (android.content.Context) weakReference3.get() : null;
                    if (context == null) {
                        context = dVar6.a();
                    }
                    dVar6.b(252, context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pj6) : "");
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i58 = ic.d.f371814k;
                ic.d dVar7 = ic.c.f371813a;
                java.lang.ref.WeakReference weakReference4 = dVar7.f371816b;
                context = weakReference4 != null ? (android.content.Context) weakReference4.get() : null;
                if (context == null) {
                    context = dVar7.a();
                }
                sb6.append(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575425pj1) : "");
                sb6.append("(");
                sb6.append(str);
                sb6.append(")");
                dVar7.b(228, sb6.toString());
                return;
            case 7:
                mc.p.f407064a.b("AuthStateManager", "yt state change, body=" + str);
                java.lang.String[] split = str.split("--");
                if ("1".equals(split[0])) {
                    int i59 = pc.g.f434740b[cVar.f407044o.ordinal()];
                    com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508 enumC2924x2fe19508 = i59 != 1 ? i59 != 2 ? i59 != 3 ? i59 != 4 ? i59 != 5 ? com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.NONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.SHAKE_HEAD_CHECK_DONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.NOD_HEAD_CHECK_DONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.BLINK_CHECK_DONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.SILENCE_CHECK_DONE : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.OPEN_MOUTH_CHECK_DONE;
                    if (enumC2924x2fe19508 != com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.NONE) {
                        int i66 = ic.d.f371814k;
                        ic.c.f371813a.c(enumC2924x2fe19508);
                    }
                    int i67 = ic.d.f371814k;
                    ic.c.f371813a.c(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.ALL_ACTION_DONE);
                    cVar.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.ALL_ACTION_DONE, null);
                }
                if (split.length > 1 && "0".equals(split[1])) {
                    int i68 = ic.d.f371814k;
                    ic.d dVar8 = ic.c.f371813a;
                    com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777 enumC2928xc7ce2777 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.FaceTrackCheck;
                    dVar8.getClass();
                    pc.l.f434744a.f434745a = enumC2928xc7ce2777;
                }
                if (split.length > 1 && "2".equals(split[1])) {
                    int i69 = ic.d.f371814k;
                    ic.c.f371813a.c(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.REFLECT_CHECK);
                    pc.l.f434744a.f434745a = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.ReflectCheck;
                }
                if (split.length > 1 && "8".equals(split[1])) {
                    int i76 = ic.d.f371814k;
                    ic.d dVar9 = ic.c.f371813a;
                    com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777 enumC2928xc7ce27772 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.OverlayMask;
                    dVar9.getClass();
                    pc.l.f434744a.f434745a = enumC2928xc7ce27772;
                }
                if (split.length <= 1 || !"9".equals(split[1])) {
                    return;
                }
                int i77 = ic.d.f371814k;
                ic.d dVar10 = ic.c.f371813a;
                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777 enumC2928xc7ce27773 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.FakeReflect;
                dVar10.getClass();
                pc.l.f434744a.f434745a = enumC2928xc7ce27773;
                return;
            case 8:
                mc.p.f407064a.b("AuthStateManager", "yt action state change, body=" + str);
                java.lang.String[] split2 = str.split("--");
                pc.f.a(java.lang.Integer.parseInt(split2[0]), true);
                cVar.f407044o = pc.f.a(java.lang.Integer.parseInt(split2[1]), false);
                return;
            case 9:
                java.lang.String[] split3 = str.split("--");
                jc.b bVar6 = cVar.f407031b;
                if (bVar6 != null) {
                    int parseInt = java.lang.Integer.parseInt(split3[0]);
                    boolean equals = "1".equals(split3[1]);
                    long parseLong3 = java.lang.Long.parseLong(split3[2]);
                    final lc.e eVar5 = (lc.e) bVar6;
                    boolean z17 = parseInt == 0;
                    lc.g gVar2 = eVar5.f399328a;
                    if (equals) {
                        if (z17) {
                            pc.f.c(223, gVar2.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pj8));
                            return;
                        } else {
                            pc.f.c(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, gVar2.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575428pj4));
                            return;
                        }
                    }
                    if (z17) {
                        int i78 = ic.d.f371814k;
                        m21824xcf6d6e49 = ic.c.f371813a.f371823i.m21835x9b223799();
                    } else {
                        int i79 = ic.d.f371814k;
                        m21824xcf6d6e49 = ic.c.f371813a.f371823i.m21824xcf6d6e49();
                    }
                    final int floor = (int) java.lang.Math.floor((m21824xcf6d6e49 - parseLong3) / 1000.0d);
                    if (parseLong3 == 0 || gVar2.A - 1 == floor) {
                        gVar2.a(new java.lang.Runnable() { // from class: lc.e$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                lc.e eVar6 = lc.e.this;
                                eVar6.getClass();
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append(floor);
                                lc.g gVar3 = eVar6.f399328a;
                                sb7.append(gVar3.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.piw));
                                gVar3.f399344i.setText(sb7.toString());
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
                        mc.p.f407064a.b("AuthStateManager", "camera param data: " + str);
                        cVar.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.CAMERA_PARAMS_CHANGED, str);
                        return;
                    case 24:
                        cVar.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.CAMERA_PARAMS_STATE_CHANGED, str);
                        mc.p.f407064a.b("AuthStateManager", "state changed: " + str);
                        return;
                    case 25:
                        cVar.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.CAMERA_RESOLUTION, str);
                        mc.p.f407064a.b("AuthStateManager", "got camera size.");
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: releaseYtLiveness */
    public static native int m21752xf6e0f4e5();

    /* renamed from: setCurrentTextureView */
    public static native void m21753xdc255729(android.view.TextureView textureView);

    /* renamed from: updateFrame */
    public static native int m21754xdc709624(byte[] bArr, int i17, int i18, int i19, int i27, byte[] bArr2, int i28, int i29, int i37);
}
