package com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991;

@p3321xbce91901.InterfaceC29042xe907df4f(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/tencent/mm/xeffect/effect/StickerDecoderFactoryWrapper;", "Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "factory", "(Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;)V", "getFactory", "()Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "getDecoder", "Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "bytes", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "", "renderlib_release"}, k = 1, mv = {1, 1, 15})
/* renamed from: com.tencent.mm.xeffect.effect.StickerDecoderFactoryWrapper */
/* loaded from: classes10.dex */
public final class C22983xd503b070 implements com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa {
    private final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa factory;

    public C22983xd503b070(com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa factory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(factory, "factory");
        this.factory = factory;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa
    /* renamed from: getDecoder */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 mo83826x99bce80e(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(path, "path");
        return new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22984xb53a922c(this.factory.mo83826x99bce80e(path));
    }

    public final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa getFactory() {
        return this.factory;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa
    /* renamed from: getDecoder */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 mo83827x99bce80e(byte[] bytes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(bytes, "bytes");
        return new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22984xb53a922c(this.factory.mo83827x99bce80e(bytes));
    }
}
