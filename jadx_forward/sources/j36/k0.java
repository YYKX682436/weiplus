package j36;

/* loaded from: classes13.dex */
public class k0 extends j36.m0 {
    public k0() {
        this.f379073e = 1;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        return this.f379071c < 20 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public byte[] i(long j17, byte[] bArr) {
        byte[] bArr2 = new byte[20];
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr2, 0, 1);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr2, 2, p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.o());
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr2, 6, (int) j17);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.t(bArr2, 10, java.lang.System.currentTimeMillis() / 1000);
        java.lang.System.arraycopy(bArr, 0, bArr2, 14, bArr.length);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr2, bArr.length + 14, 0);
        b(this.f379073e);
        a(bArr2, 20);
        g();
        return c();
    }
}
