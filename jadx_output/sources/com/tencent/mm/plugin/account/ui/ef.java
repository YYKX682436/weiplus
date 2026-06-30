package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class ef implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f73827d;

    public ef(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI) {
        this.f73827d = regByMobileRegAIOUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(this.f73827d.getClass().getName());
        sb6.append(",RE200_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("RE200_200"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
        n71.a.e("RE200_100");
    }
}
