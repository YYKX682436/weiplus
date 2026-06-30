package bw5;

/* loaded from: classes6.dex */
public enum wf implements com.tencent.mm.protobuf.h {
    HOT(1),
    FRESH(2),
    LIVE(3),
    NAV_LIVE(4),
    FRESH_AFTER_CACHE(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f34683d;

    wf(int i17) {
        this.f34683d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f34683d;
    }
}
