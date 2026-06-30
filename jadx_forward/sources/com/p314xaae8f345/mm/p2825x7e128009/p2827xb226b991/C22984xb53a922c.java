package com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u0017\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/xeffect/effect/StickerDecoderWrapper;", "Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "Landroid/util/Size;", "size", "", "sizeInArray", "", "duration", "time", "Ljz5/f0;", "seekTo", "Landroid/graphics/Bitmap;", "getFrame", "destroy", "decoder", "Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "getDecoder", "()Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "<init>", "(Lcom/tencent/mm/xeffect/effect/IStickerDecoder;)V", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.effect.StickerDecoderWrapper */
/* loaded from: classes10.dex */
public final class C22984xb53a922c implements com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 {
    private final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 decoder;

    public C22984xb53a922c(com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 decoder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(decoder, "decoder");
        this.decoder = decoder;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: destroy */
    public void mo83821x5cd39ffa() {
        this.decoder.mo83821x5cd39ffa();
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: duration */
    public long mo83822x89444d94() {
        return this.decoder.mo83822x89444d94();
    }

    public final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 getDecoder() {
        return this.decoder;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: getFrame */
    public android.graphics.Bitmap mo83823x74704fb7() {
        return this.decoder.mo83823x74704fb7();
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: seekTo */
    public void mo83824xc9fc1b13(long j17) {
        this.decoder.mo83824xc9fc1b13(j17);
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: size */
    public android.util.Size mo83825x35e001() {
        return this.decoder.mo83825x35e001();
    }

    /* renamed from: sizeInArray */
    public final int[] m83830x8e74c8f3() {
        android.util.Size mo83825x35e001 = this.decoder.mo83825x35e001();
        return new int[]{mo83825x35e001.getWidth(), mo83825x35e001.getHeight()};
    }
}
