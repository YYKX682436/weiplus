package com.davemorrissey.labs.subscaleview.model;

/* loaded from: classes15.dex */
public interface IBitmapLoaderFactory {
    com.davemorrissey.labs.subscaleview.model.ILoadable newInstance(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView, android.content.Context context, com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory, android.net.Uri uri, boolean z17);
}
