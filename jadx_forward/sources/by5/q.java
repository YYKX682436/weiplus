package by5;

/* loaded from: classes13.dex */
public class q {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f118113j = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f118114a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f118115b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f118116c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f118117d;

    /* renamed from: e, reason: collision with root package name */
    public final long f118118e;

    /* renamed from: f, reason: collision with root package name */
    public final long f118119f;

    /* renamed from: g, reason: collision with root package name */
    public final long f118120g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f118121h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f118122i = false;

    public q(java.lang.String str, com.p314xaae8f345.p3210x3857dc.f1 f1Var) {
        android.content.SharedPreferences a17;
        synchronized (by5.q.class) {
            if (f1Var != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
                a17 = null;
            } else {
                a17 = by5.d4.a("INIT_SP_TAG_" + f1Var.toString() + "_" + str, true);
            }
        }
        this.f118114a = a17;
        if (a17 == null) {
            by5.c4.g("CrashWatchDog", "scene:" + str + ", kind:" + f1Var + ", invalid shared preference");
            return;
        }
        java.lang.String str2 = "INIT_START_TIME" + str;
        this.f118115b = str2;
        java.lang.String str3 = "INIT_END_TIME" + str;
        this.f118116c = str3;
        java.lang.String str4 = "INIT_TRY_COUNT" + str;
        this.f118117d = str4;
        this.f118121h = str;
        long j17 = this.f118114a.getLong(str2, 0L);
        this.f118118e = j17;
        long j18 = this.f118114a.getLong(str3, 0L);
        this.f118119f = j18;
        long j19 = this.f118114a.getLong(str4, 0L);
        this.f118120g = j19;
        by5.c4.f("CrashWatchDog", "scene:" + str + ", startTime:" + b(j17) + ", endTime:" + b(j18) + ", count:" + j19);
    }

    public static synchronized void a(java.lang.String str) {
        synchronized (by5.q.class) {
            java.util.List list = f118113j;
            if (((java.util.LinkedList) list).size() > 5) {
                ((java.util.LinkedList) list).remove(0);
            }
            ((java.util.LinkedList) list).add(str);
        }
    }

    public static synchronized by5.q c(java.lang.String str, com.p314xaae8f345.p3210x3857dc.f1 f1Var) {
        by5.q d17;
        synchronized (by5.q.class) {
            d17 = d(str, f1Var, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120126xba60370d());
        }
        return d17;
    }

    public static synchronized by5.q d(java.lang.String str, com.p314xaae8f345.p3210x3857dc.f1 f1Var, java.lang.String str2) {
        by5.q qVar;
        synchronized (by5.q.class) {
            java.lang.String str3 = str + "_" + str2;
            synchronized (by5.q.class) {
                qVar = new by5.q(str3, f1Var);
            }
            return qVar;
        }
        return qVar;
    }

    public final java.lang.String b(long j17) {
        return j17 <= 0 ? "0" : new java.util.Date(j17).toLocaleString();
    }

    public final synchronized boolean e() {
        if (this.f118114a == null) {
            by5.c4.g("CrashWatchDog", "hasRecentCrashInternal, invalid shared preference");
            return false;
        }
        if (!h(new java.util.Date().getTime())) {
            by5.c4.f("CrashWatchDog", "hasRecentCrashInternal, startButNoEnd returns false");
            return false;
        }
        if (this.f118120g <= com.p314xaae8f345.p3210x3857dc.b.m().i("crash_watch_count", com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120126xba60370d(), 4)) {
            by5.c4.f("CrashWatchDog", "hasRecentCrashInternal, return false, count:" + this.f118120g);
            return false;
        }
        by5.c4.a("CrashWatchDog", "scene:" + this.f118121h + ", crashedTime:" + b(this.f118118e) + ", count:" + this.f118120g);
        return true;
    }

    public synchronized void f() {
        if (this.f118114a == null) {
            by5.c4.g("CrashWatchDog", "logFinished, invalid shared preference");
            return;
        }
        long time = new java.util.Date().getTime();
        by5.c4.f("CrashWatchDog", "logFinished, endTime:" + b(time));
        android.content.SharedPreferences.Editor edit = this.f118114a.edit();
        edit.putLong(this.f118116c, time);
        edit.putLong(this.f118117d, 0L);
        edit.commit();
        this.f118114a = null;
    }

    public synchronized void g() {
        android.content.SharedPreferences sharedPreferences = this.f118114a;
        if (sharedPreferences == null) {
            by5.c4.g("CrashWatchDog", "logStart, invalid shared preference");
            return;
        }
        if (this.f118122i) {
            by5.c4.g("CrashWatchDog", "logStart, already start");
            return;
        }
        this.f118122i = true;
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        long j17 = this.f118120g + 1;
        edit.putLong(this.f118117d, j17);
        long time = new java.util.Date().getTime();
        if (h(time)) {
            by5.c4.f("CrashWatchDog", "logStart, startButNoEnd returns true, currentTime:" + b(time) + ", count:" + j17);
            edit.commit();
            return;
        }
        by5.c4.f("CrashWatchDog", "logStart, startTime:" + b(time) + ", count:" + j17);
        edit.putLong(this.f118115b, time);
        edit.commit();
    }

    public final synchronized boolean h(long j17) {
        by5.c4.f("CrashWatchDog", "startButNoEnd, startTime:" + b(this.f118118e) + ", endTime:" + b(this.f118119f) + ", currentTime:" + b(j17));
        long j18 = this.f118118e;
        if (0 == j18) {
            return false;
        }
        if (this.f118119f - j18 < 0 && java.lang.Math.abs(j17 - j18) <= com.p314xaae8f345.p3210x3857dc.b.m().i("crash_watch_time", com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120126xba60370d(), 180) * 60 * 1000) {
            return this.f118119f < this.f118118e;
        }
        return false;
    }
}
