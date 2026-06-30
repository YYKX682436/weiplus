package com.tencent.mm.plugin.car_license_plate.ui;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewModel", "Landroid/os/Parcelable;", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class CarLicensePlateListViewContract$ViewModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel> CREATOR = new rt1.c1();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo f94623d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94624e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f94625f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f94626g;

    public CarLicensePlateListViewContract$ViewModel(com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo, boolean z17, java.lang.String str, boolean z18) {
        this.f94623d = mMCarLicensePlateInfo;
        this.f94624e = z17;
        this.f94625f = str;
        this.f94626g = z18;
    }

    public final void a(java.lang.String plate) {
        kotlin.jvm.internal.o.g(plate, "plate");
        if (kotlin.jvm.internal.o.b(null, this.f94623d)) {
            com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo = new com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo(null, null, false, 0, 15, null);
            mMCarLicensePlateInfo.f94604d.add(plate);
            this.f94623d = mMCarLicensePlateInfo;
        } else {
            com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo2 = this.f94623d;
            kotlin.jvm.internal.o.d(mMCarLicensePlateInfo2);
            mMCarLicensePlateInfo2.f94604d.add(plate);
        }
    }

    public final void b(java.util.List list) {
        if (kotlin.jvm.internal.o.b(null, this.f94623d)) {
            this.f94623d = new com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo(null, null, false, 0, 15, null);
        }
        com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo = this.f94623d;
        kotlin.jvm.internal.o.d(mMCarLicensePlateInfo);
        java.util.ArrayList arrayList = mMCarLicensePlateInfo.f94604d;
        arrayList.clear();
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        arrayList.addAll(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo = this.f94623d;
        if (mMCarLicensePlateInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mMCarLicensePlateInfo.writeToParcel(out, i17);
        }
        out.writeInt(this.f94624e ? 1 : 0);
        out.writeString(this.f94625f);
        out.writeInt(this.f94626g ? 1 : 0);
    }
}
