package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes12.dex */
public class o3 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f272447i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(50);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.StringBuilder f272448a;

    /* renamed from: c, reason: collision with root package name */
    public android.text.SpannableString f272450c;

    /* renamed from: f, reason: collision with root package name */
    public int f272453f;

    /* renamed from: g, reason: collision with root package name */
    public int f272454g;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f272449b = new android.text.SpannableStringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f272451d = new android.text.SpannableStringBuilder();

    /* renamed from: e, reason: collision with root package name */
    public final android.text.style.CharacterStyle f272452e = new android.text.style.ForegroundColorSpan(-5066062);

    /* renamed from: h, reason: collision with root package name */
    public int f272455h = 3;

    public o3(android.content.Context context) {
    }

    public final void a() {
        try {
            for (java.lang.String str : ((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINOF_VOICE_INPUT_DEF_LANG_HISTORY_STRING, "")).split(";")) {
                java.lang.String[] split = str.split(":");
                if (split.length == 2) {
                    f272447i.put(split[0], java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0)));
                }
            }
        } catch (java.lang.Error unused) {
        }
    }

    public synchronized void b(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = f272447i;
        r2Var.put(str, java.lang.Integer.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object[] array = r2Var.m77802xbc5e1583().toArray();
        java.lang.Object[] array2 = r2Var.m77806xcee59d22().toArray();
        for (int i18 = 0; i18 < array.length; i18++) {
            sb6.append(array[i18]);
            sb6.append(":");
            sb6.append(array2[i18]);
            sb6.append(";");
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINOF_VOICE_INPUT_DEF_LANG_HISTORY_STRING, sb6.toString());
    }

    public void c(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        if (c22621x7603e017 == null) {
            return;
        }
        this.f272453f = c22621x7603e017.getSelectionStart();
        this.f272454g = c22621x7603e017.getSelectionEnd();
        this.f272448a = new java.lang.StringBuilder(c22621x7603e017.getText());
        if (c22621x7603e017.getText().toString().equalsIgnoreCase("")) {
            this.f272449b.clear();
        }
        if (this.f272453f < 0) {
            this.f272453f = 0;
        }
        if (this.f272454g < 0) {
            this.f272454g = 0;
        }
    }

    public void d(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        if (c22621x7603e017 == null) {
            return;
        }
        this.f272455h = 0;
        android.text.SpannableString Ri = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(c22621x7603e017.getText().toString(), true);
        this.f272450c = Ri;
        c22621x7603e017.setText(Ri);
        c22621x7603e017.mo81549xf579a34a(this.f272450c.length());
    }

    public void e(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, java.lang.String str, boolean z17) {
        int length;
        if (c22621x7603e017 == null) {
            return;
        }
        if (this.f272448a == null) {
            throw new java.lang.IllegalStateException("You should saveHistory before setText");
        }
        int length2 = this.f272453f + str.length();
        android.text.SpannableStringBuilder spannableStringBuilder = this.f272449b;
        spannableStringBuilder.clear();
        android.text.SpannableStringBuilder spannableStringBuilder2 = this.f272451d;
        spannableStringBuilder2.clear();
        if (z17) {
            int i17 = 0;
            android.text.SpannableString Ri = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(this.f272448a.subSequence(0, this.f272453f), true);
            this.f272450c = Ri;
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) Ri);
            if (spannableStringBuilder2 != null && str.length() != 0) {
                if (str.length() < this.f272455h) {
                    length = str.length();
                } else {
                    length = str.length();
                    i17 = length - this.f272455h;
                }
                spannableStringBuilder2.append((java.lang.CharSequence) str).setSpan(this.f272452e, i17, length, 33);
            }
            android.text.SpannableStringBuilder append2 = append.append((java.lang.CharSequence) spannableStringBuilder2);
            java.lang.StringBuilder sb6 = this.f272448a;
            append2.append(sb6.subSequence(this.f272454g, sb6.length()));
        } else {
            android.text.SpannableString Ri2 = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(str, true);
            this.f272450c = Ri2;
            spannableStringBuilder.append((java.lang.CharSequence) Ri2);
        }
        spannableStringBuilder.length();
        c22621x7603e017.setText(spannableStringBuilder);
        if (length2 <= spannableStringBuilder.length()) {
            if (length2 == 0) {
                c22621x7603e017.mo81549xf579a34a(spannableStringBuilder.length());
            } else {
                c22621x7603e017.mo81549xf579a34a(length2);
            }
        }
    }
}
