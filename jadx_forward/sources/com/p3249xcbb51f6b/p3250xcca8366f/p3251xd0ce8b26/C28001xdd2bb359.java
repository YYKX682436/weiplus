package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.TenpaySecureEditText */
/* loaded from: classes9.dex */
public final class C28001xdd2bb359 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22669xa5de5760 {

    /* renamed from: AREA_ID_CARD_TYPE_HUIXIANG */
    public static final int f62912x6a79d1b5 = 5;

    /* renamed from: AREA_ID_CARD_TYPE_SHENFEN */
    public static final int f62913x32e7e009 = 1;

    /* renamed from: AREA_ID_CARD_TYPE_TAIBAO */
    public static final int f62914xb06394dc = 9;

    /* renamed from: PASSWD_BLACK_DOT_SIZE */
    private static int f62915xe2dbd578 = 7;

    /* renamed from: PASSWD_LEFT_PADDING */
    private static int f62916xe6f703ba = -1500000;

    /* renamed from: mTimeStamp */
    private static java.lang.String f62917x7c3d8309;

    /* renamed from: BANK_CARD_LENGTH_LIMIT */
    private int f62918xe8ca628e;

    /* renamed from: CARD_TAIL_SPACE */
    private int f62919x579f64c6;

    /* renamed from: CVV_4_PAYMENT_LENGTH */
    private int f62920xb469e946;

    /* renamed from: CVV_PAYMENT_LENGTH */
    private int f62921x8664d8db;

    /* renamed from: PASSWD_LENGTH */
    private int f62922x192577a7;

    /* renamed from: VALID_THRU_LEN */
    private int f62923x9e0c9a70;

    /* renamed from: mBackupListeners */
    private java.util.ArrayList<android.text.TextWatcher> f62924x5a170670;

    /* renamed from: mCardTailNum */
    private java.lang.String f62925x6fcc7939;

    /* renamed from: mClearBtnImg */
    private android.graphics.drawable.Drawable f62926x2e87b9c7;

    /* renamed from: mDensity */
    private float f62927xfaa547bb;

    /* renamed from: mEditState */
    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState f62928xad4e6ba;

    /* renamed from: mFilterChar */
    private char[] f62929x7f984f3b;

    /* renamed from: mFixedHeaderText */
    private java.lang.String f62930x2d99bfc1;

    /* renamed from: mIDCardPaint */
    private android.graphics.Paint f62931x75785c6;

    /* renamed from: mIEncrypt */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 f62932xc3c4d949;

    /* renamed from: mIgnoreTextChange */
    private boolean f62933x3edaf53c;

    /* renamed from: mIsCardTailNumCanDisplay */
    private boolean f62934x82eb9121;

    /* renamed from: mIsSelfSet */
    private boolean f62935xce1032ff;

    /* renamed from: mIsUseOfKinda */
    private boolean f62936x5a923a06;

    /* renamed from: mKindaEditTextCallBackListener */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IKindaEditTextCallBackListener f62937x640657b0;

    /* renamed from: mNewPwdStyle */
    private boolean f62938xadeb7787;

    /* renamed from: mPaintBackground */
    private android.graphics.Paint f62939x75d3fbff;

    /* renamed from: mPasswdBgPaint */
    private android.graphics.Paint f62940x15e33f2e;

    /* renamed from: mPasswdInputChangeListener */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IPasswdInputChangeListener f62941xe70f2f83;

    /* renamed from: mPasswdListener */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27996x5a23ec21 f62942x5be0673f;

    /* renamed from: mPasswdSeparedPaint */
    private android.graphics.Paint f62943x8615c41b;

    /* renamed from: mTitlePaint */
    private android.graphics.Paint f62944x71a29533;

    /* renamed from: m_envCallBackListener */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.I993EnvListener f62945x4517f074;

    /* renamed from: noUpdate */
    private boolean f62946x29fa1dea;

    /* renamed from: randomKey */
    private byte[] f62947xceac669c;

    /* renamed from: realContent */
    private byte[] f62948x4bae04fb;

    /* renamed from: realLength */
    private int f62949x7c9a5224;

    /* renamed from: regExFilterInput */
    private java.lang.String f62950xd87dcc4b;

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$6, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState */
        static final /* synthetic */ int[] f62956x7d9c686f;

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EncryptMode */
        static final /* synthetic */ int[] f62957x9df91f70;

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$HKSoftEncryMode */
        static final /* synthetic */ int[] f62958x6f70ba7f;

        static {
            int[] iArr = new int[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode.m121652xcee59d22().length];
            f62958x6f70ba7f = iArr;
            try {
                iArr[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode.HKSOFT_RSA2048_WITH_MD5.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f62958x6f70ba7f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode.HKSOFT_RSA2048_WITH_PBKDF2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.m121647xcee59d22().length];
            f62957x9df91f70 = iArr2;
            try {
                iArr2[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.RSA1024_WITH_MD5.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f62957x9df91f70[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.RSA2048_WITH_MD5.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f62957x9df91f70[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.SM2_WITH_MD5.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f62957x9df91f70[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode.SM2_WITH_PBKDF2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.m121643xcee59d22().length];
            f62956x7d9c686f = iArr3;
            try {
                iArr3[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.BANKCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f62956x7d9c686f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.BANKCARD_WITH_TAILNUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f62956x7d9c686f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.VALID_THRU.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f62956x7d9c686f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.SECURITY_ANSWER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f62956x7d9c686f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.COMMON_TEXT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f62956x7d9c686f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f62956x7d9c686f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f62956x7d9c686f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                f62956x7d9c686f[com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$EditState */
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
        IDCARD_TAIL,
        COMMON_TEXT
    }

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode */
    /* loaded from: classes9.dex */
    public enum EncryptMode {
        RSA1024_WITH_MD5,
        RSA2048_WITH_MD5,
        SM2_WITH_MD5,
        SM2_WITH_PBKDF2
    }

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$EventLogger */
    /* loaded from: classes9.dex */
    public static class EventLogger implements com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.Logger {
        private EventLogger() {
        }

        @Override // com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.Logger
        /* renamed from: onLog */
        public void mo121648x64f5ce5(int i17, java.lang.String str) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySMLogger", "native event: [" + i17 + "], [" + str + "]");
        }
    }

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$HKSoftEncryMode */
    /* loaded from: classes9.dex */
    public enum HKSoftEncryMode {
        HKSOFT_RSA2048_WITH_MD5,
        HKSOFT_RSA2048_WITH_PBKDF2
    }

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$I993EnvListener */
    /* loaded from: classes9.dex */
    public interface I993EnvListener {
        /* renamed from: is993Env */
        boolean mo917xc347bc84();
    }

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$IKindaEditTextCallBackListener */
    /* loaded from: classes9.dex */
    public interface IKindaEditTextCallBackListener {
        /* renamed from: onCallBackKinda */
        void mo26412xff698e49();
    }

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$IPasswdInputChangeListener */
    /* loaded from: classes9.dex */
    public interface IPasswdInputChangeListener {
        /* renamed from: onInputChanged */
        void mo915xdc18b709();
    }

    public C28001xdd2bb359(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: drawCardTailNum */
    private void m121572xcadbb002(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.BANKCARD_WITH_TAILNUM == this.f62928xad4e6ba && this.f62934x82eb9121) {
            int baseline = getBaseline();
            if (baseline == -1) {
                baseline = 44;
            }
            canvas.drawText(this.f62925x6fcc7939, (this.f62919x579f64c6 * this.f62927xfaa547bb) + getPaint().measureText(getText().toString()), baseline, this.f62944x71a29533);
        }
    }

    /* renamed from: drawCvv4PaymentDot */
    private void m121573xa0a024d8(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT != this.f62928xad4e6ba || this.f62939x75d3fbff == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.f62920xb469e946;
        int length = getText().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, f62915xe2dbd578 * this.f62927xfaa547bb, this.f62939x75d3fbff);
        }
    }

    /* renamed from: drawCvvPaymentDot */
    private void m121574x70170542(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT != this.f62928xad4e6ba || this.f62939x75d3fbff == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.f62921x8664d8db;
        int length = getText().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, f62915xe2dbd578 * this.f62927xfaa547bb, this.f62939x75d3fbff);
        }
    }

    /* renamed from: drawIdCardTail */
    private void m121575x28a3861f(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.IDCARD_TAIL != this.f62928xad4e6ba || this.f62931x75785c6 == null) {
            return;
        }
        int width = getWidth() / 4;
        java.lang.String obj = getText().toString();
        int length = obj.length();
        this.f62931x75785c6.setTextSize(getTextSize());
        int i17 = 0;
        while (i17 < length) {
            int i18 = i17 + 1;
            canvas.drawText(obj.substring(i17, i18), (width / 2) + (i17 * width), getBaseline(), this.f62931x75785c6);
            i17 = i18;
        }
    }

    /* renamed from: drawPasswdDot */
    private void m121576xd12f8ce7(android.graphics.Canvas canvas) {
        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD != this.f62928xad4e6ba || this.f62939x75d3fbff == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.f62922x192577a7;
        int length = getText().length();
        int i18 = 0;
        if (!this.f62938xadeb7787) {
            while (i18 < length) {
                canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, f62915xe2dbd578 * this.f62927xfaa547bb, this.f62939x75d3fbff);
                i18++;
            }
            for (int i19 = 1; i19 < this.f62922x192577a7; i19++) {
                float f17 = i17 * i19;
                canvas.drawLine(f17, 0.0f, f17, height, this.f62943x8615c41b);
            }
            return;
        }
        int b17 = i65.a.b(getContext(), 8);
        int i27 = this.f62922x192577a7;
        int i28 = (width - ((i27 - 1) * b17)) / i27;
        int i29 = height - i28;
        while (i18 < this.f62922x192577a7) {
            float f18 = (i28 + b17) * i18;
            float f19 = i28;
            float f27 = f18 + f19;
            float f28 = i29;
            android.graphics.RectF rectF = new android.graphics.RectF(f18, f28, f27, i28 + i29);
            float b18 = i65.a.b(getContext(), 4);
            canvas.drawRoundRect(rectF, b18, b18, this.f62940x15e33f2e);
            if (i18 < length) {
                canvas.drawCircle((f18 + f27) / 2.0f, (f19 / 2.0f) + f28, i65.a.b(getContext(), 4), this.f62939x75d3fbff);
            }
            i18++;
        }
    }

    /* renamed from: eventLog */
    private void m121577x10937a4a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "err:%d %s" + i17, str);
        com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.Logger m121816xcc17022a = com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.m121816xcc17022a();
        if (m121816xcc17022a != null) {
            m121816xcc17022a.mo121648x64f5ce5(i17, str);
        }
    }

    /* renamed from: getInputStringFromKeyCode */
    private java.lang.String m121578x3826d55d(int i17) {
        return i17 == 7 ? "0" : i17 == 8 ? "1" : i17 == 9 ? "2" : i17 == 10 ? "3" : i17 == 11 ? "4" : i17 == 12 ? "5" : i17 == 13 ? "6" : i17 == 14 ? "7" : i17 == 15 ? "8" : i17 == 16 ? "9" : "";
    }

    /* renamed from: getInputText */
    private java.lang.String m121579x652b8d61() {
        java.lang.String obj = this.f62928xad4e6ba == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.SECURITY_ANSWER ? getText().toString() : getText().toString().trim();
        if (obj == null || obj.length() == 0) {
            return null;
        }
        int i17 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.AnonymousClass6.f62956x7d9c686f[this.f62928xad4e6ba.ordinal()];
        if (i17 == 1) {
            obj = obj.replaceAll(" ", "");
        } else if (i17 == 2) {
            obj = obj.replaceAll(" ", "");
            java.lang.String str = this.f62925x6fcc7939;
            if (str != null && str.length() > 0) {
                obj = obj + this.f62925x6fcc7939;
            }
        } else if (i17 == 3) {
            obj = obj.replaceAll("/", "");
            if (obj != null && obj.length() == this.f62923x9e0c9a70) {
                java.lang.String substring = obj.substring(0, 2);
                obj = obj.substring(2) + substring;
            }
        } else if (i17 != 4 && i17 != 5) {
            obj = obj.replaceAll(" ", "").replaceAll("x", "X");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f62950xd87dcc4b)) {
            return obj;
        }
        java.lang.String trim = java.util.regex.Pattern.compile(this.f62950xd87dcc4b).matcher(obj).replaceAll("").trim();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "use filter");
        return trim;
    }

    /* renamed from: handleDelPwdEvent */
    private boolean m121580xf3324b40() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "handleDelPwdEvent");
        int i17 = this.f62949x7c9a5224;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "handleDelPwdEvent real len is 0");
            return false;
        }
        this.f62949x7c9a5224 = i17 - 1;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i18 = 0; i18 < this.f62949x7c9a5224; i18++) {
            stringBuffer.append('*');
        }
        m121586x95866442();
        setText(stringBuffer.toString());
        setSelection(this.f62949x7c9a5224);
        m121587x3ccd7f4c();
        return true;
    }

    /* renamed from: handleInputPwdEvent */
    private boolean m121581xd9e6a1ff(int i17) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27996x5a23ec21 interfaceC27996x5a23ec21;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "handleInputPwdEvent");
        if (this.f62949x7c9a5224 >= this.f62922x192577a7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "handleInputPwdEvent real len >= pwd len");
            return false;
        }
        java.lang.String m121578x3826d55d = m121578x3826d55d(i17);
        int i18 = this.f62949x7c9a5224;
        this.f62948x4bae04fb[i18] = (byte) (m121578x3826d55d.charAt(0) ^ this.f62947xceac669c[i18]);
        this.f62949x7c9a5224++;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i19 = 0; i19 < this.f62949x7c9a5224; i19++) {
            stringBuffer.append('*');
        }
        m121586x95866442();
        setText(stringBuffer.toString());
        setSelection(this.f62949x7c9a5224);
        m121587x3ccd7f4c();
        if (this.f62949x7c9a5224 == this.f62922x192577a7 && (interfaceC27996x5a23ec21 = this.f62942x5be0673f) != null) {
            interfaceC27996x5a23ec21.mo121504xc3989e01();
        }
        return true;
    }

    /* renamed from: init */
    private void m121582x316510(android.content.Context context, android.util.AttributeSet attributeSet) {
        int[] m121661x578eb8af;
        android.content.res.TypedArray obtainStyledAttributes;
        this.f62927xfaa547bb = getResources().getDisplayMetrics().density;
        m121583x3323ac0();
        if (attributeSet != null && (m121661x578eb8af = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121661x578eb8af(context, "TenpaySecureEditText")) != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m121661x578eb8af)) != null) {
            m121628xbc8182be(obtainStyledAttributes.getBoolean(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TenpaySecureEditText_isPassword"), false), true);
            m121622x6347c2af(obtainStyledAttributes.getBoolean(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TenpaySecureEditText_isBankcard"), false));
            m121630x744cf207(obtainStyledAttributes.getBoolean(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TenpaySecureEditText_isValidThru"), false));
            m121613x8f8ccf68(obtainStyledAttributes.getString(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TenpaySecureEditText_bankcardTailNum")));
            int resourceId = obtainStyledAttributes.getResourceId(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121660x4a3d1ded(context, "TenpaySecureEditText_rightClearDrawable"), 0);
            if (resourceId != 0) {
                m121614xd30bb48a(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
        addTextChangedListener(new android.text.TextWatcher() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.1
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

    /* renamed from: initLogger */
    private void m121583x3323ac0() {
        com.p3249xcbb51f6b.ndk.C28015xdd3e0c12.m121818xc6cf6336(new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EventLogger());
    }

    /* renamed from: is993Abtest */
    private boolean m121584xf18ee93c() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.I993EnvListener i993EnvListener = this.f62945x4517f074;
        if (i993EnvListener != null) {
            return i993EnvListener.mo917xc347bc84();
        }
        return false;
    }

    /* renamed from: removeAllListeners */
    private void m121586x95866442() {
        java.util.ArrayList<android.text.TextWatcher> arrayList = this.f62924x5a170670;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                super.removeTextChangedListener(arrayList.get(i17));
            }
        }
    }

    /* renamed from: restoreAllListeners */
    private void m121587x3ccd7f4c() {
        java.util.ArrayList<android.text.TextWatcher> arrayList = this.f62924x5a170670;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                super.addTextChangedListener(arrayList.get(i17));
            }
        }
    }

    /* renamed from: setSalt */
    public static void m121588x764fefd8(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "check salt: %s", str);
        if ((java.lang.Integer.decode(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g).intValue() & 255) < 48) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "check salt stack: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        f62917x7c3d8309 = str;
    }

    /* renamed from: updateText */
    private void m121589xee5c6596(java.lang.String str) {
        if (this.f62946x29fa1dea) {
            this.f62946x29fa1dea = false;
            return;
        }
        int length = str.length();
        if (this.f62947xceac669c == null || length > this.f62922x192577a7) {
            return;
        }
        if (this.f62949x7c9a5224 == 0) {
            new java.security.SecureRandom().nextBytes(this.f62947xceac669c);
        }
        int i17 = this.f62949x7c9a5224;
        if (length < i17) {
            this.f62949x7c9a5224 = i17 - 1;
            return;
        }
        int i18 = length - 1;
        this.f62948x4bae04fb[i18] = (byte) (str.charAt(i18) ^ this.f62947xceac669c[i18]);
        this.f62949x7c9a5224 = length;
        this.f62946x29fa1dea = true;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i19 = 0; i19 < this.f62949x7c9a5224; i19++) {
            stringBuffer.append('*');
        }
        m121586x95866442();
        setText(stringBuffer.toString());
        setSelection(this.f62949x7c9a5224);
        m121587x3ccd7f4c();
    }

    /* renamed from: ClearInput */
    public void m121590x49eb759d() {
        setText("");
        this.f62949x7c9a5224 = 0;
        for (int i17 = 0; i17 < this.f62922x192577a7; i17++) {
            this.f62948x4bae04fb[i17] = 0;
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(android.text.TextWatcher textWatcher) {
        if (this.f62924x5a170670 == null) {
            this.f62924x5a170670 = new java.util.ArrayList<>();
        }
        this.f62924x5a170670.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    /* renamed from: get3DesEncrptData */
    public java.lang.String m121591x7d902dbb() {
        java.lang.String m121579x652b8d61 = m121579x652b8d61();
        if (m121579x652b8d61 == null || m121579x652b8d61.length() == 0) {
            return null;
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925 = this.f62932xc3c4d949;
        if (interfaceC27988x58d9925 != null) {
            return interfaceC27988x58d9925.mo121431xea62cd8a(m121579x652b8d61, f62917x7c3d8309);
        }
        return new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121799xea62cd8a(m121579x652b8d61);
    }

    /* renamed from: get3DesVerifyCode */
    public java.lang.String m121593xa958131b() {
        java.lang.String m121579x652b8d61 = m121579x652b8d61();
        if (m121579x652b8d61 == null || m121579x652b8d61.length() == 0) {
            return null;
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925 = this.f62932xc3c4d949;
        return interfaceC27988x58d9925 != null ? interfaceC27988x58d9925.mo121432x19b57b7a(m121579x652b8d61, f62917x7c3d8309) : new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121801x19b57b7a(m121579x652b8d61);
    }

    /* renamed from: get993EncryptPassword */
    public java.lang.String m121594xfacd7463(long j17, java.lang.String str, java.lang.String str2, int i17) {
        com.p3249xcbb51f6b.ndk.C28017xb1a251c3 c28017xb1a251c3 = new com.p3249xcbb51f6b.ndk.C28017xb1a251c3();
        c28017xb1a251c3.m121852x74210a9e();
        return c28017xb1a251c3.m121836x92511a40("-----BEGIN CERTIFICATE-----\nMIICcTCCAhigAwIBAgIKMTIzNDU2Nzg5MDAKBggqgRzPVQGDdTB5MRMwEQYDVQQD\nDAp0ZW5wYXkuY29tMQswCQYDVQQGEwJDTjESMBAGA1UECAwJR3VhbmdEb25nMREw\nDwYDVQQHDAhTaGVuWmhlbjEUMBIGA1UECgwLVGVucGF5IEluYy4xGDAWBgkqhkiG\n9w0BCQEWCWNhQHFxLmNvbTAiGA8yMDIyMDYxMzExNDAyN1oYDzIwMjcwNjEyMTE0\nMDI3WjCBoTETMBEGA1UEAwwKdGVucGF5LmNvbTELMAkGA1UEBhMCQ04xEDAOBgNV\nBAgMB0JlaWppbmcxEDAOBgNVBAcMB0JlaWppbmcxHjAcBgkqhkiG9w0BCQEWDzM0\nNTM4NDU2QHFxLmNvbTEQMA4GA1UECwwHT1UtRklUMTEQMA4GA1UECwwHT1UtRklU\nMjEVMBMGA1UECgwMQ3J5b3RvZ3JhcGh5MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0D\nQgAE1JmRUm1KUMdQHqSZuQu+5VreMmgzKsAIiMMltBxV9ofXvB/P7PGm+ih3ZaFl\nmT7KYaRm38p2CcuIhDiCiaSd8KNbMFkwHwYDVR0jBBgwFoAUV8nOG6rZPfnCPMWW\nMYZERrLJgGgwHQYDVR0OBBYEFPDKv4y/f8TYo2yPaa/ZnrbYg/V6MAkGA1UdEwQC\nMAAwDAYDVR0PBAUDAwc4ADAKBggqgRzPVQGDdQNHADBEAiASVMWU+SxnJdLppc11\nup7KAgFrCV/CJFYclN+OEb7chAIgGMV7ihaSfnEkRz3GInIWTVDhHubW3JXdNhXj\nCKObm4k=\n-----END CERTIFICATE-----", str2.getBytes(), "wxpay-pbkdf2".getBytes(), j17, str, i17, false);
    }

    /* renamed from: getClearBtnDrawable */
    public android.graphics.drawable.Drawable m121595x514f9e03() {
        return this.f62926x2e87b9c7;
    }

    /* renamed from: getEditState */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState m121596x8f8b0df1() {
        return this.f62928xad4e6ba;
    }

    /* renamed from: getEncryptDataWithHash */
    public java.lang.String m121597x15a9108d(boolean z17) {
        return m121598x15a9108d(z17, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* renamed from: getEncryptPassword */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m121599xcaa6edea(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EncryptMode r17, long r18, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121599xcaa6edea(com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode, long, java.lang.String):java.lang.String");
    }

    /* renamed from: getHKSoftEncryptPassword */
    public java.lang.String m121600xf456eafd(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.HKSoftEncryMode hKSoftEncryMode, long j17, java.lang.String str, java.lang.String str2) {
        int i17 = this.f62949x7c9a5224;
        if (i17 != this.f62922x192577a7) {
            return null;
        }
        byte[] bArr = new byte[i17];
        for (int i18 = 0; i18 < this.f62949x7c9a5224; i18++) {
            bArr[i18] = (byte) (this.f62948x4bae04fb[i18] ^ this.f62947xceac669c[i18]);
        }
        if (str2 == null || j17 == 0) {
            return null;
        }
        return com.p3249xcbb51f6b.ndk.C28019x9fc852e7.m121897xe6451c20(bArr, str2.getBytes(), j17, str, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.AnonymousClass6.f62958x6f70ba7f[hKSoftEncryMode.ordinal()] != 1 ? 2 : 1);
    }

    /* renamed from: getInputLength */
    public int m121601xbad2461a() {
        if (this.f62928xad4e6ba == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "pwd scene, len is %s", java.lang.Integer.valueOf(this.f62949x7c9a5224));
            return this.f62949x7c9a5224;
        }
        java.lang.String m121579x652b8d61 = m121579x652b8d61();
        if (m121579x652b8d61 == null) {
            return 0;
        }
        return m121579x652b8d61.length();
    }

    /* renamed from: getPasswordHash */
    public java.lang.String m121602x82b9bcbf() {
        if (this.f62928xad4e6ba != com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD) {
            return null;
        }
        byte[] bArr = new byte[this.f62949x7c9a5224];
        for (int i17 = 0; i17 < this.f62949x7c9a5224; i17++) {
            bArr[i17] = (byte) (this.f62948x4bae04fb[i17] ^ this.f62947xceac669c[i17]);
        }
        return new com.p3249xcbb51f6b.ndk.C28020x74fa7f2d().m121902x984bccbe(bArr);
    }

    /* renamed from: handlePwdKeyBoardEvent */
    public void m121603xafd50d1e(int i17) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IPasswdInputChangeListener iPasswdInputChangeListener;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "handlePwdKeyBoardEvent");
        if (this.f62947xceac669c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "random key is null");
            return;
        }
        if (this.f62949x7c9a5224 == 0) {
            new java.security.SecureRandom().nextBytes(this.f62947xceac669c);
        }
        if (!(i17 == 67 ? m121580xf3324b40() : m121581xd9e6a1ff(i17)) || (iPasswdInputChangeListener = this.f62941xe70f2f83) == null) {
            return;
        }
        iPasswdInputChangeListener.mo915xdc18b709();
    }

    /* renamed from: isAreaIDCardNum */
    public boolean m121604xff9f1dc4(int i17) {
        java.lang.String trim = getText().toString().trim();
        if (trim == null || trim.length() == 0) {
            return false;
        }
        trim.replaceAll(" ", "");
        if (i17 != 1) {
            return true;
        }
        return m121609x593c5956();
    }

    /* renamed from: isBankcardNum */
    public boolean m121605x7cde7910() {
        return m121601xbad2461a() >= this.f62918xe8ca628e || getText().toString().contains("**");
    }

    /* renamed from: isMatchPattern */
    public boolean m121606xf3340455(java.lang.String str) {
        if (str != null) {
            try {
                return java.util.regex.Pattern.compile(str).matcher(m121579x652b8d61()).matches();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: isMoneyAmount */
    public boolean m121607x245c69ae() {
        return m121606xf3340455("^\\d+(\\.\\d{0,2})?$");
    }

    /* renamed from: isPhoneNum */
    public boolean m121608x846a7e82() {
        return getText().toString().trim().length() == 11 || getText().toString().contains("**");
    }

    /* renamed from: isUserIdNum */
    public boolean m121609x593c5956() {
        return m121601xbad2461a() == 15 ? m121606xf3340455("^\\d{15}$") : com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121662x1f88d796(getText().toString().trim());
    }

    /* renamed from: isValidThru */
    public boolean m121610x41137c9() {
        return m121606xf3340455("[1-9][0-9]0[1-9]$|[1-9][0-9]1[0-2]$");
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if ((getInputType() & 128) <= 0) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD;
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState2 = this.f62928xad4e6ba;
            if (editState == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT == editState2) {
                return;
            }
            super.onCreateContextMenu(contextMenu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState = this.f62928xad4e6ba;
        if (editState == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.IDCARD_TAIL) {
            m121575x28a3861f(canvas);
        } else if (editState == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD || editState == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT || editState == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT) {
            m121576xd12f8ce7(canvas);
            m121574x70170542(canvas);
            m121573xa0a024d8(canvas);
        } else {
            super.onDraw(canvas);
            m121572xcadbb002(canvas);
        }
        if (android.text.TextUtils.isEmpty(this.f62930x2d99bfc1) || getText().length() <= 0) {
            return;
        }
        canvas.drawText(this.f62930x2d99bfc1, getWidth() - getPaint().measureText(this.f62930x2d99bfc1 + getText().toString()), getBaseline(), getPaint());
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
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState = this.f62928xad4e6ba;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState2 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD;
        if (editState == editState2 && this.f62933x3edaf53c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "pwd scene, ignore textchange");
            return;
        }
        if (this.f62929x7f984f3b != null && !android.text.TextUtils.isEmpty(charSequence) && this.f62928xad4e6ba != editState2) {
            for (int i28 = i17; i28 < i17 + i19; i28++) {
                for (char c17 : this.f62929x7f984f3b) {
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
        this.f62934x82eb9121 = obj != null && obj.length() > 0;
        int i29 = 3;
        if (isFocused() && this.f62926x2e87b9c7 != null) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState3 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD;
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState4 = this.f62928xad4e6ba;
            if (editState3 != editState4 && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT != editState4 && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT != editState4) {
                if (getText().toString().equals("")) {
                    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
                } else {
                    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f62926x2e87b9c7, getCompoundDrawables()[3]);
                }
            }
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState5 = this.f62928xad4e6ba;
        if (editState5 != null) {
            try {
                int i37 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.AnonymousClass6.f62956x7d9c686f[editState5.ordinal()];
                if (i37 == 1 || i37 == 2) {
                    if (this.f62935xce1032ff) {
                        this.f62935xce1032ff = false;
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
                        this.f62935xce1032ff = true;
                        setText(stringBuffer2);
                        setSelection((i38 + (length - length2)) - i27);
                        return;
                    }
                    return;
                }
                if (i37 != 3) {
                    if (i37 == 6) {
                        m121589xee5c6596(obj);
                        if (obj.length() != this.f62922x192577a7 || (interfaceC27996x5a23ec21 = this.f62942x5be0673f) == null) {
                            return;
                        }
                        interfaceC27996x5a23ec21.mo121504xc3989e01();
                        return;
                    }
                    if (i37 == 7) {
                        if (obj.length() != this.f62921x8664d8db || (interfaceC27996x5a23ec212 = this.f62942x5be0673f) == null) {
                            return;
                        }
                        interfaceC27996x5a23ec212.mo121504xc3989e01();
                        return;
                    }
                    if (i37 == 8 && obj.length() == this.f62920xb469e946 && (interfaceC27996x5a23ec213 = this.f62942x5be0673f) != null) {
                        interfaceC27996x5a23ec213.mo121504xc3989e01();
                        return;
                    }
                    return;
                }
                if (this.f62935xce1032ff) {
                    this.f62935xce1032ff = false;
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
                    this.f62935xce1032ff = true;
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
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState2 = this.f62928xad4e6ba;
        if (editState == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT == editState2 || editState2 == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.IDCARD_TAIL) {
            return true;
        }
        return super.onTextContextMenuItem(i17);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.f62936x5a923a06) {
            clearFocus();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(android.text.TextWatcher textWatcher) {
        int indexOf;
        java.util.ArrayList<android.text.TextWatcher> arrayList = this.f62924x5a170670;
        if (arrayList != null && (indexOf = arrayList.indexOf(textWatcher)) >= 0) {
            this.f62924x5a170670.remove(indexOf);
        }
        super.removeTextChangedListener(textWatcher);
    }

    /* renamed from: set3DesEncrptData */
    public void m121611x458695c7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        setText(c28013x36bca45.m121798xe82f2162(str, c28013x36bca45.m121807xce19d7e6()));
    }

    /* renamed from: set993EnvCallBackListener */
    public void m121612x9178f615(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.I993EnvListener i993EnvListener) {
        this.f62945x4517f074 = i993EnvListener;
    }

    /* renamed from: setBankcardTailNum */
    public void m121613x8f8ccf68(java.lang.String str) {
        this.f62925x6fcc7939 = str;
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.BANKCARD_WITH_TAILNUM;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f62944x71a29533 = paint;
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
        this.f62944x71a29533.setAntiAlias(true);
        this.f62944x71a29533.setTextSize(getTextSize());
        this.f62931x75785c6.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
    }

    /* renamed from: setClearBtnDrawableId */
    public void m121614xd30bb48a(int i17) {
        m121615xd30bb48a(i17, 0);
    }

    /* renamed from: setCursorStyle */
    public void m121617x12027a39(int i17) {
        if (i17 == -1) {
            return;
        }
        if (fp.h.c(29)) {
            android.graphics.drawable.Drawable drawable = getContext().getDrawable(i17);
            if (drawable != null) {
                m121618x12027a39(drawable);
                return;
            }
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
    public void m121619xbfcb5cf0(char[] cArr) {
        this.f62929x7f984f3b = cArr;
    }

    /* renamed from: setFixedHeaderText */
    public void m121620x7923fb2c(java.lang.String str) {
        this.f62930x2d99bfc1 = str;
        setPadding(((int) getPaint().measureText(this.f62930x2d99bfc1)) + getPaddingLeft(), getPaddingTop(), getPaddingBottom(), getPaddingRight());
        invalidate();
    }

    /* renamed from: setIgnoreTextChangeEvent */
    public void m121621x9f0931e9(boolean z17) {
        this.f62933x3edaf53c = z17;
    }

    /* renamed from: setIsBankcardFormat */
    public void m121622x6347c2af(boolean z17) {
        if (z17) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.BANKCARD;
        } else if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.BANKCARD == this.f62928xad4e6ba) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
        }
    }

    /* renamed from: setIsCommonTextFormat */
    public void m121623x5e3e511b(boolean z17) {
        if (z17) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.COMMON_TEXT;
        } else {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
        }
    }

    /* renamed from: setIsCvv4PaymentFormat */
    public void m121624x1f38bf20(boolean z17) {
        if (!z17) {
            this.f62939x75d3fbff = null;
            if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT == this.f62928xad4e6ba) {
                this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
                return;
            }
            return;
        }
        setPadding(f62916xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f62939x75d3fbff = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f62931x75785c6.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT;
    }

    /* renamed from: setIsCvvPaymentFormat */
    public void m121625x85af8146(boolean z17) {
        if (!z17) {
            this.f62939x75d3fbff = null;
            if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT == this.f62928xad4e6ba) {
                this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
                return;
            }
            return;
        }
        setPadding(f62916xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f62939x75d3fbff = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f62931x75785c6.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT;
    }

    /* renamed from: setIsIdCardTailFormat */
    public void m121626xc6654ede(boolean z17) {
        if (!z17) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
            return;
        }
        setPadding(f62916xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.IDCARD_TAIL;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f62931x75785c6 = paint;
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
        this.f62931x75785c6.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f62931x75785c6.setAntiAlias(true);
        this.f62931x75785c6.setTextSize(getTextSize());
        this.f62931x75785c6.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
    }

    /* renamed from: setIsMoneyAmountFormat */
    public void m121627xf65f6f83(boolean z17) {
        if (z17) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.MONEY_AMOUNT;
        } else if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.MONEY_AMOUNT == this.f62928xad4e6ba) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
        }
    }

    /* renamed from: setIsPasswordFormat */
    public void m121628xbc8182be(boolean z17, boolean z18) {
        if (!z17) {
            this.f62939x75d3fbff = null;
            if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD == this.f62928xad4e6ba) {
                this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
                return;
            }
            return;
        }
        this.f62938xadeb7787 = z18;
        setPadding(f62916xe6f703ba, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f62939x75d3fbff = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f62939x75d3fbff.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        } else {
            this.f62939x75d3fbff.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        }
        this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f62943x8615c41b = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f62943x8615c41b.setStrokeWidth(1.5f);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f62943x8615c41b.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836));
        } else {
            this.f62943x8615c41b.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        }
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f62940x15e33f2e = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f62940x15e33f2e.setColor(218103807);
        } else {
            this.f62940x15e33f2e.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        }
    }

    /* renamed from: setIsSecurityAnswerFormat */
    public void m121629x930fe401(boolean z17) {
        if (z17) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.SECURITY_ANSWER;
        } else {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
        }
    }

    /* renamed from: setIsValidThru */
    public void m121630x744cf207(boolean z17) {
        if (z17) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.VALID_THRU;
        } else if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.VALID_THRU == this.f62928xad4e6ba) {
            this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
        }
    }

    /* renamed from: setKindaEditTextCallBackListener */
    public void m121631xd642bbdb(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IKindaEditTextCallBackListener iKindaEditTextCallBackListener) {
        this.f62937x640657b0 = iKindaEditTextCallBackListener;
    }

    /* renamed from: setOnPasswdInputListener */
    public void m121632xc90120ff(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27996x5a23ec21 interfaceC27996x5a23ec21) {
        this.f62942x5be0673f = interfaceC27996x5a23ec21;
    }

    /* renamed from: setPasswdInputChangeListener */
    public void m121633xbee2612e(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IPasswdInputChangeListener iPasswdInputChangeListener) {
        this.f62941xe70f2f83 = iPasswdInputChangeListener;
    }

    /* renamed from: setPwdLength */
    public void m121634xb4bfea41(int i17) {
        this.f62922x192577a7 = i17;
    }

    /* renamed from: setSecureEncrypt */
    public void m121635xbde60dac(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925) {
        this.f62932xc3c4d949 = interfaceC27988x58d9925;
    }

    /* renamed from: setUseOfKinda */
    public void m121636x5df72a31(boolean z17) {
        this.f62936x5a923a06 = z17;
    }

    /* renamed from: setValidThru */
    public void m121637x19952791(java.lang.String str) {
        if (str == null || str.length() != this.f62923x9e0c9a70) {
            return;
        }
        setText(str);
        this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.VALID_THRU;
    }

    /* renamed from: setregExFilterInput */
    public void m121638x568e84ad(java.lang.String str) {
        this.f62950xd87dcc4b = str;
    }

    public C28001xdd2bb359(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
        this.f62938xadeb7787 = true;
        this.f62922x192577a7 = 6;
        this.f62921x8664d8db = 3;
        this.f62920xb469e946 = 4;
        this.f62918xe8ca628e = 14;
        this.f62919x579f64c6 = 15;
        this.f62923x9e0c9a70 = 4;
        this.f62932xc3c4d949 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28002xcd8b6923();
        this.f62933x3edaf53c = false;
        int i17 = this.f62922x192577a7;
        this.f62947xceac669c = new byte[i17];
        this.f62948x4bae04fb = new byte[i17];
        this.f62949x7c9a5224 = 0;
        this.f62946x29fa1dea = false;
        m121582x316510(context, attributeSet);
    }

    /* renamed from: getEncryptDataWithHash */
    public java.lang.String m121598x15a9108d(boolean z17, boolean z18) {
        java.lang.String m121579x652b8d61;
        if (this.f62928xad4e6ba == com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD) {
            int i17 = this.f62949x7c9a5224;
            if (i17 != this.f62922x192577a7) {
                return null;
            }
            byte[] bArr = new byte[i17];
            for (int i18 = 0; i18 < this.f62949x7c9a5224; i18++) {
                bArr[i18] = (byte) (this.f62948x4bae04fb[i18] ^ this.f62947xceac669c[i18]);
            }
            m121579x652b8d61 = new java.lang.String(bArr);
        } else {
            m121579x652b8d61 = m121579x652b8d61();
            if (m121579x652b8d61 == null || m121579x652b8d61.length() == 0) {
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TenpaySecureEditText", "timestamp: %s, 2048: %s", f62917x7c3d8309, java.lang.Boolean.valueOf(z18));
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925 = this.f62932xc3c4d949;
        if (interfaceC27988x58d9925 == null) {
            if (z17) {
                m121579x652b8d61 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121663xf830e4e1(m121579x652b8d61);
            }
            com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
            java.lang.String str = f62917x7c3d8309;
            if (str != null) {
                c28013x36bca45.m121808x5d476ab4(str);
            }
            if (z18) {
                return c28013x36bca45.m121803x8b1ff279(m121579x652b8d61);
            }
            return c28013x36bca45.m121802xd26bb163(m121579x652b8d61);
        }
        if (z18) {
            java.lang.String mo121434x8b1ff279 = interfaceC27988x58d9925.mo121434x8b1ff279(z17, m121579x652b8d61, f62917x7c3d8309);
            if (mo121434x8b1ff279 == null || mo121434x8b1ff279.length() == 0) {
                jx3.f.INSTANCE.d(25425, 1, 1, 1);
            }
            return mo121434x8b1ff279;
        }
        java.lang.String mo121433xd26bb163 = interfaceC27988x58d9925.mo121433xd26bb163(z17, m121579x652b8d61, f62917x7c3d8309);
        if (mo121433xd26bb163 == null || mo121433xd26bb163.length() == 0) {
            jx3.f.INSTANCE.d(25425, 0, 1, 1);
        }
        return mo121433xd26bb163;
    }

    /* renamed from: setClearBtnDrawableId */
    public void m121615xd30bb48a(int i17, int i18) {
        m121616xd30bb48a(i17, i18, 0, 0);
    }

    /* renamed from: setClearBtnDrawableId */
    public void m121616xd30bb48a(int i17, int i18, int i19, int i27) {
        try {
            android.graphics.drawable.Drawable drawable = getResources().getDrawable(i17);
            this.f62926x2e87b9c7 = drawable;
            if (i18 != 0) {
                drawable.setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        } catch (java.lang.Exception unused) {
            this.f62926x2e87b9c7 = null;
        }
        android.graphics.drawable.Drawable drawable2 = this.f62926x2e87b9c7;
        if (drawable2 != null) {
            if (i19 != 0 && i27 != 0) {
                drawable2.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(getContext(), i19), com.p314xaae8f345.mm.ui.zk.a(getContext(), i27));
            } else {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f62926x2e87b9c7.getIntrinsicHeight());
            }
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.2
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    if (!z17) {
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this;
                        c28001xdd2bb359.setCompoundDrawables(c28001xdd2bb359.getCompoundDrawables()[0], com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.getCompoundDrawables()[1], null, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.getCompoundDrawables()[3]);
                    } else {
                        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.getText().toString().equals("")) {
                            return;
                        }
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD;
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this;
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState2 = c28001xdd2bb3592.f62928xad4e6ba;
                        if (editState == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT == editState2 || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT == editState2) {
                            return;
                        }
                        c28001xdd2bb3592.setCompoundDrawables(c28001xdd2bb3592.getCompoundDrawables()[0], com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.getCompoundDrawables()[1], com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.f62926x2e87b9c7, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.getCompoundDrawables()[3]);
                    }
                }
            });
            setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD;
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this;
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState editState2 = c28001xdd2bb359.f62928xad4e6ba;
                    if (editState != editState2 && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT != editState2 && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT != editState2) {
                        if (motionEvent.getAction() == 1 && !c28001xdd2bb359.isFocused() && com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.f62937x640657b0 != null) {
                            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.f62937x640657b0.mo26412xff698e49();
                        }
                        if (c28001xdd2bb359.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > (c28001xdd2bb359.getWidth() - c28001xdd2bb359.getPaddingRight()) - com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.this.f62926x2e87b9c7.getIntrinsicWidth()) {
                            c28001xdd2bb359.setText("");
                        }
                    }
                    return false;
                }
            });
            return;
        }
        setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z17) {
            }
        });
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return false;
            }
        });
    }

    /* renamed from: isMatchPattern */
    private boolean m121585xf3340455(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            try {
                return java.util.regex.Pattern.compile(str2).matcher(str).matches();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: get3DesEncrptData */
    public java.lang.String m121592x7d902dbb(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.InterfaceC27988x58d9925 interfaceC27988x58d9925 = this.f62932xc3c4d949;
        if (interfaceC27988x58d9925 != null) {
            return interfaceC27988x58d9925.mo121431xea62cd8a(str, f62917x7c3d8309);
        }
        return new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121799xea62cd8a(str);
    }

    /* renamed from: setCursorStyle */
    public void m121618x12027a39(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable textCursorDrawable = getTextCursorDrawable();
        if (textCursorDrawable == null) {
            setTextCursorDrawable(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{drawable}));
        } else if (textCursorDrawable instanceof android.graphics.drawable.LayerDrawable) {
            ((android.graphics.drawable.LayerDrawable) textCursorDrawable).setDrawable(0, drawable);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TenpaySecureEditText", "can't change cursor drawable, check if you have set cursor on xml");
        }
    }

    public C28001xdd2bb359(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f62928xad4e6ba = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.DEFAULT;
        this.f62938xadeb7787 = true;
        this.f62922x192577a7 = 6;
        this.f62921x8664d8db = 3;
        this.f62920xb469e946 = 4;
        this.f62918xe8ca628e = 14;
        this.f62919x579f64c6 = 15;
        this.f62923x9e0c9a70 = 4;
        this.f62932xc3c4d949 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28002xcd8b6923();
        this.f62933x3edaf53c = false;
        int i18 = this.f62922x192577a7;
        this.f62947xceac669c = new byte[i18];
        this.f62948x4bae04fb = new byte[i18];
        this.f62949x7c9a5224 = 0;
        this.f62946x29fa1dea = false;
        m121582x316510(context, attributeSet);
    }
}
