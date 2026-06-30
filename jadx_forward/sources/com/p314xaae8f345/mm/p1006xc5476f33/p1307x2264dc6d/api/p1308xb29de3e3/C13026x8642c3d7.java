package com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;", "Landroid/os/Parcelable;", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo */
/* loaded from: classes7.dex */
public final /* data */ class C13026x8642c3d7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7> f35389x681a0c0c = new pt1.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f176137d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f176138e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f176139f;

    /* renamed from: g, reason: collision with root package name */
    public final int f176140g;

    public C13026x8642c3d7(java.util.ArrayList plateNoList, java.lang.String defaultPlateNo, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plateNoList, "plateNoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultPlateNo, "defaultPlateNo");
        this.f176137d = plateNoList;
        this.f176138e = defaultPlateNo;
        this.f176139f = z17;
        this.f176140g = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m54432xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f176137d, c13026x8642c3d7.f176137d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f176138e, c13026x8642c3d7.f176138e) && this.f176139f == c13026x8642c3d7.f176139f && this.f176140g == c13026x8642c3d7.f176140g;
    }

    /* renamed from: hashCode */
    public int m54433x8cdac1b() {
        return (((((this.f176137d.hashCode() * 31) + this.f176138e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f176139f)) * 31) + java.lang.Integer.hashCode(this.f176140g);
    }

    /* renamed from: toString */
    public java.lang.String m54434x9616526c() {
        return "MMCarLicensePlateInfo(plateNoList=" + this.f176137d + ", defaultPlateNo=" + this.f176138e + ", isModifyBanned=" + this.f176139f + ", maxCount=" + this.f176140g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeStringList(this.f176137d);
        out.writeString(this.f176138e);
        out.writeInt(this.f176139f ? 1 : 0);
        out.writeInt(this.f176140g);
    }

    public /* synthetic */ C13026x8642c3d7(java.util.ArrayList arrayList, java.lang.String str, boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? new java.util.ArrayList() : arrayList, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? Integer.MAX_VALUE : i17);
    }
}
