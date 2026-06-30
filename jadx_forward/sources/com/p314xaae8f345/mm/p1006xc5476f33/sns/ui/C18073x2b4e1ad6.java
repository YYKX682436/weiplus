package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLikesTextView */
/* loaded from: classes4.dex */
public class C18073x2b4e1ad6 extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ks {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f248772z = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f248773d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f248774e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f248775f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f248776g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f248777h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17975x38b7a89e f248778i;

    /* renamed from: m, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f248779m;

    /* renamed from: n, reason: collision with root package name */
    public int f248780n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f248781o;

    /* renamed from: p, reason: collision with root package name */
    public int f248782p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1 f248783q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f248784r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.HashMap f248785s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder f248786t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns f248787u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f248788v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f248789w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.drawable.Drawable f248790x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f248791y;

    public C18073x2b4e1ad6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShrinkMode", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        java.lang.Integer num = (java.lang.Integer) this.f248785s.get(this.f248773d);
        if (num != null) {
            int intValue = num.intValue();
            android.text.SpannableStringBuilder spannableStringBuilder = this.f248779m;
            if (intValue == 0) {
                int lineCount = this.f248778i.getLayout().getLineCount();
                this.f248777h.setVisibility(8);
                if (lineCount > this.f248780n && (baseViewHolder = this.f248786t) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.R(baseViewHolder.f250805h, this.f248787u, spannableStringBuilder.toString(), spannableStringBuilder.toString(), lineCount, lineCount, false, this.f248786t.f250795c, this.f248780n);
                }
            } else if (intValue == 1) {
                int lineCount2 = this.f248778i.getLayout().getLineCount();
                int max = java.lang.Math.max(java.lang.Math.min(this.f248780n, lineCount2), 0);
                java.lang.CharSequence subSequence = spannableStringBuilder.subSequence(0, this.f248778i.getLayout().getLineVisibleEnd(max - 1));
                int lastIndexOf = subSequence.toString().lastIndexOf(",");
                android.text.SpannableStringBuilder spannableStringBuilder2 = (lastIndexOf <= 0 || lastIndexOf >= subSequence.length()) ? new android.text.SpannableStringBuilder(subSequence) : new android.text.SpannableStringBuilder(subSequence.subSequence(0, lastIndexOf));
                java.lang.String spannableStringBuilder3 = spannableStringBuilder2.toString();
                spannableStringBuilder2.append((java.lang.CharSequence) ",...");
                this.f248778i.setText(spannableStringBuilder2, android.widget.TextView.BufferType.SPANNABLE);
                this.f248777h.setVisibility(0);
                this.f248775f.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jca));
                this.f248776g.setRotation(90.0f);
                this.f248776g.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder2 = this.f248786t;
                if (baseViewHolder2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.R(baseViewHolder2.f250805h, this.f248787u, spannableStringBuilder3, spannableStringBuilder.toString(), max, lineCount2, true, this.f248786t.f250795c, this.f248780n);
                }
            } else if (intValue == 2) {
                int lineCount3 = this.f248778i.getLayout().getLineCount();
                this.f248778i.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
                this.f248777h.setVisibility(0);
                this.f248776g.setRotation(-90.0f);
                this.f248776g.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo)));
                this.f248775f.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jc_));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder3 = this.f248786t;
                if (baseViewHolder3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.R(baseViewHolder3.f250805h, this.f248787u, spannableStringBuilder.toString(), spannableStringBuilder.toString(), lineCount3, lineCount3, false, this.f248786t.f250795c, this.f248780n);
                }
            } else if (intValue == 3) {
                int lineCount4 = this.f248778i.getLayout().getLineCount();
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(4, null);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = getContext();
                float textSize = this.f248778i.getTextSize();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize);
                int max2 = java.lang.Math.max(java.lang.Math.min(this.f248780n, lineCount4), 0);
                java.lang.CharSequence subSequence2 = spannableStringBuilder.subSequence(0, this.f248778i.getLayout().getLineVisibleEnd(max2 - 1));
                int lastIndexOf2 = subSequence2.toString().lastIndexOf(",");
                android.text.SpannableStringBuilder spannableStringBuilder4 = (lastIndexOf2 <= 0 || lastIndexOf2 >= subSequence2.length()) ? new android.text.SpannableStringBuilder(subSequence2) : new android.text.SpannableStringBuilder(subSequence2.subSequence(0, lastIndexOf2));
                j17.setSpan(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1(getContext(), str, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bl(this, str), this.f248782p == 10 ? 3 : 2), 0, j17.length(), 33);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(spannableStringBuilder4.toString());
                spannableStringBuilder4.append((java.lang.CharSequence) ",...").append((java.lang.CharSequence) ",").append((java.lang.CharSequence) j17);
                this.f248778i.setText(spannableStringBuilder4, android.widget.TextView.BufferType.SPANNABLE);
                this.f248777h.setVisibility(0);
                this.f248775f.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jca));
                this.f248776g.setRotation(90.0f);
                this.f248776g.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder4 = this.f248786t;
                if (baseViewHolder4 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                    android.view.View view = baseViewHolder4.f250805h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar = this.f248787u;
                    sb6.append(",");
                    sb6.append((java.lang.CharSequence) j17);
                    s0Var.R(view, nsVar, sb6.toString(), spannableStringBuilder.toString(), max2, lineCount4, true, this.f248786t.f250795c, this.f248780n);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShrinkMode", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x042a A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:12:0x0062, B:14:0x0070, B:18:0x00c1, B:21:0x00c9, B:23:0x018b, B:24:0x00e9, B:28:0x011b, B:30:0x011f, B:32:0x0125, B:34:0x013a, B:36:0x0177, B:39:0x012c, B:40:0x0134, B:44:0x01a1, B:45:0x01c0, B:47:0x01e8, B:49:0x01ec, B:51:0x01f2, B:53:0x020c, B:55:0x021c, B:56:0x0226, B:59:0x0230, B:61:0x0254, B:63:0x025a, B:65:0x0278, B:67:0x0282, B:69:0x02a2, B:71:0x0289, B:73:0x0293, B:75:0x029d, B:76:0x02b6, B:79:0x02c8, B:84:0x030a, B:86:0x030e, B:88:0x0316, B:93:0x032c, B:95:0x040a, B:96:0x0350, B:99:0x0365, B:101:0x036d, B:102:0x0385, B:104:0x039b, B:106:0x03a1, B:108:0x03b1, B:110:0x03b7, B:112:0x03cb, B:114:0x03d1, B:115:0x03d3, B:116:0x03dc, B:117:0x0403, B:123:0x0418, B:125:0x042a, B:127:0x0430, B:129:0x0438, B:132:0x0449, B:133:0x0450, B:142:0x02dd, B:143:0x01b1, B:145:0x0077, B:147:0x007d, B:149:0x008e, B:152:0x0094, B:154:0x00ae), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1 A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:12:0x0062, B:14:0x0070, B:18:0x00c1, B:21:0x00c9, B:23:0x018b, B:24:0x00e9, B:28:0x011b, B:30:0x011f, B:32:0x0125, B:34:0x013a, B:36:0x0177, B:39:0x012c, B:40:0x0134, B:44:0x01a1, B:45:0x01c0, B:47:0x01e8, B:49:0x01ec, B:51:0x01f2, B:53:0x020c, B:55:0x021c, B:56:0x0226, B:59:0x0230, B:61:0x0254, B:63:0x025a, B:65:0x0278, B:67:0x0282, B:69:0x02a2, B:71:0x0289, B:73:0x0293, B:75:0x029d, B:76:0x02b6, B:79:0x02c8, B:84:0x030a, B:86:0x030e, B:88:0x0316, B:93:0x032c, B:95:0x040a, B:96:0x0350, B:99:0x0365, B:101:0x036d, B:102:0x0385, B:104:0x039b, B:106:0x03a1, B:108:0x03b1, B:110:0x03b7, B:112:0x03cb, B:114:0x03d1, B:115:0x03d3, B:116:0x03dc, B:117:0x0403, B:123:0x0418, B:125:0x042a, B:127:0x0430, B:129:0x0438, B:132:0x0449, B:133:0x0450, B:142:0x02dd, B:143:0x01b1, B:145:0x0077, B:147:0x007d, B:149:0x008e, B:152:0x0094, B:154:0x00ae), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1 A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:12:0x0062, B:14:0x0070, B:18:0x00c1, B:21:0x00c9, B:23:0x018b, B:24:0x00e9, B:28:0x011b, B:30:0x011f, B:32:0x0125, B:34:0x013a, B:36:0x0177, B:39:0x012c, B:40:0x0134, B:44:0x01a1, B:45:0x01c0, B:47:0x01e8, B:49:0x01ec, B:51:0x01f2, B:53:0x020c, B:55:0x021c, B:56:0x0226, B:59:0x0230, B:61:0x0254, B:63:0x025a, B:65:0x0278, B:67:0x0282, B:69:0x02a2, B:71:0x0289, B:73:0x0293, B:75:0x029d, B:76:0x02b6, B:79:0x02c8, B:84:0x030a, B:86:0x030e, B:88:0x0316, B:93:0x032c, B:95:0x040a, B:96:0x0350, B:99:0x0365, B:101:0x036d, B:102:0x0385, B:104:0x039b, B:106:0x03a1, B:108:0x03b1, B:110:0x03b7, B:112:0x03cb, B:114:0x03d1, B:115:0x03d3, B:116:0x03dc, B:117:0x0403, B:123:0x0418, B:125:0x042a, B:127:0x0430, B:129:0x0438, B:132:0x0449, B:133:0x0450, B:142:0x02dd, B:143:0x01b1, B:145:0x0077, B:147:0x007d, B:149:0x008e, B:152:0x0094, B:154:0x00ae), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(hm5.c r28, int r29, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r30, java.lang.String r31, int r32, boolean r33, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a r34, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns r35, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r36) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18073x2b4e1ad6.b(hm5.c, int, com.tencent.mm.plugin.sns.ui.bs, java.lang.String, int, boolean, com.tencent.mm.pointers.PBool, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ks
    /* renamed from: getKey */
    public java.lang.String mo70790xb5884f29() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        java.lang.String str = this.f248773d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        return str;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        super.onLayout(z17, i17, i18, i19, i27);
        int lineCount = this.f248778i.getLineCount();
        int i28 = this.f248780n;
        if (i28 > 0 && lineCount > i28 && (c19762x487075a = this.f248784r) != null) {
            c19762x487075a.f38859x6ac9171 = true;
        }
        if (i28 > 0 && (hashMap = this.f248785s) != null) {
            if (this.f248774e) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                return;
            }
            this.f248774e = true;
            if (hashMap.get(this.f248773d) == null) {
                if (!this.f248781o) {
                    this.f248785s.put(this.f248773d, 0);
                } else if (lineCount <= this.f248780n) {
                    this.f248785s.put(this.f248773d, 0);
                } else {
                    this.f248785s.put(this.f248773d, 1);
                }
            }
            post(this.f248791y);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* renamed from: setClickableCallBack */
    public void m70791xdfebe125(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1 q1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickableCallBack", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        this.f248783q = q1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickableCallBack", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* renamed from: setCollapseibleLikeMap */
    public void m70792x3323dc04(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCollapseibleLikeMap", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        this.f248785s = hashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollapseibleLikeMap", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* renamed from: setLikeTvTag */
    public void m70793x51664a1f(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLikeTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17975x38b7a89e c17975x38b7a89e = this.f248778i;
        if (c17975x38b7a89e != null) {
            c17975x38b7a89e.setTag(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLikeTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* renamed from: setLikedTextTouchListener */
    public void m70794xe08b13bb(android.view.View.OnTouchListener onTouchListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLikedTextTouchListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17975x38b7a89e c17975x38b7a89e = this.f248778i;
        if (c17975x38b7a89e != null) {
            c17975x38b7a89e.setOnTouchListener(onTouchListener);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLikedTextTouchListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* renamed from: setOpClickListener */
    public void m70795x6485c939(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpClickListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        android.widget.LinearLayout linearLayout = this.f248777h;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpClickListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* renamed from: setOpTvTag */
    public void m70796x6507a195(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        android.widget.LinearLayout linearLayout = this.f248777h;
        if (linearLayout != null) {
            linearLayout.setTag(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public C18073x2b4e1ad6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f248773d = null;
        this.f248774e = true;
        this.f248775f = null;
        this.f248776g = null;
        this.f248777h = null;
        this.f248778i = null;
        this.f248779m = new android.text.SpannableStringBuilder(" ");
        this.f248780n = 0;
        this.f248781o = false;
        this.f248782p = 0;
        this.f248783q = null;
        this.f248784r = null;
        this.f248785s = null;
        this.f248786t = null;
        this.f248787u = null;
        this.f248791y = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dl(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.csd, this);
        this.f248775f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n9u);
        this.f248776g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.n9s);
        this.f248777h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.n9t);
        this.f248778i = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17975x38b7a89e) findViewById(com.p314xaae8f345.mm.R.id.n9v);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }
}
