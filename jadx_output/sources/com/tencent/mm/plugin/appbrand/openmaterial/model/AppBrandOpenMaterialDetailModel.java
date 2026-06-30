package com.tencent.mm.plugin.appbrand.openmaterial.model;

/* loaded from: classes8.dex */
public class AppBrandOpenMaterialDetailModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel> CREATOR = new bi1.b();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel f86255d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f86256e;

    /* renamed from: f, reason: collision with root package name */
    public final float f86257f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f86258g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f86259h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f86260i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f86261m;

    public AppBrandOpenMaterialDetailModel(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, float f17, java.lang.String str5, boolean z17, java.lang.String str6, java.util.List list2) {
        this.f86255d = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel(str, i17, str2, str3, str4);
        this.f86256e = list;
        this.f86257f = f17;
        this.f86258g = str5;
        this.f86259h = z17;
        this.f86260i = str6;
        this.f86261m = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel) obj;
        return java.lang.Float.compare(appBrandOpenMaterialDetailModel.f86257f, this.f86257f) == 0 && this.f86255d.equals(appBrandOpenMaterialDetailModel.f86255d) && this.f86256e.equals(appBrandOpenMaterialDetailModel.f86256e) && this.f86258g.equals(appBrandOpenMaterialDetailModel.f86258g);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f86255d, this.f86256e, java.lang.Float.valueOf(this.f86257f), this.f86258g);
    }

    public java.lang.String toString() {
        return "AppBrandOpenMaterialDetailModel{model=" + this.f86255d + ", categories='" + java.util.Arrays.toString(this.f86256e.toArray()) + "', score=" + this.f86257f + ", functionDesc='" + this.f86258g + "', needUnstatedPopup='" + this.f86259h + "', materialWording='" + this.f86260i + "', suffixList='" + java.util.Arrays.toString(this.f86261m.toArray()) + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f86255d.writeToParcel(parcel, i17);
        parcel.writeStringList(this.f86256e);
        parcel.writeFloat(this.f86257f);
        parcel.writeString(this.f86258g);
        parcel.writeByte(this.f86259h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f86260i);
        parcel.writeStringList(this.f86261m);
    }

    public AppBrandOpenMaterialDetailModel(android.os.Parcel parcel) {
        this.f86255d = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel(parcel);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f86256e = arrayList;
        parcel.readStringList(arrayList);
        this.f86257f = parcel.readFloat();
        java.lang.String readString = parcel.readString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f86258g = readString == null ? "" : readString;
        this.f86259h = parcel.readByte() != 0;
        this.f86260i = parcel.readString();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f86261m = arrayList2;
        parcel.readStringList(arrayList2);
    }
}
