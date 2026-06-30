package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes4.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.n0 f102395d = new com.tencent.mm.plugin.finder.assist.n0();

    public n0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.x74 x74Var = (r45.x74) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(x74Var.f389845d);
        sb6.append(", boxContext: ");
        java.util.LinkedList boxContextList = x74Var.f389846e;
        kotlin.jvm.internal.o.f(boxContextList, "boxContextList");
        r45.qn qnVar = (r45.qn) kz5.n0.Z(boxContextList);
        sb6.append(qnVar != null ? com.tencent.mm.plugin.finder.assist.o0.f102420a.b(qnVar) : null);
        return sb6.toString();
    }
}
