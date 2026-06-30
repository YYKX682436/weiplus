package gv5;

/* loaded from: classes12.dex */
public abstract class a {
    public static byte[] a(byte[] bArr, int i17, byte[] bArr2, int i18, int i19) {
        int i27;
        int i28;
        boolean z17;
        int i29 = 0;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr2, 0, i18));
        dataInputStream.skip(8L);
        long readLong = dataInputStream.readLong();
        long readLong2 = dataInputStream.readLong();
        int readLong3 = (int) dataInputStream.readLong();
        dataInputStream.close();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr2, 0, i18);
        byteArrayInputStream.skip(32L);
        java.io.DataInputStream dataInputStream2 = new java.io.DataInputStream(new java.util.zip.GZIPInputStream(byteArrayInputStream));
        java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(bArr2, 0, i18);
        byteArrayInputStream2.skip(readLong + 32);
        java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream2);
        java.io.ByteArrayInputStream byteArrayInputStream3 = new java.io.ByteArrayInputStream(bArr2, 0, i18);
        byteArrayInputStream3.skip(readLong2 + readLong + 32);
        java.util.zip.GZIPInputStream gZIPInputStream2 = new java.util.zip.GZIPInputStream(byteArrayInputStream3);
        byte[] bArr3 = new byte[readLong3];
        int[] iArr = new int[3];
        int i37 = 0;
        int i38 = 0;
        while (i37 < readLong3) {
            for (int i39 = i29; i39 <= 2; i39++) {
                iArr[i39] = dataInputStream2.readInt();
            }
            int i47 = iArr[i29];
            if (i37 + i47 > readLong3) {
                throw new java.io.IOException("Corrupt by wrong patch file.");
            }
            int i48 = i29;
            while (true) {
                if (i48 >= i47) {
                    i27 = 1;
                    break;
                }
                int read = gZIPInputStream.read(bArr3, i37 + i48, i47 - i48);
                if (read < 0) {
                    i27 = i29;
                    break;
                }
                i48 += read;
            }
            if (i27 == 0) {
                throw new java.io.IOException("Corrupt by wrong patch file.");
            }
            int i49 = i29;
            while (true) {
                i28 = iArr[i29];
                if (i49 >= i28) {
                    break;
                }
                int i57 = i38 + i49;
                if (i57 >= 0 && i57 < i17) {
                    int i58 = i37 + i49;
                    bArr3[i58] = (byte) (bArr3[i58] + bArr[i57]);
                }
                i49++;
            }
            int i59 = i37 + i28;
            int i66 = i38 + i28;
            int i67 = iArr[1];
            if (i59 + i67 > readLong3) {
                throw new java.io.IOException("Corrupt by wrong patch file.");
            }
            int i68 = i29;
            while (true) {
                if (i68 >= i67) {
                    z17 = true;
                    break;
                }
                int read2 = gZIPInputStream2.read(bArr3, i59 + i68, i67 - i68);
                if (read2 < 0) {
                    z17 = false;
                    break;
                }
                i68 += read2;
            }
            if (!z17) {
                throw new java.io.IOException("Corrupt by wrong patch file.");
            }
            i37 = i59 + iArr[1];
            i38 = i66 + iArr[2];
            i29 = 0;
        }
        dataInputStream2.close();
        gZIPInputStream.close();
        gZIPInputStream2.close();
        return bArr3;
    }
}
