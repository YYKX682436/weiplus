package com.tencent.mm.plugin.appbrand.api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/ParcelableMultiTaskData;", "Landroid/os/Parcelable;", "CREATOR", "l81/t0", "protocol-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class ParcelableMultiTaskData implements android.os.Parcelable {
    public static final l81.t0 CREATOR = new l81.t0(null);

    /* renamed from: d, reason: collision with root package name */
    public r45.w60 f74958d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        com.tencent.mm.ipcinvoker.extension.c.d(this.f74958d, dest);
    }
}
