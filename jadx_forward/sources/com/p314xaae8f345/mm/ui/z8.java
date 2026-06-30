package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class z8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f294139a;

    public z8() {
        this.f294139a = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() || android.os.Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone");
    }

    public boolean a(android.app.Activity activity, int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(iArr == null ? -1 : iArr.length);
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = strArr;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[3] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", objArr);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.u8(this), 500L);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        int i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hhr;
        if (i17 != 32) {
            if (i17 != 33) {
                if (i17 != 64) {
                    if (i17 != 70) {
                        if (i17 != 96) {
                            if (i17 != 97) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (i17 == 97) {
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hho;
            } else if (i17 == 70) {
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hhm;
            }
            if (iArr[0] != 0) {
                this.f294139a = false;
                db5.e1.C(activity, activity.getString(i18), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.ui.x8(this, i17, activity), new com.p314xaae8f345.mm.ui.y8(this, i17));
            } else if (i17 == 33) {
                jx3.f.INSTANCE.mo68477x336bdfd8(462L, 9L, 1L, true);
            } else if (i17 == 97) {
                jx3.f.INSTANCE.mo68477x336bdfd8(462L, 10L, 1L, true);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(462L, 11L, 1L, true);
            }
            return true;
        }
        int i19 = i17 == 96 ? com.p314xaae8f345.mm.R.C30867xcad56011.hho : i17 == 64 ? com.p314xaae8f345.mm.R.C30867xcad56011.hhm : com.p314xaae8f345.mm.R.C30867xcad56011.hhr;
        if (iArr[0] != 0) {
            db5.e1.C(activity, activity.getString(i19), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.ui.v8(this, i17, activity), new com.p314xaae8f345.mm.ui.w8(this, i17, activity));
        } else if (i17 == 32) {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 0L, 1L, true);
        } else if (i17 == 96) {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 1L, 1L, true);
            wo.w0.f529373b.a();
            wo.w0.f529374c.a();
            wo.w0.f529381j.a();
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 2L, 1L, true);
        }
        return true;
    }
}
