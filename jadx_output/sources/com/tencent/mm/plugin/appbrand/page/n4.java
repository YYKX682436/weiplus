package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class n4 implements com.tencent.mm.plugin.appbrand.page.u4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f86900a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86901b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.c5 f86902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f86905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86906g;

    public n4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.c5 c5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, long j17) {
        this.f86906g = i3Var;
        this.f86902c = c5Var;
        this.f86903d = str;
        this.f86904e = wdVar;
        this.f86905f = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void a() {
        boolean z17 = this.f86901b;
        com.tencent.mm.plugin.appbrand.page.c5 c5Var = this.f86902c;
        if (z17) {
            nd1.o0 o0Var = (nd1.o0) c5Var;
            o0Var.f336360a.a(o0Var.f336366g, o0Var.f336367h.o("fail cancel"));
        } else {
            if (this.f86906g.f86702e == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "attempt to proceed but destroyed, url[%s], type[%s]", this.f86903d, this.f86904e);
                nd1.o0 o0Var2 = (nd1.o0) c5Var;
                o0Var2.f336360a.a(o0Var2.f336366g, o0Var2.f336367h.o("fail:internal error"));
                return;
            }
            if (this.f86900a) {
                return;
            }
            this.f86900a = true;
            nd1.o0 o0Var3 = (nd1.o0) c5Var;
            com.tencent.mm.plugin.appbrand.y yVar = o0Var3.f336360a;
            yVar.m(new nd1.n0(o0Var3.f336361b, o0Var3.f336362c, o0Var3.f336363d, o0Var3.f336364e, o0Var3.f336365f, yVar, o0Var3.f336366g, o0Var3.f336367h));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void c(java.lang.String str, java.lang.Object obj) {
        this.f86906g.f86719y.b(this.f86905f, str, obj, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void cancel() {
        this.f86901b = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void setAnimationEnabled(boolean z17) {
    }
}
