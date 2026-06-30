package com.tencent.mm.feature.emoji;

@j95.b
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J-\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/feature/emoji/GIFJNIFactoryFeatureService;", "Li95/w;", "Lcom/tencent/mm/feature/emoji/api/IGIFJNIFactoryService;", "Lcom/tencent/mm/api/IEmojiInfo;", "emojiInfo", "Landroid/graphics/Bitmap;", "decodeThumb", "", "byteArray", "", "cacheKey", "", "isWxEmoji", "md5", "Lwq/d;", "getDecoder", "bytes", "([BLjava/lang/String;Ljava/lang/Boolean;)Lwq/d;", "<init>", "()V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class GIFJNIFactoryFeatureService extends i95.w implements com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService {
    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService
    public android.graphics.Bitmap decodeThumb(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        return com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.decodeThumb((com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService
    public wq.d getDecoder(java.lang.String md52) {
        kotlin.jvm.internal.o.g(md52, "md5");
        return com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.getDecoder(md52);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService
    public android.graphics.Bitmap decodeThumb(byte[] byteArray) {
        return com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.decodeThumb(byteArray);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService
    public wq.d getDecoder(byte[] bytes) {
        return com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.getDecoder(bytes);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService
    public android.graphics.Bitmap decodeThumb(byte[] byteArray, java.lang.String cacheKey, boolean isWxEmoji) {
        kotlin.jvm.internal.o.g(cacheKey, "cacheKey");
        return com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.decodeThumb(byteArray, cacheKey, isWxEmoji);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService
    public wq.d getDecoder(byte[] bytes, java.lang.String cacheKey, java.lang.Boolean isWxEmoji) {
        return com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.getDecoder(bytes, cacheKey, isWxEmoji);
    }

    @Override // com.tencent.mm.feature.emoji.api.IGIFJNIFactoryService
    public wq.d getDecoder(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        return com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.getDecoder((com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo);
    }
}
