package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283454f;

    public l3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2) {
        this.f283452d = f9Var;
        this.f283453e = str;
        this.f283454f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.p3 Zi = t21.o2.Zi();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f283452d;
        Zi.c(f9Var.z0(), 3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m3(this.f283453e, f9Var, this.f283454f));
    }
}
