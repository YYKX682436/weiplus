package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.h f152465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.h2 f152466f;

    public e2(com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var, java.lang.String str, dn.h hVar) {
        this.f152466f = h2Var;
        this.f152464d = str;
        this.f152465e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dn.l lVar;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f152466f.f152528s;
        java.lang.String str = this.f152464d;
        dn.m mVar = (dn.m) concurrentHashMap.get(str);
        if (mVar == null || (lVar = mVar.f323329p0) == null) {
            return;
        }
        lVar.x(str, this.f152465e);
    }
}
