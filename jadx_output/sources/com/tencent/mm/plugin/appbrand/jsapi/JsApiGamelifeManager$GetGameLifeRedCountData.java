package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiGamelifeManager$GetGameLifeRedCountData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class JsApiGamelifeManager$GetGameLifeRedCountData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.p5();

    /* renamed from: d, reason: collision with root package name */
    public final int f78514d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78515e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f78516f;

    public JsApiGamelifeManager$GetGameLifeRedCountData(int i17, java.lang.String errmsg, boolean z17) {
        kotlin.jvm.internal.o.g(errmsg, "errmsg");
        this.f78514d = i17;
        this.f78515e = errmsg;
        this.f78516f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f78514d);
        out.writeString(this.f78515e);
        out.writeInt(this.f78516f ? 1 : 0);
    }
}
