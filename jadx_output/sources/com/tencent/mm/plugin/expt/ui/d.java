package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes9.dex */
public class d implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f99829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f99830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.e f99831c;

    public d(com.tencent.mm.plugin.expt.ui.e eVar, com.tencent.mm.ui.widget.picker.c0 c0Var, java.lang.String[] strArr) {
        this.f99831c = eVar;
        this.f99829a = c0Var;
        this.f99830b = strArr;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f99829a;
        c0Var.d();
        com.tencent.mm.plugin.expt.ui.ExptAppDebugUI.U6(this.f99831c.f99832d, com.tencent.mm.sdk.platformtools.t8.P(this.f99830b[c0Var.b()], 0));
    }
}
