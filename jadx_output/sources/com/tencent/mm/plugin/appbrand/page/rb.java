package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class rb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.sb f87062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(com.tencent.mm.plugin.appbrand.page.sb sbVar, java.lang.String str) {
        super(0);
        this.f87062d = sbVar;
        this.f87063e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = ((com.tencent.mm.plugin.appbrand.page.n7) this.f87062d.f87094b.F()).x();
        return com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.createBufferHolderFromFileDescriptor(x17 != null ? x17.G0(this.f87063e) : null);
    }
}
