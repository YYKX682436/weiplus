package bw5;

/* loaded from: classes2.dex */
public enum sf implements com.tencent.mm.protobuf.h {
    FinderFeedTabTypeRecommend(0),
    FinderFeedTabTypeLatest(1),
    FinderFeedTabTypeCount(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f32958d;

    sf(int i17) {
        this.f32958d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f32958d;
    }
}
