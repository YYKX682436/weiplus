package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d;

@j95.b
/* loaded from: classes13.dex */
public class k extends i95.w implements e42.m0 {

    /* renamed from: f, reason: collision with root package name */
    public static int[] f181343f = {10, 1000, 10000, 100000};

    /* renamed from: g, reason: collision with root package name */
    public static boolean f181344g = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f181345d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f181346e = new java.util.HashSet();

    public k() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return;
        }
        f181344g = true;
    }

    public void Ai() {
        f181344g = false;
        s52.b.f(106, null, 0, java.lang.System.currentTimeMillis());
        s52.b d17 = s52.b.d();
        d17.g(8);
        g52.a.b(8);
        s52.a aVar = d17.f484693a;
        r45.i53 a17 = aVar.a();
        if (a17 == null) {
            a17 = new r45.i53();
        }
        a17.f458279m = true;
        aVar.b(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPageFlowService", "habbyge-mali, MMPageFlowService: logout补偿上报");
    }

    public final void Bi(java.lang.String str, e42.l0 l0Var, int i17, long j17, int i18) {
        if (str.contains("WeChatSplashActivity") || str.contains("FakeSwitchAccountUI")) {
            return;
        }
        int i19 = l0Var.f330875d;
        char c17 = 2;
        if (i19 <= 2) {
            c17 = 0;
        } else if (i19 <= 4) {
            c17 = 1;
        } else if (i19 > 6) {
            c17 = 3;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6808xc7b52ca3 c6808xc7b52ca3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6808xc7b52ca3();
        c6808xc7b52ca3.f141356d = i18;
        c6808xc7b52ca3.f141357e = c6808xc7b52ca3.b("PName", ((km0.c) gm0.j1.p().a()).f390520a, true);
        c6808xc7b52ca3.f141359g = c6808xc7b52ca3.b("Name", str, true);
        int[] iArr = f181343f;
        int i27 = iArr[c17];
        iArr[c17] = i27 + 1;
        c6808xc7b52ca3.f141358f = i27;
        c6808xc7b52ca3.f141360h = l0Var.f330875d;
        c6808xc7b52ca3.f141361i = j17;
        c6808xc7b52ca3.f141364l = i17;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.o.f181352a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.o.f181352a = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.o();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.o.f181352a.a(c6808xc7b52ca3);
        c6808xc7b52ca3.n();
        e42.l0 l0Var2 = e42.l0.MMActivity_Back2Front;
        e42.l0 l0Var3 = e42.l0.MMActivity_Front2Back;
        if (l0Var == l0Var2 || l0Var == l0Var3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPageFlowService", "habbyge-mali, %s frontback-pure-report [%s]", hashCode() + "", c6808xc7b52ca3.n());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (l0Var == l0Var2 || l0Var == l0Var3) {
                int i28 = f181343f[3];
                if (android.text.TextUtils.isEmpty("page_hell_seq_mmkv_key")) {
                    return;
                }
                c52.c.b().putInt("page_hell_seq_mmkv_key", i28);
            }
        }
    }

    public void Di(java.lang.String str, e42.l0 l0Var, int i17, long j17) {
        int myPid = android.os.Process.myPid();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.i.f181342a == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.i.f181342a = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.i();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPageFlowSenderByIPCInvoker", "%s send page flow [%s-%d-%d] [%s]", "" + com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.i.f181342a.hashCode(), str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), l0Var);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_page_flow_type", l0Var.f330875d);
            bundle.putString("key_page_flow_name", str);
            bundle.putInt("key_page_flow_hashcode", i17);
            bundle.putLong("key_page_flow_time_stamp", j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(932L, 100L, 1L, false);
            java.lang.String string = bundle.getString("key_page_flow_name");
            int i18 = bundle.getInt("key_page_flow_type");
            int i19 = bundle.getInt("key_page_flow_hashcode", 0);
            long j18 = bundle.getLong("key_page_flow_time_stamp", 0L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((i19 + "_" + j18).hashCode());
            sb6.append("");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6699x2e93e7d c6699x2e93e7d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6699x2e93e7d();
            c6699x2e93e7d.f140379g = (long) i19;
            c6699x2e93e7d.f140376d = c6699x2e93e7d.b("Name", string, true);
            c6699x2e93e7d.f140377e = i18;
            c6699x2e93e7d.f140378f = j18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e.a();
            java.lang.String m17 = c6699x2e93e7d.m();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = a17.b();
            if (b17 != null) {
                b17.putString(sb7, m17);
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.g.class, null);
            f181344g = true;
        }
        if (!f181344g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPageFlowService", "reportPageFlow: mm-process isAccReady = FALSE");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            wi();
        }
        Bi(str, l0Var, i17, j17, myPid);
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        f181343f = new int[]{10, 1000, 10000, 100000};
        f181344g = true;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        f181343f = new int[]{10, 1000, 10000, 100000};
        f181344g = false;
        this.f181345d = false;
    }

    public void wi() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e.a().b();
            java.lang.String[] b18 = b17 == null ? null : b17.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (b18 != null && b18.length > 0) {
                for (java.lang.String str : b18) {
                    java.util.HashSet hashSet = this.f181346e;
                    if (!hashSet.contains(str)) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b19 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e.a().b();
                        java.lang.String string = b19 != null ? b19.getString(str, "") : "";
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6699x2e93e7d c6699x2e93e7d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6699x2e93e7d(string);
                            if (c6699x2e93e7d.f140379g > 0 && c6699x2e93e7d.f140378f > 0) {
                                arrayList.add(new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6699x2e93e7d(string));
                                hashSet.add(str);
                            }
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b27 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e.a().b();
                            if (b27 != null) {
                                b27.remove(str);
                            }
                        }
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b28 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.e.a().b();
                    if (b28 != null) {
                        b28.remove(str);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.j(this));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6699x2e93e7d c6699x2e93e7d2 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6699x2e93e7d) it.next();
                    Bi(c6699x2e93e7d2.f140376d, e42.l0.a((int) c6699x2e93e7d2.f140377e), (int) c6699x2e93e7d2.f140379g, c6699x2e93e7d2.f140378f, android.os.Process.myPid());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(932L, 102L, arrayList.size(), false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPageFlowService", "check mmkv list[%d] cost[%d]", java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            }
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
