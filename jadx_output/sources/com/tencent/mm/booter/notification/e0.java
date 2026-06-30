package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public class e0 extends com.tencent.mm.booter.notification.a {

    /* renamed from: a, reason: collision with root package name */
    public qm.z f63478a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f63479b;

    public e0() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f63479b = context;
        this.f63478a = new qm.z(context);
    }

    public static java.util.ArrayList c() {
        try {
            java.util.ArrayList arrayList = (java.util.ArrayList) pm.h.a(((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j()).getString("com.tencent.preference.notification.key.unread.talker", ""));
            return arrayList == null ? new java.util.ArrayList() : arrayList;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", e17, "", new java.lang.Object[0]);
            return new java.util.ArrayList();
        } catch (java.lang.ClassNotFoundException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", e18, "", new java.lang.Object[0]);
            return new java.util.ArrayList();
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", e19, "Justin_Exception:%s", e19.getMessage());
            return new java.util.ArrayList();
        }
    }

    public static com.tencent.mm.booter.notification.d0 d(java.util.List list, java.lang.String str) {
        if (list != null && str != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.booter.notification.d0 d0Var = (com.tencent.mm.booter.notification.d0) it.next();
                if (d0Var.f63476d.equals(str)) {
                    return d0Var;
                }
            }
        }
        return null;
    }

    public static boolean e(long j17) {
        if (j17 == 0) {
            return false;
        }
        java.lang.String string = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j()).getString("com.tencent.preference.notification.key.all.notified.msgid", "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append("%");
        return string.contains(sb6.toString());
    }

    public static void g(int i17) {
        int max = java.lang.Math.max(0, i17);
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
        o4Var.getClass();
        o4Var.putInt("com.tencent.preference.notification.key.unread.msg", max).apply();
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.AppMsg.Handle", "saveTotalUnreadMsg %d", java.lang.Integer.valueOf(max));
    }

    public static void h(java.util.ArrayList arrayList) {
        int i17 = 0;
        if (arrayList == null) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
            o4Var.getClass();
            o4Var.putString("com.tencent.preference.notification.key.unread.talker", "").apply();
        } else {
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
                com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
                o4Var2.getClass();
                o4Var2.putString("com.tencent.preference.notification.key.unread.talker", pm.h.b(arrayList2)).apply();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", e17, "", new java.lang.Object[0]);
                com.tencent.mm.sdk.platformtools.o4 o4Var3 = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
                o4Var3.getClass();
                o4Var3.putString("com.tencent.preference.notification.key.unread.talker", "").apply();
            }
        }
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.AppMsg.Handle", "print2log talkerList=null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(240);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || i17 >= 10) {
                break;
            }
            com.tencent.mm.booter.notification.d0 d0Var = (com.tencent.mm.booter.notification.d0) arrayList.get(size);
            if (d0Var.f63477e > 0) {
                sb6.append(d0Var.f63476d);
                sb6.append('(');
                sb6.append(d0Var.f63477e);
                sb6.append("), ");
                i17++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.AppMsg.Handle", "print2log, totalSize = %d, talkerList = %s", java.lang.Integer.valueOf(arrayList.size()), sb6.toString());
    }

    @Override // com.tencent.mm.booter.notification.a
    public int a(com.tencent.mm.booter.notification.NotificationItem notificationItem, qm.z zVar) {
        boolean z17;
        android.app.Notification notification;
        int i17;
        boolean z18;
        android.content.Context context = this.f63479b;
        com.tencent.mm.sdk.platformtools.q1 q1Var = (com.tencent.mm.sdk.platformtools.q1) com.tencent.mm.sdk.platformtools.s1.f192966a;
        q1Var.getClass();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                    java.lang.reflect.Field field = q1Var.f192940a;
                    if (field != null) {
                        try {
                            i17 = field.getInt(runningAppProcessInfo);
                            com.tencent.mars.xlog.Log.i("MicroMsg.GreenManUtil", "isAppForeground processState %s", java.lang.Integer.valueOf(i17));
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GreenManUtil", th6, "", new java.lang.Object[0]);
                        }
                        if (i17 <= 2) {
                            z17 = true;
                            break;
                        }
                        z18 = false;
                        if (z18 && runningAppProcessInfo.importance == 100) {
                            z17 = true;
                            break;
                        }
                    }
                    z18 = true;
                    if (z18) {
                        z17 = true;
                        break;
                    }
                    continue;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.AppMsg.Handle", "GreenManUtil.isAppVisibleForeground");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else if (notificationItem != null && (notification = notificationItem.f63460f) != null) {
            notification.priority = 1;
            if (!fp.h.c(26)) {
                android.app.Notification notification2 = notificationItem.f63460f;
                notification2.vibrate = new long[0];
                if (!zVar.f364679m && !zVar.f364678l) {
                    notification2.priority = 0;
                }
            }
        }
        return super.a(notificationItem, zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Notification b(om.a r17) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.notification.e0.b(om.a):android.app.Notification");
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x05e0, code lost:
    
        if (r1 == null) goto L283;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x051e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0474 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(long r38, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.Map r44, r45.j4 r45) {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.notification.e0.f(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, r45.j4):void");
    }
}
