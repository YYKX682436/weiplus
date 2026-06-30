package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29;

/* renamed from: com.tencent.mm.plugin.finder.model.MediaSelectedData */
/* loaded from: classes.dex */
public class C14491x27dec9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.C14491x27dec9> f35997x681a0c0c = new so2.h5();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f202953d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f202954e;

    /* renamed from: f, reason: collision with root package name */
    public final int f202955f;

    public C14491x27dec9(android.os.Parcel parcel) {
        this.f202953d = parcel.readString();
        this.f202954e = parcel.readString();
        this.f202955f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m58308x9616526c() {
        return "MediaSelectedData{path='" + this.f202953d + "', thumbPath='" + this.f202954e + "', type=" + this.f202955f + ", cropInfo=null}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f202953d);
        parcel.writeString(this.f202954e);
        parcel.writeInt(this.f202955f);
    }
}
