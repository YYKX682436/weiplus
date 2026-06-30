package wh1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult f527451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh1.c f527452e;

    public b(wh1.c cVar, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult) {
        this.f527452e = cVar;
        this.f527451d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.Class cls;
        java.lang.Class cls2;
        int i17;
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult = this.f527451d;
        long j17 = cronetTaskResult.f18209x953f8a7;
        int i18 = cronetTaskResult.f18207xec0a8ff;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cronetTaskResult.f18200x139cb015);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult2 = this.f527451d;
        java.lang.String str = cronetTaskResult2.f18201x5336c059;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cronetTaskResult2.f18207xec0a8ff);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(this.f527451d.f18209x953f8a7);
        wh1.e eVar = this.f527452e.f527455c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s", valueOf, str, valueOf2, valueOf3, eVar.f527474w, eVar.f527476y);
        if (this.f527451d.f18200x139cb015 != 0) {
            if (this.f527452e.f527455c.f527462h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted uploadFile fail already callback");
                return;
            }
            this.f527452e.f527455c.f527462h = true;
            wh1.e eVar2 = this.f527452e.f527455c;
            wh1.f fVar = eVar2.f527460f;
            ((uh1.b0) fVar).a(eVar2.f527466o, eVar2.f527464m, "upload fail:" + this.f527451d.f18200x139cb015 + ":" + this.f527451d.f18201x5336c059, 600001);
            uh1.h1 h1Var = (uh1.h1) nd.f.d(uh1.h1.class, true);
            java.lang.String mo48798x74292566 = this.f527452e.f527455c.f527459e.mo48798x74292566();
            wh1.e eVar3 = this.f527452e.f527455c;
            java.lang.String str2 = eVar3.B;
            java.lang.String str3 = eVar3.f527464m;
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult3 = this.f527451d;
            ((ch1.e) h1Var).b(mo48798x74292566, str2, "POST", str3, cronetTaskResult3.f18210x4be65c14, cronetTaskResult3.f18209x953f8a7, i18, 2, eVar3.b(), java.lang.System.currentTimeMillis(), null, this.f527452e.f527455c.f527467p);
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(1791L, 11L, 1L, false);
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(1791L, 13L, java.lang.System.currentTimeMillis() - this.f527452e.f527455c.f527473v, false);
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (m40067xab9ed241 == -1) {
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(1791L, 7L, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet uploadFile fail ret:%d", java.lang.Integer.valueOf(m40067xab9ed241));
            return;
        }
        this.f527452e.f527455c.getClass();
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(1791L, (i18 < 100 || i18 >= 200) ? 200 == i18 ? 21 : (i18 <= 200 || i18 >= 300) ? 302 == i18 ? 23 : (i18 < 300 || i18 >= 400) ? 404 == i18 ? 25 : (i18 < 400 || i18 >= 500) ? i18 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20, 1L, false);
        if (i18 != 200 && uh1.j0.B(i18)) {
            java.lang.String str4 = this.f527451d.f18203xbc380d75;
            if (!android.text.TextUtils.isEmpty(str4)) {
                wh1.e eVar4 = this.f527452e.f527455c;
                int i19 = eVar4.f527458d;
                int i27 = i19 - 1;
                eVar4.f527458d = i27;
                if (i19 > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "redirect(%d) URL(%s) to URL(%s)", java.lang.Integer.valueOf(i27), this.f527452e.f527455c.f527464m, str4);
                    wh1.e eVar5 = this.f527452e.f527455c;
                    eVar5.f527464m = str4;
                    eVar5.run();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNetworkUploadWorker", "reach the max redirect count(%d)", 15);
                if (this.f527452e.f527455c.f527462h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                    return;
                }
                this.f527452e.f527455c.f527462h = true;
                wh1.e eVar6 = this.f527452e.f527455c;
                if (eVar6.G) {
                    ((uh1.b0) eVar6.f527460f).c(eVar6.f527466o, eVar6.f527464m, "reach the max redirect count 15", i18, 0L, uh1.j0.k(this.f527451d.f18214x153dd026));
                } else {
                    ((uh1.b0) eVar6.f527460f).c(eVar6.f527466o, eVar6.f527464m, "reach the max redirect count 15", i18, 0L, null);
                }
                uh1.h1 h1Var2 = (uh1.h1) nd.f.d(uh1.h1.class, true);
                java.lang.String mo48798x742925662 = this.f527452e.f527455c.f527459e.mo48798x74292566();
                wh1.e eVar7 = this.f527452e.f527455c;
                java.lang.String str5 = eVar7.B;
                java.lang.String str6 = eVar7.f527464m;
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult4 = this.f527451d;
                ((ch1.e) h1Var2).b(mo48798x742925662, str5, "POST", str6, cronetTaskResult4.f18210x4be65c14, cronetTaskResult4.f18209x953f8a7, i18, 1, eVar7.b(), java.lang.System.currentTimeMillis(), null, this.f527452e.f527455c.f527467p);
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(1791L, 10L, 1L, false);
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(1791L, 12L, java.lang.System.currentTimeMillis() - this.f527452e.f527455c.f527473v, false);
                return;
            }
        }
        if (this.f527452e.f527455c.f527462h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted already callback");
            return;
        }
        this.f527452e.f527455c.f527462h = true;
        if (this.f527452e.f527455c.f527461g) {
            wh1.e eVar8 = this.f527452e.f527455c;
            if (eVar8.G) {
                z17 = true;
                cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class;
                cls2 = uh1.h1.class;
                i17 = i18;
                ((uh1.b0) eVar8.f527460f).c(eVar8.f527466o, eVar8.f527464m, this.f527451d.m37974x3a5e0c51(), i18, j17, uh1.j0.k(this.f527451d.f18214x153dd026));
            } else {
                z17 = true;
                cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class;
                cls2 = uh1.h1.class;
                i17 = i18;
                ((uh1.b0) eVar8.f527460f).c(eVar8.f527466o, eVar8.f527464m, this.f527451d.m37974x3a5e0c51(), i17, j17, null);
            }
            wh1.e eVar9 = this.f527452e.f527455c;
            long j18 = this.f527451d.f18210x4be65c14;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f527452e.f527455c.f527473v;
            eVar9.getClass();
            if (j18 <= 0 || currentTimeMillis <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "reportCronetSpeed len:%d, time:%d return", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis));
            } else {
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(cls, z17))).c(1791L, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 30 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 31 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 32 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 33 : 34, (long) ((j18 / currentTimeMillis) * 0.9765625d), false);
            }
            this.f527452e.f527454b.getClass();
        } else {
            z17 = true;
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class;
            cls2 = uh1.h1.class;
            i17 = i18;
            wh1.e eVar10 = this.f527452e.f527455c;
            ((uh1.b0) eVar10.f527460f).a(eVar10.f527466o, eVar10.f527464m, "force stop", 600004);
        }
        wh1.e eVar11 = this.f527452e.f527455c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet upload file finished taskid:%s,CronetRequestId:%s,filename: %s", eVar11.f527474w, eVar11.f527476y, eVar11.f527466o);
        wh1.e eVar12 = this.f527452e.f527455c;
        ((uh1.b0) eVar12.f527460f).b(eVar12.f527474w);
        uh1.h1 h1Var3 = (uh1.h1) nd.f.d(cls2, z17);
        java.lang.String mo48798x742925663 = this.f527452e.f527455c.f527459e.mo48798x74292566();
        wh1.e eVar13 = this.f527452e.f527455c;
        java.lang.String str7 = eVar13.B;
        java.lang.String str8 = eVar13.f527464m;
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult5 = this.f527451d;
        ch1.e eVar14 = (ch1.e) h1Var3;
        java.lang.Class cls3 = cls;
        boolean z18 = z17;
        eVar14.b(mo48798x742925663, str7, "POST", str8, cronetTaskResult5.f18210x4be65c14, cronetTaskResult5.f18209x953f8a7, i17, 1, eVar13.b(), java.lang.System.currentTimeMillis(), null, this.f527452e.f527455c.f527467p);
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(cls3, z18))).c(1791L, 10L, 1L, false);
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(cls3, z18))).c(1791L, 12L, java.lang.System.currentTimeMillis() - this.f527452e.f527455c.f527473v, false);
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(cls3, z18))).c(1800L, 3L, java.lang.System.currentTimeMillis() - this.f527452e.f527455c.A, false);
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(cls3, z18))).c(1800L, 1L, 1L, false);
    }
}
