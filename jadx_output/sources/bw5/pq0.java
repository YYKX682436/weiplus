package bw5;

/* loaded from: classes11.dex */
public enum pq0 implements com.tencent.mm.protobuf.h {
    Idle(0),
    Playing(1),
    Loading(2),
    Paused(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f31808d;

    pq0(int i17) {
        this.f31808d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f31808d;
    }
}
