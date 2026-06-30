package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class b0 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f99824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f99825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.c0 f99826c;

    public b0(com.tencent.mm.plugin.expt.ui.c0 c0Var, com.tencent.mm.ui.widget.picker.c0 c0Var2, java.util.ArrayList arrayList) {
        this.f99826c = c0Var;
        this.f99824a = c0Var2;
        this.f99825b = arrayList;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f99824a;
        c0Var.d();
        java.lang.String str = (java.lang.String) this.f99825b.get(c0Var.b());
        com.tencent.mm.plugin.expt.ui.KvInfoUI kvInfoUI = this.f99826c.f99828d;
        int i17 = com.tencent.mm.plugin.expt.ui.KvInfoUI.m;
        kvInfoUI.U6(str);
    }
}
