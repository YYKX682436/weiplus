package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class oi extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f104181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f104182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.convert.oj ojVar) {
        super(1);
        this.f104181d = c0Var;
        this.f104182e = ojVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kotlin.jvm.internal.c0 c0Var = this.f104181d;
        c0Var.f310112d = c0Var.f310112d || kotlin.jvm.internal.o.b(it, this.f104182e.C);
        return java.lang.Boolean.FALSE;
    }
}
