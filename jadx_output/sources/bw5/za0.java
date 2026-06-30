package bw5;

/* loaded from: classes8.dex */
public enum za0 implements com.tencent.mm.protobuf.h {
    kUnknown(0),
    kMusicDiscoverPreLoad(1),
    kAudioDiscoverInsertion(2),
    kMusicRecentList(3),
    kMusicCategoryPreLoad(4),
    kMusicClientInsertion(5),
    kMusicClientInsertionSyncRecentList(6),
    kMusicRefreshDiscoverLine(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f35925d;

    za0(int i17) {
        this.f35925d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f35925d;
    }
}
