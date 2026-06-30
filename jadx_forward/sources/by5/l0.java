package by5;

/* loaded from: classes13.dex */
public abstract class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f118061d;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f118062a = r() + "Scheduler";

    /* renamed from: b, reason: collision with root package name */
    public boolean f118063b = false;

    /* renamed from: c, reason: collision with root package name */
    public by5.n0 f118064c;

    public static boolean H(long j17) {
        return j17 >= 1800000 && j17 < 259200000;
    }

    public static boolean I(double d17, double d18) {
        return d17 >= 0.0d && d17 <= 24.0d && d18 >= 0.0d && d18 <= 24.0d && d18 >= d17;
    }

    public static void W(boolean z17) {
        f118061d = z17;
    }

    public static long m() {
        long i17 = com.p314xaae8f345.p3210x3857dc.b.m().i("force_cmd_period", "tools", 0) * 60000;
        if (H(i17)) {
            return i17;
        }
        long j17 = by5.e4.f117972a;
        if (H(j17)) {
            return j17;
        }
        com.p314xaae8f345.p3210x3857dc.b m17 = com.p314xaae8f345.p3210x3857dc.b.m();
        m17.getClass();
        int i18 = -1;
        try {
            java.lang.String g17 = m17.g("setConfigPeriod", "tools");
            if (g17 != null && !g17.isEmpty()) {
                int parseInt = java.lang.Integer.parseInt(g17);
                if (parseInt >= 30) {
                    i18 = parseInt * 60 * 1000;
                }
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d(m17.n(), "getCmdFetchConfigPeriodMills, error", th6);
        }
        long j18 = i18;
        if (H(j18)) {
            return j18;
        }
        return 21600000L;
    }

    public static double p(double d17, double d18, double d19) {
        if (d17 > d19 || d19 < d18) {
            by5.c4.c("Scheduler", "getRandomTime, currentHour is bigger than endHour");
            return 0.0d;
        }
        if (d18 >= d17) {
            d17 = d18;
        }
        return d17 + (java.lang.Math.random() * (d19 - d17));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long u(by5.g r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.l0.u(by5.g, java.lang.String):long");
    }

    public static double v(double d17, double d18) {
        if (d18 >= d17 && d18 >= 0.0d && d18 <= 32.0d) {
            return d18;
        }
        return 24.0d;
    }

    public static double w(double d17) {
        if (d17 < 0.0d || d17 > 24.0d) {
            return 0.0d;
        }
        return d17;
    }

    public boolean A() {
        java.lang.String[] split;
        java.lang.String g17 = com.p314xaae8f345.p3210x3857dc.b.m().g("free_update_time_zone", "tools");
        if (android.text.TextUtils.isEmpty(g17) || !g17.contains("-") || (split = g17.split("-")) == null || split.length != 2) {
            return false;
        }
        by5.z d17 = by5.a0.d(split[0]);
        if (!d17.f118148a) {
            return false;
        }
        by5.z d18 = by5.a0.d(split[1]);
        if (!d18.f118148a || !I(d17.a(), d18.a())) {
            return false;
        }
        double a17 = by5.a0.a();
        return a17 >= d17.a() && a17 <= d18.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[LOOP:1: B:41:0x00db->B:73:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean B(long r18, double r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.l0.B(long, double):boolean");
    }

    public synchronized boolean C() {
        java.util.Date date = new java.util.Date();
        java.util.Date q17 = q();
        if (q17 == null) {
            return true;
        }
        return date.getTime() - q17.getTime() >= 86400000;
    }

    public boolean D(by5.n0 n0Var, by5.n0 n0Var2) {
        by5.m0 m0Var = n0Var.f118107m;
        int i17 = m0Var.f118070e;
        by5.m0 m0Var2 = n0Var2.f118107m;
        if (i17 == m0Var2.f118070e && m0Var.f118084s == m0Var2.f118084s && m0Var.f118081p == m0Var2.f118081p && m0Var.f118079n == m0Var2.f118079n && E(m0Var.f118083r, m0Var2.f118083r)) {
            by5.m0 m0Var3 = n0Var.f118107m;
            java.lang.String str = m0Var3.f118073h;
            by5.m0 m0Var4 = n0Var2.f118107m;
            if (E(str, m0Var4.f118073h) && E(m0Var3.f118076k, m0Var4.f118076k) && E(m0Var3.f118074i, m0Var4.f118074i) && E(m0Var3.f118077l, m0Var4.f118077l) && m0Var3.f118080o == m0Var4.f118080o && m0Var3.f118078m == m0Var4.f118078m && E(m0Var3.f118072g, m0Var4.f118072g) && E(m0Var3.f118075j, m0Var4.f118075j) && m0Var3.f118087v == m0Var4.f118087v && m0Var3.f118090y == m0Var4.f118090y && E(m0Var3.f118091z, m0Var4.f118091z) && E(m0Var3.A, m0Var4.A)) {
                return true;
            }
        }
        return false;
    }

    public boolean E(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2)) {
            return true;
        }
        return str == null ? str == str2 : str.equals(str2);
    }

    public synchronized boolean F(boolean z17) {
        return G(z17, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[Catch: all -> 0x01fe, TryCatch #0 {, blocks: (B:6:0x000b, B:10:0x0014, B:12:0x001a, B:15:0x0023, B:17:0x002a, B:20:0x0030, B:22:0x003c, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:32:0x0082, B:33:0x00ab, B:36:0x00e1, B:41:0x00f0, B:46:0x00fc, B:48:0x0153, B:50:0x0159, B:53:0x0171, B:55:0x0177, B:59:0x0195, B:61:0x019b, B:65:0x01ae, B:67:0x01c3, B:70:0x01dc, B:72:0x0106, B:76:0x0124, B:80:0x0139, B:87:0x01e6), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159 A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000b, B:10:0x0014, B:12:0x001a, B:15:0x0023, B:17:0x002a, B:20:0x0030, B:22:0x003c, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:32:0x0082, B:33:0x00ab, B:36:0x00e1, B:41:0x00f0, B:46:0x00fc, B:48:0x0153, B:50:0x0159, B:53:0x0171, B:55:0x0177, B:59:0x0195, B:61:0x019b, B:65:0x01ae, B:67:0x01c3, B:70:0x01dc, B:72:0x0106, B:76:0x0124, B:80:0x0139, B:87:0x01e6), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0171 A[Catch: all -> 0x01fe, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x000b, B:10:0x0014, B:12:0x001a, B:15:0x0023, B:17:0x002a, B:20:0x0030, B:22:0x003c, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:32:0x0082, B:33:0x00ab, B:36:0x00e1, B:41:0x00f0, B:46:0x00fc, B:48:0x0153, B:50:0x0159, B:53:0x0171, B:55:0x0177, B:59:0x0195, B:61:0x019b, B:65:0x01ae, B:67:0x01c3, B:70:0x01dc, B:72:0x0106, B:76:0x0124, B:80:0x0139, B:87:0x01e6), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean G(boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.l0.G(boolean, int):boolean");
    }

    public void J(by5.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        by5.m0 m0Var = n0Var.f118107m;
        n0Var.f118101g = m0Var.f118074i;
        n0Var.f118100f = m0Var.f118077l;
        n0Var.f118103i = m0Var.f118081p;
        n0Var.f118102h = m0Var.f118079n;
        n0Var.f118104j = false;
        n0Var.f118105k = dy5.a.SEVEN_ZIP;
    }

    public void K(by5.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        by5.m0 m0Var = n0Var.f118107m;
        n0Var.f118101g = m0Var.f118073h;
        n0Var.f118100f = m0Var.f118076k;
        n0Var.f118103i = m0Var.f118081p;
        n0Var.f118102h = m0Var.f118079n;
        n0Var.f118104j = false;
        n0Var.f118105k = dy5.a.ZIP;
    }

    public void L(by5.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        by5.m0 m0Var = n0Var.f118107m;
        n0Var.f118101g = m0Var.f118072g;
        n0Var.f118100f = m0Var.f118075j;
        n0Var.f118103i = m0Var.f118080o;
        n0Var.f118102h = m0Var.f118078m;
        n0Var.f118104j = true;
        n0Var.f118105k = dy5.a.NONE;
    }

    public boolean M() {
        return false;
    }

    public synchronized boolean N() {
        if (!M() && !f118061d) {
            return false;
        }
        by5.c4.a(this.f118062a, "needForceUpdateRuntime, force update");
        by5.s0.e(903L, o() + 157, 1L);
        return true;
    }

    public void O() {
        i().f118095a = java.lang.System.currentTimeMillis();
        i().f118096b = by5.a.b();
        android.content.SharedPreferences.Editor edit = j().edit();
        edit.putLong("nLastFetchConfigTime", i().f118095a);
        edit.putString("strLastFetchAbi", i().f118096b);
        edit.commit();
    }

    public void P(int i17) {
        if (i17 == -10) {
            android.content.SharedPreferences j17 = j();
            int i18 = j17.getInt("nTryUseSharedCoreCount", 0);
            by5.c4.a(this.f118062a, "onUpdateFailed, shared mode, current nTryUseSharedCoreCount:" + i18);
            int i19 = i18 + 1;
            i().f118099e = i19;
            android.content.SharedPreferences.Editor edit = j17.edit();
            edit.putInt("nTryUseSharedCoreCount", i19);
            U(edit, i19);
            edit.commit();
            return;
        }
        if (!by5.y.b()) {
            by5.c4.g(this.f118062a, "onUpdateFailed, network not available");
            return;
        }
        android.content.SharedPreferences j18 = j();
        int i27 = j18.getInt("nTryCnt", 0) + 1;
        if (i17 == -3 || i17 == -4) {
            if (!(dy5.c.f326278a != null) || android.text.TextUtils.isEmpty(i().f118107m.f118074i)) {
                K(i());
            } else {
                J(i());
            }
            V(i());
            by5.c4.a(this.f118062a, "onUpdateFailed, do patch failed, switch to " + i().f118105k.name() + " full package update");
        } else if ((i17 == -5 || i17 == -13) && !i().f118104j && dy5.a.SEVEN_ZIP == i().f118105k) {
            K(i());
            V(i());
            by5.c4.a(this.f118062a, "onUpdateFailed, 7zip full package update failed, switch to zip full package update");
        } else if (i17 <= -2 && i17 >= -5) {
            i27 = (int) (i27 + 5);
        }
        if (i27 > 5) {
            by5.c4.a(this.f118062a, "onUpdateFailed, failed too many times, abandon current scheduler");
            a();
            return;
        }
        i().f118098d = i27;
        android.content.SharedPreferences.Editor edit2 = j18.edit();
        edit2.putInt("nTryCnt", i27);
        U(edit2, i27);
        edit2.commit();
    }

    public by5.n0 Q(by5.n0 n0Var) {
        boolean z17;
        by5.n0 i17 = i();
        if (n0Var == null) {
            by5.c4.a(this.f118062a, "onUpdateScheduleConfig, got no schedule need download");
            if (x()) {
                if (i17 != null) {
                    by5.c4.a(this.f118062a, "onUpdateScheduleConfig, clear current scheduler, version:" + i17.f118107m.f118070e);
                }
                V(null);
            }
            return null;
        }
        boolean D = D(n0Var, i17);
        by5.m0 m0Var = n0Var.f118107m;
        if (!D) {
            if (x()) {
                by5.s0.e(903L, 149L, 1L);
                by5.c4.a(this.f118062a, "onUpdateScheduleConfig, got newer scheduler, version: " + m0Var.f118070e);
            }
            V(n0Var);
            return n0Var;
        }
        boolean E = E(m0Var.f118067b, i17.f118107m.f118067b);
        boolean z18 = true;
        by5.m0 m0Var2 = i17.f118107m;
        if (E) {
            z17 = false;
        } else {
            by5.c4.a(this.f118062a, "onUpdateScheduleConfig, update UPDATE_SPEED_CONFIG");
            m0Var2.f118067b = m0Var.f118067b;
            z17 = true;
        }
        if (!E(m0Var.f118068c, m0Var2.f118068c)) {
            by5.c4.a(this.f118062a, "onUpdateScheduleConfig, update UPDATE_FORWARD_SPEED_CONFIG");
            m0Var2.f118068c = m0Var.f118068c;
            z17 = true;
        }
        if (E(m0Var.f118069d, m0Var2.f118069d)) {
            z18 = z17;
        } else {
            by5.c4.a(this.f118062a, "onUpdateScheduleConfig, update UPDATE_SCHEDULE_TIME_RANGE_BIND");
            m0Var2.f118069d = m0Var.f118069d;
        }
        if (z18) {
            V(i17);
        }
        by5.c4.a(this.f118062a, "onUpdateScheduleConfig, got same scheduler, use current version");
        return i17;
    }

    public void R() {
        long j17;
        double a17 = by5.a0.a();
        if (a17 < i().f118107m.f118085t || a17 < 6.0d) {
            by5.c4.a(this.f118062a, "rescheduleToNextDay, currentHour:" + a17 + ", so still schedule in today");
            j17 = -((long) (a17 * 3600000.0d));
        } else {
            j17 = by5.a0.c();
        }
        long p17 = (long) (j17 + (p(0.0d, w(i().f118107m.f118085t), v(i().f118107m.f118085t, i().f118107m.f118086u)) * 3600000.0d));
        i().f118097c = java.lang.System.currentTimeMillis() + p17;
        V(i());
        by5.c4.a(this.f118062a, "rescheduleToNextDay, " + (p17 / 60000) + " minutes later");
    }

    public synchronized void S() {
        android.content.SharedPreferences.Editor edit = j().edit();
        edit.putLong("nLastFetchConfigTime", 0L);
        edit.commit();
        i().f118095a = 0L;
    }

    public synchronized void T() {
        android.content.SharedPreferences.Editor edit = j().edit();
        edit.putLong("nLastFetchConfigTime", 0L);
        edit.commit();
        i().f118095a = 0L;
        i().f118097c = 0L;
    }

    public final synchronized void U(android.content.SharedPreferences.Editor editor, int i17) {
        long j17 = i17 * 7200000;
        editor.putLong("nTimeToUpdate", java.lang.System.currentTimeMillis() + j17);
        by5.c4.a(this.f118062a, "resetNextUpdateTime, update after " + (j17 / 60000) + " minutes");
    }

    public synchronized void V(by5.n0 n0Var) {
        this.f118064c = n0Var;
        if (n0Var == null) {
            this.f118064c = new by5.n0();
        }
        by5.n0 n0Var2 = this.f118064c;
        r();
        n0Var2.getClass();
        android.content.SharedPreferences.Editor edit = j().edit();
        edit.putString("strConfigVer", this.f118064c.f118107m.f118066a);
        edit.putString("UPDATE_SPEED_CONFIG", this.f118064c.f118107m.f118067b);
        edit.putString("UPDATE_FORWARD_SPEED_CONFIG", this.f118064c.f118107m.f118068c);
        edit.putString("UPDATE_SCHEDULE_TIME_RANGE_BIND", this.f118064c.f118107m.f118069d);
        edit.putInt("version", this.f118064c.f118107m.f118070e);
        edit.putString("strVersionDetail", this.f118064c.f118107m.f118071f);
        edit.putString("strPatchUrl", this.f118064c.f118107m.f118072g);
        edit.putString("strFullZipPackageUrl", this.f118064c.f118107m.f118073h);
        edit.putString("strFullSevenZipPackageUrl", this.f118064c.f118107m.f118074i);
        edit.putString("patchMd5", this.f118064c.f118107m.f118075j);
        edit.putString("strFullZipPackageMd5", this.f118064c.f118107m.f118076k);
        edit.putString("strFullSevenZipPackageMd5", this.f118064c.f118107m.f118077l);
        edit.putBoolean("bPatchUseCdn", this.f118064c.f118107m.f118078m);
        edit.putBoolean("bFullPackageUseCdn", this.f118064c.f118107m.f118079n);
        edit.putBoolean("bCanPatchUseCellular", this.f118064c.f118107m.f118080o);
        edit.putBoolean("bCanFullPackageUseCellular", this.f118064c.f118107m.f118081p);
        edit.putBoolean("bTryUseSharedCore", this.f118064c.f118107m.f118082q);
        edit.putString("strAbi", this.f118064c.f118107m.f118083r);
        edit.putInt("versionId", this.f118064c.f118107m.f118084s);
        edit.putFloat("timeHourStart", this.f118064c.f118107m.f118085t);
        edit.putFloat("timeHourEnd", this.f118064c.f118107m.f118086u);
        edit.putInt("nPatchType", this.f118064c.f118107m.f118087v);
        edit.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f118064c.f118107m.f118088w);
        edit.putInt("nPatchTargetVersion", this.f118064c.f118107m.f118089x);
        edit.putBoolean("bUseBootsFlowControl", this.f118064c.f118107m.f118090y);
        edit.putString("strBootsFlowControlKey", this.f118064c.f118107m.f118091z);
        edit.putString("strBootsFlowControlKeyExpirationDate", this.f118064c.f118107m.A);
        edit.putString("strMd5", this.f118064c.f118100f);
        edit.putString("strUrl", this.f118064c.f118101g);
        edit.putBoolean("bIsPatchUpdate", this.f118064c.f118104j);
        edit.putBoolean("bCanUseCellular", this.f118064c.f118103i);
        edit.putBoolean("bUseCdn", this.f118064c.f118102h);
        edit.putLong("nTimeToUpdate", this.f118064c.f118097c);
        edit.putInt("nTryCnt", this.f118064c.f118098d);
        edit.putInt("nTryUseSharedCoreCount", this.f118064c.f118099e);
        edit.putBoolean("skipSubFileMD5Check", this.f118064c.f118106l);
        edit.putString("fullPackageType", this.f118064c.f118105k.name());
        edit.commit();
    }

    public synchronized boolean X() {
        by5.m0 m0Var = this.f118064c.f118107m;
        if (!m0Var.f118090y) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(m0Var.f118091z) && !android.text.TextUtils.isEmpty(this.f118064c.f118107m.A)) {
            return true;
        }
        by5.c4.c(this.f118062a, "Can't use remote update throttle because some field is empty. Key: \"" + this.f118064c.f118107m.f118091z + "\", Date: \"" + this.f118064c.f118107m.A + "\"");
        return false;
    }

    public void a() {
        by5.c4.a(this.f118062a, "abandon current scheduler");
        V(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:15:0x0043, B:17:0x0049, B:20:0x0052, B:22:0x0067, B:25:0x006d, B:27:0x0079, B:29:0x0095, B:32:0x009b, B:34:0x00a7, B:44:0x003c, B:4:0x0002, B:6:0x0012, B:8:0x001e, B:10:0x0032), top: B:3:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {, blocks: (B:15:0x0043, B:17:0x0049, B:20:0x0052, B:22:0x0067, B:25:0x006d, B:27:0x0079, B:29:0x0095, B:32:0x009b, B:34:0x00a7, B:44:0x003c, B:4:0x0002, B:6:0x0012, B:8:0x001e, B:10:0x0032), top: B:3:0x0002, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b() {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 1
            java.lang.String r1 = by5.a.b()     // Catch: java.lang.Throwable -> L3b
            by5.n0 r2 = r11.i()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = r2.f118096b     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L43
            by5.n0 r1 = r11.i()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r1.f118096b     // Catch: java.lang.Throwable -> L3b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L43
            java.lang.String r1 = "true"
            com.tencent.xweb.c r2 = com.p314xaae8f345.p3210x3857dc.c.z()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "disable_abi_switch_reset_config_time"
            java.lang.String r4 = "tools"
            java.lang.String r2 = r2.g(r3, r4)     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L43
            java.lang.String r1 = r11.f118062a     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "checkNeedFetchConfig, disable_abi_switch_reset_config_time is true"
            by5.c4.a(r1, r2)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r11)
            return r0
        L3b:
            r1 = move-exception
            java.lang.String r2 = r11.f118062a     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "checkNeedFetchConfig, identify abi switch error"
            by5.c4.d(r2, r3, r1)     // Catch: java.lang.Throwable -> Lb2
        L43:
            boolean r1 = r11.z()     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L52
            java.lang.String r1 = r11.f118062a     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "checkNeedFetchConfig, in FreeFetchConfigTimeZone"
            by5.c4.a(r1, r2)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r11)
            return r0
        L52:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb2
            by5.n0 r3 = r11.i()     // Catch: java.lang.Throwable -> Lb2
            long r3 = r3.f118095a     // Catch: java.lang.Throwable -> Lb2
            long r5 = m()     // Catch: java.lang.Throwable -> Lb2
            long r7 = r3 + r5
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r8 = 0
            if (r7 > 0) goto L76
            long r5 = r5 + r1
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L6d
            goto L76
        L6d:
            java.lang.String r3 = r11.f118062a     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = "checkNeedFetchConfig, no need"
            by5.c4.a(r3, r4)     // Catch: java.lang.Throwable -> Lb2
            r3 = r8
            goto L77
        L76:
            r3 = r0
        L77:
            if (r3 == 0) goto Lb0
            android.content.SharedPreferences r3 = r11.j()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = "nLastFetchConfigTime"
            r5 = 0
            long r3 = r3.getLong(r4, r5)     // Catch: java.lang.Throwable -> Lb2
            by5.n0 r5 = r11.i()     // Catch: java.lang.Throwable -> Lb2
            r5.f118095a = r3     // Catch: java.lang.Throwable -> Lb2
            long r5 = m()     // Catch: java.lang.Throwable -> Lb2
            long r9 = r3 + r5
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 > 0) goto La4
            long r1 = r1 + r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L9b
            goto La4
        L9b:
            java.lang.String r1 = r11.f118062a     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "checkNeedFetchConfig, no need"
            by5.c4.a(r1, r2)     // Catch: java.lang.Throwable -> Lb2
            r1 = r8
            goto La5
        La4:
            r1 = r0
        La5:
            if (r1 == 0) goto Lb0
            java.lang.String r1 = r11.f118062a     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "checkNeedFetchConfig, need fetch config"
            by5.c4.a(r1, r2)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r11)
            return r0
        Lb0:
            monitor-exit(r11)
            return r8
        Lb2:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.l0.b():boolean");
    }

    public java.lang.String c() {
        java.lang.String str;
        java.lang.String str2;
        if (!x()) {
            return this.f118062a + ": has no scheduler";
        }
        java.util.Date date = new java.util.Date(i().f118097c);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f118062a);
        sb6.append(": has scheduler for ver = ");
        sb6.append(i().f118107m.f118070e);
        sb6.append(" version id = ");
        sb6.append(i().f118107m.f118084s);
        sb6.append(" update time in ");
        sb6.append(date);
        java.lang.String str3 = "";
        if (android.text.TextUtils.isEmpty(i().f118107m.f118067b)) {
            str = "";
        } else {
            str = " update speed config:" + i().f118107m.f118067b;
        }
        sb6.append(str);
        if (android.text.TextUtils.isEmpty(i().f118107m.f118068c)) {
            str2 = "";
        } else {
            str2 = " update forward speed config:" + i().f118107m.f118068c;
        }
        sb6.append(str2);
        if (!android.text.TextUtils.isEmpty(i().f118107m.f118069d)) {
            str3 = " update time range config:" + i().f118107m.f118069d;
        }
        sb6.append(str3);
        return sb6.toString();
    }

    public double d(java.lang.String str) {
        return e(str, by5.a0.a());
    }

    public double e(java.lang.String str, double d17) {
        by5.o0 b17;
        if (android.text.TextUtils.isEmpty(str)) {
            return 1.0d;
        }
        java.lang.String[] split = android.text.TextUtils.isEmpty(str) ? null : str.split(";");
        if (split == null || split.length == 0) {
            this.f118063b = true;
            return 1.0d;
        }
        for (java.lang.String str2 : split) {
            if (!android.text.TextUtils.isEmpty(str2) && (b17 = by5.o0.b(str2)) != null && d17 >= b17.f118109a && d17 <= b17.f118110b) {
                return b17.a(d17);
            }
        }
        return 1.0d;
    }

    public final java.lang.String f(boolean z17) {
        return (!z17 || android.text.TextUtils.isEmpty(i().f118107m.f118068c)) ? (z17 || android.text.TextUtils.isEmpty(i().f118107m.f118067b)) ? k(z17) : i().f118107m.f118067b : i().f118107m.f118068c;
    }

    public double g() {
        this.f118063b = false;
        return d(f(true)) * 3600000.0d;
    }

    public double h() {
        this.f118063b = false;
        return d(f(false)) * 3600000.0d;
    }

    public synchronized by5.n0 i() {
        by5.n0 n0Var = this.f118064c;
        if (n0Var != null) {
            return n0Var;
        }
        this.f118064c = new by5.n0();
        r();
        android.content.SharedPreferences j17 = j();
        this.f118064c.f118095a = j17.getLong("nLastFetchConfigTime", 0L);
        this.f118064c.f118096b = j17.getString("strLastFetchAbi", "");
        if (!j17.contains("strUrl")) {
            return this.f118064c;
        }
        this.f118064c.f118107m.f118066a = j17.getString("strConfigVer", "");
        this.f118064c.f118107m.f118067b = j17.getString("UPDATE_SPEED_CONFIG", "");
        this.f118064c.f118107m.f118068c = j17.getString("UPDATE_FORWARD_SPEED_CONFIG", "");
        this.f118064c.f118107m.f118069d = j17.getString("UPDATE_SCHEDULE_TIME_RANGE_BIND", "");
        this.f118064c.f118107m.f118070e = j17.getInt("version", 0);
        this.f118064c.f118107m.f118071f = j17.getString("strVersionDetail", "");
        this.f118064c.f118107m.f118072g = j17.getString("strPatchUrl", "");
        this.f118064c.f118107m.f118073h = j17.getString("strFullZipPackageUrl", "");
        this.f118064c.f118107m.f118074i = j17.getString("strFullSevenZipPackageUrl", "");
        this.f118064c.f118107m.f118075j = j17.getString("patchMd5", "");
        this.f118064c.f118107m.f118076k = j17.getString("strFullZipPackageMd5", "");
        this.f118064c.f118107m.f118077l = j17.getString("strFullSevenZipPackageMd5", "");
        this.f118064c.f118107m.f118078m = j17.getBoolean("bPatchUseCdn", false);
        this.f118064c.f118107m.f118079n = j17.getBoolean("bFullPackageUseCdn", false);
        this.f118064c.f118107m.f118080o = j17.getBoolean("bCanPatchUseCellular", false);
        this.f118064c.f118107m.f118081p = j17.getBoolean("bCanFullPackageUseCellular", false);
        this.f118064c.f118107m.f118082q = j17.getBoolean("bTryUseSharedCore", true);
        this.f118064c.f118107m.f118083r = j17.getString("strAbi", "");
        this.f118064c.f118107m.f118084s = j17.getInt("versionId", 0);
        this.f118064c.f118107m.f118085t = j17.getFloat("timeHourStart", -1.0f);
        this.f118064c.f118107m.f118086u = j17.getFloat("timeHourEnd", -1.0f);
        this.f118064c.f118107m.f118087v = j17.getInt("nPatchType", 1);
        this.f118064c.f118107m.f118088w = j17.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
        this.f118064c.f118107m.f118089x = j17.getInt("nPatchTargetVersion", 0);
        this.f118064c.f118100f = j17.getString("strMd5", "");
        this.f118064c.f118101g = j17.getString("strUrl", "");
        this.f118064c.f118104j = j17.getBoolean("bIsPatchUpdate", false);
        this.f118064c.f118097c = j17.getLong("nTimeToUpdate", 0L);
        this.f118064c.f118098d = j17.getInt("nTryCnt", 0);
        this.f118064c.f118099e = j17.getInt("nTryUseSharedCoreCount", 0);
        this.f118064c.f118103i = j17.getBoolean("bCanUseCellular", false);
        this.f118064c.f118102h = j17.getBoolean("bUseCdn", false);
        this.f118064c.f118106l = j17.getBoolean("skipSubFileMD5Check", true);
        this.f118064c.f118105k = dy5.a.m126454xdce0328(j17.getString("fullPackageType", "NONE"));
        return this.f118064c;
    }

    public android.content.SharedPreferences j() {
        return by5.d4.a("xweb_scheduler_" + r(), false);
    }

    public abstract java.lang.String k(boolean z17);

    public java.lang.String l() {
        return com.p314xaae8f345.p3210x3857dc.b.m().g("UPDATE_SCHEDULE_TIME_RANGE_BIND", "tools");
    }

    public java.lang.String n() {
        return com.p314xaae8f345.p3210x3857dc.b.m().g("FREE_FETCH_CONFIG_TIME_ZONE", "tools");
    }

    public int o() {
        return 0;
    }

    public synchronized java.util.Date q() {
        java.util.Date date;
        try {
            date = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.CHINA).parse(this.f118064c.f118107m.A);
        } catch (java.text.ParseException e17) {
            by5.c4.d(this.f118062a, "getRemoteThrottleExpirationDate(), error: ", e17);
            date = null;
        }
        return date;
    }

    public abstract java.lang.String r();

    public final boolean s(double d17, double d18, long j17) {
        boolean z17;
        boolean z18 = true;
        boolean z19 = false;
        if (j17 < 0 || j17 > 3600000) {
            z17 = false;
        } else {
            by5.s0.e(903L, o() + 154, 1L);
            z17 = true;
        }
        if (j17 >= 0 && j17 < d17) {
            z19 = true;
        }
        if (j17 >= 0 || (-j17) >= d18) {
            z18 = z19;
        } else {
            by5.s0.e(903L, o() + 161, 1L);
        }
        if (z17 && !z18) {
            by5.s0.e(903L, o() + 150, 1L);
        }
        if (!z17 && z18) {
            by5.s0.e(903L, o() + 151, 1L);
        }
        by5.c4.a(this.f118062a, "shouldUpdateDefault = " + z17 + ", shouldUpdateFromConfig = " + z18);
        return z18;
    }

    public synchronized java.lang.String t() {
        if (M()) {
            return "FORCE_UPDATE";
        }
        if (!X()) {
            return "LOCAL";
        }
        return "REMOTE-" + this.f118064c.f118107m.f118091z;
    }

    public synchronized boolean x() {
        boolean z17;
        if (i() != null && i().f118107m.f118070e > 0) {
            z17 = android.text.TextUtils.isEmpty(i().f118101g) ? false : true;
        }
        return z17;
    }

    public void y(by5.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        by5.m0 m0Var = n0Var.f118107m;
        if (!android.text.TextUtils.isEmpty(m0Var.f118072g)) {
            L(n0Var);
            return;
        }
        if (!android.text.TextUtils.isEmpty(m0Var.f118074i)) {
            if (dy5.c.f326278a != null) {
                J(n0Var);
                return;
            }
        }
        K(n0Var);
    }

    public boolean z() {
        by5.o0 b17;
        java.lang.String n17 = n();
        java.lang.String[] split = android.text.TextUtils.isEmpty(n17) ? null : n17.split(";");
        if (split != null && split.length != 0) {
            double a17 = by5.a0.a();
            for (java.lang.String str : split) {
                if (!android.text.TextUtils.isEmpty(str) && (b17 = by5.o0.b(str)) != null && a17 >= b17.f118109a && a17 <= b17.f118110b) {
                    return ((double) by5.a4.c()) < b17.f118111c * 10000.0d;
                }
            }
        }
        return false;
    }
}
