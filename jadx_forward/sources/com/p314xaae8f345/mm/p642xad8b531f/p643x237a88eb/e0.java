package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public class e0 extends com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.a {

    /* renamed from: a, reason: collision with root package name */
    public qm.z f145011a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f145012b;

    public e0() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f145012b = context;
        this.f145011a = new qm.z(context);
    }

    public static java.util.ArrayList c() {
        try {
            java.util.ArrayList arrayList = (java.util.ArrayList) pm.h.a(((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j()).getString("com.tencent.preference.notification.key.unread.talker", ""));
            return arrayList == null ? new java.util.ArrayList() : arrayList;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.AppMsg.Handle", e17, "", new java.lang.Object[0]);
            return new java.util.ArrayList();
        } catch (java.lang.ClassNotFoundException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.AppMsg.Handle", e18, "", new java.lang.Object[0]);
            return new java.util.ArrayList();
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.AppMsg.Handle", e19, "Justin_Exception:%s", e19.getMessage());
            return new java.util.ArrayList();
        }
    }

    public static com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0 d(java.util.List list, java.lang.String str) {
        if (list != null && str != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0 d0Var = (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0) it.next();
                if (d0Var.f145009d.equals(str)) {
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
        java.lang.String string = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j()).getString("com.tencent.preference.notification.key.all.notified.msgid", "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append("%");
        return string.contains(sb6.toString());
    }

    public static void g(int i17) {
        int max = java.lang.Math.max(0, i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
        o4Var.getClass();
        o4Var.putInt("com.tencent.preference.notification.key.unread.msg", max).apply();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.AppMsg.Handle", "saveTotalUnreadMsg %d", java.lang.Integer.valueOf(max));
    }

    public static void h(java.util.ArrayList arrayList) {
        int i17 = 0;
        if (arrayList == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
            o4Var.getClass();
            o4Var.putString("com.tencent.preference.notification.key.unread.talker", "").apply();
        } else {
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
                o4Var2.getClass();
                o4Var2.putString("com.tencent.preference.notification.key.unread.talker", pm.h.b(arrayList2)).apply();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.AppMsg.Handle", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
                o4Var3.getClass();
                o4Var3.putString("com.tencent.preference.notification.key.unread.talker", "").apply();
            }
        }
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.AppMsg.Handle", "print2log talkerList=null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(240);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || i17 >= 10) {
                break;
            }
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0 d0Var = (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.d0) arrayList.get(size);
            if (d0Var.f145010e > 0) {
                sb6.append(d0Var.f145009d);
                sb6.append('(');
                sb6.append(d0Var.f145010e);
                sb6.append("), ");
                i17++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.AppMsg.Handle", "print2log, totalSize = %d, talkerList = %s", java.lang.Integer.valueOf(arrayList.size()), sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.a
    public int a(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe c10313x2dcd4ebe, qm.z zVar) {
        boolean z17;
        android.app.Notification notification;
        int i17;
        boolean z18;
        android.content.Context context = this.f145012b;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.q1 q1Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.q1) com.p314xaae8f345.mm.sdk.p2603x2137b148.s1.f274499a;
        q1Var.getClass();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                    java.lang.reflect.Field field = q1Var.f274473a;
                    if (field != null) {
                        try {
                            i17 = field.getInt(runningAppProcessInfo);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GreenManUtil", "isAppForeground processState %s", java.lang.Integer.valueOf(i17));
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GreenManUtil", th6, "", new java.lang.Object[0]);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.AppMsg.Handle", "GreenManUtil.isAppVisibleForeground");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else if (c10313x2dcd4ebe != null && (notification = c10313x2dcd4ebe.f144993f) != null) {
            notification.priority = 1;
            if (!fp.h.c(26)) {
                android.app.Notification notification2 = c10313x2dcd4ebe.f144993f;
                notification2.vibrate = new long[0];
                if (!zVar.f446212m && !zVar.f446211l) {
                    notification2.priority = 0;
                }
            }
        }
        return super.a(c10313x2dcd4ebe, zVar);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.e0.b(om.a):android.app.Notification");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.e0.f(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, r45.j4):void");
    }
}
