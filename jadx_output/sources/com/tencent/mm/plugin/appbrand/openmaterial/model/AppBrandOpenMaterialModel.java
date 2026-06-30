package com.tencent.mm.plugin.appbrand.openmaterial.model;

/* loaded from: classes8.dex */
public class AppBrandOpenMaterialModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel> CREATOR = new bi1.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f86262d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86263e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f86264f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f86265g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f86266h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f86267i;

    public AppBrandOpenMaterialModel(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        this.f86262d = str;
        this.f86263e = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.String a17 = nf.z.a(str2);
            if (!a17.endsWith(".html")) {
                str5 = str2.replace(a17, a17.concat(".html"));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BaseAppBrandOpenMaterialModel", "fixPath, path: %s, fixedPath: %s", str2, str5);
                this.f86264f = str5;
                this.f86265g = str3;
                this.f86266h = str4;
            }
        }
        str5 = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BaseAppBrandOpenMaterialModel", "fixPath, path: %s, fixedPath: %s", str2, str5);
        this.f86264f = str5;
        this.f86265g = str3;
        this.f86266h = str4;
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
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel) obj;
        return this.f86263e == appBrandOpenMaterialModel.f86263e && this.f86262d.equals(appBrandOpenMaterialModel.f86262d) && this.f86264f.equals(appBrandOpenMaterialModel.f86264f) && java.util.Objects.equals(this.f86265g, appBrandOpenMaterialModel.f86265g) && this.f86266h.equals(appBrandOpenMaterialModel.f86266h) && java.util.Objects.equals(this.f86267i, appBrandOpenMaterialModel.f86267i);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f86262d, java.lang.Integer.valueOf(this.f86263e), this.f86264f, this.f86265g, this.f86266h, this.f86267i);
    }

    public java.lang.String toString() {
        return "AppBrandOpenMaterialModel{iconUrl='" + this.f86265g + "', functionName='" + this.f86266h + "', appName='" + this.f86267i + "', appId='" + this.f86262d + "', versionType=" + this.f86263e + ", enterPath='" + this.f86264f + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f86262d);
        parcel.writeInt(this.f86263e);
        parcel.writeString(this.f86264f);
        parcel.writeString(this.f86265g);
        parcel.writeString(this.f86266h);
        parcel.writeString(this.f86267i);
    }

    public AppBrandOpenMaterialModel(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f86262d = readString == null ? "" : readString;
        this.f86263e = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        this.f86264f = readString2 == null ? "" : readString2;
        this.f86265g = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        this.f86266h = readString3 != null ? readString3 : "";
        this.f86267i = parcel.readString();
    }
}
