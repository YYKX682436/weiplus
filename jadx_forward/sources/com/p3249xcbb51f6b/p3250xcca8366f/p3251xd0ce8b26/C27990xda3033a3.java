package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.MyKeyboardWindow */
/* loaded from: classes15.dex */
public class C27990xda3033a3 extends android.widget.LinearLayout {

    /* renamed from: KINDE_REPORT_CLASS_NAME */
    public static final java.lang.String f62759x7c8ab36f = "com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative";

    /* renamed from: KINDE_REPORT_METHOD_NAME */
    public static final java.lang.String f62760xc169746c = "reportKindaEvent";

    /* renamed from: LAYOUT_ID */
    public static final java.lang.String f62761x542c3650 = "tenpay_number_keyboard";

    /* renamed from: PASS_WORD_LENGTH */
    private static final int f62762xf1ca768d = 6;
    private static final java.lang.String TAG = "MicroMsg.MyKeyboardWindow";

    /* renamed from: X_MODE_CHARACTER */
    public static final int f62763x441e3a34 = 1;

    /* renamed from: X_MODE_DOT */
    public static final int f62764x86cf494 = 2;

    /* renamed from: X_MODE_NONE */
    public static final int f62765x536292d = 0;

    /* renamed from: _hellAccFlag_ */
    private byte f62766x7f11beae;

    /* renamed from: badTouchCountDelegate */
    private int f62767x2aaa839a;

    /* renamed from: badTouchCountReal */
    private int f62768x19125233;

    /* renamed from: clickButtonPressure */
    private java.util.ArrayList<java.lang.Float> f62769xe071933f;

    /* renamed from: clickButtonSize */
    private java.util.ArrayList<java.lang.Float> f62770x9ea2e9fb;

    /* renamed from: clickButtonTime */
    private java.util.ArrayList<java.lang.Long> f62771x9ea35cc7;

    /* renamed from: hasShowKeyBoardWindowDelegate */
    private boolean f62772x2b3e12d3;

    /* renamed from: isOpenKeyboardWindowDelegateMode */
    private boolean f62773xa9807ad3;

    /* renamed from: keyBoardOnTouchListenerDelegate */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.OnTouchListener f62774x81e6cf52;

    /* renamed from: keyOnClickListenerDelegate */
    private android.view.View.OnClickListener f62775xd2cb7e03;

    /* renamed from: keyOnTouchListenerDelegate */
    private android.view.View.OnTouchListener f62776x11d849ba;

    /* renamed from: mContext */
    private android.content.Context f62777xd6cfe882;

    /* renamed from: mEventTargetView */
    private java.lang.ref.WeakReference<android.view.View> f62778xd2f575e3;

    /* renamed from: mHasShowDialog */
    private boolean f62779x98985172;

    /* renamed from: mInputEditText */
    private android.widget.EditText f62780xd9196cd4;

    /* renamed from: mKey0 */
    private android.view.View f62781x623a3be;

    /* renamed from: mKey1 */
    private android.view.View f62782x623a3bf;

    /* renamed from: mKey2 */
    private android.view.View f62783x623a3c0;

    /* renamed from: mKey3 */
    private android.view.View f62784x623a3c1;

    /* renamed from: mKey4 */
    private android.view.View f62785x623a3c2;

    /* renamed from: mKey5 */
    private android.view.View f62786x623a3c3;

    /* renamed from: mKey6 */
    private android.view.View f62787x623a3c4;

    /* renamed from: mKey7 */
    private android.view.View f62788x623a3c5;

    /* renamed from: mKey8 */
    private android.view.View f62789x623a3c6;

    /* renamed from: mKey9 */
    private android.view.View f62790x623a3c7;

    /* renamed from: mKeyD */
    private android.widget.RelativeLayout f62791x623a3d2;

    /* renamed from: mKeyX */
    private android.widget.TextView f62792x623a3e6;

    /* renamed from: mNeedSecureCheckOnTouch */
    private boolean f62793x859edb92;

    /* renamed from: mOnTouchListener */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.OnTouchListener f62794x80f36d47;

    /* renamed from: mUIContext */
    private android.content.Context f62795x79239eae;

    /* renamed from: mWindowDelegate */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27991xe8902248 f62796x5c8c3762;

    /* renamed from: mXMode */
    private int f62797xbefcfdce;

    /* renamed from: payClickReportCnt */
    private int f62798x310081b5;

    /* renamed from: secureAccessibilityDelegate */
    private android.view.View.AccessibilityDelegate f62799xc0cb69bc;

    /* renamed from: com.tenpay.android.wechat.MyKeyboardWindow$IMyKeyboardWindowActionEvent */
    /* loaded from: classes15.dex */
    public interface IMyKeyboardWindowActionEvent {
        /* renamed from: onKeyboardActionGetInputLength */
        int mo932x4ec7d5f6();

        /* renamed from: onKeyboardActionWithCode */
        void mo933xa7cba4af(int i17);
    }

    /* renamed from: com.tenpay.android.wechat.MyKeyboardWindow$OnTouchListener */
    /* loaded from: classes9.dex */
    public interface OnTouchListener {
        /* renamed from: onTouch */
        boolean mo121477xb05cb4a0(android.view.View view, android.view.MotionEvent motionEvent);
    }

    public C27990xda3033a3(android.content.Context context) {
        super(context);
        this.f62798x310081b5 = 0;
        this.f62797xbefcfdce = 0;
        this.f62779x98985172 = false;
        this.f62793x859edb92 = false;
        this.f62778xd2f575e3 = null;
        this.f62773xa9807ad3 = false;
        this.f62772x2b3e12d3 = false;
        this.f62768x19125233 = 0;
        this.f62767x2aaa839a = 0;
        this.f62769xe071933f = new java.util.ArrayList<>();
        this.f62771x9ea35cc7 = new java.util.ArrayList<>();
        this.f62770x9ea2e9fb = new java.util.ArrayList<>();
        m121456x316510(context);
    }

    /* renamed from: access$712 */
    public static /* synthetic */ int m121450xbbd79558(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3, int i17) {
        int i18 = c27990xda3033a3.f62798x310081b5 + i17;
        c27990xda3033a3.f62798x310081b5 = i18;
        return i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: detectViewId */
    public boolean m121453xad057b23(android.view.View view, java.lang.String str) {
        return view.getId() == m121465x5db1b11(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doReportButtonClickInfo */
    public void m121454x908e77a5(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f62769xe071933f.add(java.lang.Float.valueOf(motionEvent.getPressure()));
        long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
        java.util.ArrayList<java.lang.Long> arrayList = this.f62771x9ea35cc7;
        if (eventTime < 0) {
            eventTime = 0;
        }
        arrayList.add(java.lang.Long.valueOf(eventTime));
        this.f62770x9ea2e9fb.add(java.lang.Float.valueOf(motionEvent.getSize()));
        java.lang.ref.WeakReference<android.view.View> weakReference = this.f62778xd2f575e3;
        if (weakReference == null || !(weakReference.get() instanceof com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent) || ((com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent) ((android.view.View) this.f62778xd2f575e3.get())).mo932x4ec7d5f6() < 5 || this.f62769xe071933f.size() <= 0) {
            return;
        }
        java.lang.String join = android.text.TextUtils.join(",", this.f62769xe071933f);
        java.lang.String join2 = android.text.TextUtils.join(",", this.f62771x9ea35cc7);
        java.lang.String join3 = android.text.TextUtils.join(",", this.f62770x9ea2e9fb);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[doReportButtonClickInfo] final clickButtonPressure: %s, clickButtonTime: %s, clickButtonSize: %s", join, join2, join3);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_keyboard_security_setting");
        M.D("kv_pwd_keyboard_click_btn_pressure", join);
        M.D("kv_pwd_keyboard_click_btn_clicktime", join2);
        M.D("kv_pwd_keyboard_click_btn_size", join3);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_usecase").getString("currentstate", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || string.equals("floatPay")) {
            return;
        }
        m121461x5eea13a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getKeyEventCode */
    public int m121455x466d867e(android.view.View view) {
        if (m121453xad057b23(view, "tenpay_keyboard_1")) {
            return 8;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_2")) {
            return 9;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_3")) {
            return 10;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_4")) {
            return 11;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_5")) {
            return 12;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_6")) {
            return 13;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_7")) {
            return 14;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_8")) {
            return 15;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_9")) {
            return 16;
        }
        if (m121453xad057b23(view, "tenpay_keyboard_0")) {
            return 7;
        }
        return m121453xad057b23(view, "tenpay_keyboard_d") ? 67 : 0;
    }

    /* renamed from: init */
    private void m121456x316510(android.content.Context context) {
        this.f62777xd6cfe882 = context.getApplicationContext();
        this.f62795x79239eae = context;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28003x5d737a8a.m121655x316510(context);
        m121460xc9c55dd5();
    }

    /* renamed from: initKeyBoardDelegate */
    private void m121457xff1c979c() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f62796x5c8c3762 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[initKeyBoardDelegate] do show WindowDelegate: %s", objArr);
        if (this.f62796x5c8c3762 != null) {
            return;
        }
        this.f62772x2b3e12d3 = true;
        this.f62796x5c8c3762 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27991xe8902248();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f62782x623a3bf);
        arrayList.add(this.f62783x623a3c0);
        arrayList.add(this.f62784x623a3c1);
        arrayList.add(this.f62785x623a3c2);
        arrayList.add(this.f62786x623a3c3);
        arrayList.add(this.f62787x623a3c4);
        arrayList.add(this.f62788x623a3c5);
        arrayList.add(this.f62789x623a3c6);
        arrayList.add(this.f62790x623a3c7);
        arrayList.add(this.f62792x623a3e6);
        arrayList.add(this.f62781x623a3be);
        arrayList.add(this.f62791x623a3d2);
        postDelayed(new java.lang.Runnable() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62796x5c8c3762 != null) {
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62796x5c8c3762.m121482x7ac3070a(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62777xd6cfe882, arrayList, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62776x11d849ba, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62775xd2cb7e03, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62774x81e6cf52, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.getWidth(), com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.getHeight(), (int) com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62782x623a3bf.getX(), (int) com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62782x623a3bf.getY());
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62796x5c8c3762.m121487x53eb72f9(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62797xbefcfdce);
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62796x5c8c3762.m121486x2408cb55(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62799xc0cb69bc);
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62796x5c8c3762.m121488x35dafd();
                    jx3.f.INSTANCE.d(30687, 1, 3);
                }
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: needInterrupt */
    public boolean m121458x45bb0e6d(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17 = (motionEvent.getFlags() & 1) != 0;
        if (motionEvent.getAction() == 1) {
            if (z17 && !this.f62772x2b3e12d3) {
                this.f62768x19125233++;
                jx3.f.INSTANCE.d(30687, 1, 1, java.lang.Integer.valueOf(this.f62768x19125233));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[needInterrupt] RealKeyboard bad touch count ： %s", java.lang.Integer.valueOf(this.f62768x19125233));
                if (m121459x2711be1d()) {
                    m121457xff1c979c();
                }
            } else if (z17 && this.f62772x2b3e12d3) {
                this.f62767x2aaa839a++;
                jx3.f.INSTANCE.d(30687, 1, 2, java.lang.Integer.valueOf(this.f62767x2aaa839a));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[needInterrupt] delegateKeyboard bad touch count： %s", java.lang.Integer.valueOf(this.f62767x2aaa839a));
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_keyboard_security_setting").G("kv_pay_pwd_keyboard_overlaid", this.f62768x19125233 > 0 || this.f62767x2aaa839a > 0);
        }
        if (!this.f62793x859edb92 || !z17) {
            return false;
        }
        if (!this.f62779x98985172) {
            this.f62779x98985172 = true;
            db5.e1.E(view.getContext(), this.f62777xd6cfe882.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fid), "", this.f62777xd6cfe882.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62779x98985172 = false;
                }
            });
        }
        this.f62780xd9196cd4.clearFocus();
        return true;
    }

    /* renamed from: needShowDelegateView */
    private boolean m121459x2711be1d() {
        boolean f17 = zo.e.f(this.f62777xd6cfe882);
        boolean z17 = android.os.Build.VERSION.SDK_INT < 31;
        boolean z18 = this.f62773xa9807ad3 && !this.f62772x2b3e12d3 && f17 && z17 && !com.p314xaae8f345.mm.ui.bk.Q();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[needShowDelegateView] result：%s。    process tag - hasShowKeyBoardWindowDelegate: %s， isOpenKeyboardWindowDelegateMode：%s , hasFloatWindowPermission: %s apiBelow12：%s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f62772x2b3e12d3), java.lang.Boolean.valueOf(this.f62773xa9807ad3), java.lang.Boolean.valueOf(f17), java.lang.Boolean.valueOf(z17));
        return z18;
    }

    /* renamed from: realInitKeyboard */
    private void m121460xc9c55dd5() {
        android.view.View inflate = android.view.LayoutInflater.from("1".equals(j62.e.g().a("clicfg_android_keyboard_darkmode_use_app_context", "", false, true)) ? this.f62777xd6cfe882 : this.f62795x79239eae).inflate(this.f62777xd6cfe882.getResources().getIdentifier(f62761x542c3650, "layout", this.f62777xd6cfe882.getPackageName()), (android.view.ViewGroup) this, true);
        this.f62782x623a3bf = m121466x857c2f7c(inflate, "tenpay_keyboard_1");
        this.f62783x623a3c0 = m121466x857c2f7c(inflate, "tenpay_keyboard_2");
        this.f62784x623a3c1 = m121466x857c2f7c(inflate, "tenpay_keyboard_3");
        this.f62785x623a3c2 = m121466x857c2f7c(inflate, "tenpay_keyboard_4");
        this.f62786x623a3c3 = m121466x857c2f7c(inflate, "tenpay_keyboard_5");
        this.f62787x623a3c4 = m121466x857c2f7c(inflate, "tenpay_keyboard_6");
        this.f62788x623a3c5 = m121466x857c2f7c(inflate, "tenpay_keyboard_7");
        this.f62789x623a3c6 = m121466x857c2f7c(inflate, "tenpay_keyboard_8");
        this.f62790x623a3c7 = m121466x857c2f7c(inflate, "tenpay_keyboard_9");
        this.f62792x623a3e6 = (android.widget.TextView) m121466x857c2f7c(inflate, "tenpay_keyboard_x");
        this.f62781x623a3be = m121466x857c2f7c(inflate, "tenpay_keyboard_0");
        this.f62791x623a3d2 = (android.widget.RelativeLayout) m121466x857c2f7c(inflate, "tenpay_keyboard_d");
        android.view.View m121466x857c2f7c = m121466x857c2f7c(inflate, "divider1");
        this.f62782x623a3bf.setTag(m121466x857c2f7c);
        this.f62783x623a3c0.setTag(m121466x857c2f7c);
        this.f62784x623a3c1.setTag(m121466x857c2f7c);
        this.f62785x623a3c2.setTag(m121466x857c2f7c);
        this.f62786x623a3c3.setTag(m121466x857c2f7c);
        this.f62787x623a3c4.setTag(m121466x857c2f7c);
        this.f62788x623a3c5.setTag(m121466x857c2f7c);
        this.f62789x623a3c6.setTag(m121466x857c2f7c);
        this.f62790x623a3c7.setTag(m121466x857c2f7c);
        this.f62792x623a3e6.setTag(m121466x857c2f7c);
        this.f62781x623a3be.setTag(m121466x857c2f7c);
        this.f62791x623a3d2.setTag(m121466x857c2f7c);
        m121462xb48029a(null);
        final java.util.HashMap<java.lang.Integer, java.lang.Boolean> hashMap = new java.util.HashMap<java.lang.Integer, java.lang.Boolean>() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.1
            {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                put(7, bool);
                put(8, bool);
                put(9, bool);
                put(10, bool);
                put(11, bool);
                put(12, bool);
                put(13, bool);
                put(14, bool);
                put(15, bool);
                put(16, bool);
            }
        };
        android.view.View.OnTouchListener onTouchListener = new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.2
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
            
                if (r2 != 6) goto L27;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
                /*
                    r5 = this;
                    com.tenpay.android.wechat.MyKeyboardWindow r0 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this
                    boolean r0 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.m121436xbbd77af0(r0, r6, r7)
                    r1 = 1
                    if (r0 == 0) goto La
                    return r1
                La:
                    r0 = 0
                    com.tenpay.android.wechat.MyKeyboardWindow r2 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this     // Catch: java.lang.Throwable -> L57
                    android.widget.EditText r2 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.m121437xbbd77eb1(r2)     // Catch: java.lang.Throwable -> L57
                    if (r2 != 0) goto L14
                    return r0
                L14:
                    com.tenpay.android.wechat.MyKeyboardWindow r2 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this     // Catch: java.lang.Throwable -> L57
                    int r6 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.m121444xbbd78272(r2, r6)     // Catch: java.lang.Throwable -> L57
                    java.util.HashMap r2 = r2     // Catch: java.lang.Throwable -> L57
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L57
                    boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> L57
                    if (r2 != 0) goto L27
                    return r0
                L27:
                    int r2 = r7.getAction()     // Catch: java.lang.Throwable -> L57
                    fo3.s r3 = fo3.s.INSTANCE
                    java.lang.String r4 = "ce_pp"
                    if (r2 == 0) goto L46
                    if (r2 == r1) goto L3a
                    r1 = 5
                    if (r2 == r1) goto L46
                    r6 = 6
                    if (r2 == r6) goto L3a
                    goto L6b
                L3a:
                    r3.H2(r4, r7)     // Catch: java.lang.Throwable -> L57
                    r3.Qa(r4)     // Catch: java.lang.Throwable -> L57
                    com.tenpay.android.wechat.MyKeyboardWindow r6 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this     // Catch: java.lang.Throwable -> L57
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.m121445xbbd78633(r6, r7)     // Catch: java.lang.Throwable -> L57
                    goto L6b
                L46:
                    java.util.HashMap r7 = r2     // Catch: java.lang.Throwable -> L57
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L57
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L57
                    r7.put(r6, r1)     // Catch: java.lang.Throwable -> L57
                    java.lang.String r6 = "<PayClick>"
                    r3.Z7(r4, r6)     // Catch: java.lang.Throwable -> L57
                    goto L6b
                L57:
                    r6 = move-exception
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r1 = "error: "
                    r7.<init>(r1)
                    r7.append(r6)
                    java.lang.String r6 = r7.toString()
                    java.lang.String r7 = "MicroMsg.MyKeyboardWindow"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r6)
                L6b:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
        this.f62782x623a3bf.setOnTouchListener(onTouchListener);
        this.f62783x623a3c0.setOnTouchListener(onTouchListener);
        this.f62784x623a3c1.setOnTouchListener(onTouchListener);
        this.f62785x623a3c2.setOnTouchListener(onTouchListener);
        this.f62786x623a3c3.setOnTouchListener(onTouchListener);
        this.f62787x623a3c4.setOnTouchListener(onTouchListener);
        this.f62788x623a3c5.setOnTouchListener(onTouchListener);
        this.f62789x623a3c6.setOnTouchListener(onTouchListener);
        this.f62790x623a3c7.setOnTouchListener(onTouchListener);
        this.f62792x623a3e6.setOnTouchListener(onTouchListener);
        this.f62781x623a3be.setOnTouchListener(onTouchListener);
        this.f62791x623a3d2.setOnTouchListener(onTouchListener);
        this.f62776x11d849ba = onTouchListener;
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.TAG, "[onClick]");
                if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62780xd9196cd4 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.TAG, "[onClick]mInputEditText == null");
                    return;
                }
                if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.m121453xad057b23(view, "tenpay_keyboard_x")) {
                    int i17 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62797xbefcfdce;
                    if (i17 != 1) {
                        if (i17 != 2) {
                            return;
                        }
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62780xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(0, 56));
                        return;
                    } else {
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62780xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(0, 59));
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62780xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(0, 52));
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62780xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(1, 59));
                        return;
                    }
                }
                int m121455x466d867e = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.m121455x466d867e(view);
                android.view.KeyEvent.Callback callback = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62778xd2f575e3 != null ? (android.view.View) com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62778xd2f575e3.get() : null;
                if (callback == null || !(callback instanceof com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent)) {
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62780xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(0, m121455x466d867e));
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62780xd9196cd4.dispatchKeyEvent(new android.view.KeyEvent(1, m121455x466d867e));
                } else {
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent iMyKeyboardWindowActionEvent = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.IMyKeyboardWindowActionEvent) callback;
                    iMyKeyboardWindowActionEvent.mo933xa7cba4af(m121455x466d867e);
                    int mo932x4ec7d5f6 = iMyKeyboardWindowActionEvent.mo932x4ec7d5f6();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.TAG, "[onClick] send keyboard event, inputLength: %s", java.lang.Integer.valueOf(mo932x4ec7d5f6));
                    if (mo932x4ec7d5f6 >= 6 || mo932x4ec7d5f6 == -1) {
                        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.m121467x3ea7b9d8();
                    }
                }
                try {
                    if (hashMap.containsKey(java.lang.Integer.valueOf(m121455x466d867e))) {
                        if (java.lang.Boolean.TRUE.equals(hashMap.get(java.lang.Integer.valueOf(m121455x466d867e)))) {
                            hashMap.put(java.lang.Integer.valueOf(m121455x466d867e), java.lang.Boolean.FALSE);
                        } else {
                            fo3.s sVar = fo3.s.INSTANCE;
                            sVar.Z7("ce_pp", "<PayClick>");
                            sVar.H2("ce_pp", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                            sVar.Qa("ce_pp");
                        }
                        if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this.f62798x310081b5 == 0) {
                            w04.l.INSTANCE.Ki();
                            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.m121450xbbd79558(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.this, 1);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.TAG, "async report pci error:" + th6);
                }
            }
        };
        this.f62782x623a3bf.setOnClickListener(onClickListener);
        this.f62783x623a3c0.setOnClickListener(onClickListener);
        this.f62784x623a3c1.setOnClickListener(onClickListener);
        this.f62785x623a3c2.setOnClickListener(onClickListener);
        this.f62786x623a3c3.setOnClickListener(onClickListener);
        this.f62787x623a3c4.setOnClickListener(onClickListener);
        this.f62788x623a3c5.setOnClickListener(onClickListener);
        this.f62789x623a3c6.setOnClickListener(onClickListener);
        this.f62790x623a3c7.setOnClickListener(onClickListener);
        this.f62792x623a3e6.setOnClickListener(onClickListener);
        this.f62781x623a3be.setOnClickListener(onClickListener);
        this.f62791x623a3d2.setOnClickListener(onClickListener);
        this.f62775xd2cb7e03 = onClickListener;
    }

    /* renamed from: reportKindaEvent */
    private void m121461x5eea13a1() {
        try {
            com.p314xaae8f345.mm.p689xc5a27af6.p766xd031a825.p767xdb7d1c3f.C10693x85432fd9 c10693x85432fd9 = com.p314xaae8f345.mm.p689xc5a27af6.p766xd031a825.p767xdb7d1c3f.C10693x85432fd9.f28936x4fbc8495;
            java.lang.reflect.Method declaredMethod = com.p314xaae8f345.mm.p689xc5a27af6.p766xd031a825.p767xdb7d1c3f.C10693x85432fd9.class.getDeclaredMethod(f62760xc169746c, java.lang.String.class, java.lang.String.class);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, "url", "VerifyPassword");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "reportKindaEvent reflection error: " + e17.getMessage());
        }
    }

    /* renamed from: setInnerAccessibility */
    private void m121462xb48029a(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27989x3ae3954a c27989x3ae3954a = accessibilityDelegate != null ? new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27989x3ae3954a(accessibilityDelegate) : new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27989x3ae3954a();
        c27989x3ae3954a.m121435x5d3c082c(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21227xcdc820b);
        this.f62791x623a3d2.setAccessibilityDelegate(c27989x3ae3954a);
    }

    /* renamed from: setKeyXText */
    private void m121463x93fff128(java.lang.CharSequence charSequence) {
        this.f62792x623a3e6.setText(charSequence);
        this.f62792x623a3e6.setContentDescription(charSequence.toString().toLowerCase());
        if (android.text.TextUtils.isEmpty(charSequence)) {
            this.f62792x623a3e6.setImportantForAccessibility(2);
        } else {
            this.f62792x623a3e6.setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.OnTouchListener onTouchListener = this.f62794x80f36d47;
            if (onTouchListener != null) {
                onTouchListener.mo121477xb05cb4a0(this, motionEvent);
            }
        } catch (java.lang.Throwable unused) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getDrawableId */
    public int m121464xffdf924f(java.lang.String str) {
        return this.f62777xd6cfe882.getResources().getIdentifier(str, "drawable", this.f62777xd6cfe882.getPackageName());
    }

    /* renamed from: getId */
    public int m121465x5db1b11(java.lang.String str) {
        return this.f62777xd6cfe882.getResources().getIdentifier(str, dm.i4.f66865x76d1ec5a, this.f62777xd6cfe882.getPackageName());
    }

    /* renamed from: getViewWithId */
    public android.view.View m121466x857c2f7c(android.view.View view, java.lang.String str) {
        return view.findViewById(m121465x5db1b11(str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28003x5d737a8a.m121654x5cd39ffa();
        m121467x3ea7b9d8();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onSizeChanged] w： %s， h： %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (this.f62796x5c8c3762 == null || i17 <= 0 || i18 <= 0) {
            return;
        }
        m121467x3ea7b9d8();
        m121457xff1c979c();
    }

    /* renamed from: releaseKeyBoardDelegateView */
    public void m121467x3ea7b9d8() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f62796x5c8c3762 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[releaseKeyBoardDelegateView] trigger， real need destory？ %s", objArr);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27991xe8902248 c27991xe8902248 = this.f62796x5c8c3762;
        if (c27991xe8902248 != null) {
            c27991xe8902248.m121483x41012807();
            this.f62796x5c8c3762 = null;
            this.f62772x2b3e12d3 = false;
        }
        this.f62767x2aaa839a = 0;
    }

    /* renamed from: resetSecureAccessibility */
    public void m121468xa24be148() {
        this.f62781x623a3be.setAccessibilityDelegate(null);
        this.f62782x623a3bf.setAccessibilityDelegate(null);
        this.f62783x623a3c0.setAccessibilityDelegate(null);
        this.f62784x623a3c1.setAccessibilityDelegate(null);
        this.f62785x623a3c2.setAccessibilityDelegate(null);
        this.f62786x623a3c3.setAccessibilityDelegate(null);
        this.f62787x623a3c4.setAccessibilityDelegate(null);
        this.f62788x623a3c5.setAccessibilityDelegate(null);
        this.f62789x623a3c6.setAccessibilityDelegate(null);
        this.f62790x623a3c7.setAccessibilityDelegate(null);
        this.f62792x623a3e6.setAccessibilityDelegate(null);
        this.f62791x623a3d2.setAccessibilityDelegate(null);
        m121462xb48029a(null);
        this.f62799xc0cb69bc = null;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27991xe8902248 c27991xe8902248 = this.f62796x5c8c3762;
        if (c27991xe8902248 != null) {
            c27991xe8902248.m121484xa24be148();
        }
    }

    /* renamed from: setInputEditText */
    public void m121469xce4186ff(android.widget.EditText editText) {
        if (editText != null) {
            this.f62780xd9196cd4 = editText;
            int imeOptions = editText.getImeOptions();
            java.lang.CharSequence imeActionLabel = this.f62780xd9196cd4.getImeActionLabel();
            if (!android.text.TextUtils.isEmpty(imeActionLabel)) {
                m121463x93fff128(imeActionLabel);
            }
            if (imeOptions == 1) {
                this.f62797xbefcfdce = 0;
                if (android.text.TextUtils.isEmpty(imeActionLabel)) {
                    m121463x93fff128("");
                }
            }
            if (editText instanceof com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) {
                fo3.s.INSTANCE.Zh();
            }
        }
    }

    /* renamed from: setKeyboardDisabled */
    public void m121470x9f793805(boolean z17) {
        this.f62781x623a3be.setClickable(!z17);
        this.f62782x623a3bf.setClickable(!z17);
        this.f62783x623a3c0.setClickable(!z17);
        this.f62784x623a3c1.setClickable(!z17);
        this.f62785x623a3c2.setClickable(!z17);
        this.f62786x623a3c3.setClickable(!z17);
        this.f62787x623a3c4.setClickable(!z17);
        this.f62788x623a3c5.setClickable(!z17);
        this.f62789x623a3c6.setClickable(!z17);
        this.f62790x623a3c7.setClickable(!z17);
        this.f62792x623a3e6.setClickable(!z17);
        this.f62791x623a3d2.setClickable(!z17);
        android.view.View view = this.f62781x623a3be;
        float f17 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f62782x623a3bf;
        float f18 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f62783x623a3c0;
        float f19 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = this.f62784x623a3c1;
        float f27 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(f27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view4, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view5 = this.f62785x623a3c2;
        float f28 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Float.valueOf(f28));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
        yj0.a.f(view5, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view6 = this.f62786x623a3c3;
        float f29 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Float.valueOf(f29));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view6.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
        yj0.a.f(view6, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view7 = this.f62787x623a3c4;
        float f37 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(java.lang.Float.valueOf(f37));
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view7.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
        yj0.a.f(view7, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view8 = this.f62788x623a3c5;
        float f38 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(java.lang.Float.valueOf(f38));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
        yj0.a.f(view8, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view9 = this.f62789x623a3c6;
        float f39 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(java.lang.Float.valueOf(f39));
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view9.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
        yj0.a.f(view9, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view10 = this.f62790x623a3c7;
        float f47 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Float.valueOf(f47));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(view10, arrayList10.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view10.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
        yj0.a.f(view10, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f62792x623a3e6.setAlpha(z17 ? 0.1f : 1.0f);
        this.f62791x623a3d2.setAlpha(z17 ? 0.1f : 1.0f);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27991xe8902248 c27991xe8902248 = this.f62796x5c8c3762;
        if (c27991xe8902248 != null) {
            c27991xe8902248.m121485x9f793805(z17);
        }
    }

    /* renamed from: setOnTouchListener */
    public void m121471xcc7da8b2(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.OnTouchListener onTouchListener) {
        this.f62794x80f36d47 = onTouchListener;
        this.f62774x81e6cf52 = onTouchListener;
    }

    /* renamed from: setSecureAccessibility */
    public void m121472x2408cb55(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f62781x623a3be.setAccessibilityDelegate(accessibilityDelegate);
        this.f62782x623a3bf.setAccessibilityDelegate(accessibilityDelegate);
        this.f62783x623a3c0.setAccessibilityDelegate(accessibilityDelegate);
        this.f62784x623a3c1.setAccessibilityDelegate(accessibilityDelegate);
        this.f62785x623a3c2.setAccessibilityDelegate(accessibilityDelegate);
        this.f62786x623a3c3.setAccessibilityDelegate(accessibilityDelegate);
        this.f62787x623a3c4.setAccessibilityDelegate(accessibilityDelegate);
        this.f62788x623a3c5.setAccessibilityDelegate(accessibilityDelegate);
        this.f62789x623a3c6.setAccessibilityDelegate(accessibilityDelegate);
        this.f62790x623a3c7.setAccessibilityDelegate(accessibilityDelegate);
        this.f62792x623a3e6.setAccessibilityDelegate(accessibilityDelegate);
        this.f62791x623a3d2.setAccessibilityDelegate(accessibilityDelegate);
        m121462xb48029a(accessibilityDelegate);
        this.f62799xc0cb69bc = accessibilityDelegate;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27991xe8902248 c27991xe8902248 = this.f62796x5c8c3762;
        if (c27991xe8902248 != null) {
            c27991xe8902248.m121486x2408cb55(accessibilityDelegate);
        }
    }

    /* renamed from: setSecureOnTouchCallback */
    public void m121473x4c673d4c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MKM", "setSecureOnTouchCallback");
        this.f62793x859edb92 = true;
    }

    /* renamed from: setUseEditTextEventMode */
    public void m121474x464d4781(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "use event mode");
        this.f62778xd2f575e3 = new java.lang.ref.WeakReference<>(view);
    }

    /* renamed from: setUseKeyboardWindowDelegateMode */
    public void m121475xbbc48ac4(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "use delegate mode : %s", java.lang.Boolean.valueOf(z17));
        this.f62773xa9807ad3 = z17;
    }

    /* renamed from: setXMode */
    public void m121476x53eb72f9(int i17) {
        this.f62797xbefcfdce = i17;
        if (i17 == 0) {
            m121463x93fff128("");
        } else if (i17 == 1) {
            m121463x93fff128("X");
        } else if (i17 != 2) {
            this.f62797xbefcfdce = 0;
        } else {
            m121463x93fff128(".");
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27991xe8902248 c27991xe8902248 = this.f62796x5c8c3762;
        if (c27991xe8902248 != null) {
            c27991xe8902248.m121487x53eb72f9(this.f62797xbefcfdce);
        }
    }

    public C27990xda3033a3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62798x310081b5 = 0;
        this.f62797xbefcfdce = 0;
        this.f62779x98985172 = false;
        this.f62793x859edb92 = false;
        this.f62778xd2f575e3 = null;
        this.f62773xa9807ad3 = false;
        this.f62772x2b3e12d3 = false;
        this.f62768x19125233 = 0;
        this.f62767x2aaa839a = 0;
        this.f62769xe071933f = new java.util.ArrayList<>();
        this.f62771x9ea35cc7 = new java.util.ArrayList<>();
        this.f62770x9ea2e9fb = new java.util.ArrayList<>();
        m121456x316510(context);
    }
}
