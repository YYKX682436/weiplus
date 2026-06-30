package com.tencent.mm.feature.emoji.api;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH&J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&J/\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u0010J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/feature/emoji/api/IGIFJNIFactoryService;", "Li95/m;", "Lcom/tencent/mm/api/IEmojiInfo;", "emojiInfo", "Landroid/graphics/Bitmap;", "decodeThumb", "", "byteArray", "", "cacheKey", "", "isWxEmoji", "md5", "Lwq/d;", "getDecoder", "bytes", "([BLjava/lang/String;Ljava/lang/Boolean;)Lwq/d;", "emojisdk-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public interface IGIFJNIFactoryService extends i95.m {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ wq.d getDecoder$default(com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService iGIFJNIFactoryService, byte[] bArr, java.lang.String str, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDecoder");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        return iGIFJNIFactoryService.getDecoder(bArr, str, bool);
    }

    android.graphics.Bitmap decodeThumb(com.tencent.mm.api.IEmojiInfo emojiInfo);

    android.graphics.Bitmap decodeThumb(byte[] byteArray);

    android.graphics.Bitmap decodeThumb(byte[] byteArray, java.lang.String cacheKey, boolean isWxEmoji);

    wq.d getDecoder(com.tencent.mm.api.IEmojiInfo emojiInfo);

    wq.d getDecoder(java.lang.String md52);

    wq.d getDecoder(byte[] bytes);

    wq.d getDecoder(byte[] bytes, java.lang.String cacheKey, java.lang.Boolean isWxEmoji);
}
