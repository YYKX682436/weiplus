package bw5;

/* loaded from: classes11.dex */
public enum a80 implements com.tencent.mm.protobuf.h {
    MMLISTEN_ITEM_TYPE_MUSIC(1),
    /* JADX INFO: Fake field, exist only in values array */
    MMLISTEN_ITEM_TYPE_MV(1),
    MMLISTEN_ITEM_TYPE_ARTICLE(2),
    MMLISTEN_ITEM_TYPE_ARTICLE_AUDIO(3),
    MMLISTEN_ITEM_TYPE_FINDER(4),
    MMLISTEN_ITEM_TYPE_LIVE(5),
    MMLISTEN_ITEM_TYPE_BROADCAST(6),
    MMLISTEN_ITEM_TYPE_MV_V2(7),
    MMLISTEN_ITEM_TYPE_MV_BIZ(8),
    MMLISTEN_ITEM_TYPE_CHAT_TTS(9),
    MMLISTEN_ITEM_TYPE_CHATROOM_TTS(10),
    MMLISTEN_ITEM_TYPE_LOCAL_FILE(100),
    MMLISTEN_ITEM_TYPE_LOCAL_WEAPP(101),
    MMLISTEN_ITEM_TYPE_LOCAL_MUSIC_FILE(102),
    MMLISTEN_ITEM_TYPE_LOCAL_MUSIC_WEAPP(103),
    MMLISTEN_ITEM_TYPE_AUDIO_URL(104),
    MMLISTEN_ITEM_TYPE_LOCAL_RECORD_FILE(105),
    MMLISTEN_ITEM_TYPE_MUSIC_CHORUS_MV(106);


    /* renamed from: d, reason: collision with root package name */
    public final int f25086d;

    a80(int i17) {
        this.f25086d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f25086d;
    }
}
