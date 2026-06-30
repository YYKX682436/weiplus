package yn1;

@j95.b
/* loaded from: classes11.dex */
public final class h4 extends i95.w implements mv.w {

    /* renamed from: i */
    public static final yn1.b4 f545224i = new yn1.b4(null);

    /* renamed from: d */
    public volatile pi0.l1 f545225d;

    /* renamed from: e */
    public java.lang.Integer f545226e;

    /* renamed from: f */
    public java.lang.Integer f545227f;

    /* renamed from: g */
    public java.lang.Boolean f545228g;

    /* renamed from: h */
    public java.lang.Boolean f545229h;

    public static /* synthetic */ void Ai(yn1.h4 h4Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        h4Var.wi(z17, z18);
    }

    public void Bi(int i17) {
        yn1.z0 z0Var = yn1.z0.f545466a;
        if (!z0Var.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[handleStatusNotify] GlobalHolder is not initialized");
            return;
        }
        if (i17 != 19) {
            if (i17 != 20) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "Pause migration task");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b.h(yn1.f4.f545203a);
            return;
        }
        bw5.bj0 i18 = z0Var.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "Stop migration task, curStatus=" + i18);
        int ordinal = i18.ordinal();
        if (ordinal == 2 || ordinal == 8 || ordinal == 9) {
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b.p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("aoa_migration_expt_val", 0) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Di() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.f545228g
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            goto L5e
        L9:
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "aoa_migration_expt_val"
            r3 = 0
            if (r0 == 0) goto L38
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableAoaMigration r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableAoaMigration
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L35
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            r4.A(r2, r0)
        L35:
            if (r0 == 0) goto L44
            goto L42
        L38:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L44
        L42:
            r0 = r1
            goto L45
        L44:
            r0 = r3
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[isAoaEnable] isEnable="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r5.f545228g = r1
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.Di():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("cross_near_migration_expt_val", 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ni() {
        /*
            r5 = this;
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "cross_near_migration_expt_val"
            r3 = 0
            if (r0 == 0) goto L2f
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableCrossNearMigration r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableCrossNearMigration
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L2c
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            r4.A(r2, r0)
        L2c:
            if (r0 == 0) goto L3a
            goto L3b
        L2f:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[isCrossNearEnable] isEnable="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.Ni():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("clicfg_enable_multi_pipeline", 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ri() {
        /*
            r5 = this;
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "clicfg_enable_multi_pipeline"
            r3 = 0
            if (r0 == 0) goto L2f
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableMultiPipeline r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableMultiPipeline
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L2c
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            r4.A(r2, r0)
        L2c:
            if (r0 == 0) goto L3a
            goto L3b
        L2f:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[isMultiPipelineEnabled] isEnable="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.Ri():boolean");
    }

    public boolean Ui() {
        java.lang.Integer num = this.f545226e;
        if (num == null || num.intValue() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "Exp value of clicfg_enable_new_migration is 1");
            this.f545226e = 1;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("new_migration_task_manage_expt_val", 0) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Vi() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.f545229h
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            goto L5e
        L9:
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "new_migration_task_manage_expt_val"
            r3 = 0
            if (r0 == 0) goto L38
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableNewMigrationTaskManage r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableNewMigrationTaskManage
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L35
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            r4.A(r2, r0)
        L35:
            if (r0 == 0) goto L44
            goto L42
        L38:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L44
        L42:
            r0 = r1
            goto L45
        L44:
            r0 = r3
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[isNewTaskManagementLogicEnable] isEnable="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r5.f545229h = r1
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.Vi():boolean");
    }

    public boolean Zi() {
        if (!gm0.j1.b().n()) {
            throw new java.lang.IllegalArgumentException("[isPomEnable] Invalid user context.".toString());
        }
        java.lang.Integer num = this.f545227f;
        if (num == null || num.intValue() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "Exp value of clicfg_enable_pure_offline_migration is 1");
            this.f545227f = 1;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("clicfg_migration_enable_verify_userdb", 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean aj() {
        /*
            r5 = this;
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "clicfg_migration_enable_verify_userdb"
            r3 = 0
            if (r0 == 0) goto L2f
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableVerifyUserDB r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableVerifyUserDB
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L2c
            com.tencent.mm.sdk.platformtools.o4 r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            r4.A(r2, r0)
        L2c:
            if (r0 == 0) goto L3a
            goto L3b
        L2f:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[isVerificationEnabled] isEnable="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.aj():boolean");
    }

    public void bj(android.content.Context context, com.p314xaae8f345.mm.p2495xc50a8b8b.f connectInfoResp, mv.a enterScene) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connectInfoResp, "connectInfoResp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        Ai(this, false, false, 3, null);
        bw5.bj0 i17 = yn1.z0.f545466a.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[notifyWithConnectInfo] status=" + i17);
        int ordinal = i17.ordinal();
        if (!(ordinal == 0 || ordinal == 3 || ordinal == 6 || ordinal == 14 || ordinal == 15)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.RoamMigrationService", "[notifyWithConnectInfo] Intent denied with status=" + i17);
            return;
        }
        if (connectInfoResp instanceof bw5.ud0) {
            str = "pom";
        } else if (!(connectInfoResp instanceof bw5.s10)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.RoamMigrationService", "[notifyWithConnectInfo] unknown resp type");
            return;
        } else {
            if (((bw5.s10) connectInfoResp).f114293r == 100 && i17 != bw5.bj0.NOTIFY_CODE_UI_WAIT_PC_RESP && i17 != bw5.bj0.NOTIFY_CODE_PAUSE) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.RoamMigrationService", "[notifyWithConnectInfo] Migration has cancelled by user");
                return;
            }
            str = "legacy";
        }
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("action", "startWithConnectInfo"), new jz5.l("type", str), new jz5.l("respBuf", connectInfoResp.mo14344x5f01b1f6()));
        mv.d0 d0Var = mv.d0.f413020e;
        Ai(this, false, false, 3, null);
        hj(context, d0Var, enterScene, i18);
        if (ih.a.b("clicfg_migration_check_db_size_enable", 0) == 0) {
            return;
        }
        pm0.v.K(null, yn1.c4.f545165d);
    }

    public void cj(android.content.Context context, mv.a enterScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        Ai(this, false, false, 3, null);
        bw5.bj0 i17 = yn1.z0.f545466a.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[openHome] status=" + i17);
        if (i17 == bw5.bj0.NOTIFY_CODE_NONE) {
            hj(context, mv.d0.f413021f, enterScene, null);
        } else {
            hj(context, mv.d0.f413020e, enterScene, null);
        }
    }

    public void fj(android.content.Context context) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "openHomeAsGuest, CdnTransportFeatureService.getEngine()");
        if (yn1.z0.f545466a.m()) {
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            try {
                com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MM.Mig.RoamMigrationService", e17, "get cdn engine failed", new java.lang.Object[0]);
                yn1.k4.e(1, false, 3, 0L, "get cdn engine failed", 10, null);
                z17 = true;
            }
        }
        z17 = false;
        wi(false, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[openHome] status=" + yn1.z0.f545466a.i());
        hj(context, mv.d0.f413022g, mv.a.f413002e, null);
    }

    public final void hj(android.content.Context context, mv.d0 d0Var, mv.a aVar, java.util.Map map) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b.m(aVar.f413009d);
        yn1.g4 g4Var = new yn1.g4(this, d0Var, map, context, null);
        yn1.c0 c0Var = yn1.d0.f545169b;
        if (c0Var == null || p3325xe03a0797.p3326xc267989b.l.d(c0Var, c0Var.f545154e, null, g4Var, 2, null) == null) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationCoroutineScope", "[launchUI] Scope must be initialized", null);
            p3325xe03a0797.p3326xc267989b.p2.a(p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null), null, 1, null);
        }
    }

    public void ij(android.content.Context context, bw5.zi0 errorCode, mv.a enterScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCode, "errorCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[showErrorDetailPage] errorCode=" + errorCode + ", enterScene=" + enterScene);
        Ai(this, false, false, 3, null);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f fVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b;
        bw5.k0 c17 = fVar.c();
        bw5.q0 q0Var = c17.f110727i[2] ? c17.f110723e : new bw5.q0();
        if (q0Var.b() == bw5.bj0.NOTIFY_CODE_NONE || q0Var.b() == bw5.bj0.NOTIFY_CODE_UI_READY || q0Var.b() == bw5.bj0.NOTIFY_CODE_UI_IMMIGRATION_GUIDE || q0Var.b() == bw5.bj0.NOTIFY_CODE_UI_DIRECT_CONNECT_GUIDE) {
            q0Var.f113409d = bw5.bj0.NOTIFY_CODE_ERROR;
            boolean[] zArr = q0Var.f113413h;
            zArr[1] = true;
            q0Var.f113410e = java.lang.String.valueOf(errorCode.f117560d);
            zArr[2] = true;
            fVar.g(q0Var);
        }
        hj(context, mv.d0.f413020e, enterScene, null);
    }

    public void mj(android.content.Context context, java.lang.String deviceName, java.lang.String contactName, java.lang.String nickName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceName, "deviceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactName, "contactName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[showExportToPcOnDemand] deviceName=" + deviceName + ", contactName=" + contactName + ", nickName=" + nickName + ", createTime=" + j17);
        Ai(this, false, false, 3, null);
        bw5.bj0 i17 = yn1.z0.f545466a.i();
        if (i17 != bw5.bj0.NOTIFY_CODE_NONE) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Mig.RoamMigrationService", "[showExportToPcOnDemand] status=" + i17);
            return;
        }
        bw5.x0 x0Var = new bw5.x0();
        x0Var.f116418d = deviceName;
        boolean[] zArr = x0Var.f116422h;
        zArr[1] = true;
        x0Var.f116420f = nickName;
        zArr[3] = true;
        x0Var.f116419e = contactName;
        zArr[2] = true;
        x0Var.f116421g = j17 / 1000;
        zArr[4] = true;
        hj(context, mv.d0.f413020e, mv.a.f413007m, kz5.c1.i(new jz5.l("action", "exportPcOnDemand"), new jz5.l("singleExportArgs", x0Var.mo14344x5f01b1f6())));
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        java.lang.String k17 = gm0.j1.b().k();
        yn1.z0 z0Var = yn1.z0.f545466a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        if (z0Var.o(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[MigrationService.onAccountInitialized] Nothing to do.");
            return;
        }
        if (z0Var.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.RoamMigrationService", "[onAccountInitialized] Error: preUsername=" + z0Var.j() + ", currentUsername=" + k17);
            z0Var.t(Integer.MAX_VALUE);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[onAccountReleased] Uninitialize all if necessary.");
        yn1.z0.f545466a.t(Integer.MAX_VALUE);
    }

    public final void wi(boolean z17, boolean z18) {
        int i17;
        if (z17) {
            m134976x2690a4ac();
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
                c01.w9.a();
            }
        }
        yn1.z0 z0Var = yn1.z0.f545466a;
        synchronized (z0Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[initialize] accountAware=" + z17 + ", instanceId=" + yn1.z0.f545468c);
            if (yn1.z0.f545468c != 0) {
                yn1.z0.f545468c++;
                return;
            }
            yn1.z0.f545468c++;
            if (z17) {
                java.lang.String k17 = gm0.j1.b().k();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
                yn1.z0.f545480o = k17;
                java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("roam_backup"), "migration").o(), "cache").o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[getCachePath] migrationCache=".concat(o17));
                if (!com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                    com.p314xaae8f345.mm.vfs.w6.u(o17);
                }
                yn1.z0.f545479n = o17;
                i17 = gm0.j1.b().h();
            } else {
                yn1.z0.f545480o = "";
                java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("po_migration"), "cache").o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[getCachePath] migrationCache=".concat(o18));
                if (!com.p314xaae8f345.mm.vfs.w6.j(o18)) {
                    com.p314xaae8f345.mm.vfs.w6.u(o18);
                }
                yn1.z0.f545479n = o18;
                i17 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[initialize] username=" + z0Var.j() + ", path=" + z0Var.g());
            z0Var.e();
            boolean Vi = ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Vi();
            boolean Ri = ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ri();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f fVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b;
            fVar.d(i17, z0Var.j(), z0Var.g(), Vi, Ri);
            fVar.l(((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).aj());
            yn1.z0.f545484s = z0Var.m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "isEnableCdnMigration = " + yn1.z0.f545484s + ", disableCdn = " + z18);
            if (yn1.z0.f545484s && !z18) {
                fVar.k(true);
                bw5.he0 f17 = z0Var.f();
                yn1.z0.f545478m = f17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "networkStatus = " + f17);
                fVar.n(f17);
            }
            byte[] bytes = (((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Di() ? "true" : "false").getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            fVar.b("expt_aoa", bytes);
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[initialize] init backup storage");
                yn1.z0.f545470e = true;
                tn1.f.f().c();
            }
            yn1.d0.f545168a.a();
            bw5.k0 c17 = fVar.c();
            bw5.q0 q0Var = c17.f110727i[2] ? c17.f110723e : new bw5.q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q0Var, "getStatusModel(...)");
            yn1.z0.f545471f = q0Var;
            bw5.o0 o0Var = c17.f110727i[3] ? c17.f110724f : new bw5.o0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o0Var, "getProgressModel(...)");
            yn1.z0.f545472g = o0Var;
            bw5.p0 p0Var = c17.f110727i[1] ? c17.f110722d : new bw5.p0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p0Var, "getSceneModel(...)");
            yn1.z0.f545473h = p0Var;
            bw5.aj0 aj0Var = c17.f110727i[5] ? c17.f110726h : new bw5.aj0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aj0Var, "getRoamMigInfo(...)");
            yn1.z0.f545474i = aj0Var;
            yn1.z0.f545477l = "";
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(yn1.z0.f545485t);
            if (!((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Vi()) {
                ((kp.i1) z0Var.k()).hj();
            }
        }
    }
}
