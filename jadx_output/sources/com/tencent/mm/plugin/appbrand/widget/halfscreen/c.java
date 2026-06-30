package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class c extends ze.g {
    final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.appbrand.widget.halfscreen.f fVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(o6Var, null, true);
        this.this$0 = fVar;
    }

    @Override // ze.g, xi1.s
    public xi1.f getStatusBar() {
        xi1.g gVar;
        gVar = this.this$0.baseWindow;
        return gVar.getStatusBar();
    }
}
