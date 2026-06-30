package com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44;

/* renamed from: com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory */
/* loaded from: classes14.dex */
public class C1432xe9ec7068<T> implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<T> {

    /* renamed from: bitmapConfig */
    private android.graphics.Bitmap.Config f4414xcfe98151;

    /* renamed from: clazz */
    private java.lang.Class<? extends T> f4415x5a5aa58;

    public C1432xe9ec7068(java.lang.Class<? extends T> cls) {
        this(cls, null);
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446
    /* renamed from: make */
    public T mo15467x3305ee() {
        return this.f4414xcfe98151 == null ? this.f4415x5a5aa58.newInstance() : this.f4415x5a5aa58.getConstructor(android.graphics.Bitmap.Config.class).newInstance(this.f4414xcfe98151);
    }

    public C1432xe9ec7068(java.lang.Class<? extends T> cls, android.graphics.Bitmap.Config config) {
        this.f4415x5a5aa58 = cls;
        this.f4414xcfe98151 = config;
    }
}
