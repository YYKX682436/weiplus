package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class f0 {
    public f0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String content, java.lang.String positiveBtnText, java.lang.String negativeBtnText, com.tencent.mm.plugin.appbrand.jsapi.auth.l0 positivePerformer, android.content.DialogInterface.OnDismissListener onDismissListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(positiveBtnText, "positiveBtnText");
        kotlin.jvm.internal.o.g(negativeBtnText, "negativeBtnText");
        kotlin.jvm.internal.o.g(positivePerformer, "positivePerformer");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(content);
        u1Var.n(positiveBtnText);
        if (negativeBtnText.length() > 0) {
            u1Var.j(negativeBtnText);
        }
        u1Var.c(com.tencent.mm.plugin.appbrand.jsapi.auth.d0.f79432a, new com.tencent.mm.plugin.appbrand.jsapi.auth.e0(positivePerformer));
        u1Var.e(onDismissListener);
        u1Var.q(false);
        u1Var.f211998c.k(-2, negativeBtnText.length() > 0);
        u1Var.f211998c.k(-1, positiveBtnText.length() > 0);
    }
}
