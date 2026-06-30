package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.MyKeyboardWindowDelegateView */
/* loaded from: classes15.dex */
public class C27995x3ce6d0d extends android.widget.LinearLayout {
    private static final java.lang.String TAG = "MicroMsg.MyKeyboardWindowDelegateView";

    /* renamed from: X_MODE_CHARACTER */
    public static final int f62820x441e3a34 = 1;

    /* renamed from: X_MODE_DOT */
    public static final int f62821x86cf494 = 2;

    /* renamed from: X_MODE_NONE */
    public static final int f62822x536292d = 0;

    /* renamed from: keyBoardOnTouchListener */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.OnTouchListener f62823xe8218aad;

    /* renamed from: keyOnClickListener */
    private android.view.View.OnClickListener f62824xe4147a5e;

    /* renamed from: keyOnTouchListener */
    private android.view.View.OnTouchListener f62825xfc7ed15;

    /* renamed from: mContext */
    private android.content.Context f62826xd6cfe882;

    /* renamed from: mKey0 */
    private android.view.View f62827x623a3be;

    /* renamed from: mKey1 */
    private android.view.View f62828x623a3bf;

    /* renamed from: mKey2 */
    private android.view.View f62829x623a3c0;

    /* renamed from: mKey3 */
    private android.view.View f62830x623a3c1;

    /* renamed from: mKey4 */
    private android.view.View f62831x623a3c2;

    /* renamed from: mKey5 */
    private android.view.View f62832x623a3c3;

    /* renamed from: mKey6 */
    private android.view.View f62833x623a3c4;

    /* renamed from: mKey7 */
    private android.view.View f62834x623a3c5;

    /* renamed from: mKey8 */
    private android.view.View f62835x623a3c6;

    /* renamed from: mKey9 */
    private android.view.View f62836x623a3c7;

    /* renamed from: mKeyD */
    private android.widget.RelativeLayout f62837x623a3d2;

    /* renamed from: mKeyX */
    private android.widget.TextView f62838x623a3e6;

    /* renamed from: mXMode */
    private int f62839xbefcfdce;

    public C27995x3ce6d0d(android.content.Context context) {
        super(context);
        this.f62839xbefcfdce = 0;
        m121492x316510(context);
    }

    /* renamed from: init */
    private void m121492x316510(android.content.Context context) {
        this.f62826xd6cfe882 = context.getApplicationContext();
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28003x5d737a8a.m121655x316510(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(this.f62826xd6cfe882.getResources().getIdentifier(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.f62761x542c3650, "layout", this.f62826xd6cfe882.getPackageName()), (android.view.ViewGroup) this, true);
        this.f62828x623a3bf = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_1"));
        this.f62829x623a3c0 = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_2"));
        this.f62830x623a3c1 = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_3"));
        this.f62831x623a3c2 = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_4"));
        this.f62832x623a3c3 = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_5"));
        this.f62833x623a3c4 = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_6"));
        this.f62834x623a3c5 = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_7"));
        this.f62835x623a3c6 = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_8"));
        this.f62836x623a3c7 = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_9"));
        this.f62838x623a3e6 = (android.widget.TextView) inflate.findViewById(m121497x5db1b11("tenpay_keyboard_x"));
        this.f62827x623a3be = inflate.findViewById(m121497x5db1b11("tenpay_keyboard_0"));
        this.f62837x623a3d2 = (android.widget.RelativeLayout) inflate.findViewById(m121497x5db1b11("tenpay_keyboard_d"));
        android.view.View m121498x857c2f7c = m121498x857c2f7c(inflate, "divider1");
        this.f62828x623a3bf.setTag(m121498x857c2f7c);
        this.f62829x623a3c0.setTag(m121498x857c2f7c);
        this.f62830x623a3c1.setTag(m121498x857c2f7c);
        this.f62831x623a3c2.setTag(m121498x857c2f7c);
        this.f62832x623a3c3.setTag(m121498x857c2f7c);
        this.f62833x623a3c4.setTag(m121498x857c2f7c);
        this.f62834x623a3c5.setTag(m121498x857c2f7c);
        this.f62835x623a3c6.setTag(m121498x857c2f7c);
        this.f62836x623a3c7.setTag(m121498x857c2f7c);
        this.f62838x623a3e6.setTag(m121498x857c2f7c);
        this.f62827x623a3be.setTag(m121498x857c2f7c);
        this.f62837x623a3d2.setTag(m121498x857c2f7c);
        m121493xb48029a(null);
        setAlpha(1.0E-6f);
        setBackgroundColor(this.f62826xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
    }

    /* renamed from: setInnerAccessibility */
    private void m121493xb48029a(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27989x3ae3954a c27989x3ae3954a = accessibilityDelegate != null ? new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27989x3ae3954a(accessibilityDelegate) : new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27989x3ae3954a();
        c27989x3ae3954a.m121435x5d3c082c(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21227xcdc820b);
        this.f62837x623a3d2.setAccessibilityDelegate(c27989x3ae3954a);
    }

    /* renamed from: setKeyXText */
    private void m121494x93fff128(java.lang.CharSequence charSequence) {
        this.f62838x623a3e6.setText(charSequence);
        this.f62838x623a3e6.setContentDescription(charSequence.toString().toLowerCase());
        if (android.text.TextUtils.isEmpty(charSequence)) {
            this.f62838x623a3e6.setImportantForAccessibility(2);
        } else {
            this.f62838x623a3e6.setImportantForAccessibility(1);
        }
    }

    /* renamed from: setRealKeyActionListener */
    private void m121495xe8748409(android.view.View view, final android.view.View view2) {
        view.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindowDelegateView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view3, android.view.MotionEvent motionEvent) {
                if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.this.f62825xfc7ed15 == null || view2 == null) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.TAG, "[onTouch] action down");
                    view2.setBackgroundColor(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.this.f62826xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
                } else if (action == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.TAG, "[onTouch] action up");
                    view2.setBackgroundColor(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.this.f62826xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
                }
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.this.f62825xfc7ed15.onTouch(view2, motionEvent);
                return false;
            }
        });
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindowDelegateView.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.TAG, "[onClick]");
                if (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.this.f62824xe4147a5e == null || view2 == null) {
                    return;
                }
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27995x3ce6d0d.this.f62824xe4147a5e.onClick(view2);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.OnTouchListener onTouchListener = this.f62823xe8218aad;
            if (onTouchListener != null) {
                onTouchListener.mo121477xb05cb4a0(this, motionEvent);
            }
        } catch (java.lang.Throwable unused) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getDrawableId */
    public int m121496xffdf924f(java.lang.String str) {
        return this.f62826xd6cfe882.getResources().getIdentifier(str, "drawable", this.f62826xd6cfe882.getPackageName());
    }

    /* renamed from: getId */
    public int m121497x5db1b11(java.lang.String str) {
        return this.f62826xd6cfe882.getResources().getIdentifier(str, dm.i4.f66865x76d1ec5a, this.f62826xd6cfe882.getPackageName());
    }

    /* renamed from: getViewWithId */
    public android.view.View m121498x857c2f7c(android.view.View view, java.lang.String str) {
        return view.findViewById(m121497x5db1b11(str));
    }

    /* renamed from: initRealKeyBoard */
    public void m121499x4a6464b5(java.util.ArrayList<android.view.View> arrayList, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3.OnTouchListener onTouchListener2) {
        if (arrayList == null || arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[initRealKeyBoard] keyList == null || keyList.size() <= 0, return");
            return;
        }
        android.view.View view = (android.widget.TextView) arrayList.get(0);
        android.view.View view2 = (android.widget.TextView) arrayList.get(1);
        android.view.View view3 = (android.widget.TextView) arrayList.get(2);
        android.view.View view4 = (android.widget.TextView) arrayList.get(3);
        android.view.View view5 = (android.widget.TextView) arrayList.get(4);
        android.view.View view6 = (android.widget.TextView) arrayList.get(5);
        android.view.View view7 = (android.widget.TextView) arrayList.get(6);
        android.view.View view8 = (android.widget.TextView) arrayList.get(7);
        android.view.View view9 = (android.widget.TextView) arrayList.get(8);
        android.widget.TextView textView = (android.widget.TextView) arrayList.get(9);
        android.view.View view10 = (android.widget.TextView) arrayList.get(10);
        android.view.View view11 = (android.widget.RelativeLayout) arrayList.get(11);
        this.f62825xfc7ed15 = onTouchListener;
        this.f62824xe4147a5e = onClickListener;
        this.f62823xe8218aad = onTouchListener2;
        m121495xe8748409(this.f62828x623a3bf, view);
        m121495xe8748409(this.f62829x623a3c0, view2);
        m121495xe8748409(this.f62830x623a3c1, view3);
        m121495xe8748409(this.f62831x623a3c2, view4);
        m121495xe8748409(this.f62832x623a3c3, view5);
        m121495xe8748409(this.f62833x623a3c4, view6);
        m121495xe8748409(this.f62834x623a3c5, view7);
        m121495xe8748409(this.f62835x623a3c6, view8);
        m121495xe8748409(this.f62836x623a3c7, view9);
        m121495xe8748409(this.f62838x623a3e6, textView);
        m121495xe8748409(this.f62827x623a3be, view10);
        m121495xe8748409(this.f62837x623a3d2, view11);
        m121494x93fff128(textView.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28003x5d737a8a.m121654x5cd39ffa();
    }

    /* renamed from: resetSecureAccessibility */
    public void m121500xa24be148() {
        this.f62827x623a3be.setAccessibilityDelegate(null);
        this.f62828x623a3bf.setAccessibilityDelegate(null);
        this.f62829x623a3c0.setAccessibilityDelegate(null);
        this.f62830x623a3c1.setAccessibilityDelegate(null);
        this.f62831x623a3c2.setAccessibilityDelegate(null);
        this.f62832x623a3c3.setAccessibilityDelegate(null);
        this.f62833x623a3c4.setAccessibilityDelegate(null);
        this.f62834x623a3c5.setAccessibilityDelegate(null);
        this.f62835x623a3c6.setAccessibilityDelegate(null);
        this.f62836x623a3c7.setAccessibilityDelegate(null);
        this.f62838x623a3e6.setAccessibilityDelegate(null);
        this.f62837x623a3d2.setAccessibilityDelegate(null);
        m121493xb48029a(null);
    }

    /* renamed from: setKeyboardDisabled */
    public void m121501x9f793805(boolean z17) {
        this.f62827x623a3be.setClickable(!z17);
        this.f62828x623a3bf.setClickable(!z17);
        this.f62829x623a3c0.setClickable(!z17);
        this.f62830x623a3c1.setClickable(!z17);
        this.f62831x623a3c2.setClickable(!z17);
        this.f62832x623a3c3.setClickable(!z17);
        this.f62833x623a3c4.setClickable(!z17);
        this.f62834x623a3c5.setClickable(!z17);
        this.f62835x623a3c6.setClickable(!z17);
        this.f62836x623a3c7.setClickable(!z17);
        this.f62838x623a3e6.setClickable(!z17);
        this.f62837x623a3d2.setClickable(!z17);
    }

    /* renamed from: setSecureAccessibility */
    public void m121502x2408cb55(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f62827x623a3be.setAccessibilityDelegate(accessibilityDelegate);
        this.f62828x623a3bf.setAccessibilityDelegate(accessibilityDelegate);
        this.f62829x623a3c0.setAccessibilityDelegate(accessibilityDelegate);
        this.f62830x623a3c1.setAccessibilityDelegate(accessibilityDelegate);
        this.f62831x623a3c2.setAccessibilityDelegate(accessibilityDelegate);
        this.f62832x623a3c3.setAccessibilityDelegate(accessibilityDelegate);
        this.f62833x623a3c4.setAccessibilityDelegate(accessibilityDelegate);
        this.f62834x623a3c5.setAccessibilityDelegate(accessibilityDelegate);
        this.f62835x623a3c6.setAccessibilityDelegate(accessibilityDelegate);
        this.f62836x623a3c7.setAccessibilityDelegate(accessibilityDelegate);
        this.f62838x623a3e6.setAccessibilityDelegate(accessibilityDelegate);
        this.f62837x623a3d2.setAccessibilityDelegate(accessibilityDelegate);
        m121493xb48029a(accessibilityDelegate);
    }

    /* renamed from: setXMode */
    public void m121503x53eb72f9(int i17) {
        this.f62839xbefcfdce = i17;
        if (i17 == 0) {
            m121494x93fff128("");
            return;
        }
        if (i17 == 1) {
            m121494x93fff128("X");
        } else if (i17 != 2) {
            this.f62839xbefcfdce = 0;
        } else {
            m121494x93fff128(".");
        }
    }

    public C27995x3ce6d0d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62839xbefcfdce = 0;
        m121492x316510(context);
    }
}
