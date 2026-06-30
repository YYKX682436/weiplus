package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ag implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f102882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f102883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102884f;

    public ag(boolean z17, com.tencent.mm.plugin.finder.convert.qg qgVar, in5.s0 s0Var) {
        this.f102882d = z17;
        this.f102883e = qgVar;
        this.f102884f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f102882d;
        in5.s0 s0Var = this.f102884f;
        com.tencent.mm.plugin.finder.convert.qg qgVar = this.f102883e;
        if (z17) {
            qgVar.r(s0Var, false, true);
        } else {
            qgVar.r(s0Var, true, true);
        }
    }
}
