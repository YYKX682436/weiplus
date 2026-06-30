package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f84542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCString f84543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(l81.b1 b1Var, com.tencent.mm.ipcinvoker.type.IPCString iPCString) {
        super(0);
        this.f84542d = b1Var;
        this.f84543e = iPCString;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.webkit.ValueCallback valueCallback = this.f84542d.f317037o;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = this.f84543e;
        valueCallback.onReceiveValue(iPCString != null ? iPCString.f68406d : null);
        return jz5.f0.f302826a;
    }
}
