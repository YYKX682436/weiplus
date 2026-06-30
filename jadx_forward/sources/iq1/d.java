package iq1;

/* loaded from: classes13.dex */
public class d {
    public boolean a(byte[] bArr, int i17, int i18) {
        java.lang.String str = iq1.e.f375207i;
        if (bArr == null || i17 < 0 || 7 > i18 || bArr.length < i18 + i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("iq1.e", "data input error");
            return false;
        }
        byte b17 = bArr[i17];
        byte b18 = bArr[i17 + 1];
        byte b19 = bArr[i17 + 2];
        byte b27 = bArr[i17 + 3];
        byte b28 = bArr[i17 + 4];
        byte b29 = bArr[i17 + 5];
        byte b37 = bArr[i17 + 6];
        return true;
    }
}
