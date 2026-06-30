package com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/tencent/luggage/xweb_ext/extendplugin/component/live/livepusher/StickerItemInfo$StickerBackType", "", "Lcom/tencent/luggage/xweb_ext/extendplugin/component/live/livepusher/StickerItemInfo$StickerBackType;", "", "jsonVal", "I", "getJsonVal", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "yf/k1", "BACKGROUND", "HUMAN_REGION", "luggage-xweb-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class StickerItemInfo$StickerBackType {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType[] $VALUES;
    public static final yf.k1 Companion;
    private final int jsonVal;
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType BACKGROUND = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType("BACKGROUND", 0, 0);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType HUMAN_REGION = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType("HUMAN_REGION", 1, 1);

    private static final /* synthetic */ com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType[] $values() {
        return new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType[]{BACKGROUND, HUMAN_REGION};
    }

    static {
        com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        Companion = new yf.k1(null);
    }

    private StickerItemInfo$StickerBackType(java.lang.String str, int i17, int i18) {
        this.jsonVal = i18;
    }

    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType from(int i17) {
        Companion.getClass();
        for (com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType stickerItemInfo$StickerBackType : values()) {
            if (i17 == stickerItemInfo$StickerBackType.getJsonVal()) {
                return stickerItemInfo$StickerBackType;
            }
        }
        return null;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType valueOf(java.lang.String str) {
        return (com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType) java.lang.Enum.valueOf(com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType.class, str);
    }

    public static com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType[] values() {
        return (com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType[]) $VALUES.clone();
    }

    public final int getJsonVal() {
        return this.jsonVal;
    }
}
