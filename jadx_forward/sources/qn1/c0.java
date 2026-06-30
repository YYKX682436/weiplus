package qn1;

/* loaded from: classes12.dex */
public class c0 implements kn1.l {

    /* renamed from: l, reason: collision with root package name */
    public static boolean f446478l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f446479m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f446480n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f446481o;

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f446482a;

    /* renamed from: b, reason: collision with root package name */
    public kn1.b f446483b;

    /* renamed from: c, reason: collision with root package name */
    public ln1.s f446484c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f446485d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f446486e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f446487f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f446488g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f446489h = new qn1.u(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f446490i = new qn1.v(this);

    /* renamed from: j, reason: collision with root package name */
    public final sn1.h f446491j = new qn1.x(this);

    /* renamed from: k, reason: collision with root package name */
    public final kn1.c f446492k = new qn1.b0(this);

    @Override // kn1.l
    public void a(int i17, long j17, long j18, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "setBackupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18));
        if (i17 == 0) {
            j17 = 0;
            j18 = 0;
        }
        qn1.c.i();
        android.content.SharedPreferences.Editor edit = kn1.f.d().edit();
        edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", i17);
        edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", i18);
        edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", j17);
        edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", j18);
        edit.apply();
    }

    public void b(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest");
        sn1.i.I(3, this.f446489h);
        sn1.t0 t0Var = new sn1.t0(qn1.c.i().f391137b);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
        gm0.j1.i();
        kn1.k.d(0L, c19769x48b92ec, c19769x48b92ec2, gm0.j1.u().d());
        int i17 = f446478l ? 3 : ((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue() ? 0 : 1;
        wn1.p r17 = kn1.k.r(c19769x48b92ec2.f38866x6ac9171);
        java.lang.Long valueOf = java.lang.Long.valueOf((qn1.c.i().m().f() / 1024) / 1024);
        java.lang.String str = qn1.c.o().f446502i;
        wn1.q qVar = t0Var.f491633u;
        qVar.f528987e = 0L;
        qVar.f528988f = j17;
        qVar.f528989g = 0L;
        qVar.f528990h = r17;
        qVar.f528991i = valueOf.longValue();
        qVar.f528992m = i17;
        qVar.f528993n = str;
        xn1.c.b("SessionId", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest sessionCount:%d, transferType:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        t0Var.K();
    }

    public void c(int i17, int i18) {
        long j17;
        ln1.s sVar = this.f446484c;
        if (sVar != null) {
            long j18 = sVar.f401345m;
            long currentTimeMillis = j18 != 0 ? java.lang.System.currentTimeMillis() - j18 : 0L;
            r1 = this.f446484c.f401344l / 1024;
            j17 = currentTimeMillis;
        } else {
            j17 = 0;
        }
        long j19 = j17 / 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(r1), java.lang.Long.valueOf(j19), 1, java.lang.Integer.valueOf(qn1.c.i().j().f446507n));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], backupCostTime[%d s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(r1), java.lang.Long.valueOf(j19));
    }

    public void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "cancel, isSelf[%b], Caller:%s", java.lang.Boolean.valueOf(z17), com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a());
        f446480n = true;
        if (!z17) {
            qn1.c.i().j().d();
        }
        ln1.s sVar = this.f446484c;
        if (sVar != null) {
            sVar.a();
        }
        sn1.i.Z();
        sn1.i.a0();
        sn1.i.Y();
        qn1.c.i().g();
    }

    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "BackupPcServer init.");
        f446480n = false;
        this.f446486e = false;
        f446481o = z17;
        sn1.i.f491548i = this.f446491j;
        ln1.s sVar = this.f446484c;
        if (sVar != null) {
            sVar.a();
        }
        this.f446484c = new ln1.s(qn1.c.i(), 1, this.f446492k);
    }

    public void f(java.util.LinkedList linkedList) {
        this.f446482a = linkedList;
        qn1.c.i();
        android.content.SharedPreferences d17 = kn1.f.d();
        f446479m = d17.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0) == 1;
        this.f446487f = d17.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
        this.f446488g = d17.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
        f446478l = d17.getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0) == 1;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
        objArr[1] = java.lang.Boolean.valueOf(f446479m);
        objArr[2] = java.lang.Boolean.valueOf(f446478l);
        objArr[3] = java.lang.Long.valueOf(this.f446487f);
        objArr[4] = java.lang.Long.valueOf(this.f446488g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "setBackupChooseData users size[%d], isSelectTime[%b], isQuickBackup[%b], selectStartTime[%d], selectEndTime[%d]", objArr);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN, java.lang.Boolean.TRUE);
    }

    public void g(int i17) {
        ((qn1.b0) this.f446492k).a(i17);
    }
}
