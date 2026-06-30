package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86878e;

    public m6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        this.f86878e = v5Var;
        this.f86877d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        al1.l lVar = this.f86878e.G;
        if (lVar == null) {
            return;
        }
        lVar.setStatusBarForegroundStyle(al1.j0.a(this.f86877d) == al1.j0.BLACK);
    }
}
