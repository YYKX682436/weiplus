package bw5;

/* loaded from: classes2.dex */
public enum f10 implements com.tencent.mm.protobuf.h {
    Unknown(0),
    On(1),
    Off(2),
    Deleted(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f27114d;

    f10(int i17) {
        this.f27114d = i17;
    }

    public static bw5.f10 a(int i17) {
        if (i17 == 0) {
            return Unknown;
        }
        if (i17 == 1) {
            return On;
        }
        if (i17 == 2) {
            return Off;
        }
        if (i17 != 3) {
            return null;
        }
        return Deleted;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27114d;
    }
}
