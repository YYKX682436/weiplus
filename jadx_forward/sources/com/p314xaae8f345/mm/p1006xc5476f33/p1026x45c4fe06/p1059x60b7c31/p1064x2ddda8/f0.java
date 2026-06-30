package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class f0 {
    public f0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String content, java.lang.String positiveBtnText, java.lang.String negativeBtnText, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l0 positivePerformer, android.content.DialogInterface.OnDismissListener onDismissListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(positiveBtnText, "positiveBtnText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(negativeBtnText, "negativeBtnText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(positivePerformer, "positivePerformer");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(content);
        u1Var.n(positiveBtnText);
        if (negativeBtnText.length() > 0) {
            u1Var.j(negativeBtnText);
        }
        u1Var.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d0.f160965a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.e0(positivePerformer));
        u1Var.e(onDismissListener);
        u1Var.q(false);
        u1Var.f293531c.k(-2, negativeBtnText.length() > 0);
        u1Var.f293531c.k(-1, positiveBtnText.length() > 0);
    }
}
