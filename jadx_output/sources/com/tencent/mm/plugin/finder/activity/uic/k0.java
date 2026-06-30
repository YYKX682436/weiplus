package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class k0 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101902a;

    public k0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        this.f101902a = c1Var;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        fp0.u uVar = fp0.u.f265291g;
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101902a;
        if (status == uVar) {
            com.tencent.mm.plugin.finder.activity.uic.c1.P6(c1Var);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = c1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.activity.uic.h1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.activity.uic.h1.class)).S6(c1Var.H);
        c1Var.R6(task);
    }
}
