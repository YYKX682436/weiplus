package bw5;

/* loaded from: classes10.dex */
public enum ub implements com.tencent.mm.protobuf.h {
    Image(0),
    Video(1),
    LivePhoto(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f33834d;

    ub(int i17) {
        this.f33834d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f33834d;
    }
}
