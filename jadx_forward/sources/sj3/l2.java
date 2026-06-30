package sj3;

/* loaded from: classes12.dex */
public final class l2 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490154a;

    public l2(sj3.g3 g3Var) {
        this.f490154a = g3Var;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        sj3.g3 g3Var = this.f490154a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = g3Var.f490053a;
        if (!(serviceConnectionC16581x3d1d6bd2 instanceof android.app.Activity)) {
            serviceConnectionC16581x3d1d6bd2 = null;
        }
        if (!com.p314xaae8f345.mm.ui.fj.b(serviceConnectionC16581x3d1d6bd2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd22 = g3Var.f490053a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd23 = serviceConnectionC16581x3d1d6bd22 instanceof android.app.Activity ? serviceConnectionC16581x3d1d6bd22 : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(serviceConnectionC16581x3d1d6bd23);
            if (!com.p314xaae8f345.mm.ui.bk.z(serviceConnectionC16581x3d1d6bd23.getTaskId())) {
                g4Var.g(1, g3Var.f490053a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2b), com.p314xaae8f345.mm.R.raw.f80311xadf8c434);
                g4Var.g(2, g3Var.f490053a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k27), com.p314xaae8f345.mm.R.raw.f80184xd8bebcd4);
            }
        }
        g4Var.g(1, g3Var.f490053a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574945k26), com.p314xaae8f345.mm.R.raw.f80164x8f15f9e0);
        g4Var.g(2, g3Var.f490053a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k27), com.p314xaae8f345.mm.R.raw.f80184xd8bebcd4);
    }
}
