package u81;

/* loaded from: classes7.dex */
public abstract class i0 extends u81.j0 implements android.content.ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f506970e;

    /* renamed from: f, reason: collision with root package name */
    public int f506971f;

    public i0(u81.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super(k0Var);
        this.f506971f = 0;
        this.f506970e = c11510xdd90c2f2;
    }

    @Override // u81.j0, k75.c
    public void a() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 j1Var;
        this.f506971f = 0;
        java.lang.String str = this.f506970e.f156336n;
        u81.a aVar = (u81.a) this.f506970e.b(u81.a.class);
        if (!(aVar != null && aVar.f506931d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.d.f167290c.c(str);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.d.a(str)) {
            d(1);
        }
        boolean z18 = ((u81.a) this.f506970e.b(u81.a.class)).f506932e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagLocationIfNeed, canKeepAliveLocation:%s", java.lang.Boolean.valueOf(z18));
        if (z18 && (j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1) this.f506970e.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1.class)) != null) {
            boolean z19 = j1Var.f162974q && j1Var.f162973p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagLocationIfNeed, isBackgroundMode:%s, isListening:%s", java.lang.Boolean.valueOf(j1Var.f162974q), java.lang.Boolean.valueOf(j1Var.f162973p));
            if (z19) {
                d(32);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.h1) this.f506970e.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.h1.class);
        if (h1Var != null) {
            boolean a17 = h1Var.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagAppBrandLiveVOIPIfNeed, isVOIPing:%s", java.lang.Boolean.valueOf(a17));
            if (a17) {
                d(64);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.g1) this.f506970e.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.g1.class);
        if (g1Var != null) {
            tf1.f fVar = (tf1.f) g1Var;
            synchronized (fVar.f500399o) {
                z17 = !fVar.f500406v.isEmpty();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagAppBrandAudioBackgroundPlayIfNeed, isNeedKeepAlive:%b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                d(128);
            }
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.i1) this.f506970e.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.i1.class)) != null) {
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            boolean z27 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.T;
            boolean wi6 = ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagAppBrandVOIP1vIfNeed, isVOIPing:%b, isWaitingVoip:%b", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(wi6));
            if (z27 || wi6) {
                d(256);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.c(this.f506970e);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagBluetoothIfNeed, client is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagBluetoothIfNeed, client: " + c17.N6());
            boolean H6 = c17.H6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagBluetoothIfNeed, isNeedKeepAlive: " + H6);
            if (H6) {
                d(512);
            }
        }
        if (this.f506970e.R0()) {
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagForForegroundService processInfo.importance:%d, importanceReasonCode:%d, importanceReasonComponent:%s", java.lang.Integer.valueOf(runningAppProcessInfo.importance), java.lang.Integer.valueOf(runningAppProcessInfo.importanceReasonCode), runningAppProcessInfo.importanceReasonComponent);
            if (100 == runningAppProcessInfo.importance) {
                d(1024);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerComponentCallbacks(this);
            }
        }
        java.lang.String str2 = this.f506970e.f156336n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagAdjustByPauseType, appId:%s, pauseType:%s", str2, d17);
        int ordinal = d17.ordinal();
        if (ordinal == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f506970e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = c11510xdd90c2f2.f156329e;
            if (hcVar != null && hcVar.mo48808xee5260a9().q5()) {
                try {
                    c11510xdd90c2f2.B0();
                } catch (java.lang.Throwable unused) {
                }
            }
        } else if (ordinal == 6) {
            d(4);
        } else if (ordinal == 7) {
            d(16);
        }
        this.f506971f = this.f506971f;
        super.a();
        f(0);
    }

    public final void d(int i17) {
        this.f506971f |= i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "addFlag, appId:%s, flag: %d, result: %d", this.f506970e.f156336n, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f506971f));
    }

    public final void e(java.lang.String str) {
        int i17;
        android.content.ComponentName componentName;
        int i18;
        boolean z17 = (this.f506971f & 1024) != 0;
        if (z17) {
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            i17 = runningAppProcessInfo.importance;
            i18 = runningAppProcessInfo.importanceReasonCode;
            android.content.ComponentName componentName2 = runningAppProcessInfo.importanceReasonComponent;
            if (100 != i17) {
                f(1024);
            }
            componentName = componentName2;
        } else {
            i17 = -1;
            componentName = null;
            i18 = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "checkRemoveFlagForForegroundService(%s), hasFlag?:%b, importance:%d, importanceReasonCode:%d, importanceReasonComponent:%s, currentPauseType:%s", str, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), componentName, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(this.f506970e.f156336n));
    }

    public final void f(int i17) {
        android.os.Message message;
        this.f506971f &= ~i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "removeFlag, appId:%s, flag: %d, result: %d", this.f506970e.f156336n, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f506971f));
        if (this.f506971f == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "onKeepFlagsCleared, appId:%s", this.f506970e.f156336n);
            u81.x xVar = (u81.x) this;
            if (xVar.f507020h.d() != null) {
                message = android.os.Message.obtain(xVar.f507020h.f386380e);
                message.copyFrom(xVar.f507020h.d());
            } else {
                message = null;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = "|Background";
            objArr[1] = java.lang.Integer.valueOf(message == null ? -1 : message.what);
            objArr[2] = java.lang.Boolean.valueOf(xVar.f507019g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "onKeepFlagsCleared %s, currentMsg.what:%d, mIsSystemScreenOff:%b", objArr);
            if (xVar.f507019g) {
                xVar.f507020h.s(u81.u.ON_SYSTEM_SCREEN_OFF, null);
            } else {
                xVar.f507020h.s(u81.u.ON_BACKGROUND_KEEP_FLAGS_CLEARED, message);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        e("onLowMemory");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultipleConditionBackgroundState", "onTrimMemory level:%d", java.lang.Integer.valueOf(i17));
        e("onTrimMemory");
    }
}
