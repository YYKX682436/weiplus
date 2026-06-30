package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.x3 f72873d;

    public w3(com.tencent.mm.plugin.aa.ui.x3 x3Var) {
        this.f72873d = x3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.x3 x3Var = this.f72873d;
        java.lang.String obj = x3Var.f72885d.D.getContentEt().getText().toString();
        androidx.appcompat.app.AppCompatActivity activity = x3Var.f72885d.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((h61.b) pf5.z.f353948a.a(activity).a(h61.b.class)).setValue("LAUNCH_AA_TOTAL_MONEY_EDIT_FORM_VALUE_KEY", obj);
    }
}
