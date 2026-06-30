package com.tencent.mm.plugin.appbrand.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HeightInfo;", "Landroid/os/Parcelable;", "CREATOR", "k91/z2", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class HeightInfo implements android.os.Parcelable {
    public static final k91.z2 CREATOR = new k91.z2(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f77392d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77393e;

    public HeightInfo(int i17, int i18) {
        this.f77392d = i17;
        this.f77393e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "HeightInfo(currentHeight=" + this.f77392d + ", initialHeight=" + this.f77393e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f77392d);
        parcel.writeInt(this.f77393e);
    }
}
