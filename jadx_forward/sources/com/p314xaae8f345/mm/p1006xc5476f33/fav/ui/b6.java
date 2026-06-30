package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes9.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f182048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f182049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f182050g;

    public b6(java.lang.String str, o72.r2 r2Var, r45.gp0 gp0Var, java.lang.Runnable runnable) {
        this.f182047d = str;
        this.f182048e = r2Var;
        this.f182049f = gp0Var;
        this.f182050g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.c(this.f182047d, this.f182048e, this.f182049f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f182050g);
    }

    /* renamed from: toString */
    public java.lang.String m55325x9616526c() {
        return super.toString() + "|sendFavFile";
    }
}
