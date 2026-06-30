package bw5;

/* loaded from: classes11.dex */
public enum he0 implements com.tencent.mm.protobuf.h {
    UNKNOW(0),
    FREE_WIFI(1),
    EXPENSIVE_WIFI(2),
    MOBILE(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f28185d;

    he0(int i17) {
        this.f28185d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28185d;
    }
}
