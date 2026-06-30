package cd1;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f122167a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f122168b;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab c12193x5bbe54ab, byte[] bArr) {
        this.f122168b = "";
        this.f122167a = bArr;
        this.f122168b = cd1.p.a(bArr);
    }

    public java.lang.String a() {
        int i17;
        if (!this.f122168b.startsWith("00a4")) {
            return "";
        }
        byte[] bArr = this.f122167a;
        if (bArr.length < 5) {
            return "";
        }
        if (bArr.length >= 7 && bArr[4] == 0) {
            i17 = ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            if (bArr.length < 5) {
                return "";
            }
            i17 = bArr[4] & 255;
        }
        int i18 = i17 + 5;
        return bArr.length < i18 ? "" : cd1.p.a(java.util.Arrays.copyOfRange(bArr, 5, i18)).toUpperCase();
    }
}
