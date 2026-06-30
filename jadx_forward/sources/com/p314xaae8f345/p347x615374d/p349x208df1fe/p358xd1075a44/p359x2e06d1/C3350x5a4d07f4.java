package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKRichText */
/* loaded from: classes9.dex */
public class C3350x5a4d07f4 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3534x4489c18 {

    /* renamed from: linkCallback */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f13162x3a7e9a5f;

    /* renamed from: hasLinkAndCanCallback */
    public boolean f13161x400c40b2 = false;

    /* renamed from: spanText */
    private android.text.SpannableStringBuilder f13163x7a9cfb97 = new android.text.SpannableStringBuilder("");

    /* renamed from: textArray */
    private java.util.ArrayList<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.PayTextContent> f13165xc080712c = new java.util.ArrayList<>();

    /* renamed from: supportDynamicSize */
    public boolean f13164x20fafd91 = true;

    /* renamed from: defaultTextSize */
    public float f13160x3b45a42f = 0.0f;

    /* renamed from: baselineAlign */
    private boolean f13159xf75e3c0 = false;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKRichText$MMKLink */
    /* loaded from: classes9.dex */
    public static class MMKLink implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5 {

        /* renamed from: bgColor */
        private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f13168xf3ca161e;

        /* renamed from: bgRadius */
        private int f13169x9e485d37;

        /* renamed from: clickCallback */
        private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f13170xf80241ed;

        /* renamed from: linkColor */
        private int f13174x9da27b89;

        /* renamed from: linkStyle */
        private com.p314xaae8f345.p347x615374d.gen.EnumC3576x15f889b7 f13175x9e8669d7;

        /* renamed from: text */
        private java.lang.String f13178x36452d;

        /* renamed from: textFontName */
        private java.lang.String f13179x5cb67c7;

        /* renamed from: textSize */
        private float f13180xc42d3ace;

        /* renamed from: setLinkColor */
        private boolean f13176xf963ad47 = false;

        /* renamed from: hasCallBack */
        public boolean f13173xa102511f = false;

        /* renamed from: fontStyle */
        private com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 f13172xa38e7aa2 = com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.REGULAR;

        /* renamed from: supportDynamicSize */
        public boolean f13177x20fafd91 = true;

        /* renamed from: abtestOpen */
        public boolean f13166xda9a11d = false;

        /* renamed from: defaultTextSize */
        public float f13171x3b45a42f = 0.0f;

        /* renamed from: baselineAlign */
        public boolean f13167xf75e3c0 = false;

        /* renamed from: com.tencent.kinda.framework.widget.base.MMKRichText$MMKLink$CustomBaselineShiftSpan */
        /* loaded from: classes9.dex */
        public static class CustomBaselineShiftSpan extends android.text.style.MetricAffectingSpan {

            /* renamed from: shift */
            private final int f13181x6856c82;

            public CustomBaselineShiftSpan(int i17) {
                this.f13181x6856c82 = i17;
            }

            @Override // android.text.style.CharacterStyle
            public void updateDrawState(android.text.TextPaint textPaint) {
                textPaint.baselineShift += this.f13181x6856c82;
            }

            @Override // android.text.style.MetricAffectingSpan
            public void updateMeasureState(android.text.TextPaint textPaint) {
                textPaint.baselineShift += this.f13181x6856c82;
            }
        }

        /* renamed from: com.tencent.kinda.framework.widget.base.MMKRichText$MMKLink$LinkClickableSpan */
        /* loaded from: classes9.dex */
        public static class LinkClickableSpan extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

            /* renamed from: clickCallback */
            private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f13182xf80241ed;

            /* renamed from: linkColor */
            private int f13183x9da27b89;

            /* renamed from: linkStyle */
            private com.p314xaae8f345.p347x615374d.gen.EnumC3576x15f889b7 f13184x9e8669d7;

            public LinkClickableSpan(int i17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
                super(2, (r35.m3) null);
                this.f13183x9da27b89 = i17;
                this.f13182xf80241ed = abstractC3623x3b485619;
                mo63036x52d2f021(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
            }

            @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619 = this.f13182xf80241ed;
                if (abstractC3623x3b485619 != null) {
                    abstractC3623x3b485619.mo25801x2e7a5e();
                }
            }
        }

        /* renamed from: calculateBaselineShift */
        private int m27068x776f1b77(float f17, float f18) {
            android.graphics.Typeface m27320x5392760d;
            android.graphics.Typeface m27320x5392760d2;
            try {
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setTextSize(f17);
                if (!android.text.TextUtils.isEmpty(this.f13179x5cb67c7) && (m27320x5392760d2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3370xb6c8df3e.m27320x5392760d(this.f13179x5cb67c7)) != null) {
                    paint.setTypeface(m27320x5392760d2);
                }
                android.graphics.Paint paint2 = new android.graphics.Paint();
                paint2.setTextSize(f18);
                if (!android.text.TextUtils.isEmpty(this.f13179x5cb67c7) && (m27320x5392760d = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3370xb6c8df3e.m27320x5392760d(this.f13179x5cb67c7)) != null) {
                    paint2.setTypeface(m27320x5392760d);
                }
                android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                android.graphics.Paint.FontMetrics fontMetrics2 = paint2.getFontMetrics();
                return java.lang.Math.round(((fontMetrics.ascent + fontMetrics.descent) / 2.0f) - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKRichText", "计算baseline偏移失败: " + e17.getMessage());
                return 0;
            }
        }

        public android.text.SpannableString get() {
            android.text.SpannableString spannableString = new android.text.SpannableString("");
            if (this.f13178x36452d != null) {
                spannableString = new android.text.SpannableString(this.f13178x36452d);
            }
            if (!this.f13176xf963ad47 && com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
                this.f13174x9da27b89 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(java.lang.Long.parseLong("E6000000", 16), java.lang.Long.parseLong("CCFFFFFF", 16))));
            }
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.f13174x9da27b89), 0, spannableString.length(), 33);
            if (this.f13170xf80241ed != null) {
                spannableString.setSpan(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.MMKLink.LinkClickableSpan(this.f13174x9da27b89, this.f13170xf80241ed), 0, spannableString.length(), 33);
            }
            if (this.f13175x9e8669d7 == com.p314xaae8f345.p347x615374d.gen.EnumC3576x15f889b7.DELETED) {
                spannableString.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableString.length(), 33);
            }
            if (this.f13175x9e8669d7 == com.p314xaae8f345.p347x615374d.gen.EnumC3576x15f889b7.UNDERLINE) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 33);
            }
            float f17 = this.f13180xc42d3ace;
            if (this.f13166xda9a11d) {
                if (this.f13177x20fafd91) {
                    f17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) * this.f13180xc42d3ace;
                }
                if (f17 > 0.0f) {
                    spannableString.setSpan(new android.text.style.AbsoluteSizeSpan((int) f17, false), 0, spannableString.length(), 33);
                }
            }
            if (this.f13167xf75e3c0) {
                float f18 = this.f13171x3b45a42f;
                if (f18 > 0.0f && f17 > 0.0f && java.lang.Math.abs(f17 - f18) > 1.0f) {
                    spannableString.setSpan(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.MMKLink.CustomBaselineShiftSpan(m27068x776f1b77(this.f13171x3b45a42f, f17)), 0, spannableString.length(), 33);
                }
            }
            com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284 = this.f13168xf3ca161e;
            if (c3392x2ae78284 != null) {
                long m27189xf794c2a7 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284);
                int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
                spannableString.setSpan(new yl1.c(this.f13178x36452d, b17, b17, (int) f17, this.f13174x9da27b89, (int) m27189xf794c2a7, this.f13169x9e485d37), 0, spannableString.length(), 33);
            }
            if (!android.text.TextUtils.isEmpty(this.f13179x5cb67c7) || this.f13172xa38e7aa2 != com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.REGULAR) {
                spannableString.setSpan(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3370xb6c8df3e.KindaTypefaceSpan(this.f13179x5cb67c7, this.f13172xa38e7aa2), 0, spannableString.length(), 33);
            }
            return spannableString;
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5
        /* renamed from: setBackground */
        public void mo27069xccfd5b30(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284, int i17) {
            this.f13168xf3ca161e = c3392x2ae78284;
            this.f13169x9e485d37 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5
        /* renamed from: setFontStyle */
        public void mo27070xff4fac60(com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 enumC3399x1b009a82) {
            this.f13172xa38e7aa2 = enumC3399x1b009a82;
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5
        /* renamed from: setLinkCallbackImpl */
        public void mo27071x96d425a1(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
            if (abstractC3623x3b485619 != null) {
                this.f13170xf80241ed = abstractC3623x3b485619;
                this.f13173xa102511f = true;
            }
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5
        /* renamed from: setLinkColor */
        public void mo27072xf963ad47(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
            this.f13174x9da27b89 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27355x63f50df7(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284));
            this.f13176xf963ad47 = true;
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5
        /* renamed from: setLinkFont */
        public void mo27073xbdba41eb(java.lang.String str) {
            this.f13179x5cb67c7 = str;
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5
        /* renamed from: setLinkStyle */
        public void mo27074xfa479b95(com.p314xaae8f345.p347x615374d.gen.EnumC3576x15f889b7 enumC3576x15f889b7) {
            this.f13175x9e8669d7 = enumC3576x15f889b7;
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5
        /* renamed from: setText */
        public void mo27075x765074af(java.lang.String str) {
            this.f13178x36452d = str;
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5
        /* renamed from: setTextSize */
        public void mo27076x3abfd950(float f17) {
            this.f13180xc42d3ace = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, f17);
        }
    }

    /* renamed from: abtestOpen */
    private boolean m27063xda9a11d() {
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3534x4489c18
    /* renamed from: appendLink */
    public void mo27064x8077d634(com.p314xaae8f345.p347x615374d.gen.InterfaceC3476x44506e5 interfaceC3476x44506e5) {
        if (interfaceC3476x44506e5 == null || !(interfaceC3476x44506e5 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.MMKLink)) {
            return;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.MMKLink mMKLink = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.MMKLink) interfaceC3476x44506e5;
        if (m27063xda9a11d()) {
            mMKLink.f13166xda9a11d = true;
            this.f13165xc080712c.add(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.PayTextContent(mMKLink));
        } else {
            this.f13163x7a9cfb97.append((java.lang.CharSequence) mMKLink.get());
            this.f13161x400c40b2 = mMKLink.f13173xa102511f;
            this.f13162x3a7e9a5f = mMKLink.f13170xf80241ed;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3534x4489c18
    /* renamed from: appendText */
    public void mo27065x807b6b67(java.lang.String str) {
        if (str != null) {
            if (m27063xda9a11d()) {
                this.f13165xc080712c.add(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.PayTextContent(str));
                return;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = this.f13163x7a9cfb97;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ke0.e) xVar).getClass();
            spannableStringBuilder.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
        }
    }

    public java.lang.CharSequence get() {
        if (m27063xda9a11d() && !this.f13165xc080712c.isEmpty()) {
            for (int i17 = 0; i17 < this.f13165xc080712c.size(); i17++) {
                if (this.f13165xc080712c.get(i17).f13185x32affa != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.MMKLink mMKLink = this.f13165xc080712c.get(i17).f13185x32affa;
                    mMKLink.f13177x20fafd91 = this.f13164x20fafd91;
                    mMKLink.f13171x3b45a42f = this.f13160x3b45a42f;
                    mMKLink.f13167xf75e3c0 = this.f13159xf75e3c0;
                    this.f13163x7a9cfb97.append((java.lang.CharSequence) mMKLink.get());
                    this.f13161x400c40b2 = mMKLink.f13173xa102511f;
                    this.f13162x3a7e9a5f = mMKLink.f13170xf80241ed;
                } else {
                    android.text.SpannableStringBuilder spannableStringBuilder = this.f13163x7a9cfb97;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.lang.String str = this.f13165xc080712c.get(i17).f13186xab7d55c4;
                    ((ke0.e) xVar).getClass();
                    spannableStringBuilder.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
                }
            }
            this.f13165xc080712c.clear();
        }
        return this.f13163x7a9cfb97;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3534x4489c18
    /* renamed from: setBaselineAlign */
    public void mo27066x5fac067e(boolean z17) {
        this.f13159xf75e3c0 = z17;
    }

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKRichText$PayTextContent */
    /* loaded from: classes9.dex */
    public static class PayTextContent {

        /* renamed from: link */
        public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.MMKLink f13185x32affa;

        /* renamed from: textStr */
        public java.lang.String f13186xab7d55c4;

        public PayTextContent(java.lang.String str) {
            this.f13185x32affa = null;
            this.f13186xab7d55c4 = str;
        }

        public PayTextContent(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3350x5a4d07f4.MMKLink mMKLink) {
            this.f13186xab7d55c4 = "";
            this.f13185x32affa = mMKLink;
        }
    }
}
