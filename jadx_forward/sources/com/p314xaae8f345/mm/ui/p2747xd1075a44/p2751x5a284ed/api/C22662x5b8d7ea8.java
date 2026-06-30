package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api;

/* renamed from: com.tencent.mm.ui.widget.cedit.api.MMCustomEditText */
/* loaded from: classes15.dex */
public class C22662x5b8d7ea8 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22664x9cc02e6d implements fl5.i {
    public static final java.lang.String R2 = "^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$".substring(1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de);
    public android.view.inputmethod.InputConnection G2;
    public boolean H2;
    public boolean I2;
    public fl5.e J2;
    public fl5.c K2;
    public fl5.f L2;
    public int M2;
    public al5.n1 N2;
    public al5.q1 O2;
    public fl5.a P2;
    public nl5.p Q2;

    public C22662x5b8d7ea8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H2 = false;
        this.I2 = false;
        this.M2 = 0;
        this.Q2 = null;
        this.P2 = new fl5.m(this);
    }

    /* renamed from: getFilterText */
    private java.lang.String m81547x91aec0bb() {
        android.text.Editable mo81602xfb85ada3 = mo81602xfb85ada3();
        return mo81602xfb85ada3 == null ? "" : mo81602xfb85ada3.toString().replaceAll(R2, "*");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    public void N(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        try {
            super.N(context, attributeSet, i17, i18);
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCustomEditText", "init crash:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            fl5.b.a(0);
            this.I2 = true;
        }
    }

    @Override // fl5.i
    public void a(nl5.p pVar) {
        this.Q2 = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    public boolean a0(java.lang.String str, android.os.Bundle bundle) {
        if (gl5.i.a(str, bundle, this.J2)) {
            return true;
        }
        nl5.p pVar = this.Q2;
        if (pVar != null) {
            return pVar.a(str, bundle);
        }
        return false;
    }

    @Override // fl5.i
    public void b(java.lang.String str, java.lang.String str2, nl5.a0 a0Var, nl5.w wVar) {
        m81749xd3ccb811(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a3y));
        m81772x50855846(a0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    public void b0(int i17, int i18) {
        super.b0(i17, i18);
    }

    @Override // fl5.i
    public void c(fl5.g gVar) {
        if (gVar == null) {
            return;
        }
        m81778x37562b58(new fl5.l(this, gVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22664x9cc02e6d, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c0(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.MMCustomEditText"
            r1 = 16908322(0x1020022, float:2.3877324E-38)
            r2 = 0
            fl5.c r3 = r7.K2     // Catch: java.lang.NullPointerException -> L22 java.lang.IndexOutOfBoundsException -> L2d
            if (r3 == 0) goto L15
            if (r8 != r1) goto L15
            android.content.Context r4 = r7.getContext()     // Catch: java.lang.NullPointerException -> L22 java.lang.IndexOutOfBoundsException -> L2d
            boolean r3 = r3.a(r4)     // Catch: java.lang.NullPointerException -> L22 java.lang.IndexOutOfBoundsException -> L2d
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 != 0) goto L39
            boolean r3 = super.c0(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d java.lang.NullPointerException -> L22
            goto L39
        L1d:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L2f
        L22:
            r8 = move-exception
            java.lang.String r1 = "!!MMEditText NullPointerException %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1, r8)
            return r2
        L2d:
            r3 = move-exception
            r4 = r2
        L2f:
            java.lang.String r5 = "!!MMEditText IndexOutOfBoundsException %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r5, r3)
            r3 = r4
        L39:
            if (r8 != r1) goto L77
            r7.M2 = r2
            android.text.Editable r8 = r7.mo81602xfb85ada3()
            java.lang.String r8 = r8.toString()
            r7.z0(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L49
            goto L77
        L49:
            r1 = move-exception
            int r2 = r7.M2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r4 = "!!MMEditText Exception %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r4, r2)
            int r0 = r7.M2
            r2 = 3
            if (r0 >= r2) goto L76
            int r0 = r7.M2
            int r0 = r0 + 1
            r7.M2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.z0(r8)
            goto L77
        L76:
            throw r1
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22662x5b8d7ea8.c0(int):boolean");
    }

    @Override // fl5.i
    public void d(boolean z17) {
    }

    @Override // fl5.i
    /* renamed from: destroy */
    public void mo81351x5cd39ffa() {
    }

    @Override // fl5.i
    public boolean e() {
        return this.I2;
    }

    @Override // fl5.i
    public void f() {
    }

    @Override // fl5.i
    /* renamed from: getInputConnection */
    public android.view.inputmethod.InputConnection mo81352x6a67d012() {
        return this.G2;
    }

    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    @Override // fl5.i
    /* renamed from: getSelectHelper */
    public nl5.s0 mo81353xc6fc1640() {
        return null;
    }

    @Override // fl5.i
    public qa5.g getSizeAnimController() {
        int i17 = qa5.g.f442652a;
        return qa5.e.f442651a;
    }

    @Override // fl5.i
    public android.view.View j() {
        return this;
    }

    @Override // fl5.i
    public android.view.View l() {
        return this;
    }

    @Override // fl5.i
    public void m(boolean z17) {
    }

    @Override // fl5.i
    public void n(java.lang.String str) {
        android.text.InputFilter[] m81641xadddfc5;
        int d17 = pg5.d.d(getContext(), mo81602xfb85ada3().toString(), m81687x6f2c472c());
        int d18 = pg5.d.d(getContext(), mo81602xfb85ada3().toString(), m81686xffd93625());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(mo81602xfb85ada3());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(stringBuffer.substring(0, d17));
        sb6.append(str);
        sb6.append(stringBuffer.substring(d18, stringBuffer.length()));
        java.lang.String sb7 = sb6.toString();
        int i17 = -1;
        if (fp.h.c(21) && (m81641xadddfc5 = m81641xadddfc5()) != null) {
            for (android.text.InputFilter inputFilter : m81641xadddfc5) {
                if (inputFilter instanceof android.text.InputFilter.LengthFilter) {
                    i17 = ((android.text.InputFilter.LengthFilter) inputFilter).getMax();
                }
            }
        }
        int length = d17 + str.length();
        if (i17 <= 0 || length <= i17) {
            m81790x765074af(pg5.d.a(getContext(), sb7));
            mo81549xf579a34a(length);
        }
    }

    @Override // fl5.i
    public void o() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[DONT_GENERATE, FINALLY_INSNS, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(java.lang.CharSequence r2, android.widget.TextView.BufferType r3, boolean r4, int r5) {
        /*
            r1 = this;
            super.o0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4
            goto L42
        L4:
            r2 = move-exception
            java.lang.String r3 = r1.m81547x91aec0bb()
            java.lang.String r4 = "[setText] text:%s, e:%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r2}
            java.lang.String r0 = "MicroMsg.MMCustomEditText"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r4, r5)
            fl5.a r4 = r1.P2
            if (r4 == 0) goto L21
            fl5.a r4 = r1.P2
            java.lang.String r5 = "setText"
            fl5.m r4 = (fl5.m) r4
            r4.a(r2, r3, r5)
        L21:
            r3 = 3
            fl5.b.a(r3)
            int r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h
            r4 = 788529167(0x2f00000f, float:1.1641553E-10)
            r5 = 0
            r0 = 1
            if (r3 == r4) goto L36
            r4 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r3 != r4) goto L34
            goto L36
        L34:
            r3 = r5
            goto L37
        L36:
            r3 = r0
        L37:
            if (r3 != 0) goto L3f
            boolean r3 = z65.c.a()
            if (r3 == 0) goto L40
        L3f:
            r5 = r0
        L40:
            if (r5 != 0) goto L43
        L42:
            return
        L43:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22662x5b8d7ea8.o0(java.lang.CharSequence, android.widget.TextView$BufferType, boolean, int):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.H2) {
            editorInfo.imeOptions &= -1073741825;
            editorInfo.inputType &= -131073;
        }
        if (editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new android.os.Bundle();
            }
            editorInfo.extras.putInt("SUPPORT_SOGOU_EXPRESSION", 1);
        }
        if (onCreateInputConnection != null) {
            onCreateInputConnection = new fl5.k(this, onCreateInputConnection, true);
        }
        this.G2 = onCreateInputConnection;
        return onCreateInputConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[DONT_GENERATE, FINALLY_INSNS, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)     // Catch: java.lang.Throwable -> L4
            goto L42
        L4:
            r5 = move-exception
            java.lang.String r0 = r4.m81547x91aec0bb()
            java.lang.String r1 = "[onDraw] text:%s, e:%s"
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r5}
            java.lang.String r3 = "MicroMsg.MMCustomEditText"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1, r2)
            fl5.a r1 = r4.P2
            if (r1 == 0) goto L21
            fl5.a r1 = r4.P2
            java.lang.String r2 = "onDraw"
            fl5.m r1 = (fl5.m) r1
            r1.a(r5, r0, r2)
        L21:
            r0 = 2
            fl5.b.a(r0)
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h
            r1 = 788529167(0x2f00000f, float:1.1641553E-10)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L36
            r1 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r0 != r1) goto L34
            goto L36
        L34:
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            if (r0 != 0) goto L3f
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L40
        L3f:
            r2 = r3
        L40:
            if (r2 != 0) goto L43
        L42:
            return
        L43:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22662x5b8d7ea8.onDraw(android.graphics.Canvas):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22664x9cc02e6d, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View
    public boolean onKeyPreIme(int i17, android.view.KeyEvent keyEvent) {
        if (this.N2 != null && i17 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.N2.a();
                    android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    }
                    return true;
                }
            }
        }
        al5.q1 q1Var = this.O2;
        if (q1Var == null || !((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.w1) q1Var).a(i17, keyEvent)) {
            return super.onKeyPreIme(i17, keyEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[DONT_GENERATE, FINALLY_INSNS, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            super.onMeasure(r4, r5)     // Catch: java.lang.Throwable -> L4
            goto L42
        L4:
            r4 = move-exception
            java.lang.String r5 = r3.m81547x91aec0bb()
            java.lang.String r0 = "[onMeasure] text:%s, e:%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r4}
            java.lang.String r2 = "MicroMsg.MMCustomEditText"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0, r1)
            fl5.a r0 = r3.P2
            if (r0 == 0) goto L21
            fl5.a r0 = r3.P2
            java.lang.String r1 = "onMeasure"
            fl5.m r0 = (fl5.m) r0
            r0.a(r4, r5, r1)
        L21:
            r5 = 1
            fl5.b.a(r5)
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h
            r1 = 788529167(0x2f00000f, float:1.1641553E-10)
            r2 = 0
            if (r0 == r1) goto L35
            r1 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r0 != r1) goto L33
            goto L35
        L33:
            r0 = r2
            goto L36
        L35:
            r0 = r5
        L36:
            if (r0 != 0) goto L40
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            r5 = r2
        L40:
            if (r5 != 0) goto L43
        L42:
            return
        L43:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22662x5b8d7ea8.onMeasure(int, int):void");
    }

    @Override // fl5.i
    /* renamed from: onPause */
    public void mo81355xb01dfb57() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        try {
            super.onPreDraw();
            return true;
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCustomEditText", "onPreDraw err:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            fl5.b.a(8);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (java.lang.Throwable th6) {
            java.lang.String m81547x91aec0bb = m81547x91aec0bb();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCustomEditText", "[onTouchEvent] text:%s, e:%s", m81547x91aec0bb, th6);
            if (this.P2 != null) {
                ((fl5.m) this.P2).a(th6, m81547x91aec0bb, "onTouchEvent");
            }
            fl5.b.a(4);
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            boolean z17 = true;
            if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
                z17 = false;
            }
            if (z17) {
                throw th6;
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i17, android.graphics.Rect rect) {
        try {
            return super.requestFocus(i17, rect);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCustomEditText", "[requestFocus] error:%s", e17);
            return false;
        }
    }

    @Override // fl5.i
    /* renamed from: setBackListener */
    public void mo81357xb8fce43d(al5.n1 n1Var) {
        this.N2 = n1Var;
    }

    /* renamed from: setEditCrashListener */
    public void m81548xe337eb4f(fl5.a aVar) {
        this.P2 = aVar;
    }

    @Override // fl5.i
    /* renamed from: setEnableSendBtn */
    public void mo81358x8f2956f(boolean z17) {
        this.H2 = z17;
    }

    @Override // fl5.i
    /* renamed from: setImeSendImageCallback */
    public void mo81359xbbee6dd9(fl5.e eVar) {
        this.J2 = eVar;
    }

    @Override // fl5.i
    /* renamed from: setInputListener */
    public void mo81360xbf01395c(fl5.f fVar) {
        this.L2 = fVar;
    }

    @Override // fl5.i
    /* renamed from: setKeyCodeEnterListener */
    public void mo81361xf1ab59a2(al5.q1 q1Var) {
        this.O2 = q1Var;
    }

    @Override // fl5.i
    /* renamed from: setOnMsgPasteListener */
    public void mo81362x7fcf1e67(fl5.c cVar) {
        this.K2 = cVar;
    }

    /* renamed from: setPasterLen */
    public void mo70738x2526cb14(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22667x7baecd08, fl5.i
    /* renamed from: setSelection */
    public void mo81549xf579a34a(int i17) {
        try {
            super.mo81549xf579a34a(i17);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCustomEditText", e17, "IndexOutOfBoundsExceptionindex = " + i17, new java.lang.Object[0]);
        }
    }

    @Override // fl5.i
    /* renamed from: setSelectionChangedListener */
    public void mo81363xda276ede(fl5.h hVar) {
    }

    public void z0(java.lang.String str) {
        int m81687x6f2c472c = m81687x6f2c472c();
        m81790x765074af(pg5.d.b(str, false));
        int length = mo81602xfb85ada3().length() - str.length();
        if (length <= 0) {
            mo81549xf579a34a(m81687x6f2c472c);
            return;
        }
        int i17 = m81687x6f2c472c + length;
        if (i17 <= mo81602xfb85ada3().length()) {
            mo81549xf579a34a(i17);
        }
    }

    public C22662x5b8d7ea8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H2 = false;
        this.I2 = false;
        this.M2 = 0;
        this.Q2 = null;
    }
}
