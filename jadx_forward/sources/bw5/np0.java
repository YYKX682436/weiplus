package bw5;

/* loaded from: classes6.dex */
public enum np0 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    TingListFetchDirectionDown(0),
    TingListFetchDirectionUp(1);


    /* renamed from: d, reason: collision with root package name */
    public final int f112314d;

    np0(int i17) {
        this.f112314d = i17;
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f112314d;
    }
}
