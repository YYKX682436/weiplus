package cd1;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f40634a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f40635b;

    public j(com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService hCEService, byte[] bArr) {
        this.f40635b = "";
        this.f40634a = bArr;
        this.f40635b = cd1.p.a(bArr);
    }

    public java.lang.String a() {
        int i17;
        if (!this.f40635b.startsWith("00a4")) {
            return "";
        }
        byte[] bArr = this.f40634a;
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
