package aa3;

/* loaded from: classes9.dex */
public final class x0 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4, android.text.TextWatcher, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f84143t = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f84144d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f84145e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f84146f;

    /* renamed from: g, reason: collision with root package name */
    public aa3.z0 f84147g;

    /* renamed from: h, reason: collision with root package name */
    public long f84148h;

    /* renamed from: i, reason: collision with root package name */
    public int f84149i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f84150m;

    /* renamed from: n, reason: collision with root package name */
    public aa3.y0 f84151n;

    /* renamed from: o, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f84152o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f84153p;

    /* renamed from: q, reason: collision with root package name */
    public int f84154q;

    /* renamed from: r, reason: collision with root package name */
    public int f84155r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f84156s;

    public x0(android.content.Context context) {
        super(context);
        this.f84147g = aa3.z0.f84163d;
        this.f84155r = 6;
        setId(com.p314xaae8f345.mm.R.id.pyp);
        setOrientation(1);
        setVisibility(4);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359(getContext());
        this.f84152o = c28001xdd2bb359;
        c28001xdd2bb359.setImeOptions(6);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f84152o;
        if (c28001xdd2bb3592 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        c28001xdd2bb3592.setInputType(128);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3593 = this.f84152o;
        if (c28001xdd2bb3593 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        c28001xdd2bb3593.setMovementMethod(null);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3594 = this.f84152o;
        if (c28001xdd2bb3594 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        c28001xdd2bb3594.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3595 = this.f84152o;
        if (c28001xdd2bb3595 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        c28001xdd2bb3595.m121628xbc8182be(true, true);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3596 = this.f84152o;
        if (c28001xdd2bb3596 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        c28001xdd2bb3596.setImportantForAccessibility(2);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3597 = this.f84152o;
        if (c28001xdd2bb3597 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        c28001xdd2bb3597.m121612x9178f615(aa3.w0.f84141a);
        u();
        w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if ((r0.length() == 0) != false) goto L9;
     */
    /* renamed from: getEncryptPassword */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m918xcaa6edea() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f84144d
            java.lang.Long r1 = r7.f84145e
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
            java.lang.String r0 = r7.m921xf013a9b9()
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
            aa3.z0 r4 = r7.f84147g
            r3.append(r4)
            java.lang.String r4 = ", encryptNonce:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", encryptTimestamp:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.LiteAppSafePasswordKeyboardPanel"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
            aa3.z0 r3 = r7.f84147g
            int r3 = r3.ordinal()
            r4 = 0
            java.lang.String r5 = "tenpaySecureEditText"
            java.lang.String r6 = "getEncryptPassword(...)"
            if (r3 == 0) goto L7b
            if (r3 == r2) goto L65
            java.lang.String r0 = ""
            goto L8c
        L65:
            com.tenpay.android.wechat.TenpaySecureEditText r2 = r7.f84152o
            if (r2 == 0) goto L77
            com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode r3 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.SM2_WITH_PBKDF2
            long r4 = r1.longValue()
            java.lang.String r0 = r2.m121599xcaa6edea(r3, r4, r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r6)
            goto L8c
        L77:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r5)
            throw r4
        L7b:
            com.tenpay.android.wechat.TenpaySecureEditText r2 = r7.f84152o
            if (r2 == 0) goto L8d
            com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode r3 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.SM2_WITH_MD5
            long r4 = r1.longValue()
            java.lang.String r0 = r2.m121599xcaa6edea(r3, r4, r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r6)
        L8c:
            return r0
        L8d:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aa3.x0.m918xcaa6edea():java.lang.String");
    }

    /* renamed from: getHKEncryptPassword */
    private final org.json.JSONObject m919xd8ca8c07() {
        java.lang.String str = "";
        if (this.f84144d == null || this.f84145e == null || this.f84146f == null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("code", -1);
            jSONObject.put("encryptPassword", "");
            jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "invalid params, please check extra-data required field[pwdNonce、pwdTimestamp、pwdSoftSalt]");
            return jSONObject;
        }
        int ordinal = this.f84147g.ordinal();
        if (ordinal == 2) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f84152o;
            if (c28001xdd2bb359 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
                throw null;
            }
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode hKSoftEncryMode = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode.HKSOFT_RSA2048_WITH_MD5;
            java.lang.Long l17 = this.f84145e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            str = c28001xdd2bb359.m121600xf456eafd(hKSoftEncryMode, l17.longValue(), this.f84144d, this.f84146f);
        } else if (ordinal == 3) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f84152o;
            if (c28001xdd2bb3592 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
                throw null;
            }
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode hKSoftEncryMode2 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode.HKSOFT_RSA2048_WITH_PBKDF2;
            java.lang.Long l18 = this.f84145e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
            str = c28001xdd2bb3592.m121600xf456eafd(hKSoftEncryMode2, l18.longValue(), this.f84144d, this.f84146f);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("encryptPassword", str);
        return jSONObject2;
    }

    /* renamed from: getPasswordHash */
    private final java.lang.String m920x82b9bcbf() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f84152o;
        if (c28001xdd2bb359 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        java.lang.String m121602x82b9bcbf = c28001xdd2bb359.m121602x82b9bcbf();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m121602x82b9bcbf, "getPasswordHash(...)");
        return m121602x82b9bcbf;
    }

    /* renamed from: getSaltTime */
    private final java.lang.String m921xf013a9b9() {
        return java.lang.String.valueOf((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_use_safe_time, 0) == 0 ? c01.id.c() : c01.id.a()) / 1000);
    }

    /* renamed from: setHideOverlayWindows */
    private final void m922x30c7adf7(boolean z17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lite_app_safe_keyboard_revert_overlay_hidden, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setHideOverlayWindows ignoreOverlay");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                if (b3.l.m9698x3fed0563(getContext(), "android.permission.HIDE_OVERLAY_WINDOWS") != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "no permission");
                    jx3.f.INSTANCE.mo68478xbd3cda5f(28867, "100");
                } else {
                    android.content.Context context = getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((android.app.Activity) context).getWindow().setHideOverlayWindows(z17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppSafePasswordKeyboardPanel", e17, "", new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: setInputEventReceiver */
    private final <_InputEventReceiver extends nl1.b> void m923x9a97bb01(_InputEventReceiver _inputeventreceiver) {
        this.f84153p = _inputeventreceiver != null ? _inputeventreceiver.a() : null;
    }

    /* renamed from: setPasswordLength */
    private final void m924x8a3d7663(int i17) {
        this.f84155r = i17;
        u();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        v();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    /* renamed from: getAppUuid */
    public final long m925xe7b2546() {
        return this.f84148h;
    }

    /* renamed from: getForceLightMode */
    public final boolean m926x5a99e224() {
        return this.f84150m;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return 0;
    }

    /* renamed from: getNodeId */
    public final int m927x271761b3() {
        return this.f84149i;
    }

    /* renamed from: getPwdEncryptMode */
    public final aa3.z0 m928x18546f21() {
        return this.f84147g;
    }

    /* renamed from: getPwdNonce */
    public final java.lang.String m929x34875028() {
        return this.f84144d;
    }

    /* renamed from: getPwdSoftSalt */
    public final java.lang.String m930xc930d4c7() {
        return this.f84146f;
    }

    /* renamed from: getPwdTimestamp */
    public final java.lang.Long m931xdc657ccf() {
        return this.f84145e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f84150m) {
            return;
        }
        aa3.y0 y0Var = this.f84151n;
        if (y0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboard");
            throw null;
        }
        removeView(y0Var);
        w();
        if (this.f84150m) {
            aa3.y0 y0Var2 = this.f84151n;
            if (y0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboard");
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

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent
    /* renamed from: onKeyboardActionGetInputLength */
    public int mo932x4ec7d5f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "keyboard action");
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f84152o;
        if (c28001xdd2bb359 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        if (c28001xdd2bb359 != null) {
            return c28001xdd2bb359.m121601xbad2461a();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
        throw null;
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent
    /* renamed from: onKeyboardActionWithCode */
    public void mo933xa7cba4af(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "keyboard action");
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f84152o;
        if (c28001xdd2bb359 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.m121603xafd50d1e(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.x0.c(this);
    }

    /* renamed from: setActivitySecure */
    public final void m934x26b5a868(boolean z17) {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kinda_secure_page_flag, 1) != 1) {
            return;
        }
        if (z17) {
            boolean z18 = (activity.getWindow().getAttributes().flags & 8192) != 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setActivitySecure isSecure %b", java.lang.Boolean.valueOf(z18));
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setActivitySecure add secure flag");
                activity.getWindow().addFlags(8192);
                this.f84156s = true;
            }
        } else if (this.f84156s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setActivitySecure clear secure flag");
            activity.getWindow().clearFlags(8192);
            this.f84156s = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setHideOverlayWindows: true");
            m922x30c7adf7(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "setHideOverlayWindows: false");
            m922x30c7adf7(false);
        }
    }

    /* renamed from: setAppUuid */
    public final void m935x81ec72ba(long j17) {
        this.f84148h = j17;
    }

    /* renamed from: setForceLightMode */
    public final void m936x22904a30(boolean z17) {
        this.f84150m = z17;
        if (z17) {
            aa3.y0 y0Var = this.f84151n;
            if (y0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboard");
                throw null;
            }
            y0Var.a();
            x();
        }
    }

    /* renamed from: setNodeId */
    public final void m937x1a4c95bf(int i17) {
        this.f84149i = i17;
    }

    /* renamed from: setPwdEncryptMode */
    public final void m938xe04ad72d(aa3.z0 z0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z0Var, "<set-?>");
        this.f84147g = z0Var;
    }

    /* renamed from: setPwdNonce */
    public final void m939x2f3fb134(java.lang.String str) {
        this.f84144d = str;
    }

    /* renamed from: setPwdSoftSalt */
    public final void m940x5f96483b(java.lang.String str) {
        this.f84146f = str;
    }

    /* renamed from: setPwdTimestamp */
    public final void m941x12ae77db(java.lang.Long l17) {
        this.f84145e = l17;
    }

    public final void u() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f84152o;
        if (c28001xdd2bb359 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        c28001xdd2bb359.m121634xb4bfea41(this.f84155r);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f84152o;
        if (c28001xdd2bb3592 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        android.text.InputFilter[] filters = c28001xdd2bb3592.getFilters();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filters, "getFilters(...)");
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
        android.text.InputFilter.LengthFilter lengthFilter = new android.text.InputFilter.LengthFilter(this.f84155r);
        if (i17 >= 0) {
            arrayList.set(i17, lengthFilter);
        } else {
            arrayList.add(lengthFilter);
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3593 = this.f84152o;
        if (c28001xdd2bb3593 != null) {
            c28001xdd2bb3593.setFilters((android.text.InputFilter[]) C0.toArray(new android.text.InputFilter[0]));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
    }

    public final void v() {
        int i17 = this.f84154q;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f84152o;
        if (c28001xdd2bb359 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        boolean z17 = true;
        if (i17 < c28001xdd2bb359.m121601xbad2461a()) {
            android.view.inputmethod.InputConnection inputConnection = this.f84153p;
            if (inputConnection != null) {
                inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 17));
            }
            android.view.inputmethod.InputConnection inputConnection2 = this.f84153p;
            if (inputConnection2 != null) {
                inputConnection2.sendKeyEvent(new android.view.KeyEvent(1, 17));
            }
        } else {
            android.view.inputmethod.InputConnection inputConnection3 = this.f84153p;
            if (inputConnection3 != null) {
                inputConnection3.sendKeyEvent(new android.view.KeyEvent(0, 67));
            }
            android.view.inputmethod.InputConnection inputConnection4 = this.f84153p;
            if (inputConnection4 != null) {
                inputConnection4.sendKeyEvent(new android.view.KeyEvent(1, 67));
            }
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f84152o;
        if (c28001xdd2bb3592 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        this.f84154q = c28001xdd2bb3592.m121601xbad2461a();
        int i18 = this.f84155r;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3593 = this.f84152o;
        if (c28001xdd2bb3593 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        if (i18 != c28001xdd2bb3593.m121601xbad2461a() || this.f84148h == 0 || this.f84149i == 0) {
            return;
        }
        aa3.z0 z0Var = this.f84147g;
        if (z0Var != aa3.z0.f84165f && z0Var != aa3.z0.f84166g) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordKeyboardPanel", "useHKPasswordMode encryptMode=" + this.f84147g);
            org.json.JSONObject m919xd8ca8c07 = m919xd8ca8c07();
            m919xd8ca8c07.putOpt("passwordHash", m920x82b9bcbf());
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65427x4a281bfe(this.f84148h, this.f84149i, "safe-password-input-complete", m919xd8ca8c07);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String m918xcaa6edea = m918xcaa6edea();
        java.lang.String m920x82b9bcbf = m920x82b9bcbf();
        jSONObject.putOpt("encryptPassword", m918xcaa6edea);
        jSONObject.putOpt("passwordHash", m920x82b9bcbf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65427x4a281bfe(this.f84148h, this.f84149i, "safe-password-input-complete", jSONObject);
    }

    public final void w() {
        setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        aa3.y0 y0Var = new aa3.y0(context);
        this.f84151n = y0Var;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f84152o;
        if (c28001xdd2bb359 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
            throw null;
        }
        y0Var.m121469xce4186ff(c28001xdd2bb359);
        x();
        int i17 = android.os.Build.VERSION.SDK_INT;
        aa3.u0 u0Var = new aa3.u0(true);
        aa3.y0 y0Var2 = this.f84151n;
        if (y0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboard");
            throw null;
        }
        y0Var2.m121472x2408cb55(u0Var);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_password_edittext_event_v2, false)) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f84152o;
            if (c28001xdd2bb3592 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
                throw null;
            }
            c28001xdd2bb3592.m121621x9f0931e9(false);
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3593 = this.f84152o;
            if (c28001xdd2bb3593 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
                throw null;
            }
            c28001xdd2bb3593.addTextChangedListener(this);
        } else {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3594 = this.f84152o;
            if (c28001xdd2bb3594 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
                throw null;
            }
            c28001xdd2bb3594.m121621x9f0931e9(true);
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3595 = this.f84152o;
            if (c28001xdd2bb3595 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tenpaySecureEditText");
                throw null;
            }
            c28001xdd2bb3595.m121633xbee2612e(new aa3.v0(this));
            aa3.y0 y0Var3 = this.f84151n;
            if (y0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboard");
                throw null;
            }
            y0Var3.m121474x464d4781(this);
        }
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context2;
        android.view.WindowInsets b17 = com.p314xaae8f345.mm.ui.qk.b(activity);
        int c17 = (i17 < 30 || b17 == null) ? com.p314xaae8f345.mm.ui.bl.c(activity) : b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i65.a.b(getContext(), -2));
        layoutParams.setMargins(0, 0, 0, c17);
        android.view.View view = this.f84151n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboard");
            throw null;
        }
        addView(view, layoutParams);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lite_app_safe_keyboard_revert_delegate_mode, false);
        aa3.y0 y0Var4 = this.f84151n;
        if (y0Var4 != null) {
            y0Var4.m121475xbbc48ac4(!fj6);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboard");
            throw null;
        }
    }

    public final void x() {
        aa3.y0 y0Var = this.f84151n;
        if (y0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboard");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) y0Var.findViewById(getContext().getResources().getIdentifier("tenpay_keyboard_x", dm.i4.f66865x76d1ec5a, getContext().getPackageName()));
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
        m923x9a97bb01(bVar);
        setVisibility(0);
        m934x26b5a868(true);
    }
}
