package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.DonorsAvatarView */
/* loaded from: classes2.dex */
public class C13341x7a15e6b extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f179760d;

    /* renamed from: e, reason: collision with root package name */
    public int f179761e;

    /* renamed from: f, reason: collision with root package name */
    public int f179762f;

    /* renamed from: g, reason: collision with root package name */
    public int f179763g;

    public C13341x7a15e6b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        setOrientation(0);
        this.f179760d = i65.a.B(getContext());
        this.f179761e = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561890vk);
        this.f179762f = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
        this.f179763g = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
        int i17 = this.f179761e;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, i17);
        int i18 = this.f179762f;
        layoutParams.leftMargin = i18;
        layoutParams.rightMargin = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.DonorsAvatarView", "max count:%d", java.lang.Integer.valueOf((this.f179760d - (this.f179763g * 2)) / (this.f179761e + (i18 * 2))));
    }

    public C13341x7a15e6b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
