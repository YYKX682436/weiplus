package com.tencent.mm.plugin.appbrand.openmaterial.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/openmaterial/model/MultiSelectMaterialModel;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MultiSelectMaterialModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel> CREATOR = new bi1.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f86272d;

    public MultiSelectMaterialModel(java.util.ArrayList appBrandOpenMaterialModels) {
        kotlin.jvm.internal.o.g(appBrandOpenMaterialModels, "appBrandOpenMaterialModels");
        this.f86272d = appBrandOpenMaterialModels;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel) && kotlin.jvm.internal.o.b(this.f86272d, ((com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel) obj).f86272d);
    }

    public int hashCode() {
        return this.f86272d.hashCode();
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.f86272d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.ArrayList arrayList = this.f86272d;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
    }
}
