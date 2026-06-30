package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class q0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.t0 f101051b;

    public q0(com.tencent.mm.plugin.fav.ui.gallery.t0 t0Var, o72.r2 r2Var) {
        this.f101051b = t0Var;
        this.f101050a = r2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.gallery.t0 t0Var = this.f101051b;
        t0Var.f101081a.f100954n.f372655f = -1;
        o72.l4 l4Var = (o72.l4) i95.n0.c(o72.l4.class);
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = t0Var.f101081a;
        ((x82.i) l4Var).wi(h0Var.f100952l, this.f101050a, h0Var.f100954n);
    }
}
