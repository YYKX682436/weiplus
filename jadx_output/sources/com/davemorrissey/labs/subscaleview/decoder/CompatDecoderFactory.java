package com.davemorrissey.labs.subscaleview.decoder;

/* loaded from: classes14.dex */
public class CompatDecoderFactory<T> implements com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<T> {
    private android.graphics.Bitmap.Config bitmapConfig;
    private java.lang.Class<? extends T> clazz;

    public CompatDecoderFactory(java.lang.Class<? extends T> cls) {
        this(cls, null);
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.DecoderFactory
    public T make() {
        return this.bitmapConfig == null ? this.clazz.newInstance() : this.clazz.getConstructor(android.graphics.Bitmap.Config.class).newInstance(this.bitmapConfig);
    }

    public CompatDecoderFactory(java.lang.Class<? extends T> cls, android.graphics.Bitmap.Config config) {
        this.clazz = cls;
        this.bitmapConfig = config;
    }
}
