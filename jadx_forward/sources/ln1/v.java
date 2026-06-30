package ln1;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln1.x f401379f;

    public v(ln1.x xVar, java.lang.String str, java.lang.String str2) {
        this.f401379f = xVar;
        this.f401377d = str;
        this.f401378e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f401379f.f401388i) {
            ln1.x xVar = this.f401379f;
            if (xVar.f401380a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRecoverMerger", "startMergeImpl cancel, msgDataId[%s], transferMsgList[%d], totalMsgList[%d], transferSessions[%d], totalSession[%d]", this.f401377d, java.lang.Long.valueOf(xVar.f401387h), java.lang.Long.valueOf(this.f401379f.f401386g), java.lang.Integer.valueOf(this.f401379f.f401384e.size()), java.lang.Integer.valueOf(this.f401379f.f401385f));
                if (!this.f401379f.f401381b) {
                    this.f401379f.f401381b = true;
                    tn1.e.a(this.f401379f.f401398s, true);
                    ln1.x xVar2 = this.f401379f;
                    ln1.x.a(xVar2, xVar2.f401405z, xVar2.A);
                }
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                try {
                    java.lang.String str = kn1.k.m(this.f401377d) + this.f401377d;
                    com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                    com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
                    android.util.Pair pair = new android.util.Pair(new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec(-1L), new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec(-1L));
                    this.f401379f.f401397r = ln1.x.b(r5, str, r5.f401398s, pair, this.f401378e, c19772x1c2cd081, c19762x487075a);
                    oo1.o.f428684a.f(c19772x1c2cd081.f38869x6ac9171);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "recoverMsgLists, sessionName = " + c19772x1c2cd081 + ", mMsgListMsgCount = " + this.f401379f.f401397r);
                    try {
                        ln1.x xVar3 = this.f401379f;
                        long j17 = xVar3.f401397r;
                        xVar3.f401391l += j17 > 0 ? j17 : 0L;
                        int size = xVar3.f401384e.size();
                        ln1.x xVar4 = this.f401379f;
                        xVar4.f401384e.add((java.lang.String) xVar4.f401383d.get(this.f401377d));
                        this.f401379f.f401387h++;
                        this.f401379f.f401389j.e().f391142a = 26;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        kn1.g e17 = this.f401379f.f401389j.e();
                        long j18 = this.f401379f.f401387h;
                        ln1.x xVar5 = this.f401379f;
                        e17.f391145d = (int) (j18 > xVar5.f401386g ? 100L : (xVar5.f401387h * 100) / this.f401379f.f401386g);
                        this.f401379f.i(26);
                        if (this.f401379f.f401384e.size() > size) {
                            ln1.x xVar6 = this.f401379f;
                            xVar6.f401395p.f136903g = xVar6.f401384e.size();
                            ln1.x xVar7 = this.f401379f;
                            xVar7.f401394o.D("MMKV_BACKUP_ERROR_CACHE", xVar7.f401395p.m());
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "transferMsgList = " + this.f401379f.f401387h + ", totalMsgList = " + this.f401379f.f401386g);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl msgDataId[%s] merge finish, transferMsgList[%d], transferSessions[%d], msgListMsgCount:%d, receiveMsgCount:%d, costTime:%d", this.f401377d, java.lang.Long.valueOf(this.f401379f.f401387h), java.lang.Integer.valueOf(this.f401379f.f401384e.size()), java.lang.Long.valueOf(this.f401379f.f401397r), java.lang.Long.valueOf(this.f401379f.f401391l), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupRecoverMerger", e18, "startMergeImpl msgDataId[%s] error", this.f401377d);
                    if (z65.c.a()) {
                        throw e18;
                    }
                    try {
                        ln1.x xVar8 = this.f401379f;
                        long j19 = xVar8.f401397r;
                        xVar8.f401391l += j19 > 0 ? j19 : 0L;
                        int size2 = xVar8.f401384e.size();
                        ln1.x xVar9 = this.f401379f;
                        xVar9.f401384e.add((java.lang.String) xVar9.f401383d.get(this.f401377d));
                        this.f401379f.f401387h++;
                        this.f401379f.f401389j.e().f391142a = 26;
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        kn1.g e19 = this.f401379f.f401389j.e();
                        long j27 = this.f401379f.f401387h;
                        ln1.x xVar10 = this.f401379f;
                        e19.f391145d = (int) (j27 > xVar10.f401386g ? 100L : (xVar10.f401387h * 100) / this.f401379f.f401386g);
                        this.f401379f.i(26);
                        if (this.f401379f.f401384e.size() > size2) {
                            ln1.x xVar11 = this.f401379f;
                            xVar11.f401395p.f136903g = xVar11.f401384e.size();
                            ln1.x xVar12 = this.f401379f;
                            xVar12.f401394o.D("MMKV_BACKUP_ERROR_CACHE", xVar12.f401395p.m());
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "transferMsgList = " + this.f401379f.f401387h + ", totalMsgList = " + this.f401379f.f401386g);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl msgDataId[%s] merge finish, transferMsgList[%d], transferSessions[%d], msgListMsgCount:%d, receiveMsgCount:%d, costTime:%d", this.f401377d, java.lang.Long.valueOf(this.f401379f.f401387h), java.lang.Integer.valueOf(this.f401379f.f401384e.size()), java.lang.Long.valueOf(this.f401379f.f401397r), java.lang.Long.valueOf(this.f401379f.f401391l), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (java.lang.Throwable th6) {
                try {
                    ln1.x xVar13 = this.f401379f;
                    long j28 = xVar13.f401397r;
                    xVar13.f401391l += j28 > 0 ? j28 : 0L;
                    int size3 = xVar13.f401384e.size();
                    ln1.x xVar14 = this.f401379f;
                    xVar14.f401384e.add((java.lang.String) xVar14.f401383d.get(this.f401377d));
                    this.f401379f.f401387h++;
                    this.f401379f.f401389j.e().f391142a = 26;
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    kn1.g e27 = this.f401379f.f401389j.e();
                    long j29 = this.f401379f.f401387h;
                    ln1.x xVar15 = this.f401379f;
                    e27.f391145d = (int) (j29 > xVar15.f401386g ? 100L : (xVar15.f401387h * 100) / this.f401379f.f401386g);
                    this.f401379f.i(26);
                    if (this.f401379f.f401384e.size() > size3) {
                        ln1.x xVar16 = this.f401379f;
                        xVar16.f401395p.f136903g = xVar16.f401384e.size();
                        ln1.x xVar17 = this.f401379f;
                        xVar17.f401394o.D("MMKV_BACKUP_ERROR_CACHE", xVar17.f401395p.m());
                    }
                } catch (java.lang.Exception unused3) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "transferMsgList = " + this.f401379f.f401387h + ", totalMsgList = " + this.f401379f.f401386g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl msgDataId[%s] merge finish, transferMsgList[%d], transferSessions[%d], msgListMsgCount:%d, receiveMsgCount:%d, costTime:%d", this.f401377d, java.lang.Long.valueOf(this.f401379f.f401387h), java.lang.Integer.valueOf(this.f401379f.f401384e.size()), java.lang.Long.valueOf(this.f401379f.f401397r), java.lang.Long.valueOf(this.f401379f.f401391l), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                throw th6;
            }
        }
    }
}
