package com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewModel", "Landroid/os/Parcelable;", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel */
/* loaded from: classes7.dex */
public final class C13032x6313e41e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e> f35390x681a0c0c = new rt1.c1();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 f176156d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f176157e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f176158f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f176159g;

    public C13032x6313e41e(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7, boolean z17, java.lang.String str, boolean z18) {
        this.f176156d = c13026x8642c3d7;
        this.f176157e = z17;
        this.f176158f = str;
        this.f176159g = z18;
    }

    public final void a(java.lang.String plate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plate, "plate");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, this.f176156d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7(null, null, false, 0, 15, null);
            c13026x8642c3d7.f176137d.add(plate);
            this.f176156d = c13026x8642c3d7;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d72 = this.f176156d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13026x8642c3d72);
            c13026x8642c3d72.f176137d.add(plate);
        }
    }

    public final void b(java.util.List list) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, this.f176156d)) {
            this.f176156d = new com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7(null, null, false, 0, 15, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = this.f176156d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13026x8642c3d7);
        java.util.ArrayList arrayList = c13026x8642c3d7.f176137d;
        arrayList.clear();
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        arrayList.addAll(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = this.f176156d;
        if (c13026x8642c3d7 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c13026x8642c3d7.writeToParcel(out, i17);
        }
        out.writeInt(this.f176157e ? 1 : 0);
        out.writeString(this.f176158f);
        out.writeInt(this.f176159g ? 1 : 0);
    }
}
