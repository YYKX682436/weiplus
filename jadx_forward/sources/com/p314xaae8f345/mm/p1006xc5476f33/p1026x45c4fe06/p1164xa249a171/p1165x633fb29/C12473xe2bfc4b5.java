package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection */
/* loaded from: classes8.dex */
public class C12473xe2bfc4b5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5> f35121x681a0c0c = new bi1.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 f167782d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12477x70ba6ccd f167783e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f167784f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f167785g;

    /* renamed from: h, reason: collision with root package name */
    public long f167786h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167787i;

    public C12473xe2bfc4b5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622, java.util.List list, java.util.List list2) {
        this.f167782d = c12476xea20f622;
        this.f167783e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12477x70ba6ccd(new java.util.ArrayList());
        this.f167784f = new java.util.ArrayList(list);
        this.f167785g = new java.util.ArrayList(list2);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5(c12476xea20f622, java.util.Collections.emptyList(), java.util.Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m52062x9616526c() {
        return "AppBrandOpenMaterialCollection{cacheTime=" + this.f167786h + ",materialModel=" + this.f167782d + ", appBrandOpenMaterialModels=" + java.util.Arrays.toString(this.f167784f.toArray()) + ", appBrandOpenMaterialDetailModels=" + java.util.Arrays.toString(this.f167785g.toArray()) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f167782d, i17);
        parcel.writeTypedList(this.f167784f);
        parcel.writeTypedList(this.f167785g);
        parcel.writeParcelable(this.f167783e, i17);
        parcel.writeLong(this.f167786h);
        parcel.writeString(this.f167787i);
    }

    public C12473xe2bfc4b5(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622.class.getClassLoader());
        this.f167782d = c12476xea20f622 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622("", "", "") : c12476xea20f622;
        java.util.List createTypedArrayList = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2.f35123x681a0c0c);
        this.f167784f = createTypedArrayList == null ? java.util.Collections.emptyList() : createTypedArrayList;
        java.util.List createTypedArrayList2 = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21.f35122x681a0c0c);
        this.f167785g = createTypedArrayList2 == null ? java.util.Collections.emptyList() : createTypedArrayList2;
        this.f167783e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12477x70ba6ccd) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12477x70ba6ccd.class.getClassLoader());
        this.f167786h = parcel.readLong();
        this.f167787i = parcel.readString();
    }
}
