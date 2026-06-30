package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class j00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f107062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f107063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f107064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn5.a f107065g;

    public j00(com.tencent.mm.plugin.finder.feed.v00 v00Var, boolean z17, boolean z18, rn5.a aVar) {
        this.f107062d = v00Var;
        this.f107063e = z17;
        this.f107064f = z18;
        this.f107065g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.v00 v00Var = this.f107062d;
        v00Var.l().M(this.f107063e, this.f107064f, this.f107065g);
        v00Var.getClass();
    }
}
