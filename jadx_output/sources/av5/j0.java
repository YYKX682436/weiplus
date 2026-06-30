package av5;

/* loaded from: classes16.dex */
public abstract class j0 {
    public static java.lang.String a(cv5.a aVar, char[] cArr) {
        int i17;
        int i18 = 0;
        while (true) {
            char readByte = (char) (aVar.readByte() & 255);
            if (readByte == 0) {
                return new java.lang.String(cArr, 0, i18);
            }
            cArr[i18] = readByte;
            if (readByte < 128) {
                i18++;
            } else {
                if ((readByte & 224) == 192) {
                    int readByte2 = aVar.readByte() & 255;
                    if ((readByte2 & 192) != 128) {
                        throw new java.io.UTFDataFormatException("bad second byte");
                    }
                    i17 = i18 + 1;
                    cArr[i18] = (char) (((readByte & 31) << 6) | (readByte2 & 63));
                } else {
                    if ((readByte & 240) != 224) {
                        throw new java.io.UTFDataFormatException("bad byte");
                    }
                    int readByte3 = aVar.readByte() & 255;
                    int readByte4 = aVar.readByte() & 255;
                    if ((readByte3 & 192) != 128 || (readByte4 & 192) != 128) {
                        break;
                    }
                    i17 = i18 + 1;
                    cArr[i18] = (char) (((readByte & 15) << 12) | ((readByte3 & 63) << 6) | (readByte4 & 63));
                }
                i18 = i17;
            }
        }
        throw new java.io.UTFDataFormatException("bad second or third byte");
    }
}
