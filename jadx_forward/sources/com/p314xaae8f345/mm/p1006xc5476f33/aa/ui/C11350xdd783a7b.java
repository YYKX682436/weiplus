package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonRow */
/* loaded from: classes.dex */
public class C11350xdd783a7b extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f154034d;

    public C11350xdd783a7b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bnk, this);
        this.f154034d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.hth);
    }

    /* renamed from: getAmountEditView */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 m48640xfde0b13d() {
        return this.f154034d;
    }

    /* renamed from: getMoneyAmount */
    public double m48641x523e1402() {
        java.lang.String str = this.f154034d.m83183xfb85ada3().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || "".equals(str)) {
            return 0.0d;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str, 0.0d);
    }

    /* renamed from: getUsername */
    public java.lang.String m48642x6c03c64c() {
        return null;
    }

    /* renamed from: setAmountTextChangeWatcher */
    public void m48643x34894b85(android.text.TextWatcher textWatcher) {
        if (textWatcher != null) {
            this.f154034d.b(textWatcher);
        }
    }

    public C11350xdd783a7b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
