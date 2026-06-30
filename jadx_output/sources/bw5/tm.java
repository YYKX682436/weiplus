package bw5;

/* loaded from: classes2.dex */
public enum tm implements com.tencent.mm.protobuf.h {
    Audio(1),
    Video(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f33515d;

    tm(int i17) {
        this.f33515d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f33515d;
    }
}
