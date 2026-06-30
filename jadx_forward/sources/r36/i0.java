package r36;

/* loaded from: classes16.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final r36.i0[] f450956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f450957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f450958c;

    public i0() {
        this.f450956a = new r36.i0[256];
        this.f450957b = 0;
        this.f450958c = 0;
    }

    public i0(int i17, int i18) {
        this.f450956a = null;
        this.f450957b = i17;
        int i19 = i18 & 7;
        this.f450958c = i19 == 0 ? 8 : i19;
    }
}
