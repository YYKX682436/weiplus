package av5;

/* loaded from: classes16.dex */
public abstract class f0 {
    public static int a(cv5.a aVar) {
        int i17;
        int i18 = 0;
        int i19 = -1;
        int i27 = 0;
        do {
            int readByte = aVar.readByte() & 255;
            i18 |= (readByte & 127) << (i27 * 7);
            i19 <<= 7;
            i27++;
            i17 = readByte & 128;
            if (i17 != 128) {
                break;
            }
        } while (i27 < 5);
        if (i17 != 128) {
            return ((i19 >> 1) & i18) != 0 ? i18 | i19 : i18;
        }
        throw new av5.z("invalid LEB128 sequence");
    }

    public static int b(cv5.a aVar) {
        int i17;
        int i18 = 0;
        int i19 = 0;
        do {
            int readByte = aVar.readByte() & 255;
            i18 |= (readByte & 127) << (i19 * 7);
            i19++;
            i17 = readByte & 128;
            if (i17 != 128) {
                break;
            }
        } while (i19 < 5);
        if (i17 != 128) {
            return i18;
        }
        throw new av5.z("invalid LEB128 sequence");
    }

    public static int c(cv5.b bVar, int i17) {
        int i18 = i17 >> 7;
        int i19 = (Integer.MIN_VALUE & i17) == 0 ? 0 : -1;
        int i27 = 0;
        boolean z17 = true;
        while (true) {
            int i28 = i18;
            int i29 = i17;
            i17 = i28;
            if (!z17) {
                return i27;
            }
            z17 = (i17 == i19 && (i17 & 1) == ((i29 >> 6) & 1)) ? false : true;
            bVar.e((byte) ((i29 & 127) | (z17 ? 128 : 0)));
            i27++;
            i18 = i17 >> 7;
        }
    }

    public static int d(cv5.b bVar, int i17) {
        int i18 = i17 >>> 7;
        int i19 = 0;
        while (true) {
            int i27 = i18;
            int i28 = i17;
            i17 = i27;
            if (i17 == 0) {
                bVar.e((byte) (i28 & 127));
                return i19 + 1;
            }
            bVar.e((byte) ((i28 & 127) | 128));
            i19++;
            i18 = i17 >>> 7;
        }
    }
}
