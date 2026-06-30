package com.tencent.mm.plugin.appbrand.openmaterial.model;

/* loaded from: classes8.dex */
public class MaterialModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel> CREATOR;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f86268g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f86269d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f86270e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f86271f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap(32);
        hashMap.put("docm", "application/vnd.ms-word.document.macroEnabled.12");
        hashMap.put("xlsm", "application/vnd.ms-excel.sheet.macroEnabled.12");
        hashMap.put("wps", "application/wps-office.wps");
        hashMap.put("et", "application/wps-office.et");
        hashMap.put("rar", "application/vnd.rar");
        hashMap.put("7z", "application/x-7z-compressed");
        hashMap.put("psd", "application/x-photoshop");
        hashMap.put("dwg", "application/acad");
        hashMap.put("cdr", "application/x-cdr");
        hashMap.put("dxf", "application/dxf");
        hashMap.put("stp", "application/step");
        hashMap.put("rtf", "application/rtf");
        hashMap.put("ai", "application/postscript");
        hashMap.put("doc", "application/msword");
        hashMap.put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        hashMap.put("xls", "application/vnd.ms-excel");
        hashMap.put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        hashMap.put("ppt", "application/vnd.ms-powerpoint");
        hashMap.put("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        hashMap.put("txt", "text/plain");
        hashMap.put("csv", "text/csv");
        hashMap.put("pdf", "application/pdf");
        hashMap.put("zip", "application/zip");
        f86268g = java.util.Collections.unmodifiableMap(hashMap);
        CREATOR = new bi1.i();
    }

    public MaterialModel(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f86269d = "";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f86269d = str == null ? "" : str;
        this.f86270e = str2;
        this.f86271f = str3;
    }

    public static com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String n17 = com.tencent.mm.vfs.w6.n(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
            str2 = null;
        } else {
            str2 = (java.lang.String) f86268g.get(n17.toLowerCase());
        }
        if (str2 == null) {
            str2 = q75.g.b(n17);
        }
        if (str2 == null) {
            str2 = "";
        }
        return new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel(str2, n17, str);
    }

    public static com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return a(str);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str3 = null;
        } else {
            str3 = (java.lang.String) f86268g.get(str2.toLowerCase());
        }
        if (str3 == null) {
            str3 = q75.g.b(str2);
        }
        if (str3 == null) {
            str3 = "";
        }
        return new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel(str3, str2, str);
    }

    public static com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel c(java.lang.String str) {
        android.graphics.BitmapFactory.Options n07;
        if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.vfs.w6.n(str)) && (n07 = com.tencent.mm.sdk.platformtools.x.n0(str)) != null) {
            java.lang.String str2 = n07.outMimeType;
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String a17 = q75.g.a(str2);
            return new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel(str3, a17 != null ? a17 : "", str);
        }
        return a(str);
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
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) obj;
        return this.f86269d.equals(materialModel.f86269d) && this.f86270e.equals(materialModel.f86270e) && this.f86271f.equals(materialModel.f86271f);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f86269d, this.f86270e, this.f86271f);
    }

    public java.lang.String toString() {
        return "MaterialModel{mimeType='" + this.f86269d + "', materialExtension='" + this.f86270e + "', materialPath='" + this.f86271f + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f86269d);
        parcel.writeString(this.f86270e);
        parcel.writeString(this.f86271f);
    }

    public MaterialModel(android.os.Parcel parcel) {
        this.f86269d = "";
        java.lang.String readString = parcel.readString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f86269d = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f86270e = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
        this.f86271f = readString3 != null ? readString3 : "";
    }
}
