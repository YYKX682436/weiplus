package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui;

/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionView */
/* loaded from: classes5.dex */
public class C19199x6be5dc91 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f262818d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22501x7b566052 f262819e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f262820f;

    public C19199x6be5dc91(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        str = "";
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270111a, -1, 0);
            int resourceId = obtainStyledAttributes.getResourceId(13, 0);
            java.lang.String string = resourceId != 0 ? context.getString(resourceId) : "";
            int resourceId2 = obtainStyledAttributes.getResourceId(8, 0);
            str = resourceId2 != 0 ? context.getString(resourceId2) : "";
            boolean z18 = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            z17 = z18;
            str2 = str;
            str = string;
        } else {
            str2 = "";
            z17 = false;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c9_, (android.view.ViewGroup) this, true);
        this.f262818d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        this.f262819e = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22501x7b566052) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567920l26);
        this.f262818d.setText(str);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22501x7b566052 c22501x7b566052 = this.f262819e;
        c22501x7b566052.d(str2, c22501x7b566052.f291568h, c22501x7b566052.f291571n, c22501x7b566052.f291569i, c22501x7b566052.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        if (!z17) {
            this.f262819e.setEnabled(false);
            this.f262819e.setFocusable(false);
            this.f262819e.setClickable(false);
            this.f262819e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
            return;
        }
        this.f262819e.setEnabled(false);
        this.f262819e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_r));
        this.f262819e.setFocusable(false);
        this.f262819e.setClickable(false);
        this.f262819e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
    }

    /* renamed from: getCurrentQuestion */
    public java.lang.String m73994x2535a649() {
        return this.f262820f;
    }

    /* renamed from: setQuestionText */
    public void m73995x8cf91fb5(java.lang.String str) {
        this.f262820f = str;
        android.text.method.KeyListener keyListener = this.f262819e.getKeyListener();
        this.f262819e.setInputType(1);
        this.f262819e.setKeyListener(null);
        m73996x27317652(str);
        this.f262819e.setKeyListener(keyListener);
    }

    /* renamed from: setValStr */
    public void m73996x27317652(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22501x7b566052 c22501x7b566052 = this.f262819e;
        c22501x7b566052.d(str, 3, false, -1, c22501x7b566052.getCurrentTextColor());
    }

    public C19199x6be5dc91(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
