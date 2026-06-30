package au5;

/* loaded from: classes15.dex */
public class j extends au5.b implements zt5.b {

    /* renamed from: l, reason: collision with root package name */
    public static bu5.c f14154l;

    /* renamed from: m, reason: collision with root package name */
    public static int f14155m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f14156n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f14157o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Object f14158p = new java.lang.Object();

    /* renamed from: q, reason: collision with root package name */
    public static final au5.l f14159q = new au5.l();

    /* renamed from: r, reason: collision with root package name */
    public static int f14160r = 0;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f14161b;

    /* renamed from: h, reason: collision with root package name */
    public au5.k f14167h;

    /* renamed from: c, reason: collision with root package name */
    public int f14162c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f14163d = 3;

    /* renamed from: e, reason: collision with root package name */
    public long f14164e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14165f = false;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f14166g = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final android.os.IBinder.DeathRecipient f14168i = new au5.d(this);

    /* renamed from: j, reason: collision with root package name */
    public final android.content.ServiceConnection f14169j = new au5.e(this);

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f14170k = new au5.h(this);

    public static void u(au5.j jVar) {
        jVar.f14162c++;
        long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - jVar.f14164e) / 1000;
        long y17 = y(jVar.f14162c);
        long j17 = y17 - elapsedRealtime;
        zt5.h.c("Soter.SoterCoreTreble", "fib: %s, rebind delay: %sS", java.lang.Long.valueOf(y17), java.lang.Long.valueOf(j17));
        if (j17 <= 0) {
            jVar.v(false);
        } else {
            jVar.f14166g.postDelayed(new au5.f(jVar), j17 * 1000);
        }
    }

    public static long y(long j17) {
        long j18 = 0;
        if (j17 < 0) {
            return -1L;
        }
        if (j17 == 0) {
            return 0L;
        }
        long j19 = 1;
        if (j17 == 1 || j17 == 2) {
            return 1L;
        }
        int i17 = 3;
        long j27 = 1;
        while (i17 <= j17) {
            j18 = j19 + j27;
            i17++;
            j19 = j27;
            j27 = j18;
        }
        return j18;
    }

    public void A() {
        if (this.f14165f) {
            try {
                try {
                    this.f14161b.unbindService(this.f14169j);
                } catch (java.lang.Exception e17) {
                    zt5.h.d("Soter.SoterCoreTreble", e17, "");
                }
            } finally {
                this.f14165f = false;
            }
        }
    }

    @Override // au5.b
    public byte[] a(long j17) {
        com.tencent.soter.soterserver.SoterSignResult createFromParcel;
        zt5.h.c("Soter.SoterCoreTreble", "soter: finishSign in", new java.lang.Object[0]);
        if (!m()) {
            return null;
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return null;
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            bu5.a aVar = (bu5.a) f14154l;
            aVar.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain.writeLong(j17);
                if (!aVar.f24631d.transact(10, obtain, obtain2, 0)) {
                    int i17 = bu5.b.f24632d;
                }
                obtain2.readException();
                createFromParcel = obtain2.readInt() != 0 ? com.tencent.soter.soterserver.SoterSignResult.CREATOR.createFromParcel(obtain2) : null;
                obtain2.recycle();
                obtain.recycle();
                bArr = createFromParcel.f215332e;
            } catch (java.lang.Throwable th6) {
                obtain2.recycle();
                obtain.recycle();
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: finishSign fail: ");
            zt5.i.b(101, "SoterService aidl: finishSign.", e17);
        }
        if (createFromParcel.f215331d == 0) {
            return bArr;
        }
        zt5.i.a(102, "SoterService aidl: finishSign. Result.resultCode is not 0");
        throw new java.lang.Exception("finishSign error");
    }

    @Override // au5.b
    public zt5.k b() {
        android.os.Parcel obtain;
        zt5.h.c("Soter.SoterCoreTreble", "soter: generateAppSecureKey in", new java.lang.Object[0]);
        if (!m()) {
            return new zt5.k(4);
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return new zt5.k(4);
        }
        w();
        if (x()) {
            return new zt5.k(4);
        }
        try {
            bu5.c cVar = f14154l;
            int i17 = f14160r;
            bu5.a aVar = (bu5.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            obtain = android.os.Parcel.obtain();
            try {
                obtain2.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain2.writeInt(i17);
                if (!aVar.f24631d.transact(1, obtain2, obtain, 0)) {
                    int i18 = bu5.b.f24632d;
                }
                obtain.readException();
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: generateAppSecureKey fail: ");
            zt5.i.b(101, "SoterService aidl: generateAppSecureKey.", e17);
        }
        if (obtain.readInt() == 0) {
            return new zt5.k(0);
        }
        zt5.i.a(102, "SoterService aidl: generateAppSecureKey. Return is not 0");
        return new zt5.k(4);
    }

    @Override // au5.b
    public zt5.k c(java.lang.String str) {
        android.os.Parcel obtain;
        zt5.h.c("Soter.SoterCoreTreble", "soter: generateAuthKey in", new java.lang.Object[0]);
        if (!m()) {
            return new zt5.k(6);
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return new zt5.k(6);
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return new zt5.k(6);
        }
        try {
            bu5.c cVar = f14154l;
            int i17 = f14160r;
            bu5.a aVar = (bu5.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            obtain = android.os.Parcel.obtain();
            try {
                obtain2.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain2.writeInt(i17);
                obtain2.writeString(str);
                if (!aVar.f24631d.transact(4, obtain2, obtain, 0)) {
                    int i18 = bu5.b.f24632d;
                }
                obtain.readException();
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: generateAuthKey fail: ");
            zt5.i.b(101, "SoterService aidl: generateAuthKey.", e17);
        }
        if (obtain.readInt() == 0) {
            return new zt5.k(0);
        }
        zt5.i.a(102, "SoterService aidl: generateAuthKey. Return is not 0");
        return new zt5.k(6);
    }

    @Override // au5.b
    public zt5.r d() {
        zt5.h.c("Soter.SoterCoreTreble", "soter: getAppGlobalSecureKeyModel in", new java.lang.Object[0]);
        if (!m()) {
            return null;
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return null;
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return null;
        }
        try {
            bu5.c cVar = f14154l;
            int i17 = f14160r;
            bu5.a aVar = (bu5.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain.writeInt(i17);
                if (!aVar.f24631d.transact(2, obtain, obtain2, 0)) {
                    int i18 = bu5.b.f24632d;
                }
                obtain2.readException();
                com.tencent.soter.soterserver.SoterExportResult createFromParcel = obtain2.readInt() != 0 ? com.tencent.soter.soterserver.SoterExportResult.CREATOR.createFromParcel(obtain2) : null;
                obtain2.recycle();
                obtain.recycle();
                byte[] bArr = createFromParcel.f215326e;
                if (bArr != null && bArr.length > 0) {
                    return au5.b.q(bArr);
                }
                zt5.h.b("Soter.SoterCoreTreble", "soter: soter: key can not be retrieved", new java.lang.Object[0]);
                zt5.i.a(102, "SoterService aidl: getAppSecureKey. Result.exportData is null");
                return null;
            } catch (java.lang.Throwable th6) {
                obtain2.recycle();
                obtain.recycle();
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: getAppGlobalSecureKeyModel fail: ");
            zt5.i.b(101, "SoterService aidl: getAppSecureKey.", e17);
            return null;
        }
    }

    @Override // au5.b
    public java.security.Signature e(java.lang.String str) {
        return null;
    }

    @Override // au5.b
    public zt5.r f(java.lang.String str) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: getAuthKeyModel in", new java.lang.Object[0]);
        if (!m()) {
            return null;
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return null;
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return null;
        }
        try {
            bu5.c cVar = f14154l;
            int i17 = f14160r;
            bu5.a aVar = (bu5.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain.writeInt(i17);
                obtain.writeString(str);
                if (!aVar.f24631d.transact(6, obtain, obtain2, 0)) {
                    int i18 = bu5.b.f24632d;
                }
                obtain2.readException();
                com.tencent.soter.soterserver.SoterExportResult createFromParcel = obtain2.readInt() != 0 ? com.tencent.soter.soterserver.SoterExportResult.CREATOR.createFromParcel(obtain2) : null;
                obtain2.recycle();
                obtain.recycle();
                byte[] bArr = createFromParcel.f215326e;
                if (bArr != null && bArr.length > 0) {
                    return au5.b.q(bArr);
                }
                zt5.h.b("Soter.SoterCoreTreble", "soter: key can not be retrieved", new java.lang.Object[0]);
                zt5.i.a(102, "SoterService aidl: getAuthKey. Result.exportData is null");
                return null;
            } catch (java.lang.Throwable th6) {
                obtain2.recycle();
                obtain.recycle();
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: getAuthKeyModel fail: ");
            zt5.i.b(101, "SoterService aidl: getAuthKey.", e17);
            return null;
        }
    }

    @Override // au5.b
    public boolean g() {
        zt5.h.c("Soter.SoterCoreTreble", "soter: hasAppGlobalSecureKey in", new java.lang.Object[0]);
        if (!m()) {
            return false;
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return false;
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return false;
        }
        try {
            bu5.c cVar = f14154l;
            int i17 = f14160r;
            bu5.a aVar = (bu5.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain.writeInt(i17);
                if (!aVar.f24631d.transact(3, obtain, obtain2, 0)) {
                    int i18 = bu5.b.f24632d;
                }
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: hasAppGlobalSecureKey fail: ");
            zt5.i.b(101, "SoterService aidl: hasAskAlready.", e17);
            return false;
        }
    }

    @Override // au5.b
    public boolean h(java.lang.String str) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: hasAuthKey in", new java.lang.Object[0]);
        if (!m()) {
            return false;
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return false;
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return false;
        }
        try {
            bu5.c cVar = f14154l;
            int i17 = f14160r;
            bu5.a aVar = (bu5.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain.writeInt(i17);
                obtain.writeString(str);
                if (!aVar.f24631d.transact(8, obtain, obtain2, 0)) {
                    int i18 = bu5.b.f24632d;
                }
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: hasAuthKey fail: ");
            zt5.i.b(101, "SoterService aidl: hasAuthKey.", e17);
            return false;
        }
    }

    @Override // au5.b
    public com.tencent.soter.soterserver.SoterSessionResult i(java.lang.String str, java.lang.String str2) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: initSigh in", new java.lang.Object[0]);
        if (!m()) {
            return null;
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return null;
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return null;
        }
        try {
            bu5.c cVar = f14154l;
            int i17 = f14160r;
            bu5.a aVar = (bu5.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain.writeInt(i17);
                obtain.writeString(str);
                obtain.writeString(str2);
                if (!aVar.f24631d.transact(9, obtain, obtain2, 0)) {
                    int i18 = bu5.b.f24632d;
                }
                obtain2.readException();
                return obtain2.readInt() != 0 ? com.tencent.soter.soterserver.SoterSessionResult.CREATOR.createFromParcel(obtain2) : null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: initSigh fail: ");
            zt5.i.b(101, "SoterService aidl: initSigh.", e17);
            return null;
        }
    }

    @Override // au5.b
    public boolean j(android.content.Context context) {
        this.f14161b = context;
        zt5.h.c("Soter.SoterCoreTreble", "soter: initSoter in", new java.lang.Object[0]);
        f14156n = true;
        au5.l lVar = f14159q;
        au5.g gVar = new au5.g(this);
        zt5.h.c("Soter.SyncJob", "doAsSyncJob", new java.lang.Object[0]);
        lVar.f14171a = new java.util.concurrent.CountDownLatch(1);
        gVar.run();
        java.util.concurrent.CountDownLatch countDownLatch = lVar.f14171a;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(3000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                zt5.h.d("Soter.SyncJob", e17, "");
            }
        }
        f14156n = false;
        if (f14155m == 2) {
            zt5.h.c("Soter.SoterCoreTreble", "soter: initSoter finish", new java.lang.Object[0]);
            f14157o = true;
            return true;
        }
        f14155m = 0;
        zt5.h.b("Soter.SoterCoreTreble", "soter: initSoter error", new java.lang.Object[0]);
        zt5.i.a(102, "bind SoterService fail: DISCONNECT");
        return false;
    }

    @Override // au5.b
    public boolean k() {
        zt5.h.c("Soter.SoterCoreTreble", "soter: isAppGlobalSecureKeyValid in", new java.lang.Object[0]);
        return g() && d() != null;
    }

    @Override // au5.b
    public boolean l(java.lang.String str, boolean z17) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: isAuthKeyValid in", new java.lang.Object[0]);
        return h(str) && f(str) != null;
    }

    @Override // au5.b
    public boolean m() {
        if (!zt5.o.f475608a.b()) {
            return true;
        }
        zt5.h.f("Soter.SoterCoreTreble", "soter: the device has already triggered OOM. mark as not support", new java.lang.Object[0]);
        return false;
    }

    @Override // au5.b
    public boolean n() {
        return f14155m == 2;
    }

    @Override // au5.b
    public zt5.k o() {
        zt5.h.c("Soter.SoterCoreTreble", "soter: removeAppGlobalSecureKey in", new java.lang.Object[0]);
        if (!m()) {
            return new zt5.k(5);
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return new zt5.k(5);
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return new zt5.k(5);
        }
        try {
            if (((bu5.a) f14154l).e(f14160r) == 0) {
                return new zt5.k(0);
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: removeAppGlobalSecureKey fail: ");
        }
        return new zt5.k(5);
    }

    @Override // au5.b
    public zt5.k p(java.lang.String str, boolean z17) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: removeAuthKey in", new java.lang.Object[0]);
        if (!m()) {
            return new zt5.k(7);
        }
        if (this.f14161b == null) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: context is null", new java.lang.Object[0]);
            return new zt5.k(7);
        }
        w();
        if (x()) {
            zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
            return new zt5.k(7);
        }
        try {
            bu5.c cVar = f14154l;
            int i17 = f14160r;
            bu5.a aVar = (bu5.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
                obtain.writeInt(i17);
                obtain.writeString(str);
                if (!aVar.f24631d.transact(5, obtain, obtain2, 0)) {
                    int i18 = bu5.b.f24632d;
                }
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    if (z17) {
                        return ((bu5.a) f14154l).e(f14160r) == 0 ? new zt5.k(0) : new zt5.k(5);
                    }
                    return new zt5.k(0);
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: removeAuthKey fail: ");
        }
        return new zt5.k(7);
    }

    @Override // au5.b
    public void r(au5.k kVar) {
        this.f14167h = kVar;
    }

    @Override // au5.b
    public void s() {
        this.f14162c = 0;
        w();
    }

    @Override // au5.b
    public void t() {
        try {
            new java.lang.Thread(new au5.i(this)).start();
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: getExtraParam fail2");
        }
    }

    public final void v(boolean z17) {
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.tencent.soter.soterserver.ISoterService");
            intent.setPackage("com.tencent.soter.soterserver");
            if (this.f14161b == null) {
                zt5.h.b("Soter.SoterCoreTreble", "soter: bindService context is null ", new java.lang.Object[0]);
                return;
            }
            f14155m = 1;
            au5.k kVar = this.f14167h;
            if (kVar != null) {
                ((se4.e) kVar).getClass();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1104L, 5L, 1L, false);
            }
            zt5.h.c("Soter.SoterCoreTreble", "soter: bindService binding is start ", new java.lang.Object[0]);
            this.f14164e = android.os.SystemClock.elapsedRealtime();
            this.f14165f = this.f14161b.bindService(intent, this.f14169j, 1);
            z(z17);
        } catch (java.lang.Error e17) {
            zt5.i.a(101, "mContext.bindService error: " + e17);
        } catch (java.lang.Exception e18) {
            zt5.i.a(101, "mContext.bindService exception: " + e18);
        }
    }

    public void w() {
        bu5.c cVar;
        try {
            if (f14155m == 2 && (cVar = f14154l) != null && cVar.asBinder() != null && f14154l.asBinder().isBinderAlive() && f14154l.asBinder().pingBinder()) {
                zt5.h.c("Soter.SoterCoreTreble", "no need rebind", new java.lang.Object[0]);
            }
            zt5.h.c("Soter.SoterCoreTreble", "soter: bindServiceIfNeeded try to bind", new java.lang.Object[0]);
            v(false);
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: bindServiceIfNeeded fail: ");
        }
    }

    public final boolean x() {
        if (f14154l != null) {
            return false;
        }
        zt5.h.f("Soter.SoterCoreTreble", "soter: soter service not found", new java.lang.Object[0]);
        au5.k kVar = this.f14167h;
        if (kVar == null) {
            return true;
        }
        ((se4.e) kVar).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterInitManager", "no service when calling");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1104L, 9L, 1L, false);
        return true;
    }

    public final void z(boolean z17) {
        long y17 = y(this.f14163d);
        zt5.h.c("Soter.SoterCoreTreble", "soter: scheduleTimeoutTask isCycle:%b noResponseCount:%d checkDelay:%d ", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f14163d), java.lang.Long.valueOf(y17));
        if (z17 || this.f14163d <= 3) {
            this.f14166g.postDelayed(this.f14170k, y17 * 1000);
        }
    }
}
