package bw5;

/* loaded from: classes2.dex */
public enum h2 implements com.tencent.mm.protobuf.h {
    UnKnown(0),
    RedDotLoad(1),
    ReLoad(2),
    NormalInitLoad(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f28053d;

    h2(int i17) {
        this.f28053d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28053d;
    }
}
