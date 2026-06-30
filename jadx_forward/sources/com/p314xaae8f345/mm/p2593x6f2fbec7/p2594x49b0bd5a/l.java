package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* loaded from: classes11.dex */
public abstract class l implements q65.c {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f273829f = lp0.b.D();

    /* renamed from: a, reason: collision with root package name */
    public final int f273830a;

    /* renamed from: b, reason: collision with root package name */
    public int f273831b;

    /* renamed from: c, reason: collision with root package name */
    public int f273832c = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.e(d());

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f273833d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f273834e;

    public l(int i17, java.lang.String str, int i18, boolean z17) {
        this.f273834e = false;
        this.f273831b = i17;
        this.f273833d = str;
        this.f273830a = i18;
        this.f273834e = z17;
        java.io.File file = new java.io.File(f273829f);
        if (!file.exists()) {
            file.mkdirs();
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.c(java.lang.String, boolean):java.lang.String");
    }

    public java.lang.String b() {
        return f273829f + this.f273833d + ".apk";
    }

    public java.lang.String d() {
        return f273829f + this.f273833d + ".temp";
    }
}
