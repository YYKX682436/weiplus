package d85;

/* loaded from: classes12.dex */
public final class c implements yj0.c {
    @Override // yj0.c
    public java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        int i17;
        int i18;
        int i19;
        java.lang.Object[] objArr2 = objArr;
        d85.f fVar = d85.f.f308685a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CameraHooker", "[CameraHooker] method:" + str4 + ",methodDec:" + str5 + ",caller:" + obj);
        java.lang.Object obj2 = null;
        if (str4 != null) {
            int hashCode = str4.hashCode();
            int i27 = 0;
            if (hashCode != -452631290) {
                if (hashCode != 3417674) {
                    if (hashCode == 1090594823 && str4.equals("release")) {
                        if (obj instanceof android.hardware.Camera) {
                            android.hardware.Camera camera = (android.hardware.Camera) obj;
                            d85.f.a(d85.f.f308685a, 1, 3, camera.getParameters().get("wechat-scene"));
                            camera.release();
                            i27 = camera.hashCode();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CameraHooker", "on camera release " + i27);
                        return null;
                    }
                } else if (str4.equals("open")) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "()Landroid/hardware/Camera;")) {
                        if (k85.t.b(k85.t.f386972a, str4, null, 2, null)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CameraHooker", "openCamera return");
                            d85.f.b(d85.f.f308685a, "openCameraHook", new java.lang.Throwable(), "3", "return");
                            return null;
                        }
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CameraHooker", "on camera open");
                            android.hardware.Camera open = android.hardware.Camera.open();
                            d85.f fVar2 = d85.f.f308685a;
                            d85.f.b(fVar2, "openCameraHook", new java.lang.Throwable(), "1");
                            d85.f.a(fVar2, 1, 1, open.getParameters().get("wechat-scene"));
                            return open;
                        } catch (java.lang.Throwable th6) {
                            d85.f fVar3 = d85.f.f308685a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CameraHooker", th6, "openCamera failed", new java.lang.Object[0]);
                            d85.f.b(d85.f.f308685a, "openCameraHook", th6, "2", th6.getMessage());
                            uo.n.f511055a.e(th6);
                            throw th6;
                        }
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "(I)Landroid/hardware/Camera;")) {
                        if (k85.t.b(k85.t.f386972a, str4, null, 2, null)) {
                            d85.f.b(d85.f.f308685a, "openCameraIdHook", new java.lang.Throwable(), "3", "return");
                            return null;
                        }
                        if (objArr2 != null) {
                            if (!(!(objArr2.length == 0))) {
                                objArr2 = null;
                            }
                            if (objArr2 != null) {
                                if (!(objArr2[0] instanceof java.lang.Integer)) {
                                    objArr2 = null;
                                }
                                if (objArr2 != null) {
                                    java.lang.Object obj3 = objArr2[0];
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                                    int intValue = ((java.lang.Integer) obj3).intValue();
                                    try {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CameraHooker", "on camera open: " + intValue);
                                        android.hardware.Camera open2 = android.hardware.Camera.open(intValue);
                                        d85.f fVar4 = d85.f.f308685a;
                                        d85.f.b(fVar4, "openCameraIdHook", new java.lang.Throwable(), "1", "", "id-" + intValue);
                                        d85.f.a(fVar4, 1, 1, open2.getParameters().get("wechat-scene"));
                                        return open2;
                                    } catch (java.lang.Throwable th7) {
                                        d85.f fVar5 = d85.f.f308685a;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CameraHooker", th7, "openCameraId failed, id = " + intValue, new java.lang.Object[0]);
                                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                                        linkedHashMap.put("permission", java.lang.Boolean.valueOf(j35.u.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.CAMERA")));
                                        linkedHashMap.put("fg", java.lang.Boolean.valueOf(!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()));
                                        linkedHashMap.put("fgResumeDuringMin", java.lang.Long.valueOf(d85.f.f308689e <= 0 ? -1L : (android.os.SystemClock.uptimeMillis() - d85.f.f308689e) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
                                        linkedHashMap.put("fgResumeDuringSec", java.lang.Long.valueOf(d85.f.f308689e <= 0 ? -1L : (android.os.SystemClock.uptimeMillis() - d85.f.f308689e) / 1000));
                                        java.lang.String str6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
                                        linkedHashMap.put("recentScene", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134268q);
                                        linkedHashMap.put("visibleScene", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v);
                                        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                                        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(runningAppProcesses, "getRunningAppProcesses(...)");
                                        java.util.Iterator<T> it = runningAppProcesses.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            java.lang.Object next = it.next();
                                            if (((android.app.ActivityManager.RunningAppProcessInfo) next).pid == android.os.Process.myPid()) {
                                                obj2 = next;
                                                break;
                                            }
                                        }
                                        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (android.app.ActivityManager.RunningAppProcessInfo) obj2;
                                        if (runningAppProcessInfo != null) {
                                            linkedHashMap.put("importance", java.lang.Integer.valueOf(runningAppProcessInfo.importance));
                                        }
                                        d85.f.f308685a.c("openCameraIdHook", th7, linkedHashMap, "2", th7.getMessage(), "id-" + intValue);
                                        uo.n.f511055a.e(th7);
                                        throw th7;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (str4.equals("startPreview")) {
                if (obj instanceof android.hardware.Camera) {
                    android.hardware.Camera camera2 = (android.hardware.Camera) obj;
                    camera2.startPreview();
                    android.hardware.Camera.Size previewSize = camera2.getParameters().getPreviewSize();
                    int i28 = previewSize.width;
                    i18 = previewSize.height;
                    i19 = camera2.getParameters().getPreviewFrameRate();
                    int hashCode2 = camera2.hashCode();
                    d85.f.a(d85.f.f308685a, 1, 2, camera2.getParameters().get("wechat-scene"));
                    i17 = i28;
                    i27 = hashCode2;
                } else {
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CameraHooker", "on camera startPreview " + i27 + ": " + i17 + '-' + i18 + ", fps " + i19);
            }
        }
        return null;
    }
}
