package zs4;

/* loaded from: classes9.dex */
public class q implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public zs4.p f556845d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f556846e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f556847f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f556848g;

    public static boolean a(android.app.Activity activity, int i17, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, android.os.Bundle bundle, boolean z17, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.p2802xd031a825.g gVar, int i18) {
        if (i17 != 416) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "don't need realname verify");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "need realname verify");
        return e(activity, m1Var, bundle, z17, onClickListener, gVar, i18, 2);
    }

    public static boolean d(android.app.Activity activity, int i17, r45.lj5 lj5Var, android.os.Bundle bundle, boolean z17, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.p2802xd031a825.g gVar, int i18, int i19) {
        if (i17 != 416) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "don't need realname verify");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "need realname verify");
        if (lj5Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "guide_flag = " + lj5Var.f461056d + ";upload_credit_url=" + lj5Var.f461060h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("1", lj5Var.f461056d + "")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog");
            return g(activity, lj5Var.f461057e, 0, lj5Var.f461058f, lj5Var.f461059g, bundle, z17, onClickListener, gVar, i18, i19);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("2", lj5Var.f461056d + "") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lj5Var.f461060h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog");
            h(activity, lj5Var.f461057e, lj5Var.f461060h, lj5Var.f461058f, lj5Var.f461059g, z17, null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealnameVerifyUtil", "guide_flag=" + lj5Var.f461056d + ";upload_credit_url=null?" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lj5Var.f461060h));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(android.app.Activity r12, com.p314xaae8f345.mm.p944x882e457a.m1 r13, android.os.Bundle r14, boolean r15, android.content.DialogInterface.OnClickListener r16, com.p314xaae8f345.mm.p2802xd031a825.g r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs4.q.e(android.app.Activity, com.tencent.mm.modelbase.m1, android.os.Bundle, boolean, android.content.DialogInterface$OnClickListener, com.tencent.mm.wallet_core.g, int, int):boolean");
    }

    public static boolean g(android.app.Activity activity, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, boolean z17, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.p2802xd031a825.g gVar, int i18, int i19) {
        android.content.DialogInterface.OnClickListener onClickListener2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog call %d", java.lang.Integer.valueOf(i17));
        int i27 = i17 < 0 ? 1 : i17;
        if (i27 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
            android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : bundle;
            bundle2.putInt("real_name_verify_mode", i27);
            bundle2.putInt("entry_scene", i18);
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class, bundle2, gVar);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(19, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), i18);
            return true;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg) : str2;
        if (i27 < 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return false;
        }
        if (onClickListener == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog use default calcel listener");
            onClickListener2 = new zs4.k(z17, activity, i19, i18);
        } else {
            onClickListener2 = onClickListener;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog show");
        if (i19 == 1) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(7, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), i18);
        } else if (i19 == 2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(10, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), i18);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 B = db5.e1.B(activity, str, "", str3, string, new zs4.l(bundle, i27, i18, activity, i19), onClickListener2, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        if (B != null) {
            B.setCancelable(false);
        }
        return true;
    }

    public static boolean h(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        }
        java.lang.String str5 = str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            str4 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        }
        java.lang.String str6 = str4;
        if (onClickListener == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog use default calcel listener");
            onClickListener = new zs4.m(z17, activity);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 B = db5.e1.B(activity, str, "", str6, str5, new zs4.n(str2, activity, z17), onClickListener, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        if (B == null) {
            return true;
        }
        B.setOnCancelListener(new zs4.o(z17, activity));
        B.setOnDismissListener(new zs4.b(z17, activity));
        B.setCanceledOnTouchOutside(false);
        return true;
    }

    public final void b() {
        if (this.f556848g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : close mDisclaimerDialog");
            this.f556848g = null;
        }
        if (this.f556847f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear mNetSceneMgr");
            this.f556847f.clear();
            this.f556847f = null;
        }
        if (this.f556846e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear mContextReference");
            this.f556846e.clear();
            this.f556846e = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear getDisclaimerCallback");
        this.f556845d = null;
    }

    public final void c(int i17, int i18, java.lang.String str, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "doGetDisclaimerCallback call");
        if (this.f556845d != null) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DISCLAIMER_NEED_AGERR_INT_SYNC, java.lang.Integer.valueOf(!z17 ? 1 : 0));
            if (!this.f556845d.run(i17, i18, str, z17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealnameVerifyUtil", "doGetDisclaimerCallback: errCode = " + i18 + ";errMsg = " + str);
                if (i17 == 3) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (weakReference = this.f556846e) != null && weakReference.get() != null) {
                        str = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f556846e.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealnameVerifyUtil", "show error dialog");
                    db5.e1.G((android.content.Context) this.f556846e.get(), str, null, false, new zs4.j(this));
                    return;
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f556848g;
            if (j0Var != null) {
                j0Var.dismiss();
            }
            b();
        }
    }

    public boolean f(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, np5.e eVar, zs4.p pVar, boolean z17, int i18, boolean z18) {
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, 0L)).longValue();
        if (longValue > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(5, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), i18);
            if (currentTimeMillis < longValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "getDisclaimer query is not expired. expiredTime = " + longValue);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifyUtil", "getDisclaimer query had expired. expiredTime = " + longValue);
        }
        if (abstractActivityC21394xb3d2c0cf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealnameVerifyUtil", "context is null");
            return false;
        }
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealnameVerifyUtil", "netmgr is null");
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ys4.d) {
            gm0.j1.i();
            gm0.j1.n().f354821b.a(385, this);
            java.lang.ref.WeakReference weakReference = this.f556847f;
            if (weakReference != null && weakReference.get() != null) {
                ((np5.e) this.f556847f.get()).b();
            }
            if (i17 == 0 && i18 == 0) {
                c(0, i18, str, true);
            } else {
                c(3, i18, str, false);
            }
        }
    }
}
