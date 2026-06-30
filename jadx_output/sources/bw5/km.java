package bw5;

/* loaded from: classes2.dex */
public enum km implements com.tencent.mm.protobuf.h {
    FinderLiveImgRatio_Default(0),
    FinderLiveImgRatio_16vs9(1),
    FinderLiveImgRatio_4vs3(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f29422d;

    km(int i17) {
        this.f29422d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29422d;
    }
}
