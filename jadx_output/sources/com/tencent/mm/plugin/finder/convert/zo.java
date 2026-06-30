package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class zo implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105120a;

    public zo(in5.s0 s0Var) {
        this.f105120a = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[3];
        pf5.u uVar = pf5.u.f353936a;
        in5.s0 s0Var = this.f105120a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String str2 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135386r;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.String str3 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        lVarArr[1] = new jz5.l("finder_context_id", str3 != null ? str3 : "");
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n));
        return kz5.c1.k(lVarArr);
    }
}
