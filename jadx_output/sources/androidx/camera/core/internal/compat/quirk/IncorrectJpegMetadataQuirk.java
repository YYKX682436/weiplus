package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes13.dex */
public final class IncorrectJpegMetadataQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> SAMSUNG_DEVICES = new java.util.HashSet(java.util.Arrays.asList("A24"));

    private boolean canParseSosMarker(byte[] bArr) {
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

    private int findSecondFfd8Position(byte[] bArr) {
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

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) && SAMSUNG_DEVICES.contains(android.os.Build.DEVICE.toUpperCase(java.util.Locale.US));
    }

    public static boolean load() {
        return isSamsungProblematicDevice();
    }

    public byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy) {
        int i17 = 0;
        java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return (canParseSosMarker(bArr) || (i17 = findSecondFfd8Position(bArr)) != -1) ? java.util.Arrays.copyOfRange(bArr, i17, buffer.limit()) : bArr;
    }
}
