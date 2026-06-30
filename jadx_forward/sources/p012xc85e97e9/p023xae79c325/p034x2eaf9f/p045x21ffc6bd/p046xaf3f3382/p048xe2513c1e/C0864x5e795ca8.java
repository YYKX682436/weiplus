package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e;

/* renamed from: androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser */
/* loaded from: classes13.dex */
public class C0864x5e795ca8 {

    /* renamed from: mQuirk */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0856x5f5915a6 f2107xbeac7351 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0856x5f5915a6) p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0851xcf1a968b.get(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0856x5f5915a6.class);

    /* renamed from: getJfifEoiMarkEndPosition */
    public static int m6198xcd2d2547(byte[] bArr) {
        byte b17;
        int i17 = 2;
        while (i17 + 4 <= bArr.length && (b17 = bArr[i17]) == -1) {
            int i18 = i17 + 2;
            int i19 = ((bArr[i18] & 255) << 8) | (bArr[i17 + 3] & 255);
            if (b17 == -1 && bArr[i17 + 1] == -38) {
                while (true) {
                    int i27 = i18 + 2;
                    if (i27 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i18] == -1 && bArr[i18 + 1] == -39) {
                        return i27;
                    }
                    i18++;
                }
            } else {
                i17 += i19 + 2;
            }
        }
        return -1;
    }

    /* renamed from: getValidDataLength */
    public int m6199x8b2fa216(byte[] bArr) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.C0856x5f5915a6 c0856x5f5915a6 = this.f2107xbeac7351;
        if (c0856x5f5915a6 == null || !c0856x5f5915a6.m6190xe86ad374(bArr)) {
            return bArr.length;
        }
        int m6198xcd2d2547 = m6198xcd2d2547(bArr);
        return m6198xcd2d2547 != -1 ? m6198xcd2d2547 : bArr.length;
    }
}
