package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f84592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCInteger f84593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(l81.b1 b1Var, com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger) {
        super(0);
        this.f84592d = b1Var;
        this.f84593e = iPCInteger;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.webkit.ValueCallback valueCallback = this.f84592d.f317038p;
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = this.f84593e;
        valueCallback.onReceiveValue(iPCInteger != null ? java.lang.Integer.valueOf(iPCInteger.f68404d) : null);
        return jz5.f0.f302826a;
    }
}
