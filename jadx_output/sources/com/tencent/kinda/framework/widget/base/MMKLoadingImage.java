package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKLoadingImage extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.LinearLayout> implements com.tencent.kinda.gen.KLoadingImage {
    private android.content.Context context;
    private com.tencent.kinda.gen.LoadingImageStyle loadingImageStype;
    private android.widget.ProgressBar progressBar;

    @Override // com.tencent.kinda.gen.KLoadingImage
    public com.tencent.kinda.gen.LoadingImageStyle getStyle() {
        return this.loadingImageStype;
    }

    @Override // com.tencent.kinda.gen.KLoadingImage
    public void setStyle(com.tencent.kinda.gen.LoadingImageStyle loadingImageStyle) {
        android.content.Context context = this.context;
        if (context != null) {
            this.loadingImageStype = loadingImageStyle;
            if (loadingImageStyle == com.tencent.kinda.gen.LoadingImageStyle.WHITE) {
                this.progressBar.setIndeterminateDrawable(i65.a.i(context, com.tencent.mm.R.drawable.avp));
            } else if (loadingImageStyle == com.tencent.kinda.gen.LoadingImageStyle.WHITELARGE) {
                this.progressBar.setIndeterminateDrawable(i65.a.i(context, com.tencent.mm.R.drawable.avp));
            } else if (loadingImageStyle == com.tencent.kinda.gen.LoadingImageStyle.GRAY) {
                this.progressBar.setIndeterminateDrawable(i65.a.i(context, com.tencent.mm.R.drawable.avh));
            }
        }
    }

    @Override // com.tencent.kinda.gen.KLoadingImage
    public void startAnimating() {
        this.progressBar.setVisibility(0);
    }

    @Override // com.tencent.kinda.gen.KLoadingImage
    public void stopAnimating() {
        this.progressBar.setVisibility(8);
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.LinearLayout createView(android.content.Context context) {
        this.context = context;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(context);
        this.progressBar = progressBar;
        progressBar.setIndeterminateDrawable(i65.a.i(context, com.tencent.mm.R.drawable.avh));
        this.progressBar.setVisibility(8);
        linearLayout.addView(this.progressBar, new android.widget.LinearLayout.LayoutParams(-1, -1));
        return linearLayout;
    }
}
