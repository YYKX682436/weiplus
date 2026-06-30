package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes15.dex */
public class x implements io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.input.c0 f65804a;

    public x(com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var) {
        this.f65804a = c0Var;
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void clearClient() {
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.f65804a;
        if (c0Var.f65736e.f65729a == com.tencent.mm.feature.ecs.nirvana.input.a0.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        c0Var.f65739h.e(c0Var);
        c0Var.a();
        c0Var.f65737f = null;
        c0Var.b(null);
        c0Var.f65736e = new com.tencent.mm.feature.ecs.nirvana.input.b0(com.tencent.mm.feature.ecs.nirvana.input.a0.NO_TARGET, 0);
        c0Var.f65742k = null;
        c0Var.f65733b.restartInput(c0Var.f65732a);
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void finishAutofillContext(boolean z17) {
        android.view.autofill.AutofillManager autofillManager;
        if (android.os.Build.VERSION.SDK_INT < 26 || (autofillManager = this.f65804a.f65734c) == null) {
            return;
        }
        if (z17) {
            autofillManager.commit();
        } else {
            autofillManager.cancel();
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void hide() {
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.f65804a;
        if (c0Var.f65736e.f65729a == com.tencent.mm.feature.ecs.nirvana.input.a0.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            c0Var.a();
            return;
        }
        c0Var.a();
        c0Var.f65733b.hideSoftInputFromWindow(c0Var.f65732a.getApplicationWindowToken(), 0);
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void requestAutofill() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.f65804a;
        if (i17 < 26) {
            c0Var.getClass();
            return;
        }
        android.view.autofill.AutofillManager autofillManager = c0Var.f65734c;
        if (autofillManager != null) {
            if (c0Var.f65738g != null) {
                java.lang.String str = c0Var.f65737f.autofill.uniqueIdentifier;
                int[] iArr = new int[2];
                android.view.View view = c0Var.f65732a;
                view.getLocationOnScreen(iArr);
                android.graphics.Rect rect = new android.graphics.Rect(c0Var.f65742k);
                rect.offset(iArr[0], iArr[1]);
                autofillManager.notifyViewEntered(view, str.hashCode(), rect);
            }
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void sendAppPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.f65804a;
        c0Var.f65733b.sendAppPrivateCommand(c0Var.f65732a, str, bundle);
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void setClient(int i17, io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration) {
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.f65804a;
        c0Var.getClass();
        com.tencent.mars.xlog.Log.i("TextInputPlugin", "setTextInputClient");
        c0Var.a();
        c0Var.f65737f = configuration;
        c0Var.f65736e = new com.tencent.mm.feature.ecs.nirvana.input.b0(com.tencent.mm.feature.ecs.nirvana.input.a0.FRAMEWORK_CLIENT, i17);
        c0Var.f65739h.e(c0Var);
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
        c0Var.f65739h = new com.tencent.mm.feature.ecs.nirvana.input.s(autofill != null ? autofill.editState : null, c0Var.f65732a);
        c0Var.b(configuration);
        c0Var.f65740i = true;
        com.tencent.mm.feature.ecs.nirvana.input.a0 a0Var = c0Var.f65736e.f65729a;
        c0Var.f65742k = null;
        c0Var.f65739h.a(c0Var);
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void setEditableSizeAndTransform(double d17, double d18, double[] dArr) {
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.f65804a;
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
        com.tencent.mm.feature.ecs.nirvana.input.y yVar = new com.tencent.mm.feature.ecs.nirvana.input.y(c0Var, z17, dArr, dArr2);
        yVar.a(d17, 0.0d);
        yVar.a(d17, d18);
        yVar.a(0.0d, d18);
        java.lang.Float valueOf = java.lang.Float.valueOf(c0Var.f65732a.getContext().getResources().getDisplayMetrics().density);
        c0Var.f65742k = new android.graphics.Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) java.lang.Math.ceil(dArr2[1] * valueOf.floatValue()), (int) java.lang.Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEditingState(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState r10) {
        /*
            r9 = this;
            com.tencent.mm.feature.ecs.nirvana.input.c0 r0 = r9.f65804a
            android.view.View r1 = r0.f65732a
            boolean r2 = r0.f65740i
            r3 = 0
            if (r2 != 0) goto L4a
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r2 = r0.f65743l
            if (r2 == 0) goto L4a
            boolean r2 = r2.hasComposing()
            if (r2 == 0) goto L4a
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r2 = r0.f65743l
            int r4 = r2.composingEnd
            int r5 = r2.composingStart
            int r4 = r4 - r5
            int r5 = r10.composingEnd
            int r6 = r10.composingStart
            int r5 = r5 - r6
            if (r4 == r5) goto L22
            goto L39
        L22:
            r5 = r3
        L23:
            if (r5 >= r4) goto L3e
            java.lang.String r6 = r2.text
            int r7 = r2.composingStart
            int r7 = r7 + r5
            char r6 = r6.charAt(r7)
            java.lang.String r7 = r10.text
            int r8 = r10.composingStart
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
            r0.f65740i = r2
            if (r2 == 0) goto L4a
            java.lang.String r2 = "TextInputPlugin"
            java.lang.String r4 = "Composing region changed by the framework. Restarting the input method."
            com.tencent.mars.xlog.Log.i(r2, r4)
        L4a:
            r0.f65743l = r10
            com.tencent.mm.feature.ecs.nirvana.input.s r2 = r0.f65739h
            r2.f(r10)
            boolean r10 = r0.f65740i
            if (r10 == 0) goto L5c
            android.view.inputmethod.InputMethodManager r10 = r0.f65733b
            r10.restartInput(r1)
            r0.f65740i = r3
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.input.x.setEditingState(io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState):void");
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void setPlatformViewClient(int i17, boolean z17) {
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.f65804a;
        if (!z17) {
            c0Var.getClass();
            c0Var.f65736e = new com.tencent.mm.feature.ecs.nirvana.input.b0(com.tencent.mm.feature.ecs.nirvana.input.a0.PHYSICAL_DISPLAY_PLATFORM_VIEW, i17);
            c0Var.f65741j = null;
        } else {
            android.view.View view = c0Var.f65732a;
            view.requestFocus();
            c0Var.f65736e = new com.tencent.mm.feature.ecs.nirvana.input.b0(com.tencent.mm.feature.ecs.nirvana.input.a0.VIRTUAL_DISPLAY_PLATFORM_VIEW, i17);
            c0Var.f65733b.restartInput(view);
            c0Var.f65740i = false;
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void setTextSelectionState(java.util.Map map) {
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public void show() {
        io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType inputType;
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.f65804a;
        c0Var.getClass();
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration = c0Var.f65737f;
        android.view.inputmethod.InputMethodManager inputMethodManager = c0Var.f65733b;
        android.view.View view = c0Var.f65732a;
        if (configuration == null || (inputType = configuration.inputType) == null || inputType.type != io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NONE) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 0);
        } else {
            c0Var.a();
            inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
        }
    }
}
