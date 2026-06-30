package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.TempSecureEditText */
/* loaded from: classes9.dex */
public final class C27998xb3daf402 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22669xa5de5760 {

    /* renamed from: AREA_ID_CARD_TYPE_HUIXIANG */
    public static final int f62857x6a79d1b5 = 5;

    /* renamed from: AREA_ID_CARD_TYPE_SHENFEN */
    public static final int f62858x32e7e009 = 1;

    /* renamed from: AREA_ID_CARD_TYPE_TAIBAO */
    public static final int f62859xb06394dc = 9;

    /* renamed from: BANK_CARD_LENGTH_LIMIT */
    private static int f62860xe8ca628e = 14;

    /* renamed from: CARD_TAIL_SPACE */
    private static int f62861x579f64c6 = 15;

    /* renamed from: CVV_4_PAYMENT_LENGTH */
    private static int f62862xb469e946 = 4;

    /* renamed from: CVV_PAYMENT_LENGTH */
    private static int f62863x8664d8db = 3;

    /* renamed from: PASSWD_BLACK_DOT_SIZE */
    private static int f62864xe2dbd578 = 7;

    /* renamed from: PASSWD_LEFT_PADDING */
    private static int f62865xe6f703ba = -1500000;

    /* renamed from: VALID_THRU_LEN */
    private static int f62866x9e0c9a70 = 4;

    /* renamed from: mTimeStamp */
    private static java.lang.String f62867x7c3d8309;

    /* renamed from: PASSWD_LENGTH */
    private int f62868x192577a7;

    /* renamed from: mCardTailNum */
    private java.lang.String f62869x6fcc7939;

    /* renamed from: mClearBtnImg */
    private android.graphics.drawable.Drawable f62870x2e87b9c7;

    /* renamed from: mDensity */
    private float f62871xfaa547bb;

    /* renamed from: mEditState */
    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState f62872xad4e6ba;

    /* renamed from: mFilterChar */
    private char[] f62873x7f984f3b;

    /* renamed from: mFixedHeaderText */
    private java.lang.String f62874x2d99bfc1;

    /* renamed from: mIDCardPaint */
    private android.graphics.Paint f62875x75785c6;

    /* renamed from: mIEncrypt */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 f62876xc3c4d949;

    /* renamed from: mIsCardTailNumCanDisplay */
    private boolean f62877x82eb9121;

    /* renamed from: mIsSelfSet */
    private boolean f62878xce1032ff;

    /* renamed from: mIsUseOfKinda */
    private boolean f62879x5a923a06;

    /* renamed from: mKindaEditTextCallBackListener */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.IKindaEditTextCallBackListener f62880x640657b0;

    /* renamed from: mNewPwdStyle */
    private boolean f62881xadeb7787;

    /* renamed from: mPaintBackground */
    private android.graphics.Paint f62882x75d3fbff;

    /* renamed from: mPasswdBgPaint */
    private android.graphics.Paint f62883x15e33f2e;

    /* renamed from: mPasswdListener */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27996x5a23ec21 f62884x5be0673f;

    /* renamed from: mPasswdSeparedPaint */
    private android.graphics.Paint f62885x8615c41b;

    /* renamed from: mTitlePaint */
    private android.graphics.Paint f62886x71a29533;

    /* renamed from: regExFilterInput */
    private java.lang.String f62887xd87dcc4b;

    /* renamed from: com.tenpay.android.wechat.TempSecureEditText$6, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TempSecureEditText$EditState */
        static final /* synthetic */ int[] f62893xafbfea98;

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TempSecureEditText$EncryptMode */
        static final /* synthetic */ int[] f62894xd544bb59;

        static {
            int[] iArr = new int[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EncryptMode.m121567xcee59d22().length];
            f62894xd544bb59 = iArr;
            try {
                iArr[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EncryptMode.RSA1024_WITH_MD5.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f62894xd544bb59[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EncryptMode.RSA2048_WITH_MD5.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f62894xd544bb59[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EncryptMode.SM2_WITH_MD5.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f62894xd544bb59[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EncryptMode.SM2_WITH_PKKDF2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.m121563xcee59d22().length];
            f62893xafbfea98 = iArr2;
            try {
                iArr2[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.BANKCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f62893xafbfea98[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.BANKCARD_WITH_TAILNUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f62893xafbfea98[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.VALID_THRU.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f62893xafbfea98[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.SECURITY_ANSWER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f62893xafbfea98[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f62893xafbfea98[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f62893xafbfea98[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f62893xafbfea98[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: com.tenpay.android.wechat.TempSecureEditText$EditState */
    /* loaded from: classes9.dex */
    public enum EditState {
        DEFAULT,
        PASSWORD,
        BANKCARD,
        BANKCARD_WITH_TAILNUM,
        VALID_THRU,
        MONEY_AMOUNT,
        CVV_PAYMENT,
        CVV_4_PAYMENT,
        SECURITY_ANSWER,
        IDCARD_TAIL
    }

    /* renamed from: com.tenpay.android.wechat.TempSecureEditText$EncryptMode */
    /* loaded from: classes9.dex */
    public enum EncryptMode {
        RSA1024_WITH_MD5,
        RSA2048_WITH_MD5,
        SM2_WITH_MD5,
        SM2_WITH_PKKDF2
    }

    /* renamed from: com.tenpay.android.wechat.TempSecureEditText$IKindaEditTextCallBackListener */
    /* loaded from: classes9.dex */
    public interface IKindaEditTextCallBackListener {
        /* renamed from: onCallBackKinda */
        void m121568xff698e49();
    }

    public C27998xb3daf402(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: drawCardTailNum */
    private void m121510xcadbb002(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.BANKCARD_WITH_TAILNUM == this.f62872xad4e6ba && this.f62877x82eb9121) {
            int baseline = getBaseline();
            if (baseline == -1) {
                baseline = 44;
            }
            canvas.drawText(this.f62869x6fcc7939, (f62861x579f64c6 * this.f62871xfaa547bb) + getPaint().measureText(getText().toString()), baseline, this.f62886x71a29533);
        }
    }

    /* renamed from: drawCvv4PaymentDot */
    private void m121511xa0a024d8(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT != this.f62872xad4e6ba || this.f62882x75d3fbff == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / f62862xb469e946;
        int length = getText().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, f62864xe2dbd578 * this.f62871xfaa547bb, this.f62882x75d3fbff);
        }
    }

    /* renamed from: drawCvvPaymentDot */
    private void m121512x70170542(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT != this.f62872xad4e6ba || this.f62882x75d3fbff == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / f62863x8664d8db;
        int length = getText().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, f62864xe2dbd578 * this.f62871xfaa547bb, this.f62882x75d3fbff);
        }
    }

    /* renamed from: drawIdCardTail */
    private void m121513x28a3861f(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.IDCARD_TAIL != this.f62872xad4e6ba || this.f62875x75785c6 == null) {
            return;
        }
        int width = getWidth() / 4;
        java.lang.String obj = getText().toString();
        int length = obj.length();
        this.f62875x75785c6.setTextSize(getTextSize());
        int i17 = 0;
        while (i17 < length) {
            int i18 = i17 + 1;
            canvas.drawText(obj.substring(i17, i18), (width / 2) + (i17 * width), getBaseline(), this.f62875x75785c6);
            i17 = i18;
        }
    }

    /* renamed from: drawPasswdDot */
    private void m121514xd12f8ce7(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD != this.f62872xad4e6ba || this.f62882x75d3fbff == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.f62868x192577a7;
        int length = getText().length();
        int i18 = 0;
        if (!this.f62881xadeb7787) {
            while (i18 < length) {
                canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, f62864xe2dbd578 * this.f62871xfaa547bb, this.f62882x75d3fbff);
                i18++;
            }
            for (int i19 = 1; i19 < this.f62868x192577a7; i19++) {
                float f17 = i17 * i19;
                canvas.drawLine(f17, 0.0f, f17, height, this.f62885x8615c41b);
            }
            return;
        }
        int b17 = i65.a.b(getContext(), 8);
        int i27 = this.f62868x192577a7;
        int i28 = (width - ((i27 - 1) * b17)) / i27;
        int i29 = height - i28;
        while (i18 < this.f62868x192577a7) {
            float f18 = (i28 + b17) * i18;
            float f19 = i28;
            float f27 = f18 + f19;
            float f28 = i29;
            android.graphics.RectF rectF = new android.graphics.RectF(f18, f28, f27, i28 + i29);
            float b18 = i65.a.b(getContext(), 4);
            canvas.drawRoundRect(rectF, b18, b18, this.f62883x15e33f2e);
            if (i18 < length) {
                canvas.drawCircle((f18 + f27) / 2.0f, (f19 / 2.0f) + f28, i65.a.b(getContext(), 4), this.f62882x75d3fbff);
            }
            i18++;
        }
    }

    /* renamed from: getInputText */
    private java.lang.String m121515x652b8d61() {
        java.lang.String obj = this.f62872xad4e6ba == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.SECURITY_ANSWER ? getText().toString() : getText().toString().trim();
        if (obj == null || obj.length() == 0) {
            return null;
        }
        int i17 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.AnonymousClass6.f62893xafbfea98[this.f62872xad4e6ba.ordinal()];
        if (i17 == 1) {
            obj = obj.replaceAll(" ", "");
        } else if (i17 == 2) {
            obj = obj.replaceAll(" ", "");
            java.lang.String str = this.f62869x6fcc7939;
            if (str != null && str.length() > 0) {
                obj = obj + this.f62869x6fcc7939;
            }
        } else if (i17 == 3) {
            obj = obj.replaceAll("/", "");
            if (obj != null && obj.length() == f62866x9e0c9a70) {
                java.lang.String substring = obj.substring(0, 2);
                obj = obj.substring(2) + substring;
            }
        } else if (i17 != 4) {
            obj = obj.replaceAll(" ", "").replaceAll("x", "X");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f62887xd87dcc4b)) {
            return obj;
        }
        java.lang.String trim = java.util.regex.Pattern.compile(this.f62887xd87dcc4b).matcher(obj).replaceAll("").trim();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TempSecureEditText", "use filter");
        return trim;
    }

    /* renamed from: init */
    private void m121516x316510(android.content.Context context, android.util.AttributeSet attributeSet) {
        int[] m121661x578eb8af;
        android.content.res.TypedArray obtainStyledAttributes;
        this.f62871xfaa547bb = getResources().getDisplayMetrics().density;
        if (attributeSet != null && (m121661x578eb8af = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121661x578eb8af(context, "TempSecureEditText")) != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m121661x578eb8af)) != null) {
            m121549xbc8182be(obtainStyledAttributes.getBoolean(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TempSecureEditText_isPassword"), false), true);
            m121544x6347c2af(obtainStyledAttributes.getBoolean(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TempSecureEditText_isBankcard"), false));
            m121551x744cf207(obtainStyledAttributes.getBoolean(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TempSecureEditText_isValidThru"), false));
            m121537x8f8ccf68(obtainStyledAttributes.getString(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TempSecureEditText_bankcardTailNum")));
            int resourceId = obtainStyledAttributes.getResourceId(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TempSecureEditText_rightClearDrawable"), 0);
            if (resourceId != 0) {
                m121538xd30bb48a(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
        addTextChangedListener(new android.text.TextWatcher() { // from class: com.tenpay.android.wechat.TempSecureEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }
        });
    }

    /* renamed from: setSalt */
    public static void m121518x764fefd8(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TempSecureEditText", "check salt: %s", str);
        if ((java.lang.Integer.decode(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g).intValue() & 255) < 48) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TempSecureEditText", "check salt stack: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        f62867x7c3d8309 = str;
    }

    /* renamed from: ClearInput */
    public void m121519x49eb759d() {
        setText("");
    }

    /* renamed from: get3DesEncrptData */
    public java.lang.String m121520x7d902dbb() {
        java.lang.String m121515x652b8d61 = m121515x652b8d61();
        if (m121515x652b8d61 == null || m121515x652b8d61.length() == 0) {
            return null;
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925 = this.f62876xc3c4d949;
        if (interfaceC27988x58d9925 != null) {
            return interfaceC27988x58d9925.mo121431xea62cd8a(m121515x652b8d61, f62867x7c3d8309);
        }
        return new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121799xea62cd8a(m121515x652b8d61);
    }

    /* renamed from: get3DesVerifyCode */
    public java.lang.String m121522xa958131b() {
        java.lang.String m121515x652b8d61 = m121515x652b8d61();
        if (m121515x652b8d61 == null || m121515x652b8d61.length() == 0) {
            return null;
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925 = this.f62876xc3c4d949;
        return interfaceC27988x58d9925 != null ? interfaceC27988x58d9925.mo121432x19b57b7a(m121515x652b8d61, f62867x7c3d8309) : new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121801x19b57b7a(m121515x652b8d61);
    }

    /* renamed from: getClearBtnDrawable */
    public android.graphics.drawable.Drawable m121523x514f9e03() {
        return this.f62870x2e87b9c7;
    }

    /* renamed from: getEditState */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState m121524x8f8b0df1() {
        return this.f62872xad4e6ba;
    }

    /* renamed from: getEncryptDataWithHash */
    public java.lang.String m121525x15a9108d(boolean z17) {
        return m121526x15a9108d(z17, false);
    }

    /* renamed from: getEncryptPassword */
    public java.lang.String m121527xcaa6edea(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EncryptMode encryptMode, long j17, java.lang.String str) {
        java.lang.String m121515x652b8d61 = m121515x652b8d61();
        java.lang.String str2 = null;
        if (m121515x652b8d61 == null || m121515x652b8d61.length() == 0) {
            return null;
        }
        java.lang.String m121663xf830e4e1 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121663xf830e4e1(m121515x652b8d61);
        int i17 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.AnonymousClass6.f62894xd544bb59[encryptMode.ordinal()];
        if (i17 == 1) {
            com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
            java.lang.String str3 = f62867x7c3d8309;
            if (str3 != null) {
                c28013x36bca45.m121808x5d476ab4(str3);
            }
            return c28013x36bca45.m121802xd26bb163(m121663xf830e4e1);
        }
        if (i17 == 2) {
            com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca452 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
            java.lang.String str4 = f62867x7c3d8309;
            if (str4 != null) {
                c28013x36bca452.m121808x5d476ab4(str4);
            }
            return c28013x36bca452.m121803x8b1ff279(m121663xf830e4e1);
        }
        if (i17 == 3) {
            try {
                str2 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121934xe6451c20(m121663xf830e4e1, j17, str, 6);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WxSmCryptoUtil", e17, "", new java.lang.Object[0]);
            }
            int m121936x75feee5c = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121936x75feee5c();
            if (m121936x75feee5c != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxSmCryptoUtil", "SM2_WITH_MD5 encryptPassword error, error code:%d", java.lang.Integer.valueOf(m121936x75feee5c));
            }
            return str2;
        }
        if (i17 != 4) {
            return null;
        }
        try {
            str2 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121934xe6451c20(m121663xf830e4e1, j17, str, 7);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WxSmCryptoUtil", e18, "", new java.lang.Object[0]);
        }
        int m121936x75feee5c2 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121936x75feee5c();
        if (m121936x75feee5c2 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxSmCryptoUtil", "SM2_WITH_PBKDF2 encryptPassword error, error code:%d", java.lang.Integer.valueOf(m121936x75feee5c2));
        }
        return str2;
    }

    /* renamed from: getInputLength */
    public int m121528xbad2461a() {
        java.lang.String m121515x652b8d61 = m121515x652b8d61();
        if (m121515x652b8d61 == null) {
            return 0;
        }
        return m121515x652b8d61.length();
    }

    /* renamed from: isAreaIDCardNum */
    public boolean m121529xff9f1dc4(int i17) {
        java.lang.String trim = getText().toString().trim();
        if (trim == null || trim.length() == 0) {
            return false;
        }
        trim.replaceAll(" ", "");
        if (i17 != 1) {
            return true;
        }
        return m121534x593c5956();
    }

    /* renamed from: isBankcardNum */
    public boolean m121530x7cde7910() {
        return m121528xbad2461a() >= f62860xe8ca628e || getText().toString().contains("**");
    }

    /* renamed from: isMatchPattern */
    public boolean m121531xf3340455(java.lang.String str) {
        if (str != null) {
            try {
                return java.util.regex.Pattern.compile(str).matcher(m121515x652b8d61()).matches();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: isMoneyAmount */
    public boolean m121532x245c69ae() {
        return m121531xf3340455("^\\d+(\\.\\d{0,2})?$");
    }

    /* renamed from: isPhoneNum */
    public boolean m121533x846a7e82() {
        return getText().toString().trim().length() == 11 || getText().toString().contains("**");
    }

    /* renamed from: isUserIdNum */
    public boolean m121534x593c5956() {
        return m121528xbad2461a() == 15 ? m121531xf3340455("^\\d{15}$") : com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121662x1f88d796(getText().toString().trim());
    }

    /* renamed from: isValidThru */
    public boolean m121535x41137c9() {
        return m121531xf3340455("[1-9][0-9]0[1-9]$|[1-9][0-9]1[0-2]$");
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if ((getInputType() & 128) <= 0) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD;
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState2 = this.f62872xad4e6ba;
            if (editState == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT == editState2) {
                return;
            }
            super.onCreateContextMenu(contextMenu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState = this.f62872xad4e6ba;
        if (editState == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.IDCARD_TAIL) {
            m121513x28a3861f(canvas);
        } else if (editState == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD || editState == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT || editState == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT) {
            m121514xd12f8ce7(canvas);
            m121512x70170542(canvas);
            m121511xa0a024d8(canvas);
        } else {
            super.onDraw(canvas);
            m121510xcadbb002(canvas);
        }
        if (android.text.TextUtils.isEmpty(this.f62874x2d99bfc1)) {
            return;
        }
        canvas.drawText(this.f62874x2d99bfc1, 0.0f, ((getMeasuredHeight() - getTextSize()) / 2.0f) + getTextSize(), getPaint());
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int i27;
        int length;
        int length2;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27996x5a23ec21 interfaceC27996x5a23ec21;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27996x5a23ec21 interfaceC27996x5a23ec212;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27996x5a23ec21 interfaceC27996x5a23ec213;
        super.onTextChanged(charSequence, i17, i18, i19);
        if (this.f62873x7f984f3b != null && !android.text.TextUtils.isEmpty(charSequence)) {
            for (int i28 = i17; i28 < i17 + i19; i28++) {
                for (char c17 : this.f62873x7f984f3b) {
                    if (c17 == charSequence.charAt(i28)) {
                        java.lang.String charSequence2 = charSequence.toString();
                        setText(charSequence2.substring(0, i28) + charSequence2.substring(i28 + 1));
                        setSelection(i28);
                        return;
                    }
                }
            }
        }
        java.lang.String obj = getText().toString();
        this.f62877x82eb9121 = obj != null && obj.length() > 0;
        int i29 = 3;
        if (isFocused() && this.f62870x2e87b9c7 != null) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD;
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState2 = this.f62872xad4e6ba;
            if (editState != editState2 && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT != editState2 && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT != editState2) {
                if (getText().toString().equals("")) {
                    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
                } else {
                    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f62870x2e87b9c7, getCompoundDrawables()[3]);
                }
            }
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState3 = this.f62872xad4e6ba;
        if (editState3 != null) {
            try {
                int i37 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.AnonymousClass6.f62893xafbfea98[editState3.ordinal()];
                if (i37 == 1 || i37 == 2) {
                    if (this.f62878xce1032ff) {
                        this.f62878xce1032ff = false;
                        return;
                    }
                    int i38 = i17 + i19;
                    if (obj.length() > 0) {
                        if (i38 <= obj.length()) {
                            java.lang.String substring = obj.substring(0, i38);
                            i27 = substring.length() - substring.replaceAll(" ", "").length();
                        } else {
                            i27 = 0;
                        }
                        java.lang.String replaceAll = obj.replaceAll(" ", "");
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                        int length3 = replaceAll.length();
                        int i39 = 0;
                        while (true) {
                            int i47 = i39 + 4;
                            if (i47 >= length3) {
                                break;
                            }
                            stringBuffer.append(replaceAll.substring(i39, i47));
                            stringBuffer.append(" ");
                            i39 = i47;
                        }
                        stringBuffer.append(replaceAll.substring(i39));
                        java.lang.String stringBuffer2 = stringBuffer.toString();
                        if (i38 <= stringBuffer2.length()) {
                            java.lang.String substring2 = stringBuffer2.substring(0, i38);
                            java.lang.String replaceAll2 = substring2.replaceAll(" ", "");
                            length = substring2.length();
                            length2 = replaceAll2.length();
                        } else {
                            java.lang.String replaceAll3 = stringBuffer2.replaceAll(" ", "");
                            length = stringBuffer2.length();
                            length2 = replaceAll3.length();
                        }
                        this.f62878xce1032ff = true;
                        setText(stringBuffer2);
                        setSelection((i38 + (length - length2)) - i27);
                        return;
                    }
                    return;
                }
                if (i37 != 3) {
                    if (i37 == 5) {
                        if (obj.length() != this.f62868x192577a7 || (interfaceC27996x5a23ec21 = this.f62884x5be0673f) == null) {
                            return;
                        }
                        interfaceC27996x5a23ec21.mo121504xc3989e01();
                        return;
                    }
                    if (i37 == 6) {
                        if (obj.length() != f62863x8664d8db || (interfaceC27996x5a23ec212 = this.f62884x5be0673f) == null) {
                            return;
                        }
                        interfaceC27996x5a23ec212.mo121504xc3989e01();
                        return;
                    }
                    if (i37 == 7 && obj.length() == f62862xb469e946 && (interfaceC27996x5a23ec213 = this.f62884x5be0673f) != null) {
                        interfaceC27996x5a23ec213.mo121504xc3989e01();
                        return;
                    }
                    return;
                }
                if (this.f62878xce1032ff) {
                    this.f62878xce1032ff = false;
                    return;
                }
                int length4 = obj.length();
                if (length4 != 0 && length4 != 1) {
                    java.lang.String replace = obj.replace("/", "");
                    if (length4 != 2 || !obj.contains("/")) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(replace.substring(0, 2));
                        sb6.append("/");
                        if (replace.length() > 2) {
                            sb6.append(replace.substring(2));
                        }
                        replace = sb6.toString();
                    }
                    int selectionStart = getSelectionStart();
                    this.f62878xce1032ff = true;
                    setText(replace);
                    if (length4 != 2) {
                        setSelection(selectionStart);
                        return;
                    }
                    if (obj.contains("/")) {
                        setSelection(1);
                    } else if (selectionStart == 2) {
                        if (i19 <= i18) {
                            i29 = 2;
                        }
                        setSelection(i29);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if ((getInputType() & 128) > 0) {
            return true;
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState2 = this.f62872xad4e6ba;
        if (editState == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT == editState2 || editState2 == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.IDCARD_TAIL) {
            return true;
        }
        return super.onTextContextMenuItem(i17);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.f62879x5a923a06) {
            clearFocus();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: set3DesEncrptData */
    public void m121536x458695c7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        setText(c28013x36bca45.m121798xe82f2162(str, c28013x36bca45.m121807xce19d7e6()));
    }

    /* renamed from: setBankcardTailNum */
    public void m121537x8f8ccf68(java.lang.String str) {
        this.f62869x6fcc7939 = str;
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.BANKCARD_WITH_TAILNUM;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f62886x71a29533 = paint;
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
        this.f62886x71a29533.setAntiAlias(true);
        this.f62886x71a29533.setTextSize(getTextSize());
        this.f62875x75785c6.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
    }

    /* renamed from: setClearBtnDrawableId */
    public void m121538xd30bb48a(int i17) {
        m121539xd30bb48a(i17, 0);
    }

    /* renamed from: setCursorStyle */
    public void m121541x12027a39(int i17) {
        if (i17 == -1) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: setFilterChar */
    public void m121542xbfcb5cf0(char[] cArr) {
        this.f62873x7f984f3b = cArr;
    }

    /* renamed from: setFixedHeaderText */
    public void m121543x7923fb2c(java.lang.String str) {
        this.f62874x2d99bfc1 = str;
        setPadding(((int) getPaint().measureText(this.f62874x2d99bfc1)) + getPaddingLeft(), getPaddingTop(), getPaddingBottom(), getPaddingRight());
        invalidate();
    }

    /* renamed from: setIsBankcardFormat */
    public void m121544x6347c2af(boolean z17) {
        if (z17) {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.BANKCARD;
        } else if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.BANKCARD == this.f62872xad4e6ba) {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
        }
    }

    /* renamed from: setIsCvv4PaymentFormat */
    public void m121545x1f38bf20(boolean z17) {
        if (!z17) {
            this.f62882x75d3fbff = null;
            if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT == this.f62872xad4e6ba) {
                this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
                return;
            }
            return;
        }
        setPadding(f62865xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f62882x75d3fbff = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f62875x75785c6.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT;
    }

    /* renamed from: setIsCvvPaymentFormat */
    public void m121546x85af8146(boolean z17) {
        if (!z17) {
            this.f62882x75d3fbff = null;
            if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT == this.f62872xad4e6ba) {
                this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
                return;
            }
            return;
        }
        setPadding(f62865xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f62882x75d3fbff = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f62875x75785c6.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT;
    }

    /* renamed from: setIsIdCardTailFormat */
    public void m121547xc6654ede(boolean z17) {
        if (!z17) {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
            return;
        }
        setPadding(f62865xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.IDCARD_TAIL;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f62875x75785c6 = paint;
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
        this.f62875x75785c6.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f62875x75785c6.setAntiAlias(true);
        this.f62875x75785c6.setTextSize(getTextSize());
        this.f62875x75785c6.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
    }

    /* renamed from: setIsMoneyAmountFormat */
    public void m121548xf65f6f83(boolean z17) {
        if (z17) {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.MONEY_AMOUNT;
        } else if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.MONEY_AMOUNT == this.f62872xad4e6ba) {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
        }
    }

    /* renamed from: setIsPasswordFormat */
    public void m121549xbc8182be(boolean z17, boolean z18) {
        if (!z17) {
            this.f62882x75d3fbff = null;
            if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD == this.f62872xad4e6ba) {
                this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
                return;
            }
            return;
        }
        this.f62881xadeb7787 = z18;
        setPadding(f62865xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f62882x75d3fbff = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f62882x75d3fbff.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        } else {
            this.f62882x75d3fbff.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        }
        this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f62885x8615c41b = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f62885x8615c41b.setStrokeWidth(1.5f);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f62885x8615c41b.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836));
        } else {
            this.f62885x8615c41b.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        }
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f62883x15e33f2e = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f62883x15e33f2e.setColor(218103807);
        } else {
            this.f62883x15e33f2e.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        }
    }

    /* renamed from: setIsSecurityAnswerFormat */
    public void m121550x930fe401(boolean z17) {
        if (z17) {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.SECURITY_ANSWER;
        } else {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
        }
    }

    /* renamed from: setIsValidThru */
    public void m121551x744cf207(boolean z17) {
        if (z17) {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.VALID_THRU;
        } else if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.VALID_THRU == this.f62872xad4e6ba) {
            this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
        }
    }

    /* renamed from: setKindaEditTextCallBackListener */
    public void m121552xd642bbdb(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.IKindaEditTextCallBackListener iKindaEditTextCallBackListener) {
        this.f62880x640657b0 = iKindaEditTextCallBackListener;
    }

    /* renamed from: setOnPasswdInputListener */
    public void m121553xc90120ff(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27996x5a23ec21 interfaceC27996x5a23ec21) {
        this.f62884x5be0673f = interfaceC27996x5a23ec21;
    }

    /* renamed from: setPwdLength */
    public void m121554xb4bfea41(int i17) {
        this.f62868x192577a7 = i17;
    }

    /* renamed from: setSecureEncrypt */
    public void m121555xbde60dac(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925) {
        this.f62876xc3c4d949 = interfaceC27988x58d9925;
    }

    /* renamed from: setUseOfKinda */
    public void m121556x5df72a31(boolean z17) {
        this.f62879x5a923a06 = z17;
    }

    /* renamed from: setValidThru */
    public void m121557x19952791(java.lang.String str) {
        if (str == null || str.length() != f62866x9e0c9a70) {
            return;
        }
        setText(str);
        this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.VALID_THRU;
    }

    /* renamed from: setregExFilterInput */
    public void m121558x568e84ad(java.lang.String str) {
        this.f62887xd87dcc4b = str;
    }

    public C27998xb3daf402(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
        this.f62881xadeb7787 = true;
        this.f62868x192577a7 = 6;
        this.f62876xc3c4d949 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28002xcd8b6923();
        m121516x316510(context, attributeSet);
    }

    /* renamed from: getEncryptDataWithHash */
    public java.lang.String m121526x15a9108d(boolean z17, boolean z18) {
        java.lang.String m121515x652b8d61 = m121515x652b8d61();
        if (m121515x652b8d61 == null || m121515x652b8d61.length() == 0) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TempSecureEditText", "timestamp: %s, 2048: %s", f62867x7c3d8309, java.lang.Boolean.valueOf(z18));
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925 = this.f62876xc3c4d949;
        if (interfaceC27988x58d9925 != null) {
            if (z18) {
                return interfaceC27988x58d9925.mo121434x8b1ff279(z17, m121515x652b8d61, f62867x7c3d8309);
            }
            return interfaceC27988x58d9925.mo121433xd26bb163(z17, m121515x652b8d61, f62867x7c3d8309);
        }
        if (z17) {
            m121515x652b8d61 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121663xf830e4e1(m121515x652b8d61);
        }
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        java.lang.String str = f62867x7c3d8309;
        if (str != null) {
            c28013x36bca45.m121808x5d476ab4(str);
        }
        if (z18) {
            return c28013x36bca45.m121803x8b1ff279(m121515x652b8d61);
        }
        return c28013x36bca45.m121802xd26bb163(m121515x652b8d61);
    }

    /* renamed from: setClearBtnDrawableId */
    public void m121539xd30bb48a(int i17, int i18) {
        m121540xd30bb48a(i17, i18, 0, 0);
    }

    /* renamed from: setClearBtnDrawableId */
    public void m121540xd30bb48a(int i17, int i18, int i19, int i27) {
        try {
            android.graphics.drawable.Drawable drawable = getResources().getDrawable(i17);
            this.f62870x2e87b9c7 = drawable;
            if (i18 != 0) {
                drawable.setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        } catch (java.lang.Exception unused) {
            this.f62870x2e87b9c7 = null;
        }
        android.graphics.drawable.Drawable drawable2 = this.f62870x2e87b9c7;
        if (drawable2 != null) {
            if (i19 != 0 && i27 != 0) {
                drawable2.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(getContext(), i19), com.p314xaae8f345.mm.ui.zk.a(getContext(), i27));
            } else {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f62870x2e87b9c7.getIntrinsicHeight());
            }
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.android.wechat.TempSecureEditText.2
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    if (!z17) {
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 c27998xb3daf402 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this;
                        c27998xb3daf402.setCompoundDrawables(c27998xb3daf402.getCompoundDrawables()[0], com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.getCompoundDrawables()[1], null, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.getCompoundDrawables()[3]);
                    } else {
                        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.getText().toString().equals("")) {
                            return;
                        }
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD;
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 c27998xb3daf4022 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this;
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState2 = c27998xb3daf4022.f62872xad4e6ba;
                        if (editState == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT == editState2) {
                            return;
                        }
                        c27998xb3daf4022.setCompoundDrawables(c27998xb3daf4022.getCompoundDrawables()[0], com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.getCompoundDrawables()[1], com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.f62870x2e87b9c7, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.getCompoundDrawables()[3]);
                    }
                }
            });
            setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.TempSecureEditText.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.PASSWORD;
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 c27998xb3daf402 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this;
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState editState2 = c27998xb3daf402.f62872xad4e6ba;
                    if (editState != editState2 && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_PAYMENT != editState2 && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.CVV_4_PAYMENT != editState2) {
                        if (motionEvent.getAction() == 1 && !c27998xb3daf402.isFocused() && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.f62880x640657b0 != null) {
                            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.f62880x640657b0.m121568xff698e49();
                        }
                        if (c27998xb3daf402.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > (c27998xb3daf402.getWidth() - c27998xb3daf402.getPaddingRight()) - com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.this.f62870x2e87b9c7.getIntrinsicWidth()) {
                            c27998xb3daf402.setText("");
                        }
                    }
                    return false;
                }
            });
            return;
        }
        setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.android.wechat.TempSecureEditText.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z17) {
            }
        });
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.TempSecureEditText.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return false;
            }
        });
    }

    /* renamed from: isMatchPattern */
    private boolean m121517xf3340455(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            try {
                return java.util.regex.Pattern.compile(str2).matcher(str).matches();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: get3DesEncrptData */
    public java.lang.String m121521x7d902dbb(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925 = this.f62876xc3c4d949;
        if (interfaceC27988x58d9925 != null) {
            return interfaceC27988x58d9925.mo121431xea62cd8a(str, f62867x7c3d8309);
        }
        return new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121799xea62cd8a(str);
    }

    public C27998xb3daf402(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f62872xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402.EditState.DEFAULT;
        this.f62881xadeb7787 = true;
        this.f62868x192577a7 = 6;
        this.f62876xc3c4d949 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28002xcd8b6923();
        m121516x316510(context, attributeSet);
    }
}
