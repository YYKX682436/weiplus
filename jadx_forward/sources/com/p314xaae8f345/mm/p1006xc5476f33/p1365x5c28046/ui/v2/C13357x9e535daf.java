package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.PaddingImageView */
/* loaded from: classes15.dex */
public class C13357x9e535daf extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f179876d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f179877e;

    /* renamed from: f, reason: collision with root package name */
    public int f179878f;

    public C13357x9e535daf(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f179878f = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f179876d = imageView;
        int i17 = this.f179878f;
        imageView.setPadding(i17, i17, i17, i17);
        this.f179877e = new android.widget.ImageView(context);
    }

    /* renamed from: getImageView */
    public android.widget.ImageView m54841xcb16a3ea() {
        return this.f179876d;
    }

    /* renamed from: getImageViewFG */
    public android.widget.ImageView m54842x5ffd5a2b() {
        return this.f179877e;
    }

    public C13357x9e535daf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public C13357x9e535daf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
