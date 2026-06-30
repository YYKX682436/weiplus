package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class to extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.uo f104639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(com.tencent.mm.plugin.finder.convert.uo uoVar) {
        super(0);
        this.f104639d = uoVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.convert.uo uoVar = this.f104639d;
        return java.lang.Integer.valueOf((((java.lang.Number) ((jz5.n) uoVar.f104726h).getValue()).intValue() - (((java.lang.Number) ((jz5.n) uoVar.f104727i).getValue()).intValue() * 6)) / 2);
    }
}
