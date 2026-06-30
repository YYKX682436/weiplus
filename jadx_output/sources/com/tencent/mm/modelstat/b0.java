package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f71493a = {false};

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f71494b = new java.util.ArrayList(64);

    public static void a(long j17, long j18, int i17) {
        com.tencent.mm.modelstat.s sVar = new com.tencent.mm.modelstat.s();
        sVar.f71564l = j17;
        sVar.f71576x = j18;
        sVar.f71553a = 12585984;
        c(sVar);
        d(sVar, i17);
        boolean[] zArr = f71493a;
        synchronized (zArr) {
            if (zArr[0]) {
                com.tencent.mm.modelstat.t0.Ai().m0(sVar);
            } else {
                ((java.util.ArrayList) f71494b).add(sVar);
            }
        }
    }

    public static void b(long j17, long j18, int i17) {
        com.tencent.mm.modelstat.s sVar = new com.tencent.mm.modelstat.s();
        sVar.f71565m = j17;
        sVar.f71577y = j18;
        sVar.f71553a = 12585984;
        c(sVar);
        d(sVar, i17);
        boolean[] zArr = f71493a;
        synchronized (zArr) {
            if (zArr[0]) {
                com.tencent.mm.modelstat.t0.Ai().m0(sVar);
            } else {
                ((java.util.ArrayList) f71494b).add(sVar);
            }
        }
    }

    public static void c(com.tencent.mm.modelstat.s sVar) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            com.tencent.mm.sdk.platformtools.j8.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } else {
            com.tencent.mm.sdk.platformtools.j8.d();
        }
        long j17 = com.tencent.mm.sdk.platformtools.j8.f192781l;
        if (j17 <= 0) {
            j17 = 0;
        }
        sVar.f71566n = j17;
        long j18 = com.tencent.mm.sdk.platformtools.j8.f192780k;
        if (j18 <= 0) {
            j18 = 0;
        }
        sVar.f71578z = j18;
        long j19 = com.tencent.mm.sdk.platformtools.j8.f192783n;
        if (j19 <= 0) {
            j19 = 0;
        }
        sVar.f71567o = j19;
        long j27 = com.tencent.mm.sdk.platformtools.j8.f192782m;
        if (j27 <= 0) {
            j27 = 0;
        }
        sVar.A = j27;
        sVar.B = com.tencent.mm.sdk.platformtools.j8.b(0L);
        long j28 = com.tencent.mm.sdk.platformtools.j8.f192784o;
        if (j28 <= 0) {
            j28 = 0;
        }
        sVar.D = j28;
        long j29 = com.tencent.mm.sdk.platformtools.j8.f192787r;
        if (j29 <= 0) {
            j29 = 0;
        }
        sVar.C = j29;
        long j37 = com.tencent.mm.sdk.platformtools.j8.f192786q;
        sVar.E = j37 > 0 ? j37 : 0L;
        sVar.f71553a = sVar.f71553a | 8192 | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62 | 4096 | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62 | 134217728 | com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING | 67108864 | 268435456;
    }

    public static void d(com.tencent.mm.modelstat.s sVar, int i17) {
        if (i17 != 109) {
            if (i17 == 110) {
                sVar.f71571s = sVar.f71576x + sVar.f71577y;
                sVar.f71553a |= 131072;
                return;
            }
            if (i17 != 123) {
                if (i17 == 522) {
                    sVar.f71569q = sVar.f71576x + sVar.f71577y;
                    sVar.f71553a |= 32768;
                    return;
                }
                if (i17 == 127) {
                    sVar.f71573u = sVar.f71576x + sVar.f71577y;
                    sVar.f71553a |= 524288;
                    return;
                }
                if (i17 == 128) {
                    sVar.f71561i = sVar.f71564l + sVar.f71565m;
                    sVar.f71553a |= 128;
                    return;
                }
                if (i17 == 138 || i17 == 139) {
                    sVar.f71557e = sVar.f71564l + sVar.f71565m;
                    sVar.f71553a |= 8;
                    return;
                } else if (i17 == 149) {
                    sVar.f71575w = sVar.f71576x + sVar.f71577y;
                    sVar.f71553a |= 2097152;
                    return;
                } else {
                    if (i17 != 150) {
                        return;
                    }
                    sVar.f71563k = sVar.f71564l + sVar.f71565m;
                    sVar.f71553a |= 512;
                    return;
                }
            }
        }
        sVar.f71559g = sVar.f71564l + sVar.f71565m;
        sVar.f71553a |= 32;
    }
}
