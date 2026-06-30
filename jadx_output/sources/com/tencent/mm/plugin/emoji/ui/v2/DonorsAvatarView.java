package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes2.dex */
public class DonorsAvatarView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f98227d;

    /* renamed from: e, reason: collision with root package name */
    public int f98228e;

    /* renamed from: f, reason: collision with root package name */
    public int f98229f;

    /* renamed from: g, reason: collision with root package name */
    public int f98230g;

    public DonorsAvatarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        setOrientation(0);
        this.f98227d = i65.a.B(getContext());
        this.f98228e = i65.a.h(getContext(), com.tencent.mm.R.dimen.f480357vk);
        this.f98229f = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479563f);
        this.f98230g = i65.a.h(getContext(), com.tencent.mm.R.dimen.i_);
        int i17 = this.f98228e;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, i17);
        int i18 = this.f98229f;
        layoutParams.leftMargin = i18;
        layoutParams.rightMargin = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.DonorsAvatarView", "max count:%d", java.lang.Integer.valueOf((this.f98227d - (this.f98230g * 2)) / (this.f98228e + (i18 * 2))));
    }

    public DonorsAvatarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
