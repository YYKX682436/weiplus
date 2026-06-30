package com.tencent.mm.feature.appbrand.support;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap> CREATOR = new com.tencent.mm.feature.appbrand.support.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f65043d;

    public AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap(java.util.List processList) {
        kotlin.jvm.internal.o.g(processList, "processList");
        this.f65043d = processList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap) && kotlin.jvm.internal.o.b(this.f65043d, ((com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap) obj).f65043d);
    }

    public int hashCode() {
        return this.f65043d.hashCode();
    }

    public java.lang.String toString() {
        return "ParcelizedAppProcessListWrap(processList=" + this.f65043d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f65043d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess) it.next()).writeToParcel(out, i17);
        }
    }
}
