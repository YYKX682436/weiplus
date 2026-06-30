package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29;

/* renamed from: com.tencent.mm.plugin.gallery.model.SelectedItem */
/* loaded from: classes7.dex */
public class C15637xa133706e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15637xa133706e> f36414x681a0c0c = new t23.d2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f219983d;

    /* renamed from: e, reason: collision with root package name */
    public final long f219984e;

    public C15637xa133706e(android.os.Parcel parcel) {
        this.f219983d = parcel.readString();
        this.f219984e = parcel.readLong();
        parcel.createFloatArray();
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m63666xb2c87fbf(java.lang.Object obj) {
        return obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15637xa133706e ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15637xa133706e) obj).f219984e == this.f219984e : super.equals(obj);
    }

    /* renamed from: hashCode */
    public int m63667x8cdac1b() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f219983d);
        parcel.writeLong(this.f219984e);
        throw null;
    }
}
