package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101971d;

    public x0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        this.f101971d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f101971d.I;
        if (f5Var != null) {
            f5Var.f();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }
}
