package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes8.dex */
public class f3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f72637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72638e;

    public f3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, com.tencent.mm.ui.widget.dialog.k0 k0Var, android.view.View view) {
        this.f72637d = k0Var;
        this.f72638e = view;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f72637d;
        k0Var.o(null);
        k0Var.o(this.f72638e);
    }
}
