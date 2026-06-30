package re1;

/* loaded from: classes13.dex */
public final class i implements java.lang.Comparable {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.regex.Pattern f475867o = java.util.regex.Pattern.compile("^([^.]+)\\.(\\d+)\\.(\\d+)\\.(\\w+)\\.(\\d+)(\\.v1\\.dat)$");

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f475868d;

    /* renamed from: e, reason: collision with root package name */
    public final long f475869e;

    /* renamed from: f, reason: collision with root package name */
    public final long f475870f;

    /* renamed from: g, reason: collision with root package name */
    public final long f475871g;

    /* renamed from: h, reason: collision with root package name */
    public final te1.b f475872h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f475873i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f475874m;

    /* renamed from: n, reason: collision with root package name */
    public final long f475875n;

    public i(java.lang.String str, long j17, long j18, long j19, te1.b bVar, boolean z17, long j27, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f475868d = str;
        this.f475869e = j17;
        this.f475870f = j18;
        this.f475871g = j19;
        this.f475872h = bVar;
        this.f475873i = z17;
        this.f475874m = r6Var;
        this.f475875n = j27;
    }

    public static re1.i b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.lang.String str;
        te1.b bVar;
        java.util.regex.Matcher matcher = f475867o.matcher(r6Var.m82467xfb82e301());
        if (!matcher.matches()) {
            return null;
        }
        java.lang.String group = matcher.group(1);
        long parseLong = java.lang.Long.parseLong(matcher.group(2));
        long parseLong2 = java.lang.Long.parseLong(matcher.group(3));
        java.lang.String group2 = matcher.group(4);
        java.util.HashMap hashMap = te1.b.f499305g;
        if (hashMap.containsKey(group2)) {
            bVar = (te1.b) hashMap.get(group2);
        } else {
            try {
                str = new java.lang.String(ve1.b.a(group2), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException unused) {
                str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
            }
            te1.b a17 = te1.b.a(str);
            hashMap.put(group2, a17);
            bVar = a17;
        }
        return new re1.i(group, parseLong, r6Var.C(), parseLong2, bVar, true, java.lang.Long.parseLong(matcher.group(5)), r6Var);
    }

    public static com.p314xaae8f345.mm.vfs.r6 d(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, long j17, long j18, te1.b bVar, long j19) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".");
        sb6.append(j17);
        sb6.append(".");
        sb6.append(j18);
        sb6.append(".");
        if (android.text.TextUtils.isEmpty(bVar.f499307b)) {
            try {
                str2 = ve1.b.b(bVar.f499306a.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.io.UnsupportedEncodingException unused) {
                str2 = ve1.b.b(te1.b.f499304f);
            }
            bVar.f499307b = str2;
        } else {
            str2 = bVar.f499307b;
        }
        sb6.append(str2);
        sb6.append(".");
        sb6.append(j19);
        sb6.append(".v1.dat");
        return new com.p314xaae8f345.mm.vfs.r6(r6Var, sb6.toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(re1.i iVar) {
        java.lang.String str = iVar.f475868d;
        java.lang.String str2 = this.f475868d;
        if (!str2.equals(str)) {
            return str2.compareTo(iVar.f475868d);
        }
        long j17 = this.f475869e - iVar.f475869e;
        if (j17 == 0) {
            return 0;
        }
        return j17 < 0 ? -1 : 1;
    }
}
