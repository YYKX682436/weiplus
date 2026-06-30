package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class u6 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f102595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102596b;

    public u6(kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        this.f102595a = h0Var;
        this.f102596b = str;
    }

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && i17 == 1015) {
            kotlin.jvm.internal.h0 h0Var = this.f102595a;
            java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
            if (charSequence == null || charSequence.length() == 0) {
                return;
            }
            java.lang.String str = this.f102596b;
            if (str == null || str.length() == 0) {
                return;
            }
            ((dk5.s5) tg3.t1.a()).Ui((java.lang.String) h0Var.f310123d, str);
        }
    }
}
