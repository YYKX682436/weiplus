package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class u implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f85929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f85930e;

    public u(boolean z17, int i17) {
        this.f85929d = z17;
        this.f85930e = i17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (this.f85929d) {
            int i17 = this.f85930e;
            if (i17 == 1) {
                g4Var.a(4, com.tencent.mm.R.string.f490036du0);
                g4Var.a(5, com.tencent.mm.R.string.duc);
            } else if (i17 == 2) {
                g4Var.a(6, com.tencent.mm.R.string.dxv);
            }
        }
        g4Var.a(3, com.tencent.mm.R.string.ehf);
    }
}
