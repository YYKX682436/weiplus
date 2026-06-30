package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg */
/* loaded from: classes7.dex */
public class C11803x74c53cda implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11803x74c53cda> f33571x681a0c0c = new h91.c();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f158698d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f158699e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f158700f;

    /* renamed from: g, reason: collision with root package name */
    public final long f158701g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f158702h;

    public C11803x74c53cda(android.os.Parcel parcel) {
        this.f158700f = new java.util.ArrayList();
        this.f158698d = parcel.readInt() == 1;
        this.f158699e = parcel.readString();
        this.f158700f = parcel.readArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11803x74c53cda.class.getClassLoader());
        this.f158701g = parcel.readLong();
        this.f158702h = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f158698d ? 1 : 0);
        parcel.writeString(this.f158699e);
        parcel.writeList(this.f158700f);
        parcel.writeLong(this.f158701g);
        parcel.writeInt(this.f158702h ? 1 : 0);
    }
}
