package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f91553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f91554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f91555f;

    public n1(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, java.lang.Integer num) {
        this.f91553d = v5Var;
        this.f91554e = str;
        this.f91555f = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.p4 a17;
        x.b bVar = com.tencent.mm.plugin.appbrand.widget.input.r1.f91643f;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f91553d;
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = (com.tencent.mm.plugin.appbrand.widget.input.t4) bVar.getOrDefault(v5Var, null);
        if (t4Var == null || (a17 = com.tencent.mm.plugin.appbrand.widget.input.r1.a(v5Var, ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).getInputId())) == null) {
            return;
        }
        a17.d(this.f91554e, this.f91555f);
    }
}
