package com.tencent.mm.plugin.appbrand.ipc;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandShowToastEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandShowToastEvent extends com.tencent.mm.sdk.event.IEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ipc.AppBrandShowToastEvent> CREATOR = new com.tencent.mm.plugin.appbrand.ipc.z();

    /* renamed from: g, reason: collision with root package name */
    public final int f78367g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f78368h;

    public AppBrandShowToastEvent(int i17, java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f78367g = i17;
        this.f78368h = text;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f78367g);
        out.writeString(this.f78368h);
    }
}
