package av5;

/* loaded from: classes16.dex */
public abstract class j0 {
    public static java.lang.String a(cv5.a aVar, char[] cArr) {
        int i17;
        int i18 = 0;
        while (true) {
            char mo9119xcc4273be = (char) (aVar.mo9119xcc4273be() & 255);
            if (mo9119xcc4273be == 0) {
                return new java.lang.String(cArr, 0, i18);
            }
            cArr[i18] = mo9119xcc4273be;
            if (mo9119xcc4273be < 128) {
                i18++;
            } else {
                if ((mo9119xcc4273be & 224) == 192) {
                    int mo9119xcc4273be2 = aVar.mo9119xcc4273be() & 255;
                    if ((mo9119xcc4273be2 & 192) != 128) {
                        throw new java.io.UTFDataFormatException("bad second byte");
                    }
                    i17 = i18 + 1;
                    cArr[i18] = (char) (((mo9119xcc4273be & 31) << 6) | (mo9119xcc4273be2 & 63));
                } else {
                    if ((mo9119xcc4273be & 240) != 224) {
                        throw new java.io.UTFDataFormatException("bad byte");
                    }
                    int mo9119xcc4273be3 = aVar.mo9119xcc4273be() & 255;
                    int mo9119xcc4273be4 = aVar.mo9119xcc4273be() & 255;
                    if ((mo9119xcc4273be3 & 192) != 128 || (mo9119xcc4273be4 & 192) != 128) {
                        break;
                    }
                    i17 = i18 + 1;
                    cArr[i18] = (char) (((mo9119xcc4273be & 15) << 12) | ((mo9119xcc4273be3 & 63) << 6) | (mo9119xcc4273be4 & 63));
                }
                i18 = i17;
            }
        }
        throw new java.io.UTFDataFormatException("bad second or third byte");
    }
}
