package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView */
/* loaded from: classes8.dex */
public class C19145xd4a650f2 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f262231d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f262232e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f262233f;

    /* renamed from: g, reason: collision with root package name */
    public final int f262234g;

    public C19145xd4a650f2(android.content.Context context, int i17) {
        super(context);
        this.f262234g = 0;
        this.f262234g = i17;
        b(context);
    }

    public void a(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence)) {
            this.f262231d.setVisibility(8);
        } else {
            this.f262231d.setText(charSequence);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence2)) {
            this.f262232e.setVisibility(8);
            return;
        }
        this.f262232e.setMaxLines(2);
        this.f262232e.setSelected(true);
        this.f262232e.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        this.f262232e.setText(charSequence2);
        this.f262232e.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void b(android.content.Context context) {
        int i17 = this.f262234g;
        android.view.View inflate = i17 > 0 ? android.view.View.inflate(context, i17, this) : android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d8g, this);
        this.f262231d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kuu);
        this.f262232e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567829ku2);
        this.f262233f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567828ku1);
    }

    public C19145xd4a650f2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f262234g = 0;
        b(context);
    }

    public C19145xd4a650f2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f262234g = 0;
        b(context);
    }
}
