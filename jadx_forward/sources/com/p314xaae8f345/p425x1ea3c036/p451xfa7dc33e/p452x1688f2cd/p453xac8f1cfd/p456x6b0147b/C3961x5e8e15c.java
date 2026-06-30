package com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b;

/* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl */
/* loaded from: classes10.dex */
public class C3961x5e8e15c extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 implements tf.p {

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.FrameLayout f129272v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.TextureView f129273w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ImageView f129274x;

    public C3961x5e8e15c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // tf.p
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo32285x12501425() {
        return this.f129273w.getBitmap();
    }

    @Override // tf.p
    /* renamed from: getSurfaceTexture */
    public android.graphics.SurfaceTexture mo32286x182e20a4() {
        return this.f129273w.getSurfaceTexture();
    }

    /* renamed from: getSurfaceTextureListener */
    public android.view.TextureView.SurfaceTextureListener m32287xe7fc6578() {
        return this.f129273w.getSurfaceTextureListener();
    }

    @Override // tf.p
    /* renamed from: setImageBitmap */
    public void mo32288xd44890a8(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = this.f129274x;
        if (bitmap == null) {
            imageView.setVisibility(4);
        } else {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    @Override // tf.p
    /* renamed from: setSurfaceTextureListener */
    public void mo32289x1a400184(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f129273w.setSurfaceTextureListener(surfaceTextureListener);
    }

    /* renamed from: setTextureViewHeightWeight */
    public void m32290xf492963d(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TextureImageViewLikeImpl", "setTextureViewHeightWeight, heightWeight: " + f17);
        android.widget.FrameLayout frameLayout = this.f129272v;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) frameLayout.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = 0;
        layoutParams.O = f17;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = -1;
        frameLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: setTextureViewWidthWeight */
    public void m32291x703ef060(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TextureImageViewLikeImpl", "setTextureViewWidthWeight, widthWeight: " + f17);
        android.widget.FrameLayout frameLayout = this.f129272v;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) frameLayout.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = 0;
        layoutParams.N = f17;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = -1;
        frameLayout.setLayoutParams(layoutParams);
    }

    public C3961x5e8e15c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setId(com.p314xaae8f345.mm.R.id.f564729z9);
        setBackgroundColor(-16777216);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f129272v = frameLayout;
        addView(frameLayout, -1, -1);
        frameLayout.setId(com.p314xaae8f345.mm.R.id.f564728z8);
        android.view.TextureView textureView = new android.view.TextureView(context);
        this.f129273w = textureView;
        frameLayout.addView(textureView, -1, -1);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f129274x = imageView;
        frameLayout.addView(imageView, -1, -1);
        imageView.setVisibility(4);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        cVar.d(this);
        cVar.f(com.p314xaae8f345.mm.R.id.f564728z8, 3, com.p314xaae8f345.mm.R.id.f564729z9, 3, 0);
        cVar.f(com.p314xaae8f345.mm.R.id.f564728z8, 4, com.p314xaae8f345.mm.R.id.f564729z9, 4, 0);
        cVar.f(com.p314xaae8f345.mm.R.id.f564728z8, 1, com.p314xaae8f345.mm.R.id.f564729z9, 1, 0);
        cVar.f(com.p314xaae8f345.mm.R.id.f564728z8, 2, com.p314xaae8f345.mm.R.id.f564729z9, 2, 0);
        cVar.b(this);
        m7179xd020a803(null);
    }
}
