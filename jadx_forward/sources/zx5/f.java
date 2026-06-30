package zx5;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final by5.l0 f558761a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f558762b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f558763c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f558764d;

    /* renamed from: e, reason: collision with root package name */
    public int f558765e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f558766f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f558767g;

    /* renamed from: h, reason: collision with root package name */
    public final int f558768h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f558769i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f558770j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f558771k;

    /* renamed from: l, reason: collision with root package name */
    public final int f558772l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f558773m;

    /* renamed from: n, reason: collision with root package name */
    public final dy5.a f558774n;

    public f(by5.l0 l0Var, boolean z17, java.lang.String str, boolean z18, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, boolean z19, boolean z27, java.lang.String str5, int i19, java.lang.String str6, dy5.a aVar) {
        this.f558761a = l0Var;
        this.f558762b = z17;
        this.f558763c = str;
        this.f558764d = z18;
        this.f558765e = i17;
        this.f558766f = str2;
        this.f558767g = str3;
        this.f558768h = i18;
        this.f558769i = str4;
        this.f558770j = z19;
        this.f558771k = str5;
        this.f558772l = i19;
        this.f558773m = str6;
        this.f558774n = aVar;
        if (a()) {
            return;
        }
        by5.c4.c("UpdateConfig", m179880x9616526c());
        throw new java.lang.RuntimeException("invalid update config");
    }

    public boolean a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if ((this.f558762b && ((str3 = this.f558763c) == null || str3.isEmpty())) || (str = this.f558767g) == null || str.isEmpty() || this.f558768h == -1) {
            return false;
        }
        return (this.f558762b && this.f558764d && ((str2 = this.f558766f) == null || str2.isEmpty())) ? false : true;
    }

    public java.lang.String b() {
        java.lang.String str;
        if (!a()) {
            throw new java.lang.RuntimeException("invalid update config");
        }
        boolean z17 = this.f558764d;
        int i17 = this.f558768h;
        if (!z17) {
            dy5.a aVar = this.f558774n;
            return (aVar == null || dy5.a.SEVEN_ZIP != aVar) ? by5.z3.e(i17) : by5.z3.c(i17);
        }
        int i18 = this.f558772l;
        if (i18 != 1 && i18 != 2) {
            throw new java.lang.RuntimeException("invalid patchType in updateConfig");
        }
        if (by5.z3.r(i17)) {
            str = by5.z3.n(i17) + java.io.File.separator + "zip";
        } else if (by5.z3.a(i17)) {
            by5.c4.f("XWebFileUtil", "getDownloadPatchPath, version:" + i17 + ", use new data dir");
            str = by5.z3.p(i17) + java.io.File.separator + "zip";
        } else {
            str = by5.z3.n(i17) + java.io.File.separator + "zip";
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (i18 == 1) {
            return str + java.io.File.separator + "patch.zip";
        }
        if (i18 != 2) {
            by5.c4.c("XWebFileUtil", "invalid patchType in updateConfig");
            return "";
        }
        return str + java.io.File.separator + "hpatch.zip";
    }

    /* renamed from: toString */
    public java.lang.String m179880x9616526c() {
        return "UpdateConfig{needCheckMd5=" + this.f558762b + ", downloadFileMd5='" + this.f558763c + "', isPatchUpdate=" + this.f558764d + ", nPatchTargetVersion=" + this.f558765e + ", patchEndFileMd5='" + this.f558766f + "', downUrl='" + this.f558767g + "', apkVer=" + this.f558768h + ", fullPackageType=" + this.f558774n + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(zx5.e r17) {
        /*
            r16 = this;
            r0 = r17
            r17.getClass()
            r1 = 0
            boolean r2 = r0.f558751a
            r3 = 0
            r17.getClass()
            boolean r4 = r0.f558752b
            int r5 = r0.f558753c
            java.lang.String r6 = r0.f558754d
            java.lang.String r7 = r0.f558755e
            int r8 = r0.f558756f
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = r0.f558757g
            int r13 = r0.f558758h
            r14 = 0
            dy5.a r15 = r0.f558759i
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zx5.f.<init>(zx5.e):void");
    }
}
