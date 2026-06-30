package com.tencent.mm.plugin.appbrand;

/* loaded from: classes3.dex */
public final class p0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f86304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f86305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86307d;

    public p0(com.tencent.mm.ui.widget.dialog.z2 z2Var, yz5.a aVar, java.lang.String str, int i17) {
        this.f86304a = z2Var;
        this.f86305b = aVar;
        this.f86306c = str;
        this.f86307d = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f86304a.B();
        yz5.a aVar = this.f86305b;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.appbrand.s0 s0Var = com.tencent.mm.plugin.appbrand.s0.f88438a;
        java.lang.String str = this.f86306c;
        if (str == null) {
            str = "";
        }
        s0Var.a(str, this.f86307d, 3);
    }
}
