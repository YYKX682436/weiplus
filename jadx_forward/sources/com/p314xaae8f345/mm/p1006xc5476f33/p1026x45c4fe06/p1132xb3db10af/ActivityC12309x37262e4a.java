package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity */
/* loaded from: classes7.dex */
public class ActivityC12309x37262e4a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.AbstractActivityC12310x81e5924b {

    /* renamed from: x, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f165638x = new java.text.SimpleDateFormat("HH:mm:ss");

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f165639e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f165640f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f165641g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ScaleGestureDetector f165642h;

    /* renamed from: i, reason: collision with root package name */
    public float f165643i;

    /* renamed from: m, reason: collision with root package name */
    public float f165644m;

    /* renamed from: n, reason: collision with root package name */
    public float f165645n;

    /* renamed from: o, reason: collision with root package name */
    public float f165646o;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Class f165649r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f165650s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f165651t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Map f165652u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.Map f165653v;

    /* renamed from: p, reason: collision with root package name */
    public float f165647p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public float f165648q = 1.0f;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.ScaleGestureDetector.OnScaleGestureListener f165654w = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f165642h == null || this.f165639e.getVisibility() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        super.dispatchTouchEvent(motionEvent);
        return this.f165642h.onTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.AbstractActivityC12310x81e5924b
    /* renamed from: getLayoutId */
    public int mo51581x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569470c1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.AbstractActivityC12310x81e5924b, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
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
        this.f165639e = findViewById(com.p314xaae8f345.mm.R.id.cyb);
        this.f165640f = findViewById(com.p314xaae8f345.mm.R.id.f568836o82);
        this.f165649r = (java.lang.Class) getIntent().getSerializableExtra("key_process_class");
        this.f165650s = getIntent().getStringExtra("key_process_category");
        this.f165655d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573891g71));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hq8);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cyc);
        textView.setText(getIntent().getStringExtra("key_info"));
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561393h9);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h6_);
        java.lang.String str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g77) + " ";
        java.lang.String str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573895g75) + " ";
        java.lang.String str3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g76) + " ";
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str + str2 + str3 + getString(com.p314xaae8f345.mm.R.C30867xcad56011.g78));
        android.graphics.drawable.Drawable m9707x4a96be14 = b3.l.m9707x4a96be14(this, com.p314xaae8f345.mm.R.C30861xcebc809e.bru);
        m9707x4a96be14.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(m9707x4a96be14, 0);
        int i27 = 1;
        spannableString2.setSpan(imageSpan, 0, 1, 17);
        int length = str.length() + 0;
        android.graphics.drawable.Drawable m9707x4a96be142 = b3.l.m9707x4a96be14(this, com.p314xaae8f345.mm.R.C30861xcebc809e.brt);
        m9707x4a96be142.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new android.text.style.ImageSpan(m9707x4a96be142, 0), length, length + 1, 17);
        int length2 = length + str2.length();
        android.graphics.drawable.Drawable m9707x4a96be143 = b3.l.m9707x4a96be14(this, com.p314xaae8f345.mm.R.C30861xcebc809e.brs);
        m9707x4a96be143.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new android.text.style.ImageSpan(m9707x4a96be143, 0), length2, length2 + 1, 17);
        int length3 = length2 + str3.length();
        android.graphics.drawable.Drawable m9707x4a96be144 = b3.l.m9707x4a96be14(this, com.p314xaae8f345.mm.R.C30861xcebc809e.brv);
        m9707x4a96be144.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        spannableString2.setSpan(new android.text.style.ImageSpan(m9707x4a96be144, 0), length3, length3 + 1, 17);
        textView2.setText(spannableString2);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.l(this));
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("steps");
        java.util.LinkedList linkedList = new java.util.LinkedList(parcelableArrayListExtra);
        java.util.Collections.sort(linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.m(this));
        this.f165653v = new java.util.HashMap();
        int i28 = 0;
        while (true) {
            j17 = 0;
            c17 = 3;
            if (i28 >= linkedList.size() || i28 > 3) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723 c12311xaad8723 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723) linkedList.get(i28);
            if (c12311xaad8723.f165671m > 0 && !"END".equals(c12311xaad8723.f165667f)) {
                ((java.util.HashMap) this.f165653v).put(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723) linkedList.get(i28)).f165667f, java.lang.Boolean.TRUE);
            }
            i28++;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i29 = 0; i29 < parcelableArrayListExtra.size(); i29++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723 c12311xaad87232 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723) parcelableArrayListExtra.get(i29);
            hashMap.put(c12311xaad87232.f165667f, c12311xaad87232);
        }
        java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.b0.a(this.f165649r, this.f165650s);
        this.f165652u = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i37 = 0;
        while (i37 < a17.size()) {
            kg1.h hVar = (kg1.h) ((kg1.o) a17.get(i37)).f389242a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723 c12311xaad87233 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1133x2e06d1.C12311xaad8723) hashMap.get(hVar.f389227b);
            java.lang.String str4 = hVar.f389230e;
            java.lang.String str5 = hVar.f389227b;
            if (c12311xaad87233 == null) {
                i17 = hVar.f389229d ? -2 : -1;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    str4 = str5;
                }
                spannableString = new android.text.SpannableString(str4);
                j18 = j17;
                c18 = c17;
                i18 = i27;
            } else {
                i17 = !c12311xaad87233.f165669h.equals("ok") ? hVar.f389228c ? i27 : 2 : 0;
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = f165638x.format(java.lang.Long.valueOf(c12311xaad87233.f165665d));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    str4 = str5;
                }
                i18 = 1;
                objArr[1] = str4;
                objArr[2] = c12311xaad87233.f165669h;
                c18 = 3;
                objArr[3] = c12311xaad87233.f165670i;
                java.lang.String format = java.lang.String.format("%s %s:%s %s", objArr);
                int length4 = format.length();
                long j19 = c12311xaad87233.f165671m;
                j18 = 0;
                if (j19 > 0) {
                    java.lang.String format2 = java.lang.String.format(" cost:%d ms", java.lang.Long.valueOf(j19));
                    i19 = format2.length();
                    format = format.concat(format2);
                } else {
                    i19 = 0;
                }
                android.text.SpannableString spannableString3 = new android.text.SpannableString(format);
                if (((java.util.HashMap) this.f165653v).containsKey(c12311xaad87233.f165667f)) {
                    spannableString3.setSpan(new android.text.style.ForegroundColorSpan(-65536), length4, i19 + length4, 33);
                }
                spannableString = spannableString3;
            }
            lg1.b bVar = new lg1.b(spannableString, i17);
            arrayList.add(bVar);
            ((java.util.HashMap) this.f165652u).put(str5, bVar);
            i37++;
            i27 = i18;
            c17 = c18;
            j17 = j18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71.C12312x14b5a947 c12312x14b5a947 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.p1134x5534fb71.C12312x14b5a947) findViewById(com.p314xaae8f345.mm.R.id.ni_);
        c12312x14b5a947.f165708f = arrayList;
        c12312x14b5a947.f165707e.m51596x53b693e5(arrayList);
    }
}
