package h36;

/* loaded from: classes13.dex */
public class g extends h36.f {
    public g(h36.h hVar) {
        this.f360125e = 2064;
        this.f360126f = 2;
        this.f360127g = hVar;
    }

    public byte[] g(byte[] bArr) {
        int i17;
        int i18;
        h36.h hVar = this.f360127g;
        int i19 = hVar.f360136i;
        byte[] d17 = hVar.f360131d.d();
        j36.e eVar = this.f360127g.f360132e;
        int i27 = eVar.f379063g;
        byte[] bArr2 = new byte[i27];
        if (i27 > 0) {
            java.lang.System.arraycopy(eVar.f379072d, eVar.f379065i, bArr2, 0, i27);
        }
        byte[] bArr3 = new byte[128];
        byte[] i28 = new j36.d().i(d17);
        int length = bArr.length + 6 + i27;
        byte[] bArr4 = new byte[length];
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr4, 0, 0);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr4, 2, bArr.length);
        java.lang.System.arraycopy(bArr, 0, bArr4, 4, bArr.length);
        int length2 = bArr.length + 4;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr4, length2, i27);
        java.lang.System.arraycopy(bArr2, 0, bArr4, length2 + 2, i27);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr3, 0, 2);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr3, 2, 0);
        if (length > 124) {
            byte[] bArr5 = new byte[length + 4 + 64];
            java.lang.System.arraycopy(bArr3, 0, bArr5, 0, 4);
            bArr3 = bArr5;
        }
        java.lang.System.arraycopy(bArr4, 0, bArr3, 4, length);
        int i29 = 4 + length;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr3, 2, i29 - 4);
        byte[] bArr6 = new byte[i29];
        java.lang.System.arraycopy(bArr3, 0, bArr6, 0, i29);
        byte[] bArr7 = new byte[i28.length + i29];
        if (d17.length > 0) {
            java.lang.System.arraycopy(i28, 0, bArr7, 0, i28.length);
            i17 = i28.length + 0;
            i18 = 1;
        } else {
            i17 = 0;
            i18 = 0;
        }
        java.lang.System.arraycopy(bArr6, 0, bArr7, i17, i29);
        d(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14514x4fe44208, this.f360125e, h36.f.f360120h, this.f360127g.f360133f, 0, 0, i19, 0, b(bArr7, this.f360126f, i18 + 1));
        int i37 = this.f360122b;
        byte[] bArr8 = new byte[i37];
        java.lang.System.arraycopy(this.f360124d, 0, bArr8, 0, i37);
        return bArr8;
    }
}
