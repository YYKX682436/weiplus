package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l4 f289487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f289489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289490i;

    public p1(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.app.ProgressDialog progressDialog, java.lang.Runnable runnable) {
        this.f289485d = context;
        this.f289486e = str;
        this.f289487f = l4Var;
        this.f289488g = c19762x487075a;
        this.f289489h = progressDialog;
        this.f289490i = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f289488g;
        android.app.ProgressDialog progressDialog = this.f289489h;
        android.content.Context context = this.f289485d;
        java.lang.String str = this.f289486e;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.d(context, str, this.f289487f, c19762x487075a, progressDialog, true);
        java.lang.Runnable runnable = this.f289490i;
        if (runnable != null) {
            runnable.run();
        }
        if (r01.z.n(str)) {
            r01.r1 Zi = r01.q3.Zi();
            Zi.b(str, 14, 0, 0.0f, 0.0f, 0, null, 0, Zi.f449760i, null);
        }
    }
}
