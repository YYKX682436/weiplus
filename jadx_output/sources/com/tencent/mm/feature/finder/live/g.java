package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f66713a;

    public g(com.tencent.mm.ipcinvoker.r rVar) {
        this.f66713a = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.ipcinvoker.r rVar = this.f66713a;
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("CheckWidgetDisplayableTask", th6, "next callback exception", new java.lang.Object[0]);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString("false"));
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.ju1 ju1Var = (r45.ju1) ke2.o0.f306976v.a(fVar, new r45.ju1());
            if (ju1Var != null && ju1Var.getBoolean(0)) {
                z17 = true;
                com.tencent.mars.xlog.Log.i("CheckWidgetDisplayableTask", "Check result: " + z17);
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(java.lang.String.valueOf(z17)));
                return jz5.f0.f302826a;
            }
        } else {
            com.tencent.mars.xlog.Log.i("CheckWidgetDisplayableTask", "cgi failed: type=" + fVar.f70615a + " code=" + fVar.f70616b);
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("CheckWidgetDisplayableTask", "Check result: " + z17);
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(java.lang.String.valueOf(z17)));
        return jz5.f0.f302826a;
    }
}
