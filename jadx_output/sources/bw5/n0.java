package bw5;

/* loaded from: classes6.dex */
public enum n0 implements com.tencent.mm.protobuf.h {
    NOTIFY_MIG_TO_PC(0),
    NOTIFY_MIG_TO_MOBILE(1),
    NOTIFY_MIG_CLOSE(2),
    NOTIFY_MIG_PAUSE(3),
    NOTIFY_SINGLE_EXPORT_TO_PC(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f30445d;

    n0(int i17) {
        this.f30445d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30445d;
    }
}
