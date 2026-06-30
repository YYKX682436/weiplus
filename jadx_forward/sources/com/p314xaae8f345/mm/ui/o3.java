package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public abstract class o3 {
    public static void a(android.content.Context context, java.lang.Runnable runnable) {
        db5.e1.B(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gq7), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gq8), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.n3(runnable, context), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
    }

    public static void b(android.content.Context context, java.lang.Runnable runnable) {
        if (!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, true)) {
            a(context, runnable);
            return;
        }
        db5.h3 h3Var = new db5.h3(context);
        h3Var.L.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gq_));
        h3Var.M.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gq9));
        h3Var.N.setOnClickListener(new com.p314xaae8f345.mm.ui.m3(h3Var, context, runnable));
        h3Var.C();
    }
}
