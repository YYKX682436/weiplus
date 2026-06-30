package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class t4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.u4 f99678d;

    public t4(com.tencent.mm.plugin.exdevice.ui.u4 u4Var) {
        this.f99678d = u4Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.exdevice.ui.u4 u4Var = this.f99678d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(u4Var.f99691d.B)) {
            g4Var.f(5, u4Var.f99691d.getString(com.tencent.mm.R.string.c4b));
        }
        g4Var.f(3, u4Var.f99691d.getString(com.tencent.mm.R.string.c48));
    }
}
