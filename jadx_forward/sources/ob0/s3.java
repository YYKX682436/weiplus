package ob0;

/* loaded from: classes12.dex */
public class s3 {
    public int A;
    public int B;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f425476J;
    public int K;
    public int L;
    public int M;
    public int O;

    /* renamed from: a, reason: collision with root package name */
    public int f425477a;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f425479c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f425480d;

    /* renamed from: e, reason: collision with root package name */
    public int f425481e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f425484h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f425485i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f425488l;

    /* renamed from: m, reason: collision with root package name */
    public long f425489m;

    /* renamed from: n, reason: collision with root package name */
    public long f425490n;

    /* renamed from: o, reason: collision with root package name */
    public long f425491o;

    /* renamed from: p, reason: collision with root package name */
    public long f425492p;

    /* renamed from: q, reason: collision with root package name */
    public long f425493q;

    /* renamed from: r, reason: collision with root package name */
    public long f425494r;

    /* renamed from: s, reason: collision with root package name */
    public long f425495s;

    /* renamed from: t, reason: collision with root package name */
    public long f425496t;

    /* renamed from: u, reason: collision with root package name */
    public long f425497u;

    /* renamed from: x, reason: collision with root package name */
    public android.app.ActivityManager.MemoryInfo f425500x;

    /* renamed from: y, reason: collision with root package name */
    public int f425501y;

    /* renamed from: z, reason: collision with root package name */
    public int f425502z;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f425478b = "current";

    /* renamed from: f, reason: collision with root package name */
    public int f425482f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f425483g = "default";

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f425486j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final boolean f425487k = b();

    /* renamed from: v, reason: collision with root package name */
    public final long f425498v = java.lang.Thread.currentThread().getId();

    /* renamed from: w, reason: collision with root package name */
    public long f425499w = -1;
    public ob0.s3[] C = new ob0.s3[0];
    public final java.util.List D = new java.util.ArrayList();
    public java.util.List N = new java.util.ArrayList();
    public java.util.List P = new java.util.ArrayList();

    public static boolean b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s();
    }

    public final java.lang.String a(java.util.Map map) {
        if (map == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (!((java.lang.String) entry.getKey()).equals("java-heap") && !((java.lang.String) entry.getKey()).equals("native-heap")) {
                sb6.append(((java.lang.String) entry.getKey()).replaceFirst("summary.", ""));
                sb6.append("=");
                sb6.append((java.lang.String) entry.getValue());
                sb6.append(", ");
            }
        }
        sb6.delete(sb6.length() - 2, sb6.length());
        return sb6.toString();
    }

    /* renamed from: toString */
    public java.lang.String m150953x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" \n");
        sb6.append(java.lang.String.format(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemoryInfo(tid=%s) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<", java.lang.Long.valueOf(this.f425498v)));
        sb6.append("\n| Activity:\t");
        sb6.append(this.f425483g);
        sb6.append("\tAppForeground:");
        sb6.append(this.f425484h);
        sb6.append("\tProcessForeground:");
        sb6.append(this.f425485i);
        sb6.append(b() ? "\thasActivity:" : "");
        sb6.append(b() ? java.lang.Boolean.valueOf(this.f425488l) : "");
        sb6.append("\toom_adj:");
        sb6.append(this.f425476J);
        sb6.append("\toom_score_adj:");
        sb6.append(this.K);
        sb6.append("\n| Source:\t ");
        sb6.append(this.f425482f);
        sb6.append("\n| VmSize:\t ");
        sb6.append(this.f425481e);
        sb6.append("kB\n| SystemMemoryInfo:\t totalMem=");
        sb6.append(this.f425500x.totalMem);
        sb6.append(", availMem=");
        sb6.append(this.f425500x.availMem);
        sb6.append(", lowMemory=");
        sb6.append(this.f425500x.lowMemory);
        sb6.append(", threshold=");
        sb6.append(this.f425500x.threshold);
        sb6.append("\n| Dalvik:\t memClass=");
        sb6.append(this.f425495s);
        sb6.append(", memLargeClass=");
        sb6.append(this.f425496t);
        sb6.append(" B, UsedMemory=");
        sb6.append(this.f425492p);
        sb6.append(" B, RecycledMemory=");
        sb6.append(this.f425493q);
        sb6.append(" B, MaxMemory=");
        sb6.append(this.f425494r);
        sb6.append(" B\n| NATIVE:\t HeapSize=");
        sb6.append(this.f425489m);
        sb6.append(" B, AllocatedSize=");
        sb6.append(this.f425490n);
        sb6.append(" B, RecycledSize=");
        sb6.append(this.f425491o);
        sb6.append(" B\n| Stats:\t pss-sum:");
        sb6.append(this.A);
        sb6.append(" KB, ");
        sb6.append(a(this.f425479c));
        sb6.append("\n| AMSStats:\t ");
        sb6.append(a(this.f425480d));
        sb6.append("\n| FgService:\t");
        sb6.append(java.util.Arrays.toString(((java.util.ArrayList) this.f425486j).toArray()));
        sb6.append("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> END(cost:");
        sb6.append(this.f425497u);
        sb6.append("ms) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        ob0.s3[] s3VarArr = this.C;
        if (s3VarArr != null) {
            for (ob0.s3 s3Var : s3VarArr) {
                sb6.append("| Process: ");
                sb6.append(s3Var.f425478b);
                sb6.append(", pid: ");
                sb6.append(s3Var.f425477a);
                sb6.append(", totalPss: ");
                sb6.append(s3Var.f425501y);
                sb6.append("\n");
            }
            if (this.B != 0) {
                sb6.append("| Process: IsolatedXWeb, pid: ?, totalPss: ");
                sb6.append(this.B);
                sb6.append("\n");
            }
        }
        sb6.append("| TPCount: ");
        sb6.append(this.L);
        sb6.append("\n| FlutterEngineCount: ");
        sb6.append(this.M);
        sb6.append("\n");
        if (this.M > 0) {
            sb6.append("| FlutterBiz:");
            sb6.append(this.N.toString());
            sb6.append("\n");
        }
        sb6.append("| LiteAppEngineCount: ");
        sb6.append(this.O);
        sb6.append("\n");
        if (this.O > 0) {
            sb6.append("| LiteAppId:");
            sb6.append(this.P.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }
}
