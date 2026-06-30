package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class i4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.q4 f99503d;

    public i4(com.tencent.mm.plugin.exdevice.ui.q4 q4Var) {
        this.f99503d = q4Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.exdevice.ui.q4 q4Var = this.f99503d;
        g4Var.g(0, q4Var.f99630d.getString(com.tencent.mm.R.string.f491146c44), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        g4Var.g(1, q4Var.f99630d.getString(com.tencent.mm.R.string.f491148c46), com.tencent.mm.R.raw.bottomsheet_icon_moment);
    }
}
