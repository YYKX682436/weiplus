package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView */
/* loaded from: classes9.dex */
public class C19144x4e901f97 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f262228d;

    /* renamed from: e, reason: collision with root package name */
    public gt4.s f262229e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnClickListener f262230f;

    public C19144x4e901f97(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f262228d = new java.util.ArrayList();
        this.f262230f = new gt4.r(this);
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2 c19145xd4a650f2, int i17) {
        addView(c19145xd4a650f2, i17);
        this.f262228d.add(c19145xd4a650f2);
        c19145xd4a650f2.setOnClickListener(this.f262230f);
    }

    /* renamed from: setOnItemSelectListener */
    public void m73918x1f522784(gt4.s sVar) {
        this.f262229e = sVar;
    }

    public C19144x4e901f97(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f262228d = new java.util.ArrayList();
        this.f262230f = new gt4.r(this);
    }
}
