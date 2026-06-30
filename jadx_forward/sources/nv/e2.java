package nv;

/* loaded from: classes11.dex */
public final class e2 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.Long j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "onRecieveMsg");
        if (p0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "onRecieveMsg, addMsgInfo is null, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "onRecieveMsg, content = " + p0Var.f152259a.f459094h);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(x51.j1.g(p0Var.f152259a.f459094h), "sysmsg", null);
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.chatrecordstartexport.DeviceName");
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.chatrecordstartexport.ContactName");
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.chatrecordstartexport.NickName");
        java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.chatrecordstartexport.CreateTime");
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        long a17 = hq.d.a();
        if (str4 == null || (j17 = r26.h0.j(str4)) == null) {
            return;
        }
        long longValue = j17.longValue() * 1000;
        if (a17 - longValue > 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "msg too old, createTimeLong=" + longValue + ", now=" + a17);
            return;
        }
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        java.lang.String str5 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u) {
            android.content.Context m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b == null) {
                m78443x9cf0d20b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            android.content.Context context = m78443x9cf0d20b;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "context is null, return");
                return;
            } else {
                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).mj(context, str, str2, str3, longValue);
                return;
            }
        }
        long j18 = (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8 + a17) - longValue;
        long j19 = j18 <= 60000 ? j18 : 60000L;
        if (j19 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "Invalid time, remainMs=" + j19 + ", now=" + a17 + ", createTime=" + longValue);
            return;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
        intent.putExtra("deviceName", str);
        intent.putExtra("contactName", str2);
        intent.putExtra("nickName", str3);
        intent.putExtra("msgCreateTime", longValue);
        intent.putExtra("nofification_type", "single_migration_to_pc_notification");
        intent.setFlags(268468224);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context2, 0, intent, 201326592);
        z2.k0 k0Var = new z2.k0(context2, n25.a.a());
        k0Var.D.when = longValue;
        k0Var.A = j19;
        k0Var.h(16, true);
        k0Var.f(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp));
        k0Var.e(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9u));
        k0Var.f550999j = 1;
        k0Var.f551008s = "event";
        k0Var.g(-1);
        k0Var.f550996g = activity;
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        android.app.Notification b17 = k0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).m(b17, true);
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "onDeleteMsg");
    }
}
