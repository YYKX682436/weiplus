package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes3.dex */
public class u5 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f289631a;

    public u5(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var, android.app.Activity activity) {
        this.f289631a = activity;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        java.util.HashMap hashMap = j35.u.f379054a;
        android.app.Activity activity = this.f289631a;
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPermissionUtil", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (i17 == 67 || i17 == 68) {
                if (iArr[0] != 0) {
                    db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.h(activity), null);
                }
            } else if (i17 != 144) {
                if (i17 != 160) {
                    int i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hh8;
                    switch (i17) {
                        case 18:
                            if (iArr[0] != 0) {
                                if (!"android.permission.CAMERA".equals(strArr[0])) {
                                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hhn;
                                }
                                if (iArr[0] != 0) {
                                    db5.e1.C(activity, activity.getString(i18), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.r(activity), new j35.s());
                                    break;
                                }
                            }
                            break;
                        case 19:
                        case 21:
                        case 22:
                            if (iArr[0] != 0) {
                                if (!"android.permission.CAMERA".equals(strArr[0])) {
                                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hhn;
                                }
                                if (iArr[0] != 0) {
                                    db5.e1.C(activity, activity.getString(i18), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.t(activity), new j35.e());
                                    break;
                                }
                            }
                            break;
                        case 20:
                            if (iArr[0] != 0) {
                                db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.f(activity), null);
                                break;
                            }
                            break;
                        default:
                            switch (i17) {
                                case 80:
                                    if (iArr[0] != 0) {
                                        db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), "", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.p(activity), new j35.q());
                                        break;
                                    }
                                    break;
                                case 81:
                                    if (iArr[0] != 0) {
                                        db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.i(activity), null);
                                        break;
                                    }
                                    break;
                                case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                                case 83:
                                    if (iArr[0] != 0) {
                                        db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.j(activity), null);
                                        break;
                                    }
                                    break;
                            }
                    }
                } else if (iArr[0] != 0) {
                    db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574230mv1), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.k(activity), null);
                }
            } else if (iArr[0] != 0) {
                db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574228mv0), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new j35.g(activity), null);
            }
        }
        j35.b.a(activity);
    }
}
