package com.tencent.mm.plugin.appbrand.openmaterial.model;

/* loaded from: classes8.dex */
public class AppBrandOpenMaterialCollection implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection> CREATOR = new bi1.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel f86249d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel f86250e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f86251f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f86252g;

    /* renamed from: h, reason: collision with root package name */
    public long f86253h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f86254i;

    public AppBrandOpenMaterialCollection(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, java.util.List list, java.util.List list2) {
        this.f86249d = materialModel;
        this.f86250e = new com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel(new java.util.ArrayList());
        this.f86251f = new java.util.ArrayList(list);
        this.f86252g = new java.util.ArrayList(list2);
    }

    public static com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection a(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        return new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection(materialModel, java.util.Collections.emptyList(), java.util.Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AppBrandOpenMaterialCollection{cacheTime=" + this.f86253h + ",materialModel=" + this.f86249d + ", appBrandOpenMaterialModels=" + java.util.Arrays.toString(this.f86251f.toArray()) + ", appBrandOpenMaterialDetailModels=" + java.util.Arrays.toString(this.f86252g.toArray()) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f86249d, i17);
        parcel.writeTypedList(this.f86251f);
        parcel.writeTypedList(this.f86252g);
        parcel.writeParcelable(this.f86250e, i17);
        parcel.writeLong(this.f86253h);
        parcel.writeString(this.f86254i);
    }

    public AppBrandOpenMaterialCollection(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) parcel.readParcelable(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.class.getClassLoader());
        this.f86249d = materialModel == null ? new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel("", "", "") : materialModel;
        java.util.List createTypedArrayList = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel.CREATOR);
        this.f86251f = createTypedArrayList == null ? java.util.Collections.emptyList() : createTypedArrayList;
        java.util.List createTypedArrayList2 = parcel.createTypedArrayList(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel.CREATOR);
        this.f86252g = createTypedArrayList2 == null ? java.util.Collections.emptyList() : createTypedArrayList2;
        this.f86250e = (com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel) parcel.readParcelable(com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel.class.getClassLoader());
        this.f86253h = parcel.readLong();
        this.f86254i = parcel.readString();
    }
}
