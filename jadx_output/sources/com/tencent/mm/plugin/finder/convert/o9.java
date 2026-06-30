package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class o9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104163e;

    public o9(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        this.f104162d = qeVar;
        this.f104163e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f104163e;
        this.f104162d.o0(s0Var, s0Var.getAdapterPosition(), s0Var.getItemViewType(), 2);
    }
}
