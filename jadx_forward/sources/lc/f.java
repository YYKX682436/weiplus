package lc;

/* loaded from: classes14.dex */
public final class f implements jc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.g f399336a;

    public f(lc.g gVar) {
        this.f399336a = gVar;
    }

    public final void a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9 enumC2922xcddc5fa9, final java.lang.Object obj) {
        int i17 = lc.h.f399376a[enumC2922xcddc5fa9.ordinal()];
        final lc.g gVar = this.f399336a;
        switch (i17) {
            case 1:
                gVar.getClass();
                pc.l.f434744a.f434745a = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2928xc7ce2777.Prepare;
                mc.q qVar = mc.p.f407064a;
                qVar.b("AuthingFragment", ">>>start prepare event");
                if (gVar.f399347o == null) {
                    qVar.e("AuthingFragment", "loadingFrontAnimatorView is null!");
                    return;
                }
                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde = gVar.B;
                if (c2919x968bacde != null && c2919x968bacde.m21793xf6b639f1()) {
                    gVar.f399347o.m21968x5e3699ff(false);
                    return;
                }
                final com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed39 = gVar.f399347o;
                c2936x4a02ed39.f127456r = true;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c2936x4a02ed39, arrayList.toArray(), "com/tencent/cloud/huiyan/view/LoadingFrontAnimatorView", "b", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c2936x4a02ed39.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c2936x4a02ed39, "com/tencent/cloud/huiyan/view/LoadingFrontAnimatorView", "b", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                c2936x4a02ed39.f127446e = ofFloat;
                ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: qc.a$$a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        int i18 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39.f127444v;
                        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed392 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39.this;
                        c2936x4a02ed392.getClass();
                        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (floatValue < 0.0f || floatValue > 1.0f) {
                            return;
                        }
                        c2936x4a02ed392.f127445d = floatValue;
                        c2936x4a02ed392.invalidate();
                    }
                });
                c2936x4a02ed39.f127446e.setDuration(2000L);
                c2936x4a02ed39.f127446e.setRepeatMode(1);
                c2936x4a02ed39.f127446e.setRepeatCount(-1);
                c2936x4a02ed39.f127446e.start();
                return;
            case 2:
                gVar.getClass();
                mc.p.f407064a.b("AuthingFragment", ">>>start auth action");
                gVar.a(new java.lang.Runnable() { // from class: lc.g$$i
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc.g gVar2 = lc.g.this;
                        if (gVar2.f399353u == null) {
                            gVar2.f399353u = new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151();
                        }
                        gVar2.f399353u.m21562xcc679317(new lc.b());
                        gVar2.f399353u.m21561x2eac842c(new lc.c(gVar2));
                        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.C2891xb691d6e7 c2891xb691d6e7 = new com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p321xb29de3e3.C2891xb691d6e7();
                        c2891xb691d6e7.m21591x39271725(false);
                        c2891xb691d6e7.m21596x28f15765(640);
                        c2891xb691d6e7.m21595xdb6a9b68(480);
                        int i18 = ic.d.f371814k;
                        ic.d dVar = ic.c.f371813a;
                        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = dVar.f371823i;
                        if (c2920x9dce3f52 != null) {
                            c2891xb691d6e7.m21593x18474c39(30);
                            c2891xb691d6e7.m21592x17db1be7(30);
                            c2891xb691d6e7.m21588x8e9e30ee(c2920x9dce3f52.m21863x9f3426c9());
                            if (c2920x9dce3f52.m21863x9f3426c9()) {
                                c2891xb691d6e7.m21598x76535355(c2920x9dce3f52.m21839x60df64bb());
                            }
                            c2891xb691d6e7.m21594x428673ba(c2920x9dce3f52.m21851xfbbc9082());
                        } else {
                            c2891xb691d6e7.m21593x18474c39(30);
                            c2891xb691d6e7.m21592x17db1be7(30);
                            c2891xb691d6e7.m21588x8e9e30ee(false);
                        }
                        c2891xb691d6e7.m21589xca1250b4(true);
                        c2891xb691d6e7.m21597x1e65280(false);
                        gVar2.f399353u.m21556x978b6e61(dVar.a(), c2891xb691d6e7);
                        gVar2.f399340e.mo21971x4c895ab3(gVar2.f399353u);
                        android.content.Context a17 = dVar.a();
                        if (gVar2.f399353u == null || a17 == null) {
                            if (gVar2.f399353u == null) {
                                mc.p.f407064a.e("AuthingFragment", "startAuthAction fail cameraHolder is null!");
                            }
                            if (a17 == null) {
                                mc.p.f407064a.e("AuthingFragment", "startAuthAction fail context is null!");
                                return;
                            }
                            return;
                        }
                        gVar2.f399353u.m21558xf86b760f(a17);
                        oc.h hVar = oc.g.f425634a;
                        synchronized (hVar) {
                            hVar.f425642h = new android.os.HandlerThread("turing");
                            hVar.f425642h.start();
                            hVar.f425643i = new oc.f(hVar.f425642h.getLooper());
                        }
                    }
                });
                return;
            case 3:
                int i18 = ic.d.f371814k;
                if (ic.c.f371813a.f371822h) {
                    gVar.c(640, 480);
                    return;
                }
                return;
            case 4:
                gVar.getClass();
                gVar.a(new lc.RunnableC29079x2f5e1a(gVar, 255));
                return;
            case 5:
                gVar.getClass();
                mc.q qVar2 = mc.p.f407064a;
                qVar2.b("AuthingFragment", ">>>start auth end.");
                int i19 = ic.d.f371814k;
                ic.c.f371813a.getClass();
                qVar2.b("HuiYanBaseApi", "releaseLivenessSDK!");
                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21752xf6e0f4e5();
                gVar.a(new java.lang.Runnable() { // from class: lc.g$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i27;
                        lc.g gVar2 = lc.g.this;
                        android.widget.TextView textView = gVar2.f399344i;
                        if (textView != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(textView, "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        mc.q qVar3 = mc.p.f407064a;
                        qVar3.e("AuthingFragment", "releaseDeviceRes!");
                        gVar2.f399356x = false;
                        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151 c2888xbf192151 = gVar2.f399353u;
                        oc.h hVar = oc.g.f425634a;
                        if (c2888xbf192151 != null) {
                            gVar2.f399353u.m21559x41012807();
                            hVar.a();
                            gVar2.f399353u = null;
                        }
                        hVar.a();
                        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed392 = gVar2.f399347o;
                        if (c2936x4a02ed392 != null) {
                            c2936x4a02ed392.c(true);
                        }
                        int i28 = ic.d.f371814k;
                        ic.d dVar = ic.c.f371813a;
                        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = dVar.f371823i;
                        if (c2920x9dce3f52 != null && c2920x9dce3f52.m21840xe1b11df6() && (i27 = gVar2.f399349q) != -1) {
                            gVar2.a(new lc.RunnableC29079x2f5e1a(gVar2, i27));
                        }
                        mc.k.f407058a.a();
                        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f522 = dVar.f371823i;
                        if (!(c2920x9dce3f522 == null ? false : c2920x9dce3f522.m21866xc1ecc0d7())) {
                            qVar3.b("HuiYanBaseApi", "closeCurrentCheckIsHaveResultPage!");
                            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f523 = dVar.f371823i;
                            if (c2920x9dce3f523 == null) {
                                qVar3.b("HuiYanBaseApi", "want closeCurrentUi!");
                                pc.f.b();
                                return;
                            } else {
                                if (c2920x9dce3f523.m21846x7ea72bdf()) {
                                    return;
                                }
                                qVar3.b("HuiYanBaseApi", "isHaveResultFragment close ui!");
                                qVar3.b("HuiYanBaseApi", "want closeCurrentUi!");
                                pc.f.b();
                                return;
                            }
                        }
                        if (gVar2.f399341f == null) {
                            return;
                        }
                        android.widget.TextView textView2 = gVar2.f399342g;
                        if (textView2 != null) {
                            textView2.setText(gVar2.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjb));
                            gVar2.f399342g.setTextColor(gVar2.b().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ana));
                        }
                        android.widget.TextView textView3 = gVar2.f399343h;
                        if (textView3 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList3.add(4);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(textView3, arrayList3.toArray(), "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            textView3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(textView3, "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view = gVar2.f399377d;
                        if (view != null) {
                            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.vjl);
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                            arrayList4.add(4);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById2 = gVar2.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjt);
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(4);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(findViewById2, "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        gVar2.f399341f.setVisibility(0);
                        qVar3.e("AuthingFragment", "animationDrawable is null!");
                    }
                });
                return;
            case 6:
                gVar.a(new java.lang.Runnable() { // from class: lc.f$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        double d17;
                        int i27;
                        int i28;
                        int i29;
                        int i37;
                        int intValue;
                        android.util.Pair pair;
                        java.lang.Object obj2 = obj;
                        mc.g gVar2 = mc.f.f407049a;
                        java.lang.String str = (java.lang.String) obj2;
                        gVar2.getClass();
                        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2899x9a2844f6 c2899x9a2844f6 = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p328x31ece8.C2899x9a2844f6();
                        try {
                            kc.a aVar = (kc.a) c2899x9a2844f6.m21622xb5cb93b2(str, kc.a.class);
                            aVar.getClass();
                            int i38 = gVar2.f407053d;
                            if (i38 != 1) {
                                if (i38 == 0) {
                                    throw null;
                                }
                                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21734x5569a4ac(23, c2899x9a2844f6.m21623xcc31ba03(new kc.a(i38 - 1, "camera params not support", aVar.f387791c, aVar.f387792d, aVar.f387793e, aVar.f387794f, aVar.f387795g)));
                                return;
                            }
                            if (gVar2.f407056g) {
                                float f17 = (float) aVar.f387794f;
                                float f18 = 0.0f;
                                if (f17 == 0.0f) {
                                    pair = new android.util.Pair(0, java.lang.Float.valueOf(0.0f));
                                } else if (java.lang.Math.abs(f17 - (-10.0f)) < 1.0E-6f) {
                                    pair = new android.util.Pair(0, java.lang.Float.valueOf(0.0f));
                                } else {
                                    float f19 = 99.0f;
                                    int i39 = 0;
                                    for (java.util.Map.Entry entry : gVar2.f407050a.entrySet()) {
                                        float floatValue = ((java.lang.Float) entry.getKey()).floatValue();
                                        float abs = java.lang.Math.abs(floatValue - f17);
                                        if (abs < f19) {
                                            i39 = ((java.lang.Integer) entry.getValue()).intValue();
                                            f18 = floatValue;
                                            f19 = abs;
                                        }
                                    }
                                    pair = new android.util.Pair(java.lang.Integer.valueOf(i39), java.lang.Float.valueOf(f18));
                                }
                                i27 = ((java.lang.Integer) pair.first).intValue();
                                d17 = ((java.lang.Float) pair.second).floatValue();
                            } else {
                                d17 = 0.0d;
                                i27 = 0;
                            }
                            double d18 = d17;
                            int i47 = 100;
                            if (gVar2.f407054e) {
                                int i48 = aVar.f387795g;
                                int i49 = 999;
                                int i57 = 0;
                                for (int i58 = 0; i58 < gVar2.f407051b.size() && (intValue = ((java.lang.Integer) gVar2.f407051b.get(i58)).intValue()) <= 200; i58++) {
                                    int i59 = intValue - i48;
                                    if (java.lang.Math.abs(i59) < i49) {
                                        i49 = java.lang.Math.abs(i59);
                                        i57 = i58;
                                        i47 = intValue;
                                    }
                                }
                                mc.q qVar3 = mc.p.f407064a;
                                qVar3.b("d", "zoomRatioList: " + gVar2.f407051b);
                                qVar3.b("d", "wantZoomRatios: " + i48 + ", realZoomRatios: " + i47 + ", closerZoomIndex: " + i57);
                                android.util.Pair pair2 = new android.util.Pair(java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i47));
                                i29 = ((java.lang.Integer) pair2.first).intValue();
                                i28 = ((java.lang.Integer) pair2.second).intValue();
                            } else {
                                i28 = 100;
                                i29 = 0;
                            }
                            java.lang.String str2 = (!gVar2.f407055f || (i37 = aVar.f387793e) == 0) ? "auto" : i37 != 1 ? i37 != 2 ? i37 != 3 ? i37 != 4 ? i37 != 5 ? "" : "incandescent" : "fluorescent" : "warm-fluorescent" : "daylight" : "cloudy-daylight";
                            try {
                                if (gVar2.f407052c.get() == null || ((com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151) gVar2.f407052c.get()).m21552x26ba6a48() == null || ((com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151) gVar2.f407052c.get()).m21552x26ba6a48().getParameters() == null) {
                                    return;
                                }
                                android.hardware.Camera.Parameters parameters = ((com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151) gVar2.f407052c.get()).m21552x26ba6a48().getParameters();
                                mc.q qVar4 = mc.p.f407064a;
                                qVar4.b("d", "support exposure:" + gVar2.f407056g + ", need change:false, realExposureIndex:" + i27);
                                qVar4.b("d", "support wh:" + gVar2.f407055f + ", need change:false, realWhiteBalance:" + str2);
                                qVar4.b("d", "support zoom:" + gVar2.f407054e + ", need change:false, realZoomIndex:" + i29);
                                qVar4.b("d", "camera params changed, applying new parameters");
                                ((com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151) gVar2.f407052c.get()).m21552x26ba6a48().setParameters(parameters);
                                qVar4.b("d", "after set parameters.");
                                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21734x5569a4ac(23, c2899x9a2844f6.m21623xcc31ba03(new kc.a(0, "camera params set success", aVar.f387791c, aVar.f387792d, aVar.f387793e, d18, i28)));
                            } catch (java.lang.Exception e17) {
                                mc.p.f407064a.e("d", "update camera params error: " + e17.getLocalizedMessage());
                                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21734x5569a4ac(23, c2899x9a2844f6.m21623xcc31ba03(new kc.a(5, "camera params set error", aVar.f387791c, aVar.f387792d, aVar.f387793e, aVar.f387794f, aVar.f387795g)));
                            }
                        } catch (java.lang.Exception e18) {
                            mc.p.f407064a.e("d", "transform camera params to entity error: " + e18.getLocalizedMessage());
                        }
                    }
                });
                return;
            case 7:
                java.lang.String str = (java.lang.String) obj;
                gVar.getClass();
                try {
                    java.lang.String[] split = str.split("--");
                    if (split.length != 2) {
                        throw new java.lang.IllegalArgumentException("invalid format: expected 'stage--state'");
                    }
                    int a17 = mc.e.a(java.lang.Integer.parseInt(split[0]));
                    int a18 = mc.h.a(java.lang.Integer.parseInt(split[1]));
                    mc.p.f407064a.b("AuthingFragment", "stage: " + split[0] + ", state: " + split[1]);
                    if (a17 == 2 && a18 == 2) {
                        gVar.a(new java.lang.Runnable() { // from class: lc.g$$g
                            @Override // java.lang.Runnable
                            public final void run() {
                                final lc.g gVar2 = lc.g.this;
                                gVar2.f399358z = true;
                                if (gVar2.f399344i != null && gVar2.B.m21795xab9efeaa()) {
                                    android.widget.TextView textView = gVar2.f399344i;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                                    arrayList2.add(0);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(textView, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/f", "f", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(textView, "com/tencent/cloud/huiyan/fragments/f", "f", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed392 = gVar2.f399347o;
                                if (c2936x4a02ed392 != null) {
                                    c2936x4a02ed392.c(false);
                                }
                                android.widget.ImageView imageView = gVar2.f399341f;
                                if (imageView != null) {
                                    imageView.postDelayed(new java.lang.Runnable() { // from class: lc.g$$b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            lc.g gVar3 = lc.g.this;
                                            android.widget.ImageView imageView2 = gVar3.f399341f;
                                            if (imageView2 != null) {
                                                imageView2.setVisibility(8);
                                                if (gVar3.f399341f == null) {
                                                    return;
                                                }
                                                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde2 = gVar3.B;
                                                if (c2919x968bacde2 != null && c2919x968bacde2.m21790xfd0be3b6()) {
                                                    gVar3.f399341f.setVisibility(8);
                                                    return;
                                                }
                                                gVar3.f399341f.setScaleX(0.935f);
                                                gVar3.f399341f.setScaleY(0.935f);
                                                gVar3.f399341f.setVisibility(0);
                                                gVar3.f399341f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_6);
                                            }
                                        }
                                    }, 150L);
                                }
                            }
                        });
                        return;
                    }
                    return;
                } catch (java.lang.NumberFormatException e17) {
                    mc.p.f407064a.e("AuthingFragment", "invalid number format in input: " + e17.getLocalizedMessage());
                    return;
                } catch (java.lang.IllegalArgumentException e18) {
                    mc.p.f407064a.e("AuthingFragment", "illegal argument in input: " + e18.getLocalizedMessage());
                    return;
                }
            case 8:
                gVar.a(new java.lang.Runnable() { // from class: lc.f$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc.f fVar = lc.f.this;
                        java.lang.Object obj2 = obj;
                        lc.g gVar2 = fVar.f399336a;
                        java.lang.String str2 = (java.lang.String) obj2;
                        gVar2.getClass();
                        try {
                            java.lang.String[] split2 = str2.split("--");
                            int parseInt = java.lang.Integer.parseInt(split2[0]);
                            int parseInt2 = java.lang.Integer.parseInt(split2[1]);
                            if (parseInt2 * 9 == parseInt * 16) {
                                oc.a aVar = gVar2.f399340e;
                                if (aVar instanceof com.p314xaae8f345.p318x5a5de35.p337x3c29f010.p338xcc985031.p339x373aa5.SurfaceHolderCallbackC2937x5b120033) {
                                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) ((com.p314xaae8f345.p318x5a5de35.p337x3c29f010.p338xcc985031.p339x373aa5.SurfaceHolderCallbackC2937x5b120033) aVar).getLayoutParams();
                                    int i27 = layoutParams.height;
                                    int i28 = ic.d.f371814k;
                                    com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = ic.c.f371813a.f371823i;
                                    if (c2920x9dce3f52 == null || !c2920x9dce3f52.m21848x704df978()) {
                                        layoutParams.height = (int) (layoutParams.height * 1.3d);
                                    } else {
                                        layoutParams.width = (int) (layoutParams.width * 1.3d);
                                    }
                                    ((com.p314xaae8f345.p318x5a5de35.p337x3c29f010.p338xcc985031.p339x373aa5.SurfaceHolderCallbackC2937x5b120033) gVar2.f399340e).setLayoutParams(layoutParams);
                                    android.view.View view = gVar2.f399377d;
                                    if (view != null) {
                                        int i29 = (layoutParams.height - i27) / 2;
                                        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.vju);
                                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
                                        marginLayoutParams.topMargin -= i29;
                                        findViewById.setLayoutParams(marginLayoutParams);
                                        mc.p.f407064a.b("AuthingFragment", "margin top offset:" + i29);
                                    } else {
                                        mc.p.f407064a.e("AuthingFragment", "fragment view is null.");
                                    }
                                }
                            }
                            gVar2.c(parseInt2, parseInt);
                            mc.r rVar = oc.g.f425634a.f425639e;
                            if (gVar2.f399353u == null || gVar2.f399353u.m21552x26ba6a48() == null || rVar == null) {
                                return;
                            }
                            android.hardware.Camera.Size previewSize = gVar2.f399353u.m21552x26ba6a48().getParameters().getPreviewSize();
                            rVar.c(previewSize.width, previewSize.height, gVar2.f399353u.m21554x411b847e());
                            rVar.k();
                        } catch (java.lang.Exception e19) {
                            mc.p.f407064a.e("AuthingFragment", "camera size error: " + e19.getLocalizedMessage());
                        }
                    }
                });
                return;
            default:
                return;
        }
    }
}
