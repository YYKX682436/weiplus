package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f104408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104409e;

    public qn(com.tencent.mm.plugin.finder.convert.yn ynVar, in5.s0 s0Var) {
        this.f104408d = ynVar;
        this.f104409e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f104409e;
        com.tencent.mm.plugin.finder.convert.yn ynVar = this.f104408d;
        com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener finderFeedFullConvert$StateListener = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener(ynVar, s0Var);
        finderFeedFullConvert$StateListener.alive();
        ynVar.f104368s.add(finderFeedFullConvert$StateListener);
    }
}
