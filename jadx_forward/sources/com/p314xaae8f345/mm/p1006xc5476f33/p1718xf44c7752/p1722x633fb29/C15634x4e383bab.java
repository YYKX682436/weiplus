package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$TimeMediaItem */
/* loaded from: classes10.dex */
public class C15634x4e383bab extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> f36412x681a0c0c = new t23.d1();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    /* renamed from: getType */
    public int mo63659xfb85f7b0() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    public java.lang.String o() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    public boolean r() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    /* renamed from: toString */
    public java.lang.String mo63661x9616526c() {
        return "TimeMediaItem{base=" + super.mo63661x9616526c() + ", generateDate='" + this.f219968m + "', dateTag='" + this.f219969n + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f219968m);
        parcel.writeString(this.f219969n);
    }
}
