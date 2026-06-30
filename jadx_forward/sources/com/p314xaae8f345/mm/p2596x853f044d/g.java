package com.p314xaae8f345.mm.p2596x853f044d;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f273878a = bm5.f1.a();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b5 f273879b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b5("ExtStorageMigrateMonitor", java.util.concurrent.TimeUnit.DAYS.toMillis(1), true, true);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f273880c = {false};

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2596x853f044d.C20975x5e37b436 f273881d = new com.p314xaae8f345.mm.p2596x853f044d.C20975x5e37b436(null);

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2596x853f044d.c f273882e = new com.p314xaae8f345.mm.p2596x853f044d.a();

    public static void a(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
        } else if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, str2);
        } else {
            if (i17 != 6) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2);
        }
    }

    public static void b(long j17, long j18, long j19) {
        if (f273879b.b("idkey_" + j17 + "_" + j18)) {
            boolean[] zArr = f273880c;
            synchronized (zArr) {
                if (zArr[0]) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(j17, j18, j19, true);
                } else {
                    com.p314xaae8f345.mm.p2596x853f044d.C20975x5e37b436 c20975x5e37b436 = f273881d;
                    c20975x5e37b436.getClass();
                    c20975x5e37b436.f273870d.add(new com.p314xaae8f345.mm.p2596x853f044d.e(j17, j18, j19));
                }
            }
        }
    }
}
