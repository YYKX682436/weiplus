package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class mb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103984e;

    public mb(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        this.f103983d = qeVar;
        this.f103984e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f103984e;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f103983d;
        com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener finderFeedFullConvert$StateListener = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener(qeVar, s0Var);
        finderFeedFullConvert$StateListener.alive();
        qeVar.f104368s.add(finderFeedFullConvert$StateListener);
    }
}
