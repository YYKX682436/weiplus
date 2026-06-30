package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f178592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f178593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 f178594h;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var, long j17, java.lang.String str, long j18, long j19) {
        this.f178594h = l0Var;
        this.f178590d = j17;
        this.f178591e = str;
        this.f178592f = j18;
        this.f178593g = j19;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 g1Var : com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.a(this.f178594h)) {
            g1Var.h(this.f178590d, this.f178591e, this.f178592f, this.f178593g);
        }
    }
}
