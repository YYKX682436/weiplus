package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f223273a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r0 f223274b = null;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n6 f223275c = null;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n5 f223276d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m6 f223277e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f223278f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f223279g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f223280h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f223281i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r(this), false);

    public s(android.content.Context context) {
        this.f223273a = context;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var) {
        int i17;
        if (bVar == null || c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameActionBtnHandler", "Null appInfo or null downloadInfo");
            return;
        }
        android.content.Context context = this.f223273a;
        android.view.View view = new android.view.View(context);
        view.setTag(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameActionBtnHandler", "App Status: %d, Download Mode: %d, Download Status: %d", java.lang.Integer.valueOf(bVar.f221737g2), java.lang.Integer.valueOf(c0Var.f221776c), java.lang.Integer.valueOf(c0Var.f221775b));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = bVar.f67370x28d45f97;
        ((kt.c) i0Var).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(context, str) || bVar.I0()) {
            c0Var.f221776c = 1;
        }
        if (c0Var.f221776c == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3.a();
            int i18 = bVar.Z;
            a17.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("com.tencent.android.qqdownloader")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, packageName is null");
            } else {
                try {
                    android.content.pm.PackageInfo a18 = ik1.b.a(context, "com.tencent.android.qqdownloader");
                    i17 = a18 == null ? 1 : a18.versionCode >= i18 ? 0 : 2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "getAppInstallState fail, ex = %s", e17.getMessage());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bVar.Z));
                if (i17 != -1 || i17 == 1 || i17 == 2) {
                    c0Var.f221776c = 1;
                }
            }
            i17 = -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameActionBtnHandler", "qqdownloader install status:[%d], yybSupportedVersionCode:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bVar.Z));
            if (i17 != -1) {
            }
            c0Var.f221776c = 1;
        }
        int i19 = bVar.f221737g2;
        if (i19 != 0) {
            if (i19 == 1) {
                if (this.f223277e == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m6 m6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m6(context);
                    this.f223277e = m6Var;
                    m6Var.f223011f = this.f223278f;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m6 m6Var2 = this.f223277e;
                m6Var2.f223012g = this.f223279g;
                m6Var2.onClick(view);
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(this.f223273a, bVar.f221745o2, bVar.f221746p2, bVar.f221747q2, 9, bVar.f67370x28d45f97, this.f223279g, bVar.f221743m2, this.f223280h);
                return;
            }
            if (i19 == 2) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(bVar.f67370x28d45f97);
                if (q17 != null && q17.f178494d > 0) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(q17.f178494d);
                }
                if (this.f223276d == null) {
                    this.f223276d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n5(context, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n5 n5Var = this.f223276d;
                n5Var.f223212g = this.f223279g;
                n5Var.f223210e = bVar.U;
                n5Var.onClick(view);
                return;
            }
            if (i19 != 3 && i19 != 4) {
                return;
            }
        }
        int i27 = c0Var.f221776c;
        if (i27 != 3) {
            if (i27 == 4) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.Q)) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameActionBtnHandler", "gp download url is not null and download flag is download directly by gp store");
                ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).wi(context, bVar.Q);
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(this.f223273a, bVar.f221745o2, bVar.f221746p2, bVar.f221747q2, 25, bVar.f67370x28d45f97, this.f223279g, bVar.f221743m2, this.f223280h);
                return;
            }
            if (this.f223274b == null) {
                this.f223274b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r0(context);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r0 r0Var = this.f223274b;
            r0Var.f222964m = this.f223279g;
            r0Var.f222965n = this.f223280h;
            r0Var.f222966o = "";
            r0Var.onClick(view);
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(bVar.f67370x28d45f97);
        if (q18 != null && q18.f178494d > 0) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(q18.f178494d);
        }
        if (this.f223275c == null) {
            this.f223275c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n6(context);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n6 n6Var = this.f223275c;
        int i28 = this.f223279g;
        java.lang.String str2 = this.f223280h;
        n6Var.f223215f = i28;
        n6Var.f223216g = str2;
        n6Var.onClick(view);
    }

    public void b(android.widget.ProgressBar progressBar, android.widget.Button button, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var) {
        if (progressBar == null || button == null) {
            return;
        }
        button.setEnabled(true);
        button.setVisibility(0);
        if (bVar.f221737g2 == 1) {
            if (!bVar.f221744n2) {
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fk9);
                button.setVisibility(0);
                progressBar.setVisibility(8);
                return;
            } else {
                button.setEnabled(false);
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fk_);
                button.setVisibility(0);
                progressBar.setVisibility(8);
                return;
            }
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.q(this.f223273a, bVar)) {
            int j17 = r53.f.j(bVar.f67386xa1e9e82c);
            if (bVar.f221748r2 <= j17) {
                button.setVisibility(0);
                progressBar.setVisibility(8);
                if (bVar.f221745o2 == 12) {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.flu);
                } else {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fnb);
                }
            } else if (c0Var.f221775b == 1) {
                progressBar.setVisibility(0);
                progressBar.setProgress(c0Var.f221777d);
                button.setVisibility(8);
            } else {
                if (bVar.f221745o2 == 12) {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.flw);
                } else {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fkb);
                }
                button.setVisibility(0);
                progressBar.setVisibility(8);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameActionBtnHandler", "AppId: %s installed, local: %d, server: %d", bVar.f67370x28d45f97, java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(bVar.f221748r2));
            return;
        }
        if (bVar.I0()) {
            button.setVisibility(0);
            progressBar.setVisibility(8);
            if (bVar.f221745o2 == 12) {
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.flu);
                return;
            } else {
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fnb);
                return;
            }
        }
        int i17 = bVar.f221737g2;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 == 2) {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fk8);
                    button.setVisibility(0);
                    progressBar.setVisibility(8);
                } else if (i17 != 3) {
                    if (i17 != 4) {
                        button.setVisibility(8);
                        progressBar.setVisibility(8);
                    } else {
                        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fka);
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                    }
                } else {
                    if (c0Var == null) {
                        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fk7);
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                        return;
                    }
                    int i18 = c0Var.f221775b;
                    if (i18 == 0) {
                        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fk7);
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                    } else if (i18 == 1) {
                        int i19 = c0Var.f221776c;
                        if (i19 == 3) {
                            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fn_);
                        } else if (i19 == 1) {
                            progressBar.setProgress(c0Var.f221777d);
                            button.setVisibility(8);
                            progressBar.setVisibility(0);
                        }
                    } else if (i18 == 2) {
                        if (bVar.f221745o2 == 12) {
                            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573740fm0);
                        } else {
                            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fn9);
                        }
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                    } else if (i18 == 3) {
                        if (bVar.f221745o2 == 12) {
                            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fn6);
                        } else {
                            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573751fn5);
                        }
                        button.setVisibility(0);
                        progressBar.setVisibility(8);
                    }
                }
            } else if (bVar.f221744n2) {
                button.setEnabled(false);
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fk_);
                button.setVisibility(0);
                progressBar.setVisibility(8);
            } else {
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fk9);
                button.setVisibility(0);
                progressBar.setVisibility(8);
            }
        } else {
            if (c0Var == null) {
                button.setVisibility(8);
                progressBar.setVisibility(8);
                return;
            }
            int i27 = c0Var.f221775b;
            if (i27 == 0) {
                if (bVar.f221745o2 == 12) {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fn8);
                } else {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fn7);
                }
                button.setVisibility(0);
                progressBar.setVisibility(8);
            } else if (i27 == 1) {
                int i28 = c0Var.f221776c;
                if (i28 == 3) {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fn_);
                    button.setVisibility(0);
                    progressBar.setVisibility(8);
                } else if (i28 == 1) {
                    progressBar.setProgress(c0Var.f221777d);
                    button.setVisibility(8);
                    progressBar.setVisibility(0);
                }
            } else if (i27 == 2) {
                if (bVar.f221745o2 == 12) {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573740fm0);
                } else {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fn9);
                }
                button.setVisibility(0);
                progressBar.setVisibility(8);
            } else if (i27 == 3) {
                if (bVar.f221745o2 == 12) {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fn6);
                } else {
                    button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573751fn5);
                }
                button.setVisibility(0);
                progressBar.setVisibility(8);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameActionBtnHandler", "updateBtnStateAndText: %s, Status: %d, Text: %s", bVar.f67370x28d45f97, java.lang.Integer.valueOf(bVar.f221737g2), button.getText());
    }
}
