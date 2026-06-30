package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class i0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f100975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.h0 f100976b;

    public i0(com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var, o72.r2 r2Var) {
        this.f100976b = h0Var;
        this.f100975a = r2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f100976b;
        h0Var.f100954n.f372655f = -1;
        o72.l4 l4Var = (o72.l4) i95.n0.c(o72.l4.class);
        ((x82.i) l4Var).wi(h0Var.f100952l, this.f100975a, h0Var.f100954n);
    }
}
