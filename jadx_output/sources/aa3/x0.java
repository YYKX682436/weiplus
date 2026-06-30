package aa3;

/* loaded from: classes9.dex */
public final class x0 extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.widget.input.u4, android.text.TextWatcher, com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f2610t = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f2611d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f2612e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f2613f;

    /* renamed from: g, reason: collision with root package name */
    public aa3.z0 f2614g;

    /* renamed from: h, reason: collision with root package name */
    public long f2615h;

    /* renamed from: i, reason: collision with root package name */
    public int f2616i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2617m;

    /* renamed from: n, reason: collision with root package name */
    public aa3.y0 f2618n;

    /* renamed from: o, reason: collision with root package name */
    public com.tenpay.android.wechat.TenpaySecureEditText f2619o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f2620p;

    /* renamed from: q, reason: collision with root package name */
    public int f2621q;

    /* renamed from: r, reason: collision with root package name */
    public int f2622r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2623s;

    public x0(android.content.Context context) {
        super(context);
        this.f2614g = aa3.z0.f2630d;
        this.f2622r = 6;
        setId(com.tencent.mm.R.id.pyp);
        setOrientation(1);
        setVisibility(4);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = new com.tenpay.android.wechat.TenpaySecureEditText(getContext());
        this.f2619o = tenpaySecureEditText;
        tenpaySecureEditText.setImeOptions(6);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f2619o;
        if (tenpaySecureEditText2 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        tenpaySecureEditText2.setInputType(128);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText3 = this.f2619o;
        if (tenpaySecureEditText3 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        tenpaySecureEditText3.setMovementMethod(null);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText4 = this.f2619o;
        if (tenpaySecureEditText4 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        tenpaySecureEditText4.setBackgroundResource(com.tencent.mm.R.color.a9e);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText5 = this.f2619o;
        if (tenpaySecureEditText5 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        tenpaySecureEditText5.setIsPasswordFormat(true, true);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText6 = this.f2619o;
        if (tenpaySecureEditText6 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        tenpaySecureEditText6.setImportantForAccessibility(2);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText7 = this.f2619o;
        if (tenpaySecureEditText7 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        tenpaySecureEditText7.set993EnvCallBackListener(aa3.w0.f2608a);
        u();
        w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if ((r0.length() == 0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getEncryptPassword() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f2611d
            java.lang.Long r1 = r7.f2612e
            r2 = 1
            if (r0 == 0) goto L12
            int r3 = r0.length()
            if (r3 != 0) goto Lf
            r3 = r2
            goto L10
        Lf:
            r3 = 0
        L10:
            if (r3 == 0) goto L16
        L12:
            java.lang.String r0 = r7.getSaltTime()
        L16:
            if (r1 == 0) goto L22
            r3 = 0
            long r5 = r1.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L2d
        L22:
            long r3 = c01.id.a()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
        L2d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getEncryptPassword, pwdEncryptMode:"
            r3.<init>(r4)
            aa3.z0 r4 = r7.f2614g
            r3.append(r4)
            java.lang.String r4 = ", encryptNonce:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", encryptTimestamp:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.LiteAppSafePasswordKeyboardPanel"
            com.tencent.mars.xlog.Log.i(r4, r3)
            aa3.z0 r3 = r7.f2614g
            int r3 = r3.ordinal()
            r4 = 0
            java.lang.String r5 = "tenpaySecureEditText"
            java.lang.String r6 = "getEncryptPassword(...)"
            if (r3 == 0) goto L7b
            if (r3 == r2) goto L65
            java.lang.String r0 = ""
            goto L8c
        L65:
            com.tenpay.android.wechat.TenpaySecureEditText r2 = r7.f2619o
            if (r2 == 0) goto L77
            com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode r3 = com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.SM2_WITH_PBKDF2
            long r4 = r1.longValue()
            java.lang.String r0 = r2.getEncryptPassword(r3, r4, r0)
            kotlin.jvm.internal.o.f(r0, r6)
            goto L8c
        L77:
            kotlin.jvm.internal.o.o(r5)
            throw r4
        L7b:
            com.tenpay.android.wechat.TenpaySecureEditText r2 = r7.f2619o
            if (r2 == 0) goto L8d
            com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode r3 = com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.SM2_WITH_MD5
            long r4 = r1.longValue()
            java.lang.String r0 = r2.getEncryptPassword(r3, r4, r0)
            kotlin.jvm.internal.o.f(r0, r6)
        L8c:
            return r0
        L8d:
            kotlin.jvm.internal.o.o(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aa3.x0.getEncryptPassword():java.lang.String");
    }

    private final org.json.JSONObject getHKEncryptPassword() {
        java.lang.String str = "";
        if (this.f2611d == null || this.f2612e == null || this.f2613f == null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("code", -1);
            jSONObject.put("encryptPassword", "");
            jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "invalid params, please check extra-data required field[pwdNonce、pwdTimestamp、pwdSoftSalt]");
            return jSONObject;
        }
        int ordinal = this.f2614g.ordinal();
        if (ordinal == 2) {
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f2619o;
            if (tenpaySecureEditText == null) {
                kotlin.jvm.internal.o.o("tenpaySecureEditText");
                throw null;
            }
            com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode hKSoftEncryMode = com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_MD5;
            java.lang.Long l17 = this.f2612e;
            kotlin.jvm.internal.o.d(l17);
            str = tenpaySecureEditText.getHKSoftEncryptPassword(hKSoftEncryMode, l17.longValue(), this.f2611d, this.f2613f);
        } else if (ordinal == 3) {
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f2619o;
            if (tenpaySecureEditText2 == null) {
                kotlin.jvm.internal.o.o("tenpaySecureEditText");
                throw null;
            }
            com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode hKSoftEncryMode2 = com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_PBKDF2;
            java.lang.Long l18 = this.f2612e;
            kotlin.jvm.internal.o.d(l18);
            str = tenpaySecureEditText2.getHKSoftEncryptPassword(hKSoftEncryMode2, l18.longValue(), this.f2611d, this.f2613f);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("encryptPassword", str);
        return jSONObject2;
    }

    private final java.lang.String getPasswordHash() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f2619o;
        if (tenpaySecureEditText == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        java.lang.String passwordHash = tenpaySecureEditText.getPasswordHash();
        kotlin.jvm.internal.o.f(passwordHash, "getPasswordHash(...)");
        return passwordHash;
    }

    private final java.lang.String getSaltTime() {
        return java.lang.String.valueOf((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_use_safe_time, 0) == 0 ? c01.id.c() : c01.id.a()) / 1000);
    }

    private final void setHideOverlayWindows(boolean z17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lite_app_safe_keyboard_revert_overlay_hidden, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setHideOverlayWindows ignoreOverlay");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                if (b3.l.checkSelfPermission(getContext(), "android.permission.HIDE_OVERLAY_WINDOWS") != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "no permission");
                    jx3.f.INSTANCE.kvStat(28867, "100");
                } else {
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((android.app.Activity) context).getWindow().setHideOverlayWindows(z17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppSafePasswordKeyboardPanel", e17, "", new java.lang.Object[0]);
            }
        }
    }

    private final <_InputEventReceiver extends nl1.b> void setInputEventReceiver(_InputEventReceiver _inputeventreceiver) {
        this.f2620p = _inputeventreceiver != null ? _inputeventreceiver.a() : null;
    }

    private final void setPasswordLength(int i17) {
        this.f2622r = i17;
        u();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        v();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    public final long getAppUuid() {
        return this.f2615h;
    }

    public final boolean getForceLightMode() {
        return this.f2617m;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return 0;
    }

    public final int getNodeId() {
        return this.f2616i;
    }

    public final aa3.z0 getPwdEncryptMode() {
        return this.f2614g;
    }

    public final java.lang.String getPwdNonce() {
        return this.f2611d;
    }

    public final java.lang.String getPwdSoftSalt() {
        return this.f2613f;
    }

    public final java.lang.Long getPwdTimestamp() {
        return this.f2612e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2617m) {
            return;
        }
        aa3.y0 y0Var = this.f2618n;
        if (y0Var == null) {
            kotlin.jvm.internal.o.o("keyboard");
            throw null;
        }
        removeView(y0Var);
        w();
        if (this.f2617m) {
            aa3.y0 y0Var2 = this.f2618n;
            if (y0Var2 == null) {
                kotlin.jvm.internal.o.o("keyboard");
                throw null;
            }
            y0Var2.a();
            x();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent
    public int onKeyboardActionGetInputLength() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "keyboard action");
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f2619o;
        if (tenpaySecureEditText == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getInputLength();
        }
        kotlin.jvm.internal.o.o("tenpaySecureEditText");
        throw null;
    }

    @Override // com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent
    public void onKeyboardActionWithCode(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "keyboard action");
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f2619o;
        if (tenpaySecureEditText == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.handlePwdKeyBoardEvent(i17);
        } else {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.x0.c(this);
    }

    public final void setActivitySecure(boolean z17) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kinda_secure_page_flag, 1) != 1) {
            return;
        }
        if (z17) {
            boolean z18 = (activity.getWindow().getAttributes().flags & 8192) != 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setActivitySecure isSecure %b", java.lang.Boolean.valueOf(z18));
            if (!z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setActivitySecure add secure flag");
                activity.getWindow().addFlags(8192);
                this.f2623s = true;
            }
        } else if (this.f2623s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setActivitySecure clear secure flag");
            activity.getWindow().clearFlags(8192);
            this.f2623s = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setHideOverlayWindows: true");
            setHideOverlayWindows(true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setHideOverlayWindows: false");
            setHideOverlayWindows(false);
        }
    }

    public final void setAppUuid(long j17) {
        this.f2615h = j17;
    }

    public final void setForceLightMode(boolean z17) {
        this.f2617m = z17;
        if (z17) {
            aa3.y0 y0Var = this.f2618n;
            if (y0Var == null) {
                kotlin.jvm.internal.o.o("keyboard");
                throw null;
            }
            y0Var.a();
            x();
        }
    }

    public final void setNodeId(int i17) {
        this.f2616i = i17;
    }

    public final void setPwdEncryptMode(aa3.z0 z0Var) {
        kotlin.jvm.internal.o.g(z0Var, "<set-?>");
        this.f2614g = z0Var;
    }

    public final void setPwdNonce(java.lang.String str) {
        this.f2611d = str;
    }

    public final void setPwdSoftSalt(java.lang.String str) {
        this.f2613f = str;
    }

    public final void setPwdTimestamp(java.lang.Long l17) {
        this.f2612e = l17;
    }

    public final void u() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f2619o;
        if (tenpaySecureEditText == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        tenpaySecureEditText.setPwdLength(this.f2622r);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f2619o;
        if (tenpaySecureEditText2 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        android.text.InputFilter[] filters = tenpaySecureEditText2.getFilters();
        kotlin.jvm.internal.o.f(filters, "getFilters(...)");
        java.util.List C0 = kz5.z.C0(filters);
        java.util.ArrayList arrayList = (java.util.ArrayList) C0;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (((android.text.InputFilter) it.next()) instanceof android.text.InputFilter.LengthFilter) {
                break;
            } else {
                i17++;
            }
        }
        android.text.InputFilter.LengthFilter lengthFilter = new android.text.InputFilter.LengthFilter(this.f2622r);
        if (i17 >= 0) {
            arrayList.set(i17, lengthFilter);
        } else {
            arrayList.add(lengthFilter);
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText3 = this.f2619o;
        if (tenpaySecureEditText3 != null) {
            tenpaySecureEditText3.setFilters((android.text.InputFilter[]) C0.toArray(new android.text.InputFilter[0]));
        } else {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
    }

    public final void v() {
        int i17 = this.f2621q;
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f2619o;
        if (tenpaySecureEditText == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        boolean z17 = true;
        if (i17 < tenpaySecureEditText.getInputLength()) {
            android.view.inputmethod.InputConnection inputConnection = this.f2620p;
            if (inputConnection != null) {
                inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 17));
            }
            android.view.inputmethod.InputConnection inputConnection2 = this.f2620p;
            if (inputConnection2 != null) {
                inputConnection2.sendKeyEvent(new android.view.KeyEvent(1, 17));
            }
        } else {
            android.view.inputmethod.InputConnection inputConnection3 = this.f2620p;
            if (inputConnection3 != null) {
                inputConnection3.sendKeyEvent(new android.view.KeyEvent(0, 67));
            }
            android.view.inputmethod.InputConnection inputConnection4 = this.f2620p;
            if (inputConnection4 != null) {
                inputConnection4.sendKeyEvent(new android.view.KeyEvent(1, 67));
            }
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f2619o;
        if (tenpaySecureEditText2 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        this.f2621q = tenpaySecureEditText2.getInputLength();
        int i18 = this.f2622r;
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText3 = this.f2619o;
        if (tenpaySecureEditText3 == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        if (i18 != tenpaySecureEditText3.getInputLength() || this.f2615h == 0 || this.f2616i == 0) {
            return;
        }
        aa3.z0 z0Var = this.f2614g;
        if (z0Var != aa3.z0.f2632f && z0Var != aa3.z0.f2633g) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "useHKPasswordMode encryptMode=" + this.f2614g);
            org.json.JSONObject hKEncryptPassword = getHKEncryptPassword();
            hKEncryptPassword.putOpt("passwordHash", getPasswordHash());
            com.tencent.mm.plugin.lite.LiteAppCenter.publishEventToTopPage(this.f2615h, this.f2616i, "safe-password-input-complete", hKEncryptPassword);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String encryptPassword = getEncryptPassword();
        java.lang.String passwordHash = getPasswordHash();
        jSONObject.putOpt("encryptPassword", encryptPassword);
        jSONObject.putOpt("passwordHash", passwordHash);
        com.tencent.mm.plugin.lite.LiteAppCenter.publishEventToTopPage(this.f2615h, this.f2616i, "safe-password-input-complete", jSONObject);
    }

    public final void w() {
        setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_100));
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aa3.y0 y0Var = new aa3.y0(context);
        this.f2618n = y0Var;
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f2619o;
        if (tenpaySecureEditText == null) {
            kotlin.jvm.internal.o.o("tenpaySecureEditText");
            throw null;
        }
        y0Var.setInputEditText(tenpaySecureEditText);
        x();
        int i17 = android.os.Build.VERSION.SDK_INT;
        aa3.u0 u0Var = new aa3.u0(true);
        aa3.y0 y0Var2 = this.f2618n;
        if (y0Var2 == null) {
            kotlin.jvm.internal.o.o("keyboard");
            throw null;
        }
        y0Var2.setSecureAccessibility(u0Var);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_password_edittext_event_v2, false)) {
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f2619o;
            if (tenpaySecureEditText2 == null) {
                kotlin.jvm.internal.o.o("tenpaySecureEditText");
                throw null;
            }
            tenpaySecureEditText2.setIgnoreTextChangeEvent(false);
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText3 = this.f2619o;
            if (tenpaySecureEditText3 == null) {
                kotlin.jvm.internal.o.o("tenpaySecureEditText");
                throw null;
            }
            tenpaySecureEditText3.addTextChangedListener(this);
        } else {
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText4 = this.f2619o;
            if (tenpaySecureEditText4 == null) {
                kotlin.jvm.internal.o.o("tenpaySecureEditText");
                throw null;
            }
            tenpaySecureEditText4.setIgnoreTextChangeEvent(true);
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText5 = this.f2619o;
            if (tenpaySecureEditText5 == null) {
                kotlin.jvm.internal.o.o("tenpaySecureEditText");
                throw null;
            }
            tenpaySecureEditText5.setPasswdInputChangeListener(new aa3.v0(this));
            aa3.y0 y0Var3 = this.f2618n;
            if (y0Var3 == null) {
                kotlin.jvm.internal.o.o("keyboard");
                throw null;
            }
            y0Var3.setUseEditTextEventMode(this);
        }
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context2;
        android.view.WindowInsets b17 = com.tencent.mm.ui.qk.b(activity);
        int c17 = (i17 < 30 || b17 == null) ? com.tencent.mm.ui.bl.c(activity) : b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i65.a.b(getContext(), -2));
        layoutParams.setMargins(0, 0, 0, c17);
        android.view.View view = this.f2618n;
        if (view == null) {
            kotlin.jvm.internal.o.o("keyboard");
            throw null;
        }
        addView(view, layoutParams);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lite_app_safe_keyboard_revert_delegate_mode, false);
        aa3.y0 y0Var4 = this.f2618n;
        if (y0Var4 != null) {
            y0Var4.setUseKeyboardWindowDelegateMode(!fj6);
        } else {
            kotlin.jvm.internal.o.o("keyboard");
            throw null;
        }
    }

    public final void x() {
        aa3.y0 y0Var = this.f2618n;
        if (y0Var == null) {
            kotlin.jvm.internal.o.o("keyboard");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) y0Var.findViewById(getContext().getResources().getIdentifier("tenpay_keyboard_x", dm.i4.COL_ID, getContext().getPackageName()));
        if (textView != null) {
            if (android.text.TextUtils.isEmpty(textView.getText())) {
                textView.setImportantForAccessibility(2);
            } else {
                textView.setImportantForAccessibility(1);
            }
        }
    }

    public final void y(nl1.b bVar) {
        if (bVar == null) {
            return;
        }
        setInputEventReceiver(bVar);
        setVisibility(0);
        setActivitySecure(true);
    }
}
