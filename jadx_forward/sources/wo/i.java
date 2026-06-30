package wo;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f529251a;

    static {
        boolean z17 = true;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_camera_util_use_cache_new", true)) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        f529251a = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "useCache = %b", java.lang.Boolean.valueOf(z17));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a() {
        /*
            wo.o r0 = wo.v1.f529366m
            int r0 = r0.f529290o
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            boolean r0 = wo.i.f529251a
            if (r0 == 0) goto L62
            uo.q r0 = uo.q.f511065a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "getBackCameraId mBackCameraId = "
            r1.<init>(r3)
            int r3 = uo.q.f511072h
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.PluginCamera"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            int r1 = uo.q.f511072h
            r4 = -1
            if (r1 != r4) goto L4d
            com.tencent.mm.sdk.platformtools.o4 r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            java.lang.String r5 = "PluginCamera_BackCameraId"
            int r1 = r1.o(r5, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getBackCameraIdFromMMKVCache, backCameraIdFromKv = "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5)
            if (r1 != r4) goto L4a
            r0.e()
            goto L4d
        L4a:
            uo.q.f511072h = r1
            goto L4f
        L4d:
            int r1 = uo.q.f511072h
        L4f:
            if (r1 != r4) goto L52
            goto L53
        L52:
            r2 = r1
        L53:
            ku5.u0 r0 = ku5.t0.f394148d
            wo.f r1 = new wo.f
            r1.<init>(r2)
            java.lang.String r3 = "getBackCameraId-checkCache"
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r1, r3)
            goto L7c
        L62:
            uo.q r0 = uo.q.f511065a
            int r0 = r0.d()
            android.hardware.Camera$CameraInfo r1 = new android.hardware.Camera$CameraInfo
            r1.<init>()
            r3 = r2
        L6e:
            if (r3 >= r0) goto L7c
            android.hardware.Camera.getCameraInfo(r3, r1)
            int r4 = r1.facing
            if (r4 != 0) goto L79
            r2 = r3
            goto L7c
        L79:
            int r3 = r3 + 1
            goto L6e
        L7c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.CameraUtil"
            java.lang.String r3 = "tigercam getBackCameraId %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.i.a():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b() {
        /*
            boolean r0 = wo.i.f529251a
            r1 = 0
            if (r0 == 0) goto L5a
            uo.q r0 = uo.q.f511065a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getBackCameraId mFrontCameraId = "
            r2.<init>(r3)
            int r3 = uo.q.f511073i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.PluginCamera"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            int r2 = uo.q.f511073i
            r4 = -1
            if (r2 != r4) goto L45
            com.tencent.mm.sdk.platformtools.o4 r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            java.lang.String r5 = "PluginCamera_FrontCameraId"
            int r2 = r2.o(r5, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getFrontCameraIdFromMMKvCache, frontCameraIdFromKv = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5)
            if (r2 != r4) goto L42
            r0.e()
            goto L45
        L42:
            uo.q.f511073i = r2
            goto L47
        L45:
            int r2 = uo.q.f511073i
        L47:
            if (r2 != r4) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            ku5.u0 r0 = ku5.t0.f394148d
            wo.g r2 = new wo.g
            r2.<init>(r1)
            java.lang.String r3 = "getFrontCameraId-checkCache"
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r2, r3)
            goto L75
        L5a:
            uo.q r0 = uo.q.f511065a
            int r0 = r0.d()
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            r3 = r1
        L66:
            if (r3 >= r0) goto L75
            android.hardware.Camera.getCameraInfo(r3, r2)
            int r4 = r2.facing
            r5 = 1
            if (r4 != r5) goto L72
            r1 = r3
            goto L75
        L72:
            int r3 = r3 + 1
            goto L66
        L75:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "MicroMsg.CameraUtil"
            java.lang.String r3 = "tigercam getBackCameraId %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.i.b():int");
    }

    public static int c() {
        int i17;
        wo.e eVar = wo.v1.f529355b;
        if (!eVar.f529201m || !eVar.f529207s) {
            return uo.q.f511065a.d();
        }
        wo.e eVar2 = wo.v1.f529355b;
        if (eVar2.f529207s && (i17 = eVar2.f529206r) != -1) {
            return i17;
        }
        int c17 = c();
        if (c17 > 1) {
            return c17;
        }
        return 0;
    }

    public static wo.h d(android.content.Context context, final int i17, android.os.Looper looper) {
        int i18;
        int i19;
        int i27;
        int i28;
        java.lang.String[] split;
        int c17;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        int i48;
        int i49;
        wo.e eVar = wo.v1.f529355b;
        int i57 = 0;
        if (eVar.f529209u == 1) {
            wo.h hVar = new wo.h();
            try {
                hVar.f529246a = wo.f1.b(looper);
                hVar.f529247b = 0;
                return hVar;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        int i58 = -1;
        if (eVar.f529201m) {
            wo.n nVar = new wo.n();
            wo.h hVar2 = new wo.h();
            hVar2.f529246a = null;
            try {
                hVar2.f529246a = wo.f1.a(i17, looper);
                hVar2.f529247b = 0;
                if ((!eVar.f529207s || (c17 = eVar.f529206r) == -1) && (c17 = c()) <= 1) {
                    c17 = 0;
                }
                if (c17 > 1) {
                    try {
                        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                        if (f529251a) {
                            i29 = uo.q.f511065a.c(i17).facing;
                            ((ku5.t0) ku5.t0.f394148d).h(new wo.m(nVar, i17), "openCamera-checkCache");
                        } else {
                            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
                            i29 = cameraInfo.facing;
                        }
                        if (i29 == 1) {
                            boolean z17 = eVar.f529201m;
                            if (z17 && (i47 = eVar.f529202n) != -1) {
                                hVar2.f529247b = i47;
                            }
                            if (z17 && (i39 = eVar.f529203o) != -1) {
                                hVar2.f529246a.e(i39);
                            }
                        } else {
                            boolean z18 = eVar.f529201m;
                            if (z18 && (i38 = eVar.f529204p) != -1) {
                                hVar2.f529247b = i38;
                            }
                            if (z18 && (i37 = eVar.f529205q) != -1) {
                                hVar2.f529246a.e(i37);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CameraUtilImplConfig", e17, "", new java.lang.Object[0]);
                    }
                } else {
                    boolean z19 = eVar.f529201m;
                    if (z19 && (i49 = eVar.f529204p) != -1) {
                        hVar2.f529247b = i49;
                    }
                    if (z19 && (i48 = eVar.f529205q) != -1) {
                        hVar2.f529246a.e(i48);
                    }
                }
                return hVar2;
            } catch (java.lang.Exception unused2) {
                return null;
            }
        }
        if (wo.w0.m().equals("M9")) {
            wo.h hVar3 = new wo.h();
            try {
                hVar3.f529246a = wo.f1.b(looper);
                hVar3.f529247b = 0;
                java.lang.String str = android.os.Build.DISPLAY;
                if (str.startsWith("Flyme")) {
                    hVar3.f529247b = 90;
                    hVar3.f529246a.e(90);
                } else {
                    if (wo.w0.m().equals("M9") && !str.substring(0, 0).equals("1") && (split = str.split("-")) != null && split.length >= 2) {
                        i58 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0);
                    }
                    if (i58 >= 7093) {
                        hVar3.f529247b = 90;
                        hVar3.f529246a.e(180);
                    }
                }
                return hVar3;
            } catch (java.lang.Exception unused3) {
                return null;
            }
        }
        if (c() <= 1) {
            wo.k kVar = new wo.k();
            wo.h hVar4 = new wo.h();
            try {
                hVar4.f529246a = wo.f1.b(looper);
                hVar4.f529247b = 90;
                android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
                if (f529251a) {
                    android.hardware.Camera.CameraInfo c18 = uo.q.f511065a.c(i17);
                    i18 = c18.facing;
                    i19 = c18.orientation;
                    ((ku5.t0) ku5.t0.f394148d).h(new wo.j(kVar, i17), "openCamera-checkCache");
                } else {
                    android.hardware.Camera.getCameraInfo(i17, cameraInfo2);
                    i18 = cameraInfo2.facing;
                    i19 = cameraInfo2.orientation;
                }
                int rotation = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation != 0) {
                    if (rotation == 1) {
                        i57 = 90;
                    } else if (rotation == 2) {
                        i57 = 180;
                    } else if (rotation == 3) {
                        i57 = 270;
                    }
                }
                hVar4.f529246a.e(i18 == 1 ? (360 - ((i19 + i57) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3)) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 : ((i19 - i57) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
                return hVar4;
            } catch (java.lang.Exception unused4) {
                return null;
            }
        }
        wo.h hVar5 = new wo.h();
        hVar5.f529246a = null;
        try {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "ashu::begin to try Call Camera.open cameraID %d", java.lang.Integer.valueOf(i17));
            hVar5.f529246a = wo.f1.a(i17, looper);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "ashu::Call Camera.open back,  %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraUtil", "open camera error %s", e18.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraUtil", e18, "", new java.lang.Object[0]);
        }
        if (hVar5.f529246a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraUtil", "open camera error, not exception, but camera null");
            return null;
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "ashu::begin to Call Camera.getCameraInfo cameraID %d", java.lang.Integer.valueOf(i17));
        android.hardware.Camera.CameraInfo cameraInfo3 = new android.hardware.Camera.CameraInfo();
        if (f529251a) {
            android.hardware.Camera.CameraInfo c19 = uo.q.f511065a.c(i17);
            i27 = c19.facing;
            i28 = c19.orientation;
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: wo.l$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i59 = i17;
                    try {
                        android.hardware.Camera.CameraInfo cameraInfo4 = new android.hardware.Camera.CameraInfo();
                        android.hardware.Camera.getCameraInfo(i59, cameraInfo4);
                        uo.q.f511065a.g(i59, cameraInfo4);
                    } catch (java.lang.Exception unused5) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraUtil", "error in get camera crash");
                    }
                }
            }, "openCamera-checkCache");
        } else {
            android.hardware.Camera.getCameraInfo(i17, cameraInfo3);
            i27 = cameraInfo3.facing;
            i28 = cameraInfo3.orientation;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "ashu::Call Camera.getCameraInfo back, use %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        int rotation2 = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation2 != 0) {
            if (rotation2 == 1) {
                i57 = 90;
            } else if (rotation2 == 2) {
                i57 = 180;
            } else if (rotation2 == 3) {
                i57 = 270;
            }
        }
        int i59 = i27 == 1 ? (360 - (i28 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3)) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 : ((i28 - i57) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "ashu::begin to Call Camera.setDisplayOrientation %d", java.lang.Integer.valueOf(i59));
        hVar5.f529246a.e(i59);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "ashu::Call Camera.setDisplayOrientation back, use %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
        hVar5.f529247b = i28;
        return hVar5;
    }
}
