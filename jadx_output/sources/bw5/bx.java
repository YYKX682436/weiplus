package bw5;

/* loaded from: classes2.dex */
public enum bx implements com.tencent.mm.protobuf.h {
    Chinese(0),
    English(1),
    Origin(2),
    Invalid(30000);


    /* renamed from: d, reason: collision with root package name */
    public final int f25860d;

    bx(int i17) {
        this.f25860d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f25860d;
    }
}
