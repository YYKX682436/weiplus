package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class g5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.i5 f81825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f81826d;

    public g5(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.media.i5 i5Var, boolean z17) {
        this.f81823a = lVar;
        this.f81824b = i17;
        this.f81825c = i5Var;
        this.f81826d = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        fl1.g1 g1Var;
        com.tencent.mm.plugin.appbrand.jsapi.media.a0 a0Var = (com.tencent.mm.plugin.appbrand.jsapi.media.a0) obj;
        boolean z17 = a0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.media.y;
        com.tencent.mm.plugin.appbrand.jsapi.media.i5 i5Var = this.f81825c;
        int i17 = this.f81824b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81823a;
        if (z17) {
            java.lang.String str = ((com.tencent.mm.plugin.appbrand.jsapi.media.y) a0Var).f82145a;
            if (str == null) {
                str = "";
            }
            lVar.a(i17, i5Var.o("fail ".concat(str)));
        } else if (a0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.media.z) {
            if (lVar.isRunning()) {
                boolean z18 = this.f81826d;
                if (z18) {
                    g1Var = new fl1.g1(lVar.getF147807d());
                    g1Var.setMessage(lVar.getF147807d().getString(com.tencent.mm.R.string.f490080kc));
                    g1Var.setCanceledOnTouchOutside(false);
                    fl1.g2 dialogContainer = lVar.getDialogContainer();
                    if (dialogContainer != null) {
                        dialogContainer.c(g1Var);
                    }
                } else {
                    g1Var = null;
                }
                pq5.g b17 = pq5.h.b(((com.tencent.mm.plugin.appbrand.jsapi.media.z) a0Var).f82160a.get(0));
                b17.H(new com.tencent.mm.plugin.appbrand.jsapi.media.b5(lVar, z18));
                b17.K(new com.tencent.mm.plugin.appbrand.jsapi.media.c5(lVar, i17, i5Var, a0Var));
                b17.h(new com.tencent.mm.plugin.appbrand.jsapi.media.d5(g1Var)).s(new com.tencent.mm.plugin.appbrand.jsapi.media.f5(g1Var));
            }
        } else if (kotlin.jvm.internal.o.b(a0Var, com.tencent.mm.plugin.appbrand.jsapi.media.x.f82124a)) {
            lVar.a(i17, i5Var.o("fail user canceled"));
        }
        return jz5.f0.f302826a;
    }
}
