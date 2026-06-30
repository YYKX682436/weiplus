package by5;

/* loaded from: classes13.dex */
public class q {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f36580j = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f36581a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f36582b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f36583c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f36584d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36585e;

    /* renamed from: f, reason: collision with root package name */
    public final long f36586f;

    /* renamed from: g, reason: collision with root package name */
    public final long f36587g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f36588h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36589i = false;

    public q(java.lang.String str, com.tencent.xweb.f1 f1Var) {
        android.content.SharedPreferences a17;
        synchronized (by5.q.class) {
            if (f1Var != com.tencent.xweb.f1.WV_KIND_PINUS) {
                a17 = null;
            } else {
                a17 = by5.d4.a("INIT_SP_TAG_" + f1Var.toString() + "_" + str, true);
            }
        }
        this.f36581a = a17;
        if (a17 == null) {
            by5.c4.g("CrashWatchDog", "scene:" + str + ", kind:" + f1Var + ", invalid shared preference");
            return;
        }
        java.lang.String str2 = "INIT_START_TIME" + str;
        this.f36582b = str2;
        java.lang.String str3 = "INIT_END_TIME" + str;
        this.f36583c = str3;
        java.lang.String str4 = "INIT_TRY_COUNT" + str;
        this.f36584d = str4;
        this.f36588h = str;
        long j17 = this.f36581a.getLong(str2, 0L);
        this.f36585e = j17;
        long j18 = this.f36581a.getLong(str3, 0L);
        this.f36586f = j18;
        long j19 = this.f36581a.getLong(str4, 0L);
        this.f36587g = j19;
        by5.c4.f("CrashWatchDog", "scene:" + str + ", startTime:" + b(j17) + ", endTime:" + b(j18) + ", count:" + j19);
    }

    public static synchronized void a(java.lang.String str) {
        synchronized (by5.q.class) {
            java.util.List list = f36580j;
            if (((java.util.LinkedList) list).size() > 5) {
                ((java.util.LinkedList) list).remove(0);
            }
            ((java.util.LinkedList) list).add(str);
        }
    }

    public static synchronized by5.q c(java.lang.String str, com.tencent.xweb.f1 f1Var) {
        by5.q d17;
        synchronized (by5.q.class) {
            d17 = d(str, f1Var, com.tencent.xweb.WebView.getModuleName());
        }
        return d17;
    }

    public static synchronized by5.q d(java.lang.String str, com.tencent.xweb.f1 f1Var, java.lang.String str2) {
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
        if (this.f36581a == null) {
            by5.c4.g("CrashWatchDog", "hasRecentCrashInternal, invalid shared preference");
            return false;
        }
        if (!h(new java.util.Date().getTime())) {
            by5.c4.f("CrashWatchDog", "hasRecentCrashInternal, startButNoEnd returns false");
            return false;
        }
        if (this.f36587g <= com.tencent.xweb.b.m().i("crash_watch_count", com.tencent.xweb.WebView.getModuleName(), 4)) {
            by5.c4.f("CrashWatchDog", "hasRecentCrashInternal, return false, count:" + this.f36587g);
            return false;
        }
        by5.c4.a("CrashWatchDog", "scene:" + this.f36588h + ", crashedTime:" + b(this.f36585e) + ", count:" + this.f36587g);
        return true;
    }

    public synchronized void f() {
        if (this.f36581a == null) {
            by5.c4.g("CrashWatchDog", "logFinished, invalid shared preference");
            return;
        }
        long time = new java.util.Date().getTime();
        by5.c4.f("CrashWatchDog", "logFinished, endTime:" + b(time));
        android.content.SharedPreferences.Editor edit = this.f36581a.edit();
        edit.putLong(this.f36583c, time);
        edit.putLong(this.f36584d, 0L);
        edit.commit();
        this.f36581a = null;
    }

    public synchronized void g() {
        android.content.SharedPreferences sharedPreferences = this.f36581a;
        if (sharedPreferences == null) {
            by5.c4.g("CrashWatchDog", "logStart, invalid shared preference");
            return;
        }
        if (this.f36589i) {
            by5.c4.g("CrashWatchDog", "logStart, already start");
            return;
        }
        this.f36589i = true;
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        long j17 = this.f36587g + 1;
        edit.putLong(this.f36584d, j17);
        long time = new java.util.Date().getTime();
        if (h(time)) {
            by5.c4.f("CrashWatchDog", "logStart, startButNoEnd returns true, currentTime:" + b(time) + ", count:" + j17);
            edit.commit();
            return;
        }
        by5.c4.f("CrashWatchDog", "logStart, startTime:" + b(time) + ", count:" + j17);
        edit.putLong(this.f36582b, time);
        edit.commit();
    }

    public final synchronized boolean h(long j17) {
        by5.c4.f("CrashWatchDog", "startButNoEnd, startTime:" + b(this.f36585e) + ", endTime:" + b(this.f36586f) + ", currentTime:" + b(j17));
        long j18 = this.f36585e;
        if (0 == j18) {
            return false;
        }
        if (this.f36586f - j18 < 0 && java.lang.Math.abs(j17 - j18) <= com.tencent.xweb.b.m().i("crash_watch_time", com.tencent.xweb.WebView.getModuleName(), 180) * 60 * 1000) {
            return this.f36586f < this.f36585e;
        }
        return false;
    }
}
