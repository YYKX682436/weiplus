package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class l implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f99840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f99841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.m f99842c;

    public l(com.tencent.mm.plugin.expt.ui.m mVar, com.tencent.mm.ui.widget.picker.c0 c0Var, java.lang.String[] strArr) {
        this.f99842c = mVar;
        this.f99840a = c0Var;
        this.f99841b = strArr;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f99840a;
        c0Var.d();
        com.tencent.mm.plugin.expt.ui.ExptDebugUI.U6(this.f99842c.f99843d, com.tencent.mm.sdk.platformtools.t8.P(this.f99841b[c0Var.b()], 0));
    }
}
