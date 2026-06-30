package p2;

/* loaded from: classes14.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(int i17) {
        if (i17 < 8191) {
            return 13;
        }
        if (i17 < 32767) {
            return 15;
        }
        if (i17 < 65535) {
            return 16;
        }
        if (i17 < 262143) {
            return 18;
        }
        throw new java.lang.IllegalArgumentException("Can't represent a size of " + i17 + " in Constraints");
    }

    public final long b(int i17, int i18, int i19, int i27) {
        long j17;
        int i28 = i27 == Integer.MAX_VALUE ? i19 : i27;
        int a17 = a(i28);
        int i29 = i18 == Integer.MAX_VALUE ? i17 : i18;
        int a18 = a(i29);
        if (a17 + a18 > 31) {
            throw new java.lang.IllegalArgumentException("Can't represent a width of " + i29 + " and height of " + i28 + " in Constraints");
        }
        if (a18 == 13) {
            j17 = 3;
        } else if (a18 == 18) {
            j17 = 1;
        } else if (a18 == 15) {
            j17 = 2;
        } else {
            if (a18 != 16) {
                throw new java.lang.IllegalStateException("Should only have the provided constants.");
            }
            j17 = 0;
        }
        int i37 = i18 == Integer.MAX_VALUE ? 0 : i18 + 1;
        int i38 = i27 != Integer.MAX_VALUE ? i27 + 1 : 0;
        int i39 = p2.c.f432907c[(int) j17];
        return (i37 << 33) | j17 | (i17 << 2) | (i19 << i39) | (i38 << (i39 + 31));
    }

    public final long c(int i17) {
        if (i17 >= 0) {
            return b(0, Integer.MAX_VALUE, i17, i17);
        }
        throw new java.lang.IllegalArgumentException(("height(" + i17 + ") must be >= 0").toString());
    }

    public final long d(int i17) {
        if (i17 >= 0) {
            return b(i17, i17, 0, Integer.MAX_VALUE);
        }
        throw new java.lang.IllegalArgumentException(("width(" + i17 + ") must be >= 0").toString());
    }
}
