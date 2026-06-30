package by5;

/* loaded from: classes13.dex */
public abstract class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f36528d;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f36529a = r() + "Scheduler";

    /* renamed from: b, reason: collision with root package name */
    public boolean f36530b = false;

    /* renamed from: c, reason: collision with root package name */
    public by5.n0 f36531c;

    public static boolean H(long j17) {
        return j17 >= 1800000 && j17 < 259200000;
    }

    public static boolean I(double d17, double d18) {
        return d17 >= 0.0d && d17 <= 24.0d && d18 >= 0.0d && d18 <= 24.0d && d18 >= d17;
    }

    public static void W(boolean z17) {
        f36528d = z17;
    }

    public static long m() {
        long i17 = com.tencent.xweb.b.m().i("force_cmd_period", "tools", 0) * 60000;
        if (H(i17)) {
            return i17;
        }
        long j17 = by5.e4.f36439a;
        if (H(j17)) {
            return j17;
        }
        com.tencent.xweb.b m17 = com.tencent.xweb.b.m();
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
        java.lang.String g17 = com.tencent.xweb.b.m().g("free_update_time_zone", "tools");
        if (android.text.TextUtils.isEmpty(g17) || !g17.contains("-") || (split = g17.split("-")) == null || split.length != 2) {
            return false;
        }
        by5.z d17 = by5.a0.d(split[0]);
        if (!d17.f36615a) {
            return false;
        }
        by5.z d18 = by5.a0.d(split[1]);
        if (!d18.f36615a || !I(d17.a(), d18.a())) {
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
        by5.m0 m0Var = n0Var.f36574m;
        int i17 = m0Var.f36537e;
        by5.m0 m0Var2 = n0Var2.f36574m;
        if (i17 == m0Var2.f36537e && m0Var.f36551s == m0Var2.f36551s && m0Var.f36548p == m0Var2.f36548p && m0Var.f36546n == m0Var2.f36546n && E(m0Var.f36550r, m0Var2.f36550r)) {
            by5.m0 m0Var3 = n0Var.f36574m;
            java.lang.String str = m0Var3.f36540h;
            by5.m0 m0Var4 = n0Var2.f36574m;
            if (E(str, m0Var4.f36540h) && E(m0Var3.f36543k, m0Var4.f36543k) && E(m0Var3.f36541i, m0Var4.f36541i) && E(m0Var3.f36544l, m0Var4.f36544l) && m0Var3.f36547o == m0Var4.f36547o && m0Var3.f36545m == m0Var4.f36545m && E(m0Var3.f36539g, m0Var4.f36539g) && E(m0Var3.f36542j, m0Var4.f36542j) && m0Var3.f36554v == m0Var4.f36554v && m0Var3.f36557y == m0Var4.f36557y && E(m0Var3.f36558z, m0Var4.f36558z) && E(m0Var3.A, m0Var4.A)) {
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
        by5.m0 m0Var = n0Var.f36574m;
        n0Var.f36568g = m0Var.f36541i;
        n0Var.f36567f = m0Var.f36544l;
        n0Var.f36570i = m0Var.f36548p;
        n0Var.f36569h = m0Var.f36546n;
        n0Var.f36571j = false;
        n0Var.f36572k = dy5.a.SEVEN_ZIP;
    }

    public void K(by5.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        by5.m0 m0Var = n0Var.f36574m;
        n0Var.f36568g = m0Var.f36540h;
        n0Var.f36567f = m0Var.f36543k;
        n0Var.f36570i = m0Var.f36548p;
        n0Var.f36569h = m0Var.f36546n;
        n0Var.f36571j = false;
        n0Var.f36572k = dy5.a.ZIP;
    }

    public void L(by5.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        by5.m0 m0Var = n0Var.f36574m;
        n0Var.f36568g = m0Var.f36539g;
        n0Var.f36567f = m0Var.f36542j;
        n0Var.f36570i = m0Var.f36547o;
        n0Var.f36569h = m0Var.f36545m;
        n0Var.f36571j = true;
        n0Var.f36572k = dy5.a.NONE;
    }

    public boolean M() {
        return false;
    }

    public synchronized boolean N() {
        if (!M() && !f36528d) {
            return false;
        }
        by5.c4.a(this.f36529a, "needForceUpdateRuntime, force update");
        by5.s0.e(903L, o() + 157, 1L);
        return true;
    }

    public void O() {
        i().f36562a = java.lang.System.currentTimeMillis();
        i().f36563b = by5.a.b();
        android.content.SharedPreferences.Editor edit = j().edit();
        edit.putLong("nLastFetchConfigTime", i().f36562a);
        edit.putString("strLastFetchAbi", i().f36563b);
        edit.commit();
    }

    public void P(int i17) {
        if (i17 == -10) {
            android.content.SharedPreferences j17 = j();
            int i18 = j17.getInt("nTryUseSharedCoreCount", 0);
            by5.c4.a(this.f36529a, "onUpdateFailed, shared mode, current nTryUseSharedCoreCount:" + i18);
            int i19 = i18 + 1;
            i().f36566e = i19;
            android.content.SharedPreferences.Editor edit = j17.edit();
            edit.putInt("nTryUseSharedCoreCount", i19);
            U(edit, i19);
            edit.commit();
            return;
        }
        if (!by5.y.b()) {
            by5.c4.g(this.f36529a, "onUpdateFailed, network not available");
            return;
        }
        android.content.SharedPreferences j18 = j();
        int i27 = j18.getInt("nTryCnt", 0) + 1;
        if (i17 == -3 || i17 == -4) {
            if (!(dy5.c.f244745a != null) || android.text.TextUtils.isEmpty(i().f36574m.f36541i)) {
                K(i());
            } else {
                J(i());
            }
            V(i());
            by5.c4.a(this.f36529a, "onUpdateFailed, do patch failed, switch to " + i().f36572k.name() + " full package update");
        } else if ((i17 == -5 || i17 == -13) && !i().f36571j && dy5.a.SEVEN_ZIP == i().f36572k) {
            K(i());
            V(i());
            by5.c4.a(this.f36529a, "onUpdateFailed, 7zip full package update failed, switch to zip full package update");
        } else if (i17 <= -2 && i17 >= -5) {
            i27 = (int) (i27 + 5);
        }
        if (i27 > 5) {
            by5.c4.a(this.f36529a, "onUpdateFailed, failed too many times, abandon current scheduler");
            a();
            return;
        }
        i().f36565d = i27;
        android.content.SharedPreferences.Editor edit2 = j18.edit();
        edit2.putInt("nTryCnt", i27);
        U(edit2, i27);
        edit2.commit();
    }

    public by5.n0 Q(by5.n0 n0Var) {
        boolean z17;
        by5.n0 i17 = i();
        if (n0Var == null) {
            by5.c4.a(this.f36529a, "onUpdateScheduleConfig, got no schedule need download");
            if (x()) {
                if (i17 != null) {
                    by5.c4.a(this.f36529a, "onUpdateScheduleConfig, clear current scheduler, version:" + i17.f36574m.f36537e);
                }
                V(null);
            }
            return null;
        }
        boolean D = D(n0Var, i17);
        by5.m0 m0Var = n0Var.f36574m;
        if (!D) {
            if (x()) {
                by5.s0.e(903L, 149L, 1L);
                by5.c4.a(this.f36529a, "onUpdateScheduleConfig, got newer scheduler, version: " + m0Var.f36537e);
            }
            V(n0Var);
            return n0Var;
        }
        boolean E = E(m0Var.f36534b, i17.f36574m.f36534b);
        boolean z18 = true;
        by5.m0 m0Var2 = i17.f36574m;
        if (E) {
            z17 = false;
        } else {
            by5.c4.a(this.f36529a, "onUpdateScheduleConfig, update UPDATE_SPEED_CONFIG");
            m0Var2.f36534b = m0Var.f36534b;
            z17 = true;
        }
        if (!E(m0Var.f36535c, m0Var2.f36535c)) {
            by5.c4.a(this.f36529a, "onUpdateScheduleConfig, update UPDATE_FORWARD_SPEED_CONFIG");
            m0Var2.f36535c = m0Var.f36535c;
            z17 = true;
        }
        if (E(m0Var.f36536d, m0Var2.f36536d)) {
            z18 = z17;
        } else {
            by5.c4.a(this.f36529a, "onUpdateScheduleConfig, update UPDATE_SCHEDULE_TIME_RANGE_BIND");
            m0Var2.f36536d = m0Var.f36536d;
        }
        if (z18) {
            V(i17);
        }
        by5.c4.a(this.f36529a, "onUpdateScheduleConfig, got same scheduler, use current version");
        return i17;
    }

    public void R() {
        long j17;
        double a17 = by5.a0.a();
        if (a17 < i().f36574m.f36552t || a17 < 6.0d) {
            by5.c4.a(this.f36529a, "rescheduleToNextDay, currentHour:" + a17 + ", so still schedule in today");
            j17 = -((long) (a17 * 3600000.0d));
        } else {
            j17 = by5.a0.c();
        }
        long p17 = (long) (j17 + (p(0.0d, w(i().f36574m.f36552t), v(i().f36574m.f36552t, i().f36574m.f36553u)) * 3600000.0d));
        i().f36564c = java.lang.System.currentTimeMillis() + p17;
        V(i());
        by5.c4.a(this.f36529a, "rescheduleToNextDay, " + (p17 / 60000) + " minutes later");
    }

    public synchronized void S() {
        android.content.SharedPreferences.Editor edit = j().edit();
        edit.putLong("nLastFetchConfigTime", 0L);
        edit.commit();
        i().f36562a = 0L;
    }

    public synchronized void T() {
        android.content.SharedPreferences.Editor edit = j().edit();
        edit.putLong("nLastFetchConfigTime", 0L);
        edit.commit();
        i().f36562a = 0L;
        i().f36564c = 0L;
    }

    public final synchronized void U(android.content.SharedPreferences.Editor editor, int i17) {
        long j17 = i17 * 7200000;
        editor.putLong("nTimeToUpdate", java.lang.System.currentTimeMillis() + j17);
        by5.c4.a(this.f36529a, "resetNextUpdateTime, update after " + (j17 / 60000) + " minutes");
    }

    public synchronized void V(by5.n0 n0Var) {
        this.f36531c = n0Var;
        if (n0Var == null) {
            this.f36531c = new by5.n0();
        }
        by5.n0 n0Var2 = this.f36531c;
        r();
        n0Var2.getClass();
        android.content.SharedPreferences.Editor edit = j().edit();
        edit.putString("strConfigVer", this.f36531c.f36574m.f36533a);
        edit.putString("UPDATE_SPEED_CONFIG", this.f36531c.f36574m.f36534b);
        edit.putString("UPDATE_FORWARD_SPEED_CONFIG", this.f36531c.f36574m.f36535c);
        edit.putString("UPDATE_SCHEDULE_TIME_RANGE_BIND", this.f36531c.f36574m.f36536d);
        edit.putInt("version", this.f36531c.f36574m.f36537e);
        edit.putString("strVersionDetail", this.f36531c.f36574m.f36538f);
        edit.putString("strPatchUrl", this.f36531c.f36574m.f36539g);
        edit.putString("strFullZipPackageUrl", this.f36531c.f36574m.f36540h);
        edit.putString("strFullSevenZipPackageUrl", this.f36531c.f36574m.f36541i);
        edit.putString("patchMd5", this.f36531c.f36574m.f36542j);
        edit.putString("strFullZipPackageMd5", this.f36531c.f36574m.f36543k);
        edit.putString("strFullSevenZipPackageMd5", this.f36531c.f36574m.f36544l);
        edit.putBoolean("bPatchUseCdn", this.f36531c.f36574m.f36545m);
        edit.putBoolean("bFullPackageUseCdn", this.f36531c.f36574m.f36546n);
        edit.putBoolean("bCanPatchUseCellular", this.f36531c.f36574m.f36547o);
        edit.putBoolean("bCanFullPackageUseCellular", this.f36531c.f36574m.f36548p);
        edit.putBoolean("bTryUseSharedCore", this.f36531c.f36574m.f36549q);
        edit.putString("strAbi", this.f36531c.f36574m.f36550r);
        edit.putInt("versionId", this.f36531c.f36574m.f36551s);
        edit.putFloat("timeHourStart", this.f36531c.f36574m.f36552t);
        edit.putFloat("timeHourEnd", this.f36531c.f36574m.f36553u);
        edit.putInt("nPatchType", this.f36531c.f36574m.f36554v);
        edit.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f36531c.f36574m.f36555w);
        edit.putInt("nPatchTargetVersion", this.f36531c.f36574m.f36556x);
        edit.putBoolean("bUseBootsFlowControl", this.f36531c.f36574m.f36557y);
        edit.putString("strBootsFlowControlKey", this.f36531c.f36574m.f36558z);
        edit.putString("strBootsFlowControlKeyExpirationDate", this.f36531c.f36574m.A);
        edit.putString("strMd5", this.f36531c.f36567f);
        edit.putString("strUrl", this.f36531c.f36568g);
        edit.putBoolean("bIsPatchUpdate", this.f36531c.f36571j);
        edit.putBoolean("bCanUseCellular", this.f36531c.f36570i);
        edit.putBoolean("bUseCdn", this.f36531c.f36569h);
        edit.putLong("nTimeToUpdate", this.f36531c.f36564c);
        edit.putInt("nTryCnt", this.f36531c.f36565d);
        edit.putInt("nTryUseSharedCoreCount", this.f36531c.f36566e);
        edit.putBoolean("skipSubFileMD5Check", this.f36531c.f36573l);
        edit.putString("fullPackageType", this.f36531c.f36572k.name());
        edit.commit();
    }

    public synchronized boolean X() {
        by5.m0 m0Var = this.f36531c.f36574m;
        if (!m0Var.f36557y) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(m0Var.f36558z) && !android.text.TextUtils.isEmpty(this.f36531c.f36574m.A)) {
            return true;
        }
        by5.c4.c(this.f36529a, "Can't use remote update throttle because some field is empty. Key: \"" + this.f36531c.f36574m.f36558z + "\", Date: \"" + this.f36531c.f36574m.A + "\"");
        return false;
    }

    public void a() {
        by5.c4.a(this.f36529a, "abandon current scheduler");
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
            java.lang.String r2 = r2.f36563b     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L43
            by5.n0 r1 = r11.i()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r1.f36563b     // Catch: java.lang.Throwable -> L3b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L43
            java.lang.String r1 = "true"
            com.tencent.xweb.c r2 = com.tencent.xweb.c.z()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "disable_abi_switch_reset_config_time"
            java.lang.String r4 = "tools"
            java.lang.String r2 = r2.g(r3, r4)     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L43
            java.lang.String r1 = r11.f36529a     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "checkNeedFetchConfig, disable_abi_switch_reset_config_time is true"
            by5.c4.a(r1, r2)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r11)
            return r0
        L3b:
            r1 = move-exception
            java.lang.String r2 = r11.f36529a     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "checkNeedFetchConfig, identify abi switch error"
            by5.c4.d(r2, r3, r1)     // Catch: java.lang.Throwable -> Lb2
        L43:
            boolean r1 = r11.z()     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L52
            java.lang.String r1 = r11.f36529a     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "checkNeedFetchConfig, in FreeFetchConfigTimeZone"
            by5.c4.a(r1, r2)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r11)
            return r0
        L52:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb2
            by5.n0 r3 = r11.i()     // Catch: java.lang.Throwable -> Lb2
            long r3 = r3.f36562a     // Catch: java.lang.Throwable -> Lb2
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
            java.lang.String r3 = r11.f36529a     // Catch: java.lang.Throwable -> Lb2
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
            r5.f36562a = r3     // Catch: java.lang.Throwable -> Lb2
            long r5 = m()     // Catch: java.lang.Throwable -> Lb2
            long r9 = r3 + r5
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 > 0) goto La4
            long r1 = r1 + r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L9b
            goto La4
        L9b:
            java.lang.String r1 = r11.f36529a     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "checkNeedFetchConfig, no need"
            by5.c4.a(r1, r2)     // Catch: java.lang.Throwable -> Lb2
            r1 = r8
            goto La5
        La4:
            r1 = r0
        La5:
            if (r1 == 0) goto Lb0
            java.lang.String r1 = r11.f36529a     // Catch: java.lang.Throwable -> Lb2
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
            return this.f36529a + ": has no scheduler";
        }
        java.util.Date date = new java.util.Date(i().f36564c);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f36529a);
        sb6.append(": has scheduler for ver = ");
        sb6.append(i().f36574m.f36537e);
        sb6.append(" version id = ");
        sb6.append(i().f36574m.f36551s);
        sb6.append(" update time in ");
        sb6.append(date);
        java.lang.String str3 = "";
        if (android.text.TextUtils.isEmpty(i().f36574m.f36534b)) {
            str = "";
        } else {
            str = " update speed config:" + i().f36574m.f36534b;
        }
        sb6.append(str);
        if (android.text.TextUtils.isEmpty(i().f36574m.f36535c)) {
            str2 = "";
        } else {
            str2 = " update forward speed config:" + i().f36574m.f36535c;
        }
        sb6.append(str2);
        if (!android.text.TextUtils.isEmpty(i().f36574m.f36536d)) {
            str3 = " update time range config:" + i().f36574m.f36536d;
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
            this.f36530b = true;
            return 1.0d;
        }
        for (java.lang.String str2 : split) {
            if (!android.text.TextUtils.isEmpty(str2) && (b17 = by5.o0.b(str2)) != null && d17 >= b17.f36576a && d17 <= b17.f36577b) {
                return b17.a(d17);
            }
        }
        return 1.0d;
    }

    public final java.lang.String f(boolean z17) {
        return (!z17 || android.text.TextUtils.isEmpty(i().f36574m.f36535c)) ? (z17 || android.text.TextUtils.isEmpty(i().f36574m.f36534b)) ? k(z17) : i().f36574m.f36534b : i().f36574m.f36535c;
    }

    public double g() {
        this.f36530b = false;
        return d(f(true)) * 3600000.0d;
    }

    public double h() {
        this.f36530b = false;
        return d(f(false)) * 3600000.0d;
    }

    public synchronized by5.n0 i() {
        by5.n0 n0Var = this.f36531c;
        if (n0Var != null) {
            return n0Var;
        }
        this.f36531c = new by5.n0();
        r();
        android.content.SharedPreferences j17 = j();
        this.f36531c.f36562a = j17.getLong("nLastFetchConfigTime", 0L);
        this.f36531c.f36563b = j17.getString("strLastFetchAbi", "");
        if (!j17.contains("strUrl")) {
            return this.f36531c;
        }
        this.f36531c.f36574m.f36533a = j17.getString("strConfigVer", "");
        this.f36531c.f36574m.f36534b = j17.getString("UPDATE_SPEED_CONFIG", "");
        this.f36531c.f36574m.f36535c = j17.getString("UPDATE_FORWARD_SPEED_CONFIG", "");
        this.f36531c.f36574m.f36536d = j17.getString("UPDATE_SCHEDULE_TIME_RANGE_BIND", "");
        this.f36531c.f36574m.f36537e = j17.getInt("version", 0);
        this.f36531c.f36574m.f36538f = j17.getString("strVersionDetail", "");
        this.f36531c.f36574m.f36539g = j17.getString("strPatchUrl", "");
        this.f36531c.f36574m.f36540h = j17.getString("strFullZipPackageUrl", "");
        this.f36531c.f36574m.f36541i = j17.getString("strFullSevenZipPackageUrl", "");
        this.f36531c.f36574m.f36542j = j17.getString("patchMd5", "");
        this.f36531c.f36574m.f36543k = j17.getString("strFullZipPackageMd5", "");
        this.f36531c.f36574m.f36544l = j17.getString("strFullSevenZipPackageMd5", "");
        this.f36531c.f36574m.f36545m = j17.getBoolean("bPatchUseCdn", false);
        this.f36531c.f36574m.f36546n = j17.getBoolean("bFullPackageUseCdn", false);
        this.f36531c.f36574m.f36547o = j17.getBoolean("bCanPatchUseCellular", false);
        this.f36531c.f36574m.f36548p = j17.getBoolean("bCanFullPackageUseCellular", false);
        this.f36531c.f36574m.f36549q = j17.getBoolean("bTryUseSharedCore", true);
        this.f36531c.f36574m.f36550r = j17.getString("strAbi", "");
        this.f36531c.f36574m.f36551s = j17.getInt("versionId", 0);
        this.f36531c.f36574m.f36552t = j17.getFloat("timeHourStart", -1.0f);
        this.f36531c.f36574m.f36553u = j17.getFloat("timeHourEnd", -1.0f);
        this.f36531c.f36574m.f36554v = j17.getInt("nPatchType", 1);
        this.f36531c.f36574m.f36555w = j17.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        this.f36531c.f36574m.f36556x = j17.getInt("nPatchTargetVersion", 0);
        this.f36531c.f36567f = j17.getString("strMd5", "");
        this.f36531c.f36568g = j17.getString("strUrl", "");
        this.f36531c.f36571j = j17.getBoolean("bIsPatchUpdate", false);
        this.f36531c.f36564c = j17.getLong("nTimeToUpdate", 0L);
        this.f36531c.f36565d = j17.getInt("nTryCnt", 0);
        this.f36531c.f36566e = j17.getInt("nTryUseSharedCoreCount", 0);
        this.f36531c.f36570i = j17.getBoolean("bCanUseCellular", false);
        this.f36531c.f36569h = j17.getBoolean("bUseCdn", false);
        this.f36531c.f36573l = j17.getBoolean("skipSubFileMD5Check", true);
        this.f36531c.f36572k = dy5.a.valueOf(j17.getString("fullPackageType", "NONE"));
        return this.f36531c;
    }

    public android.content.SharedPreferences j() {
        return by5.d4.a("xweb_scheduler_" + r(), false);
    }

    public abstract java.lang.String k(boolean z17);

    public java.lang.String l() {
        return com.tencent.xweb.b.m().g("UPDATE_SCHEDULE_TIME_RANGE_BIND", "tools");
    }

    public java.lang.String n() {
        return com.tencent.xweb.b.m().g("FREE_FETCH_CONFIG_TIME_ZONE", "tools");
    }

    public int o() {
        return 0;
    }

    public synchronized java.util.Date q() {
        java.util.Date date;
        try {
            date = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.CHINA).parse(this.f36531c.f36574m.A);
        } catch (java.text.ParseException e17) {
            by5.c4.d(this.f36529a, "getRemoteThrottleExpirationDate(), error: ", e17);
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
        by5.c4.a(this.f36529a, "shouldUpdateDefault = " + z17 + ", shouldUpdateFromConfig = " + z18);
        return z18;
    }

    public synchronized java.lang.String t() {
        if (M()) {
            return "FORCE_UPDATE";
        }
        if (!X()) {
            return "LOCAL";
        }
        return "REMOTE-" + this.f36531c.f36574m.f36558z;
    }

    public synchronized boolean x() {
        boolean z17;
        if (i() != null && i().f36574m.f36537e > 0) {
            z17 = android.text.TextUtils.isEmpty(i().f36568g) ? false : true;
        }
        return z17;
    }

    public void y(by5.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        by5.m0 m0Var = n0Var.f36574m;
        if (!android.text.TextUtils.isEmpty(m0Var.f36539g)) {
            L(n0Var);
            return;
        }
        if (!android.text.TextUtils.isEmpty(m0Var.f36541i)) {
            if (dy5.c.f244745a != null) {
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
                if (!android.text.TextUtils.isEmpty(str) && (b17 = by5.o0.b(str)) != null && a17 >= b17.f36576a && a17 <= b17.f36577b) {
                    return ((double) by5.a4.c()) < b17.f36578c * 10000.0d;
                }
            }
        }
        return false;
    }
}
