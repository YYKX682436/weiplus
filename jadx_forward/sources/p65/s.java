package p65;

/* loaded from: classes12.dex */
public class s extends p65.a {

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Application f433983c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f433984d;

    /* renamed from: e, reason: collision with root package name */
    public final long f433985e = java.lang.System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f433986f = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public s() {
        long j17 = com.p314xaae8f345.mm.app.x.f135440b;
        int[] iArr = nm.a.f419933a;
        gm0.c2.f354704a = j17;
        this.f433983c = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        this.f433984d = bm5.f1.a();
    }

    public static void h(p65.s sVar) {
        java.util.Map map = sVar.f433986f;
        try {
            if (!map.containsKey("guestCrashInfo")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.IsolatedStartupRoutine", "onWVAGuestProcessCrash: Skip updating crashInfo");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.IsolatedStartupRoutine", "onWVAGuestProcessCrash: Updating crashInfo");
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) map.get("guestCrashInfo");
            java.util.Objects.requireNonNull(parcelFileDescriptor);
            java.io.FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileDescriptor);
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileDescriptor);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, 0, fileInputStream.read(bArr)));
                    jSONObject.getJSONArray("crashTimes").put(java.lang.System.currentTimeMillis() / 1000);
                    fileOutputStream.getChannel().truncate(0L);
                    fileOutputStream.write(jSONObject.toString().getBytes());
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XWeb.IsolatedStartupRoutine", e17, "onWVAGuestProcessCrash: failed", new java.lang.Object[0]);
        }
    }

    @Override // p65.a
    public void d() {
        boolean equals = android.os.Build.MANUFACTURER.equals("samsung");
        android.app.Application application = this.f433983c;
        if (equals && android.os.Build.VERSION.SDK_INT <= 24) {
            application.registerActivityLifecycleCallbacks(new um0.d(application));
        }
        com.p314xaae8f345.mm.p815xbe0af3c9.app.C10819x6f435d6d.a();
        ku5.u.a(application.getApplicationContext(), new com.p314xaae8f345.mm.p642xad8b531f.p3());
    }

    @Override // p65.a
    public void e(android.app.Application application) {
        im0.a.f373696b = android.os.SystemClock.elapsedRealtime();
        java.lang.System.currentTimeMillis();
        fs.k2 k2Var = fs.k2.INSTANCE;
        com.p314xaae8f345.mm.app.q0 q0Var = com.p314xaae8f345.mm.app.q0.INSTANCE;
        fs.h[] hVarArr = fs.g.f347617a;
        if (hVarArr[0] == null) {
            synchronized (hVarArr) {
                if (hVarArr[0] == null) {
                    fs.g.f347619c = application;
                    hVarArr[0] = k2Var;
                    fs.g.f347618b = q0Var;
                }
            }
        }
        i95.n0.d(application, (i95.y) com.p314xaae8f345.mm.app.p0.f135101d.b(), q0Var);
        java.lang.String str = this.f433984d;
        km0.c cVar = new km0.c(str, application);
        km0.a aVar = cVar.f390524e;
        long j17 = this.f433985e;
        aVar.f390514a = j17;
        if (str.contains("isolated_process2")) {
            ix5.h.f377164b.f(this.f433983c);
            com.p314xaae8f345.mm.p874xaefb6cc9.m1 loggerFactory = com.p314xaae8f345.mm.p874xaefb6cc9.m1.f150642c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loggerFactory, "loggerFactory");
            com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94650x946c8873(loggerFactory);
            com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25541xf001b0c.m95582x6c4ebec7(new p65.p(this));
            com.p314xaae8f345.mm.app.i4.a(new p65.q(this));
            return;
        }
        com.p314xaae8f345.p3210x3857dc.b3.f301747b = j17;
        vx5.n0.f522916a = new p65.r(this);
        by5.s0.f118128c = com.p314xaae8f345.mm.p2829xfa87f9de.i0.f296375b;
        com.p314xaae8f345.p3210x3857dc.b0.f301744a = com.p314xaae8f345.mm.p2829xfa87f9de.i0.f296378e;
        android.content.Context context = cVar.f390522c;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        com.p314xaae8f345.mm.vfs.b3.E = context;
        application.getClassLoader();
        fp.d0.n("stlport_shared");
        application.getClassLoader();
        fp.d0.n("c++_shared");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.IsolatedStartupRoutine", "is plain process. load nothing");
        com.p314xaae8f345.mm.p815xbe0af3c9.app.C10819x6f435d6d.b(cVar, null);
        com.p314xaae8f345.mm.app.e6.f134941a = null;
        com.p314xaae8f345.mm.app.e6.f134942b = "com.tencent.mm.boot";
    }
}
