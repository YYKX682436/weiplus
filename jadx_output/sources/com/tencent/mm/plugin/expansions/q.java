package com.tencent.mm.plugin.expansions;

/* loaded from: classes16.dex */
public class q implements p5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.a f99772a;

    public q(com.tencent.mm.plugin.expansions.t tVar, r.a aVar) {
        this.f99772a = aVar;
    }

    @Override // p5.h
    public java.lang.Object a(p5.m mVar) {
        java.lang.Exception exc;
        boolean z17;
        synchronized (mVar.f351985a) {
            synchronized (mVar.f351985a) {
                exc = mVar.f351988d;
            }
            z17 = exc != null;
        }
        if (!z17) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.ExpansionsGlobal", "#isFaulted, request expansions fail");
        this.f99772a.apply(java.lang.Boolean.FALSE);
        return null;
    }
}
