package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class r4 extends k75.k implements java.lang.Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f157470r = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyg) + "/weapp/public/commlib/%d.wxapkg";

    /* renamed from: g, reason: collision with root package name */
    public final int f157471g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f157472h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f157473i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f157474m;

    /* renamed from: n, reason: collision with root package name */
    public final k75.c f157475n;

    /* renamed from: o, reason: collision with root package name */
    public final k75.c f157476o;

    /* renamed from: p, reason: collision with root package name */
    public final k75.c f157477p;

    /* renamed from: q, reason: collision with root package name */
    public final k75.c f157478q;

    public r4(int i17, java.lang.String str, boolean z17) {
        super("LibIncrementalTestCase", android.os.Looper.getMainLooper());
        this.f157475n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g4(this);
        this.f157476o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j4(this);
        this.f157477p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m4(this);
        this.f157478q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p4(this);
        this.f157471g = i17;
        this.f157472h = str;
        this.f157473i = z17;
    }

    public static void q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4 r4Var, java.lang.String str) {
        r4Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "Result: %s", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q4(r4Var, str));
    }

    @Override // k75.k
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "TestCase onQuitting");
        java.lang.Runnable runnable = this.f157474m;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f157473i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.a(true);
        }
        k75.c cVar = this.f157475n;
        c(cVar);
        c(this.f157476o);
        c(this.f157477p);
        c(this.f157478q);
        m(cVar);
        n();
    }
}
