package bw5;

/* loaded from: classes4.dex */
public enum ca implements com.tencent.mm.protobuf.h {
    EmoticonBoardPageType_QQEmoji(0),
    EmoticonBoardPageType_Emoticon(1),
    EmoticonBoardPageType_Recommend(2),
    EmoticonBoardPageType_CameraEntry(3),
    EmoticonBoardPageType_SystemEmoji(4),
    EmoticonBoardPageType_EmoticonIPSet(5),
    EmoticonBoardPageType_EmoticonIPTip(6),
    EmoticonBoardPageTypeRecommendAndAi(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f26005d;

    ca(int i17) {
        this.f26005d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f26005d;
    }
}
