package bw5;

/* loaded from: classes6.dex */
public enum np0 implements com.tencent.mm.protobuf.h {
    TingListFetchDirectionDown(0),
    TingListFetchDirectionUp(1);


    /* renamed from: d, reason: collision with root package name */
    public final int f30781d;

    np0(int i17) {
        this.f30781d = i17;
    }

    public static bw5.np0 a(int i17) {
        if (i17 == 0) {
            return TingListFetchDirectionDown;
        }
        if (i17 != 1) {
            return null;
        }
        return TingListFetchDirectionUp;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30781d;
    }
}
