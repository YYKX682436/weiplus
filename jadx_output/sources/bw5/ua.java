package bw5;

/* loaded from: classes4.dex */
public enum ua implements com.tencent.mm.protobuf.h {
    EmoticonTabItemType_Unknown(0),
    EmoticonTabItemType_QQEmoji(1),
    EmoticonTabItemType_Emoticon(2),
    EmoticonTabItemType_Store(3),
    EmoticonTabItemType_Search(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f33824d;

    ua(int i17) {
        this.f33824d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f33824d;
    }
}
