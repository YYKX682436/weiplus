package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class t6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.u6 f105875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(com.tencent.mm.plugin.finder.extension.reddot.u6 u6Var) {
        super(1);
        this.f105875d = u6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((r45.tw3) obj).getInteger(0) >= this.f105875d.f105905j);
    }
}
