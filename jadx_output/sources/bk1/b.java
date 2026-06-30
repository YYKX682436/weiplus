package bk1;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk1.c f21288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent f21289e;

    public b(bk1.c cVar, com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent onWxaAuthorizeScopeModifyEvent) {
        this.f21288d = cVar;
        this.f21289e = onWxaAuthorizeScopeModifyEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f21288d.f21292d;
        com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent onWxaAuthorizeScopeModifyEvent = this.f21289e;
        java.lang.String str = onWxaAuthorizeScopeModifyEvent.f89514g;
        java.util.List<r45.vb> list = onWxaAuthorizeScopeModifyEvent.f89515h;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.vb vbVar : list) {
            r45.xf7 xf7Var = new r45.xf7();
            xf7Var.f390056d = vbVar.f388058d;
            xf7Var.f390057e = vbVar.f388059e;
            boolean z17 = true;
            if (1 != vbVar.f388060f) {
                z17 = false;
            }
            arrayList.add(new bk1.o(xf7Var, z17));
        }
        lVar.invoke(new bk1.x(str, arrayList));
    }
}
