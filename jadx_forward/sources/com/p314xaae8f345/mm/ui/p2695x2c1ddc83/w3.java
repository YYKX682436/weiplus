package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class w3 implements l75.z0, o75.a {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3 f289747g = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Vector f289748d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f289749e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u3 f289750f;

    public w3() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501>(a0Var) { // from class: com.tencent.mm.ui.conversation.ConversationUnreadHelper$1
            {
                this.f39173x3fe91575 = -1611655951;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501 c5306x8769501) {
                int i17 = c5306x8769501.f135626g.f88169a;
                if (i17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "do init start");
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.this.f289749e = true;
                } else if (i17 == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "do init end");
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.this.f289749e = false;
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.this.e();
                }
                return false;
            }
        };
        this.f289750f = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u3(this, null);
        this.f289748d = new java.util.Vector(8);
        abstractC20980x9b9ad01d.mo48813x58998cd();
        dm.e2.D2.m127126x9d92d11c(a0Var, this);
        c01.d9.b().getClass();
        j01.c cVar = f01.s1.INSTANCE.f339924d;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = cVar.f378507a;
        if (!concurrentHashMap.contains(this)) {
            if (mainLooper != null) {
                concurrentHashMap.put(this, new android.os.Handler(mainLooper));
            } else {
                concurrentHashMap.put(this, java.lang.Boolean.FALSE);
            }
        }
        e();
    }

    public static int b(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var == null || l4Var.d1() <= 0) {
            if (l4Var == null || (!(l4Var.d2(8388608) || l4Var.d2(2097152)) || l4Var.f1() <= 0)) {
                return (l4Var == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(l4Var.h1()) || l4Var.f1() <= 0) ? 0 : 1;
            }
            return 1;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N3(l4Var.h1())) {
            return 1;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(l4Var.h1())) {
            if (!l4Var.d2(16) && !l4Var.d2(64)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "getShowUnreadCountType officialaccounts. not time line unread or notify unread. return count no.");
                com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a.B(0);
                return 0;
            }
            if (l4Var.d2(64) && l4Var.d2(2048)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "getShowUnreadCountType officialaccounts. timeline notify unread but consume. return count no.");
                com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a.B(0);
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "getShowUnreadCountType officialaccounts. return count mute yes.");
            com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a.B(1);
            return 1;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.B4(l4Var.h1())) {
            return (l4Var.d2(512) || l4Var.d2(1024) || l4Var.d2(32768)) ? 1 : 0;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(l4Var.h1()) && !c01.d9.b().p().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
            return 1;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(l4Var.h1()) && !c01.d9.b().p().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
            return 1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(l4Var.h1(), true);
        if (n17 != null && ((int) n17.E2) != 0) {
            if (c01.e2.P(n17) && n17.B2()) {
                return 1;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(l4Var.h1()) && n17.T == 0) {
                return 1;
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.B3(l4Var.h1())) {
            return 1;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(l4Var.h1()) ? 0 : 2;
    }

    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v3 a(java.util.Set set) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u3 u3Var = this.f289750f;
        try {
            u3Var.call();
            return u3Var.c(set);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationUnreadHelper", "get24hUnreadCount error: " + e17);
            return com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v3.f289715e;
        }
    }

    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(931, 25);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Integer num = 0;
        try {
            num = this.f289750f.call();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationUnreadHelper", "getTotalUnread error: " + e17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "getTotalUnread totalUnread:%s cost:%s", num, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final boolean d(o75.c cVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        o75.b bVar = cVar.f425120a;
        if (bVar == o75.b.f425117e || bVar == o75.b.f425115c || (z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) cVar.f425123d) == null || ((int) z3Var.E2) <= 0 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(z3Var.d1())) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "onContactStorageNotifyChange contact %s isMute %s, ChatRoomNotify %d", z3Var.d1(), java.lang.Boolean.valueOf(c01.e2.P(z3Var)), java.lang.Integer.valueOf(z3Var.T));
        return true;
    }

    public final void e() {
        this.f289748d.add(null);
        ((ku5.t0) ku5.t0.f394148d).A("ConversationUnreadHelper");
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u3 u3Var = this.f289750f;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        java.util.Objects.requireNonNull(u3Var);
        t0Var.u(u3Var, 1000, "ConversationUnreadHelper");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "onNotifyChange username:%s isIniting:%s", str, java.lang.Boolean.valueOf(this.f289749e));
            boolean z17 = true;
            if (!(a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.l8)) {
                if (!(a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.e8) || i17 == 5 || i17 == 2 || this.f289749e) {
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "username is null");
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                    if (n17 == null || ((int) n17.E2) <= 0 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(str)) {
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationUnreadHelper", "onContactStorageNotifyChange contact isMute %s, ChatRoomNotify %d", java.lang.Boolean.valueOf(c01.e2.P(n17)), java.lang.Integer.valueOf(n17.T));
                    }
                }
                e();
                return;
            }
            if (((java.util.ArrayList) c01.h2.g()).contains(str)) {
                return;
            }
            if (i17 == 5) {
                e();
                return;
            }
            if (str == null) {
                return;
            }
            synchronized (this.f289748d) {
                java.util.Iterator it = this.f289748d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    } else if (str.equals((java.lang.String) it.next())) {
                        break;
                    }
                }
                if (!z17) {
                    this.f289748d.add(str);
                }
            }
            ((ku5.t0) ku5.t0.f394148d).A("ConversationUnreadHelper");
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u3 u3Var = this.f289750f;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            java.util.Objects.requireNonNull(u3Var);
            t0Var.u(u3Var, 1000, "ConversationUnreadHelper");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // e75.a
    /* renamed from: onChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2231x7bb163d5(java.lang.Object r3) {
        /*
            r2 = this;
            o75.c r3 = (o75.c) r3
            boolean r0 = r2.f289749e
            if (r0 == 0) goto L7
            goto L53
        L7:
            o75.b r0 = r3.f425120a
            o75.b r1 = o75.b.f425118f
            if (r0 != r1) goto L4a
            java.util.HashMap r3 = r3.f425124e
            if (r3 == 0) goto L34
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            o75.c r0 = (o75.c) r0
            boolean r0 = r2.d(r0)
            if (r0 == 0) goto L19
            goto L34
        L32:
            r3 = 0
            goto L35
        L34:
            r3 = 1
        L35:
            if (r3 == 0) goto L3a
            r2.e()
        L3a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "MicroMsg.ConversationUnreadHelper"
            java.lang.String r1 = "batch event %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1, r3)
            goto L53
        L4a:
            boolean r3 = r2.d(r3)
            if (r3 == 0) goto L53
            r2.e()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.mo2231x7bb163d5(java.lang.Object):void");
    }
}
