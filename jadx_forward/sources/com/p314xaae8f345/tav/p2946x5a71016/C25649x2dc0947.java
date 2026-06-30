package com.p314xaae8f345.tav.p2946x5a71016;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/tav/codec/DefaultMediaFactory;", "Lcom/tencent/tav/codec/IMediaFactory;", "encoderFactory", "Lcom/tencent/tav/decoder/IEncoderFactory;", "decoderFactory", "Lcom/tencent/tav/codec/IDecoderFactory;", "(Lcom/tencent/tav/decoder/IEncoderFactory;Lcom/tencent/tav/codec/IDecoderFactory;)V", "getDecoderFactory", "()Lcom/tencent/tav/codec/IDecoderFactory;", "getEncoderFactory", "()Lcom/tencent/tav/decoder/IEncoderFactory;", "createAudioDecoder", "Lcom/tencent/tav/codec/IMediaCodec;", "mimeType", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "createVideoDecoder", "getAudioEncoder", "Lcom/tencent/tav/decoder/AssetWriterAudioEncoder;", "getVideoEncoder", "Lcom/tencent/tav/decoder/AssetWriterVideoEncoder;", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.tav.codec.DefaultMediaFactory */
/* loaded from: classes10.dex */
public final class C25649x2dc0947 implements com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f {
    private final com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf decoderFactory;
    private final com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7 encoderFactory;

    public C25649x2dc0947(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7 interfaceC25768xd59ba4f7, com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf interfaceC25650x9122a0cf) {
        this.encoderFactory = interfaceC25768xd59ba4f7 == null ? new com.p314xaae8f345.tav.p2959x5befac44.C25763x1d46f8cf() : interfaceC25768xd59ba4f7;
        this.decoderFactory = interfaceC25650x9122a0cf == null ? new com.p314xaae8f345.tav.p2946x5a71016.C25648xd8cdf4a7() : interfaceC25650x9122a0cf;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf
    /* renamed from: createAudioDecoder */
    public com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96241x741d26aa(java.lang.String mimeType, java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        return this.decoderFactory.mo96241x741d26aa(mimeType, scene);
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf
    /* renamed from: createVideoDecoder */
    public com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96242xc9e59a65(java.lang.String mimeType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96242xc9e59a65 = this.decoderFactory.mo96242xc9e59a65(mimeType);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo96242xc9e59a65, "createVideoDecoder(...)");
        return mo96242xc9e59a65;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7
    /* renamed from: getAudioEncoder */
    public com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69 mo96243xa29636dc() {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69 mo96243xa29636dc = this.encoderFactory.mo96243xa29636dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo96243xa29636dc, "getAudioEncoder(...)");
        return mo96243xa29636dc;
    }

    public final com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf getDecoderFactory() {
        return this.decoderFactory;
    }

    public final com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7 getEncoderFactory() {
        return this.encoderFactory;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7
    /* renamed from: getVideoEncoder */
    public com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 mo96246xf85eaa97() {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 mo96246xf85eaa97 = this.encoderFactory.mo96246xf85eaa97();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo96246xf85eaa97, "getVideoEncoder(...)");
        return mo96246xf85eaa97;
    }
}
