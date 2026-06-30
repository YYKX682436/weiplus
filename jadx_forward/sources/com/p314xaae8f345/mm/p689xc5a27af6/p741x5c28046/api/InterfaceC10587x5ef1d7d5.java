package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH&J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&J/\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u0010J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/feature/emoji/api/IGIFJNIFactoryService;", "Li95/m;", "Lcom/tencent/mm/api/IEmojiInfo;", "emojiInfo", "Landroid/graphics/Bitmap;", "decodeThumb", "", "byteArray", "", "cacheKey", "", "isWxEmoji", "md5", "Lwq/d;", "getDecoder", "bytes", "([BLjava/lang/String;Ljava/lang/Boolean;)Lwq/d;", "emojisdk-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService */
/* loaded from: classes12.dex */
public interface InterfaceC10587x5ef1d7d5 extends i95.m {

    @p3321xbce91901.InterfaceC29042xe907df4f(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService$DefaultImpls */
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: getDecoder$default */
    static /* synthetic */ wq.d m44531x35d11fab(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10587x5ef1d7d5 interfaceC10587x5ef1d7d5, byte[] bArr, java.lang.String str, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDecoder");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        return interfaceC10587x5ef1d7d5.mo44451x99bce80e(bArr, str, bool);
    }

    /* renamed from: decodeThumb */
    android.graphics.Bitmap mo44445x46823488(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo);

    /* renamed from: decodeThumb */
    android.graphics.Bitmap mo44446x46823488(byte[] byteArray);

    /* renamed from: decodeThumb */
    android.graphics.Bitmap mo44447x46823488(byte[] byteArray, java.lang.String cacheKey, boolean isWxEmoji);

    /* renamed from: getDecoder */
    wq.d mo44448x99bce80e(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo);

    /* renamed from: getDecoder */
    wq.d mo44449x99bce80e(java.lang.String md52);

    /* renamed from: getDecoder */
    wq.d mo44450x99bce80e(byte[] bytes);

    /* renamed from: getDecoder */
    wq.d mo44451x99bce80e(byte[] bytes, java.lang.String cacheKey, java.lang.Boolean isWxEmoji);
}
