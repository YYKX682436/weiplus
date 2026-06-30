package com.tencent.mm.plugin.appbrand.tipsmsg;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/tipsmsg/AppBrandOnGetTipsMsg;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "Lxe/h;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandOnGetTipsMsg extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> implements xe.h {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.tipsmsg.AppBrandOnGetTipsMsg> CREATOR = new rj1.a();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f89228e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f89229f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f89230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandOnGetTipsMsg(java.lang.String appId, java.util.ArrayList infoList, boolean z17) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(infoList, "infoList");
        this.f89228e = appId;
        this.f89229f = infoList;
        this.f89230g = z17;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF89228e() {
        return this.f89228e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        runtime.I1(new rj1.b(this, runtime));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f89228e);
        java.util.ArrayList arrayList = this.f89229f;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        out.writeInt(this.f89230g ? 1 : 0);
    }
}
