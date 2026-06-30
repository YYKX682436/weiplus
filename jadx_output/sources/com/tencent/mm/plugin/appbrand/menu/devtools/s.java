package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class s implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f85922d;

    public s(boolean z17) {
        this.f85922d = z17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.a(0, com.tencent.mm.R.string.eqq);
        if (this.f85922d) {
            g4Var.a(1, com.tencent.mm.R.string.ehg);
            g4Var.a(2, com.tencent.mm.R.string.dnl);
        }
    }
}
