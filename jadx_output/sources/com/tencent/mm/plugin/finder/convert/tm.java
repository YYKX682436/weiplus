package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class tm implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104635d;

    public tm(in5.s0 s0Var) {
        this.f104635d = s0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            in5.s0 s0Var = this.f104635d;
            g4Var.d(1, s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.f478532ac), s0Var.f293121e.getResources().getString(com.tencent.mm.R.string.nkk));
        }
    }
}
