package com.tencent.mm.plugin.appbrand;

/* loaded from: classes3.dex */
public final class q0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f87718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f87719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87721d;

    public q0(android.content.Context context, yz5.a aVar, java.lang.String str, int i17) {
        this.f87718a = context;
        this.f87719b = aVar;
        this.f87720c = str;
        this.f87721d = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.appbrand.s0 s0Var = com.tencent.mm.plugin.appbrand.s0.f88438a;
        ((com.tencent.mm.plugin.appbrand.app.t2) ((com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class))).wi(this.f87718a, 11, false);
        yz5.a aVar = this.f87719b;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.String str = this.f87720c;
        if (str == null) {
            str = "";
        }
        s0Var.a(str, this.f87721d, 4);
    }
}
