package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public class x implements c01.v8, c01.m8 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f145048a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f145049b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f145050c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f145051d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145052e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f145053f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f145054g;

    /* renamed from: h, reason: collision with root package name */
    public long f145055h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f145056i;

    /* renamed from: k, reason: collision with root package name */
    public final qm.e f145058k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f145060m;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.m0 f145057j = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f145059l = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.w(this, android.os.Looper.getMainLooper());

    public x(android.content.Context context) {
        this.f145056i = null;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f>(a0Var) { // from class: com.tencent.mm.booter.notification.MMNotification$2
            {
                this.f39173x3fe91575 = 675629679;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f c5945xdd67bc5f) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f c5945xdd67bc5f2 = c5945xdd67bc5f;
                if (c5945xdd67bc5f2 == null || (f9Var = c5945xdd67bc5f2.f136246g.f87929c) == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x xVar = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x.this;
                xVar.getClass();
                if (f9Var.A0() == 1 || f9Var.V2()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMNotification", "notifyRevorkMessage is sender:%s, isSelfLocalRevoke:%s msgid:%d", java.lang.Integer.valueOf(f9Var.A0()), java.lang.Boolean.valueOf(f9Var.V2()), java.lang.Long.valueOf(f9Var.I0()));
                    return false;
                }
                int o17 = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x.o(f9Var);
                java.lang.String j17 = f9Var.j();
                int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
                if (!xVar.f145057j.b(f9Var.Q0(), f9Var, o17, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMNotification", "[no notificaion], preNotificationCheck");
                    return false;
                }
                xVar.f145051d = f9Var;
                java.lang.String Q0 = f9Var.Q0();
                xVar.f145048a = Q0;
                xVar.f145052e = "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNotification", "notifyRevorkMessage talker:%s msgid:%d type:%d tipsFlag:%d content:%s", Q0, java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(mo78013xfb85f7b0), java.lang.Integer.valueOf(o17), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(j17));
                xVar.f145059l.mo50311x7ab51103(xVar.p(xVar.f145048a, j17, mo78013xfb85f7b0, o17, 1), 200L);
                return false;
            }
        };
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5992x69c69fb8> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5992x69c69fb8>(a0Var) { // from class: com.tencent.mm.booter.notification.MMNotification$3
            {
                this.f39173x3fe91575 = 1082806728;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5992x69c69fb8 c5992x69c69fb8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5992x69c69fb8 c5992x69c69fb82 = c5992x69c69fb8;
                if (c5992x69c69fb82 != null) {
                    c5992x69c69fb82.f136287g.getClass();
                    com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x xVar = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x.this;
                    android.content.Context context2 = xVar.f145056i;
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("showSendMsgFailNotification fromUserName:%s msgType:%d", null, 0);
                        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class.getName().equals(((android.app.ActivityManager) context2.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1).get(0).topActivity.getClassName())) {
                            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
                            intent.putExtra("nofification_type", "pushcontent_notification");
                            intent.putExtra("Intro_Is_Muti_Talker", true);
                            intent.putExtra("Chat_User", (java.lang.String) null);
                            intent.putExtra("MainUI_User_Last_Msg_Type", 0);
                            intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                            intent.addFlags(67108864);
                            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context2, 35, intent, fp.g0.a(1073741824));
                            z2.k0 k0Var = new z2.k0(context2, n25.a.b());
                            k0Var.m(null);
                            k0Var.D.when = java.lang.System.currentTimeMillis();
                            k0Var.f(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572064xr));
                            k0Var.e(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gv9));
                            k0Var.f550996g = activity;
                            android.app.Notification b17 = k0Var.b();
                            b17.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
                            b17.defaults |= 1;
                            b17.flags |= 16;
                            xVar.n(35, b17, true);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMNotification", e17, "", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        };
        this.f145060m = false;
        this.f145056i = context;
        this.f145048a = "";
        this.f145052e = "";
        this.f145049b = "";
        this.f145055h = 0L;
        this.f145054g = false;
        this.f145058k = new qm.e();
        java.util.List list = mo3.l.f411952d;
        synchronized (list) {
            if (!((java.util.ArrayList) list).contains(this)) {
                ((java.util.ArrayList) list).add(this);
            }
        }
        if (w21.k.f523932t == null) {
            w21.k.f523932t = this;
        }
        ct1.c.f303753g = this;
        ig0.o oVar = (ig0.o) ((dg0.f) i95.n0.c(dg0.f.class));
        oVar.getClass();
        oVar.f372866m = new java.lang.ref.WeakReference(this);
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        abstractC20980x9b9ad01d.mo48813x58998cd();
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
    public static void d(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x r22, java.lang.String r23, java.lang.String r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x.d(com.tencent.mm.booter.notification.x, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public static int o(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        java.util.Map d17;
        int i17 = c01.e2.G(f9Var.Q0()) ? 0 : 3;
        java.lang.String Q0 = f9Var.Q0();
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Q0) || (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Q0, true)) == null) ? false : n17.l2()) {
            return 0;
        }
        int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.r4(f9Var.Q0()) ? 3 : i17;
        if (f9Var.t0() != -1 && r01.z.g(f9Var.Q0())) {
            s01.h z07 = r01.q3.Ui().z0(f9Var.t0());
            if (!z07.y0() && z07.t0(1)) {
                return i18;
            }
        }
        java.lang.String str = f9Var.G;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null)) != null && !d17.isEmpty()) {
            try {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.tips"), i18);
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
    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        mm.w.e("notifyFirstNotification");
        if (f9Var == null) {
            return;
        }
        if (f9Var.A0() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMNotification", "notifyFirst is sender , msgid:%d ", java.lang.Long.valueOf(f9Var.I0()));
            mm.w.f("isSender");
            return;
        }
        c01.ea w17 = c01.w9.w(f9Var.G);
        if (w17 != null && w17.f118684j == 1) {
            mm.w.f("isLbs");
            return;
        }
        int o17 = o(f9Var);
        this.f145051d = f9Var;
        this.f145048a = f9Var.Q0();
        java.lang.String j17 = f9Var.j();
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        this.f145052e = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNotification", "notifyFirst talker:%s msgid:%d type:%d tipsFlag:%d content:%s", this.f145048a, java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(mo78013xfb85f7b0), java.lang.Integer.valueOf(o17), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(j17));
        if (!this.f145057j.b(this.f145048a, this.f145051d, o17, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMNotification", "[no notificaion], preNotificationCheck");
        } else {
            mm.w.e("notifyMessage");
            this.f145059l.mo50311x7ab51103(p(this.f145048a, j17, mo78013xfb85f7b0, o17, 0), 200L);
        }
    }

    @Override // c01.v8
    public void b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle) {
        android.text.format.Time time = new android.text.format.Time();
        time.setToNow();
        if (ip.b.q(time.hour, time.minute, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            try {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                boolean i18 = ip.b.i();
                boolean b17 = ip.b.b();
                if (i18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.NotificationUtil", "notification.shake:  notifyEngageRemind isShake~: true");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(context, true);
                }
                if (b17) {
                    android.util.Pair i19 = ip.l.i();
                    x51.z0.a(context, (java.lang.String) i19.second, ((java.lang.Boolean) i19.first).booleanValue());
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MiroMsg.NotificationUtil", e17, "", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.NotificationUtil", "no shake & sound notification during background deactive time");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", str3);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.setFlags(872415232);
        if (str4 != null && bundle != null) {
            intent.putExtra("bizofstartfrom", str4);
            intent.putExtra("startwebviewparams", bundle);
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(null);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(str);
        k0Var.e(str2);
        k0Var.f550996g = activity;
        android.app.Notification b18 = k0Var.b();
        b18.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        b18.flags |= 16;
        ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification")).notify(i17, b18);
    }

    @Override // c01.v8
    public void c(java.util.List list) {
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        if (list == null || list.size() <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(list == null ? -1 : list.size());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[1] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMNotification", "notifyOther newMsgList:%d :%s", objArr);
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
            f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(size);
            int o17 = o(f9Var);
            if (this.f145057j.b(f9Var.Q0(), f9Var, o17, false)) {
                i17 = o17;
                break;
            } else {
                size--;
                i18 = o17;
            }
        }
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMNotification", "notifyOther msg == null");
            return;
        }
        this.f145052e = "";
        this.f145048a = f9Var.Q0();
        java.lang.String j17 = f9Var.j();
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        this.f145051d = f9Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNotification", "notifyOther talker:%s msgid:%d type:%d tipsFlag:%d content:%s", this.f145048a, java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(mo78013xfb85f7b0), java.lang.Integer.valueOf(i17), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(j17));
        this.f145059l.mo50311x7ab51103(p(this.f145048a, j17, mo78013xfb85f7b0, i17, 0), 200L);
    }

    public final void e() {
        this.f145054g = false;
        this.f145057j.f145037a.b();
    }

    public void f(int i17) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.f145037a.getClass();
        pm.g gVar = pm.f.f438285a;
        gVar.getClass();
        gVar.d(new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), i17);
    }

    public void g() {
        try {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("notify_newfriend_prep", 0).getString("notify_newfriend_prep", null);
            if (string != null) {
                for (java.lang.String str : string.split(",")) {
                    int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0);
                    if (D1 > 0) {
                        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(D1);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMNotification", e17, "try cancel notification fail: %s", e17.getMessage());
        }
    }

    @Override // c01.v8
    /* renamed from: getLooper */
    public android.os.Looper mo13945x23b2dd47() {
        return android.os.Looper.getMainLooper();
    }

    public void h(java.lang.String str) {
        if (this.f145054g) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str);
            if (p17 != null && p17.d1() != 0) {
                e();
            } else if (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.f289747g.c() == 0) {
                e();
            }
        }
    }

    public void i() {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.f145037a.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
        o4Var.getClass();
        o4Var.putString("com.tencent.preference.notification.key.all.notified.msgid", "");
    }

    public android.app.Notification j(android.app.Notification notification, int i17, int i18, android.app.PendingIntent pendingIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, java.lang.String str4) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.i0 i0Var = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.f145037a;
        i0Var.getClass();
        om.a aVar = new om.a();
        aVar.f427775a = notification;
        aVar.f427776b = i17;
        aVar.f427777c = i18;
        aVar.f427778d = pendingIntent;
        aVar.f427779e = str;
        aVar.f427780f = str2;
        aVar.f427781g = str3;
        aVar.f427782h = bitmap;
        aVar.f427789o = str4;
        return i0Var.f145032a.b(aVar);
    }

    public void k(boolean z17) {
        this.f145053f = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNotification", "set hideNotification: %s", java.lang.Boolean.valueOf(z17));
    }

    public int l(android.app.Notification notification) {
        qm.b bVar = new qm.b();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        qm.e eVar = new qm.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean i17 = qm.e.i(sb6);
        if (i17 && ((i17 = i17 & (!eVar.h("", sb6)))) && ((i17 = i17 & eVar.f(3, sb6))) && ((i17 = i17 & (!eVar.l(false, 0L, sb6)))) && ((i17 = i17 & (!eVar.b("", sb6)))) && ((i17 = i17 & (!eVar.c("", null, sb6)))) && ((i17 = i17 & eVar.k(0, "", sb6)))) {
            i17 = (!eVar.j()) & i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Silent.Handle", "[isNeedSound] conditions check detail: %s", sb6.toString());
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Silent.Handle", "[isNeedShake] conditions check detail: %s", sb7.toString());
        bVar.a(context, i17, g17, notification, "");
        return bVar.f446155a;
    }

    public int m(android.app.Notification notification, boolean z17) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.m0 m0Var = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a;
        return m0Var.f145037a.a(new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe(-1, notification, z17), null);
    }

    public void n(int i17, android.app.Notification notification, boolean z17) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.m0 m0Var = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a;
        m0Var.f145037a.a(new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe(i17, notification, z17), null);
    }

    public final android.os.Message p(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
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
