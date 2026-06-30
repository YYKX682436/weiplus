package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class m1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private m1() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar2;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar3;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar4;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f c12333xba065a6f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f) obj;
        if (c12333xba065a6f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPrepareTask", "PrepareCall invoke NULL input");
            if (rVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
                c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_PREPARE_DONE;
                c12334xbda92906.f165920f = null;
                c12334xbda92906.f165919e = null;
                c12334xbda92906.f165921g = null;
                rVar.a(c12334xbda92906);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = c12333xba065a6f.f165915f;
        java.lang.String str = c11809xbc286be4.f128811x;
        java.lang.String str2 = c11809xbc286be4.f158811d;
        int i17 = c11809xbc286be4.f158814g;
        int i18 = c12333xba065a6f.f165916g.f169323f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "PrepareCall#invoke username[%s] appId[%s]", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1(this, rVar, str2, c12333xba065a6f, i17, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.k(c12333xba065a6f.f165915f.f128810w, true);
        if (k17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 x2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2(c12333xba065a6f.f165913d, c12333xba065a6f.f165915f, c12333xba065a6f.f165916g, c12333xba065a6f.f165917h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l1(this, str, str2, rVar, x2Var, i17, i18, c12333xba065a6f);
            if (gm0.j1.i().f354741a.f354832d) {
                l1Var.b();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "prepareCall kernel startup not done yet, wait for it, username[%s] appId[%s]", str, str2);
                gm0.z1 z1Var = gm0.j1.i().f354741a;
                z1Var.a(z1Var.f354835g, l1Var);
            }
            k17 = x2Var;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be42 = c12333xba065a6f.f165915f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c6.b(22, str2, c11809xbc286be42.L, i17, c11809xbc286be42.f128817z);
            long j17 = k17.f166903o;
            if (j17 > 0 && rVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda929062 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
                c12334xbda929062.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_NEED_DOWNLOAD;
                c12334xbda929062.f165923i = j17;
                rVar.a(c12334xbda929062);
            }
        }
        k17.f166898h = j1Var;
        if (k17.A1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "setCallback, username[%s] appId[%s], invoke onFallbackBackupWxaAttrsRequested", k17.f166907q, k17.f166908r);
            j1Var.b();
            return;
        }
        if (k17.B1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "setCallback, username[%s], appId[%s], invoke notifyAppRestartOnLaunchRequested", k17.f166907q, k17.f166908r);
            j1Var.C();
            return;
        }
        if (k17.f166899i && k17.f166902n != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify] setResultCallback already done %s %d, errorAction=%s, sessionId:%s, instanceId:%s", k17.f166908r, java.lang.Integer.valueOf(k17.f166909s), k17.f166902n.a(1), k17.f166917y, k17.f166894d);
            k17.i(k17.f166902n);
            k17.e("setCallback");
            k17.c("setCallback");
        }
        if (k17.f166919y1 && (rVar5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) k17.f166898h).f166214d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda929063 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
            c12334xbda929063.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_ON_SYNC_JSAPIINFO_START;
            rVar5.a(c12334xbda929063);
        }
        if (k17.f166921z1 && (rVar4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) k17.f166898h).f166214d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda929064 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
            c12334xbda929064.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_ON_SYNC_APPID_ABTEST_INFO_START;
            rVar4.a(c12334xbda929064);
        }
        if (k17.f166901m && k17.f166898h != null && (rVar3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) k17.f166898h).f166214d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda929065 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
            c12334xbda929065.f165922h = 100;
            c12334xbda929065.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_DOWNLOAD_PROGRESS;
            rVar3.a(c12334xbda929065);
        }
        if (k17.f166900l1 != null && k17.f166900l1.booleanValue() && (rVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j1) k17.f166898h).f166214d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda929066 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
            c12334xbda929066.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_ON_SYNC_LAUNCH_START;
            rVar2.a(c12334xbda929066);
        }
        k17.f();
    }
}
