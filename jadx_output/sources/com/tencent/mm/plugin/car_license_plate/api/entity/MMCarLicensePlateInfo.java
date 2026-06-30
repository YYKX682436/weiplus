package com.tencent.mm.plugin.car_license_plate.api.entity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;", "Landroid/os/Parcelable;", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class MMCarLicensePlateInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo> CREATOR = new pt1.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f94604d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94605e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f94606f;

    /* renamed from: g, reason: collision with root package name */
    public final int f94607g;

    public MMCarLicensePlateInfo(java.util.ArrayList plateNoList, java.lang.String defaultPlateNo, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(plateNoList, "plateNoList");
        kotlin.jvm.internal.o.g(defaultPlateNo, "defaultPlateNo");
        this.f94604d = plateNoList;
        this.f94605e = defaultPlateNo;
        this.f94606f = z17;
        this.f94607g = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo)) {
            return false;
        }
        com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo = (com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo) obj;
        return kotlin.jvm.internal.o.b(this.f94604d, mMCarLicensePlateInfo.f94604d) && kotlin.jvm.internal.o.b(this.f94605e, mMCarLicensePlateInfo.f94605e) && this.f94606f == mMCarLicensePlateInfo.f94606f && this.f94607g == mMCarLicensePlateInfo.f94607g;
    }

    public int hashCode() {
        return (((((this.f94604d.hashCode() * 31) + this.f94605e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f94606f)) * 31) + java.lang.Integer.hashCode(this.f94607g);
    }

    public java.lang.String toString() {
        return "MMCarLicensePlateInfo(plateNoList=" + this.f94604d + ", defaultPlateNo=" + this.f94605e + ", isModifyBanned=" + this.f94606f + ", maxCount=" + this.f94607g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeStringList(this.f94604d);
        out.writeString(this.f94605e);
        out.writeInt(this.f94606f ? 1 : 0);
        out.writeInt(this.f94607g);
    }

    public /* synthetic */ MMCarLicensePlateInfo(java.util.ArrayList arrayList, java.lang.String str, boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? new java.util.ArrayList() : arrayList, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? Integer.MAX_VALUE : i17);
    }
}
