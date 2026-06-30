package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String username, r45.d1 d1Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        if (d1Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.AccountManagementUI", "startFromContext username: " + username + ", config is null");
        } else {
            com.tencent.mm.plugin.finder.feed.ui.f fVar = com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent.f109198g;
            intent.putExtra("ACCOUNT_EXTRA_CONFIG", d1Var.toByteArray());
            intent.putExtra("ACCOUNT_USERNAME", username);
            com.tencent.mars.xlog.Log.i("Finder.AccountManagementUI", "startFromContext, username: " + username + ", config: " + d1Var);
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ai(context, intent);
    }
}
