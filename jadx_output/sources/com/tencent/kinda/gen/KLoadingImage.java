package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KLoadingImage extends com.tencent.kinda.gen.KView {
    com.tencent.kinda.gen.LoadingImageStyle getStyle();

    void setStyle(com.tencent.kinda.gen.LoadingImageStyle loadingImageStyle);

    void startAnimating();

    void stopAnimating();
}
