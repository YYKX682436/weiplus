package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class o9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.x9 f105751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(com.tencent.mm.plugin.finder.extension.reddot.x9 x9Var, java.lang.String str) {
        super(1);
        this.f105751d = x9Var;
        this.f105752e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.HashSet changePath = (java.util.HashSet) obj;
        kotlin.jvm.internal.o.g(changePath, "changePath");
        this.f105751d.q1(this.f105752e, com.tencent.mm.plugin.finder.extension.reddot.a9.f105349d, changePath);
        return jz5.f0.f302826a;
    }
}
