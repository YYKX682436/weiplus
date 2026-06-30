package com.tencent.mm.plugin.appbrand;

/* loaded from: classes3.dex */
public final class o0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f86152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f86153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86154c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86155d;

    public o0(com.tencent.mm.ui.widget.dialog.z2 z2Var, yz5.a aVar, java.lang.String str, int i17) {
        this.f86152a = z2Var;
        this.f86153b = aVar;
        this.f86154c = str;
        this.f86155d = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f86152a.B();
        yz5.a aVar = this.f86153b;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.appbrand.s0 s0Var = com.tencent.mm.plugin.appbrand.s0.f88438a;
        java.lang.String str = this.f86154c;
        if (str == null) {
            str = "";
        }
        s0Var.a(str, this.f86155d, 3);
    }
}
