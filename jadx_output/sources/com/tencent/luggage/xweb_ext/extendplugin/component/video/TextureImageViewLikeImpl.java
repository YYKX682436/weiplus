package com.tencent.luggage.xweb_ext.extendplugin.component.video;

/* loaded from: classes10.dex */
public class TextureImageViewLikeImpl extends androidx.constraintlayout.widget.ConstraintLayout implements tf.p {

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.FrameLayout f47739v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.TextureView f47740w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ImageView f47741x;

    public TextureImageViewLikeImpl(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // tf.p
    public android.graphics.Bitmap getBitmap() {
        return this.f47740w.getBitmap();
    }

    @Override // tf.p
    public android.graphics.SurfaceTexture getSurfaceTexture() {
        return this.f47740w.getSurfaceTexture();
    }

    public android.view.TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return this.f47740w.getSurfaceTextureListener();
    }

    @Override // tf.p
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = this.f47741x;
        if (bitmap == null) {
            imageView.setVisibility(4);
        } else {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    @Override // tf.p
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f47740w.setSurfaceTextureListener(surfaceTextureListener);
    }

    public void setTextureViewHeightWeight(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TextureImageViewLikeImpl", "setTextureViewHeightWeight, heightWeight: " + f17);
        android.widget.FrameLayout frameLayout = this.f47739v;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) frameLayout.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = 0;
        layoutParams.O = f17;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = -1;
        frameLayout.setLayoutParams(layoutParams);
    }

    public void setTextureViewWidthWeight(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TextureImageViewLikeImpl", "setTextureViewWidthWeight, widthWeight: " + f17);
        android.widget.FrameLayout frameLayout = this.f47739v;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) frameLayout.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = 0;
        layoutParams.N = f17;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = -1;
        frameLayout.setLayoutParams(layoutParams);
    }

    public TextureImageViewLikeImpl(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setId(com.tencent.mm.R.id.f483196z9);
        setBackgroundColor(-16777216);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f47739v = frameLayout;
        addView(frameLayout, -1, -1);
        frameLayout.setId(com.tencent.mm.R.id.f483195z8);
        android.view.TextureView textureView = new android.view.TextureView(context);
        this.f47740w = textureView;
        frameLayout.addView(textureView, -1, -1);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f47741x = imageView;
        frameLayout.addView(imageView, -1, -1);
        imageView.setVisibility(4);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.d(this);
        cVar.f(com.tencent.mm.R.id.f483195z8, 3, com.tencent.mm.R.id.f483196z9, 3, 0);
        cVar.f(com.tencent.mm.R.id.f483195z8, 4, com.tencent.mm.R.id.f483196z9, 4, 0);
        cVar.f(com.tencent.mm.R.id.f483195z8, 1, com.tencent.mm.R.id.f483196z9, 1, 0);
        cVar.f(com.tencent.mm.R.id.f483195z8, 2, com.tencent.mm.R.id.f483196z9, 2, 0);
        cVar.b(this);
        setConstraintSet(null);
    }
}
