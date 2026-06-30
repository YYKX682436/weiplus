package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes11.dex */
public class x4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.y4 f99721d;

    public x4(com.tencent.mm.plugin.exdevice.ui.y4 y4Var) {
        this.f99721d = y4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        com.tencent.mm.plugin.exdevice.ui.y4 y4Var = this.f99721d;
        com.tencent.mm.storage.z3 n17 = Bi.n(y4Var.f99729d.f99304e, true);
        ve4.g.a(37);
        c01.e2.w0(n17);
        y4Var.f99729d.f99302J.alive();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = y4Var.f99729d.f99322z;
        if (u3Var != null) {
            u3Var.show();
        }
    }
}
