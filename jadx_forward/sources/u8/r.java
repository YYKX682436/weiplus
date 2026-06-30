package u8;

/* loaded from: classes15.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f506895a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.n f506896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f506897c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f506898d;

    public r(boolean z17, java.lang.String str, int i17, byte[] bArr, int i18, int i19, byte[] bArr2) {
        int i27 = 1;
        t9.a.a((bArr2 == null) ^ (i17 == 0));
        this.f506895a = str;
        this.f506897c = i17;
        this.f506898d = bArr2;
        if (str != null && (str.equals("cbc1") || str.equals("cbcs"))) {
            i27 = 2;
        }
        this.f506896b = new q8.n(i27, bArr, i18, i19);
    }
}
