package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class y extends com.tencent.mm.plugin.appbrand.profile.o {

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.profile.b f87715o;

    @Override // com.tencent.mm.plugin.appbrand.profile.o
    public void a(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (e9Var == null) {
            return;
        }
        this.f87696e = e9Var;
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = e9Var.getF147808e();
        if (f147808e == null) {
            return;
        }
        f147808e.addJavascriptInterface(new com.tencent.mm.plugin.appbrand.profile.w(this), "ProfileGlobal");
        ((com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)).k0(new com.tencent.mm.plugin.appbrand.profile.x(this, (com.tencent.mm.plugin.appbrand.jsruntime.l0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)));
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.o
    public void b(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.profile.b bVar = this.f87715o;
        if (bVar != null) {
            bVar.s(data);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.o, com.tencent.mm.plugin.appbrand.profile.b
    public void m(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.profile.b bVar = this.f87715o;
        if (bVar != null) {
            bVar.m(data);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.b
    public void s(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.profile.b bVar = this.f87715o;
        if (bVar != null) {
            bVar.s(data);
        }
    }
}
