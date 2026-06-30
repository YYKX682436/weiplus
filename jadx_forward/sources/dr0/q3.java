package dr0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class q3 {

    /* renamed from: g, reason: collision with root package name */
    public static final dr0.q3 f324036g;

    /* renamed from: h, reason: collision with root package name */
    public static final dr0.q3 f324037h;

    /* renamed from: i, reason: collision with root package name */
    public static final dr0.q3 f324038i;

    /* renamed from: m, reason: collision with root package name */
    public static final dr0.q3 f324039m;

    /* renamed from: n, reason: collision with root package name */
    public static final dr0.q3 f324040n;

    /* renamed from: o, reason: collision with root package name */
    public static final dr0.q3 f324041o;

    /* renamed from: p, reason: collision with root package name */
    public static final dr0.q3 f324042p;

    /* renamed from: q, reason: collision with root package name */
    public static final dr0.q3 f324043q;

    /* renamed from: r, reason: collision with root package name */
    public static final dr0.q3 f324044r;

    /* renamed from: s, reason: collision with root package name */
    public static final dr0.q3 f324045s;

    /* renamed from: t, reason: collision with root package name */
    public static final dr0.q3 f324046t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ dr0.q3[] f324047u;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f324048d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f324049e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f324050f;

    static {
        dr0.q3 q3Var = new dr0.q3("SAVE_STATS", 0, "SaveStats", dr0.f3.f323956d, false, 4, null);
        f324036g = q3Var;
        boolean z17 = false;
        int i17 = 4;
        p3321xbce91901.jvm.p3324x21ffc6bd.i iVar = null;
        dr0.q3 q3Var2 = new dr0.q3("RECYCLE_CONTINUOUS", 1, "RecycleContinuous", dr0.g3.f323961d, z17, i17, iVar);
        f324037h = q3Var2;
        boolean z18 = false;
        int i18 = 4;
        p3321xbce91901.jvm.p3324x21ffc6bd.i iVar2 = null;
        dr0.q3 q3Var3 = new dr0.q3("RECYCLE_BG", 2, "RecycleBg", dr0.h3.f323964d, z18, i18, iVar2);
        f324038i = q3Var3;
        dr0.q3 q3Var4 = new dr0.q3("RECYCLE_DEEP_BG", 3, "RecycleDeepBg", dr0.i3.f323967d, z17, i17, iVar);
        f324039m = q3Var4;
        dr0.q3 q3Var5 = new dr0.q3("RECYCLE_PERIODICAL", 4, "RecyclePeriodical", dr0.j3.f323983d, z18, i18, iVar2);
        f324040n = q3Var5;
        dr0.q3 q3Var6 = new dr0.q3("RECYCLE_APP_STANDBY", 5, "RecycleAppStandby", dr0.k3.f323989d, z17, i17, iVar);
        f324041o = q3Var6;
        dr0.q3 q3Var7 = new dr0.q3("RECYCLE_SYSTEM_DOZE", 6, "RecycleSystemDoze", dr0.l3.f323997d, z18, i18, iVar2);
        f324042p = q3Var7;
        dr0.q3 q3Var8 = new dr0.q3("RECYCLE_BATTERY_RESTRICT", 7, "RecycleBatteryRestrict", dr0.m3.f324004d, false, 4, null);
        f324043q = q3Var8;
        dr0.q3 q3Var9 = new dr0.q3("RECYCLE_MANUAL", 8, "RecycleManual", dr0.n3.f324009d, false, 4, null);
        f324044r = q3Var9;
        boolean z19 = false;
        int i19 = 4;
        p3321xbce91901.jvm.p3324x21ffc6bd.i iVar3 = null;
        dr0.q3 q3Var10 = new dr0.q3("PERIODICAL_WAKE_UP", 9, "WakeUpPeriod", dr0.b3.f323946d, z19, i19, iVar3);
        dr0.q3 q3Var11 = new dr0.q3("PERIODICAL_COLLECT_CPU", 10, "CollectCpuTime", dr0.c3.f323948d, false, 4, null);
        dr0.q3 q3Var12 = new dr0.q3("PERIODICAL_HIBERNATE_CHECK", 11, "HibernateCheck", dr0.d3.f323951d, false);
        f324045s = q3Var12;
        dr0.q3 q3Var13 = new dr0.q3("CHECK_ALIVE", 12, "CheckAlive", dr0.e3.f323953d, z19, i19, iVar3);
        f324046t = q3Var13;
        dr0.q3[] q3VarArr = {q3Var, q3Var2, q3Var3, q3Var4, q3Var5, q3Var6, q3Var7, q3Var8, q3Var9, q3Var10, q3Var11, q3Var12, q3Var13};
        f324047u = q3VarArr;
        rz5.b.a(q3VarArr);
    }

    public q3(java.lang.String str, int i17, java.lang.String str2, java.lang.Runnable runnable, boolean z17) {
        this.f324048d = str2;
        this.f324049e = runnable;
        new android.os.Bundle();
    }

    public static void i(dr0.q3 q3Var, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.ProcLifeTasks", "TASK run: " + q3Var.f324048d);
        q3Var.f324049e.run();
        q3Var.f324050f = false;
        if (dr0.r3.f324056a.contains(q3Var)) {
            dr0.x0.f324104a.c(q3Var.name(), "run");
        }
    }

    public static void j(dr0.q3 q3Var, long j17, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedule");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.ProcLifeTasks", "TASK post: " + q3Var.f324048d + ", delay=" + j17);
        q3Var.f324050f = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (j17 <= 0) {
            ((ku5.t0) ku5.t0.f394148d).h(new dr0.o3(q3Var, currentTimeMillis), q3Var.f324048d);
        } else {
            ((ku5.t0) ku5.t0.f394148d).l(new dr0.p3(q3Var, currentTimeMillis), j17, q3Var.f324048d);
        }
        if (dr0.r3.f324056a.contains(q3Var)) {
            dr0.x0.f324104a.c(q3Var.name(), "post");
        }
    }

    /* renamed from: valueOf */
    public static dr0.q3 m125942xdce0328(java.lang.String str) {
        return (dr0.q3) java.lang.Enum.valueOf(dr0.q3.class, str);
    }

    /* renamed from: values */
    public static dr0.q3[] m125943xcee59d22() {
        return (dr0.q3[]) f324047u.clone();
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.ProcLifeTasks", "TASK cancel: " + this.f324048d);
        ((ku5.t0) ku5.t0.f394148d).A(this.f324048d);
        this.f324050f = false;
        java.util.List list = dr0.r3.f324056a;
        if (dr0.r3.f324056a.contains(this)) {
            dr0.x0.f324104a.c(name(), "post-cancel");
        }
    }

    public /* synthetic */ q3(java.lang.String str, int i17, java.lang.String str2, java.lang.Runnable runnable, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, str2, runnable, (i18 & 4) != 0 ? true : z17);
    }
}
