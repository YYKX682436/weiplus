package com.tencent.mm.plugin.appbrand.app;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/app/CollectRuntimeInfoEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class CollectRuntimeInfoEvent extends com.tencent.mm.sdk.event.IEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.app.CollectRuntimeInfoEvent> CREATOR = new com.tencent.mm.plugin.appbrand.app.q2();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(1);
    }
}
