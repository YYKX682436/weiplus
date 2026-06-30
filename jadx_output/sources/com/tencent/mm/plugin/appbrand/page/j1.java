package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.m1 f86780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.o1 f86781e;

    public j1(com.tencent.mm.plugin.appbrand.page.o1 o1Var, com.tencent.mm.plugin.appbrand.page.m1 m1Var) {
        this.f86781e = o1Var;
        this.f86780d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.o1 o1Var = this.f86781e;
        com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule = o1Var.f86942c;
        com.tencent.mm.plugin.appbrand.page.m1 m1Var = this.f86780d;
        if (appCommentModule != null) {
            ((com.tencent.mm.plugin.appbrand.page.p0) m1Var).b(appCommentModule, false, o1Var.f86943d);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(o1Var.f86941b)) {
            ((com.tencent.mm.plugin.appbrand.page.p0) m1Var).a(o1Var.f86941b);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(o1Var.f86944e)) {
            return;
        }
        java.lang.String str = o1Var.f86944e;
        android.widget.TextView textView = ((com.tencent.mm.plugin.appbrand.page.p0) m1Var).f86982d;
        textView.setText(str);
        textView.setVisibility(0);
    }
}
