package com.p3263xee53b379;

/* renamed from: com.unionpay.UPPayWapActivity */
/* loaded from: classes13.dex */
public class ActivityC28074x3a8f05c8 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f302198o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.webkit.WebView f302199d;

    /* renamed from: e, reason: collision with root package name */
    public com.p3263xee53b379.b f302200e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.AlertDialog f302201f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f302202g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f302203h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f302204i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f302205m;

    /* renamed from: n, reason: collision with root package name */
    public com.p3263xee53b379.g f302206n;

    public static java.lang.String L6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject.put("code", str);
            }
            if (str2 != null) {
                jSONObject.put("msg", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            return jSONObject.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String M6(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject2.put("code", str);
            }
            if (str2 != null) {
                jSONObject2.put("msg", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("value", jSONObject);
            }
            return jSONObject2.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final void K6(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("pay_result", str);
        intent.putExtra("result_data", str2);
        setResult(-1, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            try {
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    java.lang.String str = "";
                    java.lang.String string = extras.containsKey("pay_result") ? extras.getString("pay_result") : extras.containsKey("code") ? extras.getString("code") : "";
                    if (android.text.TextUtils.isEmpty(string)) {
                        string = "";
                    }
                    java.lang.String string2 = extras.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) ? extras.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) : "";
                    if (!android.text.TextUtils.isEmpty(string2)) {
                        str = string2;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("code", string);
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
                    com.p3263xee53b379.g gVar = this.f302206n;
                    if (gVar != null) {
                        ((com.p3263xee53b379.d) gVar).a(M6("0", null, jSONObject));
                    }
                } else {
                    com.p3263xee53b379.g gVar2 = this.f302206n;
                    if (gVar2 != null) {
                        ((com.p3263xee53b379.d) gVar2).a(L6("1", "No pay result", null));
                    }
                }
            } catch (java.lang.Exception unused) {
                com.p3263xee53b379.g gVar3 = this.f302206n;
                if (gVar3 != null) {
                    ((com.p3263xee53b379.d) gVar3).a(L6("1", "No pay result", null));
                }
            }
            this.f302206n = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        android.view.View.OnClickListener onClickListener;
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        try {
            try {
                if (!"949A1CC".equalsIgnoreCase(getIntent().getStringExtra("magic_data"))) {
                    finish();
                }
                this.f302202g = "link".equals(getIntent().getStringExtra("actionType"));
                java.lang.String stringExtra = getIntent().getStringExtra("ex_mode");
                this.f302203h = stringExtra;
                if (android.text.TextUtils.isEmpty(stringExtra)) {
                    this.f302203h = "00";
                }
                str = "";
                getWindow().requestFeature(1);
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
                linearLayout.setOrientation(1);
                relativeLayout.addView(linearLayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
                relativeLayout.setFitsSystemWindows(true);
                setContentView(relativeLayout);
                this.f302199d = new android.webkit.WebView(this);
                java.lang.String stringExtra2 = getIntent().getStringExtra("actionType");
                this.f302204i = stringExtra2;
                if ("link".equals(stringExtra2)) {
                    str = getIntent().getStringExtra("wapurl");
                } else {
                    java.lang.String stringExtra3 = getIntent().getStringExtra("waptype");
                    java.lang.String stringExtra4 = getIntent().getStringExtra("wapurl");
                    if ("new_page".equals(stringExtra3)) {
                        str = stringExtra4 != null ? stringExtra4 : "";
                        onClickListener = new com.p3263xee53b379.m(this);
                    } else {
                        java.lang.String stringExtra5 = getIntent().getStringExtra("paydata");
                        if (stringExtra5 != null) {
                            str = stringExtra4 + "?s=" + stringExtra5;
                        }
                        onClickListener = null;
                    }
                    android.widget.ImageView imageView = new android.widget.ImageView(this);
                    imageView.setBackgroundDrawable(qy5.f.a(2));
                    int i17 = (int) ((24.0f * getResources().getDisplayMetrics().density) + 0.5f);
                    int i18 = (int) ((18.0f * getResources().getDisplayMetrics().density) + 0.5f);
                    int i19 = (int) ((14.0f * getResources().getDisplayMetrics().density) + 0.5f);
                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17, i17);
                    layoutParams.addRule(9, -1);
                    layoutParams.addRule(10, -1);
                    layoutParams.setMargins(i18, i19, 0, 0);
                    relativeLayout.addView(imageView, layoutParams);
                    if (onClickListener == null) {
                        onClickListener = new com.p3263xee53b379.t(this);
                    }
                    imageView.setOnClickListener(onClickListener);
                    this.f302205m = imageView;
                }
                this.f302199d.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
                linearLayout.addView(this.f302199d);
                com.p3263xee53b379.b bVar = new com.p3263xee53b379.b(this, this.f302199d, null);
                this.f302200e = bVar;
                bVar.f302237h = true;
                android.webkit.WebView webView = this.f302199d;
                if (webView != null) {
                    webView.loadUrl(str);
                }
                com.p3263xee53b379.b bVar2 = this.f302200e;
                if (bVar2 != null) {
                    bVar2.a(fc1.a.f69735x24728b, new com.p3263xee53b379.w(this));
                    this.f302200e.a("saveData", new com.p3263xee53b379.x(this));
                    this.f302200e.a("getData", new com.p3263xee53b379.y(this));
                    this.f302200e.a("removeData", new com.p3263xee53b379.z(this));
                    this.f302200e.a("setPageBackEnable", new com.p3263xee53b379.a0(this));
                    this.f302200e.a("payBySDK", new com.p3263xee53b379.b0(this));
                    this.f302200e.a("payResult", new com.p3263xee53b379.n(this));
                    this.f302200e.a("closePage", new com.p3263xee53b379.o(this));
                    this.f302200e.a("openNewPage", new com.p3263xee53b379.p(this));
                    this.f302200e.a("checkBankSchemes", new com.p3263xee53b379.q(this));
                    this.f302200e.a("openBankApp", new com.p3263xee53b379.r(this));
                    this.f302200e.a("openScheme", new com.p3263xee53b379.s(this));
                }
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.graphics.drawable.Drawable background;
        android.graphics.Bitmap bitmap;
        super.onDestroy();
        android.view.View view = this.f302205m;
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        background.setCallback(null);
        if (!(background instanceof android.graphics.drawable.BitmapDrawable) || (bitmap = ((android.graphics.drawable.BitmapDrawable) background).getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (this.f302202g) {
            android.webkit.WebView webView = this.f302199d;
            if (webView != null && webView.canGoBack()) {
                this.f302199d.goBack();
                return true;
            }
            K6("cancel", null);
        } else {
            onPause();
        }
        return true;
    }
}
