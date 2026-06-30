package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.v f104655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.convert.v vVar) {
        super(0);
        this.f104655d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.convert.v vVar = this.f104655d;
        return java.lang.Integer.valueOf((((java.lang.Number) ((jz5.n) vVar.f104751h).getValue()).intValue() - (((java.lang.Number) ((jz5.n) vVar.f104752i).getValue()).intValue() * 6)) / 2);
    }
}
