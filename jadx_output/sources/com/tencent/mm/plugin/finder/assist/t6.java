package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes9.dex */
public final class t6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g9 f102551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f102552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102553f;

    public t6(bw5.g9 g9Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        this.f102551d = g9Var;
        this.f102552e = h0Var;
        this.f102553f = str;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        bw5.g9 g9Var = this.f102551d;
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share showWindow " + g9Var.getFinderUsername() + " cancel");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share showWindow " + g9Var.getFinderUsername() + " to " + stringArrayListExtra);
        kotlin.jvm.internal.h0 h0Var = this.f102552e;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        java.lang.String str = this.f102553f;
        if (str == null || str.length() == 0) {
            return;
        }
        ((dk5.s5) tg3.t1.a()).Ui((java.lang.String) h0Var.f310123d, str);
    }
}
