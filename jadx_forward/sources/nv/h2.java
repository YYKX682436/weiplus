package nv;

/* loaded from: classes9.dex */
public class h2 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore.BackupToPc", "sysMsgListener onreceive sysmsg");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 0L, 1L, false);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(x51.j1.g(p0Var.f152259a.f459094h), "sysmsg", null);
        if (c01.id.a() - (p0Var.f152259a.f459098o * 1000) > 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupCore.BackupToPc", "notify delaytime > 1min ignore");
            return;
        }
        final java.lang.String url = (java.lang.String) d17.get(".sysmsg.MMBakChatNotify.url");
        final java.lang.String str = (java.lang.String) d17.get(".sysmsg.MMBakChatNotify.pcdevicetype");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupCore.BackupToPc", "MMBakChatNotify url is null");
            return;
        }
        xn1.c.a("Type", 1);
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: nv.h2$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                final nv.h2 h2Var = nv.h2.this;
                final java.lang.String str2 = url;
                final java.lang.String str3 = str;
                sn1.j jVar = (sn1.j) obj;
                h2Var.getClass();
                final bw5.s10 s10Var = (bw5.s10) jVar.f491564a;
                int i17 = jVar.f491565b;
                if (i17 == 0 && jVar.f491566c == 0 && s10Var != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: nv.h2$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            android.content.Intent intent;
                            nv.h2.this.getClass();
                            bw5.s10 s10Var2 = s10Var;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore.BackupToPc", "[onRecieveMsg] Scene=%d", java.lang.Integer.valueOf(s10Var2.f114293r));
                            int i18 = s10Var2.f114293r;
                            if (i18 == 100 || i18 == 101 || i18 == 102) {
                                android.content.Context m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
                                if (m78443x9cf0d20b == null) {
                                    m78443x9cf0d20b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                }
                                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).bj(m78443x9cf0d20b, s10Var2, mv.a.f413007m);
                                return;
                            }
                            android.content.Intent intent2 = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1253x3112b486.C12833x7b210580.class);
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent2, 0);
                            if (queryIntentServices == null || queryIntentServices.size() != 1) {
                                intent = null;
                            } else {
                                android.content.pm.ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                android.content.ComponentName componentName = new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
                                intent = new android.content.Intent(intent2);
                                intent.setComponent(componentName);
                            }
                            if (intent != null) {
                                intent2 = intent;
                            }
                            j45.l.A(intent2.putExtra("url", str2).putExtra("isFromWifi", true).putExtra("deviceName", str3));
                        }
                    });
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupCore.BackupToPc", "getConnectInfoAsync fail, errType:%s, errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jVar.f491566c));
                final bw5.zi0 zi0Var = (jVar.f491565b != 4 || jVar.f491566c == 0) ? bw5.zi0.ERROR_CODE_NETWORK_DISCONNECT : bw5.zi0.ERROR_CODE_ACCOUNT_MISMATCH;
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: nv.h2$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
                        if (m78443x9cf0d20b == null) {
                            m78443x9cf0d20b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        }
                        mv.w wVar = (mv.w) i95.n0.c(mv.w.class);
                        ((yn1.h4) wVar).ij(m78443x9cf0d20b, bw5.zi0.this, mv.a.f413007m);
                    }
                });
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

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
