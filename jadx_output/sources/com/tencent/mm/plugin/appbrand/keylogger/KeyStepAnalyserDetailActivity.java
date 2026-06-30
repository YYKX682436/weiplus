package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class KeyStepAnalyserDetailActivity extends com.tencent.mm.plugin.appbrand.keylogger.KeyStepBaseActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f84105x = new java.text.SimpleDateFormat("HH:mm:ss");

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f84106e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f84107f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f84108g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ScaleGestureDetector f84109h;

    /* renamed from: i, reason: collision with root package name */
    public float f84110i;

    /* renamed from: m, reason: collision with root package name */
    public float f84111m;

    /* renamed from: n, reason: collision with root package name */
    public float f84112n;

    /* renamed from: o, reason: collision with root package name */
    public float f84113o;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Class f84116r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f84117s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f84118t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Map f84119u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.Map f84120v;

    /* renamed from: p, reason: collision with root package name */
    public float f84114p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public float f84115q = 1.0f;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.ScaleGestureDetector.OnScaleGestureListener f84121w = new com.tencent.mm.plugin.appbrand.keylogger.p(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f84109h == null || this.f84106e.getVisibility() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        super.dispatchTouchEvent(motionEvent);
        return this.f84109h.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.plugin.appbrand.keylogger.KeyStepBaseActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487937c1;
    }

    @Override // com.tencent.mm.plugin.appbrand.keylogger.KeyStepBaseActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long j17;
        char c17;
        int i17;
        int i18;
        char c18;
        long j18;
        int i19;
        android.text.SpannableString spannableString;
        super.onCreate(bundle);
        this.f84106e = findViewById(com.tencent.mm.R.id.cyb);
        this.f84107f = findViewById(com.tencent.mm.R.id.f487303o82);
        this.f84116r = (java.lang.Class) getIntent().getSerializableExtra("key_process_class");
        this.f84117s = getIntent().getStringExtra("key_process_category");
        this.f84122d.setText(getString(com.tencent.mm.R.string.f492358g71));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hq8);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cyc);
        textView.setText(getIntent().getStringExtra("key_info"));
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479860h9);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h6_);
        java.lang.String str = getString(com.tencent.mm.R.string.g77) + " ";
        java.lang.String str2 = getString(com.tencent.mm.R.string.f492362g75) + " ";
        java.lang.String str3 = getString(com.tencent.mm.R.string.g76) + " ";
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str + str2 + str3 + getString(com.tencent.mm.R.string.g78));
        android.graphics.drawable.Drawable drawable = b3.l.getDrawable(this, com.tencent.mm.R.drawable.bru);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(drawable, 0);
        int i27 = 1;
        spannableString2.setSpan(imageSpan, 0, 1, 17);
        int length = str.length() + 0;
        android.graphics.drawable.Drawable drawable2 = b3.l.getDrawable(this, com.tencent.mm.R.drawable.brt);
        drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new android.text.style.ImageSpan(drawable2, 0), length, length + 1, 17);
        int length2 = length + str2.length();
        android.graphics.drawable.Drawable drawable3 = b3.l.getDrawable(this, com.tencent.mm.R.drawable.brs);
        drawable3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new android.text.style.ImageSpan(drawable3, 0), length2, length2 + 1, 17);
        int length3 = length2 + str3.length();
        android.graphics.drawable.Drawable drawable4 = b3.l.getDrawable(this, com.tencent.mm.R.drawable.brv);
        drawable4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new android.text.style.ImageSpan(drawable4, 0), length3, length3 + 1, 17);
        textView2.setText(spannableString2);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.appbrand.keylogger.l(this));
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("steps");
        java.util.LinkedList linkedList = new java.util.LinkedList(parcelableArrayListExtra);
        java.util.Collections.sort(linkedList, new com.tencent.mm.plugin.appbrand.keylogger.m(this));
        this.f84120v = new java.util.HashMap();
        int i28 = 0;
        while (true) {
            j17 = 0;
            c17 = 3;
            if (i28 >= linkedList.size() || i28 > 3) {
                break;
            }
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo = (com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) linkedList.get(i28);
            if (iKeyStepAnalyser$StepLogInfo.f84138m > 0 && !"END".equals(iKeyStepAnalyser$StepLogInfo.f84134f)) {
                ((java.util.HashMap) this.f84120v).put(((com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) linkedList.get(i28)).f84134f, java.lang.Boolean.TRUE);
            }
            i28++;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i29 = 0; i29 < parcelableArrayListExtra.size(); i29++) {
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo2 = (com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) parcelableArrayListExtra.get(i29);
            hashMap.put(iKeyStepAnalyser$StepLogInfo2.f84134f, iKeyStepAnalyser$StepLogInfo2);
        }
        java.util.List a17 = com.tencent.mm.plugin.appbrand.keylogger.b0.a(this.f84116r, this.f84117s);
        this.f84119u = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i37 = 0;
        while (i37 < a17.size()) {
            kg1.h hVar = (kg1.h) ((kg1.o) a17.get(i37)).f307709a;
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo3 = (com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) hashMap.get(hVar.f307694b);
            java.lang.String str4 = hVar.f307697e;
            java.lang.String str5 = hVar.f307694b;
            if (iKeyStepAnalyser$StepLogInfo3 == null) {
                i17 = hVar.f307696d ? -2 : -1;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    str4 = str5;
                }
                spannableString = new android.text.SpannableString(str4);
                j18 = j17;
                c18 = c17;
                i18 = i27;
            } else {
                i17 = !iKeyStepAnalyser$StepLogInfo3.f84136h.equals("ok") ? hVar.f307695c ? i27 : 2 : 0;
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = f84105x.format(java.lang.Long.valueOf(iKeyStepAnalyser$StepLogInfo3.f84132d));
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    str4 = str5;
                }
                i18 = 1;
                objArr[1] = str4;
                objArr[2] = iKeyStepAnalyser$StepLogInfo3.f84136h;
                c18 = 3;
                objArr[3] = iKeyStepAnalyser$StepLogInfo3.f84137i;
                java.lang.String format = java.lang.String.format("%s %s:%s %s", objArr);
                int length4 = format.length();
                long j19 = iKeyStepAnalyser$StepLogInfo3.f84138m;
                j18 = 0;
                if (j19 > 0) {
                    java.lang.String format2 = java.lang.String.format(" cost:%d ms", java.lang.Long.valueOf(j19));
                    i19 = format2.length();
                    format = format.concat(format2);
                } else {
                    i19 = 0;
                }
                android.text.SpannableString spannableString3 = new android.text.SpannableString(format);
                if (((java.util.HashMap) this.f84120v).containsKey(iKeyStepAnalyser$StepLogInfo3.f84134f)) {
                    spannableString3.setSpan(new android.text.style.ForegroundColorSpan(-65536), length4, i19 + length4, 33);
                }
                spannableString = spannableString3;
            }
            lg1.b bVar = new lg1.b(spannableString, i17);
            arrayList.add(bVar);
            ((java.util.HashMap) this.f84119u).put(str5, bVar);
            i37++;
            i27 = i18;
            c17 = c18;
            j17 = j18;
        }
        com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepView verticalStepView = (com.tencent.mm.plugin.appbrand.keylogger.stepview.VerticalStepView) findViewById(com.tencent.mm.R.id.ni_);
        verticalStepView.f84175f = arrayList;
        verticalStepView.f84174e.setSteps(arrayList);
    }
}
