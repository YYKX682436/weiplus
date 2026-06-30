package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class sc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg f74198d;

    public sc(com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg) {
        this.f74198d = mobileLoginOrForceReg;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg = this.f74198d;
        com.tencent.mm.plugin.account.ui.w6 w6Var = mobileLoginOrForceReg.M;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        com.tencent.mm.plugin.account.ui.w6 w6Var2 = mobileLoginOrForceReg.M;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(w6Var2.f74286b, w6Var2.f74288d, w6Var2.f74292h, mobileLoginOrForceReg.B.getSecImgCode(), mobileLoginOrForceReg.B.getSecImgSid(), mobileLoginOrForceReg.B.getSecImgEncryptKey(), 1, "", false, true);
        gm0.j1.d().g(v0Var);
        com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg2 = this.f74198d;
        db5.e1.Q(mobileLoginOrForceReg2, mobileLoginOrForceReg2.getString(com.tencent.mm.R.string.f490573yv), mobileLoginOrForceReg.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.rc(this, v0Var));
    }
}
