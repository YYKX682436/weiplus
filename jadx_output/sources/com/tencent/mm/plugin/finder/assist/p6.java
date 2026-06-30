package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class p6 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f102456d;

    public p6(ya2.b2 b2Var) {
        this.f102456d = b2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share memberArea ");
            ya2.b2 b2Var = this.f102456d;
            sb6.append(b2Var.w0());
            sb6.append('(');
            sb6.append(b2Var.D0());
            sb6.append(") to ");
            sb6.append(stringArrayListExtra);
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().h(stringArrayListExtra);
        }
    }
}
