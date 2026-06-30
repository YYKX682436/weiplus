package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 f245661d;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var) {
        this.f245661d = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        dn.o oVar;
        java.util.List list;
        boolean z19;
        boolean z27;
        boolean z28;
        java.lang.String str;
        dn.o oVar2;
        java.util.List list2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
        if (this.f245661d.f245841a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.c(this.f245661d).isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
            return;
        }
        boolean d17 = n74.l0.d();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        boolean e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.e(this.f245661d, c19762x487075a, c19762x487075a2);
        if (d17) {
            e17 = false;
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.b(this.f245661d)) {
            try {
                int size = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.b(this.f245661d).size();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var = this.f245661d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                int i17 = i7Var.f245846f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                if (size >= i17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload: currentPreloadList isUpperLimit, hasSlideFullCardAd=" + e17 + ", hasLookbookAd=" + c19762x487075a.f38859x6ac9171 + ", hasFlipCardAd=" + c19762x487075a2.f38859x6ac9171 + ", size=" + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.b(this.f245661d).size());
                    if (!e17 && !c19762x487075a.f38859x6ac9171 && !c19762x487075a2.f38859x6ac9171) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD working with max count ,try later again . [fail to preload]");
                        return;
                    }
                    z17 = true;
                } else {
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var2 = this.f245661d;
                if (i7Var2.f245848h || (i7Var2.f245849i && !ma4.a.a())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD isInChatting:%b, x-config enable preload:%b . [fail to preload]", java.lang.Boolean.valueOf(this.f245661d.f245848h), java.lang.Boolean.valueOf(ma4.a.a()));
                    z18 = true;
                } else {
                    z18 = false;
                }
                com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                java.lang.String str2 = "";
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.f(this.f245661d)) {
                    try {
                        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.f(this.f245661d).iterator();
                        c17933xe8d1b226 = null;
                        oVar = null;
                        list = null;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
                            str2 = c17933xe8d1b226.m70363x51f8f990();
                            if (c17933xe8d1b226.m70377x3172ed() || !z18) {
                                boolean f17 = q74.t0.f(c17933xe8d1b226);
                                if ((!f17 || d17) && !c17933xe8d1b226.m70401x59316745() && !c17933xe8d1b226.m70395x9b8322ea() && z17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload: current snsInfo is not slideFullCard or lookbook ad and isUpperLimit is true!");
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var3 = this.f245661d;
                                    boolean g17 = i7Var3.f245849i ? com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.g(i7Var3, c17933xe8d1b226, c19762x487075a3, c19767x257d7f, c19772x1c2cd081) : com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.h(i7Var3, c17933xe8d1b226, c19762x487075a3, c19767x257d7f, c19772x1c2cd081);
                                    if (c17933xe8d1b226.m70377x3172ed()) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
                                        q34.b m70103xb6fd7912 = m70346x10413e67 == null ? null : m70346x10413e67.m70103xb6fd7912();
                                        if (m70103xb6fd7912 != null) {
                                            z19 = z17;
                                            boolean z29 = m70103xb6fd7912.f441499a;
                                            int i18 = m70103xb6fd7912.f441500b;
                                            z27 = z18;
                                            z28 = g17;
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                            str = str2;
                                            sb6.append("adVideoPreload timeline online, snsId=");
                                            oVar2 = oVar;
                                            list2 = list;
                                            sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
                                            sb6.append(", cfg.forbidPreload=");
                                            sb6.append(z29);
                                            sb6.append(", cfg.ratio=");
                                            sb6.append(i18);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", sb6.toString());
                                            if (z29) {
                                                c19762x487075a3.f38859x6ac9171 = true;
                                                z28 = false;
                                            }
                                        } else {
                                            z19 = z17;
                                            z27 = z18;
                                            z28 = g17;
                                            str = str2;
                                            oVar2 = oVar;
                                            list2 = list;
                                            ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
                                        }
                                    } else {
                                        z19 = z17;
                                        z27 = z18;
                                        z28 = g17;
                                        str = str2;
                                        oVar2 = oVar;
                                        list2 = list;
                                    }
                                    boolean z37 = z28;
                                    if (c19762x487075a3.f38859x6ac9171) {
                                        it.remove();
                                    }
                                    if (!z37) {
                                        oVar = oVar2;
                                        list = list2;
                                        c17933xe8d1b226 = null;
                                    } else if (!d17 && f17) {
                                        list = n74.m0.d(c17933xe8d1b226, c19767x257d7f, c19772x1c2cd081.f38869x6ac9171, this.f245661d.f245849i);
                                        if (!a84.b0.b(list)) {
                                            break;
                                        }
                                        it.remove();
                                        oVar = oVar2;
                                    } else if (c17933xe8d1b226.m70401x59316745()) {
                                        list = n74.m0.b(c17933xe8d1b226, c19767x257d7f, c19772x1c2cd081.f38869x6ac9171, this.f245661d.f245849i);
                                        if (!a84.b0.b(list)) {
                                            break;
                                        }
                                        it.remove();
                                        oVar = oVar2;
                                    } else if (c17933xe8d1b226.m70395x9b8322ea()) {
                                        list = n74.m0.a(c17933xe8d1b226, c19767x257d7f, c19772x1c2cd081.f38869x6ac9171, this.f245661d.f245849i);
                                        if (!a84.b0.b(list)) {
                                            break;
                                        }
                                        it.remove();
                                        oVar = oVar2;
                                    } else {
                                        oVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.i(this.f245661d, c17933xe8d1b226, c19767x257d7f, c19772x1c2cd081.f38869x6ac9171);
                                        if (oVar != null) {
                                            str2 = str;
                                            list = list2;
                                            break;
                                        } else {
                                            it.remove();
                                            list = list2;
                                        }
                                    }
                                    z17 = z19;
                                    z18 = z27;
                                    str2 = str;
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD: the sns info is not ad and preload is disable!");
                            }
                            c17933xe8d1b226 = null;
                        }
                        str2 = str;
                        oVar = oVar2;
                    } finally {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                    }
                }
                if (c17933xe8d1b226 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD current preload list null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                    return;
                }
                if (oVar == null && a84.b0.b(list)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] null task . [fail to preload]", str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                    return;
                }
                try {
                    if (a84.b0.b(list)) {
                        java.lang.String m70363x51f8f990 = c17933xe8d1b226.m70363x51f8f990();
                        t21.v0 v0Var = new t21.v0(oVar, m70363x51f8f990);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var4 = this.f245661d;
                        v0Var.f496524o = i7Var4.f245849i;
                        if (v0Var.b(i7Var4) < 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD curr preload task do scene error. hash:[%d ]", java.lang.Integer.valueOf(this.f245661d.hashCode()));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] start to preload , pPreloadPercent:%d  [success to preload]", m70363x51f8f990, java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171));
                            v0Var.f496523n = java.lang.System.currentTimeMillis();
                            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.b(this.f245661d)) {
                                try {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.b(this.f245661d).add(0, v0Var);
                                } finally {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                                }
                            }
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.j(this.f245661d, str2, list, c19767x257d7f);
                    }
                    synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.f(this.f245661d)) {
                        try {
                            java.util.Iterator it6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7.f(this.f245661d).iterator();
                            while (it6.hasNext()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it6.next();
                                if (c17933xe8d1b2262 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c17933xe8d1b2262.m70363x51f8f990(), c17933xe8d1b226.m70363x51f8f990())) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD find sns info[%s], remove now. hash:[%d ]", c17933xe8d1b226.m70363x51f8f990(), java.lang.Integer.valueOf(this.f245661d.hashCode()));
                                    it6.remove();
                                }
                            }
                        } finally {
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsVideoService", e18, "", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 i7Var5 = this.f245661d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    i7Var5.v();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
            }
        }
    }
}
