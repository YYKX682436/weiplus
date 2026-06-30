package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public class z {

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f297223e = "com.mdid.msa";

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0 f297224a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.ServiceConnection f297225b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f297226c;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y f297227d;

    public z(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0 a0Var) {
        if (context == null) {
            throw new java.lang.NullPointerException("Context can not be null.");
        }
        this.f297226c = context;
        this.f297224a = a0Var;
        this.f297225b = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z1(this, a0Var);
    }

    public java.lang.String b() {
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y yVar = this.f297227d;
            return yVar == null ? "" : yVar.a();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public boolean c() {
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y yVar = this.f297227d;
            if (yVar == null) {
                return false;
            }
            return yVar.g();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public void d() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y yVar = this.f297227d;
        if (yVar != null) {
            try {
                yVar.f();
                android.content.ServiceConnection serviceConnection = this.f297225b;
                if (serviceConnection != null) {
                    this.f297226c.unbindService(serviceConnection);
                }
            } catch (java.lang.Exception unused) {
            }
            this.f297225b = null;
            this.f297227d = null;
        }
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0 a0Var;
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        if (this.f297226c.bindService(intent, this.f297225b, (this.f297226c.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513) || (a0Var = this.f297224a) == null) {
            return;
        }
        a0Var.b();
    }

    public static boolean a(android.content.Context context) {
        try {
            context.getPackageManager().getPackageInfo(f297223e, 0);
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(f297223e, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String a() {
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y yVar = this.f297227d;
            return yVar == null ? "" : yVar.d();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
