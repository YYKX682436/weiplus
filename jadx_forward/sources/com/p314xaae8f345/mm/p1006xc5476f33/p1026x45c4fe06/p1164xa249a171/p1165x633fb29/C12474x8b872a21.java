package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel */
/* loaded from: classes8.dex */
public class C12474x8b872a21 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21> f35122x681a0c0c = new bi1.b();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 f167788d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f167789e;

    /* renamed from: f, reason: collision with root package name */
    public final float f167790f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f167791g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f167792h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f167793i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f167794m;

    public C12474x8b872a21(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, float f17, java.lang.String str5, boolean z17, java.lang.String str6, java.util.List list2) {
        this.f167788d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2(str, i17, str2, str3, str4);
        this.f167789e = list;
        this.f167790f = f17;
        this.f167791g = str5;
        this.f167792h = z17;
        this.f167793i = str6;
        this.f167794m = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52064xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21) obj;
        return java.lang.Float.compare(c12474x8b872a21.f167790f, this.f167790f) == 0 && this.f167788d.m52068xb2c87fbf(c12474x8b872a21.f167788d) && this.f167789e.equals(c12474x8b872a21.f167789e) && this.f167791g.equals(c12474x8b872a21.f167791g);
    }

    /* renamed from: hashCode */
    public int m52065x8cdac1b() {
        return java.util.Objects.hash(this.f167788d, this.f167789e, java.lang.Float.valueOf(this.f167790f), this.f167791g);
    }

    /* renamed from: toString */
    public java.lang.String m52066x9616526c() {
        return "AppBrandOpenMaterialDetailModel{model=" + this.f167788d + ", categories='" + java.util.Arrays.toString(this.f167789e.toArray()) + "', score=" + this.f167790f + ", functionDesc='" + this.f167791g + "', needUnstatedPopup='" + this.f167792h + "', materialWording='" + this.f167793i + "', suffixList='" + java.util.Arrays.toString(this.f167794m.toArray()) + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f167788d.writeToParcel(parcel, i17);
        parcel.writeStringList(this.f167789e);
        parcel.writeFloat(this.f167790f);
        parcel.writeString(this.f167791g);
        parcel.writeByte(this.f167792h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f167793i);
        parcel.writeStringList(this.f167794m);
    }

    public C12474x8b872a21(android.os.Parcel parcel) {
        this.f167788d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2(parcel);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f167789e = arrayList;
        parcel.readStringList(arrayList);
        this.f167790f = parcel.readFloat();
        java.lang.String readString = parcel.readString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f167791g = readString == null ? "" : readString;
        this.f167792h = parcel.readByte() != 0;
        this.f167793i = parcel.readString();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f167794m = arrayList2;
        parcel.readStringList(arrayList2);
    }
}
