package com.tencent.luggage.sdk.processes.client;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lze/n;", "RUNTIME", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class LuggageClientProcessMessage<RUNTIME extends ze.n> implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f47636d;

    public LuggageClientProcessMessage(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f47636d = appId;
    }

    /* renamed from: a, reason: from getter */
    public java.lang.String getF89038e() {
        return this.f47636d;
    }

    public abstract void b(ze.n nVar);
}
