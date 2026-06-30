package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class x implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 f147337a;

    public x(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var) {
        this.f147337a = c0Var;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: clearClient */
    public void mo44272x85bce878() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = this.f147337a;
        if (c0Var.f147269e.f147262a == com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a0.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        c0Var.f147272h.e(c0Var);
        c0Var.a();
        c0Var.f147270f = null;
        c0Var.b(null);
        c0Var.f147269e = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.b0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a0.NO_TARGET, 0);
        c0Var.f147275k = null;
        c0Var.f147266b.restartInput(c0Var.f147265a);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: finishAutofillContext */
    public void mo44273xda74508a(boolean z17) {
        android.view.autofill.AutofillManager autofillManager;
        if (android.os.Build.VERSION.SDK_INT < 26 || (autofillManager = this.f147337a.f147267c) == null) {
            return;
        }
        if (z17) {
            autofillManager.commit();
        } else {
            autofillManager.cancel();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: hide */
    public void mo44274x30dd42() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = this.f147337a;
        if (c0Var.f147269e.f147262a == com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a0.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            c0Var.a();
            return;
        }
        c0Var.a();
        c0Var.f147266b.hideSoftInputFromWindow(c0Var.f147265a.getApplicationWindowToken(), 0);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: requestAutofill */
    public void mo44275xf01abb61() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = this.f147337a;
        if (i17 < 26) {
            c0Var.getClass();
            return;
        }
        android.view.autofill.AutofillManager autofillManager = c0Var.f147267c;
        if (autofillManager != null) {
            if (c0Var.f147271g != null) {
                java.lang.String str = c0Var.f147270f.f71517x55c963b2.f71532xf885435a;
                int[] iArr = new int[2];
                android.view.View view = c0Var.f147265a;
                view.getLocationOnScreen(iArr);
                android.graphics.Rect rect = new android.graphics.Rect(c0Var.f147275k);
                rect.offset(iArr[0], iArr[1]);
                autofillManager.notifyViewEntered(view, str.hashCode(), rect);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: sendAppPrivateCommand */
    public void mo44276x9a2d9221(java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = this.f147337a;
        c0Var.f147266b.sendAppPrivateCommand(c0Var.f147265a, str, bundle);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: setClient */
    public void mo44277x75f4acd(int i17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = this.f147337a;
        c0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextInputPlugin", "setTextInputClient");
        c0Var.a();
        c0Var.f147270f = configuration;
        c0Var.f147269e = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.b0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a0.FRAMEWORK_CLIENT, i17);
        c0Var.f147272h.e(c0Var);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill = configuration.f71517x55c963b2;
        c0Var.f147272h = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s(autofill != null ? autofill.f71529x901d9ca7 : null, c0Var.f147265a);
        c0Var.b(configuration);
        c0Var.f147273i = true;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a0 a0Var = c0Var.f147269e.f147262a;
        c0Var.f147275k = null;
        c0Var.f147272h.a(c0Var);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: setEditableSizeAndTransform */
    public void mo44278x3608b2fc(double d17, double d18, double[] dArr) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = this.f147337a;
        c0Var.getClass();
        double[] dArr2 = new double[4];
        boolean z17 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d19 = dArr[12];
        double d27 = dArr[15];
        double d28 = d19 / d27;
        dArr2[1] = d28;
        dArr2[0] = d28;
        double d29 = dArr[13] / d27;
        dArr2[3] = d29;
        dArr2[2] = d29;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.y yVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.y(c0Var, z17, dArr, dArr2);
        yVar.a(d17, 0.0d);
        yVar.a(d17, d18);
        yVar.a(0.0d, d18);
        java.lang.Float valueOf = java.lang.Float.valueOf(c0Var.f147265a.getContext().getResources().getDisplayMetrics().density);
        c0Var.f147275k = new android.graphics.Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) java.lang.Math.ceil(dArr2[1] * valueOf.floatValue()), (int) java.lang.Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: setEditingState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo44279x359d2b5b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState r10) {
        /*
            r9 = this;
            com.tencent.mm.feature.ecs.nirvana.input.c0 r0 = r9.f147337a
            android.view.View r1 = r0.f147265a
            boolean r2 = r0.f147273i
            r3 = 0
            if (r2 != 0) goto L4a
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r2 = r0.f147276l
            if (r2 == 0) goto L4a
            boolean r2 = r2.m138382x6bd44c55()
            if (r2 == 0) goto L4a
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r2 = r0.f147276l
            int r4 = r2.f71542xf18c188c
            int r5 = r2.f71543xbfb02bd3
            int r4 = r4 - r5
            int r5 = r10.f71542xf18c188c
            int r6 = r10.f71543xbfb02bd3
            int r5 = r5 - r6
            if (r4 == r5) goto L22
            goto L39
        L22:
            r5 = r3
        L23:
            if (r5 >= r4) goto L3e
            java.lang.String r6 = r2.f71546x36452d
            int r7 = r2.f71543xbfb02bd3
            int r7 = r7 + r5
            char r6 = r6.charAt(r7)
            java.lang.String r7 = r10.f71546x36452d
            int r8 = r10.f71543xbfb02bd3
            int r8 = r8 + r5
            char r7 = r7.charAt(r8)
            if (r6 == r7) goto L3b
        L39:
            r2 = 1
            goto L3f
        L3b:
            int r5 = r5 + 1
            goto L23
        L3e:
            r2 = r3
        L3f:
            r0.f147273i = r2
            if (r2 == 0) goto L4a
            java.lang.String r2 = "TextInputPlugin"
            java.lang.String r4 = "Composing region changed by the framework. Restarting the input method."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
        L4a:
            r0.f147276l = r10
            com.tencent.mm.feature.ecs.nirvana.input.s r2 = r0.f147272h
            r2.f(r10)
            boolean r10 = r0.f147273i
            if (r10 == 0) goto L5c
            android.view.inputmethod.InputMethodManager r10 = r0.f147266b
            r10.restartInput(r1)
            r0.f147273i = r3
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.x.mo44279x359d2b5b(io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState):void");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: setPlatformViewClient */
    public void mo44280x9713fa5(int i17, boolean z17) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = this.f147337a;
        if (!z17) {
            c0Var.getClass();
            c0Var.f147269e = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.b0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a0.PHYSICAL_DISPLAY_PLATFORM_VIEW, i17);
            c0Var.f147274j = null;
        } else {
            android.view.View view = c0Var.f147265a;
            view.requestFocus();
            c0Var.f147269e = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.b0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a0.VIRTUAL_DISPLAY_PLATFORM_VIEW, i17);
            c0Var.f147266b.restartInput(view);
            c0Var.f147273i = false;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: setTextSelectionState */
    public void mo44281x484e5cf4(java.util.Map map) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
    /* renamed from: show */
    public void mo44282x35dafd() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.InputType inputType;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = this.f147337a;
        c0Var.getClass();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration = c0Var.f147270f;
        android.view.inputmethod.InputMethodManager inputMethodManager = c0Var.f147266b;
        android.view.View view = c0Var.f147265a;
        if (configuration == null || (inputType = configuration.f71525x65be6624) == null || inputType.f71535x368f3a != io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.NONE) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 0);
        } else {
            c0Var.a();
            inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
        }
    }
}
