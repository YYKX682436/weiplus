package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class c2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.d2 f72589d;

    public c2(com.tencent.mm.plugin.aa.ui.d2 d2Var) {
        this.f72589d = d2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.aa.ui.d2 d2Var = this.f72589d;
        com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI.O6(d2Var.f72600d, true);
        d2Var.f72600d.finish();
    }
}
