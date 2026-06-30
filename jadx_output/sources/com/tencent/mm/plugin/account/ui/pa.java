package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class pa implements android.content.DialogInterface.OnClickListener {
    public pa(com.tencent.mm.plugin.account.ui.ra raVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.pa.class.getName());
        sb6.append(",R200_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_200"));
        sb6.append(",2");
        n71.a.c(10645, true, sb6.toString());
    }
}
