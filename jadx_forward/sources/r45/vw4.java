package r45;

/* loaded from: classes3.dex */
public enum vw4 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    Auto(0),
    Manual(1);


    /* renamed from: d, reason: collision with root package name */
    public final int f470157d;

    vw4(int i17) {
        this.f470157d = i17;
    }

    public static r45.vw4 a(int i17) {
        if (i17 == 0) {
            return Auto;
        }
        if (i17 != 1) {
            return null;
        }
        return Manual;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f470157d;
    }
}
