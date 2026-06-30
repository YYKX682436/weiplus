package com.tencent.mm.plugin.component.editor;

/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.t1 f96633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.component.editor.t1 t1Var) {
        super(1);
        this.f96633d = t1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object tag = it.getTag();
        boolean z17 = tag instanceof gx1.b;
        com.tencent.mm.plugin.component.editor.t1 t1Var = this.f96633d;
        if (z17) {
            java.lang.String string = t1Var.getContext().getString(com.tencent.mm.R.string.by);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (!(tag instanceof gx1.g)) {
            return "";
        }
        java.lang.String string2 = t1Var.getContext().getString(com.tencent.mm.R.string.f489798c0);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
