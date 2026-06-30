package bw5;

/* loaded from: classes15.dex */
public enum fi0 implements com.tencent.mm.protobuf.h {
    DOCUMENT(0),
    IMAGE(1),
    VIDEO(2),
    ARCHIVE(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f27303d;

    fi0(int i17) {
        this.f27303d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27303d;
    }
}
