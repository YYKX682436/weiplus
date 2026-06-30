package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f80072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.String str, yz5.l lVar) {
        super(0);
        this.f80071d = str;
        this.f80072e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(this.f80071d);
        if (b17 != null) {
            b17.I1(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f0(this.f80072e, b17));
        }
        return jz5.f0.f302826a;
    }
}
