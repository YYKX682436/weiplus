package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be;

/* renamed from: androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk */
/* loaded from: classes13.dex */
public final class C0855x81969d42 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: SAMSUNG_DEVICES */
    private static final java.util.Set<java.lang.String> f2101xc913b158 = new java.util.HashSet(java.util.Arrays.asList("A24"));

    /* renamed from: canParseSosMarker */
    private boolean m6180x55342f2e(byte[] bArr) {
        byte b17;
        int i17 = 2;
        while (i17 + 4 <= bArr.length && (b17 = bArr[i17]) == -1) {
            if (b17 == -1 && bArr[i17 + 1] == -38) {
                return true;
            }
            i17 += (((bArr[i17 + 2] & 255) << 8) | (bArr[i17 + 3] & 255)) + 2;
        }
        return false;
    }

    /* renamed from: findSecondFfd8Position */
    private int m6181x143d328a(byte[] bArr) {
        int i17 = 2;
        while (true) {
            int i18 = i17 + 1;
            if (i18 > bArr.length) {
                return -1;
            }
            if (bArr[i17] == -1 && bArr[i18] == -40) {
                return i17;
            }
            i17 = i18;
        }
    }

    /* renamed from: isSamsungProblematicDevice */
    private static boolean m6182xa383d392() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) && f2101xc913b158.contains(android.os.Build.DEVICE.toUpperCase(java.util.Locale.US));
    }

    /* renamed from: load */
    public static boolean m6183x32c4e6() {
        return m6182xa383d392();
    }

    /* renamed from: jpegImageToJpegByteArray */
    public byte[] m6184x3d94199b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        int i17 = 0;
        java.nio.ByteBuffer mo4177x12f2b736 = interfaceC0536x1ffeadf3.mo4174x2a55948d()[0].mo4177x12f2b736();
        byte[] bArr = new byte[mo4177x12f2b736.capacity()];
        mo4177x12f2b736.rewind();
        mo4177x12f2b736.get(bArr);
        return (m6180x55342f2e(bArr) || (i17 = m6181x143d328a(bArr)) != -1) ? java.util.Arrays.copyOfRange(bArr, i17, mo4177x12f2b736.limit()) : bArr;
    }
}
