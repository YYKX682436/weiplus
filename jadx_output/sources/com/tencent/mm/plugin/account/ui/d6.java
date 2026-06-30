package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class d6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.f6 f73797d;

    public d6(com.tencent.mm.plugin.account.ui.f6 f6Var) {
        this.f73797d = f6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.f6 f6Var = this.f73797d;
        d17.a(145, f6Var.f73843d);
        h11.e eVar = new h11.e(f6Var.f73843d.f73356h, 16, "", 0, "");
        gm0.j1.d().g(eVar);
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass = f6Var.f73843d;
        loginIndepPass.f73359n = db5.e1.Q(loginIndepPass, loginIndepPass.getString(com.tencent.mm.R.string.f490573yv), f6Var.f73843d.getString(com.tencent.mm.R.string.f490468vx), true, true, new com.tencent.mm.plugin.account.ui.c6(this, eVar));
    }
}
