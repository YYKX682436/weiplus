package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public class x {

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f297216e = "LXOP";

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f297217a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v f297218b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.ServiceConnection f297219c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.x.b f297220d;

    /* loaded from: classes15.dex */
    public interface b {
        void a(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x xVar);
    }

    public x(android.content.Context context, com.tencent.tmsqmsp.oaid2.x.b bVar) {
        this.f297217a = null;
        this.f297220d = null;
        if (context == null) {
            throw new java.lang.NullPointerException("Context can not be null.");
        }
        this.f297217a = context;
        this.f297220d = bVar;
        this.f297219c = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x1(this);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.f297217a.bindService(intent, this.f297219c, (this.f297217a.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513)) {
            b("bindService Successful!");
            return;
        }
        com.tencent.tmsqmsp.oaid2.x.b bVar2 = this.f297220d;
        if (bVar2 != null) {
            bVar2.a(this);
        }
        b("bindService Failed!!!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.lang.String str) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.c(f297216e + " " + str);
    }

    public java.lang.String c() {
        android.content.Context context = this.f297217a;
        if (context == null) {
            b("Context is null.");
            throw new java.lang.IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        java.lang.String packageName = context.getPackageName();
        b("liufeng, getAAID package：".concat(java.lang.String.valueOf(packageName)));
        if (packageName == null || packageName.equals("")) {
            b("input package is null!");
            return null;
        }
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v vVar = this.f297218b;
            if (vVar != null) {
                return vVar.c(packageName);
            }
            return null;
        } catch (java.lang.Exception unused) {
            a("getAAID error, RemoteException!");
            return null;
        }
    }

    public void d() {
        try {
            this.f297217a.unbindService(this.f297219c);
            b("unBind Service successful");
        } catch (java.lang.IllegalArgumentException unused) {
            a("unBind Service exception");
        }
        this.f297218b = null;
    }

    private void a(java.lang.String str) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a(f297216e + " " + str);
    }

    public boolean b() {
        try {
            if (this.f297218b == null) {
                return false;
            }
            b("Device support opendeviceid");
            return this.f297218b.c();
        } catch (java.lang.Exception unused) {
            a("isSupport error, RemoteException!");
            return false;
        }
    }

    public java.lang.String a() {
        if (this.f297217a != null) {
            try {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v vVar = this.f297218b;
                if (vVar != null) {
                    return vVar.b();
                }
                return null;
            } catch (java.lang.Exception unused) {
                a("getOAID error, RemoteException!");
                return null;
            }
        }
        a("Context is null.");
        throw new java.lang.IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }
}
