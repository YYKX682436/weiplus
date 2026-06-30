package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String username, r45.d1 d1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        if (d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AccountManagementUI", "startFromContext username: " + username + ", config is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13930xdbd6d612.f190731g;
            intent.putExtra("ACCOUNT_EXTRA_CONFIG", d1Var.mo14344x5f01b1f6());
            intent.putExtra("ACCOUNT_USERNAME", username);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManagementUI", "startFromContext, username: " + username + ", config: " + d1Var);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Ai(context, intent);
    }
}
