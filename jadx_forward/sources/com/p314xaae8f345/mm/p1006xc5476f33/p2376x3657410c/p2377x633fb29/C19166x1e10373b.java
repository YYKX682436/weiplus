package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.p2377x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener */
/* loaded from: classes9.dex */
public class C19166x1e10373b extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e> implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f262588i = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyc) + "?";

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f262589m = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyb) + "?";

    /* renamed from: d, reason: collision with root package name */
    public int f262590d;

    /* renamed from: e, reason: collision with root package name */
    public int f262591e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec f262592f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Queue f262593g;

    /* renamed from: h, reason: collision with root package name */
    public long f262594h;

    public C19166x1e10373b() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f262591e = 0;
        this.f39173x3fe91575 = 520089918;
    }

    public final void c(int i17, int i18, long j17) {
        int i19 = this.f262590d == 1 ? 163 : 132;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(i19);
        c4582x424c344.m40332x57b2b64f(1L);
        c4582x424c344.m40331x936762bd(26);
        arrayList.add(c4582x424c344);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(i19);
            c4582x424c3442.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3443.m40330x4c144dd(i19);
            c4582x424c3443.m40332x57b2b64f(1L);
            c4582x424c3442.m40331x936762bd(8);
            if (i18 < 0) {
                c4582x424c3443.m40331x936762bd(9);
            } else if (i18 > 0) {
                c4582x424c3443.m40331x936762bd(10);
            }
        }
        if (this.f262590d == 4 && j17 > 0) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3444.m40330x4c144dd(i19);
            c4582x424c3444.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3445 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3445.m40330x4c144dd(i19);
            c4582x424c3445.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3446 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3446.m40330x4c144dd(i19);
            c4582x424c3446.m40332x57b2b64f((int) j17);
            c4582x424c3444.m40331x936762bd(0);
            if (j17 <= 1000) {
                c4582x424c3445.m40331x936762bd(1);
                c4582x424c3446.m40331x936762bd(4);
            } else if (j17 > 1000 && j17 <= 3000) {
                c4582x424c3445.m40331x936762bd(2);
                c4582x424c3446.m40331x936762bd(5);
            } else if (j17 > 3000) {
                c4582x424c3445.m40331x936762bd(3);
                c4582x424c3446.m40331x936762bd(6);
            }
            arrayList.add(c4582x424c3444);
            arrayList.add(c4582x424c3445);
            arrayList.add(c4582x424c3446);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
        boolean z17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e2 = c6249x2aa12f2e;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.f295484a = java.lang.System.currentTimeMillis();
        boolean z18 = false;
        if (c6249x2aa12f2e2 != null) {
            am.s10 s10Var = c6249x2aa12f2e2.f136498g;
            if (s10Var.f89396c == -1) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                android.content.Intent intent2 = s10Var.f89394a;
                if (intent2 == null || intent2.getIntExtra("pay_channel", 0) != 13) {
                    j45.l.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, ".ui.LauncherUI", intent, null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "channel is MMPAY_CHANNEL_SCAN_QRCODE_IMAGE_CHANNEL ，return org page");
                }
                z17 = true;
            } else {
                z17 = false;
            }
            if (s10Var.f89398e) {
                java.util.Queue queue = this.f262593g;
                if (queue != null && ((java.util.LinkedList) queue).size() > 0) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 c5834xa4df3853 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853) ((java.util.LinkedList) this.f262593g).poll();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "One PayAuthNativeEvent has been consumed, and the size of mKindaAuthNativeEventQueue is " + ((java.util.LinkedList) this.f262593g).size());
                    int i17 = s10Var.f89396c;
                    if (i17 == 0) {
                        c5834xa4df3853.f136142h.f87900a = 1;
                    } else if (i17 == 3) {
                        c5834xa4df3853.f136142h.f87900a = 2;
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nt4.x(this, c5834xa4df3853));
                    z18 = true;
                } else if (this.f262593g != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletGetA8KeyRedirectListener", "The state of mKindaAuthNativeEventQueue is error! it's empty!");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletGetA8KeyRedirectListener", "The state of mKindaAuthNativeEventQueue is error! it is null!");
                }
            } else {
                z18 = z17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.WalletGetA8KeyRedirectListener", "mismatched event");
        java.util.Queue queue2 = this.f262593g;
        if (queue2 != null) {
            if (!z18 || ((java.util.LinkedList) queue2).size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "event isn't consumed, isDealEvent: " + z18 + ", and mKindaAuthNativeEventQueue.size(): " + ((java.util.LinkedList) this.f262593g).size());
            } else {
                mo48814x2efc64();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "event is finish and consumed");
            }
        }
        return z18;
    }

    public final void d(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        c19760x34448d56.f273642e = this.f262590d;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        for (java.lang.String str4 : str.replace(f262589m, "").split("&")) {
            if (str4.startsWith("errcode=")) {
                str2 = str4.replace("errcode=", "");
            } else if (str4.startsWith("errmsg=")) {
                str3 = str4.replace("errmsg=", "");
            } else if (str4.startsWith("reqkey=")) {
                c19760x34448d56.f273647m = str4.replace("reqkey=", "");
            } else if (str4.startsWith("uuid=")) {
                c19760x34448d56.f273648n = str4.replace("uuid=", "");
            } else if (str4.startsWith("appid=")) {
                c19760x34448d56.f273649o = str4.replace("appid=", "");
            } else if (str4.startsWith("appsource=")) {
                c19760x34448d56.f273650p = str4.replace("appsource=", "");
            } else if (str4.startsWith("productid=")) {
                c19760x34448d56.f273653s = str4.replace("productid=", "");
            }
        }
        c19760x34448d56.f273644g = i17;
        if ("0".equals(str2)) {
            com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
            ((h45.q) i95.n0.c(h45.q.class)).mo24849x2784dc28(c19760x34448d56.f273647m, c19760x34448d56.f273642e, c19760x34448d56.f273644g);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = this.f262592f;
            java.lang.Runnable runnable = c5587xf7a06bec.f273897d;
            if (runnable != null) {
                c5587xf7a06bec.f135910h.f88087a = 1;
                runnable.run();
            }
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                str3 = ((android.content.Context) this.f262592f.f135909g.f87981c.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
            }
            db5.e1.t((android.content.Context) this.f262592f.f135909g.f87981c.get(), str3, "", new nt4.v(this));
        }
        if (android.text.TextUtils.isEmpty(str2) || !java.util.regex.Pattern.compile("[0-9]*").matcher(str2).matches()) {
            return;
        }
        c(0, java.lang.Integer.valueOf(str2).intValue(), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof w60.k) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f262594h;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11170, java.lang.Integer.valueOf(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d), 0, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), "");
            c(i17, i18, currentTimeMillis);
            gm0.j1.i();
            gm0.j1.n().f354821b.q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
            if (i17 == 0 && i18 == 0) {
                d(((com.p314xaae8f345.mm.p957x53236a1b.k0) ((w60.k) m1Var)).Q(), this.f262591e);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = ((android.content.Context) this.f262592f.f135909g.f87981c.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
            }
            db5.e1.t((android.content.Context) this.f262592f.f135909g.f87981c.get(), str, "", new nt4.u(this));
            return;
        }
        if (!(m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "other scene");
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.q(385, this);
        if (i17 != 0) {
            throw null;
        }
        if (i18 != 0) {
            throw null;
        }
        ((com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.q) m1Var).getClass();
        if (!"0".equals(null)) {
            throw null;
        }
        throw null;
    }
}
