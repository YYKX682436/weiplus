package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.f f47610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage f47611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.luggage.sdk.launching.f fVar, com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage onWXAppResultXPCMessage) {
        super(0);
        this.f47610d = fVar;
        this.f47611e = onWXAppResultXPCMessage;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.ipcinvoker.type.IPCVoid) com.tencent.mm.ipcinvoker.f.b(this.f47610d.f47613f, this.f47611e, com.tencent.luggage.sdk.launching.d.f47609a);
    }
}
