package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class oc implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f228803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f228804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f228805g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f228806h;

    public oc(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13, android.view.View.OnFocusChangeListener onFocusChangeListener, com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223, boolean z17, android.widget.EditText editText) {
        this.f228802d = activityC16373x8a110f13;
        this.f228803e = onFocusChangeListener;
        this.f228804f = c22894x55bf3223;
        this.f228805g = z17;
        this.f228806h = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View v17, boolean z17) {
        android.widget.EditText m66198xdb574fcd;
        android.widget.EditText m66173xdb574fcd;
        android.widget.EditText m66198xdb574fcd2;
        android.widget.EditText m66173xdb574fcd2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        if (z17) {
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("mAmountEt", v17.getTag());
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228802d;
            if (b17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = 4;
                objArr[1] = java.lang.Integer.valueOf(activityC16373x8a110f13.f227781d2);
                objArr[2] = java.lang.Float.valueOf(activityC16373x8a110f13.f227780c2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16369x7101dda7 c16369x7101dda7 = activityC16373x8a110f13.f227786h;
                objArr[3] = (c16369x7101dda7 == null || (m66173xdb574fcd2 = c16369x7101dda7.m66173xdb574fcd()) == null) ? null : m66173xdb574fcd2.getText();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 c16388xef85efa1 = activityC16373x8a110f13.f227784g;
                objArr[4] = (c16388xef85efa1 == null || (m66198xdb574fcd2 = c16388xef85efa1.m66198xdb574fcd()) == null) ? null : m66198xdb574fcd2.getText();
                g0Var.d(25925, objArr);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("mNumEt", v17.getTag())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr2 = new java.lang.Object[5];
                objArr2[0] = 5;
                objArr2[1] = java.lang.Integer.valueOf(activityC16373x8a110f13.f227781d2);
                objArr2[2] = java.lang.Float.valueOf(activityC16373x8a110f13.f227780c2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16369x7101dda7 c16369x7101dda72 = activityC16373x8a110f13.f227786h;
                objArr2[3] = (c16369x7101dda72 == null || (m66173xdb574fcd = c16369x7101dda72.m66173xdb574fcd()) == null) ? null : m66173xdb574fcd.getText();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 c16388xef85efa12 = activityC16373x8a110f13.f227784g;
                objArr2[4] = (c16388xef85efa12 == null || (m66198xdb574fcd = c16388xef85efa12.m66198xdb574fcd()) == null) ? null : m66198xdb574fcd.getText();
                g0Var2.d(25925, objArr2);
            }
            java.lang.Object systemService = activityC16373x8a110f13.mo55332x76847179().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(v17.getWindowToken(), 0);
            }
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mc(this.f228804f, v17, this.f228805g, this.f228806h, this.f228802d), 300L);
        } else {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nc(this.f228804f), 200L);
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f228803e;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(v17, z17);
        }
    }
}
