package com.tencent.mm.plugin.appbrand.jsapi.msgchannel;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, java.util.ArrayList arrayList) {
        super(1);
        this.f82289d = str;
        this.f82290e = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s it = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage(this.f82289d, this.f82290e);
    }
}
