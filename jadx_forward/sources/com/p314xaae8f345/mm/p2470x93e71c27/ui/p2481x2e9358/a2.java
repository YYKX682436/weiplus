package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f271705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271706g;

    public a2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, java.lang.String str, java.lang.String str2, long j17) {
        this.f271706g = c19666xfd6e2f33;
        this.f271703d = str;
        this.f271704e = str2;
        this.f271705f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272719u.matcher(this.f271703d);
        while (matcher.find()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271706g;
            gv4.b.a(c19666xfd6e2f33.f271554m.j(), com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(c19666xfd6e2f33.f271502d) ? 2 : 1, c19666xfd6e2f33.f271502d, this.f271704e, 3, matcher.group(), c19666xfd6e2f33.G2, 1, this.f271705f);
        }
    }
}
