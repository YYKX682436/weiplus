package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J-\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/feature/emoji/GIFJNIFactoryFeatureService;", "Li95/w;", "Lcom/tencent/mm/feature/emoji/api/IGIFJNIFactoryService;", "Lcom/tencent/mm/api/IEmojiInfo;", "emojiInfo", "Landroid/graphics/Bitmap;", "decodeThumb", "", "byteArray", "", "cacheKey", "", "isWxEmoji", "md5", "Lwq/d;", "getDecoder", "bytes", "([BLjava/lang/String;Ljava/lang/Boolean;)Lwq/d;", "<init>", "()V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureService */
/* loaded from: classes12.dex */
public final class C10578xd77513a8 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5 {
    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5
    /* renamed from: decodeThumb */
    public android.graphics.Bitmap mo44445x46823488(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        return com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43678x46823488((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojiInfo);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5
    /* renamed from: getDecoder */
    public wq.d mo44449x99bce80e(java.lang.String md52) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        return com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43682x99bce80e(md52);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5
    /* renamed from: decodeThumb */
    public android.graphics.Bitmap mo44446x46823488(byte[] byteArray) {
        return com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43679x46823488(byteArray);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5
    /* renamed from: getDecoder */
    public wq.d mo44450x99bce80e(byte[] bytes) {
        return com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43683x99bce80e(bytes);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5
    /* renamed from: decodeThumb */
    public android.graphics.Bitmap mo44447x46823488(byte[] byteArray, java.lang.String cacheKey, boolean isWxEmoji) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
        return com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43680x46823488(byteArray, cacheKey, isWxEmoji);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5
    /* renamed from: getDecoder */
    public wq.d mo44451x99bce80e(byte[] bytes, java.lang.String cacheKey, java.lang.Boolean isWxEmoji) {
        return com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43684x99bce80e(bytes, cacheKey, isWxEmoji);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5
    /* renamed from: getDecoder */
    public wq.d mo44448x99bce80e(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        return com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43681x99bce80e((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojiInfo);
    }
}
