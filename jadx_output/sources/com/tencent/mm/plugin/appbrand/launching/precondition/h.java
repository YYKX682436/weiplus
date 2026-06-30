package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class h implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.f f84990a;

    public h(com.tencent.mm.plugin.appbrand.launching.precondition.f fVar) {
        this.f84990a = fVar;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.d9 d9Var = (com.tencent.mm.sdk.platformtools.d9) obj;
        com.tencent.mm.plugin.appbrand.launching.precondition.f fVar = this.f84990a;
        android.content.Context baseContext = fVar.f84980c.f84957f.getBaseContext();
        java.lang.String str = d9Var.f192538b;
        java.lang.String str2 = d9Var.f192537a;
        java.lang.String str3 = d9Var.f192539c;
        java.lang.String str4 = d9Var.f192540d;
        android.content.DialogInterface.OnClickListener onClickListener = d9Var.f192541e;
        com.tencent.mm.plugin.appbrand.ipc.d.a(baseContext, str, str2, str3, str4, onClickListener, d9Var.f192542f, onClickListener);
        fVar.f84980c.f84957f.e(null, null);
    }
}
