package ri;

/* loaded from: classes16.dex */
public final class j0 {
    public final java.lang.String A;
    public final int B;
    public final int C;
    public final java.lang.String D;
    public final java.lang.String E;
    public final int F;
    public final int G;

    /* renamed from: a, reason: collision with root package name */
    public final int f477400a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f477401b;

    /* renamed from: c, reason: collision with root package name */
    public final int f477402c;

    /* renamed from: d, reason: collision with root package name */
    public final int f477403d;

    /* renamed from: e, reason: collision with root package name */
    public final long f477404e;

    /* renamed from: f, reason: collision with root package name */
    public final long f477405f;

    /* renamed from: g, reason: collision with root package name */
    public final long f477406g;

    /* renamed from: h, reason: collision with root package name */
    public final int f477407h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f477408i;

    /* renamed from: j, reason: collision with root package name */
    public final int f477409j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f477410k;

    /* renamed from: l, reason: collision with root package name */
    public final int f477411l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f477412m;

    /* renamed from: n, reason: collision with root package name */
    public final long f477413n;

    /* renamed from: o, reason: collision with root package name */
    public final long f477414o;

    /* renamed from: p, reason: collision with root package name */
    public final long f477415p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f477416q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f477417r;

    /* renamed from: s, reason: collision with root package name */
    public final int f477418s;

    /* renamed from: t, reason: collision with root package name */
    public final int f477419t;

    /* renamed from: u, reason: collision with root package name */
    public final int f477420u;

    /* renamed from: v, reason: collision with root package name */
    public final int f477421v;

    /* renamed from: w, reason: collision with root package name */
    public final int f477422w;

    /* renamed from: x, reason: collision with root package name */
    public final long f477423x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f477424y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f477425z;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(int i17, java.lang.String str, int i18, int i19, long j17, long j18, long j19, int i27, java.lang.String str2, int i28, java.lang.String str3, int i29, java.lang.String str4, long j27, long j28, long j29, java.lang.String str5, java.lang.String str6, int i37, int i38, int i39, int i47, int i48, long j37, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i49, int i57, java.lang.String str10, java.lang.String str11, int i58, int i59, int i66, int i67, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String process;
        int i68;
        int i69;
        int i76;
        java.lang.String systemMemInfo;
        long j38;
        java.lang.String str12;
        java.lang.String buildTag;
        java.lang.String buildRevision;
        int i77 = (i66 & 1) != 0 ? 0 : i17;
        if ((i66 & 2) != 0) {
            process = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(process, "getProcessName(...)");
        } else {
            process = str;
        }
        if ((i66 & 4) != 0) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
            i68 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134363g.mo40960xab2f7f06();
        } else {
            i68 = i18;
        }
        if ((i66 & 8) != 0) {
            java.lang.String str13 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
            i69 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u;
        } else {
            i69 = i19;
        }
        long j39 = (i66 & 16) != 0 ? 0L : j17;
        long j47 = (i66 & 32) != 0 ? 0L : j18;
        long j48 = (i66 & 64) != 0 ? 0L : j19;
        int i78 = (i66 & 128) != 0 ? 0 : i27;
        java.lang.String debugPssDetailK = (i66 & 256) != 0 ? "" : str2;
        int i79 = (i66 & 512) != 0 ? 0 : i28;
        java.lang.String amsPssDetailK = (i66 & 1024) != 0 ? "" : str3;
        int i86 = i79;
        int i87 = (i66 & 2048) != 0 ? 0 : i29;
        java.lang.String allProcessPssDetailK = (i66 & 4096) != 0 ? "" : str4;
        int i88 = i78;
        long j49 = (i66 & 8192) != 0 ? 0L : j27;
        long j57 = (i66 & 16384) != 0 ? 0L : j28;
        long j58 = (32768 & i66) != 0 ? 0L : j29;
        java.lang.String recentActivity = (65536 & i66) != 0 ? "" : str5;
        long j59 = j48;
        java.lang.String leakActivity = (i66 & 131072) != 0 ? "" : str6;
        int i89 = (262144 & i66) != 0 ? 0 : i37;
        int i96 = (i66 & 524288) != 0 ? 0 : i38;
        int i97 = (i66 & 1048576) != 0 ? 0 : i39;
        int i98 = (i66 & 2097152) != 0 ? 0 : i47;
        int i99 = (i66 & 4194304) != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k ? 1 : 0 : i48;
        long j66 = (i66 & 8388608) != 0 ? 0L : j37;
        if ((i66 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0) {
            i76 = i89;
            systemMemInfo = "";
        } else {
            i76 = i89;
            systemMemInfo = str7;
        }
        long j67 = j47;
        java.lang.String processState = (i66 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? "" : str8;
        java.lang.String str14 = (67108864 & i66) != 0 ? "" : str9;
        int i100 = (i66 & 134217728) != 0 ? 0 : i49;
        int i101 = (i66 & 268435456) != 0 ? 0 : i57;
        if ((i66 & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0) {
            str12 = str14;
            buildTag = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            j38 = j39;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buildTag, "BUILD_TAG");
        } else {
            j38 = j39;
            str12 = str14;
            buildTag = str10;
        }
        if ((1073741824 & i66) != 0) {
            buildRevision = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(buildRevision, "REV");
        } else {
            buildRevision = str11;
        }
        int i102 = (i66 & Integer.MIN_VALUE) != 0 ? 0 : i58;
        int myPid = (i67 & 1) != 0 ? android.os.Process.myPid() : i59;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugPssDetailK, "debugPssDetailK");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(amsPssDetailK, "amsPssDetailK");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allProcessPssDetailK, "allProcessPssDetailK");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recentActivity, "recentActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(leakActivity, "leakActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(systemMemInfo, "systemMemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processState, "processState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buildTag, "buildTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buildRevision, "buildRevision");
        this.f477400a = i77;
        this.f477401b = process;
        this.f477402c = i68;
        this.f477403d = i69;
        this.f477404e = j38;
        this.f477405f = j67;
        this.f477406g = j59;
        this.f477407h = i88;
        this.f477408i = debugPssDetailK;
        this.f477409j = i86;
        this.f477410k = amsPssDetailK;
        this.f477411l = i87;
        this.f477412m = allProcessPssDetailK;
        this.f477413n = j49;
        this.f477414o = j57;
        this.f477415p = j58;
        this.f477416q = recentActivity;
        this.f477417r = leakActivity;
        this.f477418s = i76;
        this.f477419t = i96;
        this.f477420u = i97;
        this.f477421v = i98;
        this.f477422w = i99;
        this.f477423x = j66;
        this.f477424y = systemMemInfo;
        this.f477425z = processState;
        this.A = str12;
        this.B = i100;
        this.C = i101;
        this.D = buildTag;
        this.E = buildRevision;
        this.F = i102;
        this.G = myPid;
    }

    /* renamed from: equals */
    public boolean m162458xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri.j0)) {
            return false;
        }
        ri.j0 j0Var = (ri.j0) obj;
        return this.f477400a == j0Var.f477400a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477401b, j0Var.f477401b) && this.f477402c == j0Var.f477402c && this.f477403d == j0Var.f477403d && this.f477404e == j0Var.f477404e && this.f477405f == j0Var.f477405f && this.f477406g == j0Var.f477406g && this.f477407h == j0Var.f477407h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477408i, j0Var.f477408i) && this.f477409j == j0Var.f477409j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477410k, j0Var.f477410k) && this.f477411l == j0Var.f477411l && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477412m, j0Var.f477412m) && this.f477413n == j0Var.f477413n && this.f477414o == j0Var.f477414o && this.f477415p == j0Var.f477415p && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477416q, j0Var.f477416q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477417r, j0Var.f477417r) && this.f477418s == j0Var.f477418s && this.f477419t == j0Var.f477419t && this.f477420u == j0Var.f477420u && this.f477421v == j0Var.f477421v && this.f477422w == j0Var.f477422w && this.f477423x == j0Var.f477423x && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477424y, j0Var.f477424y) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477425z, j0Var.f477425z) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.A, j0Var.A) && this.B == j0Var.B && this.C == j0Var.C && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.D, j0Var.D) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.E, j0Var.E) && this.F == j0Var.F && this.G == j0Var.G;
    }

    /* renamed from: hashCode */
    public int m162459x8cdac1b() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f477400a) * 31) + this.f477401b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f477402c)) * 31) + java.lang.Integer.hashCode(this.f477403d)) * 31) + java.lang.Long.hashCode(this.f477404e)) * 31) + java.lang.Long.hashCode(this.f477405f)) * 31) + java.lang.Long.hashCode(this.f477406g)) * 31) + java.lang.Integer.hashCode(this.f477407h)) * 31) + this.f477408i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f477409j)) * 31) + this.f477410k.hashCode()) * 31) + java.lang.Integer.hashCode(this.f477411l)) * 31) + this.f477412m.hashCode()) * 31) + java.lang.Long.hashCode(this.f477413n)) * 31) + java.lang.Long.hashCode(this.f477414o)) * 31) + java.lang.Long.hashCode(this.f477415p)) * 31) + this.f477416q.hashCode()) * 31) + this.f477417r.hashCode()) * 31) + java.lang.Integer.hashCode(this.f477418s)) * 31) + java.lang.Integer.hashCode(this.f477419t)) * 31) + java.lang.Integer.hashCode(this.f477420u)) * 31) + java.lang.Integer.hashCode(this.f477421v)) * 31) + java.lang.Integer.hashCode(this.f477422w)) * 31) + java.lang.Long.hashCode(this.f477423x)) * 31) + this.f477424y.hashCode()) * 31) + this.f477425z.hashCode()) * 31;
        java.lang.String str = this.A;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.B)) * 31) + java.lang.Integer.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + java.lang.Integer.hashCode(this.F)) * 31) + java.lang.Integer.hashCode(this.G);
    }

    /* renamed from: toString */
    public java.lang.String m162460x9616526c() {
        return "Data(type=" + this.f477400a + ", process='" + this.f477401b + "', appForeground=" + this.f477402c + ", processForeground=" + this.f477403d + ", javaHeapByte=" + this.f477404e + ", nativeHeapByte=" + this.f477405f + ", vmSizeK=" + this.f477406g + ", debugPssK=" + this.f477407h + ", debugPssDetailK='" + this.f477408i + "', amsPssK=" + this.f477409j + ", amsPssDetailK='" + this.f477410k + "', allProcessPssSumK=" + this.f477411l + ", allProcessPssDetailK='" + this.f477412m + "', vmRss=" + this.f477413n + ", vmSwap=" + this.f477414o + ", threads=" + this.f477415p + ", recentActivity='" + this.f477416q + "', leakActivity='" + this.f477417r + "', activityLeakAnalyseEnable=" + this.f477418s + ", hasHprof=" + this.f477419t + ", memHookEnable=" + this.f477420u + ", hasSmaps=" + this.f477421v + ", is64bit=" + this.f477422w + ", bgDuration=" + this.f477423x + ", systemMemInfo='" + this.f477424y + "', processState='" + this.f477425z + "', extra=" + this.A + ", debugGraphicPssK=" + this.B + ", amsGraphicPssK=" + this.C + ", buildTag='" + this.D + "', buildRevision='" + this.E + "', hasDumpsysMemInfo=" + this.F + ", pid=" + this.G + ')';
    }
}
