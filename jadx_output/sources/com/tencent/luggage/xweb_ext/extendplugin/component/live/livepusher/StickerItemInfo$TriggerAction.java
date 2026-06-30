package com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"com/tencent/luggage/xweb_ext/extendplugin/component/live/livepusher/StickerItemInfo$TriggerAction", "", "Lcom/tencent/luggage/xweb_ext/extendplugin/component/live/livepusher/StickerItemInfo$TriggerAction;", "", "jsonVal", "I", "getJsonVal", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "yf/l1", "DEFAULT_ACTION_LOOP", "FACE_ACTION_MOUTH_OPEN", "FACE_ACTION_MOUTH_KISS", "FACE_ACTION_LEFT_EYE_BLINK", "FACE_ACTION_RIGHT_EYE_BLINK", "FACE_ACTION_EYE_BLINK", "FACE_ACTION_EYEBROW_UP", "FACE_ACTION_HEAD_SHAKE", "FACE_ACTION_HEAD_NOD", "HAND_ACTION_HEART", "HAND_ACTION_PAPER", "HAND_ACTION_SCISSOR", "HAND_ACTION_FIST", "HAND_ACTION_ONE", "HAND_ACTION_LOVE", "HAND_ACTION_LIKE", "HAND_ACTION_OK", "HAND_ACTION_ROCK", "HAND_ACTION_SIX", "HAND_ACTION_EIGHT", "HAND_ACTION_LIFT", "HAND_ACTION_GOOD_FORTUNE", "luggage-xweb-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class StickerItemInfo$TriggerAction {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction[] $VALUES;
    public static final yf.l1 Companion;
    private final int jsonVal;
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction DEFAULT_ACTION_LOOP = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("DEFAULT_ACTION_LOOP", 0, -1);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction FACE_ACTION_MOUTH_OPEN = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("FACE_ACTION_MOUTH_OPEN", 1, 10);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction FACE_ACTION_MOUTH_KISS = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("FACE_ACTION_MOUTH_KISS", 2, 11);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction FACE_ACTION_LEFT_EYE_BLINK = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("FACE_ACTION_LEFT_EYE_BLINK", 3, 12);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction FACE_ACTION_RIGHT_EYE_BLINK = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("FACE_ACTION_RIGHT_EYE_BLINK", 4, 13);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction FACE_ACTION_EYE_BLINK = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("FACE_ACTION_EYE_BLINK", 5, 14);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction FACE_ACTION_EYEBROW_UP = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("FACE_ACTION_EYEBROW_UP", 6, 15);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction FACE_ACTION_HEAD_SHAKE = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("FACE_ACTION_HEAD_SHAKE", 7, 16);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction FACE_ACTION_HEAD_NOD = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("FACE_ACTION_HEAD_NOD", 8, 17);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_HEART = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_HEART", 9, 100);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_PAPER = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_PAPER", 10, 101);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_SCISSOR = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_SCISSOR", 11, 102);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_FIST = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_FIST", 12, 103);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_ONE = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_ONE", 13, 104);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_LOVE = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_LOVE", 14, 105);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_LIKE = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_LIKE", 15, 106);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_OK = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_OK", 16, 107);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_ROCK = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_ROCK", 17, 108);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_SIX = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_SIX", 18, 109);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_EIGHT = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_EIGHT", 19, 110);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_LIFT = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_LIFT", 20, 111);
    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction HAND_ACTION_GOOD_FORTUNE = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction("HAND_ACTION_GOOD_FORTUNE", 21, 112);

    private static final /* synthetic */ com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction[] $values() {
        return new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction[]{DEFAULT_ACTION_LOOP, FACE_ACTION_MOUTH_OPEN, FACE_ACTION_MOUTH_KISS, FACE_ACTION_LEFT_EYE_BLINK, FACE_ACTION_RIGHT_EYE_BLINK, FACE_ACTION_EYE_BLINK, FACE_ACTION_EYEBROW_UP, FACE_ACTION_HEAD_SHAKE, FACE_ACTION_HEAD_NOD, HAND_ACTION_HEART, HAND_ACTION_PAPER, HAND_ACTION_SCISSOR, HAND_ACTION_FIST, HAND_ACTION_ONE, HAND_ACTION_LOVE, HAND_ACTION_LIKE, HAND_ACTION_OK, HAND_ACTION_ROCK, HAND_ACTION_SIX, HAND_ACTION_EIGHT, HAND_ACTION_LIFT, HAND_ACTION_GOOD_FORTUNE};
    }

    static {
        com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        Companion = new yf.l1(null);
    }

    private StickerItemInfo$TriggerAction(java.lang.String str, int i17, int i18) {
        this.jsonVal = i18;
    }

    public static final com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction from(int i17) {
        Companion.getClass();
        for (com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction stickerItemInfo$TriggerAction : values()) {
            if (i17 == stickerItemInfo$TriggerAction.getJsonVal()) {
                return stickerItemInfo$TriggerAction;
            }
        }
        return null;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction valueOf(java.lang.String str) {
        return (com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction) java.lang.Enum.valueOf(com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction.class, str);
    }

    public static com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction[] values() {
        return (com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction[]) $VALUES.clone();
    }

    public final int getJsonVal() {
        return this.jsonVal;
    }
}
