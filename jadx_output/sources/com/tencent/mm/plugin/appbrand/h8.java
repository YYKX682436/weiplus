package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class h8 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.z5 f78265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78266e;

    public h8(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.z5 z5Var) {
        this.f78266e = o6Var;
        this.f78265d = z5Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.BACKGROUND == bVar) {
            this.f78266e.N.c(this);
            final com.tencent.mm.plugin.appbrand.z5 z5Var = this.f78265d;
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.h8$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.h8 h8Var = com.tencent.mm.plugin.appbrand.h8.this;
                    h8Var.getClass();
                    h8Var.f78266e.o3((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) z5Var.f92446c, com.tencent.mm.plugin.appbrand.s8.NavStackBack);
                }
            });
        }
    }
}
