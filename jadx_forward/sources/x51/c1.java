package x51;

/* loaded from: classes5.dex */
public class c1 implements js.a1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Runnable f533509a;

    public void a(android.app.Activity activity, java.lang.Runnable runnable) {
        boolean z17 = true;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("had_show_permission_guild", true)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.h(activity, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE")) {
                db5.e1.j(activity, com.p314xaae8f345.mm.R.C30867xcad56011.hhk, com.p314xaae8f345.mm.R.C30867xcad56011.hht, com.p314xaae8f345.mm.R.C30867xcad56011.hhl, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new x51.a1(this, activity, runnable), new x51.b1(this));
                z17 = false;
            }
        }
        if (z17) {
            runnable.run();
        }
    }

    public final void b(android.app.Activity activity, java.lang.Runnable runnable) {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(activity, "android.permission.READ_PHONE_STATE", 96, "", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionCheckHelper", "check init, summerper checkPermission checkPhone[%b]", java.lang.Boolean.valueOf(a17));
        if (!a17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 20L, 1L, true);
            this.f533509a = runnable;
            return;
        }
        wo.w0.f529373b.a();
        wo.w0.f529374c.a();
        wo.w0.f529381j.a();
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean c(android.app.Activity activity, int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(iArr == null ? -1 : iArr.length);
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = strArr;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[3] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PermissionCheckHelper", "onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", objArr);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionCheckHelper", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 32 && i17 != 96) {
            return false;
        }
        if (iArr[0] != 0) {
            android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
            sharedPreferences.edit().putBoolean(i17 == 32 ? "SP_PERMISSION_HAD_REQUEST_PERMISSION_STORAGE_1" : "SP_PERMISSION_HAD_REQUEST_PERMISSION_PHONE", true).apply();
            sharedPreferences.edit().putInt("SP_PERMISSION_HAD_REQUEST_PERMISSION_UID", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().uid).apply();
        } else if (i17 == 32) {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 19L, 1L, true);
        } else if (i17 == 96) {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 21L, 1L, true);
            wo.w0.f529373b.a();
            wo.w0.f529374c.a();
            wo.w0.f529381j.a();
        }
        if (i17 == 32) {
            b(activity, this.f533509a);
        } else {
            java.lang.Runnable runnable = this.f533509a;
            if (runnable != null) {
                runnable.run();
            }
        }
        return true;
    }
}
