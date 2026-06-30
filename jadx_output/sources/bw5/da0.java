package bw5;

/* loaded from: classes2.dex */
public enum da0 implements com.tencent.mm.protobuf.h {
    MMLISTEN_PLAY_QUALITY_UNKNOWN(0),
    MMLISTEN_PLAY_QUALITY_STANDARD(1),
    MMLISTEN_PLAY_QUALITY_HQ(2),
    MMLISTEN_PLAY_QUALITY_SQ(3),
    /* JADX INFO: Fake field, exist only in values array */
    MMLISTEN_PLAY_QUALITY_HIFI(3),
    MMLISTEN_PLAY_QUALITY_HIRES(4),
    MMLISTEN_PLAY_QUALITY_TTS_HLS(5),
    MMLISTEN_PLAY_QUALITY_TTS_FULL(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f26415d;

    da0(int i17) {
        this.f26415d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f26415d;
    }
}
