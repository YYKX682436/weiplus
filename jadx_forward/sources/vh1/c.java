package vh1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult f518544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh1.d f518545e;

    public c(vh1.d dVar, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult) {
        this.f518545e = dVar;
        this.f518544d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult = this.f518544d;
        int i17 = (int) cronetTaskResult.f18209x953f8a7;
        int i18 = cronetTaskResult.f18207xec0a8ff;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cronetTaskResult.f18200x139cb015);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult2 = this.f518544d;
        java.lang.String str = cronetTaskResult2.f18201x5336c059;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cronetTaskResult2.f18207xec0a8ff);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(this.f518544d.f18209x953f8a7);
        vh1.f fVar = this.f518545e.f518548c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s", valueOf, str, valueOf2, valueOf3, fVar.f518566v, fVar.f518568x);
        if (this.f518544d.f18200x139cb015 != 0) {
            if (this.f518545e.f518548c.f518555h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetTaskCompleted downloadFile fail already callback");
                return;
            }
            this.f518545e.f518548c.f518555h = true;
            vh1.f fVar2 = this.f518545e.f518548c;
            fVar2.f518553f.d(fVar2.f518557m, fVar2.f518556i, "download fail:" + this.f518544d.f18200x139cb015 + ":" + this.f518544d.f18201x5336c059, 600001);
            uh1.h1 h1Var = (uh1.h1) nd.f.d(uh1.h1.class, true);
            java.lang.String mo48798x74292566 = this.f518545e.f518548c.f518552e.mo48798x74292566();
            vh1.f fVar3 = this.f518545e.f518548c;
            ((ch1.e) h1Var).b(mo48798x74292566, fVar3.f518569y, "GET", fVar3.f518556i, 0L, (long) i17, i18, 2, fVar3.c(), java.lang.System.currentTimeMillis(), this.f518545e.f518548c.f518557m, "");
            uh1.j0.E(1197L, 11L, 1L);
            uh1.j0.E(1197L, 13L, java.lang.System.currentTimeMillis() - this.f518545e.f518548c.f518565u);
            return;
        }
        this.f518545e.f518548c.getClass();
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(1197L, (i18 < 100 || i18 >= 200) ? 200 == i18 ? 21 : (i18 <= 200 || i18 >= 300) ? 302 == i18 ? 23 : (i18 < 300 || i18 >= 400) ? 404 == i18 ? 25 : (i18 < 400 || i18 >= 500) ? i18 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20, 1L, false);
        java.lang.String str2 = "";
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.f518544d.m37975xf2b694d9().entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key.equalsIgnoreCase("Content-Type") || key.equalsIgnoreCase("content-type")) {
                vh1.f fVar4 = this.f518545e.f518548c;
                str2 = fVar4.e(value, fVar4.f518556i);
            }
        }
        if (i18 != 200 && uh1.j0.B(i18)) {
            java.lang.String str3 = this.f518544d.f18203xbc380d75;
            if (!android.text.TextUtils.isEmpty(str3)) {
                vh1.f fVar5 = this.f518545e.f518548c;
                int i19 = fVar5.f518551d;
                int i27 = i19 - 1;
                fVar5.f518551d = i27;
                if (i19 > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "redirect(%d) URL(%s) to URL(%s)", java.lang.Integer.valueOf(i27), this.f518545e.f518548c.f518556i, str3);
                    vh1.f fVar6 = this.f518545e.f518548c;
                    fVar6.f518556i = str3;
                    fVar6.run();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandDownloadWorker", "reach the max redirect count(%d)", 15);
                if (this.f518545e.f518548c.f518555h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                    return;
                }
                this.f518545e.f518548c.f518555h = true;
                vh1.f fVar7 = this.f518545e.f518548c;
                if (fVar7.E) {
                    fVar7.f518553f.b(fVar7.f518557m, str2, fVar7.f518556i, i18, 0L, uh1.j0.k(this.f518544d.f18214x153dd026));
                } else {
                    fVar7.f518553f.b(fVar7.f518557m, str2, fVar7.f518556i, i18, 0L, null);
                }
                uh1.h1 h1Var2 = (uh1.h1) nd.f.d(uh1.h1.class, true);
                java.lang.String mo48798x742925662 = this.f518545e.f518548c.f518552e.mo48798x74292566();
                vh1.f fVar8 = this.f518545e.f518548c;
                ((ch1.e) h1Var2).b(mo48798x742925662, fVar8.f518569y, "GET", fVar8.f518556i, 0L, i17, i18, 1, fVar8.c(), java.lang.System.currentTimeMillis(), this.f518545e.f518548c.f518557m, str2);
                uh1.j0.E(1197L, 10L, 1L);
                uh1.j0.E(1197L, 12L, java.lang.System.currentTimeMillis() - this.f518545e.f518548c.f518565u);
                return;
            }
        }
        java.lang.String str4 = str2;
        if (this.f518545e.f518548c.f518555h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetTaskCompleted already callback");
            return;
        }
        this.f518545e.f518548c.f518555h = true;
        if (this.f518545e.f518548c.f518554g) {
            vh1.f fVar9 = this.f518545e.f518548c;
            if (fVar9.E) {
                fVar9.f518553f.b(fVar9.f518557m, str4, fVar9.f518556i, i18, i17, uh1.j0.k(this.f518544d.f18214x153dd026));
            } else {
                fVar9.f518553f.b(fVar9.f518557m, str4, fVar9.f518556i, i18, i17, null);
            }
            vh1.f fVar10 = this.f518545e.f518548c;
            long j17 = this.f518544d.f18209x953f8a7;
            long c17 = fVar10.c();
            fVar10.getClass();
            if (j17 <= 0 || c17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "reportCronetSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c17));
            } else {
                uh1.j0.E(1197L, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 30 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 31 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 32 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 33 : 34, (long) ((j17 / c17) * 0.9765625d));
            }
            this.f518545e.f518547b.getClass();
        } else {
            vh1.f fVar11 = this.f518545e.f518548c;
            fVar11.f518553f.d(fVar11.f518557m, fVar11.f518556i, "force stop", 600004);
        }
        vh1.f fVar12 = this.f518545e.f518548c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet download file finished taskid:%s,CronetRequestId:%s,contentType:%s", fVar12.f518566v, fVar12.f518568x, str4);
        vh1.f fVar13 = this.f518545e.f518548c;
        fVar13.f518553f.e(fVar13.f518566v);
        uh1.h1 h1Var3 = (uh1.h1) nd.f.d(uh1.h1.class, true);
        java.lang.String mo48798x742925663 = this.f518545e.f518548c.f518552e.mo48798x74292566();
        vh1.f fVar14 = this.f518545e.f518548c;
        ((ch1.e) h1Var3).b(mo48798x742925663, fVar14.f518569y, "GET", fVar14.f518556i, 0L, i17, i18, 1, fVar14.c(), java.lang.System.currentTimeMillis(), this.f518545e.f518548c.f518557m, str4);
        uh1.j0.E(1197L, 10L, 1L);
        uh1.j0.E(1197L, 12L, java.lang.System.currentTimeMillis() - this.f518545e.f518548c.f518565u);
    }
}
