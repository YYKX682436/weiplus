package bw5;

/* loaded from: classes2.dex */
public enum aq0 implements com.tencent.mm.protobuf.h {
    TingMusicSquareLoadingStatus_Idle(0),
    TingMusicSquareLoadingStatus_LoadingFirstPage(1),
    TingMusicSquareLoadingStatus_LoadingMorePage(2),
    TingMusicSquareLoadingStatus_Error(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f25312d;

    aq0(int i17) {
        this.f25312d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f25312d;
    }
}
