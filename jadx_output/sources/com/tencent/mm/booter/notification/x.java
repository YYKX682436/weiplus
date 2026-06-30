package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public class x implements c01.v8, c01.m8 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f63515a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f63516b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f63517c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f63518d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63519e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f63520f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f63521g;

    /* renamed from: h, reason: collision with root package name */
    public long f63522h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f63523i;

    /* renamed from: k, reason: collision with root package name */
    public final qm.e f63525k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f63527m;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.booter.notification.m0 f63524j = com.tencent.mm.booter.notification.l0.f63501a;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f63526l = new com.tencent.mm.booter.notification.w(this, android.os.Looper.getMainLooper());

    public x(android.content.Context context) {
        this.f63523i = null;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent>(a0Var) { // from class: com.tencent.mm.booter.notification.MMNotification$2
            {
                this.__eventId = 675629679;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent) {
                com.tencent.mm.storage.f9 f9Var;
                com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent2 = revokeMsgEvent;
                if (revokeMsgEvent2 == null || (f9Var = revokeMsgEvent2.f54713g.f6396c) == null) {
                    return false;
                }
                com.tencent.mm.booter.notification.x xVar = com.tencent.mm.booter.notification.x.this;
                xVar.getClass();
                if (f9Var.A0() == 1 || f9Var.V2()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMNotification", "notifyRevorkMessage is sender:%s, isSelfLocalRevoke:%s msgid:%d", java.lang.Integer.valueOf(f9Var.A0()), java.lang.Boolean.valueOf(f9Var.V2()), java.lang.Long.valueOf(f9Var.I0()));
                    return false;
                }
                int o17 = com.tencent.mm.booter.notification.x.o(f9Var);
                java.lang.String j17 = f9Var.j();
                int type = f9Var.getType();
                if (!xVar.f63524j.b(f9Var.Q0(), f9Var, o17, true)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMNotification", "[no notificaion], preNotificationCheck");
                    return false;
                }
                xVar.f63518d = f9Var;
                java.lang.String Q0 = f9Var.Q0();
                xVar.f63515a = Q0;
                xVar.f63519e = "";
                com.tencent.mars.xlog.Log.i("MicroMsg.MMNotification", "notifyRevorkMessage talker:%s msgid:%d type:%d tipsFlag:%d content:%s", Q0, java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(o17), com.tencent.mm.sdk.platformtools.t8.G1(j17));
                xVar.f63526l.sendMessageDelayed(xVar.p(xVar.f63515a, j17, type, o17, 1), 200L);
                return false;
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SendMsgFailNotificationEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SendMsgFailNotificationEvent>(a0Var) { // from class: com.tencent.mm.booter.notification.MMNotification$3
            {
                this.__eventId = 1082806728;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SendMsgFailNotificationEvent sendMsgFailNotificationEvent) {
                com.tencent.mm.autogen.events.SendMsgFailNotificationEvent sendMsgFailNotificationEvent2 = sendMsgFailNotificationEvent;
                if (sendMsgFailNotificationEvent2 != null) {
                    sendMsgFailNotificationEvent2.f54754g.getClass();
                    com.tencent.mm.booter.notification.x xVar = com.tencent.mm.booter.notification.x.this;
                    android.content.Context context2 = xVar.f63523i;
                    try {
                        com.tencent.mars.xlog.Log.w("showSendMsgFailNotification fromUserName:%s msgType:%d", null, 0);
                        if (!com.tencent.mm.ui.chatting.ChattingUI.class.getName().equals(((android.app.ActivityManager) context2.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1).get(0).topActivity.getClassName())) {
                            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
                            intent.putExtra("nofification_type", "pushcontent_notification");
                            intent.putExtra("Intro_Is_Muti_Talker", true);
                            intent.putExtra("Chat_User", (java.lang.String) null);
                            intent.putExtra("MainUI_User_Last_Msg_Type", 0);
                            intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                            intent.addFlags(67108864);
                            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context2, 35, intent, fp.g0.a(1073741824));
                            z2.k0 k0Var = new z2.k0(context2, n25.a.b());
                            k0Var.m(null);
                            k0Var.D.when = java.lang.System.currentTimeMillis();
                            k0Var.f(context2.getString(com.tencent.mm.R.string.f490531xr));
                            k0Var.e(context2.getString(com.tencent.mm.R.string.gv9));
                            k0Var.f469463g = activity;
                            android.app.Notification b17 = k0Var.b();
                            b17.icon = com.tencent.mm.R.drawable.c7v;
                            b17.defaults |= 1;
                            b17.flags |= 16;
                            xVar.n(35, b17, true);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMNotification", e17, "", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        };
        this.f63527m = false;
        this.f63523i = context;
        this.f63515a = "";
        this.f63519e = "";
        this.f63516b = "";
        this.f63522h = 0L;
        this.f63521g = false;
        this.f63525k = new qm.e();
        java.util.List list = mo3.l.f330419d;
        synchronized (list) {
            if (!((java.util.ArrayList) list).contains(this)) {
                ((java.util.ArrayList) list).add(this);
            }
        }
        if (w21.k.f442399t == null) {
            w21.k.f442399t = this;
        }
        ct1.c.f222220g = this;
        ig0.o oVar = (ig0.o) ((dg0.f) i95.n0.c(dg0.f.class));
        oVar.getClass();
        oVar.f291333m = new java.lang.ref.WeakReference(this);
        iListener2.alive();
        iListener.alive();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04ca  */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.tencent.mm.booter.notification.x r22, java.lang.String r23, java.lang.String r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.notification.x.d(com.tencent.mm.booter.notification.x, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public static int o(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.storage.z3 n17;
        java.util.Map d17;
        int i17 = c01.e2.G(f9Var.Q0()) ? 0 : 3;
        java.lang.String Q0 = f9Var.Q0();
        if ((com.tencent.mm.sdk.platformtools.t8.K0(Q0) || (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Q0, true)) == null) ? false : n17.l2()) {
            return 0;
        }
        int i18 = com.tencent.mm.storage.z3.r4(f9Var.Q0()) ? 3 : i17;
        if (f9Var.t0() != -1 && r01.z.g(f9Var.Q0())) {
            s01.h z07 = r01.q3.Ui().z0(f9Var.t0());
            if (!z07.y0() && z07.t0(1)) {
                return i18;
            }
        }
        java.lang.String str = f9Var.G;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msgsource", null)) != null && !d17.isEmpty()) {
            try {
                int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.tips"), i18);
                if ((P & 1) != 0 || (P & 2) == 0) {
                    return P;
                }
                return 0;
            } catch (java.lang.Exception unused) {
            }
        }
        return i18;
    }

    @Override // c01.v8
    public void a(com.tencent.mm.storage.f9 f9Var) {
        mm.w.e("notifyFirstNotification");
        if (f9Var == null) {
            return;
        }
        if (f9Var.A0() == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMNotification", "notifyFirst is sender , msgid:%d ", java.lang.Long.valueOf(f9Var.I0()));
            mm.w.f("isSender");
            return;
        }
        c01.ea w17 = c01.w9.w(f9Var.G);
        if (w17 != null && w17.f37151j == 1) {
            mm.w.f("isLbs");
            return;
        }
        int o17 = o(f9Var);
        this.f63518d = f9Var;
        this.f63515a = f9Var.Q0();
        java.lang.String j17 = f9Var.j();
        int type = f9Var.getType();
        this.f63519e = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNotification", "notifyFirst talker:%s msgid:%d type:%d tipsFlag:%d content:%s", this.f63515a, java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(o17), com.tencent.mm.sdk.platformtools.t8.G1(j17));
        if (!this.f63524j.b(this.f63515a, this.f63518d, o17, false)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMNotification", "[no notificaion], preNotificationCheck");
        } else {
            mm.w.e("notifyMessage");
            this.f63526l.sendMessageDelayed(p(this.f63515a, j17, type, o17, 0), 200L);
        }
    }

    @Override // c01.v8
    public void b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle) {
        android.text.format.Time time = new android.text.format.Time();
        time.setToNow();
        if (ip.b.q(time.hour, time.minute, com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            try {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                boolean i18 = ip.b.i();
                boolean b17 = ip.b.b();
                if (i18) {
                    com.tencent.mars.xlog.Log.i("MiroMsg.NotificationUtil", "notification.shake:  notifyEngageRemind isShake~: true");
                    com.tencent.mm.sdk.platformtools.t8.L1(context, true);
                }
                if (b17) {
                    android.util.Pair i19 = ip.l.i();
                    x51.z0.a(context, (java.lang.String) i19.second, ((java.lang.Boolean) i19.first).booleanValue());
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MiroMsg.NotificationUtil", e17, "", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MiroMsg.NotificationUtil", "no shake & sound notification during background deactive time");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", str3);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.setFlags(872415232);
        if (str4 != null && bundle != null) {
            intent.putExtra("bizofstartfrom", str4);
            intent.putExtra("startwebviewparams", bundle);
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(null);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(str);
        k0Var.e(str2);
        k0Var.f469463g = activity;
        android.app.Notification b18 = k0Var.b();
        b18.icon = com.tencent.mm.R.drawable.c7v;
        b18.flags |= 16;
        ((android.app.NotificationManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification")).notify(i17, b18);
    }

    @Override // c01.v8
    public void c(java.util.List list) {
        int i17;
        com.tencent.mm.storage.f9 f9Var;
        if (list == null || list.size() <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(list == null ? -1 : list.size());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[1] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.w("MicroMsg.MMNotification", "notifyOther newMsgList:%d :%s", objArr);
            return;
        }
        int size = list.size() - 1;
        int i18 = 0;
        while (true) {
            if (size < 0) {
                i17 = i18;
                f9Var = null;
                break;
            }
            f9Var = (com.tencent.mm.storage.f9) list.get(size);
            int o17 = o(f9Var);
            if (this.f63524j.b(f9Var.Q0(), f9Var, o17, false)) {
                i17 = o17;
                break;
            } else {
                size--;
                i18 = o17;
            }
        }
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMNotification", "notifyOther msg == null");
            return;
        }
        this.f63519e = "";
        this.f63515a = f9Var.Q0();
        java.lang.String j17 = f9Var.j();
        int type = f9Var.getType();
        this.f63518d = f9Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNotification", "notifyOther talker:%s msgid:%d type:%d tipsFlag:%d content:%s", this.f63515a, java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(i17), com.tencent.mm.sdk.platformtools.t8.G1(j17));
        this.f63526l.sendMessageDelayed(p(this.f63515a, j17, type, i17, 0), 200L);
    }

    public final void e() {
        this.f63521g = false;
        this.f63524j.f63504a.b();
    }

    public void f(int i17) {
        com.tencent.mm.booter.notification.l0.f63501a.f63504a.getClass();
        pm.g gVar = pm.f.f356752a;
        gVar.getClass();
        gVar.d(new z2.n1(com.tencent.mm.sdk.platformtools.x2.f193071a), i17);
    }

    public void g() {
        try {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("notify_newfriend_prep", 0).getString("notify_newfriend_prep", null);
            if (string != null) {
                for (java.lang.String str : string.split(",")) {
                    int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
                    if (D1 > 0) {
                        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(D1);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMNotification", e17, "try cancel notification fail: %s", e17.getMessage());
        }
    }

    @Override // c01.v8
    public android.os.Looper getLooper() {
        return android.os.Looper.getMainLooper();
    }

    public void h(java.lang.String str) {
        if (this.f63521g) {
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
            if (p17 != null && p17.d1() != 0) {
                e();
            } else if (com.tencent.mm.ui.conversation.w3.f208214g.c() == 0) {
                e();
            }
        }
    }

    public void i() {
        com.tencent.mm.booter.notification.l0.f63501a.f63504a.getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
        o4Var.getClass();
        o4Var.putString("com.tencent.preference.notification.key.all.notified.msgid", "");
    }

    public android.app.Notification j(android.app.Notification notification, int i17, int i18, android.app.PendingIntent pendingIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, java.lang.String str4) {
        com.tencent.mm.booter.notification.i0 i0Var = com.tencent.mm.booter.notification.l0.f63501a.f63504a;
        i0Var.getClass();
        om.a aVar = new om.a();
        aVar.f346242a = notification;
        aVar.f346243b = i17;
        aVar.f346244c = i18;
        aVar.f346245d = pendingIntent;
        aVar.f346246e = str;
        aVar.f346247f = str2;
        aVar.f346248g = str3;
        aVar.f346249h = bitmap;
        aVar.f346256o = str4;
        return i0Var.f63499a.b(aVar);
    }

    public void k(boolean z17) {
        this.f63520f = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNotification", "set hideNotification: %s", java.lang.Boolean.valueOf(z17));
    }

    public int l(android.app.Notification notification) {
        qm.b bVar = new qm.b();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        qm.e eVar = new qm.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean i17 = qm.e.i(sb6);
        if (i17 && ((i17 = i17 & (!eVar.h("", sb6)))) && ((i17 = i17 & eVar.f(3, sb6))) && ((i17 = i17 & (!eVar.l(false, 0L, sb6)))) && ((i17 = i17 & (!eVar.b("", sb6)))) && ((i17 = i17 & (!eVar.c("", null, sb6)))) && ((i17 = i17 & eVar.k(0, "", sb6)))) {
            i17 = (!eVar.j()) & i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "[isNeedSound] conditions check detail: %s", sb6.toString());
        qm.e eVar2 = new qm.e();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        boolean g17 = qm.e.g(sb7);
        if (g17 && ((g17 = g17 & (!eVar2.h("", sb7))))) {
            boolean e17 = eVar2.e(3, sb7) & g17;
            if (e17) {
                boolean z17 = (!eVar2.l(false, 0L, sb7)) & e17;
                if (z17) {
                    boolean z18 = (!eVar2.c("", null, sb7)) & z17;
                    g17 = !z18 ? z18 : (!eVar2.j()) & z18;
                } else {
                    g17 = z17;
                }
            } else {
                g17 = e17;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "[isNeedShake] conditions check detail: %s", sb7.toString());
        bVar.a(context, i17, g17, notification, "");
        return bVar.f364622a;
    }

    public int m(android.app.Notification notification, boolean z17) {
        com.tencent.mm.booter.notification.m0 m0Var = com.tencent.mm.booter.notification.l0.f63501a;
        return m0Var.f63504a.a(new com.tencent.mm.booter.notification.NotificationItem(-1, notification, z17), null);
    }

    public void n(int i17, android.app.Notification notification, boolean z17) {
        com.tencent.mm.booter.notification.m0 m0Var = com.tencent.mm.booter.notification.l0.f63501a;
        m0Var.f63504a.a(new com.tencent.mm.booter.notification.NotificationItem(i17, notification, z17), null);
    }

    public final android.os.Message p(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        android.os.Message obtain = android.os.Message.obtain();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("notification.show.talker", str);
        bundle.putString("notification.show.message.content", str2);
        bundle.putInt("notification.show.message.type", i17);
        bundle.putInt("notification.show.tipsflag", i18);
        obtain.setData(bundle);
        obtain.what = i19;
        return obtain;
    }
}
