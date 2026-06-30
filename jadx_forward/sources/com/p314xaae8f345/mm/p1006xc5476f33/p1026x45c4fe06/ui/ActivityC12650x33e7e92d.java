package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@db5.a(m123858x6ac9171 = 1)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI */
/* loaded from: classes7.dex */
public class ActivityC12650x33e7e92d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a {

    /* renamed from: p0, reason: collision with root package name */
    public int f170910p0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    public int f170911x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f170912y0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a
    public boolean F7() {
        return false;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 J7() {
        if (q7() == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) q7().mo48805xd384d23c();
    }

    public final boolean K7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.a(J7());
        return false;
    }

    public final boolean L7() {
        android.content.ComponentName componentName;
        android.content.ComponentName componentName2;
        K7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 J7 = J7();
        if (J7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = J7.u0();
            if (u07.r() == k91.z3.OPAQUE) {
                return true;
            }
            if (u07.r() == k91.z3.TRANSPARENT) {
                return false;
            }
        }
        try {
            android.app.ActivityManager.RunningTaskInfo z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z(this, getTaskId());
            if (z17 != null && (componentName2 = z17.baseActivity) != null) {
                if (componentName2.equals(getComponentName())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUI", "shouldKeepPluginUIOpaque return true, task.baseActivity=self, keep PluginUI opaque");
                    return true;
                }
                java.lang.String[] strArr = {"WXBizEntryActivity", "AppBrandLaunchProxyUI"};
                for (int i17 = 0; i17 < 2; i17++) {
                    java.lang.String str = strArr[i17];
                    if (z17.baseActivity.getShortClassName().endsWith(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUI", "shouldKeepPluginUIOpaque return true, task.baseActivity=[%s], keep PluginUI opaque", str);
                        return true;
                    }
                }
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = (z17 == null || (componentName = z17.baseActivity) == null) ? "null" : componentName.getShortClassName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUI", "shouldKeepPluginUIOpaque return false, task.baseActivity=[%s]", objArr);
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPluginUI", "shouldKeepPluginUIOpaque return false, get e=%s", e17);
            return false;
        }
    }

    public final boolean M7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 J7 = J7();
        if (J7 == null) {
            return false;
        }
        return J7.H2.q();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 J7 = J7();
        if (!M7() || J7 == null) {
            super.finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h6 h6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h6(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = J7.H2;
        l0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.t(h6Var, l0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = l0Var.f172731d;
        if (f0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0.e0(f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172601h, tVar, false, 4, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1211x73978ca2.AbstractActivityC12733x36a678ba, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Object obj;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5163xb50f8dbb> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5163xb50f8dbb>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.1
            {
                this.f39173x3fe91575 = -858972213;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5163xb50f8dbb c5163xb50f8dbb) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5163xb50f8dbb c5163xb50f8dbb2 = c5163xb50f8dbb;
                int i17 = c5163xb50f8dbb2.f135513g.f89483a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d activityC12650x33e7e92d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.this;
                if (i17 != activityC12650x33e7e92d.hashCode()) {
                    return false;
                }
                activityC12650x33e7e92d.f170910p0 = c5163xb50f8dbb2.f135513g.f89484b;
                activityC12650x33e7e92d.f170911x0 = 0;
                return true;
            }
        };
        this.f170912y0 = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AppBrandLauncherUI)).Rj(this, iy1.a.MiniProgramList);
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d.f156579b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((android.app.Activity) ((cf.a) obj).f122349b.get(), this)) {
                    break;
                }
            }
        }
        cf.a aVar = (cf.a) obj;
        if (aVar != null) {
            aVar.f122351d = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1211x73978ca2.AbstractActivityC12733x36a678ba, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f170912y0.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (!L7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUI", "onEnterAnimationComplete convert PluginUI to translucent");
            db5.f.c(this, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUI", "onEnter convertActivityToTranslucent");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 J7 = J7();
            if (J7 != null) {
                J7.M1(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("platformViewDebug", "appbrand on pause");
        super.onPause();
        K7();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        K7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("platformViewDebug", "appbrand on resume");
        super.onResume();
        K7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("platformViewDebug", "appbrand on stop");
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a
    public void s7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = c11809xbc286be4 == null ? null : c11809xbc286be4.L1;
        if (c11816x5915d2c1 != null && c11816x5915d2c1.c()) {
            int i18 = this.f170910p0;
            if (i18 != -1 && (i17 = this.f170911x0) != -1) {
                overridePendingTransition(i17, i18);
                this.f170910p0 = -1;
                this.f170911x0 = -1;
                return;
            } else {
                if (c11816x5915d2c1.a(this) == k91.s2.f387293d) {
                    if (M7()) {
                        overridePendingTransition(0, 0);
                        return;
                    } else {
                        overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7);
                        return;
                    }
                }
                if (M7()) {
                    super.overridePendingTransition(0, 0);
                    return;
                } else {
                    super.overridePendingTransition(0, com.p314xaae8f345.mm.ui.uc.f292614d);
                    return;
                }
            }
        }
        if (c11809xbc286be4 == null || k91.y3.DISABLED == c11809xbc286be4.q()) {
            super.overridePendingTransition(0, 0);
            return;
        }
        if (c11809xbc286be4.M1) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559278a6, com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7);
            return;
        }
        if (c11809xbc286be4.A2 && !c11809xbc286be4.f158825e2) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559278a6, com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7);
            return;
        }
        k91.y3 y3Var = k91.y3.DEFAULT;
        k91.y3 q17 = c11809xbc286be4.q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8 u8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.INSTANCE;
        if (y3Var != q17) {
            u8Var.j(this, c11809xbc286be4);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.b()) {
            super.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
        } else {
            u8Var.j(this, c11809xbc286be4);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a
    public void t7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.u.a(this, c11809xbc286be4, c12559xbdae8559)) {
            db5.f.c(this, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUI", "init convertActivityToTranslucent");
            return;
        }
        if (k91.y3.DISABLED == c11809xbc286be4.o()) {
            super.overridePendingTransition(0, 0);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 o76 = o7();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t.b(c11809xbc286be4.f158828h2)) {
            super.overridePendingTransition(0, 0);
            return;
        }
        K7();
        if (c11809xbc286be4.L1.c()) {
            if (c11809xbc286be4.L1.a(this) == k91.s2.f387293d) {
                if (M7()) {
                    overridePendingTransition(0, 0);
                    return;
                } else {
                    overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559280a8, 0);
                    return;
                }
            }
            if (M7()) {
                super.overridePendingTransition(0, 0);
                return;
            } else {
                super.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, 0);
                return;
            }
        }
        if (o76 != null && o76.M1) {
            super.t7(c11809xbc286be4, c12559xbdae8559);
            return;
        }
        if (o76.A2 && !o76.f158825e2) {
            super.t7(c11809xbc286be4, c12559xbdae8559);
            return;
        }
        k91.y3 y3Var = k91.y3.DEFAULT;
        k91.y3 o17 = o76.o();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8 u8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.INSTANCE;
        if (y3Var != o17) {
            u8Var.k(this, o76);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.b()) {
            super.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
        } else {
            u8Var.k(this, o76);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a
    public boolean v7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a
    public boolean w7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        return super.w7(c11510xdd90c2f2) && !L7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a
    public android.view.LayoutInflater y7() {
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) b3.l.m9714xac92a5d0(getApplicationContext(), android.view.LayoutInflater.class);
        java.util.Objects.requireNonNull(layoutInflater);
        return com.p314xaae8f345.mm.ui.id.a(layoutInflater, new android.view.ContextThemeWrapper(getApplicationContext(), getTheme()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (((r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) r5)) != false) goto L19;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 r5) {
        /*
            r4 = this;
            boolean r0 = rh1.b.f477157a
            if (r0 == 0) goto L8
            super.z7(r5)
            return
        L8:
            r0 = 0
            if (r5 == 0) goto L4d
            boolean r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.e(r5)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L33
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r5.u0()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) r1
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r1.L1
            boolean r1 = r1.c()
            if (r1 != 0) goto L33
            boolean r1 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6
            if (r1 == 0) goto L30
            r1 = r5
            com.tencent.mm.plugin.appbrand.o6 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) r1
            boolean r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(r1)
            if (r1 == 0) goto L30
            r1 = r3
            goto L31
        L30:
            r1 = r2
        L31:
            if (r1 == 0) goto L4d
        L33:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r5.u0()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) r1
            boolean r1 = r1.Z
            if (r1 == 0) goto L43
            r5.M1(r2)
            r5.f156334l1 = r0
            goto L4d
        L43:
            r5.M1(r3)
            com.tencent.mm.plugin.appbrand.ui.g6 r1 = new com.tencent.mm.plugin.appbrand.ui.g6
            r1.<init>(r4)
            r5.f156334l1 = r1
        L4d:
            boolean r1 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6
            if (r1 == 0) goto L75
            com.tencent.mm.plugin.appbrand.o6 r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) r5
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r5.u0()
            k91.y3 r1 = k91.y3.DISABLED
            k91.y3 r2 = r5.o()
            if (r1 != r2) goto L75
            boolean r1 = r4.L7()
            if (r1 != 0) goto L75
            java.lang.String r5 = r5.f158811d
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r1 = "MicroMsg.AppBrandPluginUI"
            java.lang.String r2 = "onRuntimeLoaded, appId:%s, disableEnterAnimation && !keepOpaque, convertActivityToTranslucent"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r5)
            db5.f.c(r4, r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.z7(com.tencent.mm.plugin.appbrand.AppBrandRuntime):void");
    }
}
