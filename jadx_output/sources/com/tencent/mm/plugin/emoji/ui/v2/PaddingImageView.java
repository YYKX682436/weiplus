package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class PaddingImageView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f98343d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f98344e;

    /* renamed from: f, reason: collision with root package name */
    public int f98345f;

    public PaddingImageView(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f98345f = i65.a.h(getContext(), com.tencent.mm.R.dimen.i_);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f98343d = imageView;
        int i17 = this.f98345f;
        imageView.setPadding(i17, i17, i17, i17);
        this.f98344e = new android.widget.ImageView(context);
    }

    public android.widget.ImageView getImageView() {
        return this.f98343d;
    }

    public android.widget.ImageView getImageViewFG() {
        return this.f98344e;
    }

    public PaddingImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PaddingImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
