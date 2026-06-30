package au5;

/* loaded from: classes15.dex */
public abstract class b {
    public static zt5.r q(byte[] bArr) {
        if (bArr == null) {
            zt5.h.b("Soter.SoterCoreBase", "soter: raw data is null", new java.lang.Object[0]);
            return null;
        }
        if (bArr.length < 4) {
            zt5.h.b("Soter.SoterCoreBase", "soter: raw data length smaller than RAW_LENGTH_PREFIX", new java.lang.Object[0]);
        }
        byte[] bArr2 = new byte[4];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            i17 += (bArr2[i18] & 255) << (i18 * 8);
        }
        zt5.h.a("Soter.SoterCoreBase", "soter: parsed raw length: " + i17, new java.lang.Object[0]);
        if (i17 > 1048576) {
            zt5.h.b("Soter.SoterCoreBase", "soter: too large json result!", new java.lang.Object[0]);
            return null;
        }
        byte[] bArr3 = new byte[i17];
        int i19 = i17 + 4;
        if (bArr.length < i19) {
            zt5.h.b("Soter.SoterCoreBase", "length not correct 2", new java.lang.Object[0]);
            return null;
        }
        java.lang.System.arraycopy(bArr, 4, bArr3, 0, i17);
        java.lang.String str = new java.lang.String(bArr3);
        zt5.h.a("Soter.SoterCoreBase", "soter: to convert json: ".concat(str), new java.lang.Object[0]);
        zt5.r rVar = new zt5.r(str, "");
        int length = bArr.length - i19;
        zt5.h.a("Soter.SoterCoreBase", "soter: signature length: " + length, new java.lang.Object[0]);
        if (length != 0) {
            byte[] bArr4 = new byte[length];
            java.lang.System.arraycopy(bArr, i19, bArr4, 0, length);
            rVar.f475619g = android.util.Base64.encodeToString(bArr4, 2);
        }
        return rVar;
    }

    public abstract byte[] a(long j17);

    public abstract zt5.k b();

    public abstract zt5.k c(java.lang.String str);

    public abstract zt5.r d();

    public abstract java.security.Signature e(java.lang.String str);

    public abstract zt5.r f(java.lang.String str);

    public abstract boolean g();

    public abstract boolean h(java.lang.String str);

    public abstract com.tencent.soter.soterserver.SoterSessionResult i(java.lang.String str, java.lang.String str2);

    public abstract boolean j(android.content.Context context);

    public abstract boolean k();

    public abstract boolean l(java.lang.String str, boolean z17);

    public abstract boolean m();

    public boolean n() {
        return true;
    }

    public abstract zt5.k o();

    public abstract zt5.k p(java.lang.String str, boolean z17);

    public void r(au5.k kVar) {
    }

    public void s() {
    }

    public void t() {
    }
}
