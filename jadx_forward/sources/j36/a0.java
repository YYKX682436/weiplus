package j36;

/* loaded from: classes13.dex */
public class a0 extends j36.m0 {
    public a0() {
        this.f379073e = 322;
    }

    public byte[] i(byte[] bArr) {
        int length = bArr.length + 4;
        byte[] bArr2 = new byte[length];
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr2, 0, 0);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr2, 2, bArr.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        b(this.f379073e);
        a(bArr2, length);
        g();
        return c();
    }
}
