package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f297115a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.tmsqmsp.oaid2.f.b f297116b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.ServiceConnection f297117c;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.g f297118d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f297119e = false;

    /* loaded from: classes15.dex */
    public interface b {
        void b();
    }

    public f(android.content.Context context, com.tencent.tmsqmsp.oaid2.f.b bVar) {
        if (context == null) {
            throw new java.lang.NullPointerException("context can not be null");
        }
        this.f297115a = context;
        this.f297116b = bVar;
        this.f297117c = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.k1(this, bVar);
    }

    public java.lang.String b() {
        android.content.Context context = this.f297115a;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context is null, must be new SxCore first");
        }
        java.lang.String packageName = context.getPackageName();
        if (android.text.TextUtils.isEmpty(packageName)) {
            return null;
        }
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.g gVar = this.f297118d;
            if (gVar != null) {
                return gVar.b(packageName);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public void c() {
        com.tencent.tmsqmsp.oaid2.f.b bVar;
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
        this.f297119e = this.f297115a.bindService(intent, this.f297117c, (this.f297115a.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513);
        if (this.f297119e || (bVar = this.f297116b) == null) {
            return;
        }
        bVar.b();
    }

    public boolean d() {
        return this.f297118d != null;
    }

    public void e() {
        if (this.f297115a == null || !this.f297119e) {
            return;
        }
        try {
            this.f297115a.unbindService(this.f297117c);
        } catch (java.lang.Exception unused) {
        } finally {
            this.f297119e = false;
            this.f297118d = null;
        }
    }

    public java.lang.String a() {
        android.content.Context context = this.f297115a;
        if (context != null) {
            java.lang.String packageName = context.getPackageName();
            if (android.text.TextUtils.isEmpty(packageName)) {
                return null;
            }
            try {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.g gVar = this.f297118d;
                if (gVar != null) {
                    return gVar.a(packageName);
                }
                return null;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        throw new java.lang.IllegalArgumentException("Context is null, must be new SxCore first");
    }
}
