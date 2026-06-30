package com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569;

/* renamed from: com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView */
/* loaded from: classes9.dex */
public final class ViewOnFocusChangeListenerC22906x9d30fd14 extends android.widget.RelativeLayout implements android.view.View.OnFocusChangeListener, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent {

    /* renamed from: d, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f295676d;

    /* renamed from: e, reason: collision with root package name */
    public int f295677e;

    /* renamed from: f, reason: collision with root package name */
    public final int f295678f;

    /* renamed from: g, reason: collision with root package name */
    public int f295679g;

    /* renamed from: h, reason: collision with root package name */
    public int f295680h;

    /* renamed from: i, reason: collision with root package name */
    public int f295681i;

    /* renamed from: m, reason: collision with root package name */
    public qp5.t f295682m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f295683n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f295684o;

    /* renamed from: p, reason: collision with root package name */
    public long f295685p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f295686q;

    /* renamed from: r, reason: collision with root package name */
    public int f295687r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f295688s;

    public ViewOnFocusChangeListenerC22906x9d30fd14(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f295676d = null;
        this.f295677e = 6;
        this.f295678f = 1;
        this.f295679g = com.p314xaae8f345.mm.R.C30861xcebc809e.f562909rn;
        this.f295680h = 1;
        this.f295682m = null;
        this.f295683n = null;
        this.f295684o = "";
        this.f295685p = 0L;
        this.f295686q = "";
        this.f295687r = 0;
        this.f295688s = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270116f, i17, 0);
        this.f295678f = obtainStyledAttributes.getInteger(3, 1);
        this.f295679g = obtainStyledAttributes.getResourceId(0, com.p314xaae8f345.mm.R.C30861xcebc809e.f562909rn);
        this.f295680h = obtainStyledAttributes.getInteger(1, 1);
        this.f295681i = obtainStyledAttributes.getInteger(2, 1);
        obtainStyledAttributes.recycle();
        b(context);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B());
    }

    /* renamed from: getNumberSize */
    private int m83152xd6e01ae0() {
        int i17 = this.f295678f;
        if (i17 == 1) {
            return 6;
        }
        if (i17 == 8) {
            return 4;
        }
        if (i17 == 3) {
            return 3;
        }
        if (i17 == 4) {
            return 4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "hy: error or not set format. use default");
        return 6;
    }

    public void a() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.m121590x49eb759d();
        }
    }

    public void b(android.content.Context context) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bjf, (android.view.ViewGroup) this, true).findViewById(com.p314xaae8f345.mm.R.id.pbn);
        this.f295676d = c28001xdd2bb359;
        c28001xdd2bb359.m121612x9178f615(new qp5.q(this));
        if (this.f295679g == com.p314xaae8f345.mm.R.C30861xcebc809e.f562909rn && com.p314xaae8f345.mm.ui.bk.C()) {
            this.f295679g = com.p314xaae8f345.mm.R.C30861xcebc809e.f562910ro;
        }
        int i17 = this.f295681i;
        if (i17 == 1) {
            this.f295679g = com.p314xaae8f345.mm.R.C30859x5a72f63.a9e;
        }
        qp5.y.a(this.f295676d, this.f295678f, i17 == 1);
        this.f295677e = m83152xd6e01ae0();
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f295676d;
        if (c28001xdd2bb3592 != null) {
            c28001xdd2bb3592.setBackgroundResource(this.f295679g);
            this.f295676d.setImeOptions(6);
            this.f295676d.setInputType(128);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_password_edittext_event_v2, false)) {
                this.f295676d.m121621x9f0931e9(false);
                this.f295676d.addTextChangedListener(new qp5.s(this, context));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "set secureEditText ignore textchange");
                this.f295676d.m121633xbee2612e(new qp5.r(this, context));
                this.f295676d.m121621x9f0931e9(true);
            }
            this.f295676d.setOnFocusChangeListener(this);
            this.f295676d.setClickable(false);
            this.f295676d.setLongClickable(false);
            setEnabled(true);
            setClickable(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditHintPasswdView", "hy: no edit text view");
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_password_view_accessibility_security_switch, false);
        this.f295688s = fj6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "isAccessibilitySecuritySwitchSvrOpen: %s", java.lang.Boolean.valueOf(fj6));
        if (!this.f295688s) {
            setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l3p, "0"));
        }
        this.f295676d.setImportantForAccessibility(2);
    }

    public final boolean c() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        return c28001xdd2bb359 != null && c28001xdd2bb359.m121601xbad2461a() == this.f295677e;
    }

    public void d(int i17) {
        this.f295681i = i17;
        if (i17 == 1) {
            this.f295679g = com.p314xaae8f345.mm.R.C30859x5a72f63.a9e;
        } else if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f295679g = com.p314xaae8f345.mm.R.C30861xcebc809e.f562910ro;
        } else {
            this.f295679g = com.p314xaae8f345.mm.R.C30861xcebc809e.f562909rn;
        }
        this.f295676d.setBackgroundResource(this.f295679g);
        qp5.y.a(this.f295676d, this.f295678f, this.f295681i == 1);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.f295688s) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "onInitializeAccessibilityEvent accessibilitySecuritySwitchSvrOpen");
        if (accessibilityEvent.getText() == null) {
            return true;
        }
        accessibilityEvent.getText().clear();
        return true;
    }

    /* renamed from: getEditText */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 m83153xdb574fcd() {
        return this.f295676d;
    }

    /* renamed from: getEncrType */
    public int m83154xe1fca7a8() {
        return this.f295680h;
    }

    /* renamed from: getFormat */
    public int m83155x19771aed() {
        return this.f295678f;
    }

    /* renamed from: getMd5Value */
    public java.lang.String m83156xc003f809() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        if (c28001xdd2bb359 != null) {
            return c28001xdd2bb359.m121602x82b9bcbf();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EditHintPasswdView", "hy: edit view is null");
        return "";
    }

    /* renamed from: getOnEditInputValidListener */
    public qp5.t m83157xd259d305() {
        return this.f295682m;
    }

    @Override // android.view.View
    public android.view.View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f295683n;
    }

    /* renamed from: getPwdInputTextLength */
    public int m83158x898e7ad6() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        if (c28001xdd2bb359 != null) {
            return c28001xdd2bb359.m121601xbad2461a();
        }
        return 0;
    }

    /* renamed from: getPwdNonce */
    public java.lang.String m83159x34875028() {
        return this.f295684o;
    }

    /* renamed from: getPwdTimestamp */
    public long m83160xdc657ccf() {
        return this.f295685p;
    }

    /* renamed from: getText */
    public java.lang.String m83161xfb85ada3() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        if (c28001xdd2bb359 != null) {
            return qp5.z.a(this.f295680h, c28001xdd2bb359, this.f295685p, this.f295684o, this.f295686q);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EditHintPasswdView", "hy: no edit view");
        return "";
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f295683n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        if (this.f295682m != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "on Focus change");
            this.f295682m.mo26603x194c4a1(c());
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.f295688s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "onInitializeAccessibilityEvent accessibilitySecuritySwitchSvrOpen");
            if (accessibilityEvent.getText() != null) {
                accessibilityEvent.getText().clear();
            }
            if ((accessibilityEvent.getEventType() & 32768) == 32768) {
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28003x5d737a8a.m121655x316510(getContext());
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28003x5d737a8a.m121658x688ffd2(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l3p, this.f295687r + ""));
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f295688s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "onInitializeAccessibilityNodeInfo accessibilitySecuritySwitchSvrOpen");
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setContentDescription("");
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfo.setHintText("");
            }
            accessibilityNodeInfo.setFocusable(true);
        }
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent
    /* renamed from: onKeyboardActionGetInputLength */
    public int mo932x4ec7d5f6() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        if (c28001xdd2bb359 != null) {
            return c28001xdd2bb359.m121601xbad2461a();
        }
        return -1;
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent
    /* renamed from: onKeyboardActionWithCode */
    public void mo933xa7cba4af(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "keyboard action");
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.m121603xafd50d1e(i17);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int makeMeasureSpec;
        int i19;
        setMeasuredDimension(android.view.View.getDefaultSize(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 960.0f), i17), android.view.View.getDefaultSize(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 720.0f), i18));
        if (this.f295681i == 0) {
            int measuredWidth = getMeasuredWidth();
            int i27 = this.f295677e;
            int i28 = i27 == 0 ? measuredWidth / 6 : measuredWidth / i27;
            i19 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i28, 1073741824);
            setMeasuredDimension(android.view.View.getDefaultSize(measuredWidth, i19), android.view.View.getDefaultSize(i28, makeMeasureSpec));
        } else {
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int b17 = i65.a.b(getContext(), 8);
            int i29 = this.f295677e;
            int i37 = (measuredWidth2 - (b17 * (i29 - 1))) / i29;
            if (measuredHeight < i37) {
                measuredHeight = i37;
            }
            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2 + 1, 1073741824);
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            setMeasuredDimension(android.view.View.getDefaultSize(measuredWidth2, makeMeasureSpec2), android.view.View.getDefaultSize(i37, makeMeasureSpec));
            i19 = makeMeasureSpec2;
        }
        super.onMeasure(i19, makeMeasureSpec);
    }

    /* renamed from: setEditTextMaxLength */
    public void m83162x631d8491(int i17) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        if (c28001xdd2bb359 != null) {
            android.text.InputFilter[] filters = c28001xdd2bb359.getFilters();
            int length = filters.length + 1;
            android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[length];
            for (int i18 = 0; i18 < filters.length; i18++) {
                inputFilterArr[i18] = filters[i18];
            }
            inputFilterArr[length - 1] = new android.text.InputFilter.LengthFilter(i17);
            this.f295676d.setFilters(inputFilterArr);
        }
    }

    /* renamed from: setEditTextSize */
    public void m83163xf2d0f07a(float f17) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295676d;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.setTextSize(f17);
        }
    }

    /* renamed from: setEncrType */
    public void m83164xdcb508b4(int i17) {
        this.f295680h = i17;
    }

    /* renamed from: setEncryptSoftSalt */
    public void m83165x786d063(java.lang.String str) {
        this.f295686q = str;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f295683n = onFocusChangeListener;
    }

    /* renamed from: setOnInputValidListener */
    public void m83166x1270e8e7(qp5.t tVar) {
        this.f295682m = tVar;
    }

    /* renamed from: setPwdNonce */
    public void m83167x2f3fb134(java.lang.String str) {
        this.f295684o = str;
    }

    /* renamed from: setPwdTimestamp */
    public void m83168x12ae77db(long j17) {
        this.f295685p = j17;
    }

    public ViewOnFocusChangeListenerC22906x9d30fd14(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ViewOnFocusChangeListenerC22906x9d30fd14(android.content.Context context) {
        super(context);
        this.f295676d = null;
        this.f295677e = 6;
        this.f295678f = 1;
        this.f295679g = com.p314xaae8f345.mm.R.C30861xcebc809e.f562909rn;
        this.f295680h = 1;
        this.f295682m = null;
        this.f295683n = null;
        this.f295684o = "";
        this.f295685p = 0L;
        this.f295686q = "";
        this.f295687r = 0;
        this.f295688s = false;
        b(context);
    }
}
