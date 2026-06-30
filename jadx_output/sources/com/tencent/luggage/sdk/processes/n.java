package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.r f47669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.w f47671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.LuggageServiceType f47672g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.luggage.sdk.processes.r rVar, java.lang.String str, com.tencent.luggage.sdk.processes.w wVar, com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType) {
        super(0);
        this.f47669d = rVar;
        this.f47670e = str;
        this.f47671f = wVar;
        this.f47672g = luggageServiceType;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new jz5.l(com.tencent.luggage.sdk.processes.x.f47699d, this.f47669d.m(this.f47670e, this.f47671f, this.f47672g));
    }
}
