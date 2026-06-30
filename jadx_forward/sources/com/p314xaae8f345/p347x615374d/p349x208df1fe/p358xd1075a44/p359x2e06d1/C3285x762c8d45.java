package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.BaseUI */
/* loaded from: classes9.dex */
public class C3285x762c8d45 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697 {

    /* renamed from: HARDCODE_TENPAY_KEYBOARD_HEIGHT */
    public static final int f12657xb9d95a72 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 270);
    public static final java.lang.String TAG = "MicroMsg.BaseUI";

    /* renamed from: _hellAccFlag_ */
    private byte f12658x7f11beae;

    /* renamed from: isVKBFirstTimeShown */
    protected boolean f12659x123dbf17 = false;

    /* renamed from: mKBLayout */
    protected android.view.View f12660xbab696ce;

    /* renamed from: mKeyboard */
    protected com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 f12661x43041b74;

    /* renamed from: mTenpayKBStateListener */
    private com.p314xaae8f345.mm.p2802xd031a825.ui.m f12662xa7c89b16;

    /* renamed from: wrap */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.IBaseUIWrap f12663x37d04a;

    /* renamed from: com.tencent.kinda.framework.widget.base.BaseUI$IBaseUIWrap */
    /* loaded from: classes9.dex */
    public interface IBaseUIWrap {
        /* renamed from: findViewById */
        android.view.View m26122x4ff8c0f0(int i17);

        /* renamed from: getContext */
        android.content.Context m26123x76847179();

        /* renamed from: getCurrentFocus */
        android.view.View m26124xb71dbd55();
    }

    public C3285x762c8d45(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.IBaseUIWrap iBaseUIWrap) {
        this.f12663x37d04a = iBaseUIWrap;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697
    /* renamed from: hideTenpayKB */
    public void mo26113xd46dd964() {
        android.view.View view = this.f12660xbab696ce;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.f12660xbab696ce;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f12662xa7c89b16;
        if (mVar != null) {
            mVar.mo26891xca4e600e(false);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697
    /* renamed from: scrollTo */
    public void mo26114xe8077228(android.view.View view, int i17, int i18) {
        if (view != null) {
            view.scrollTo(i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697
    /* renamed from: scrollToFormEditPosAfterShowTenPay */
    public void mo26115x97a0486(final android.view.View view, android.view.View view2, int i17) {
        if (view != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int k17 = (i65.a.k(this.f12663x37d04a.m26123x76847179()) - (iArr[1] + view2.getHeight())) - i65.a.b(this.f12663x37d04a.m26123x76847179(), i17);
            int i18 = f12657xb9d95a72;
            if (k17 <= 0 || k17 >= i18) {
                return;
            }
            final int i19 = i18 - k17;
            view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.4
                @Override // java.lang.Runnable
                public void run() {
                    view.scrollBy(0, i19);
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697
    /* renamed from: setEditFocusListener */
    public void mo26116x8f91b80(android.view.View view, int i17, boolean z17) {
        mo26117x8f91b80(view, i17, z17, true);
    }

    /* renamed from: setKBMode */
    public void m26118x12a99e7c(int i17) {
        this.f12661x43041b74.m121476x53eb72f9(i17);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697
    /* renamed from: setTenpayKBStateListener */
    public void mo26119xcfb55a41(com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar) {
        this.f12662xa7c89b16 = mVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697
    /* renamed from: showTenpayKB */
    public void mo26120x8022ec1f() {
        android.view.View view = this.f12660xbab696ce;
        if (view == null || view.isShown()) {
            return;
        }
        android.view.View view2 = this.f12660xbab696ce;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f12662xa7c89b16;
        if (mVar != null) {
            mVar.mo26891xca4e600e(true);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697
    /* renamed from: showVKB */
    public void mo26121x7b383410() {
        android.view.View m26124xb71dbd55;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f12663x37d04a.m26123x76847179().getSystemService("input_method");
        if (inputMethodManager == null || (m26124xb71dbd55 = this.f12663x37d04a.m26124xb71dbd55()) == null || m26124xb71dbd55.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3289xded57697
    /* renamed from: setEditFocusListener */
    public void mo26117x8f91b80(final android.view.View view, final int i17, final boolean z17, final boolean z18) {
        this.f12661x43041b74 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) this.f12663x37d04a.m26122x4ff8c0f0(com.p3249xcbb51f6b.R.id.f62750xe9b380d4);
        this.f12660xbab696ce = this.f12663x37d04a.m26122x4ff8c0f0(com.p314xaae8f345.mm.R.id.o1v);
        android.view.View m26122x4ff8c0f0 = this.f12663x37d04a.m26122x4ff8c0f0(com.p3249xcbb51f6b.R.id.f62751xd41a9ed3);
        final android.widget.EditText editText = view instanceof com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 ? (android.widget.EditText) view : (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.pbn);
        if (this.f12661x43041b74 == null || editText == null || this.f12660xbab696ce == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        final android.widget.EditText editText2 = editText;
        editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(final android.view.View view2, boolean z19) {
                if (view2.isFocused() && !z17) {
                    ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12663x37d04a.m26123x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                    new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12660xbab696ce.isShown() && view2.isShown()) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.AnonymousClass1 anonymousClass1 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.AnonymousClass1.this;
                                if (z18 || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12659x123dbf17) {
                                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45 c3285x762c8d45 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this;
                                    c3285x762c8d45.f12659x123dbf17 = true;
                                    c3285x762c8d45.mo26120x8022ec1f();
                                }
                            }
                            android.view.View view3 = view;
                            if (view3 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) {
                                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) view3;
                                if ((c01.z1.I() || viewOnFocusChangeListenerC22907xe18534c2.m83170x84e6382c() == 100) && (!c01.z1.I() || viewOnFocusChangeListenerC22907xe18534c2.m83170x84e6382c() == 0)) {
                                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12661x43041b74.m121468xa24be148();
                                    editText2.setAccessibilityDelegate(null);
                                } else {
                                    com.p314xaae8f345.mm.p2802xd031a825.e eVar = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
                                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12661x43041b74.m121472x2408cb55(eVar);
                                    editText2.setAccessibilityDelegate(eVar);
                                }
                            }
                            if (view instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
                                com.p314xaae8f345.mm.p2802xd031a825.e eVar2 = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12663x37d04a.m26123x76847179();
                                java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12661x43041b74.m121472x2408cb55(eVar2);
                                editText2.setAccessibilityDelegate(eVar2);
                            }
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.AnonymousClass1 anonymousClass12 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.AnonymousClass1.this;
                            android.view.View view4 = view;
                            java.util.regex.Pattern pattern2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                            if (view4 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
                                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.N(view4, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12661x43041b74);
                            }
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.AnonymousClass1 anonymousClass13 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.AnonymousClass1.this;
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.m26118x12a99e7c(i17);
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12661x43041b74.m121469xce4186ff((android.widget.EditText) view2);
                            ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12663x37d04a.m26123x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                        }
                    }, 300L);
                    return;
                }
                android.view.View view3 = view;
                java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                if (view3 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p0(view3, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12661x43041b74);
                }
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.mo26113xd46dd964();
                        ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12663x37d04a.m26123x76847179().getSystemService("input_method")).showSoftInput(editText2, 0);
                    }
                }, 200L);
            }
        });
        editText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                if (!com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12660xbab696ce.isShown() && !z17) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.mo26120x8022ec1f();
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.m26118x12a99e7c(i17);
                } else if (z17) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.mo26113xd46dd964();
                    ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.f12663x37d04a.m26123x76847179().getSystemService("input_method")).showSoftInput(editText, 0);
                }
            }
        });
        m26122x4ff8c0f0.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3285x762c8d45.this.mo26113xd46dd964();
            }
        });
    }
}
