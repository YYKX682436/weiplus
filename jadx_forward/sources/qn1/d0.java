package qn1;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446516e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1253x3112b486.C12833x7b210580 c12833x7b210580, java.lang.String str, java.lang.String str2) {
        this.f446515d = str;
        this.f446516e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        final qn1.d j17 = qn1.c.i().j();
        j17.f446508o = true;
        java.lang.String url = this.f446515d;
        java.lang.String str = this.f446516e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupPcProcessMgr", "~~~~~~~~~~~~  start by url:%s, deviceName:%s", url, str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String lowerCase = str.toLowerCase();
            if (lowerCase.contains("window")) {
                xn1.c.b("PairDevice", 1);
            } else if (lowerCase.contains(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb)) {
                xn1.c.b("PairDevice", 2);
            } else if (lowerCase.contains(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)) {
                xn1.c.b("PairDevice", 3);
            } else if (lowerCase.contains("ios")) {
                xn1.c.b("PairDevice", 4);
            }
        }
        kn1.f.f391134g = 1;
        sn1.i.T();
        j17.f446507n = ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 0)).intValue();
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: qn1.d$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                java.lang.String str2;
                boolean z17;
                sn1.j jVar = (sn1.j) obj;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                qn1.d dVar = qn1.d.this;
                dVar.f446498e = bool;
                int i17 = jVar.f491565b;
                int i18 = jVar.f491566c;
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: other error[%d,%d,%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), jVar.f491567d);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 111L, 1L, false);
                    if (i17 == 4 && i18 == -2011) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: INVALID URL");
                    }
                    qn1.c.i().e().f391142a = -5;
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    qn1.c.i().l().g(-5);
                    return;
                }
                bw5.s10 s10Var = (bw5.s10) jVar.f491564a;
                java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(2, null);
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.equals(s10Var.b())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: not the same account");
                    qn1.c.i().e().f391142a = -5;
                    qn1.c.i().l().g(-5);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 112L, 1L, false);
                    return;
                }
                java.util.LinkedList linkedList = s10Var.f114288m;
                if (linkedList == null || linkedList.isEmpty() || linkedList.getFirst() == null) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = java.lang.Integer.valueOf(s10Var.f114287i);
                    if (linkedList == null) {
                        str2 = "null";
                    } else {
                        str2 = "" + linkedList.size();
                    }
                    objArr[1] = str2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd AddrList is empty! AddrCount[%d], AddrList size[%s]", objArr);
                    qn1.c.i().e().f391142a = -5;
                    qn1.c.i().l().g(-5);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 113L, 1L, false);
                    return;
                }
                boolean[] zArr = s10Var.f114298w;
                boolean z27 = zArr[10];
                if ((z27 ? s10Var.f114290o : "") != null) {
                    dVar.f446498e = java.lang.Boolean.valueOf((z27 ? s10Var.f114290o : "").indexOf("__migrateetargim__") > 0);
                }
                int i19 = s10Var.f114293r;
                if (i19 == 100 || i19 == 101) {
                    dVar.f446498e = java.lang.Boolean.TRUE;
                }
                xn1.b bVar = xn1.b.f536987a;
                if (i19 == 100) {
                    xn1.c.a("Type", 2);
                    bVar.a(2, 1, dVar.f446502i);
                } else if (i19 == 101) {
                    xn1.c.a("Type", 3);
                    bVar.a(3, 1, dVar.f446502i);
                }
                dVar.f446500g = s10Var.f114293r;
                bw5.f4 f4Var = (bw5.f4) linkedList.getFirst();
                java.lang.String m11881x5db1b1d = f4Var.m11881x5db1b1d();
                int intValue = ((java.lang.Integer) f4Var.f108676e.getFirst()).intValue();
                dVar.f446495b = s10Var.c();
                dVar.f446496c = m11881x5db1b1d;
                dVar.f446497d = intValue;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd type:%d, scene:%d, wifiName:%s, ip:%s, port:%d", java.lang.Integer.valueOf(s10Var.f114286h), java.lang.Integer.valueOf(s10Var.f114293r), s10Var.c(), m11881x5db1b1d, java.lang.Integer.valueOf(intValue));
                kn1.f.f391135h = (zArr[3] ? s10Var.f114283e : new r45.cu5()).f453374f.f273689a;
                qn1.c.i().f391137b = zArr[2] ? s10Var.f114282d : "";
                qn1.c.i().f391138c = zArr[4] ? s10Var.f114284f : "";
                qn1.c.i().f391139d = zArr[5] ? s10Var.f114285g : "";
                qn1.c.i().f391141f = (zArr[3] ? s10Var.f114283e : new r45.cu5()).f453374f.f273689a;
                sn1.i.f491550n = 1;
                qn1.c.i().f();
                xn1.c.a("Type", 0);
                sn1.i.f491556t = dVar.f446513t;
                sn1.i.f491548i = dVar.f446510q;
                sn1.i.f491549m = qn1.c.i().h();
                qn1.c.i().e().f391142a = 1;
                if (dVar.f446498e.booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcProcessMgr", new java.lang.Throwable(), "never run here", new java.lang.Object[0]);
                    z17 = false;
                } else {
                    android.content.Intent className = new android.content.Intent().setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.ui.LauncherUI");
                    className.addFlags(335544320);
                    className.putExtra("nofification_type", "back_to_pcmgr_notification");
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(className);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/backuppcmove/BackupPcProcessMgr", "startConnectPc", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcProcessMgr", "startConnectPc", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    qn1.c.i();
                    android.content.SharedPreferences.Editor edit = kn1.f.d().edit();
                    z17 = false;
                    edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
                    edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
                    edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
                    edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
                    edit.commit();
                }
                dVar.f446501h = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "startConnectPc, PC ip:%s, PC wifi:%s, Phone wifi:%s", dVar.f446496c, dVar.f446495b, kn1.k.z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                qn1.d.f446493u = 2;
                dVar.i();
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, null, null, new sn1.v(url, consumer, null), 3, null);
        } else {
            consumer.accept(new sn1.j(null, 3, -1, "No account scope"));
        }
        if (j17.f446499f != 2) {
            sn1.i.f491552p = new sn1.s0(j17.f446511r);
        }
        j17.f446499f = 1;
    }
}
