package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.h f70932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.h2 f70933f;

    public e2(com.tencent.mm.modelcdntran.h2 h2Var, java.lang.String str, dn.h hVar) {
        this.f70933f = h2Var;
        this.f70931d = str;
        this.f70932e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dn.l lVar;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f70933f.f70995s;
        java.lang.String str = this.f70931d;
        dn.m mVar = (dn.m) concurrentHashMap.get(str);
        if (mVar == null || (lVar = mVar.f241796p0) == null) {
            return;
        }
        lVar.x(str, this.f70932e);
    }
}
