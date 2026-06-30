package j36;

/* loaded from: classes13.dex */
public class f0 extends j36.m0 {
    public f0() {
        this.f379073e = 327;
    }

    public byte[] i(long j17, byte[] bArr, byte[] bArr2) {
        int i17 = 32;
        int length = bArr != null ? bArr.length > 32 ? 32 : bArr.length : 0;
        if (bArr2 == null) {
            i17 = 0;
        } else if (bArr2.length <= 32) {
            i17 = bArr2.length;
        }
        int i18 = length + 6;
        int i19 = i18 + 2;
        int i27 = i19 + i17;
        byte[] bArr3 = new byte[i27];
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.t(bArr3, 0, j17);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr3, 4, length);
        java.lang.System.arraycopy(bArr, 0, bArr3, 6, length);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr3, i18, i17);
        java.lang.System.arraycopy(bArr2, 0, bArr3, i19, i17);
        b(this.f379073e);
        a(bArr3, i27);
        g();
        return c();
    }
}
