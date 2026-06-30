package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ab implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.w6 f73716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.sa f73717e;

    public ab(com.tencent.mm.plugin.account.ui.sa saVar, com.tencent.mm.plugin.account.ui.w6 w6Var) {
        this.f73717e = saVar;
        this.f73716d = w6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73716d;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        java.lang.String str2 = w6Var.f74286b;
        java.lang.String str3 = w6Var.f74287c;
        int i18 = w6Var.f74292h;
        com.tencent.mm.plugin.account.ui.sa saVar = this.f73717e;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(str2, str3, i18, saVar.f74189e.getSecImgCode(), saVar.f74189e.getSecImgSid(), saVar.f74189e.getSecImgEncryptKey(), 1, "", false, false);
        gm0.j1.d().g(v0Var);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = saVar.f74188d;
        mobileInputUI.f73486n = db5.e1.Q(mobileInputUI, mobileInputUI.getString(com.tencent.mm.R.string.f490573yv), saVar.f74188d.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.za(this, v0Var));
    }
}
