package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class v2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.x2 f74635d;

    public v2(com.tencent.mm.plugin.address.ui.x2 x2Var) {
        this.f74635d = x2Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.address.ui.x2 x2Var = this.f74635d;
        g4Var.d(3, x2Var.f74645f.getColor(com.tencent.mm.R.color.Red_100), x2Var.f74645f.getString(com.tencent.mm.R.string.hte));
    }
}
