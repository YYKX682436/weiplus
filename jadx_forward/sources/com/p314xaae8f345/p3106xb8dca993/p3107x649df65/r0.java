package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class r0 {

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f297183e = "SDI";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f297184f = "SI";

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.r0.b f297185a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.ServiceConnection f297186b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f297187c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0 f297188d;

    /* loaded from: classes8.dex */
    public interface b {
        void a(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 r0Var);
    }

    public r0(android.content.Context context, com.tencent.tmsqmsp.oaid2.r0.b bVar) {
        this.f297185a = null;
        this.f297187c = null;
        if (context == null) {
            throw new java.lang.NullPointerException("Context can not be null.");
        }
        this.f297187c = context;
        this.f297185a = bVar;
        this.f297186b = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t1(this);
    }

    public java.lang.String a() {
        android.content.Context context = this.f297187c;
        if (context == null) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " Context is null.");
            throw new java.lang.IllegalArgumentException("Context is null, must be new SxCore first");
        }
        java.lang.String packageName = context.getPackageName();
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.c(f297184f + "apackage：" + packageName);
        if (packageName == null || packageName.equals("")) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " input package is null!");
            return null;
        }
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0 q0Var = this.f297188d;
            if (q0Var == null) {
                return null;
            }
            java.lang.String a17 = q0Var.a(packageName);
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.c(f297184f + " getAAID Package: " + packageName);
            return a17;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " geta error, RemoteException!");
            return null;
        }
    }

    public java.lang.String b() {
        if (this.f297187c == null) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " Context is null.");
            throw new java.lang.IllegalArgumentException("Context is null, must be new SxCore first");
        }
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0 q0Var = this.f297188d;
            if (q0Var == null) {
                return null;
            }
            java.lang.String a17 = q0Var.a();
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297183e + " geto call");
            return a17;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " geto error, RemoteException!");
            return null;
        }
    }

    public void c() {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (this.f297187c.bindService(intent, this.f297186b, (this.f297187c.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513)) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " bindService Successful!");
            return;
        }
        this.f297185a.a(this);
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " bindService Failed!");
    }

    public boolean d() {
        try {
            if (this.f297188d == null) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " Device not support opendeviceid");
                return false;
            }
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " Device support opendeviceid");
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " isSupport error, RemoteException!");
            return false;
        }
    }

    public void e() {
        try {
            this.f297187c.unbindService(this.f297186b);
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " unBind Service successful");
        } catch (java.lang.IllegalArgumentException unused) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(f297184f + " unBind Service exception");
        }
        this.f297188d = null;
    }
}
