package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class y implements o25.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f53709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler f53710b;

    public y(com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler deeplinkUriSpanHandler, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f53710b = deeplinkUriSpanHandler;
        this.f53709a = u3Var;
    }

    @Override // o25.k0
    public void b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        r45.zp6 I;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f53709a;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (m1Var == null || i17 == 0 || i18 == 0 || !(m1Var instanceof com.tencent.mm.modelsimple.h1) || (I = ((com.tencent.mm.modelsimple.h1) m1Var).I()) == null) {
            return;
        }
        com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler deeplinkUriSpanHandler = this.f53710b;
        if (com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a == null || com.tencent.mm.sdk.platformtools.t8.K0(I.f392285g)) {
            return;
        }
        android.content.Context context = com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a.getString(com.tencent.mm.R.string.f490573yv));
        sb6.append(" : ");
        java.lang.String str2 = I.f392285g;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        db5.t7.makeText(context, sb6.toString(), 0).show();
    }
}
