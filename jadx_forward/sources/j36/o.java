package j36;

/* loaded from: classes13.dex */
public class o extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f379074f = 0;

    public o() {
        this.f379073e = 278;
    }

    public byte[] i(int i17, int i18, long[] jArr) {
        long[] jArr2 = jArr == null ? new long[0] : (long[]) jArr.clone();
        int i19 = 10;
        int length = (jArr2.length * 4) + 10;
        this.f379074f = length;
        byte[] bArr = new byte[length];
        bArr[0] = (byte) 0;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr, 1, i17);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr, 5, i18);
        bArr[9] = (byte) (jArr2.length >> 0);
        for (long j17 : jArr2) {
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr, i19, (int) j17);
            i19 += 4;
        }
        b(this.f379073e);
        a(bArr, this.f379074f);
        g();
        return c();
    }
}
