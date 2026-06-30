package dy;

/* loaded from: classes5.dex */
public final class d extends android.widget.FrameLayout implements cy.g {

    /* renamed from: d, reason: collision with root package name */
    public final cy.i f326063d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Double f326064e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Double f326065f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f326066g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f326067h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f326068i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f326069m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f326070n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f326071o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, cy.i sceneCtx) {
        super(context);
        java.lang.String b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneCtx, "sceneCtx");
        this.f326063d = sceneCtx;
        this.f326066g = "";
        this.f326067h = "";
        this.f326068i = "";
        java.lang.Object obj = sceneCtx.f306203b.get("isDark");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.util.Map map = sceneCtx.f306202a;
        java.lang.Object obj2 = map.get("latitude");
        java.lang.Number number = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
        this.f326064e = number != null ? java.lang.Double.valueOf(number.doubleValue()) : null;
        java.lang.Object obj3 = map.get("longitude");
        java.lang.Number number2 = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
        this.f326065f = number2 != null ? java.lang.Double.valueOf(number2.doubleValue()) : null;
        java.lang.Object obj4 = map.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String str = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        this.f326066g = str == null ? "" : str;
        java.lang.Object obj5 = map.get("address");
        java.lang.String str2 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        this.f326067h = str2 == null ? "" : str2;
        java.lang.Object obj6 = map.get("poiName");
        java.lang.String str3 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        this.f326068i = str3 != null ? str3 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatbotMapSceneView", "applyPayload(init) itemId=" + sceneCtx.f306205d + " lat=" + this.f326064e + " lng=" + this.f326065f + " title='" + this.f326066g + "' address='" + this.f326067h + "' poiName='" + this.f326068i + '\'');
        int parseColor = android.graphics.Color.parseColor(booleanValue ? "#FF242424" : "#FFF3F5F7");
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(android.util.TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics()));
        gradientDrawable.setColor(parseColor);
        setBackground(gradientDrawable);
        setClipChildren(true);
        setClipToPadding(true);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        linearLayout.setPadding(a(12), a(10), a(12), a(10));
        int parseColor2 = booleanValue ? -1 : android.graphics.Color.parseColor("#FF222222");
        int parseColor3 = android.graphics.Color.parseColor(booleanValue ? "#FFB0B0B0" : "#FF666666");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextColor(parseColor2);
        textView.setTextSize(2, 15.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f326070n = textView;
        linearLayout.addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setTextColor(parseColor3);
        textView2.setTextSize(2, 12.0f);
        textView2.setMaxLines(2);
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = a(2);
        textView2.setLayoutParams(layoutParams);
        this.f326071o = textView2;
        linearLayout.addView(textView2);
        android.view.View cVar = new dy.c(context, booleanValue);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        layoutParams2.topMargin = a(8);
        cVar.setLayoutParams(layoutParams2);
        linearLayout.addView(cVar);
        java.lang.String str4 = this.f326066g;
        if (str4.length() == 0) {
            str4 = this.f326068i;
            if (str4.length() == 0) {
                str4 = "map card";
            }
        }
        android.widget.TextView textView3 = this.f326070n;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleView");
            throw null;
        }
        textView3.setText(str4);
        android.widget.TextView textView4 = this.f326071o;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subtitleView");
            throw null;
        }
        if (this.f326067h.length() > 0) {
            if ((this.f326068i.length() > 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326067h, this.f326068i)) {
                b17 = this.f326068i + " · " + this.f326067h;
                textView4.setText(b17);
                addView(linearLayout);
                setClickable(true);
                setLongClickable(false);
                setOnClickListener(new dy.b(this, context));
            }
        }
        if (this.f326067h.length() > 0) {
            b17 = this.f326067h;
        } else {
            if (!(this.f326068i.length() > 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326068i, str4)) {
                b17 = b();
                if (b17 == null) {
                    b17 = "unknown location";
                }
            } else {
                b17 = this.f326068i;
            }
        }
        textView4.setText(b17);
        addView(linearLayout);
        setClickable(true);
        setLongClickable(false);
        setOnClickListener(new dy.b(this, context));
    }

    public final int a(int i17) {
        return (int) android.util.TypedValue.applyDimension(1, i17, getResources().getDisplayMetrics());
    }

    public final java.lang.String b() {
        java.lang.Double d17 = this.f326064e;
        if (d17 != null) {
            double doubleValue = d17.doubleValue();
            java.lang.Double d18 = this.f326065f;
            if (d18 != null) {
                java.lang.String format = java.lang.String.format("%.4f, %.4f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(doubleValue), java.lang.Double.valueOf(d18.doubleValue())}, 2));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                return format;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        cy.i iVar = this.f326063d;
        super.onAttachedToWindow();
        if (this.f326069m) {
            return;
        }
        this.f326069m = true;
        try {
            iVar.f306204c.getClass();
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)).getValue());
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatbotMapSceneView", "ready report failed: " + m143898xd4a2fc34);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatbotMapSceneView", "ready reported itemId=" + iVar.f306205d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatbotMapSceneView", "ready report threw: " + th6);
        }
    }
}
