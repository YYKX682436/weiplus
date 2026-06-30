package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.t f105832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105834f;

    public s(com.tencent.mm.plugin.finder.extension.reddot.t tVar, java.lang.String str, java.lang.String str2) {
        this.f105832d = tVar;
        this.f105833e = str;
        this.f105834f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        c61.l7 l7Var = (c61.l7) i95.n0.c(c61.l7.class);
        synchronized (l7Var.f39118i) {
            z17 = l7Var.f39118i[0] != null;
        }
        if (!z17 || !gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w(this.f105832d.f105867b, "checkPathAndNotify not ready!");
            return;
        }
        try {
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(this.f105832d.f105866a, this.f105833e, this.f105834f, false, false, 12, null);
            boolean p17 = this.f105832d.f105866a.p(this.f105833e, S0);
            if (S0 != null) {
                r45.f03 I0 = S0.I0(this.f105833e);
                if (I0 != null) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, "checkPathAndNotify", true, this.f105833e, I0, S0, null, p17, 32, null);
                } else {
                    com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a.a("checkPathAndNotify_showInfoNull", false, this.f105833e, null, S0, this.f105834f, p17);
                }
            } else {
                com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a.a("checkPathAndNotify_null", false, this.f105833e, null, null, this.f105834f, p17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f105832d.f105867b, e17, "checkPathAndNotify exception!", new java.lang.Object[0]);
        }
    }
}
