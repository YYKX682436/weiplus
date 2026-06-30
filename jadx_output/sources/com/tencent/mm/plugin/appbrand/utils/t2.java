package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.u2 f90561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.plugin.appbrand.utils.u2 u2Var) {
        super(1);
        this.f90561d = u2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.IconAttacher", "onCancel#loadIcon, tr: " + ((java.lang.Throwable) obj));
        l01.d0.f314761a.e(this.f90561d);
        return jz5.f0.f302826a;
    }
}
