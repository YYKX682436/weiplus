package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f85004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.l f85005f;

    public k(com.tencent.mm.plugin.appbrand.launching.precondition.l lVar, java.lang.String str, java.lang.Boolean bool) {
        this.f85005f = lVar;
        this.f85003d = str;
        this.f85004e = bool;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.launching.precondition.l lVar = this.f85005f;
        if (this.f85003d.equals(lVar.f85012d.f85013d.f77278d) && this.f85004e.booleanValue()) {
            lVar.f85012d.f85014e.run();
        } else {
            lVar.f85012d.f85015f.f84980c.f84957f.e(null, null);
        }
    }
}
