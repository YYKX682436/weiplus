package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class d implements km5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f70605a;

    public d(com.tencent.mm.modelbase.i iVar) {
        this.f70605a = iVar;
    }

    @Override // km5.c
    public java.lang.Object call() {
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.modelbase.i iVar = this.f70605a;
        boolean z17 = iVar.f70647g.get();
        com.tencent.mm.modelbase.g gVar = iVar.f70644d;
        if (z17) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = (gVar == null || (oVar = gVar.f70626g) == null) ? "" : java.lang.Integer.valueOf(oVar.f70713d);
            com.tencent.mars.xlog.Log.w("MicroMsg.Cgi", "[call] has cancel. cgi=%s", objArr);
        } else {
            km5.b c17 = km5.u.c();
            gVar.getClass();
            gVar.f70627h = new java.lang.ref.WeakReference(c17);
            if (!((gm0.n) com.tencent.mm.modelbase.z2.f70847b).f273260a.f273288b.h(gVar, 0)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Cgi", "RunCgi doScene failed!");
                if (c17 == null) {
                    jm5.b.c("Vending.QuickAccess", "dummy mario", new java.lang.Object[0]);
                } else {
                    c17.a(null);
                }
            }
        }
        return null;
    }
}
