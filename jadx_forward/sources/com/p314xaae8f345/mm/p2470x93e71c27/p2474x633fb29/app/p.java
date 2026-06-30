package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11271x7b1482d5.Req f270551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f270553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 f270554g;

    public p(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11271x7b1482d5.Req req, java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var) {
        this.f270551d = req;
        this.f270552e = str;
        this.f270553f = context;
        this.f270554g = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.f270551d.mo48427x792022dd(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = this.f270552e;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        boolean m48400x35cf88 = com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(this.f270553f, args);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var = this.f270554g;
        if (a5Var != null) {
            a5Var.a(m48400x35cf88, false);
        }
    }
}
