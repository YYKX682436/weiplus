package mn1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411358d;

    public a(mn1.d dVar, java.lang.String str) {
        this.f411358d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        final mn1.e j17 = mn1.d.i().j();
        j17.getClass();
        java.lang.String url = this.f411358d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupMoveRecoverServer", "~~~~~~~~~~~~  start by url:%s", url);
        kn1.q.f391191a = kn1.p.f391188f;
        kn1.q.a(kn1.m.f391166f, kn1.o.f391182e, "scan qr code and get conn info");
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
            c01.w9.a();
        }
        sn1.i.T();
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: mn1.e$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                bw5.f4 f4Var;
                sn1.j jVar = (sn1.j) obj;
                mn1.e eVar = mn1.e.this;
                eVar.getClass();
                kn1.f.f391134g = 22;
                mn1.d.i().e().f391142a = 1;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                android.content.Intent className = new android.content.Intent().setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.ui.LauncherUI");
                className.addFlags(335544320);
                className.putExtra("nofification_type", "backup_move_notification");
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(className);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupmove/BackupMoveRecoverServer", "lambda$doGetConnectInfo$0", "(Lcom/tencent/mm/plugin/backup/backupscene/BackupCgiHelper$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                int i17 = 0;
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/backup/backupmove/BackupMoveRecoverServer", "lambda$doGetConnectInfo$0", "(Lcom/tencent/mm/plugin/backup/backupscene/BackupCgiHelper$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(485L, 41L, 1L, false);
                bw5.s10 s10Var = (bw5.s10) jVar.f491564a;
                java.lang.String str = null;
                int i18 = jVar.f491566c;
                int i19 = jVar.f491565b;
                if (i19 != 0 || i18 != 0) {
                    kn1.m mVar = kn1.m.f391166f;
                    kn1.o oVar = kn1.o.f391184g;
                    kn1.q.a(mVar, oVar, "onGetConnInfo: cgi failed");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnect info other error [%d,%d,%s]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), jVar.f491567d);
                    if (i19 == 4 && i18 == -2011) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnect info: INVALID URL");
                    }
                    java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(2, null);
                    if ((str2 != null ? str2 : "").equals(s10Var.b())) {
                        mn1.d.i().e().f391142a = -5;
                        eVar.a(-5);
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnectinfo not the same account");
                        kn1.q.a(mVar, oVar, "onGetConnInfo: not same account");
                        mn1.d.i().e().f391142a = -14;
                        eVar.a(-14);
                        return;
                    }
                }
                java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(2, null);
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.equals(s10Var.b())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnectinfo not the same account");
                    kn1.q.a(kn1.m.f391166f, kn1.o.f391184g, "onGetConnInfo: not same account");
                    mn1.d.i().e().f391142a = -5;
                    eVar.a(-14);
                    return;
                }
                boolean[] zArr = s10Var.f114298w;
                kn1.f.f391135h = (zArr[3] ? s10Var.f114283e : new r45.cu5()).f453374f.f273689a;
                mn1.d.i().f391137b = zArr[2] ? s10Var.f114282d : "";
                mn1.d.i().f391138c = zArr[4] ? s10Var.f114284f : "";
                mn1.d.i().f391139d = zArr[5] ? s10Var.f114285g : "";
                sn1.i.f491556t = eVar.L;
                mn1.d.i().f();
                sn1.i.f491548i = mn1.d.i().j();
                sn1.i.f491549m = mn1.d.i().h();
                sn1.i.f491550n = 2;
                sn1.i.f491552p = new sn1.s0(eVar.M);
                eVar.A = "";
                mn1.e.O = false;
                mn1.e.P = 2;
                if (s10Var.f114287i > 0) {
                    java.util.LinkedList linkedList = s10Var.f114288m;
                    bw5.f4 f4Var2 = (bw5.f4) linkedList.getFirst();
                    str = f4Var2.m11881x5db1b1d();
                    int intValue = ((java.lang.Integer) f4Var2.f108676e.getFirst()).intValue();
                    eVar.D = s10Var.c();
                    eVar.E = str;
                    eVar.F = intValue;
                    if (linkedList.size() > 1) {
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                        if ((b3.l.m9698x3fed0563(context2, "android.permission.ACCESS_FINE_LOCATION") == 0) && (f4Var = (bw5.f4) linkedList.get(1)) != null && f4Var.m11881x5db1b1d().contains("$")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "start WifiDirect deviceName:" + f4Var.m11881x5db1b1d());
                            int lastIndexOf = f4Var.m11881x5db1b1d().lastIndexOf("$");
                            eVar.A = f4Var.m11881x5db1b1d().substring(0, lastIndexOf);
                            str = f4Var.m11881x5db1b1d().substring(lastIndexOf);
                            i17 = ((java.lang.Integer) f4Var.f108676e.getFirst()).intValue();
                        }
                    }
                    i17 = intValue;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd address convMsgCount is empty");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getconnetinfo, type:%d, scene:%d, wifiName:%s, ip:%s, port:%d, wifiDeviceName:%s", java.lang.Integer.valueOf(s10Var.f114286h), java.lang.Integer.valueOf(s10Var.f114293r), s10Var.c(), str, java.lang.Integer.valueOf(i17), eVar.A);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.A)) {
                    kn1.q.a(kn1.m.f391166f, kn1.o.f391183f, "onGetConnInfo: start client service");
                    eVar.l(str, i17);
                }
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, null, null, new sn1.v(url, consumer, null), 3, null);
        } else {
            consumer.accept(new sn1.j(null, 3, -1, "No account scope"));
        }
    }
}
