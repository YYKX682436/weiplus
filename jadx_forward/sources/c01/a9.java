package c01;

/* loaded from: classes11.dex */
public abstract class a9 {
    public static void a(int i17) {
        boolean s17 = ip.b.s();
        boolean t17 = ip.b.t();
        boolean a17 = ip.b.a();
        boolean b17 = ip.b.b();
        boolean i18 = ip.b.i();
        boolean r17 = ip.b.r();
        int i19 = ip.b.v().getInt("settings_active_begin_time_hour", 8);
        int i27 = ip.b.v().getInt("settings_active_begin_time_min", 0);
        int i28 = ip.b.v().getInt("settings_active_end_time_hour", 23);
        int i29 = ip.b.v().getInt("settings_active_end_time_min", 0);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean booleanValue = ((java.lang.Boolean) c17.l(73217, bool)).booleanValue();
        gm0.j1.i();
        boolean booleanValue2 = ((java.lang.Boolean) gm0.j1.u().c().l(73218, bool)).booleanValue();
        boolean z17 = booleanValue || booleanValue2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KvNotificationStat", "doStatNotification, isNewMsgNotification: %s, isNewVoipMsgNotification: %s, isNotificationShowDetail: %s, isNotificationSound: %s, isNotificationShake: %s, isActiveSilentTime: %s, activeBegin: %s, activeEnd: %s, scene: %s, voipSound: %s, voipAudioSound: %s, voipHasSound: %s", java.lang.Boolean.valueOf(s17), java.lang.Boolean.valueOf(t17), java.lang.Boolean.valueOf(a17), java.lang.Boolean.valueOf(b17), java.lang.Boolean.valueOf(i18), java.lang.Boolean.valueOf(r17), c(i19) + c(i27), c(i28) + c(i29), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(booleanValue2), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = java.lang.Integer.valueOf(s17 ? 1 : 2);
        objArr[1] = java.lang.Integer.valueOf(t17 ? 1 : 2);
        objArr[2] = java.lang.Integer.valueOf(a17 ? 1 : 2);
        objArr[3] = java.lang.Integer.valueOf(b17 ? 1 : 2);
        objArr[4] = java.lang.Integer.valueOf(i18 ? 1 : 2);
        objArr[5] = java.lang.Integer.valueOf(r17 ? 2 : 1);
        objArr[6] = c(i28) + c(i29);
        objArr[7] = c(i19) + c(i27);
        objArr[8] = java.lang.Integer.valueOf(i17);
        objArr[9] = java.lang.Integer.valueOf(z17 ? 1 : 2);
        g0Var.d(15308, objArr);
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static void b(boolean z17, boolean z18) {
        boolean s17 = ip.b.s();
        boolean t17 = ip.b.t();
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean booleanValue = ((java.lang.Boolean) c17.l(73217, bool)).booleanValue();
        gm0.j1.i();
        boolean booleanValue2 = ((java.lang.Boolean) gm0.j1.u().c().l(73218, bool)).booleanValue();
        int i17 = 1;
        ?? r76 = (booleanValue || booleanValue2) ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KvNotificationStat", "doStatSysNotificationAfterModify, switchNewMsg: %s, switchVoipInvite: %s, isNewMsgNotification: %s, isNewVoipMsgNotification: %s, voipSound: %s, voipAudioSound: %s, voipHasSound: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(s17), java.lang.Boolean.valueOf(t17), java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(booleanValue2), java.lang.Boolean.valueOf((boolean) r76));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = java.lang.Integer.valueOf(s17 ? 1 : 0);
        objArr[1] = java.lang.Integer.valueOf(t17 ? 1 : 0);
        objArr[2] = java.lang.Integer.valueOf((int) r76);
        objArr[3] = 0;
        objArr[4] = java.lang.Integer.valueOf(z17 ? s17 ? 2 : 1 : 0);
        if (!z18) {
            i17 = 0;
        } else if (t17) {
            i17 = 2;
        }
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = 0;
        objArr[7] = 0;
        g0Var.d(14852, objArr);
    }

    public static java.lang.String c(int i17) {
        if (i17 <= 10) {
            return "0" + i17;
        }
        return i17 + "";
    }
}
