package com.p314xaae8f345.mm.p2613x7643c6b5;

/* renamed from: com.tencent.mm.service.ProcessService$MMProcessService */
/* loaded from: classes12.dex */
public class ServiceC21029xe89c2284 extends com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p642xad8b531f.k f274742i = null;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (((r0 == 788529167 || r0 == 788529166) || z65.c.a()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d() {
        /*
            j62.e r0 = j62.e.g()
            java.lang.String r1 = "clicfg_notify_service_threadpool_enable"
            r2 = 0
            int r0 = r0.i(r1, r2, r2, r2)
            r1 = 1
            if (r0 == r1) goto L2c
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h
            r3 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r0 == r3) goto L1d
            r3 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r0 != r3) goto L1b
            goto L1d
        L1b:
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L29
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == 0) goto L2d
        L2c:
            r2 = r1
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "enableThreadPool: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MMProcessService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21029xe89c2284.d():boolean");
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831
    public java.lang.String c() {
        return "MicroMsg.MMProcessService";
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831, android.app.Service
    public void onCreate() {
        try {
            int i17 = com.p314xaae8f345.mm.p1004x2137b148.C11324x73847af.f153933a;
            com.p314xaae8f345.mm.p642xad8b531f.k kVar = (com.p314xaae8f345.mm.p642xad8b531f.k) com.p314xaae8f345.mm.p1004x2137b148.C11324x73847af.class.newInstance();
            this.f274742i = kVar;
            kVar.mo43387xa1258ad5();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMProcessService", "onCreate Class.forName(com.tencent.mm.platformtools.BroadcastHelper) Exception = %s ", e17.getMessage());
        }
        super.onCreate();
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831, android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.mm.p642xad8b531f.k kVar = this.f274742i;
        if (kVar != null) {
            try {
                kVar.mo43388x4b16414e();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMProcessService", "onDestroy unRegisterBroadcasts() Exception = %s ", e17.getMessage());
            }
        }
        super.onDestroy();
    }
}
