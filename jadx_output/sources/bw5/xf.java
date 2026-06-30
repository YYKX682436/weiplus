package bw5;

/* loaded from: classes6.dex */
public enum xf implements com.tencent.mm.protobuf.h {
    Normal(1),
    ReturnFinder(2),
    ChangeTag(3),
    JumpOther(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f35087d;

    xf(int i17) {
        this.f35087d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f35087d;
    }
}
