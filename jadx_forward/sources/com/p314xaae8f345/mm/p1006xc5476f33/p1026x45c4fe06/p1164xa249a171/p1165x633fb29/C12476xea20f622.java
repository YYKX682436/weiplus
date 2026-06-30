package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel */
/* loaded from: classes8.dex */
public class C12476xea20f622 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622> f35124x681a0c0c;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f167801g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f167802d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f167803e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f167804f;

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
        f167801g = java.util.Collections.unmodifiableMap(hashMap);
        f35124x681a0c0c = new bi1.i();
    }

    public C12476xea20f622(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f167802d = "";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f167802d = str == null ? "" : str;
        this.f167803e = str2;
        this.f167804f = str3;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
            str2 = null;
        } else {
            str2 = (java.lang.String) f167801g.get(n17.toLowerCase());
        }
        if (str2 == null) {
            str2 = q75.g.b(n17);
        }
        if (str2 == null) {
            str2 = "";
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622(str2, n17, str);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return a(str);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str3 = null;
        } else {
            str3 = (java.lang.String) f167801g.get(str2.toLowerCase());
        }
        if (str3 == null) {
            str3 = q75.g.b(str2);
        }
        if (str3 == null) {
            str3 = "";
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622(str3, str2, str);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c(java.lang.String str) {
        android.graphics.BitmapFactory.Options n07;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.vfs.w6.n(str)) && (n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str)) != null) {
            java.lang.String str2 = n07.outMimeType;
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String a17 = q75.g.a(str2);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622(str3, a17 != null ? a17 : "", str);
        }
        return a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52072xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622) obj;
        return this.f167802d.equals(c12476xea20f622.f167802d) && this.f167803e.equals(c12476xea20f622.f167803e) && this.f167804f.equals(c12476xea20f622.f167804f);
    }

    /* renamed from: hashCode */
    public int m52073x8cdac1b() {
        return java.util.Objects.hash(this.f167802d, this.f167803e, this.f167804f);
    }

    /* renamed from: toString */
    public java.lang.String m52074x9616526c() {
        return "MaterialModel{mimeType='" + this.f167802d + "', materialExtension='" + this.f167803e + "', materialPath='" + this.f167804f + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f167802d);
        parcel.writeString(this.f167803e);
        parcel.writeString(this.f167804f);
    }

    public C12476xea20f622(android.os.Parcel parcel) {
        this.f167802d = "";
        java.lang.String readString = parcel.readString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f167802d = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f167803e = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
        this.f167804f = readString3 != null ? readString3 : "";
    }
}
