package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class u0 implements com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack {

    /* renamed from: a, reason: collision with root package name */
    public static long f153678a;

    /* renamed from: b, reason: collision with root package name */
    public static int f153679b;

    public final void a(int i17, int i18, long j17, long j18) {
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.y yVar = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153535w;
            if (yVar == null) {
                return;
            }
            try {
                yVar.Q7(i17, i18, j17, j18);
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        } catch (java.lang.Exception e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IPxxCallback", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack
    /* renamed from: getCrashFilePath */
    public java.lang.String mo40170xa29a9cd2(int i17) {
        java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis() - (i17 * 86400000));
        java.lang.String str = lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd").format(date) + ".txt";
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return str;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack
    /* renamed from: getUploadLogExtrasInfo */
    public java.lang.String mo40171x24eca05e(java.lang.String str) {
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Device:");
            stringBuffer.append(o45.wf.f424558c);
            stringBuffer.append(" ");
            stringBuffer.append(wo.q.f529317e);
            stringBuffer.append("\n");
            return stringBuffer.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack
    /* renamed from: recoverLinkAddrs */
    public void mo40172xd1def1c4() {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40255xd1def1c4();
    }

    @Override // com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack
    /* renamed from: reportKv */
    public void mo40173xe68be1bf(int i17, java.lang.String str) {
        jx3.f.INSTANCE.mo68478xbd3cda5f(i17, str);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack
    /* renamed from: setNewDnsDebugHostInfo */
    public void mo40174xb24c113e(java.lang.String str, int i17) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40272xe0f6f070(str, i17 + "");
    }

    @Override // com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack
    /* renamed from: uploadLogFail */
    public void mo40175x5561a341(int i17) {
        f153679b = 0;
        a(i17, -1, 0L, 0L);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack
    /* renamed from: uploadLogResponse */
    public void mo40176x7d1016e4(int i17, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("IPxxCallback", "ipxx progress totalSize:%d uploadSize:%d lastPercent:%d ", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(f153679b));
        long i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (i18 - 1 < f153678a) {
            return;
        }
        f153678a = i18;
        int i19 = (j18 < 0 || j17 <= 0 || j18 >= j17) ? 0 : (int) ((100 * j18) / j17);
        if (i19 > 100) {
            i19 = 100;
        }
        int i27 = f153679b;
        int i28 = i27 > i19 ? i27 : i19;
        f153679b = i28;
        a(i17, i28, j17, j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack
    /* renamed from: uploadLogSuccess */
    public void mo40177xbeafdd00(int i17) {
        f153679b = 0;
        a(i17, 100, 0L, 0L);
    }
}
