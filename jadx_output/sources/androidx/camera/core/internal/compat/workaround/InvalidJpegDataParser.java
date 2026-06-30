package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes13.dex */
public class InvalidJpegDataParser {
    private final androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk mQuirk = (androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.class);

    public static int getJfifEoiMarkEndPosition(byte[] bArr) {
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

    public int getValidDataLength(byte[] bArr) {
        androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk largeJpegImageQuirk = this.mQuirk;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.shouldCheckInvalidJpegData(bArr)) {
            return bArr.length;
        }
        int jfifEoiMarkEndPosition = getJfifEoiMarkEndPosition(bArr);
        return jfifEoiMarkEndPosition != -1 ? jfifEoiMarkEndPosition : bArr.length;
    }
}
