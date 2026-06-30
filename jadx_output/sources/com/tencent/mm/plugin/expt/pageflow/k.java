package com.tencent.mm.plugin.expt.pageflow;

@j95.b
/* loaded from: classes13.dex */
public class k extends i95.w implements e42.m0 {

    /* renamed from: f, reason: collision with root package name */
    public static int[] f99810f = {10, 1000, 10000, 100000};

    /* renamed from: g, reason: collision with root package name */
    public static boolean f99811g = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99812d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f99813e = new java.util.HashSet();

    public k() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return;
        }
        f99811g = true;
    }

    public void Ai() {
        f99811g = false;
        s52.b.f(106, null, 0, java.lang.System.currentTimeMillis());
        s52.b d17 = s52.b.d();
        d17.g(8);
        g52.a.b(8);
        s52.a aVar = d17.f403160a;
        r45.i53 a17 = aVar.a();
        if (a17 == null) {
            a17 = new r45.i53();
        }
        a17.f376746m = true;
        aVar.b(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPageFlowService", "habbyge-mali, MMPageFlowService: logout补偿上报");
    }

    public final void Bi(java.lang.String str, e42.l0 l0Var, int i17, long j17, int i18) {
        if (str.contains("WeChatSplashActivity") || str.contains("FakeSwitchAccountUI")) {
            return;
        }
        int i19 = l0Var.f249342d;
        char c17 = 2;
        if (i19 <= 2) {
            c17 = 0;
        } else if (i19 <= 4) {
            c17 = 1;
        } else if (i19 > 6) {
            c17 = 3;
        }
        com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct pageFlowDetailStruct = new com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct();
        pageFlowDetailStruct.f59823d = i18;
        pageFlowDetailStruct.f59824e = pageFlowDetailStruct.b("PName", ((km0.c) gm0.j1.p().a()).f308987a, true);
        pageFlowDetailStruct.f59826g = pageFlowDetailStruct.b("Name", str, true);
        int[] iArr = f99810f;
        int i27 = iArr[c17];
        iArr[c17] = i27 + 1;
        pageFlowDetailStruct.f59825f = i27;
        pageFlowDetailStruct.f59827h = l0Var.f249342d;
        pageFlowDetailStruct.f59828i = j17;
        pageFlowDetailStruct.f59831l = i17;
        if (com.tencent.mm.plugin.expt.pageflow.o.f99819a == null) {
            com.tencent.mm.plugin.expt.pageflow.o.f99819a = new com.tencent.mm.plugin.expt.pageflow.o();
        }
        com.tencent.mm.plugin.expt.pageflow.o.f99819a.a(pageFlowDetailStruct);
        pageFlowDetailStruct.n();
        e42.l0 l0Var2 = e42.l0.MMActivity_Back2Front;
        e42.l0 l0Var3 = e42.l0.MMActivity_Front2Back;
        if (l0Var == l0Var2 || l0Var == l0Var3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPageFlowService", "habbyge-mali, %s frontback-pure-report [%s]", hashCode() + "", pageFlowDetailStruct.n());
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (l0Var == l0Var2 || l0Var == l0Var3) {
                int i28 = f99810f[3];
                if (android.text.TextUtils.isEmpty("page_hell_seq_mmkv_key")) {
                    return;
                }
                c52.c.b().putInt("page_hell_seq_mmkv_key", i28);
            }
        }
    }

    public void Di(java.lang.String str, e42.l0 l0Var, int i17, long j17) {
        int myPid = android.os.Process.myPid();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            if (com.tencent.mm.plugin.expt.pageflow.i.f99809a == null) {
                com.tencent.mm.plugin.expt.pageflow.i.f99809a = new com.tencent.mm.plugin.expt.pageflow.i();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPageFlowSenderByIPCInvoker", "%s send page flow [%s-%d-%d] [%s]", "" + com.tencent.mm.plugin.expt.pageflow.i.f99809a.hashCode(), str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), l0Var);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_page_flow_type", l0Var.f249342d);
            bundle.putString("key_page_flow_name", str);
            bundle.putInt("key_page_flow_hashcode", i17);
            bundle.putLong("key_page_flow_time_stamp", j17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(932L, 100L, 1L, false);
            java.lang.String string = bundle.getString("key_page_flow_name");
            int i18 = bundle.getInt("key_page_flow_type");
            int i19 = bundle.getInt("key_page_flow_hashcode", 0);
            long j18 = bundle.getLong("key_page_flow_time_stamp", 0L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((i19 + "_" + j18).hashCode());
            sb6.append("");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct mMKVPageFlowStruct = new com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct();
            mMKVPageFlowStruct.f58846g = (long) i19;
            mMKVPageFlowStruct.f58843d = mMKVPageFlowStruct.b("Name", string, true);
            mMKVPageFlowStruct.f58844e = i18;
            mMKVPageFlowStruct.f58845f = j18;
            com.tencent.mm.plugin.expt.pageflow.e a17 = com.tencent.mm.plugin.expt.pageflow.e.a();
            java.lang.String m17 = mMKVPageFlowStruct.m();
            com.tencent.mm.sdk.platformtools.o4 b17 = a17.b();
            if (b17 != null) {
                b17.putString(sb7, m17);
            }
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.expt.pageflow.g.class, null);
            f99811g = true;
        }
        if (!f99811g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMPageFlowService", "reportPageFlow: mm-process isAccReady = FALSE");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wi();
        }
        Bi(str, l0Var, i17, j17, myPid);
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        f99810f = new int[]{10, 1000, 10000, 100000};
        f99811g = true;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        f99810f = new int[]{10, 1000, 10000, 100000};
        f99811g = false;
        this.f99812d = false;
    }

    public void wi() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.sdk.platformtools.o4 b17 = com.tencent.mm.plugin.expt.pageflow.e.a().b();
            java.lang.String[] b18 = b17 == null ? null : b17.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (b18 != null && b18.length > 0) {
                for (java.lang.String str : b18) {
                    java.util.HashSet hashSet = this.f99813e;
                    if (!hashSet.contains(str)) {
                        com.tencent.mm.sdk.platformtools.o4 b19 = com.tencent.mm.plugin.expt.pageflow.e.a().b();
                        java.lang.String string = b19 != null ? b19.getString(str, "") : "";
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                            com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct mMKVPageFlowStruct = new com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct(string);
                            if (mMKVPageFlowStruct.f58846g > 0 && mMKVPageFlowStruct.f58845f > 0) {
                                arrayList.add(new com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct(string));
                                hashSet.add(str);
                            }
                            com.tencent.mm.sdk.platformtools.o4 b27 = com.tencent.mm.plugin.expt.pageflow.e.a().b();
                            if (b27 != null) {
                                b27.remove(str);
                            }
                        }
                    }
                    com.tencent.mm.sdk.platformtools.o4 b28 = com.tencent.mm.plugin.expt.pageflow.e.a().b();
                    if (b28 != null) {
                        b28.remove(str);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.expt.pageflow.j(this));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct mMKVPageFlowStruct2 = (com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct) it.next();
                    Bi(mMKVPageFlowStruct2.f58843d, e42.l0.a((int) mMKVPageFlowStruct2.f58844e), (int) mMKVPageFlowStruct2.f58846g, mMKVPageFlowStruct2.f58845f, android.os.Process.myPid());
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(932L, 102L, arrayList.size(), false);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPageFlowService", "check mmkv list[%d] cost[%d]", java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            }
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
