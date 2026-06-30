package ve1;

/* loaded from: classes13.dex */
public class f implements ve1.h {
    public boolean a(byte[] bArr) {
        int i17 = ve1.g.f517615a;
        boolean z17 = false;
        if (bArr != null && bArr.length > 100) {
            byte[] bArr2 = new byte[100];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 100);
            z17 = new java.lang.String(bArr2).toLowerCase().replaceAll("\\s", "").contains("<html");
        }
        return !z17;
    }
}
