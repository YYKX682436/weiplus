package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class bk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ck f102982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(com.tencent.mm.plugin.finder.convert.ck ckVar) {
        super(0);
        this.f102982d = ckVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.convert.ck ckVar = this.f102982d;
        return java.lang.Integer.valueOf((((java.lang.Number) ((jz5.n) ckVar.f103066i).getValue()).intValue() - (((java.lang.Number) ((jz5.n) ckVar.f103067m).getValue()).intValue() * 6)) / 2);
    }
}
