package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public enum a2 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f180379d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f180380e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180381f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f180382g;

    a2() {
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("exdevice_pref", 0).getLong(gm0.j1.b().h() + "", 0L);
        if (j17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "this user has update bound device, last time is %d", java.lang.Long.valueOf(j17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "the user has not update bound device yet");
        }
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a2 a2Var, v32.b bVar) {
        java.lang.String str;
        a2Var.getClass();
        if (bVar == null || (str = bVar.f66604x76f6f117) == null) {
            return;
        }
        if (str.contains("1") || bVar.f66604x76f6f117.contains("3")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Bi().b(bVar.f66609x4b6e688a);
        }
    }

    public boolean d(boolean z17) {
        if (this.f180380e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "Getting bound device now, just leave");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("exdevice_pref", 0).getLong(gm0.j1.b().h() + "", 0L);
        if (z17 || currentTimeMillis - j17 >= 86400000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "GetBoundHardDevices not now pp");
        return false;
    }

    public boolean e(boolean z17) {
        if (this.f180381f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "Getting bound iotDevice now, just leave");
            return false;
        }
        if (z17) {
            return true;
        }
        if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("exdevice_kv").getLong(gm0.j1.b().h() + "_iot", 0L) >= 86400000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "GetBoundHardIotDevices not now");
        return false;
    }

    public void f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z1 z1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "startGetBoundHardDevices");
        if (this.f180380e) {
            if (this.f180382g == null) {
                this.f180382g = new java.lang.ref.WeakReference(z1Var);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "getting bound device now, just leave");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.h2(1);
        if (context != null && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
            android.app.ProgressDialog progressDialog = this.f180379d;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f180379d.dismiss();
                this.f180379d = null;
            }
            boolean z17 = false;
            try {
                java.util.ArrayList arrayList = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.f278359y;
                if (!com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.isInstance(context)) {
                    int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.f279786t;
                    if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class.isInstance(context)) {
                        int i18 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.f288819d;
                        if (!com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.class.isInstance(context)) {
                            z17 = true;
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.GetBoundDeviceLogic", th6, "", new java.lang.Object[0]);
            }
            if (z17) {
                this.f180379d = db5.e1.R(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.w1(this, h2Var, z1Var));
            }
        }
        this.f180382g = new java.lang.ref.WeakReference(z1Var);
        gm0.j1.n().f354821b.g(h2Var);
        this.f180380e = true;
    }

    public void h() {
        if (this.f180381f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "getting iot device now, just leave");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "startGetUserBindIotDevices");
        gm0.j1.n().f354821b.c(6693);
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j2());
        this.f180381f = true;
    }

    public void i(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "update get bound hard device time : %d", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("exdevice_pref", 0).edit().putLong(gm0.j1.b().h() + "", j17).commit();
    }
}
