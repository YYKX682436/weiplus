package com.tencent.mm.plugin.appbrand.event;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/event/StartActivityFromAppBrandEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "appbrand-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class StartActivityFromAppBrandEvent extends com.tencent.mm.sdk.event.IEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent> CREATOR = new da1.a();

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Intent f78015g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f78016h;

    public StartActivityFromAppBrandEvent(android.content.Intent intent, boolean z17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f78015g = intent;
        this.f78016h = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f78015g, i17);
        out.writeInt(this.f78016h ? 1 : 0);
    }
}
